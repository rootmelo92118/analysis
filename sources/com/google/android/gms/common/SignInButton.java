package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C0927q;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.p039a.C0723c;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    private int f767a;

    /* renamed from: b */
    private int f768b;

    /* renamed from: c */
    private View f769c;

    /* renamed from: d */
    private View.OnClickListener f770d;

    public SignInButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f770d = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.SignInButton, 0, 0);
        try {
            this.f767a = obtainStyledAttributes.getInt(R.styleable.SignInButton_buttonSize, 0);
            this.f768b = obtainStyledAttributes.getInt(R.styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            mo9523a(this.f767a, this.f768b);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setSize(int i) {
        mo9523a(i, this.f768b);
    }

    public final void setColorScheme(int i) {
        mo9523a(this.f767a, i);
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        mo9523a(this.f767a, this.f768b);
    }

    /* renamed from: a */
    public final void mo9523a(int i, int i2) {
        this.f767a = i;
        this.f768b = i2;
        Context context = getContext();
        if (this.f769c != null) {
            removeView(this.f769c);
        }
        try {
            this.f769c = C0927q.m1320a(context, this.f767a, this.f768b);
        } catch (C0723c.C0724a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f767a;
            int i4 = this.f768b;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.mo9786a(context.getResources(), i3, i4);
            this.f769c = signInButtonImpl;
        }
        addView(this.f769c);
        this.f769c.setEnabled(isEnabled());
        this.f769c.setOnClickListener(this);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f770d = onClickListener;
        if (this.f769c != null) {
            this.f769c.setOnClickListener(this);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f769c.setEnabled(z);
    }

    public final void onClick(View view) {
        if (this.f770d != null && view == this.f769c) {
            this.f770d.onClick(this);
        }
    }
}
