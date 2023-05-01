package i2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import f0.g0;
import f0.k;
import f0.r0;
import f0.x0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class d extends e<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f4611c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f4612d;

    /* renamed from: e  reason: collision with root package name */
    public int f4613e;

    /* renamed from: f  reason: collision with root package name */
    public int f4614f;

    public d() {
        this.f4611c = new Rect();
        this.f4612d = new Rect();
        this.f4613e = 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4611c = new Rect();
        this.f4612d = new Rect();
        this.f4613e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
        AppBarLayout u;
        int i9;
        x0 lastWindowInsets;
        int i10 = view.getLayoutParams().height;
        if ((i10 == -1 || i10 == -2) && (u = u(coordinatorLayout.e(view))) != null) {
            int size = View.MeasureSpec.getSize(i8);
            if (size > 0) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.d.b(u) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int w5 = w(u) + size;
            int measuredHeight = u.getMeasuredHeight();
            if (this instanceof SearchBar.ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                w5 -= measuredHeight;
            }
            if (i10 == -1) {
                i9 = 1073741824;
            } else {
                i9 = Integer.MIN_VALUE;
            }
            coordinatorLayout.r(view, i6, i7, View.MeasureSpec.makeMeasureSpec(w5, i9));
            return true;
        }
        return false;
    }

    @Override // i2.e
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i6) {
        AppBarLayout u = u(coordinatorLayout.e(view));
        int i7 = 0;
        if (u != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = u.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int height = coordinatorLayout.getHeight();
            Rect rect = this.f4611c;
            rect.set(paddingLeft, bottom, width, ((u.getBottom() + height) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            x0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.d.b(coordinatorLayout) && !g0.d.b(view)) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f4612d;
            int i8 = fVar.f1231c;
            if (i8 == 0) {
                i8 = 8388659;
            }
            k.b(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i6);
            if (this.f4614f != 0) {
                float v2 = v(u);
                int i9 = this.f4614f;
                i7 = c.a.j((int) (v2 * i9), 0, i9);
            }
            view.layout(rect2.left, rect2.top - i7, rect2.right, rect2.bottom - i7);
            i7 = rect2.top - u.getBottom();
        } else {
            coordinatorLayout.q(view, i6);
        }
        this.f4613e = i7;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}
