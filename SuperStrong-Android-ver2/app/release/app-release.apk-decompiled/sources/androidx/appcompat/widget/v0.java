package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import f0.g0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class v0 implements h.f {
    public static final Method B;
    public static final Method C;
    public final q A;

    /* renamed from: b  reason: collision with root package name */
    public final Context f954b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f955c;

    /* renamed from: d  reason: collision with root package name */
    public q0 f956d;

    /* renamed from: g  reason: collision with root package name */
    public int f959g;

    /* renamed from: h  reason: collision with root package name */
    public int f960h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f962j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f963k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f964l;

    /* renamed from: o  reason: collision with root package name */
    public d f967o;

    /* renamed from: p  reason: collision with root package name */
    public View f968p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemClickListener f969q;

    /* renamed from: r  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f970r;

    /* renamed from: w  reason: collision with root package name */
    public final Handler f973w;

    /* renamed from: y  reason: collision with root package name */
    public Rect f975y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f976z;

    /* renamed from: e  reason: collision with root package name */
    public final int f957e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f958f = -2;

    /* renamed from: i  reason: collision with root package name */
    public final int f961i = 1002;

    /* renamed from: m  reason: collision with root package name */
    public int f965m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final int f966n = Integer.MAX_VALUE;
    public final g s = new g();

    /* renamed from: t  reason: collision with root package name */
    public final f f971t = new f();
    public final e u = new e();

    /* renamed from: v  reason: collision with root package name */
    public final c f972v = new c();

    /* renamed from: x  reason: collision with root package name */
    public final Rect f974x = new Rect();

    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i6, boolean z5) {
            return popupWindow.getMaxAvailableHeight(view, i6, z5);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z5) {
            popupWindow.setIsClippedToScreen(z5);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q0 q0Var = v0.this.f956d;
            if (q0Var != null) {
                q0Var.setListSelectionHidden(true);
                q0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            v0 v0Var = v0.this;
            if (v0Var.b()) {
                v0Var.d();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            v0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i6, int i7, int i8) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i6) {
            boolean z5 = true;
            if (i6 == 1) {
                v0 v0Var = v0.this;
                if (v0Var.A.getInputMethodMode() != 2) {
                    z5 = false;
                }
                if (!z5 && v0Var.A.getContentView() != null) {
                    Handler handler = v0Var.f973w;
                    g gVar = v0Var.s;
                    handler.removeCallbacks(gVar);
                    gVar.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            q qVar;
            int action = motionEvent.getAction();
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            v0 v0Var = v0.this;
            if (action == 0 && (qVar = v0Var.A) != null && qVar.isShowing() && x5 >= 0) {
                q qVar2 = v0Var.A;
                if (x5 < qVar2.getWidth() && y5 >= 0 && y5 < qVar2.getHeight()) {
                    v0Var.f973w.postDelayed(v0Var.s, 250L);
                    return false;
                }
            }
            if (action == 1) {
                v0Var.f973w.removeCallbacks(v0Var.s);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v0 v0Var = v0.this;
            q0 q0Var = v0Var.f956d;
            if (q0Var != null) {
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                if (g0.g.b(q0Var) && v0Var.f956d.getCount() > v0Var.f956d.getChildCount() && v0Var.f956d.getChildCount() <= v0Var.f966n) {
                    v0Var.A.setInputMethodMode(2);
                    v0Var.d();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                B = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public v0(Context context, AttributeSet attributeSet, int i6, int i7) {
        this.f954b = context;
        this.f973w = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2680p, i6, i7);
        this.f959g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f960h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f962j = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i6, i7);
        this.A = qVar;
        qVar.setInputMethodMode(1);
    }

    @Override // h.f
    public final boolean b() {
        return this.A.isShowing();
    }

    public final int c() {
        return this.f959g;
    }

    @Override // h.f
    public final void d() {
        int i6;
        boolean z5;
        int makeMeasureSpec;
        int i7;
        int i8;
        boolean z6;
        q0 q0Var;
        int i9;
        int i10;
        q0 q0Var2 = this.f956d;
        q qVar = this.A;
        Context context = this.f954b;
        if (q0Var2 == null) {
            q0 q5 = q(context, !this.f976z);
            this.f956d = q5;
            q5.setAdapter(this.f955c);
            this.f956d.setOnItemClickListener(this.f969q);
            this.f956d.setFocusable(true);
            this.f956d.setFocusableInTouchMode(true);
            this.f956d.setOnItemSelectedListener(new u0(this));
            this.f956d.setOnScrollListener(this.u);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f970r;
            if (onItemSelectedListener != null) {
                this.f956d.setOnItemSelectedListener(onItemSelectedListener);
            }
            qVar.setContentView(this.f956d);
        } else {
            ViewGroup viewGroup = (ViewGroup) qVar.getContentView();
        }
        Drawable background = qVar.getBackground();
        int i11 = 0;
        Rect rect = this.f974x;
        if (background != null) {
            background.getPadding(rect);
            int i12 = rect.top;
            i6 = rect.bottom + i12;
            if (!this.f962j) {
                this.f960h = -i12;
            }
        } else {
            rect.setEmpty();
            i6 = 0;
        }
        if (qVar.getInputMethodMode() == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        int a6 = a.a(qVar, this.f968p, this.f960h, z5);
        int i13 = this.f957e;
        if (i13 == -1) {
            i8 = a6 + i6;
        } else {
            int i14 = this.f958f;
            if (i14 != -2) {
                if (i14 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a7 = this.f956d.a(makeMeasureSpec, a6 + 0);
            if (a7 > 0) {
                i7 = this.f956d.getPaddingBottom() + this.f956d.getPaddingTop() + i6 + 0;
            } else {
                i7 = 0;
            }
            i8 = a7 + i7;
        }
        if (qVar.getInputMethodMode() == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        j0.j.d(qVar, this.f961i);
        if (qVar.isShowing()) {
            View view = this.f968p;
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            if (!g0.g.b(view)) {
                return;
            }
            int i15 = this.f958f;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = this.f968p.getWidth();
            }
            if (i13 == -1) {
                if (z6) {
                    i13 = i8;
                } else {
                    i13 = -1;
                }
                int i16 = this.f958f;
                if (z6) {
                    if (i16 == -1) {
                        i10 = -1;
                    } else {
                        i10 = 0;
                    }
                    qVar.setWidth(i10);
                    qVar.setHeight(0);
                } else {
                    if (i16 == -1) {
                        i11 = -1;
                    }
                    qVar.setWidth(i11);
                    qVar.setHeight(-1);
                }
            } else if (i13 == -2) {
                i13 = i8;
            }
            qVar.setOutsideTouchable(true);
            View view2 = this.f968p;
            int i17 = this.f959g;
            int i18 = this.f960h;
            if (i15 < 0) {
                i15 = -1;
            }
            if (i13 < 0) {
                i9 = -1;
            } else {
                i9 = i13;
            }
            qVar.update(view2, i17, i18, i15, i9);
            return;
        }
        int i19 = this.f958f;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = this.f968p.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = i8;
        }
        qVar.setWidth(i19);
        qVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = B;
            if (method != null) {
                try {
                    method.invoke(qVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(qVar, true);
        }
        qVar.setOutsideTouchable(true);
        qVar.setTouchInterceptor(this.f971t);
        if (this.f964l) {
            j0.j.c(qVar, this.f963k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = C;
            if (method2 != null) {
                try {
                    method2.invoke(qVar, this.f975y);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            b.a(qVar, this.f975y);
        }
        j0.i.a(qVar, this.f968p, this.f959g, this.f960h, this.f965m);
        this.f956d.setSelection(-1);
        if ((!this.f976z || this.f956d.isInTouchMode()) && (q0Var = this.f956d) != null) {
            q0Var.setListSelectionHidden(true);
            q0Var.requestLayout();
        }
        if (!this.f976z) {
            this.f973w.post(this.f972v);
        }
    }

    @Override // h.f
    public final void dismiss() {
        q qVar = this.A;
        qVar.dismiss();
        qVar.setContentView(null);
        this.f956d = null;
        this.f973w.removeCallbacks(this.s);
    }

    public final Drawable f() {
        return this.A.getBackground();
    }

    @Override // h.f
    public final q0 g() {
        return this.f956d;
    }

    public final void i(Drawable drawable) {
        this.A.setBackgroundDrawable(drawable);
    }

    public final void j(int i6) {
        this.f960h = i6;
        this.f962j = true;
    }

    public final void l(int i6) {
        this.f959g = i6;
    }

    public final int n() {
        if (this.f962j) {
            return this.f960h;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f967o;
        if (dVar == null) {
            this.f967o = new d();
        } else {
            ListAdapter listAdapter2 = this.f955c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f955c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f967o);
        }
        q0 q0Var = this.f956d;
        if (q0Var != null) {
            q0Var.setAdapter(this.f955c);
        }
    }

    public q0 q(Context context, boolean z5) {
        return new q0(context, z5);
    }

    public final void r(int i6) {
        Drawable background = this.A.getBackground();
        if (background != null) {
            Rect rect = this.f974x;
            background.getPadding(rect);
            this.f958f = rect.left + rect.right + i6;
            return;
        }
        this.f958f = i6;
    }
}
