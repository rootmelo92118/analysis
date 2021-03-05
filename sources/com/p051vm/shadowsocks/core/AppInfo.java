package com.p051vm.shadowsocks.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.vm.shadowsocks.core.AppInfo */
public class AppInfo {
    private Drawable appIcon;
    private String appLabel;
    private String pkgName;

    public Drawable getAppIcon() {
        return this.appIcon;
    }

    public String getAppLabel() {
        return this.appLabel;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public void setAppIcon(Drawable drawable) {
        this.appIcon = drawable;
    }

    public void setAppLabel(String str) {
        this.appLabel = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public String toString() {
        return "AppInfo{appIcon=" + this.appIcon + ", appLabel='" + this.appLabel + '\'' + ", pkgName='" + this.pkgName + '\'' + '}';
    }
}
