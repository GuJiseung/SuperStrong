package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f476a;

    /* renamed from: b  reason: collision with root package name */
    public final f f477b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f478c;

    /* renamed from: d  reason: collision with root package name */
    public final int f479d;

    /* renamed from: e  reason: collision with root package name */
    public final int f480e;

    /* renamed from: f  reason: collision with root package name */
    public View f481f;

    /* renamed from: g  reason: collision with root package name */
    public int f482g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f483h;

    /* renamed from: i  reason: collision with root package name */
    public j.a f484i;

    /* renamed from: j  reason: collision with root package name */
    public h.d f485j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f486k;

    /* renamed from: l  reason: collision with root package name */
    public final a f487l;

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public i(int i6, int i7, Context context, View view, f fVar, boolean z5) {
        this.f482g = 8388611;
        this.f487l = new a();
        this.f476a = context;
        this.f477b = fVar;
        this.f481f = view;
        this.f478c = z5;
        this.f479d = i6;
        this.f480e = i7;
    }

    public i(Context context, f fVar, View view, boolean z5) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, fVar, z5);
    }

    public final h.d a() {
        boolean z5;
        h.d lVar;
        if (this.f485j == null) {
            Context context = this.f476a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            b.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                lVar = new androidx.appcompat.view.menu.b(this.f476a, this.f481f, this.f479d, this.f480e, this.f478c);
            } else {
                Context context2 = this.f476a;
                f fVar = this.f477b;
                lVar = new l(this.f479d, this.f480e, context2, this.f481f, fVar, this.f478c);
            }
            lVar.n(this.f477b);
            lVar.t(this.f487l);
            lVar.p(this.f481f);
            lVar.l(this.f484i);
            lVar.q(this.f483h);
            lVar.r(this.f482g);
            this.f485j = lVar;
        }
        return this.f485j;
    }

    public final boolean b() {
        h.d dVar = this.f485j;
        return dVar != null && dVar.b();
    }

    public void c() {
        this.f485j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f486k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i6, int i7, boolean z5, boolean z6) {
        h.d a6 = a();
        a6.u(z6);
        if (z5) {
            int i8 = this.f482g;
            View view = this.f481f;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if ((Gravity.getAbsoluteGravity(i8, g0.e.d(view)) & 7) == 5) {
                i6 -= this.f481f.getWidth();
            }
            a6.s(i6);
            a6.v(i7);
            int i9 = (int) ((this.f476a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.f4374b = new Rect(i6 - i9, i7 - i9, i6 + i9, i7 + i9);
        }
        a6.d();
    }
}
