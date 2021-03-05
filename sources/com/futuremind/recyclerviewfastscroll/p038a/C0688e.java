package com.futuremind.recyclerviewfastscroll.p038a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.support.annotation.AnimatorRes;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.R;

/* renamed from: com.futuremind.recyclerviewfastscroll.a.e */
/* compiled from: VisibilityAnimationManager */
public class C0688e {

    /* renamed from: a */
    protected final View f597a;

    /* renamed from: b */
    protected AnimatorSet f598b;

    /* renamed from: c */
    protected AnimatorSet f599c;

    /* renamed from: d */
    private float f600d;

    /* renamed from: e */
    private float f601e;

    protected C0688e(final View view, @AnimatorRes int i, @AnimatorRes int i2, float f, float f2, int i3) {
        this.f597a = view;
        this.f600d = f;
        this.f601e = f2;
        this.f598b = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
        this.f598b.setStartDelay((long) i3);
        this.f598b.setTarget(view);
        this.f599c = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i);
        this.f599c.setTarget(view);
        this.f598b.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a */
            boolean f602a;

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!this.f602a) {
                    view.setVisibility(4);
                }
                this.f602a = false;
            }

            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f602a = true;
            }
        });
        mo8335c();
    }

    /* renamed from: a */
    public void mo8333a() {
        this.f598b.cancel();
        if (this.f597a.getVisibility() == 4) {
            this.f597a.setVisibility(0);
            mo8335c();
            this.f599c.start();
        }
    }

    /* renamed from: b */
    public void mo8334b() {
        mo8335c();
        this.f598b.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8335c() {
        this.f597a.setPivotX(this.f600d * ((float) this.f597a.getMeasuredWidth()));
        this.f597a.setPivotY(this.f601e * ((float) this.f597a.getMeasuredHeight()));
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.a.e$a */
    /* compiled from: VisibilityAnimationManager */
    public static abstract class C0690a<T extends C0688e> {

        /* renamed from: a */
        protected final View f605a;

        /* renamed from: b */
        protected int f606b = R.animator.fastscroll__default_show;

        /* renamed from: c */
        protected int f607c = R.animator.fastscroll__default_hide;

        /* renamed from: d */
        protected int f608d = 1000;

        /* renamed from: e */
        protected float f609e = 0.5f;

        /* renamed from: f */
        protected float f610f = 0.5f;

        /* renamed from: a */
        public abstract T mo8339a();

        public C0690a(View view) {
            this.f605a = view;
        }

        /* renamed from: a */
        public C0690a<T> mo8338a(float f) {
            this.f609e = f;
            return this;
        }

        /* renamed from: b */
        public C0690a<T> mo8340b(float f) {
            this.f610f = f;
            return this;
        }
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.a.e$b */
    /* compiled from: VisibilityAnimationManager */
    public static class C0691b extends C0690a<C0688e> {
        public C0691b(View view) {
            super(view);
        }

        /* renamed from: a */
        public C0688e mo8339a() {
            return new C0688e(this.f605a, this.f606b, this.f607c, this.f609e, this.f610f, this.f608d);
        }
    }
}
