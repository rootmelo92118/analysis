package com.p051vm.p062vo.user;

import com.p051vm.p058f.C2521a;
import com.p051vm.p062vo.BaseReq;
import java.util.List;

/* renamed from: com.vm.vo.user.PackageInfoReq */
public class PackageInfoReq extends BaseReq {
    private static final long serialVersionUID = -8846088346820862472L;
    List<PackageInfoVO> packageInfos;

    public PackageInfoReq(C2521a.C2522a aVar) {
        super(aVar);
    }

    /* renamed from: com.vm.vo.user.PackageInfoReq$PackageInfoVO */
    public static class PackageInfoVO {
        private String appName;
        private String packageName;
        private Boolean vpnState;

        public PackageInfoVO(String str, String str2, Boolean bool) {
            this.appName = str;
            this.packageName = str2;
            this.vpnState = bool;
        }

        public String getAppName() {
            return this.appName;
        }

        public void setAppName(String str) {
            this.appName = str;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public Boolean getVpnState() {
            return this.vpnState;
        }

        public void setVpnState(Boolean bool) {
            this.vpnState = bool;
        }

        public String toString() {
            return "PackageInfoReq{appName='" + this.appName + '\'' + ", packageName='" + this.packageName + '\'' + ", vpnState=" + this.vpnState + '}';
        }
    }

    public List<PackageInfoVO> getPackageInfos() {
        return this.packageInfos;
    }

    public void setPackageInfos(List<PackageInfoVO> list) {
        this.packageInfos = list;
    }
}
