package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.a0;
import androidx.lifecycle.j;
import java.io.PrintWriter;
import x0.b;
/* loaded from: classes.dex */
public class r extends ComponentActivity {

    /* renamed from: t  reason: collision with root package name */
    public boolean f1620t;
    public boolean u;

    /* renamed from: r  reason: collision with root package name */
    public final u f1619r = new u(new a());
    public final androidx.lifecycle.p s = new androidx.lifecycle.p(this);

    /* renamed from: v  reason: collision with root package name */
    public boolean f1621v = true;

    /* loaded from: classes.dex */
    public class a extends w<r> implements w.b, w.c, v.l, v.m, androidx.lifecycle.l0, androidx.activity.i, androidx.activity.result.f, x0.d, e0, f0.n {
        public a() {
            super(r.this);
        }

        @Override // androidx.fragment.app.w
        public final void A(PrintWriter printWriter, String[] strArr) {
            r.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.w
        public final r B() {
            return r.this;
        }

        @Override // androidx.fragment.app.w
        public final LayoutInflater C() {
            r rVar = r.this;
            return rVar.getLayoutInflater().cloneInContext(rVar);
        }

        @Override // androidx.fragment.app.w
        public final void D() {
            r.this.invalidateOptionsMenu();
        }

        @Override // androidx.activity.i
        public final OnBackPressedDispatcher a() {
            return r.this.f239i;
        }

        @Override // x0.d
        public final x0.b b() {
            return r.this.f236f.f6661b;
        }

        @Override // f0.n
        public final void c(a0.c cVar) {
            r.this.c(cVar);
        }

        @Override // androidx.fragment.app.e0
        public final void e() {
            r.this.getClass();
        }

        @Override // w.c
        public final void f(q qVar) {
            r.this.f(qVar);
        }

        @Override // w.c
        public final void h(q qVar) {
            r.this.h(qVar);
        }

        @Override // w.b
        public final void i(z zVar) {
            r.this.i(zVar);
        }

        @Override // f0.n
        public final void l(a0.c cVar) {
            r.this.l(cVar);
        }

        @Override // v.m
        public final void m(z zVar) {
            r.this.m(zVar);
        }

        @Override // v.l
        public final void n(androidx.activity.g gVar) {
            r.this.n(gVar);
        }

        @Override // w.b
        public final void o(z zVar) {
            r.this.o(zVar);
        }

        @Override // androidx.activity.result.f
        public final androidx.activity.result.e q() {
            return r.this.f240j;
        }

        @Override // v.l
        public final void r(androidx.activity.g gVar) {
            r.this.r(gVar);
        }

        @Override // v.m
        public final void s(z zVar) {
            r.this.s(zVar);
        }

        @Override // androidx.lifecycle.l0
        public final androidx.lifecycle.k0 t() {
            return r.this.t();
        }

        @Override // androidx.activity.result.c
        public final View u(int i6) {
            return r.this.findViewById(i6);
        }

        @Override // androidx.lifecycle.o
        public final androidx.lifecycle.p v() {
            return r.this.s;
        }

        @Override // androidx.activity.result.c
        public final boolean y() {
            Window window = r.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    public r() {
        this.f236f.f6661b.c("android:support:lifecycle", new b.InterfaceC0100b() { // from class: androidx.fragment.app.p
            @Override // x0.b.InterfaceC0100b
            public final Bundle a() {
                r rVar;
                do {
                    rVar = r.this;
                } while (r.A(rVar.z()));
                rVar.s.f(j.b.ON_STOP);
                return new Bundle();
            }
        });
        i(new z(2, this));
        this.f243m.add(new q(0, this));
        x(new androidx.activity.d(this, 1));
    }

    public static boolean A(a0 a0Var) {
        r B;
        boolean z5 = false;
        for (o oVar : a0Var.f1388c.g()) {
            if (oVar != null) {
                w<?> wVar = oVar.f1584t;
                if (wVar == null) {
                    B = null;
                } else {
                    B = wVar.B();
                }
                if (B != null) {
                    z5 |= A(oVar.g());
                }
                q0 q0Var = oVar.O;
                j.c cVar = j.c.STARTED;
                j.c cVar2 = j.c.CREATED;
                if (q0Var != null) {
                    q0Var.e();
                    if (q0Var.f1617e.f1760b.a(cVar)) {
                        androidx.lifecycle.p pVar = oVar.O.f1617e;
                        pVar.e("setCurrentState");
                        pVar.g(cVar2);
                        z5 = true;
                    }
                }
                if (oVar.N.f1760b.a(cVar)) {
                    androidx.lifecycle.p pVar2 = oVar.N;
                    pVar2.e("setCurrentState");
                    pVar2.g(cVar2);
                    z5 = true;
                }
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        r0 = true;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L6c
            int r2 = r9.length
            if (r2 <= 0) goto L6c
            r2 = r9[r0]
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = -1
            switch(r3) {
                case -645125871: goto L44;
                case 100470631: goto L39;
                case 472614934: goto L2e;
                case 1159329357: goto L23;
                case 1455016274: goto L18;
                default: goto L17;
            }
        L17:
            goto L4e
        L18:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
            goto L4e
        L21:
            r4 = 4
            goto L4e
        L23:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L4e
        L2c:
            r4 = 3
            goto L4e
        L2e:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L4e
        L37:
            r4 = 2
            goto L4e
        L39:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
            goto L4e
        L42:
            r4 = r1
            goto L4e
        L44:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
            goto L4e
        L4d:
            r4 = r0
        L4e:
            switch(r4) {
                case 0: goto L65;
                case 1: goto L60;
                case 2: goto L60;
                case 3: goto L59;
                case 4: goto L52;
                default: goto L51;
            }
        L51:
            goto L6c
        L52:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L6c
            goto L6b
        L59:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L6c
            goto L6b
        L60:
            boolean r0 = b0.a.a()
            goto L6c
        L65:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L6c
        L6b:
            r0 = r1
        L6c:
            r0 = r0 ^ r1
            if (r0 != 0) goto L70
            return
        L70:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.f1620t
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.u
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.f1621v
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto Lcc
            v0.a r1 = new v0.a
            androidx.lifecycle.k0 r2 = r5.t()
            r1.<init>(r5, r2)
            r1.A(r0, r8)
        Lcc:
            androidx.fragment.app.u r0 = r5.f1619r
            androidx.fragment.app.w<?> r0 = r0.f1648a
            androidx.fragment.app.b0 r0 = r0.f1668f
            r0.v(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.r.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        this.f1619r.a();
        super.onActivityResult(i6, i7, intent);
    }

    @Override // androidx.activity.ComponentActivity, v.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s.f(j.b.ON_CREATE);
        b0 b0Var = this.f1619r.f1648a.f1668f;
        b0Var.E = false;
        b0Var.F = false;
        b0Var.L.f1456i = false;
        b0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1619r.f1648a.f1668f.f1391f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f1619r.f1648a.f1668f.l();
        this.s.f(j.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.f1619r.f1648a.f1668f.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.u = false;
        this.f1619r.f1648a.f1668f.u(5);
        this.s.f(j.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.s.f(j.b.ON_RESUME);
        b0 b0Var = this.f1619r.f1648a.f1668f;
        b0Var.E = false;
        b0Var.F = false;
        b0Var.L.f1456i = false;
        b0Var.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.f1619r.a();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        u uVar = this.f1619r;
        uVar.a();
        super.onResume();
        this.u = true;
        uVar.f1648a.f1668f.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        u uVar = this.f1619r;
        uVar.a();
        super.onStart();
        this.f1621v = false;
        boolean z5 = this.f1620t;
        w<?> wVar = uVar.f1648a;
        if (!z5) {
            this.f1620t = true;
            b0 b0Var = wVar.f1668f;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(4);
        }
        wVar.f1668f.z(true);
        this.s.f(j.b.ON_START);
        b0 b0Var2 = wVar.f1668f;
        b0Var2.E = false;
        b0Var2.F = false;
        b0Var2.L.f1456i = false;
        b0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1619r.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f1621v = true;
        do {
        } while (A(z()));
        b0 b0Var = this.f1619r.f1648a.f1668f;
        b0Var.F = true;
        b0Var.L.f1456i = true;
        b0Var.u(4);
        this.s.f(j.b.ON_STOP);
    }

    public final b0 z() {
        return this.f1619r.f1648a.f1668f;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1619r.f1648a.f1668f.f1391f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
