package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.p034v4.graphics.drawable.DrawableCompat;
import android.support.p034v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"NewApi"})
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable {
    private static final String ANIMATED_VECTOR = "animated-vector";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private static final String LOGTAG = "AnimatedVDCompat";
    private static final String TARGET = "target";
    private AnimatedVectorDrawableCompatState mAnimatedVectorState;
    private ArgbEvaluator mArgbEvaluator;
    AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
    final Drawable.Callback mCallback;
    private Context mContext;

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    AnimatedVectorDrawableCompat() {
        this((Context) null, (AnimatedVectorDrawableCompatState) null, (Resources) null);
    }

    private AnimatedVectorDrawableCompat(@Nullable Context context) {
        this(context, (AnimatedVectorDrawableCompatState) null, (Resources) null);
    }

    private AnimatedVectorDrawableCompat(@Nullable Context context, @Nullable AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, @Nullable Resources resources) {
        this.mArgbEvaluator = null;
        this.mCallback = new Drawable.Callback() {
            public void invalidateDrawable(Drawable drawable) {
                AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.mContext = context;
        if (animatedVectorDrawableCompatState != null) {
            this.mAnimatedVectorState = animatedVectorDrawableCompatState;
        } else {
            this.mAnimatedVectorState = new AnimatedVectorDrawableCompatState(context, animatedVectorDrawableCompatState, this.mCallback, resources);
        }
    }

    public Drawable mutate() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.mutate();
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.graphics.drawable.AnimatedVectorDrawableCompat create(@android.support.annotation.NonNull android.content.Context r4, @android.support.annotation.DrawableRes int r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x002e
            android.support.graphics.drawable.AnimatedVectorDrawableCompat r0 = new android.support.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r4)
            android.content.res.Resources r1 = r4.getResources()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            android.graphics.drawable.Drawable r4 = android.support.p034v4.content.res.ResourcesCompat.getDrawable(r1, r5, r4)
            r0.mDelegateDrawable = r4
            android.graphics.drawable.Drawable r4 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$Callback r5 = r0.mCallback
            r4.setCallback(r5)
            android.support.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState r4 = new android.support.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
            android.graphics.drawable.Drawable r5 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.mCachedConstantStateDelegate = r4
            return r0
        L_0x002e:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
        L_0x003a:
            int r1 = r5.next()     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            r2 = 2
            if (r1 == r2) goto L_0x0045
            r3 = 1
            if (r1 == r3) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            if (r1 != r2) goto L_0x0054
            android.content.res.Resources r1 = r4.getResources()     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            android.content.res.Resources$Theme r2 = r4.getTheme()     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            android.support.graphics.drawable.AnimatedVectorDrawableCompat r4 = createFromXmlInner(r4, r1, r5, r0, r2)     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            return r4
        L_0x0054:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
            throw r4     // Catch:{ XmlPullParserException -> 0x0065, IOException -> 0x005c }
        L_0x005c:
            r4 = move-exception
            java.lang.String r5 = "AnimatedVDCompat"
            java.lang.String r0 = "parser error"
            android.util.Log.e(r5, r0, r4)
            goto L_0x006d
        L_0x0065:
            r4 = move-exception
            java.lang.String r5 = "AnimatedVDCompat"
            java.lang.String r0 = "parser error"
            android.util.Log.e(r5, r0, r4)
        L_0x006d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.AnimatedVectorDrawableCompat.create(android.content.Context, int):android.support.graphics.drawable.AnimatedVectorDrawableCompat");
    }

    public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new AnimatedVectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        return null;
    }

    public int getChangingConfigurations() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.mAnimatedVectorState.mChangingConfigurations;
    }

    public void draw(Canvas canvas) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.draw(canvas);
            return;
        }
        this.mAnimatedVectorState.mVectorDrawable.draw(canvas);
        if (isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setBounds(rect);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setState(iArr);
        }
        return this.mAnimatedVectorState.mVectorDrawable.setState(iArr);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setLevel(i);
        }
        return this.mAnimatedVectorState.mVectorDrawable.setLevel(i);
    }

    public int getAlpha() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.getAlpha(this.mDelegateDrawable);
        }
        return this.mAnimatedVectorState.mVectorDrawable.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAlpha(i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setColorFilter(colorFilter);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTint(this.mDelegateDrawable, i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintList(this.mDelegateDrawable, colorStateList);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintMode(this.mDelegateDrawable, mode);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setVisible(z, z2);
        }
        this.mAnimatedVectorState.mVectorDrawable.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.isStateful();
        }
        return this.mAnimatedVectorState.mVectorDrawable.isStateful();
    }

    public int getOpacity() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getOpacity();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicWidth();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicHeight();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.isAutoMirrored(this.mDelegateDrawable);
        }
        return this.mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAutoMirrored(z);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.inflate(this.mDelegateDrawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1) {
            if (xmlPullParser.getDepth() >= depth || eventType != 3) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (ANIMATED_VECTOR.equals(name)) {
                        TypedArray obtainAttributes = VectorDrawableCommon.obtainAttributes(resources, theme, attributeSet, AndroidResources.styleable_AnimatedVectorDrawable);
                        int resourceId = obtainAttributes.getResourceId(0, 0);
                        if (resourceId != 0) {
                            VectorDrawableCompat create = VectorDrawableCompat.create(resources, resourceId, theme);
                            create.setAllowCaching(false);
                            create.setCallback(this.mCallback);
                            if (this.mAnimatedVectorState.mVectorDrawable != null) {
                                this.mAnimatedVectorState.mVectorDrawable.setCallback((Drawable.Callback) null);
                            }
                            this.mAnimatedVectorState.mVectorDrawable = create;
                        }
                        obtainAttributes.recycle();
                    } else if (TARGET.equals(name)) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, AndroidResources.styleable_AnimatedVectorDrawableTarget);
                        String string = obtainAttributes2.getString(0);
                        int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            if (this.mContext != null) {
                                setupAnimatorsForTarget(string, AnimatorInflater.loadAnimator(this.mContext, resourceId2));
                            } else {
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes2.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.applyTheme(this.mDelegateDrawable, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.mDelegateDrawable != null) {
            return DrawableCompat.canApplyTheme(this.mDelegateDrawable);
        }
        return false;
    }

    private static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {
        private final Drawable.ConstantState mDelegateState;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable();
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(resources);
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(resources, theme);
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        public boolean canApplyTheme() {
            return this.mDelegateState.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.mDelegateState.getChangingConfigurations();
        }
    }

    private static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {
        ArrayList<Animator> mAnimators;
        int mChangingConfigurations;
        ArrayMap<Animator, String> mTargetNameMap;
        VectorDrawableCompat mVectorDrawable;

        public AnimatedVectorDrawableCompatState(Context context, AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, Drawable.Callback callback, Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.mChangingConfigurations = animatedVectorDrawableCompatState.mChangingConfigurations;
                if (animatedVectorDrawableCompatState.mVectorDrawable != null) {
                    Drawable.ConstantState constantState = animatedVectorDrawableCompatState.mVectorDrawable.getConstantState();
                    if (resources != null) {
                        this.mVectorDrawable = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.mVectorDrawable = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    this.mVectorDrawable = (VectorDrawableCompat) this.mVectorDrawable.mutate();
                    this.mVectorDrawable.setCallback(callback);
                    this.mVectorDrawable.setBounds(animatedVectorDrawableCompatState.mVectorDrawable.getBounds());
                    this.mVectorDrawable.setAllowCaching(false);
                }
                if (animatedVectorDrawableCompatState.mAnimators != null) {
                    int size = animatedVectorDrawableCompatState.mAnimators.size();
                    this.mAnimators = new ArrayList<>(size);
                    this.mTargetNameMap = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = animatedVectorDrawableCompatState.mAnimators.get(i);
                        Animator clone = animator.clone();
                        String str = animatedVectorDrawableCompatState.mTargetNameMap.get(animator);
                        clone.setTarget(this.mVectorDrawable.getTargetByName(str));
                        this.mAnimators.add(clone);
                        this.mTargetNameMap.put(clone, str);
                    }
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }
    }

    private void setupColorAnimator(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                setupColorAnimator(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.mArgbEvaluator == null) {
                    this.mArgbEvaluator = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.mArgbEvaluator);
            }
        }
    }

    private void setupAnimatorsForTarget(String str, Animator animator) {
        animator.setTarget(this.mAnimatedVectorState.mVectorDrawable.getTargetByName(str));
        if (Build.VERSION.SDK_INT < 21) {
            setupColorAnimator(animator);
        }
        if (this.mAnimatedVectorState.mAnimators == null) {
            this.mAnimatedVectorState.mAnimators = new ArrayList<>();
            this.mAnimatedVectorState.mTargetNameMap = new ArrayMap<>();
        }
        this.mAnimatedVectorState.mAnimators.add(animator);
        this.mAnimatedVectorState.mTargetNameMap.put(animator, str);
    }

    public boolean isRunning() {
        if (this.mDelegateDrawable != null) {
            return ((AnimatedVectorDrawable) this.mDelegateDrawable).isRunning();
        }
        ArrayList<Animator> arrayList = this.mAnimatedVectorState.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isRunning()) {
                return true;
            }
        }
        return false;
    }

    private boolean isStarted() {
        ArrayList<Animator> arrayList = this.mAnimatedVectorState.mAnimators;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        if (this.mDelegateDrawable != null) {
            ((AnimatedVectorDrawable) this.mDelegateDrawable).start();
        } else if (!isStarted()) {
            ArrayList<Animator> arrayList = this.mAnimatedVectorState.mAnimators;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).start();
            }
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.mDelegateDrawable != null) {
            ((AnimatedVectorDrawable) this.mDelegateDrawable).stop();
            return;
        }
        ArrayList<Animator> arrayList = this.mAnimatedVectorState.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).end();
        }
    }
}