package android.support.p037v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.RestrictTo;
import android.support.p037v7.widget.FitWindowsViewGroup;
import android.util.AttributeSet;
import android.widget.FrameLayout;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.FitWindowsFrameLayout */
public class FitWindowsFrameLayout extends FrameLayout implements FitWindowsViewGroup {
    private FitWindowsViewGroup.OnFitSystemWindowsListener mListener;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.mListener = onFitSystemWindowsListener;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.mListener != null) {
            this.mListener.onFitSystemWindows(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
