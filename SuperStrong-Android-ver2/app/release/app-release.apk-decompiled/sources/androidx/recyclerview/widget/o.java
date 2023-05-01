package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class o extends RecyclerView.w {

    /* renamed from: k  reason: collision with root package name */
    public PointF f2156k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f2157l;

    /* renamed from: n  reason: collision with root package name */
    public float f2159n;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f2154i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f2155j = new DecelerateInterpolator();

    /* renamed from: m  reason: collision with root package name */
    public boolean f2158m = false;

    /* renamed from: o  reason: collision with root package name */
    public int f2160o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f2161p = 0;

    public o(Context context) {
        this.f2157l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i6, int i7, int i8, int i9, int i10) {
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return i9 - i7;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i11 = i8 - i6;
            if (i11 > 0) {
                return i11;
            }
            int i12 = i9 - i7;
            if (i12 < 0) {
                return i12;
            }
            return 0;
        }
        return i8 - i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w
    public void c(View view, RecyclerView.w.a aVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        PointF pointF = this.f2156k;
        int i10 = -1;
        int i11 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i9 > 0) {
                i6 = 1;
            } else {
                i6 = -1;
            }
        } else {
            i6 = 0;
        }
        RecyclerView.l lVar = this.f1946c;
        if (lVar != null && lVar.d()) {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i7 = e((view.getLeft() - RecyclerView.l.B(view)) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin, RecyclerView.l.I(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) mVar).rightMargin, lVar.D(), lVar.f1916n - lVar.E(), i6);
        } else {
            i7 = 0;
        }
        PointF pointF2 = this.f2156k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i8 > 0) {
                i10 = 1;
            }
        } else {
            i10 = 0;
        }
        RecyclerView.l lVar2 = this.f1946c;
        if (lVar2 != null && lVar2.e()) {
            RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
            i11 = e((view.getTop() - RecyclerView.l.K(view)) - ((ViewGroup.MarginLayoutParams) mVar2).topMargin, RecyclerView.l.u(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) mVar2).bottomMargin, lVar2.F(), lVar2.f1917o - lVar2.C(), i10);
        }
        int ceil = (int) Math.ceil(g((int) Math.sqrt((i11 * i11) + (i7 * i7))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2155j;
            aVar.f1952a = -i7;
            aVar.f1953b = -i11;
            aVar.f1954c = ceil;
            aVar.f1956e = decelerateInterpolator;
            aVar.f1957f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i6) {
        float abs = Math.abs(i6);
        if (!this.f2158m) {
            this.f2159n = f(this.f2157l);
            this.f2158m = true;
        }
        return (int) Math.ceil(abs * this.f2159n);
    }
}
