package com.p051vm.shadowsocks.p061ui;

import android.animation.Animator;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.p037v7.widget.DefaultItemAnimator;
import android.support.p037v7.widget.LinearLayoutManager;
import android.support.p037v7.widget.RecyclerView;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import com.p051vm.shadowsocks.core.AppInfo;
import com.p051vm.shadowsocks.core.AppProxyManager;
import com.p051vm.shadowsocks.sockhome.C2545R;
import java.util.Collections;
import java.util.List;
import p000a.p013b.C0170c;
import p000a.p013b.C0177d;
import p000a.p013b.C0182e;
import p000a.p013b.C0230g;
import p000a.p013b.p014a.p016b.C0157a;
import p000a.p013b.p017b.C0165b;
import p000a.p013b.p031g.C0231a;

/* renamed from: com.vm.shadowsocks.ui.AppManager */
public class AppManager extends Activity {
    /* access modifiers changed from: private */
    public AppManagerAdapter adapter;
    /* access modifiers changed from: private */
    public RecyclerView appListView;
    /* access modifiers changed from: private */
    public FastScroller fastScroller;
    /* access modifiers changed from: private */
    public View loadingView;

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2545R.layout.layout_apps);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        this.loadingView = findViewById(C2545R.C2547id.loading);
        this.appListView = (RecyclerView) findViewById(C2545R.C2547id.list);
        this.appListView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.appListView.setItemAnimator(new DefaultItemAnimator());
        this.fastScroller = (FastScroller) findViewById(C2545R.C2547id.fastscroller);
        C0170c.m482a(new C0182e<List<AppInfo>>() {
            public void subscribe(C0177d<List<AppInfo>> dVar) {
                AppManager.this.queryAppInfo();
                AppManagerAdapter unused = AppManager.this.adapter = new AppManagerAdapter();
                dVar.mo342e_();
            }
        }).mo363b(C0231a.m638a()).mo360a(C0157a.m455a()).mo362a(new C0230g<List<AppInfo>>() {
            public void onError(Throwable th) {
            }

            public void onNext(List<AppInfo> list) {
            }

            public void onSubscribe(C0165b bVar) {
            }

            public void onComplete() {
                AppManager.this.appListView.setAdapter(AppManager.this.adapter);
                AppManager.this.fastScroller.setRecyclerView(AppManager.this.appListView);
                AppManager.this.appListView.setAlpha(0.0f);
                AppManager.this.appListView.setVisibility(0);
                AppManager.this.appListView.animate().alpha(1.0f).setDuration(1);
                AppManager.this.loadingView.animate().alpha(0.0f).setDuration(1).setListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                        AppManager.this.loadingView.setVisibility(8);
                    }
                });
            }
        });
    }

    public void queryAppInfo() {
        PackageManager packageManager = getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(packageManager));
        if (AppProxyManager.mlistAppInfo != null) {
            AppProxyManager.mlistAppInfo.clear();
            for (ResolveInfo next : queryIntentActivities) {
                String str = next.activityInfo.packageName;
                Drawable loadIcon = next.loadIcon(packageManager);
                AppInfo appInfo = new AppInfo();
                appInfo.setAppLabel((String) next.loadLabel(packageManager));
                appInfo.setPkgName(str);
                appInfo.setAppIcon(loadIcon);
                if (!appInfo.getPkgName().equals("com.vm.shadowsocks.sockhome")) {
                    AppProxyManager.mlistAppInfo.add(appInfo);
                }
            }
        }
    }
}
