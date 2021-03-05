package com.p051vm.shadowsocks.p061ui;

import android.support.p037v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import com.p051vm.shadowsocks.core.AppInfo;
import com.p051vm.shadowsocks.core.AppProxyManager;
import com.p051vm.shadowsocks.sockhome.C2545R;

/* renamed from: com.vm.shadowsocks.ui.AppViewHolder */
/* compiled from: AppManager */
class AppViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Switch check = ((Switch) this.itemView.findViewById(C2545R.C2547id.itemcheck));
    private ImageView icon = ((ImageView) this.itemView.findViewById(C2545R.C2547id.itemicon));
    private AppInfo item;
    private Boolean proxied = false;

    AppViewHolder(View view) {
        super(view);
        view.setOnClickListener(this);
    }

    /* access modifiers changed from: package-private */
    public void bind(AppInfo appInfo) {
        this.item = appInfo;
        this.proxied = Boolean.valueOf(AppProxyManager.isAppProxy(appInfo.getPkgName()));
        this.icon.setImageDrawable(appInfo.getAppIcon());
        this.check.setText(appInfo.getAppLabel());
        this.check.setChecked(this.proxied.booleanValue());
    }

    public void onClick(View view) {
        if (this.proxied.booleanValue()) {
            AppProxyManager.removeProxyApp(this.item.getPkgName());
            this.check.setChecked(false);
        } else {
            AppProxyManager.getInstance(view.getContext());
            AppProxyManager.addProxyApp(this.item.getPkgName());
            this.check.setChecked(true);
        }
        this.proxied = Boolean.valueOf(!this.proxied.booleanValue());
    }
}
