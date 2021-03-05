package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0254b;
import android.os.Bundle;
import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.arch.lifecycle.g */
/* compiled from: ReportFragment */
public class C0263g extends Fragment {

    /* renamed from: a */
    private C0264a f533a;

    /* renamed from: android.arch.lifecycle.g$a */
    /* compiled from: ReportFragment */
    interface C0264a {
        /* renamed from: a */
        void mo474a();

        /* renamed from: b */
        void mo475b();

        /* renamed from: c */
        void mo476c();
    }

    /* renamed from: a */
    public static void m686a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0263g(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m688a(C0264a aVar) {
        if (aVar != null) {
            aVar.mo474a();
        }
    }

    /* renamed from: b */
    private void m689b(C0264a aVar) {
        if (aVar != null) {
            aVar.mo475b();
        }
    }

    /* renamed from: c */
    private void m690c(C0264a aVar) {
        if (aVar != null) {
            aVar.mo476c();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m688a(this.f533a);
        m687a(C0254b.C0255a.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m689b(this.f533a);
        m687a(C0254b.C0255a.ON_START);
    }

    public void onResume() {
        super.onResume();
        m690c(this.f533a);
        m687a(C0254b.C0255a.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m687a(C0254b.C0255a.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m687a(C0254b.C0255a.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m687a(C0254b.C0255a.ON_DESTROY);
        this.f533a = null;
    }

    /* renamed from: a */
    private void m687a(C0254b.C0255a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0261e) {
            ((C0261e) activity).mo466a().mo463a(aVar);
        } else if (activity instanceof C0257c) {
            C0254b lifecycle = ((C0257c) activity).getLifecycle();
            if (lifecycle instanceof C0258d) {
                ((C0258d) lifecycle).mo463a(aVar);
            }
        }
    }
}
