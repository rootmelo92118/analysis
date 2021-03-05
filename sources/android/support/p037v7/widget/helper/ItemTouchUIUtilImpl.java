package android.support.p037v7.widget.helper;

import android.graphics.Canvas;
import android.support.p034v4.view.ViewCompat;
import android.support.p037v7.recyclerview.C0513R;
import android.support.p037v7.widget.RecyclerView;
import android.view.View;

/* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl */
class ItemTouchUIUtilImpl {

    /* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl$Lollipop */
    static class Lollipop extends Honeycomb {
        Lollipop() {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (z && view.getTag(C0513R.C0514id.item_touch_helper_previous_elevation) == null) {
                Float valueOf = Float.valueOf(ViewCompat.getElevation(view));
                ViewCompat.setElevation(view, findMaxElevation(recyclerView, view) + 1.0f);
                view.setTag(C0513R.C0514id.item_touch_helper_previous_elevation, valueOf);
            }
            super.onDraw(canvas, recyclerView, view, f, f2, i, z);
        }

        private float findMaxElevation(RecyclerView recyclerView, View view) {
            int childCount = recyclerView.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    float elevation = ViewCompat.getElevation(childAt);
                    if (elevation > f) {
                        f = elevation;
                    }
                }
            }
            return f;
        }

        public void clearView(View view) {
            Object tag = view.getTag(C0513R.C0514id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                ViewCompat.setElevation(view, ((Float) tag).floatValue());
            }
            view.setTag(C0513R.C0514id.item_touch_helper_previous_elevation, (Object) null);
            super.clearView(view);
        }
    }

    ItemTouchUIUtilImpl() {
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl$Honeycomb */
    static class Honeycomb implements ItemTouchUIUtil {
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        }

        public void onSelected(View view) {
        }

        Honeycomb() {
        }

        public void clearView(View view) {
            ViewCompat.setTranslationX(view, 0.0f);
            ViewCompat.setTranslationY(view, 0.0f);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            ViewCompat.setTranslationX(view, f);
            ViewCompat.setTranslationY(view, f2);
        }
    }

    /* renamed from: android.support.v7.widget.helper.ItemTouchUIUtilImpl$Gingerbread */
    static class Gingerbread implements ItemTouchUIUtil {
        Gingerbread() {
        }

        private void draw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2) {
            canvas.save();
            canvas.translate(f, f2);
            recyclerView.drawChild(canvas, view, 0);
            canvas.restore();
        }

        public void clearView(View view) {
            view.setVisibility(0);
        }

        public void onSelected(View view) {
            view.setVisibility(4);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (i != 2) {
                draw(canvas, recyclerView, view, f, f2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
            if (i == 2) {
                draw(canvas, recyclerView, view, f, f2);
            }
        }
    }
}
