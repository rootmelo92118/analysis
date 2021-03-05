package com.p051vm.shadowsocks.sockhome.adapter;

import android.content.Context;
import android.support.p037v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.p051vm.shadowsocks.sockhome.C2545R;
import com.p051vm.shadowsocks.sockhome.bean.AppItem;
import java.util.List;

/* renamed from: com.vm.shadowsocks.sockhome.adapter.AppListAdapter */
public class AppListAdapter extends RecyclerView.Adapter<AppListViewHolder> {
    private Context mContext;
    private List<AppItem> mDatas;

    public AppListAdapter(Context context, List<AppItem> list) {
        this.mContext = context;
        this.mDatas = list;
    }

    public AppListViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AppListViewHolder(LayoutInflater.from(this.mContext).inflate(C2545R.layout.item_app, viewGroup, false));
    }

    public void onBindViewHolder(AppListViewHolder appListViewHolder, int i) {
        appListViewHolder.appLogo.setImageDrawable(this.mDatas.get(i).appLogo);
        appListViewHolder.appName.setText(this.mDatas.get(i).appName);
        appListViewHolder.appSwitch.setChecked(this.mDatas.get(i).state);
    }

    public int getItemCount() {
        return this.mDatas.size();
    }

    /* renamed from: com.vm.shadowsocks.sockhome.adapter.AppListAdapter$AppListViewHolder */
    static class AppListViewHolder extends RecyclerView.ViewHolder {
        ImageView appLogo;
        TextView appName;
        Switch appSwitch;

        public AppListViewHolder(View view) {
            super(view);
            this.appLogo = (ImageView) view.findViewById(C2545R.C2547id.app_logo);
            this.appName = (TextView) view.findViewById(C2545R.C2547id.app_name);
            this.appSwitch = (Switch) view.findViewById(C2545R.C2547id.app_switch);
        }
    }
}
