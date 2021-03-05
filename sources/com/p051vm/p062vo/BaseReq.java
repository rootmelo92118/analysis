package com.p051vm.p062vo;

import com.p051vm.p058f.C2521a;
import java.io.Serializable;

/* renamed from: com.vm.vo.BaseReq */
public class BaseReq implements Serializable {
    private String country;
    private String deviceId;
    private Integer deviceType = 1;
    private String language;
    private String mobileBrand;
    private String model;
    private String packageName;
    private String systemVersion;
    private Integer versionCode;
    private String versionName;

    public BaseReq(C2521a.C2522a aVar) {
        this.deviceId = aVar.mo15493a();
        this.model = aVar.mo15496d();
        this.systemVersion = aVar.mo15498f();
        this.mobileBrand = aVar.mo15494b();
        this.versionName = aVar.mo15500h();
        this.versionCode = Integer.valueOf(Integer.parseInt(aVar.mo15499g()));
        this.packageName = aVar.mo15497e();
        this.country = aVar.mo15501i();
        this.language = aVar.mo15495c();
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public Integer getDeviceType() {
        return this.deviceType;
    }

    public void setDeviceType(Integer num) {
        this.deviceType = num;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public String getSystemVersion() {
        return this.systemVersion;
    }

    public void setSystemVersion(String str) {
        this.systemVersion = str;
    }

    public String getMobileBrand() {
        return this.mobileBrand;
    }

    public void setMobileBrand(String str) {
        this.mobileBrand = str;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public Integer getVersionCode() {
        return this.versionCode;
    }

    public void setVersionCode(Integer num) {
        this.versionCode = num;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public String toString() {
        return "BaseReq{deviceId='" + this.deviceId + '\'' + ", deviceType=" + this.deviceType + ", model='" + this.model + '\'' + ", systemVersion='" + this.systemVersion + '\'' + ", mobileBrand='" + this.mobileBrand + '\'' + ", versionName='" + this.versionName + '\'' + ", versionCode=" + this.versionCode + ", packageName='" + this.packageName + '\'' + ", country='" + this.country + '\'' + ", language='" + this.language + '\'' + '}';
    }
}
