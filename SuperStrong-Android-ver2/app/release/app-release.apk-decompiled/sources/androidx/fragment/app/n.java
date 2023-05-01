package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class n extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler V;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1554e0;

    /* renamed from: g0  reason: collision with root package name */
    public Dialog f1556g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1557h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1558i0;
    public final a W = new a();
    public final b X = new b();
    public final c Y = new c();
    public int Z = 0;

    /* renamed from: a0  reason: collision with root package name */
    public int f1550a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1551b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1552c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public int f1553d0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public final d f1555f0 = new d();

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1559j0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            n nVar = n.this;
            nVar.Y.onDismiss(nVar.f1556g0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.f1556g0;
            if (dialog != null) {
                nVar.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            n nVar = n.this;
            Dialog dialog = nVar.f1556g0;
            if (dialog != null) {
                nVar.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.t<androidx.lifecycle.o> {
        public d() {
        }

        @Override // androidx.lifecycle.t
        @SuppressLint({"SyntheticAccessor"})
        public final void a(androidx.lifecycle.o oVar) {
            if (oVar != null) {
                n nVar = n.this;
                if (nVar.f1552c0) {
                    View M = nVar.M();
                    if (M.getParent() == null) {
                        if (nVar.f1556g0 != null) {
                            if (a0.J(3)) {
                                Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + nVar.f1556g0);
                            }
                            nVar.f1556g0.setContentView(M);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.activity.result.c {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.c f1564c;

        public e(o.b bVar) {
            this.f1564c = bVar;
        }

        @Override // androidx.activity.result.c
        public final View u(int i6) {
            androidx.activity.result.c cVar = this.f1564c;
            if (cVar.y()) {
                return cVar.u(i6);
            }
            Dialog dialog = n.this.f1556g0;
            if (dialog != null) {
                return dialog.findViewById(i6);
            }
            return null;
        }

        @Override // androidx.activity.result.c
        public final boolean y() {
            if (!this.f1564c.y() && !n.this.f1559j0) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.fragment.app.o
    public final void B() {
        this.D = true;
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            this.f1557h0 = true;
            dialog.setOnDismissListener(null);
            this.f1556g0.dismiss();
            if (!this.f1558i0) {
                onDismiss(this.f1556g0);
            }
            this.f1556g0 = null;
            this.f1559j0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public final void C() {
        this.D = true;
        if (!this.f1558i0) {
            this.f1558i0 = true;
        }
        this.P.i(this.f1555f0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:27:0x004d, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:28:0x0065), top: B:48:0x001a }] */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater D(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.D(r8)
            boolean r0 = r7.f1552c0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f1554e0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f1559j0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f1554e0 = r3     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.Q()     // Catch: java.lang.Throwable -> L6b
            r7.f1556g0 = r4     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1552c0     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L65
            int r5 = r7.Z     // Catch: java.lang.Throwable -> L6b
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L6b
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L6b
        L3e:
            android.content.Context r4 = r7.h()     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L6b
            if (r5 == 0) goto L4d
            android.app.Dialog r5 = r7.f1556g0     // Catch: java.lang.Throwable -> L6b
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L6b
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L6b
        L4d:
            android.app.Dialog r4 = r7.f1556g0     // Catch: java.lang.Throwable -> L6b
            boolean r5 = r7.f1551b0     // Catch: java.lang.Throwable -> L6b
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f1556g0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.n$b r5 = r7.X     // Catch: java.lang.Throwable -> L6b
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L6b
            android.app.Dialog r4 = r7.f1556g0     // Catch: java.lang.Throwable -> L6b
            androidx.fragment.app.n$c r5 = r7.Y     // Catch: java.lang.Throwable -> L6b
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L6b
            r7.f1559j0 = r3     // Catch: java.lang.Throwable -> L6b
            goto L68
        L65:
            r3 = 0
            r7.f1556g0 = r3     // Catch: java.lang.Throwable -> L6b
        L68:
            r7.f1554e0 = r0
            goto L6f
        L6b:
            r8 = move-exception
            r7.f1554e0 = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.a0.J(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.f1556g0
            if (r0 == 0) goto L97
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L97:
            return r8
        L98:
            boolean r0 = androidx.fragment.app.a0.J(r2)
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1552c0
            if (r2 != 0) goto Lb8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            goto Lbf
        Lb8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
        Lbf:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Lc9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.D(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.o
    public void E(Bundle bundle) {
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i6 = this.Z;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i7 = this.f1550a0;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z5 = this.f1551b0;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z6 = this.f1552c0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i8 = this.f1553d0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // androidx.fragment.app.o
    public void F() {
        this.D = true;
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            this.f1557h0 = false;
            dialog.show();
            View decorView = this.f1556g0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.o
    public void G() {
        this.D = true;
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.o
    public final void I(Bundle bundle) {
        Bundle bundle2;
        this.D = true;
        if (this.f1556g0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1556g0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public final void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.J(layoutInflater, viewGroup, bundle);
        if (this.F != null || this.f1556g0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1556g0.onRestoreInstanceState(bundle2);
    }

    public final void P(boolean z5, boolean z6) {
        if (this.f1558i0) {
            return;
        }
        this.f1558i0 = true;
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1556g0.dismiss();
            if (!z6) {
                if (Looper.myLooper() == this.V.getLooper()) {
                    onDismiss(this.f1556g0);
                } else {
                    this.V.post(this.W);
                }
            }
        }
        this.f1557h0 = true;
        if (this.f1553d0 >= 0) {
            a0 l5 = l();
            int i6 = this.f1553d0;
            if (i6 >= 0) {
                l5.x(new a0.n(i6), z5);
                this.f1553d0 = -1;
                return;
            }
            throw new IllegalArgumentException(androidx.activity.j.a("Bad id: ", i6));
        }
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(l());
        aVar.f1513o = true;
        aVar.h(this);
        if (z5) {
            aVar.d(true);
        } else {
            aVar.d(false);
        }
    }

    public Dialog Q() {
        if (a0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.e(L(), this.f1550a0);
    }

    public final Dialog R() {
        Dialog dialog = this.f1556g0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.o
    public final androidx.activity.result.c c() {
        return new e(new o.b());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1557h0) {
            return;
        }
        if (a0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        P(true, true);
    }

    @Override // androidx.fragment.app.o
    @Deprecated
    public final void u() {
        this.D = true;
    }

    @Override // androidx.fragment.app.o
    public final void x(Context context) {
        super.x(context);
        this.P.f(this.f1555f0);
        this.f1558i0 = false;
    }

    @Override // androidx.fragment.app.o
    public void y(Bundle bundle) {
        super.y(bundle);
        this.V = new Handler();
        this.f1552c0 = this.f1587x == 0;
        if (bundle != null) {
            this.Z = bundle.getInt("android:style", 0);
            this.f1550a0 = bundle.getInt("android:theme", 0);
            this.f1551b0 = bundle.getBoolean("android:cancelable", true);
            this.f1552c0 = bundle.getBoolean("android:showsDialog", this.f1552c0);
            this.f1553d0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
