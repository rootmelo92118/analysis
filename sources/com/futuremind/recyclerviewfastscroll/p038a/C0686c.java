package com.futuremind.recyclerviewfastscroll.p038a;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: com.futuremind.recyclerviewfastscroll.a.c */
/* compiled from: ScrollerViewProvider */
public abstract class C0686c {

    /* renamed from: a */
    private FastScroller f594a;

    /* renamed from: b */
    private C0687d f595b;

    /* renamed from: c */
    private C0687d f596c;

    /* renamed from: a */
    public abstract View mo8318a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract TextView mo8319a();

    /* renamed from: b */
    public abstract int mo8320b();

    /* renamed from: b */
    public abstract View mo8321b(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: c */
    public abstract C0687d mo8322c();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: d */
    public abstract C0687d mo8323d();

    /* renamed from: a */
    public void mo8324a(FastScroller fastScroller) {
        this.f594a = fastScroller;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Context mo8325e() {
        return this.f594a.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public FastScroller mo8326f() {
        return this.f594a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0687d mo8327g() {
        if (this.f595b == null) {
            this.f595b = mo8322c();
        }
        return this.f595b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0687d mo8328h() {
        if (this.f596c == null) {
            this.f596c = mo8323d();
        }
        return this.f596c;
    }

    /* renamed from: i */
    public void mo8329i() {
        if (mo8327g() != null) {
            mo8327g().mo8314a();
        }
        if (mo8328h() != null) {
            mo8328h().mo8314a();
        }
    }

    /* renamed from: j */
    public void mo8330j() {
        if (mo8327g() != null) {
            mo8327g().mo8315b();
        }
        if (mo8328h() != null) {
            mo8328h().mo8315b();
        }
    }

    /* renamed from: k */
    public void mo8331k() {
        if (mo8327g() != null) {
            mo8327g().mo8316c();
        }
        if (mo8328h() != null) {
            mo8328h().mo8316c();
        }
    }

    /* renamed from: l */
    public void mo8332l() {
        if (mo8327g() != null) {
            mo8327g().mo8317d();
        }
        if (mo8328h() != null) {
            mo8328h().mo8317d();
        }
    }
}
