package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.x0;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class b extends h.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f379c;

    /* renamed from: d  reason: collision with root package name */
    public final int f380d;

    /* renamed from: e  reason: collision with root package name */
    public final int f381e;

    /* renamed from: f  reason: collision with root package name */
    public final int f382f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f383g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f384h;

    /* renamed from: p  reason: collision with root package name */
    public View f392p;

    /* renamed from: q  reason: collision with root package name */
    public View f393q;

    /* renamed from: r  reason: collision with root package name */
    public int f394r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f395t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f396v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f398x;

    /* renamed from: y  reason: collision with root package name */
    public j.a f399y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTreeObserver f400z;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f385i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f386j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final a f387k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View$OnAttachStateChangeListenerC0004b f388l = new View$OnAttachStateChangeListenerC0004b();

    /* renamed from: m  reason: collision with root package name */
    public final c f389m = new c();

    /* renamed from: n  reason: collision with root package name */
    public int f390n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f391o = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f397w = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b bVar = b.this;
            if (bVar.b()) {
                ArrayList arrayList = bVar.f386j;
                if (arrayList.size() > 0 && !((d) arrayList.get(0)).f404a.f976z) {
                    View view = bVar.f393q;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((d) it.next()).f404a.d();
                        }
                        return;
                    }
                    bVar.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0004b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0004b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            b bVar = b.this;
            ViewTreeObserver viewTreeObserver = bVar.f400z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    bVar.f400z = view.getViewTreeObserver();
                }
                bVar.f400z.removeGlobalOnLayoutListener(bVar.f387k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements w0 {
        public c() {
        }

        @Override // androidx.appcompat.widget.w0
        public final void a(f fVar, MenuItem menuItem) {
            b.this.f384h.removeCallbacksAndMessages(fVar);
        }

        @Override // androidx.appcompat.widget.w0
        public final void e(f fVar, h hVar) {
            b bVar = b.this;
            bVar.f384h.removeCallbacksAndMessages(null);
            ArrayList arrayList = bVar.f386j;
            int size = arrayList.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    i6 = -1;
                    break;
                } else if (fVar == ((d) arrayList.get(i6)).f405b) {
                    break;
                } else {
                    i6++;
                }
            }
            if (i6 == -1) {
                return;
            }
            int i7 = i6 + 1;
            bVar.f384h.postAtTime(new androidx.appcompat.view.menu.c(this, i7 < arrayList.size() ? (d) arrayList.get(i7) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final x0 f404a;

        /* renamed from: b  reason: collision with root package name */
        public final f f405b;

        /* renamed from: c  reason: collision with root package name */
        public final int f406c;

        public d(x0 x0Var, f fVar, int i6) {
            this.f404a = x0Var;
            this.f405b = fVar;
            this.f406c = i6;
        }
    }

    public b(Context context, View view, int i6, int i7, boolean z5) {
        this.f379c = context;
        this.f392p = view;
        this.f381e = i6;
        this.f382f = i7;
        this.f383g = z5;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        this.f394r = g0.e.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f380d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f384h = new Handler();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z5) {
        int i6;
        ArrayList arrayList = this.f386j;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (fVar == ((d) arrayList.get(i7)).f405b) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i8 = i7 + 1;
        if (i8 < arrayList.size()) {
            ((d) arrayList.get(i8)).f405b.c(false);
        }
        d dVar = (d) arrayList.remove(i7);
        dVar.f405b.r(this);
        boolean z6 = this.B;
        x0 x0Var = dVar.f404a;
        if (z6) {
            x0.a.b(x0Var.A, null);
            x0Var.A.setAnimationStyle(0);
        }
        x0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i6 = ((d) arrayList.get(size2 - 1)).f406c;
        } else {
            View view = this.f392p;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.e.d(view) == 1) {
                i6 = 0;
            } else {
                i6 = 1;
            }
        }
        this.f394r = i6;
        if (size2 == 0) {
            dismiss();
            j.a aVar = this.f399y;
            if (aVar != null) {
                aVar.a(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f400z;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f400z.removeGlobalOnLayoutListener(this.f387k);
                }
                this.f400z = null;
            }
            this.f393q.removeOnAttachStateChangeListener(this.f388l);
            this.A.onDismiss();
        } else if (z5) {
            ((d) arrayList.get(0)).f405b.c(false);
        }
    }

    @Override // h.f
    public final boolean b() {
        ArrayList arrayList = this.f386j;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).f404a.b();
    }

    @Override // h.f
    public final void d() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.f385i;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((f) it.next());
        }
        arrayList.clear();
        View view = this.f392p;
        this.f393q = view;
        if (view != null) {
            boolean z5 = this.f400z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f400z = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f387k);
            }
            this.f393q.addOnAttachStateChangeListener(this.f388l);
        }
    }

    @Override // h.f
    public final void dismiss() {
        ArrayList arrayList = this.f386j;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.f404a.b()) {
                dVar.f404a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
    }

    @Override // h.f
    public final q0 g() {
        ArrayList arrayList = this.f386j;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) arrayList.get(arrayList.size() - 1)).f404a.f956d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean h(m mVar) {
        Iterator it = this.f386j.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (mVar == dVar.f405b) {
                dVar.f404a.f956d.requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            n(mVar);
            j.a aVar = this.f399y;
            if (aVar != null) {
                aVar.b(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(boolean z5) {
        Iterator it = this.f386j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).f404a.f956d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
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
        this.f399y = aVar;
    }

    @Override // h.d
    public final void n(f fVar) {
        fVar.b(this, this.f379c);
        if (b()) {
            x(fVar);
        } else {
            this.f385i.add(fVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.f386j;
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i6);
            if (!dVar.f404a.b()) {
                break;
            }
            i6++;
        }
        if (dVar != null) {
            dVar.f405b.c(false);
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
        if (this.f392p != view) {
            this.f392p = view;
            int i6 = this.f390n;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            this.f391o = Gravity.getAbsoluteGravity(i6, g0.e.d(view));
        }
    }

    @Override // h.d
    public final void q(boolean z5) {
        this.f397w = z5;
    }

    @Override // h.d
    public final void r(int i6) {
        if (this.f390n != i6) {
            this.f390n = i6;
            View view = this.f392p;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            this.f391o = Gravity.getAbsoluteGravity(i6, g0.e.d(view));
        }
    }

    @Override // h.d
    public final void s(int i6) {
        this.s = true;
        this.u = i6;
    }

    @Override // h.d
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // h.d
    public final void u(boolean z5) {
        this.f398x = z5;
    }

    @Override // h.d
    public final void v(int i6) {
        this.f395t = true;
        this.f396v = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(androidx.appcompat.view.menu.f r19) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.x(androidx.appcompat.view.menu.f):void");
    }
}
