package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.q;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.x0;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class l extends h.d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c  reason: collision with root package name */
    public final Context f489c;

    /* renamed from: d  reason: collision with root package name */
    public final f f490d;

    /* renamed from: e  reason: collision with root package name */
    public final e f491e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f492f;

    /* renamed from: g  reason: collision with root package name */
    public final int f493g;

    /* renamed from: h  reason: collision with root package name */
    public final int f494h;

    /* renamed from: i  reason: collision with root package name */
    public final int f495i;

    /* renamed from: j  reason: collision with root package name */
    public final x0 f496j;

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f499m;

    /* renamed from: n  reason: collision with root package name */
    public View f500n;

    /* renamed from: o  reason: collision with root package name */
    public View f501o;

    /* renamed from: p  reason: collision with root package name */
    public j.a f502p;

    /* renamed from: q  reason: collision with root package name */
    public ViewTreeObserver f503q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f504r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public int f505t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f506v;

    /* renamed from: k  reason: collision with root package name */
    public final a f497k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final b f498l = new b();
    public int u = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            if (lVar.b() && !lVar.f496j.f976z) {
                View view = lVar.f501o;
                if (view != null && view.isShown()) {
                    lVar.f496j.d();
                } else {
                    lVar.dismiss();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.f503q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.f503q = view.getViewTreeObserver();
                }
                lVar.f503q.removeGlobalOnLayoutListener(lVar.f497k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(int i6, int i7, Context context, View view, f fVar, boolean z5) {
        this.f489c = context;
        this.f490d = fVar;
        this.f492f = z5;
        this.f491e = new e(fVar, LayoutInflater.from(context), z5, R.layout.abc_popup_menu_item_layout);
        this.f494h = i6;
        this.f495i = i7;
        Resources resources = context.getResources();
        this.f493g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f500n = view;
        this.f496j = new x0(context, i6, i7);
        fVar.b(this, context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z5) {
        if (fVar != this.f490d) {
            return;
        }
        dismiss();
        j.a aVar = this.f502p;
        if (aVar != null) {
            aVar.a(fVar, z5);
        }
    }

    @Override // h.f
    public final boolean b() {
        return !this.f504r && this.f496j.b();
    }

    @Override // h.f
    public final void d() {
        View view;
        boolean z5;
        Rect rect;
        boolean z6 = true;
        if (!b()) {
            if (!this.f504r && (view = this.f500n) != null) {
                this.f501o = view;
                x0 x0Var = this.f496j;
                x0Var.A.setOnDismissListener(this);
                x0Var.f969q = this;
                x0Var.f976z = true;
                q qVar = x0Var.A;
                qVar.setFocusable(true);
                View view2 = this.f501o;
                if (this.f503q == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f503q = viewTreeObserver;
                if (z5) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f497k);
                }
                view2.addOnAttachStateChangeListener(this.f498l);
                x0Var.f968p = view2;
                x0Var.f965m = this.u;
                boolean z7 = this.s;
                Context context = this.f489c;
                e eVar = this.f491e;
                if (!z7) {
                    this.f505t = h.d.o(eVar, context, this.f493g);
                    this.s = true;
                }
                x0Var.r(this.f505t);
                qVar.setInputMethodMode(2);
                Rect rect2 = this.f4374b;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                x0Var.f975y = rect;
                x0Var.d();
                q0 q0Var = x0Var.f956d;
                q0Var.setOnKeyListener(this);
                if (this.f506v) {
                    f fVar = this.f490d;
                    if (fVar.f438m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) q0Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(fVar.f438m);
                        }
                        frameLayout.setEnabled(false);
                        q0Var.addHeaderView(frameLayout, null, false);
                    }
                }
                x0Var.p(eVar);
                x0Var.d();
            } else {
                z6 = false;
            }
        }
        if (z6) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // h.f
    public final void dismiss() {
        if (b()) {
            this.f496j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
    }

    @Override // h.f
    public final q0 g() {
        return this.f496j.f956d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.appcompat.view.menu.m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f489c
            android.view.View r6 = r9.f501o
            boolean r8 = r9.f492f
            int r3 = r9.f494h
            int r4 = r9.f495i
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f502p
            r0.f484i = r2
            h.d r3 = r0.f485j
            if (r3 == 0) goto L23
            r3.l(r2)
        L23:
            boolean r2 = h.d.w(r10)
            r0.f483h = r2
            h.d r3 = r0.f485j
            if (r3 == 0) goto L30
            r3.q(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f499m
            r0.f486k = r2
            r2 = 0
            r9.f499m = r2
            androidx.appcompat.view.menu.f r2 = r9.f490d
            r2.c(r1)
            androidx.appcompat.widget.x0 r2 = r9.f496j
            int r3 = r2.f959g
            int r2 = r2.n()
            int r4 = r9.u
            android.view.View r5 = r9.f500n
            java.util.WeakHashMap<android.view.View, f0.r0> r6 = f0.g0.f3878a
            int r5 = f0.g0.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f500n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f481f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.j$a r0 = r9.f502p
            if (r0 == 0) goto L79
            r0.b(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l.h(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(boolean z5) {
        this.s = false;
        e eVar = this.f491e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(j.a aVar) {
        this.f502p = aVar;
    }

    @Override // h.d
    public final void n(f fVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f504r = true;
        this.f490d.c(true);
        ViewTreeObserver viewTreeObserver = this.f503q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f503q = this.f501o.getViewTreeObserver();
            }
            this.f503q.removeGlobalOnLayoutListener(this.f497k);
            this.f503q = null;
        }
        this.f501o.removeOnAttachStateChangeListener(this.f498l);
        PopupWindow.OnDismissListener onDismissListener = this.f499m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i6 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // h.d
    public final void p(View view) {
        this.f500n = view;
    }

    @Override // h.d
    public final void q(boolean z5) {
        this.f491e.f421d = z5;
    }

    @Override // h.d
    public final void r(int i6) {
        this.u = i6;
    }

    @Override // h.d
    public final void s(int i6) {
        this.f496j.f959g = i6;
    }

    @Override // h.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f499m = onDismissListener;
    }

    @Override // h.d
    public final void u(boolean z5) {
        this.f506v = z5;
    }

    @Override // h.d
    public final void v(int i6) {
        this.f496j.j(i6);
    }
}
