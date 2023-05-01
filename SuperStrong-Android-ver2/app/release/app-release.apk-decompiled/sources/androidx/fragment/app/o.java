package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import com.superstrong.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class o implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.o, androidx.lifecycle.l0, androidx.lifecycle.h, x0.d {
    public static final Object U = new Object();
    public boolean A;
    public boolean B;
    public boolean D;
    public ViewGroup E;
    public View F;
    public boolean G;
    public c I;
    public boolean J;
    public boolean K;
    public String L;
    public androidx.lifecycle.p N;
    public q0 O;
    public androidx.lifecycle.d0 Q;
    public x0.c R;
    public final ArrayList<e> S;
    public final a T;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1568c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<Parcelable> f1569d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1570e;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1572g;

    /* renamed from: h  reason: collision with root package name */
    public o f1573h;

    /* renamed from: j  reason: collision with root package name */
    public int f1575j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1577l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1578m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1579n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1580o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1581p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1582q;

    /* renamed from: r  reason: collision with root package name */
    public int f1583r;
    public a0 s;

    /* renamed from: t  reason: collision with root package name */
    public w<?> f1584t;

    /* renamed from: v  reason: collision with root package name */
    public o f1585v;

    /* renamed from: w  reason: collision with root package name */
    public int f1586w;

    /* renamed from: x  reason: collision with root package name */
    public int f1587x;

    /* renamed from: y  reason: collision with root package name */
    public String f1588y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1589z;

    /* renamed from: b  reason: collision with root package name */
    public int f1567b = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f1571f = UUID.randomUUID().toString();

    /* renamed from: i  reason: collision with root package name */
    public String f1574i = null;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f1576k = null;
    public b0 u = new b0();
    public boolean C = true;
    public boolean H = true;
    public j.c M = j.c.RESUMED;
    public final androidx.lifecycle.s<androidx.lifecycle.o> P = new androidx.lifecycle.s<>();

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
        }

        @Override // androidx.fragment.app.o.e
        public final void a() {
            o oVar = o.this;
            oVar.R.a();
            androidx.lifecycle.a0.b(oVar);
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.c {
        public b() {
        }

        @Override // androidx.activity.result.c
        public final View u(int i6) {
            o oVar = o.this;
            View view = oVar.F;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new IllegalStateException("Fragment " + oVar + " does not have a view");
        }

        @Override // androidx.activity.result.c
        public final boolean y() {
            return o.this.F != null;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1592a;

        /* renamed from: b  reason: collision with root package name */
        public int f1593b;

        /* renamed from: c  reason: collision with root package name */
        public int f1594c;

        /* renamed from: d  reason: collision with root package name */
        public int f1595d;

        /* renamed from: e  reason: collision with root package name */
        public int f1596e;

        /* renamed from: f  reason: collision with root package name */
        public int f1597f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f1598g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1599h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f1600i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f1601j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f1602k;

        /* renamed from: l  reason: collision with root package name */
        public float f1603l;

        /* renamed from: m  reason: collision with root package name */
        public View f1604m;

        public c() {
            Object obj = o.U;
            this.f1600i = obj;
            this.f1601j = obj;
            this.f1602k = obj;
            this.f1603l = 1.0f;
            this.f1604m = null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f1605b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new f[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Bundle bundle) {
            this.f1605b = bundle;
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1605b = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeBundle(this.f1605b);
        }
    }

    public o() {
        new AtomicInteger();
        this.S = new ArrayList<>();
        this.T = new a();
        o();
    }

    public void A() {
        this.D = true;
    }

    public void B() {
        this.D = true;
    }

    public void C() {
        this.D = true;
    }

    public LayoutInflater D(Bundle bundle) {
        w<?> wVar = this.f1584t;
        if (wVar != null) {
            LayoutInflater C = wVar.C();
            C.setFactory2(this.u.f1391f);
            return C;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void E(Bundle bundle) {
    }

    public void F() {
        this.D = true;
    }

    public void G() {
        this.D = true;
    }

    public void H(View view) {
    }

    public void I(Bundle bundle) {
        this.D = true;
    }

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.u.Q();
        boolean z5 = true;
        this.f1582q = true;
        this.O = new q0(this, t());
        View z6 = z(layoutInflater, viewGroup, bundle);
        this.F = z6;
        if (z6 != null) {
            this.O.e();
            this.F.setTag(R.id.view_tree_lifecycle_owner, this.O);
            this.F.setTag(R.id.view_tree_view_model_store_owner, this.O);
            View view = this.F;
            q0 q0Var = this.O;
            l4.f.f(view, "<this>");
            view.setTag(R.id.view_tree_saved_state_registry_owner, q0Var);
            this.P.j(this.O);
            return;
        }
        if (this.O.f1617e == null) {
            z5 = false;
        }
        if (!z5) {
            this.O = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final r K() {
        r f6 = f();
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context L() {
        Context h6 = h();
        if (h6 != null) {
            return h6;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View M() {
        View view = this.F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void N(int i6, int i7, int i8, int i9) {
        if (this.I == null && i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        e().f1593b = i6;
        e().f1594c = i7;
        e().f1595d = i8;
        e().f1596e = i9;
    }

    public final void O(Bundle bundle) {
        boolean O;
        a0 a0Var = this.s;
        if (a0Var != null) {
            if (a0Var == null) {
                O = false;
            } else {
                O = a0Var.O();
            }
            if (O) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1572g = bundle;
    }

    @Override // x0.d
    public final x0.b b() {
        return this.R.f6661b;
    }

    public androidx.activity.result.c c() {
        return new b();
    }

    public final c e() {
        if (this.I == null) {
            this.I = new c();
        }
        return this.I;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final r f() {
        w<?> wVar = this.f1584t;
        if (wVar == null) {
            return null;
        }
        return (r) wVar.f1665c;
    }

    public final a0 g() {
        if (this.f1584t != null) {
            return this.u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context h() {
        w<?> wVar = this.f1584t;
        if (wVar == null) {
            return null;
        }
        return wVar.f1666d;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final int i() {
        j.c cVar = this.M;
        return (cVar == j.c.INITIALIZED || this.f1585v == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f1585v.i());
    }

    @Override // androidx.lifecycle.h
    public final i0.b j() {
        Application application;
        if (this.s != null) {
            if (this.Q == null) {
                Context applicationContext = L().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && a0.J(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + L().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.Q = new androidx.lifecycle.d0(application, this, this.f1572g);
            }
            return this.Q;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.h
    public final u0.a k() {
        Application application;
        Context applicationContext = L().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && a0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + L().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        u0.d dVar = new u0.d();
        LinkedHashMap linkedHashMap = dVar.f6231a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.h0.f1741a, application);
        }
        linkedHashMap.put(androidx.lifecycle.a0.f1708a, this);
        linkedHashMap.put(androidx.lifecycle.a0.f1709b, this);
        Bundle bundle = this.f1572g;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.a0.f1710c, bundle);
        }
        return dVar;
    }

    public final a0 l() {
        a0 a0Var = this.s;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String m(int i6) {
        return L().getResources().getString(i6);
    }

    public final q0 n() {
        q0 q0Var = this.O;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final void o() {
        this.N = new androidx.lifecycle.p(this);
        this.R = new x0.c(this);
        this.Q = null;
        ArrayList<e> arrayList = this.S;
        a aVar = this.T;
        if (!arrayList.contains(aVar)) {
            if (this.f1567b >= 0) {
                aVar.a();
            } else {
                arrayList.add(aVar);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        K().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.D = true;
    }

    public final void p() {
        o();
        this.L = this.f1571f;
        this.f1571f = UUID.randomUUID().toString();
        this.f1577l = false;
        this.f1578m = false;
        this.f1579n = false;
        this.f1580o = false;
        this.f1581p = false;
        this.f1583r = 0;
        this.s = null;
        this.u = new b0();
        this.f1584t = null;
        this.f1586w = 0;
        this.f1587x = 0;
        this.f1588y = null;
        this.f1589z = false;
        this.A = false;
    }

    public final boolean q() {
        return this.f1584t != null && this.f1577l;
    }

    public final boolean r() {
        boolean r5;
        if (!this.f1589z) {
            a0 a0Var = this.s;
            if (a0Var == null) {
                return false;
            }
            o oVar = this.f1585v;
            a0Var.getClass();
            if (oVar == null) {
                r5 = false;
            } else {
                r5 = oVar.r();
            }
            if (!r5) {
                return false;
            }
        }
        return true;
    }

    public final boolean s() {
        return this.f1583r > 0;
    }

    @Override // androidx.lifecycle.l0
    public final androidx.lifecycle.k0 t() {
        if (this.s != null) {
            if (i() != 1) {
                HashMap<String, androidx.lifecycle.k0> hashMap = this.s.L.f1453f;
                androidx.lifecycle.k0 k0Var = hashMap.get(this.f1571f);
                if (k0Var == null) {
                    androidx.lifecycle.k0 k0Var2 = new androidx.lifecycle.k0();
                    hashMap.put(this.f1571f, k0Var2);
                    return k0Var2;
                }
                return k0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1571f);
        if (this.f1586w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1586w));
        }
        if (this.f1588y != null) {
            sb.append(" tag=");
            sb.append(this.f1588y);
        }
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    public void u() {
        this.D = true;
    }

    @Override // androidx.lifecycle.o
    public final androidx.lifecycle.p v() {
        return this.N;
    }

    @Deprecated
    public final void w(int i6, int i7, Intent intent) {
        if (a0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i7 + " data: " + intent);
        }
    }

    public void x(Context context) {
        Activity activity;
        this.D = true;
        w<?> wVar = this.f1584t;
        if (wVar == null) {
            activity = null;
        } else {
            activity = wVar.f1665c;
        }
        if (activity != null) {
            this.D = true;
        }
    }

    public void y(Bundle bundle) {
        boolean z5;
        Parcelable parcelable;
        this.D = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.u.W(parcelable);
            b0 b0Var = this.u;
            b0Var.E = false;
            b0Var.F = false;
            b0Var.L.f1456i = false;
            b0Var.u(1);
        }
        b0 b0Var2 = this.u;
        if (b0Var2.s >= 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            b0Var2.E = false;
            b0Var2.F = false;
            b0Var2.L.f1456i = false;
            b0Var2.u(1);
        }
    }

    public View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }
}
