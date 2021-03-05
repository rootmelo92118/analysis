package android.support.p037v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.RestrictTo;
import android.support.p037v7.content.res.AppCompatResources;
import android.widget.ImageView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.AppCompatImageHelper */
public class AppCompatImageHelper {
    private final ImageView mView;

    public AppCompatImageHelper(ImageView imageView) {
        this.mView = imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadFromAttributes(android.util.AttributeSet r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            android.widget.ImageView r1 = r5.mView     // Catch:{ all -> 0x003f }
            android.graphics.drawable.Drawable r1 = r1.getDrawable()     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x0034
            android.widget.ImageView r2 = r5.mView     // Catch:{ all -> 0x003f }
            android.content.Context r2 = r2.getContext()     // Catch:{ all -> 0x003f }
            int[] r3 = android.support.p037v7.appcompat.C0510R.styleable.AppCompatImageView     // Catch:{ all -> 0x003f }
            r4 = 0
            android.support.v7.widget.TintTypedArray r6 = android.support.p037v7.widget.TintTypedArray.obtainStyledAttributes(r2, r6, r3, r7, r4)     // Catch:{ all -> 0x003f }
            int r7 = android.support.p037v7.appcompat.C0510R.styleable.AppCompatImageView_srcCompat     // Catch:{ all -> 0x0032 }
            r0 = -1
            int r7 = r6.getResourceId(r7, r0)     // Catch:{ all -> 0x0032 }
            if (r7 == r0) goto L_0x0030
            android.widget.ImageView r0 = r5.mView     // Catch:{ all -> 0x0032 }
            android.content.Context r0 = r0.getContext()     // Catch:{ all -> 0x0032 }
            android.graphics.drawable.Drawable r1 = android.support.p037v7.content.res.AppCompatResources.getDrawable(r0, r7)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            android.widget.ImageView r7 = r5.mView     // Catch:{ all -> 0x0032 }
            r7.setImageDrawable(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            r0 = r6
            goto L_0x0034
        L_0x0032:
            r7 = move-exception
            goto L_0x0041
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            android.support.p037v7.widget.DrawableUtils.fixDrawable(r1)     // Catch:{ all -> 0x003f }
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.recycle()
        L_0x003e:
            return
        L_0x003f:
            r7 = move-exception
            r6 = r0
        L_0x0041:
            if (r6 == 0) goto L_0x0046
            r6.recycle()
        L_0x0046:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p037v7.widget.AppCompatImageHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void setImageResource(int i) {
        if (i != 0) {
            Drawable drawable = AppCompatResources.getDrawable(this.mView.getContext(), i);
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            this.mView.setImageDrawable(drawable);
            return;
        }
        this.mView.setImageDrawable((Drawable) null);
    }

    /* access modifiers changed from: package-private */
    public boolean hasOverlappingRendering() {
        return Build.VERSION.SDK_INT < 21 || !(this.mView.getBackground() instanceof RippleDrawable);
    }
}
