package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p034v4.graphics.drawable.DrawableCompat;
import android.support.p034v4.widget.TextViewCompat;
import android.support.p037v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.futuremind.recyclerviewfastscroll.p038a.C0685b;
import com.futuremind.recyclerviewfastscroll.p038a.C0686c;

public class FastScroller extends LinearLayout {

    /* renamed from: a */
    private final RecyclerViewScrollListener f572a;

    /* renamed from: b */
    private RecyclerView f573b;

    /* renamed from: c */
    private View f574c;

    /* renamed from: d */
    private View f575d;

    /* renamed from: e */
    private TextView f576e;

    /* renamed from: f */
    private int f577f;

    /* renamed from: g */
    private int f578g;

    /* renamed from: h */
    private int f579h;

    /* renamed from: i */
    private int f580i;

    /* renamed from: j */
    private int f581j;

    /* renamed from: k */
    private int f582k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f583l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C0686c f584m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C0683a f585n;

    public FastScroller(Context context) {
        this(context, (AttributeSet) null);
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f572a = new RecyclerViewScrollListener(this);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.fastscroll__fastScroller, R.attr.fastscroll__style, 0);
        try {
            this.f579h = obtainStyledAttributes.getColor(R.styleable.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.f578g = obtainStyledAttributes.getColor(R.styleable.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.f580i = obtainStyledAttributes.getResourceId(R.styleable.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            obtainStyledAttributes.recycle();
            this.f582k = getVisibility();
            setViewProvider(new C0685b());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setViewProvider(C0686c cVar) {
        removeAllViews();
        this.f584m = cVar;
        cVar.mo8324a(this);
        this.f574c = cVar.mo8321b(this);
        this.f575d = cVar.mo8318a((ViewGroup) this);
        this.f576e = cVar.mo8319a();
        addView(this.f574c);
        addView(this.f575d);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f573b = recyclerView;
        if (recyclerView.getAdapter() instanceof C0683a) {
            this.f585n = (C0683a) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.f572a);
        m712e();
        recyclerView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() {
            public void onChildViewAdded(View view, View view2) {
                FastScroller.this.m712e();
            }

            public void onChildViewRemoved(View view, View view2) {
                FastScroller.this.m712e();
            }
        });
    }

    public void setOrientation(int i) {
        this.f581j = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setBubbleColor(int i) {
        this.f579h = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f578g = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.f580i = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m711d();
        this.f577f = this.f584m.mo8320b();
        m710c();
        this.f572a.mo8311a(this.f573b);
    }

    /* renamed from: c */
    private void m710c() {
        if (this.f579h != -1) {
            m704a((View) this.f576e, this.f579h);
        }
        if (this.f578g != -1) {
            m704a(this.f575d, this.f578g);
        }
        if (this.f580i != -1) {
            TextViewCompat.setTextAppearance(this.f576e, this.f580i);
        }
    }

    /* renamed from: a */
    private void m704a(View view, int i) {
        Drawable wrap = DrawableCompat.wrap(view.getBackground());
        if (wrap != null) {
            DrawableCompat.setTint(wrap.mutate(), i);
            C0692b.m757a(view, wrap);
        }
    }

    /* renamed from: d */
    private void m711d() {
        this.f575d.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                FastScroller.this.requestDisallowInterceptTouchEvent(true);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                    if (FastScroller.this.f585n != null && motionEvent.getAction() == 0) {
                        FastScroller.this.f584m.mo8329i();
                    }
                    boolean unused = FastScroller.this.f583l = true;
                    float a = FastScroller.this.m702a(motionEvent);
                    FastScroller.this.setScrollerPosition(a);
                    FastScroller.this.setRecyclerViewPosition(a);
                    return true;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    boolean unused2 = FastScroller.this.f583l = false;
                    if (FastScroller.this.f585n != null) {
                        FastScroller.this.f584m.mo8330j();
                    }
                    return true;
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public float m702a(MotionEvent motionEvent) {
        if (mo8295a()) {
            return (motionEvent.getRawY() - C0692b.m756a(this.f575d)) / ((float) (getHeight() - this.f575d.getHeight()));
        }
        return (motionEvent.getRawX() - C0692b.m758b(this.f575d)) / ((float) (getWidth() - this.f575d.getWidth()));
    }

    public void setVisibility(int i) {
        this.f582k = i;
        m712e();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m712e() {
        if (this.f573b.getAdapter() == null || this.f573b.getAdapter().getItemCount() == 0 || this.f573b.getChildAt(0) == null || m713f() || this.f582k != 0) {
            super.setVisibility(4);
        } else {
            super.setVisibility(0);
        }
    }

    /* renamed from: f */
    private boolean m713f() {
        if (mo8295a()) {
            if (this.f573b.getChildAt(0).getHeight() * this.f573b.getAdapter().getItemCount() <= this.f573b.getHeight()) {
                return true;
            }
            return false;
        } else if (this.f573b.getChildAt(0).getWidth() * this.f573b.getAdapter().getItemCount() <= this.f573b.getWidth()) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        if (this.f573b != null) {
            int itemCount = this.f573b.getAdapter().getItemCount();
            int a = (int) C0692b.m755a(0.0f, (float) (itemCount - 1), (float) ((int) (f * ((float) itemCount))));
            this.f573b.scrollToPosition(a);
            if (this.f585n != null && this.f576e != null) {
                this.f576e.setText(this.f585n.getSectionTitle(a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollerPosition(float f) {
        if (mo8295a()) {
            this.f574c.setY(C0692b.m755a(0.0f, (float) (getHeight() - this.f574c.getHeight()), (((float) (getHeight() - this.f575d.getHeight())) * f) + ((float) this.f577f)));
            this.f575d.setY(C0692b.m755a(0.0f, (float) (getHeight() - this.f575d.getHeight()), f * ((float) (getHeight() - this.f575d.getHeight()))));
            return;
        }
        this.f574c.setX(C0692b.m755a(0.0f, (float) (getWidth() - this.f574c.getWidth()), (((float) (getWidth() - this.f575d.getWidth())) * f) + ((float) this.f577f)));
        this.f575d.setX(C0692b.m755a(0.0f, (float) (getWidth() - this.f575d.getWidth()), f * ((float) (getWidth() - this.f575d.getWidth()))));
    }

    /* renamed from: a */
    public boolean mo8295a() {
        return this.f581j == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo8296b() {
        return this.f575d != null && !this.f583l && this.f573b.getChildCount() > 0;
    }

    /* access modifiers changed from: package-private */
    public C0686c getViewProvider() {
        return this.f584m;
    }
}
