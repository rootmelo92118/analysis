package com.futuremind.recyclerviewfastscroll;

import android.support.p037v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    List<C0682a> f588a = new ArrayList();

    /* renamed from: b */
    int f589b = 0;

    /* renamed from: c */
    private final FastScroller f590c;

    /* renamed from: com.futuremind.recyclerviewfastscroll.RecyclerViewScrollListener$a */
    public interface C0682a {
        /* renamed from: a */
        void mo8312a(float f);
    }

    public RecyclerViewScrollListener(FastScroller fastScroller) {
        this.f590c = fastScroller;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.f589b != 0) {
            this.f590c.getViewProvider().mo8332l();
        } else if (i != 0 && this.f589b == 0) {
            this.f590c.getViewProvider().mo8331k();
        }
        this.f589b = i;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (this.f590c.mo8296b()) {
            mo8311a(recyclerView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8311a(RecyclerView recyclerView) {
        float f;
        if (this.f590c.mo8295a()) {
            f = ((float) recyclerView.computeVerticalScrollOffset()) / ((float) (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollExtent()));
        } else {
            f = ((float) recyclerView.computeHorizontalScrollOffset()) / ((float) (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent()));
        }
        this.f590c.setScrollerPosition(f);
        mo8310a(f);
    }

    /* renamed from: a */
    public void mo8310a(float f) {
        for (C0682a a : this.f588a) {
            a.mo8312a(f);
        }
    }
}
