package com.p051vm.shadowsocks.tunnel.shadowsocks;

import android.net.Uri;
import android.util.Base64;
import com.p051vm.shadowsocks.tunnel.Config;
import java.net.InetSocketAddress;

/* renamed from: com.vm.shadowsocks.tunnel.shadowsocks.ShadowsocksConfig */
public class ShadowsocksConfig extends Config {
    public String EncryptMethod;
    public String Password;

    public static ShadowsocksConfig parse(String str) {
        ShadowsocksConfig shadowsocksConfig = new ShadowsocksConfig();
        Uri parse = Uri.parse(str);
        if (parse.getPort() == -1) {
            String host = parse.getHost();
            parse = Uri.parse("ss://" + new String(Base64.decode(host.getBytes("ASCII"), 0)));
        }
        String userInfo = parse.getUserInfo();
        if (userInfo != null) {
            String[] split = userInfo.split(":");
            shadowsocksConfig.EncryptMethod = split[0];
            if (split.length >= 2) {
                shadowsocksConfig.Password = split[1];
            }
        }
        if (CryptFactory.isCipherExisted(shadowsocksConfig.EncryptMethod)) {
            shadowsocksConfig.ServerAddress = new InetSocketAddress(parse.getHost(), parse.getPort());
            return shadowsocksConfig;
        }
        throw new Exception(String.format("Method: %s does not support", new Object[]{shadowsocksConfig.EncryptMethod}));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public String toString() {
        return String.format("ss://%s:%s@%s", new Object[]{this.EncryptMethod, this.Password, this.ServerAddress});
    }
}
