package com.p051vm.shadowsocks.sockhome;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p037v7.app.AppCompatActivity;
import android.support.p037v7.widget.LinearLayoutManager;
import android.support.p037v7.widget.RecyclerView;
import com.p051vm.shadowsocks.sockhome.adapter.AppListAdapter;
import com.p051vm.shadowsocks.sockhome.util.AppUtils;

/* renamed from: com.vm.shadowsocks.sockhome.AppListActivity */
public class AppListActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2545R.layout.activity_app_list);
        RecyclerView recyclerView = (RecyclerView) findViewById(C2545R.C2547id.app_list);
        AppListAdapter appListAdapter = new AppListAdapter(this, AppUtils.getAllAppInfo(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        recyclerView.setAdapter(appListAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
