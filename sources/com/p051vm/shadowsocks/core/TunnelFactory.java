package com.p051vm.shadowsocks.core;

import com.p051vm.shadowsocks.tunnel.Config;
import com.p051vm.shadowsocks.tunnel.RawTunnel;
import com.p051vm.shadowsocks.tunnel.Tunnel;
import com.p051vm.shadowsocks.tunnel.httpconnect.HttpConnectConfig;
import com.p051vm.shadowsocks.tunnel.httpconnect.HttpConnectTunnel;
import com.p051vm.shadowsocks.tunnel.shadowsocks.ShadowsocksConfig;
import com.p051vm.shadowsocks.tunnel.shadowsocks.ShadowsocksTunnel;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/* renamed from: com.vm.shadowsocks.core.TunnelFactory */
public class TunnelFactory {
    public static Tunnel wrap(SocketChannel socketChannel, Selector selector) {
        return new RawTunnel(socketChannel, selector);
    }

    public static Tunnel createTunnelByConfig(InetSocketAddress inetSocketAddress, Selector selector) {
        if (!inetSocketAddress.isUnresolved()) {
            return new RawTunnel(inetSocketAddress, selector);
        }
        Config defaultTunnelConfig = ProxyConfig.Instance.getDefaultTunnelConfig(inetSocketAddress);
        if (defaultTunnelConfig instanceof HttpConnectConfig) {
            return new HttpConnectTunnel((HttpConnectConfig) defaultTunnelConfig, selector);
        }
        if (defaultTunnelConfig instanceof ShadowsocksConfig) {
            return new ShadowsocksTunnel((ShadowsocksConfig) defaultTunnelConfig, selector);
        }
        throw new Exception("The config is unknow.");
    }
}
