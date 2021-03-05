package android.support.p037v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.p037v7.appcompat.C0510R;
import android.support.p037v7.text.AllCapsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

@TargetApi(9)
@RequiresApi(9)
/* renamed from: android.support.v7.widget.AppCompatTextHelper */
class AppCompatTextHelper {
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableTopTint;
    final TextView mView;

    static AppCompatTextHelper create(TextView textView) {
        if (Build.VERSION.SDK_INT >= 17) {
            return new AppCompatTextHelperV17(textView);
        }
        return new AppCompatTextHelper(textView);
    }

    AppCompatTextHelper(TextView textView) {
        this.mView = textView;
    }

    /* access modifiers changed from: package-private */
    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0510R.styleable.AppCompatTextHelper, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0510R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (obtainStyledAttributes.hasValue(C0510R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0510R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (obtainStyledAttributes.hasValue(C0510R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0510R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (obtainStyledAttributes.hasValue(C0510R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0510R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (obtainStyledAttributes.hasValue(C0510R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, obtainStyledAttributes.getResourceId(C0510R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z3 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList2 = null;
        if (resourceId != -1) {
            TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, C0510R.styleable.TextAppearance);
            if (z3 || !obtainStyledAttributes2.hasValue(C0510R.styleable.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z = obtainStyledAttributes2.getBoolean(C0510R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList colorStateList3 = obtainStyledAttributes2.hasValue(C0510R.styleable.TextAppearance_android_textColor) ? obtainStyledAttributes2.getColorStateList(C0510R.styleable.TextAppearance_android_textColor) : null;
                if (obtainStyledAttributes2.hasValue(C0510R.styleable.TextAppearance_android_textColorHint)) {
                    colorStateList2 = obtainStyledAttributes2.getColorStateList(C0510R.styleable.TextAppearance_android_textColorHint);
                }
                ColorStateList colorStateList4 = colorStateList3;
                colorStateList = colorStateList2;
                colorStateList2 = colorStateList4;
            } else {
                colorStateList = null;
            }
            obtainStyledAttributes2.recycle();
        } else {
            colorStateList = null;
            z2 = false;
            z = false;
        }
        TintTypedArray obtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0510R.styleable.TextAppearance, i, 0);
        if (z3 || !obtainStyledAttributes3.hasValue(C0510R.styleable.TextAppearance_textAllCaps)) {
            z4 = z2;
        } else {
            z = obtainStyledAttributes3.getBoolean(C0510R.styleable.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (obtainStyledAttributes3.hasValue(C0510R.styleable.TextAppearance_android_textColor)) {
                colorStateList2 = obtainStyledAttributes3.getColorStateList(C0510R.styleable.TextAppearance_android_textColor);
            }
            if (obtainStyledAttributes3.hasValue(C0510R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList = obtainStyledAttributes3.getColorStateList(C0510R.styleable.TextAppearance_android_textColorHint);
            }
        }
        obtainStyledAttributes3.recycle();
        if (colorStateList2 != null) {
            this.mView.setTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.mView.setHintTextColor(colorStateList);
        }
        if (!z3 && z4) {
            setAllCaps(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void onSetTextAppearance(Context context, int i) {
        ColorStateList colorStateList;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C0510R.styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(C0510R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(obtainStyledAttributes.getBoolean(C0510R.styleable.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(C0510R.styleable.TextAppearance_android_textColor) && (colorStateList = obtainStyledAttributes.getColorStateList(C0510R.styleable.TextAppearance_android_textColor)) != null) {
            this.mView.setTextColor(colorStateList);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    public void setAllCaps(boolean z) {
        this.mView.setTransformationMethod(z ? new AllCapsTransformationMethod(this.mView.getContext()) : null);
    }

    /* access modifiers changed from: package-private */
    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
    }

    /* access modifiers changed from: package-private */
    public final void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable != null && tintInfo != null) {
            AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
        }
    }

    protected static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }
}
