package com.p051vm.shadowsocks.tunnel.httpconnect;

import android.net.Uri;
import com.p051vm.shadowsocks.tunnel.Config;
import java.net.InetSocketAddress;

/* renamed from: com.vm.shadowsocks.tunnel.httpconnect.HttpConnectConfig */
public class HttpConnectConfig extends Config {
    public String Password;
    public String UserName;

    public static HttpConnectConfig parse(String str) {
        HttpConnectConfig httpConnectConfig = new HttpConnectConfig();
        Uri parse = Uri.parse(str);
        String userInfo = parse.getUserInfo();
        if (userInfo != null) {
            String[] split = userInfo.split(":");
            httpConnectConfig.UserName = split[0];
            if (split.length >= 2) {
                httpConnectConfig.Password = split[1];
            }
        }
        httpConnectConfig.ServerAddress = new InetSocketAddress(parse.getHost(), parse.getPort());
        return httpConnectConfig;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return toString().equals(obj.toString());
    }

    public String toString() {
        return String.format("http://%s:%s@%s", new Object[]{this.UserName, this.Password, this.ServerAddress});
    }
}
