package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.C1598qn;
import com.google.android.gms.internal.ads.C1851zx;
import com.google.android.gms.internal.ads.bre;
import javax.annotation.Nullable;

@C1598qn
public final class zzo extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdse;
    private final zzw zzdsf;

    public zzo(Context context, zzp zzp, @Nullable zzw zzw) {
        super(context);
        this.zzdsf = zzw;
        setOnClickListener(this);
        this.zzdse = new ImageButton(context);
        this.zzdse.setImageResource(17301527);
        this.zzdse.setBackgroundColor(0);
        this.zzdse.setOnClickListener(this);
        ImageButton imageButton = this.zzdse;
        bre.m6317a();
        int a = C1851zx.m8582a(context, zzp.paddingLeft);
        bre.m6317a();
        int a2 = C1851zx.m8582a(context, 0);
        bre.m6317a();
        int a3 = C1851zx.m8582a(context, zzp.paddingRight);
        bre.m6317a();
        imageButton.setPadding(a, a2, a3, C1851zx.m8582a(context, zzp.paddingBottom));
        this.zzdse.setContentDescription("Interstitial close button");
        bre.m6317a();
        C1851zx.m8582a(context, zzp.size);
        ImageButton imageButton2 = this.zzdse;
        bre.m6317a();
        int a4 = C1851zx.m8582a(context, zzp.size + zzp.paddingLeft + zzp.paddingRight);
        bre.m6317a();
        addView(imageButton2, new FrameLayout.LayoutParams(a4, C1851zx.m8582a(context, zzp.size + zzp.paddingBottom), 17));
    }

    public final void onClick(View view) {
        if (this.zzdsf != null) {
            this.zzdsf.zzvp();
        }
    }

    public final void zzaf(boolean z) {
        if (z) {
            this.zzdse.setVisibility(8);
        } else {
            this.zzdse.setVisibility(0);
        }
    }
}
