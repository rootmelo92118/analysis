package android.support.p037v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.p034v4.content.res.ConfigurationHelper;
import android.support.p037v7.appcompat.C0510R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {
    private static final int ALLOW_STACKING_MIN_HEIGHT_DP = 320;
    private static final int PEEK_BUTTON_DP = 16;
    private boolean mAllowStacking;
    private int mLastWidthSize = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = ConfigurationHelper.getScreenHeightDp(getResources()) >= 320;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0510R.styleable.ButtonBarLayout);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(C0510R.styleable.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    public void setAllowStacking(boolean z) {
        if (this.mAllowStacking != z) {
            this.mAllowStacking = z;
            if (!this.mAllowStacking && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if ((android.support.p034v4.view.ViewCompat.getMeasuredWidthAndState(r8) & android.support.p034v4.view.ViewCompat.MEASURED_STATE_MASK) == 16777216) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (((r6 + getPaddingLeft()) + getPaddingRight()) > r0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            boolean r1 = r8.mAllowStacking
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r8.mLastWidthSize
            if (r0 <= r1) goto L_0x0016
            boolean r1 = r8.isStacked()
            if (r1 == 0) goto L_0x0016
            r8.setStacked(r2)
        L_0x0016:
            r8.mLastWidthSize = r0
        L_0x0018:
            boolean r1 = r8.isStacked()
            r3 = 1
            if (r1 != 0) goto L_0x002f
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L_0x002f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r4 = 1
            goto L_0x0031
        L_0x002f:
            r1 = r9
            r4 = 0
        L_0x0031:
            super.onMeasure(r1, r10)
            boolean r1 = r8.mAllowStacking
            if (r1 == 0) goto L_0x007a
            boolean r1 = r8.isStacked()
            if (r1 != 0) goto L_0x007a
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 11
            if (r1 < r5) goto L_0x0053
            int r0 = android.support.p034v4.view.ViewCompat.getMeasuredWidthAndState(r8)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r1) goto L_0x0051
        L_0x004f:
            r0 = 1
            goto L_0x0074
        L_0x0051:
            r0 = 0
            goto L_0x0074
        L_0x0053:
            int r1 = r8.getChildCount()
            r5 = 0
            r6 = 0
        L_0x0059:
            if (r5 >= r1) goto L_0x0067
            android.view.View r7 = r8.getChildAt(r5)
            int r7 = r7.getMeasuredWidth()
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x0059
        L_0x0067:
            int r1 = r8.getPaddingLeft()
            int r6 = r6 + r1
            int r1 = r8.getPaddingRight()
            int r6 = r6 + r1
            if (r6 <= r0) goto L_0x0051
            goto L_0x004f
        L_0x0074:
            if (r0 == 0) goto L_0x007a
            r8.setStacked(r3)
            r4 = 1
        L_0x007a:
            if (r4 == 0) goto L_0x007f
            super.onMeasure(r9, r10)
        L_0x007f:
            int r9 = r8.getNextVisibleChildIndex(r2)
            if (r9 < 0) goto L_0x00d1
            android.view.View r10 = r8.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r8.getPaddingTop()
            int r10 = r10.getMeasuredHeight()
            int r1 = r1 + r10
            int r10 = r0.topMargin
            int r1 = r1 + r10
            int r10 = r0.bottomMargin
            int r1 = r1 + r10
            int r1 = r1 + r2
            boolean r10 = r8.isStacked()
            if (r10 == 0) goto L_0x00cb
            int r9 = r9 + r3
            int r9 = r8.getNextVisibleChildIndex(r9)
            if (r9 < 0) goto L_0x00c9
            float r10 = (float) r1
            android.view.View r9 = r8.getChildAt(r9)
            int r9 = r9.getPaddingTop()
            float r9 = (float) r9
            r0 = 1098907648(0x41800000, float:16.0)
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            float r9 = r9 + r1
            float r10 = r10 + r9
            int r9 = (int) r10
            r2 = r9
            goto L_0x00d1
        L_0x00c9:
            r2 = r1
            goto L_0x00d1
        L_0x00cb:
            int r9 = r8.getPaddingBottom()
            int r2 = r1 + r9
        L_0x00d1:
            int r9 = android.support.p034v4.view.ViewCompat.getMinimumHeight(r8)
            if (r9 == r2) goto L_0x00da
            r8.setMinimumHeight(r2)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p037v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }

    private int getNextVisibleChildIndex(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0510R.C0512id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private boolean isStacked() {
        return getOrientation() == 1;
    }
}
