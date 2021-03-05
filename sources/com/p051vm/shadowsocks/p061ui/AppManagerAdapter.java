package com.p051vm.shadowsocks.p061ui;

import android.support.p037v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.futuremind.recyclerviewfastscroll.C0683a;
import com.p051vm.shadowsocks.core.AppProxyManager;
import com.p051vm.shadowsocks.sockhome.C2545R;

/* renamed from: com.vm.shadowsocks.ui.AppManagerAdapter */
/* compiled from: AppManager */
class AppManagerAdapter extends RecyclerView.Adapter<AppViewHolder> implements C0683a {
    AppManagerAdapter() {
    }

    public AppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C2545R.layout.layout_apps_item, viewGroup, false));
    }

    public void onBindViewHolder(AppViewHolder appViewHolder, int i) {
        appViewHolder.bind(AppProxyManager.mlistAppInfo.get(i));
    }

    public int getItemCount() {
        return AppProxyManager.mlistAppInfo.size();
    }

    public String getSectionTitle(int i) {
        return AppProxyManager.mlistAppInfo.get(i).getAppLabel();
    }
}
