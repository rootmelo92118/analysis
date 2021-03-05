package com.p051vm.rest;

import android.content.Context;
import android.support.p034v4.app.NotificationCompat;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.p051vm.p052a.C2508c;
import com.p051vm.p058f.C2521a;
import com.p051vm.p060h.C2532a;
import com.p051vm.p060h.C2534c;
import com.p051vm.p062vo.machine.MachineReq;
import com.p051vm.p062vo.machine.MachineResp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vm.rest.MachineClient */
public class MachineClient {
    private static final String SS_PROTOCOL = "ss://rc4-md5:";
    private static final String URL_RELATIV_PATH = "/distribute/v1/m-list";

    public static ProxyInfoResp getMachine(Context context) {
        ProxyInfoResp proxyInfoResp = new ProxyInfoResp();
        ArrayList arrayList = new ArrayList();
        MachineReq machineReq = new MachineReq(new C2521a.C2522a(context));
        String b = C2508c.m11798a(context).mo15466b();
        if (b != null) {
            String a = C2534c.m11865a("http://api.happymobi.net:8899/happymobi-api/distribute/v1/m-list", machineReq, b);
            if (a == null) {
                return null;
            }
            JsonElement parse = new JsonParser().parse(a);
            int asInt = parse.getAsJsonObject().get("code").getAsInt();
            String asString = parse.getAsJsonObject().get(NotificationCompat.CATEGORY_MESSAGE).getAsString();
            if (asInt == 4004) {
                proxyInfoResp.setForceUpate(true);
                proxyInfoResp.setMsg(asString);
                return proxyInfoResp;
            }
            proxyInfoResp.setForceUpate(false);
            MachineResp machineResp = (MachineResp) new Gson().fromJson(parse.getAsJsonObject().get("data"), MachineResp.class);
            String prefer = machineResp.getPrefer();
            String c = C2508c.m11798a(context).mo15467c();
            ProxyInfo parseMachine = parseMachine(c, prefer);
            if (parseMachine != null) {
                arrayList.add(parseMachine);
            }
            for (String parseMachine2 : machineResp.getBackups()) {
                ProxyInfo parseMachine3 = parseMachine(c, parseMachine2);
                if (parseMachine3 != null) {
                    arrayList.add(parseMachine3);
                }
            }
        }
        proxyInfoResp.setProxyInfos(arrayList);
        return proxyInfoResp;
    }

    private static ProxyInfo parseMachine(String str, String str2) {
        String[] split = C2532a.m11858a(str2).split("\\|");
        String str3 = split[0];
        String str4 = split[1];
        String str5 = split[2];
        return new ProxyInfo(str3, SS_PROTOCOL + str5 + "@" + str3 + ":" + str4);
    }

    /* renamed from: com.vm.rest.MachineClient$ProxyInfoResp */
    public static class ProxyInfoResp {
        private boolean isForceUpate;
        private String msg;
        private List<ProxyInfo> proxyInfos;

        public boolean isForceUpate() {
            return this.isForceUpate;
        }

        public void setForceUpate(boolean z) {
            this.isForceUpate = z;
        }

        public List<ProxyInfo> getProxyInfos() {
            return this.proxyInfos;
        }

        public void setProxyInfos(List<ProxyInfo> list) {
            this.proxyInfos = list;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public String toString() {
            return "ProxyInfoResp{isForceUpate=" + this.isForceUpate + ", msg='" + this.msg + '\'' + ", proxyInfos=" + this.proxyInfos + '}';
        }
    }

    /* renamed from: com.vm.rest.MachineClient$ProxyInfo */
    public static class ProxyInfo {
        private String proxyIp;
        private String proxyURL;

        public ProxyInfo(String str, String str2) {
            this.proxyIp = str;
            this.proxyURL = str2;
        }

        public String getProxyIp() {
            return this.proxyIp;
        }

        public void setProxyIp(String str) {
            this.proxyIp = str;
        }

        public String getProxyURL() {
            return this.proxyURL;
        }

        public void setProxyURL(String str) {
            this.proxyURL = str;
        }

        public String toString() {
            return "ProxyInfo{proxyIp='" + this.proxyIp + '\'' + ", proxyURL='" + this.proxyURL + '\'' + '}';
        }
    }
}
