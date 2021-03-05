package com.futuremind.recyclerviewfastscroll.p038a;

import android.graphics.drawable.InsetDrawable;
import android.support.p034v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.futuremind.recyclerviewfastscroll.C0692b;
import com.futuremind.recyclerviewfastscroll.R;
import com.futuremind.recyclerviewfastscroll.p038a.C0688e;

/* renamed from: com.futuremind.recyclerviewfastscroll.a.b */
/* compiled from: DefaultScrollerViewProvider */
public class C0685b extends C0686c {

    /* renamed from: a */
    private View f592a;

    /* renamed from: b */
    private View f593b;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0687d mo8322c() {
        return null;
    }

    /* renamed from: a */
    public View mo8318a(ViewGroup viewGroup) {
        this.f593b = new View(mo8325e());
        int dimensionPixelSize = mo8326f().mo8295a() ? 0 : mo8325e().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        int dimensionPixelSize2 = !mo8326f().mo8295a() ? 0 : mo8325e().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        C0692b.m757a(this.f593b, new InsetDrawable(ContextCompat.getDrawable(mo8325e(), R.drawable.fastscroll__default_handle), dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize));
        this.f593b.setLayoutParams(new ViewGroup.LayoutParams(mo8325e().getResources().getDimensionPixelSize(mo8326f().mo8295a() ? R.dimen.fastscroll__handle_clickable_width : R.dimen.fastscroll__handle_height), mo8325e().getResources().getDimensionPixelSize(mo8326f().mo8295a() ? R.dimen.fastscroll__handle_height : R.dimen.fastscroll__handle_clickable_width)));
        return this.f593b;
    }

    /* renamed from: b */
    public View mo8321b(ViewGroup viewGroup) {
        this.f592a = LayoutInflater.from(mo8325e()).inflate(R.layout.fastscroll__default_bubble, viewGroup, false);
        return this.f592a;
    }

    /* renamed from: a */
    public TextView mo8319a() {
        return (TextView) this.f592a;
    }

    /* renamed from: b */
    public int mo8320b() {
        float width;
        int width2;
        if (mo8326f().mo8295a()) {
            width = ((float) this.f593b.getHeight()) / 2.0f;
            width2 = this.f592a.getHeight();
        } else {
            width = ((float) this.f593b.getWidth()) / 2.0f;
            width2 = this.f592a.getWidth();
        }
        return (int) (width - ((float) width2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0687d mo8323d() {
        return new C0684a(new C0688e.C0691b(this.f592a).mo8338a(1.0f).mo8340b(1.0f).mo8339a());
    }
}
