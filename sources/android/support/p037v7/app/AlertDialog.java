package android.support.p037v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.ArrayRes;
import android.support.annotation.AttrRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.p037v7.app.AlertController;
import android.support.p037v7.appcompat.C0510R;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: android.support.v7.app.AlertDialog */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    protected AlertDialog(@NonNull Context context) {
        this(context, 0);
    }

    protected AlertDialog(@NonNull Context context, @StyleRes int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    protected AlertDialog(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    static int resolveDialogTheme(@NonNull Context context, @StyleRes int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0510R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        return this.mAlert.getButton(i);
    }

    public ListView getListView() {
        return this.mAlert.getListView();
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setCustomTitle(View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public void setView(View view) {
        this.mAlert.setView(view);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mAlert.setView(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.setButtonPanelLayoutHint(i);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.setButton(i, charSequence, (DialogInterface.OnClickListener) null, message);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, (Message) null);
    }

    public void setIcon(int i) {
        this.mAlert.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: android.support.v7.app.AlertDialog$Builder */
    public static class Builder {

        /* renamed from: P */
        private final AlertController.AlertParams f558P;
        private final int mTheme;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(@NonNull Context context, @StyleRes int i) {
            this.f558P = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        @NonNull
        public Context getContext() {
            return this.f558P.mContext;
        }

        public Builder setTitle(@StringRes int i) {
            this.f558P.mTitle = this.f558P.mContext.getText(i);
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f558P.mTitle = charSequence;
            return this;
        }

        public Builder setCustomTitle(@Nullable View view) {
            this.f558P.mCustomTitleView = view;
            return this;
        }

        public Builder setMessage(@StringRes int i) {
            this.f558P.mMessage = this.f558P.mContext.getText(i);
            return this;
        }

        public Builder setMessage(@Nullable CharSequence charSequence) {
            this.f558P.mMessage = charSequence;
            return this;
        }

        public Builder setIcon(@DrawableRes int i) {
            this.f558P.mIconId = i;
            return this;
        }

        public Builder setIcon(@Nullable Drawable drawable) {
            this.f558P.mIcon = drawable;
            return this;
        }

        public Builder setIconAttribute(@AttrRes int i) {
            TypedValue typedValue = new TypedValue();
            this.f558P.mContext.getTheme().resolveAttribute(i, typedValue, true);
            this.f558P.mIconId = typedValue.resourceId;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mPositiveButtonText = this.f558P.mContext.getText(i);
            this.f558P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mPositiveButtonText = charSequence;
            this.f558P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mNegativeButtonText = this.f558P.mContext.getText(i);
            this.f558P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mNegativeButtonText = charSequence;
            this.f558P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mNeutralButtonText = this.f558P.mContext.getText(i);
            this.f558P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mNeutralButtonText = charSequence;
            this.f558P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.f558P.mCancelable = z;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f558P.mOnCancelListener = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f558P.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f558P.mOnKeyListener = onKeyListener;
            return this;
        }

        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mItems = this.f558P.mContext.getResources().getTextArray(i);
            this.f558P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mItems = charSequenceArr;
            this.f558P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mAdapter = listAdapter;
            this.f558P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            this.f558P.mCursor = cursor;
            this.f558P.mLabelColumn = str;
            this.f558P.mOnClickListener = onClickListener;
            return this;
        }

        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f558P.mItems = this.f558P.mContext.getResources().getTextArray(i);
            this.f558P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f558P.mCheckedItems = zArr;
            this.f558P.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f558P.mItems = charSequenceArr;
            this.f558P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f558P.mCheckedItems = zArr;
            this.f558P.mIsMultiChoice = true;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f558P.mCursor = cursor;
            this.f558P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.f558P.mIsCheckedColumn = str;
            this.f558P.mLabelColumn = str2;
            this.f558P.mIsMultiChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mItems = this.f558P.mContext.getResources().getTextArray(i);
            this.f558P.mOnClickListener = onClickListener;
            this.f558P.mCheckedItem = i2;
            this.f558P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mCursor = cursor;
            this.f558P.mOnClickListener = onClickListener;
            this.f558P.mCheckedItem = i;
            this.f558P.mLabelColumn = str;
            this.f558P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mItems = charSequenceArr;
            this.f558P.mOnClickListener = onClickListener;
            this.f558P.mCheckedItem = i;
            this.f558P.mIsSingleChoice = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            this.f558P.mAdapter = listAdapter;
            this.f558P.mOnClickListener = onClickListener;
            this.f558P.mCheckedItem = i;
            this.f558P.mIsSingleChoice = true;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f558P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public Builder setView(int i) {
            this.f558P.mView = null;
            this.f558P.mViewLayoutResId = i;
            this.f558P.mViewSpacingSpecified = false;
            return this;
        }

        public Builder setView(View view) {
            this.f558P.mView = view;
            this.f558P.mViewLayoutResId = 0;
            this.f558P.mViewSpacingSpecified = false;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Deprecated
        public Builder setView(View view, int i, int i2, int i3, int i4) {
            this.f558P.mView = view;
            this.f558P.mViewLayoutResId = 0;
            this.f558P.mViewSpacingSpecified = true;
            this.f558P.mViewSpacingLeft = i;
            this.f558P.mViewSpacingTop = i2;
            this.f558P.mViewSpacingRight = i3;
            this.f558P.mViewSpacingBottom = i4;
            return this;
        }

        @Deprecated
        public Builder setInverseBackgroundForced(boolean z) {
            this.f558P.mForceInverseBackground = z;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setRecycleOnMeasureEnabled(boolean z) {
            this.f558P.mRecycleOnMeasure = z;
            return this;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f558P.mContext, this.mTheme);
            this.f558P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.f558P.mCancelable);
            if (this.f558P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f558P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.f558P.mOnDismissListener);
            if (this.f558P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.f558P.mOnKeyListener);
            }
            return alertDialog;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            create.show();
            return create;
        }
    }
}
