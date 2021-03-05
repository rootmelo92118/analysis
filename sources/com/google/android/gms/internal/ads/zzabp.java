package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C0926p;
import com.google.android.gms.p039a.C0722b;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@C1598qn
@ParametersAreNonnullByDefault
public final class zzabp extends RelativeLayout {

    /* renamed from: a */
    private static final float[] f6970a = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    @Nullable

    /* renamed from: b */
    private AnimationDrawable f6971b;

    public zzabp(Context context, C1068ap apVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        C0926p.m1306a(apVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f6970a, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(apVar.mo10779d());
        setLayoutParams(layoutParams);
        zzbv.zzlh().mo13229a((View) this, (Drawable) shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(apVar.mo10776a())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(apVar.mo10776a());
            textView.setTextColor(apVar.mo10780e());
            textView.setTextSize((float) apVar.mo10781f());
            bre.m6317a();
            int a = C1851zx.m8582a(context, 4);
            bre.m6317a();
            textView.setPadding(a, 0, C1851zx.m8582a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<C1085at> c = apVar.mo10778c();
        if (c != null && c.size() > 1) {
            this.f6971b = new AnimationDrawable();
            for (C1085at a2 : c) {
                try {
                    this.f6971b.addFrame((Drawable) C0722b.m770a(a2.mo11155a()), apVar.mo10782g());
                } catch (Exception e) {
                    C1772wz.m1625b("Error while getting drawable.", e);
                }
            }
            zzbv.zzlh().mo13229a((View) imageView, (Drawable) this.f6971b);
        } else if (c.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) C0722b.m770a(c.get(0).mo11155a()));
            } catch (Exception e2) {
                C1772wz.m1625b("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    public final void onAttachedToWindow() {
        if (this.f6971b != null) {
            this.f6971b.start();
        }
        super.onAttachedToWindow();
    }
}
