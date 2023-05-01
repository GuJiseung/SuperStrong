package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.i0;
import androidx.fragment.app.o;
import androidx.lifecycle.j;
import com.superstrong.android.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class a0 {
    public androidx.activity.result.d A;
    public androidx.activity.result.d B;
    public ArrayDeque<l> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<o> K;
    public d0 L;
    public final f M;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1387b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f1389d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<o> f1390e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1392g;

    /* renamed from: l  reason: collision with root package name */
    public final y f1397l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0> f1398m;

    /* renamed from: n  reason: collision with root package name */
    public final z f1399n;

    /* renamed from: o  reason: collision with root package name */
    public final q f1400o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.activity.g f1401p;

    /* renamed from: q  reason: collision with root package name */
    public final z f1402q;

    /* renamed from: r  reason: collision with root package name */
    public final c f1403r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public w<?> f1404t;
    public androidx.activity.result.c u;

    /* renamed from: v  reason: collision with root package name */
    public o f1405v;

    /* renamed from: w  reason: collision with root package name */
    public o f1406w;

    /* renamed from: x  reason: collision with root package name */
    public final d f1407x;

    /* renamed from: y  reason: collision with root package name */
    public final e f1408y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.activity.result.d f1409z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f1386a = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final h0 f1388c = new h0(0);

    /* renamed from: f  reason: collision with root package name */
    public final x f1391f = new x(this);

    /* renamed from: h  reason: collision with root package name */
    public final b f1393h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1394i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f1395j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f1396k = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            StringBuilder sb;
            int i6;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((Boolean) arrayList.get(i7)).booleanValue()) {
                    i6 = 0;
                } else {
                    i6 = -1;
                }
                iArr[i7] = i6;
            }
            a0 a0Var = a0.this;
            l pollFirst = a0Var.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No permissions were requested for ");
                sb.append(this);
            } else {
                h0 h0Var = a0Var.f1388c;
                String str = pollFirst.f1418b;
                if (h0Var.d(str) == null) {
                    sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.f {
        public b() {
        }

        @Override // androidx.activity.f
        public final void a() {
            a0 a0Var = a0.this;
            a0Var.z(true);
            if (a0Var.f1393h.f274a) {
                a0Var.R();
            } else {
                a0Var.f1392g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements f0.r {
        public c() {
        }

        @Override // f0.r
        public final boolean a(MenuItem menuItem) {
            return a0.this.p();
        }

        @Override // f0.r
        public final void b(Menu menu) {
            a0.this.q();
        }

        @Override // f0.r
        public final void c(Menu menu, MenuInflater menuInflater) {
            a0.this.k();
        }

        @Override // f0.r
        public final void d(Menu menu) {
            a0.this.t();
        }
    }

    /* loaded from: classes.dex */
    public class d extends v {
        public d() {
        }

        @Override // androidx.fragment.app.v
        public final o a(String str) {
            Context context = a0.this.f1404t.f1666d;
            Object obj = o.U;
            try {
                return v.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e6) {
                throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
            } catch (InstantiationException e7) {
                throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
            } catch (NoSuchMethodException e8) {
                throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
            } catch (InvocationTargetException e9) {
                throw new o.d(b5.b.b("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements y0 {
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0.this.z(true);
        }
    }

    /* loaded from: classes.dex */
    public class g implements e0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f1415b;

        public g(o oVar) {
            this.f1415b = oVar;
        }

        @Override // androidx.fragment.app.e0
        public final void e() {
            this.f1415b.getClass();
        }
    }

    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {
        public h() {
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder sb;
            androidx.activity.result.a aVar2 = aVar;
            a0 a0Var = a0.this;
            l pollFirst = a0Var.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No Activities were started for result for ");
                sb.append(this);
            } else {
                h0 h0Var = a0Var.f1388c;
                String str = pollFirst.f1418b;
                o d6 = h0Var.d(str);
                if (d6 == null) {
                    sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    d6.w(pollFirst.f1419c, aVar2.f283b, aVar2.f284c);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder sb;
            androidx.activity.result.a aVar2 = aVar;
            a0 a0Var = a0.this;
            l pollFirst = a0Var.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No IntentSenders were started for ");
                sb.append(this);
            } else {
                h0 h0Var = a0Var.f1388c;
                String str = pollFirst.f1418b;
                o d6 = h0Var.d(str);
                if (d6 == null) {
                    sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    d6.w(pollFirst.f1419c, aVar2.f283b, aVar2.f284c);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class j extends androidx.activity.result.c {
        @Override // androidx.activity.result.c
        public final Object z(Intent intent, int i6) {
            return new androidx.activity.result.a(intent, i6);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public final String f1418b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1419c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i6) {
                return new l[i6];
            }
        }

        public l(Parcel parcel) {
            this.f1418b = parcel.readString();
            this.f1419c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeString(this.f1418b);
            parcel.writeInt(this.f1419c);
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class n implements m {

        /* renamed from: a  reason: collision with root package name */
        public final int f1420a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1421b = 1;

        public n(int i6) {
            this.f1420a = i6;
        }

        @Override // androidx.fragment.app.a0.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            a0 a0Var = a0.this;
            o oVar = a0Var.f1406w;
            int i6 = this.f1420a;
            if (oVar == null || i6 >= 0 || !oVar.g().R()) {
                return a0Var.T(arrayList, arrayList2, i6, this.f1421b);
            }
            return false;
        }
    }

    public a0() {
        Collections.synchronizedMap(new HashMap());
        this.f1397l = new y(this);
        this.f1398m = new CopyOnWriteArrayList<>();
        this.f1399n = new z(0, this);
        this.f1400o = new q(1, this);
        this.f1401p = new androidx.activity.g(1, this);
        this.f1402q = new z(1, this);
        this.f1403r = new c();
        this.s = -1;
        this.f1407x = new d();
        this.f1408y = new e();
        this.C = new ArrayDeque<>();
        this.M = new f();
    }

    public static boolean J(int i6) {
        return Log.isLoggable("FragmentManager", i6);
    }

    public static boolean K(o oVar) {
        Iterator it = oVar.u.f1388c.f().iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            o oVar2 = (o) it.next();
            if (oVar2 != null) {
                z5 = K(oVar2);
                continue;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(o oVar) {
        if (oVar == null) {
            return true;
        }
        return oVar.C && (oVar.s == null || M(oVar.f1585v));
    }

    public static boolean N(o oVar) {
        if (oVar == null) {
            return true;
        }
        a0 a0Var = oVar.s;
        if (oVar.equals(a0Var.f1406w) && N(a0Var.f1405v)) {
            return true;
        }
        return false;
    }

    public static void d0(o oVar) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.f1589z) {
            oVar.f1589z = false;
            oVar.J = !oVar.J;
        }
    }

    public final void A(m mVar, boolean z5) {
        if (z5 && (this.f1404t == null || this.G)) {
            return;
        }
        y(z5);
        if (mVar.a(this.I, this.J)) {
            this.f1387b = true;
            try {
                V(this.I, this.J);
            } finally {
                e();
            }
        }
        g0();
        if (this.H) {
            this.H = false;
            e0();
        }
        this.f1388c.b();
    }

    public final void B(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i6, int i7) {
        ViewGroup viewGroup;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        int i8;
        int i9;
        int i10;
        ArrayList<androidx.fragment.app.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z5 = arrayList3.get(i6).f1513o;
        ArrayList<o> arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<o> arrayList6 = this.K;
        h0 h0Var4 = this.f1388c;
        arrayList6.addAll(h0Var4.g());
        o oVar = this.f1406w;
        int i11 = i6;
        boolean z6 = false;
        while (true) {
            int i12 = 1;
            if (i11 < i7) {
                androidx.fragment.app.a aVar = arrayList3.get(i11);
                if (arrayList4.get(i11).booleanValue()) {
                    h0Var2 = h0Var4;
                    int i13 = 1;
                    ArrayList<o> arrayList7 = this.K;
                    ArrayList<i0.a> arrayList8 = aVar.f1499a;
                    int size = arrayList8.size() - 1;
                    while (size >= 0) {
                        i0.a aVar2 = arrayList8.get(size);
                        int i14 = aVar2.f1514a;
                        if (i14 != i13) {
                            if (i14 != 3) {
                                switch (i14) {
                                    case 8:
                                        oVar = null;
                                        break;
                                    case 9:
                                        oVar = aVar2.f1515b;
                                        break;
                                    case 10:
                                        aVar2.f1522i = aVar2.f1521h;
                                        break;
                                }
                                size--;
                                i13 = 1;
                            }
                            arrayList7.add(aVar2.f1515b);
                            size--;
                            i13 = 1;
                        }
                        arrayList7.remove(aVar2.f1515b);
                        size--;
                        i13 = 1;
                    }
                } else {
                    ArrayList<o> arrayList9 = this.K;
                    int i15 = 0;
                    while (true) {
                        ArrayList<i0.a> arrayList10 = aVar.f1499a;
                        if (i15 < arrayList10.size()) {
                            i0.a aVar3 = arrayList10.get(i15);
                            int i16 = aVar3.f1514a;
                            if (i16 != i12) {
                                if (i16 != 2) {
                                    if (i16 == 3 || i16 == 6) {
                                        arrayList9.remove(aVar3.f1515b);
                                        o oVar2 = aVar3.f1515b;
                                        if (oVar2 == oVar) {
                                            arrayList10.add(i15, new i0.a(9, oVar2));
                                            i15++;
                                            h0Var3 = h0Var4;
                                            i8 = 1;
                                            oVar = null;
                                        }
                                    } else if (i16 == 7) {
                                        h0Var3 = h0Var4;
                                        i8 = 1;
                                    } else if (i16 == 8) {
                                        arrayList10.add(i15, new i0.a(9, oVar, 0));
                                        aVar3.f1516c = true;
                                        i15++;
                                        oVar = aVar3.f1515b;
                                    }
                                    h0Var3 = h0Var4;
                                    i8 = 1;
                                } else {
                                    o oVar3 = aVar3.f1515b;
                                    int i17 = oVar3.f1587x;
                                    int size2 = arrayList9.size() - 1;
                                    boolean z7 = false;
                                    while (size2 >= 0) {
                                        h0 h0Var5 = h0Var4;
                                        o oVar4 = arrayList9.get(size2);
                                        if (oVar4.f1587x != i17) {
                                            i9 = i17;
                                        } else if (oVar4 == oVar3) {
                                            i9 = i17;
                                            z7 = true;
                                        } else {
                                            if (oVar4 == oVar) {
                                                i9 = i17;
                                                i10 = 0;
                                                arrayList10.add(i15, new i0.a(9, oVar4, 0));
                                                i15++;
                                                oVar = null;
                                            } else {
                                                i9 = i17;
                                                i10 = 0;
                                            }
                                            i0.a aVar4 = new i0.a(3, oVar4, i10);
                                            aVar4.f1517d = aVar3.f1517d;
                                            aVar4.f1519f = aVar3.f1519f;
                                            aVar4.f1518e = aVar3.f1518e;
                                            aVar4.f1520g = aVar3.f1520g;
                                            arrayList10.add(i15, aVar4);
                                            arrayList9.remove(oVar4);
                                            i15++;
                                            oVar = oVar;
                                        }
                                        size2--;
                                        i17 = i9;
                                        h0Var4 = h0Var5;
                                    }
                                    h0Var3 = h0Var4;
                                    i8 = 1;
                                    if (z7) {
                                        arrayList10.remove(i15);
                                        i15--;
                                    } else {
                                        aVar3.f1514a = 1;
                                        aVar3.f1516c = true;
                                        arrayList9.add(oVar3);
                                    }
                                }
                                i15 += i8;
                                i12 = i8;
                                h0Var4 = h0Var3;
                            } else {
                                h0Var3 = h0Var4;
                                i8 = i12;
                            }
                            arrayList9.add(aVar3.f1515b);
                            i15 += i8;
                            i12 = i8;
                            h0Var4 = h0Var3;
                        } else {
                            h0Var2 = h0Var4;
                        }
                    }
                }
                z6 = z6 || aVar.f1505g;
                i11++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                h0Var4 = h0Var2;
            } else {
                h0 h0Var6 = h0Var4;
                this.K.clear();
                if (!z5 && this.s >= 1) {
                    for (int i18 = i6; i18 < i7; i18++) {
                        Iterator<i0.a> it = arrayList.get(i18).f1499a.iterator();
                        while (it.hasNext()) {
                            o oVar5 = it.next().f1515b;
                            if (oVar5 == null || oVar5.s == null) {
                                h0Var = h0Var6;
                            } else {
                                h0Var = h0Var6;
                                h0Var.h(g(oVar5));
                            }
                            h0Var6 = h0Var;
                        }
                    }
                }
                for (int i19 = i6; i19 < i7; i19++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        aVar5.c(-1);
                        ArrayList<i0.a> arrayList11 = aVar5.f1499a;
                        for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                            i0.a aVar6 = arrayList11.get(size3);
                            o oVar6 = aVar6.f1515b;
                            if (oVar6 != null) {
                                if (oVar6.I != null) {
                                    oVar6.e().f1592a = true;
                                }
                                int i20 = aVar5.f1504f;
                                int i21 = 8194;
                                int i22 = 4097;
                                if (i20 != 4097) {
                                    if (i20 != 8194) {
                                        i21 = 8197;
                                        i22 = 4100;
                                        if (i20 != 8197) {
                                            if (i20 == 4099) {
                                                i21 = 4099;
                                            } else if (i20 != 4100) {
                                                i21 = 0;
                                            }
                                        }
                                    }
                                    i21 = i22;
                                }
                                if (oVar6.I != null || i21 != 0) {
                                    oVar6.e();
                                    oVar6.I.f1597f = i21;
                                }
                                ArrayList<String> arrayList12 = aVar5.f1512n;
                                ArrayList<String> arrayList13 = aVar5.f1511m;
                                oVar6.e();
                                o.c cVar = oVar6.I;
                                cVar.f1598g = arrayList12;
                                cVar.f1599h = arrayList13;
                            }
                            int i23 = aVar6.f1514a;
                            a0 a0Var = aVar5.f1383p;
                            switch (i23) {
                                case 1:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.Z(oVar6, true);
                                    a0Var.U(oVar6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar6.f1514a);
                                case 3:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.a(oVar6);
                                    break;
                                case 4:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.getClass();
                                    d0(oVar6);
                                    break;
                                case 5:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.Z(oVar6, true);
                                    a0Var.I(oVar6);
                                    break;
                                case 6:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.d(oVar6);
                                    break;
                                case 7:
                                    oVar6.N(aVar6.f1517d, aVar6.f1518e, aVar6.f1519f, aVar6.f1520g);
                                    a0Var.Z(oVar6, true);
                                    a0Var.h(oVar6);
                                    break;
                                case 8:
                                    a0Var.b0(null);
                                    break;
                                case 9:
                                    a0Var.b0(oVar6);
                                    break;
                                case 10:
                                    a0Var.a0(oVar6, aVar6.f1521h);
                                    break;
                            }
                        }
                        continue;
                    } else {
                        aVar5.c(1);
                        ArrayList<i0.a> arrayList14 = aVar5.f1499a;
                        int size4 = arrayList14.size();
                        for (int i24 = 0; i24 < size4; i24++) {
                            i0.a aVar7 = arrayList14.get(i24);
                            o oVar7 = aVar7.f1515b;
                            if (oVar7 != null) {
                                if (oVar7.I != null) {
                                    oVar7.e().f1592a = false;
                                }
                                int i25 = aVar5.f1504f;
                                if (oVar7.I != null || i25 != 0) {
                                    oVar7.e();
                                    oVar7.I.f1597f = i25;
                                }
                                ArrayList<String> arrayList15 = aVar5.f1511m;
                                ArrayList<String> arrayList16 = aVar5.f1512n;
                                oVar7.e();
                                o.c cVar2 = oVar7.I;
                                cVar2.f1598g = arrayList15;
                                cVar2.f1599h = arrayList16;
                            }
                            int i26 = aVar7.f1514a;
                            a0 a0Var2 = aVar5.f1383p;
                            switch (i26) {
                                case 1:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.Z(oVar7, false);
                                    a0Var2.a(oVar7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar7.f1514a);
                                case 3:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.U(oVar7);
                                    break;
                                case 4:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.I(oVar7);
                                    break;
                                case 5:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.Z(oVar7, false);
                                    d0(oVar7);
                                    break;
                                case 6:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.h(oVar7);
                                    break;
                                case 7:
                                    oVar7.N(aVar7.f1517d, aVar7.f1518e, aVar7.f1519f, aVar7.f1520g);
                                    a0Var2.Z(oVar7, false);
                                    a0Var2.d(oVar7);
                                    break;
                                case 8:
                                    a0Var2.b0(oVar7);
                                    break;
                                case 9:
                                    a0Var2.b0(null);
                                    break;
                                case 10:
                                    a0Var2.a0(oVar7, aVar7.f1522i);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i7 - 1).booleanValue();
                for (int i27 = i6; i27 < i7; i27++) {
                    androidx.fragment.app.a aVar8 = arrayList.get(i27);
                    if (booleanValue) {
                        for (int size5 = aVar8.f1499a.size() - 1; size5 >= 0; size5--) {
                            o oVar8 = aVar8.f1499a.get(size5).f1515b;
                            if (oVar8 != null) {
                                g(oVar8).k();
                            }
                        }
                    } else {
                        Iterator<i0.a> it2 = aVar8.f1499a.iterator();
                        while (it2.hasNext()) {
                            o oVar9 = it2.next().f1515b;
                            if (oVar9 != null) {
                                g(oVar9).k();
                            }
                        }
                    }
                }
                P(this.s, true);
                HashSet hashSet = new HashSet();
                for (int i28 = i6; i28 < i7; i28++) {
                    Iterator<i0.a> it3 = arrayList.get(i28).f1499a.iterator();
                    while (it3.hasNext()) {
                        o oVar10 = it3.next().f1515b;
                        if (oVar10 != null && (viewGroup = oVar10.E) != null) {
                            hashSet.add(v0.f(viewGroup, H()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    v0 v0Var = (v0) it4.next();
                    v0Var.f1655d = booleanValue;
                    v0Var.g();
                    v0Var.c();
                }
                for (int i29 = i6; i29 < i7; i29++) {
                    androidx.fragment.app.a aVar9 = arrayList.get(i29);
                    if (arrayList2.get(i29).booleanValue() && aVar9.f1385r >= 0) {
                        aVar9.f1385r = -1;
                    }
                    aVar9.getClass();
                }
                return;
            }
        }
    }

    public final o C(String str) {
        return this.f1388c.c(str);
    }

    public final o D(int i6) {
        h0 h0Var = this.f1388c;
        ArrayList arrayList = (ArrayList) h0Var.f1492a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o oVar = (o) arrayList.get(size);
                if (oVar != null && oVar.f1586w == i6) {
                    return oVar;
                }
            } else {
                for (g0 g0Var : ((HashMap) h0Var.f1493b).values()) {
                    if (g0Var != null) {
                        o oVar2 = g0Var.f1484c;
                        if (oVar2.f1586w == i6) {
                            return oVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final o E(String str) {
        h0 h0Var = this.f1388c;
        ArrayList arrayList = (ArrayList) h0Var.f1492a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o oVar = (o) arrayList.get(size);
                if (oVar != null && str.equals(oVar.f1588y)) {
                    return oVar;
                }
            } else {
                for (g0 g0Var : ((HashMap) h0Var.f1493b).values()) {
                    if (g0Var != null) {
                        o oVar2 = g0Var.f1484c;
                        if (str.equals(oVar2.f1588y)) {
                            return oVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ViewGroup F(o oVar) {
        ViewGroup viewGroup = oVar.E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.f1587x > 0 && this.u.y()) {
            View u = this.u.u(oVar.f1587x);
            if (u instanceof ViewGroup) {
                return (ViewGroup) u;
            }
        }
        return null;
    }

    public final v G() {
        o oVar = this.f1405v;
        return oVar != null ? oVar.s.G() : this.f1407x;
    }

    public final y0 H() {
        o oVar = this.f1405v;
        return oVar != null ? oVar.s.H() : this.f1408y;
    }

    public final void I(o oVar) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (oVar.f1589z) {
            return;
        }
        oVar.f1589z = true;
        oVar.J = true ^ oVar.J;
        c0(oVar);
    }

    public final boolean L() {
        o oVar = this.f1405v;
        if (oVar == null) {
            return true;
        }
        return oVar.q() && this.f1405v.l().L();
    }

    public final boolean O() {
        return this.E || this.F;
    }

    public final void P(int i6, boolean z5) {
        Cloneable cloneable;
        w<?> wVar;
        if (this.f1404t == null && i6 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z5 && i6 == this.s) {
            return;
        }
        this.s = i6;
        h0 h0Var = this.f1388c;
        Iterator it = ((ArrayList) h0Var.f1492a).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cloneable = h0Var.f1493b;
            if (!hasNext) {
                break;
            }
            g0 g0Var = (g0) ((HashMap) cloneable).get(((o) it.next()).f1571f);
            if (g0Var != null) {
                g0Var.k();
            }
        }
        Iterator it2 = ((HashMap) cloneable).values().iterator();
        while (true) {
            boolean z6 = false;
            if (!it2.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it2.next();
            if (g0Var2 != null) {
                g0Var2.k();
                o oVar = g0Var2.f1484c;
                if (oVar.f1578m && !oVar.s()) {
                    z6 = true;
                }
                if (z6) {
                    h0Var.i(g0Var2);
                }
            }
        }
        e0();
        if (this.D && (wVar = this.f1404t) != null && this.s == 7) {
            wVar.D();
            this.D = false;
        }
    }

    public final void Q() {
        if (this.f1404t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f1456i = false;
        for (o oVar : this.f1388c.g()) {
            if (oVar != null) {
                oVar.u.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i6, int i7) {
        z(false);
        y(true);
        o oVar = this.f1406w;
        if (oVar != null && i6 < 0 && oVar.g().R()) {
            return true;
        }
        boolean T = T(this.I, this.J, i6, i7);
        if (T) {
            this.f1387b = true;
            try {
                V(this.I, this.J);
            } finally {
                e();
            }
        }
        g0();
        if (this.H) {
            this.H = false;
            e0();
        }
        this.f1388c.b();
        return T;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i6, int i7) {
        boolean z5;
        if ((i7 & 1) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1389d;
        int i8 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i6 < 0) {
                i8 = z5 ? 0 : (-1) + this.f1389d.size();
            } else {
                int size = this.f1389d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.a aVar = this.f1389d.get(size);
                    if (i6 >= 0 && i6 == aVar.f1385r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z5) {
                        while (size > 0) {
                            int i9 = size - 1;
                            androidx.fragment.app.a aVar2 = this.f1389d.get(i9);
                            if (i6 < 0 || i6 != aVar2.f1385r) {
                                break;
                            }
                            size = i9;
                        }
                    } else if (size != this.f1389d.size() - 1) {
                        size++;
                    }
                }
                i8 = size;
            }
        }
        if (i8 < 0) {
            return false;
        }
        for (int size2 = this.f1389d.size() - 1; size2 >= i8; size2--) {
            arrayList.add(this.f1389d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(o oVar) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.f1583r);
        }
        boolean z5 = !oVar.s();
        if (!oVar.A || z5) {
            h0 h0Var = this.f1388c;
            synchronized (((ArrayList) h0Var.f1492a)) {
                ((ArrayList) h0Var.f1492a).remove(oVar);
            }
            oVar.f1577l = false;
            if (K(oVar)) {
                this.D = true;
            }
            oVar.f1578m = true;
            c0(oVar);
        }
    }

    public final void V(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            if (!arrayList.get(i6).f1513o) {
                if (i7 != i6) {
                    B(arrayList, arrayList2, i7, i6);
                }
                i7 = i6 + 1;
                if (arrayList2.get(i6).booleanValue()) {
                    while (i7 < size && arrayList2.get(i7).booleanValue() && !arrayList.get(i7).f1513o) {
                        i7++;
                    }
                }
                B(arrayList, arrayList2, i6, i7);
                i6 = i7 - 1;
            }
            i6++;
        }
        if (i7 != size) {
            B(arrayList, arrayList2, i7, size);
        }
    }

    public final void W(Parcelable parcelable) {
        y yVar;
        int i6;
        boolean z5;
        g0 g0Var;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f1404t.f1666d.getClassLoader());
                this.f1396k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f1404t.f1666d.getClassLoader());
                arrayList.add((f0) bundle.getParcelable("state"));
            }
        }
        h0 h0Var = this.f1388c;
        HashMap hashMap = (HashMap) h0Var.f1494c;
        hashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            hashMap.put(f0Var.f1465c, f0Var);
        }
        c0 c0Var = (c0) bundle3.getParcelable("state");
        if (c0Var == null) {
            return;
        }
        Cloneable cloneable = h0Var.f1493b;
        ((HashMap) cloneable).clear();
        Iterator<String> it2 = c0Var.f1439b.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            yVar = this.f1397l;
            if (!hasNext) {
                break;
            }
            f0 j5 = h0Var.j(it2.next(), null);
            if (j5 != null) {
                o oVar = this.L.f1451d.get(j5.f1465c);
                if (oVar != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                    }
                    g0Var = new g0(yVar, h0Var, oVar, j5);
                } else {
                    g0Var = new g0(this.f1397l, this.f1388c, this.f1404t.f1666d.getClassLoader(), G(), j5);
                }
                o oVar2 = g0Var.f1484c;
                oVar2.s = this;
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + oVar2.f1571f + "): " + oVar2);
                }
                g0Var.m(this.f1404t.f1666d.getClassLoader());
                h0Var.h(g0Var);
                g0Var.f1486e = this.s;
            }
        }
        d0 d0Var = this.L;
        d0Var.getClass();
        Iterator it3 = new ArrayList(d0Var.f1451d.values()).iterator();
        while (true) {
            i6 = 0;
            if (!it3.hasNext()) {
                break;
            }
            o oVar3 = (o) it3.next();
            if (((HashMap) cloneable).get(oVar3.f1571f) != null) {
                i6 = 1;
            }
            if (i6 == 0) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + c0Var.f1439b);
                }
                this.L.f(oVar3);
                oVar3.s = this;
                g0 g0Var2 = new g0(yVar, h0Var, oVar3);
                g0Var2.f1486e = 1;
                g0Var2.k();
                oVar3.f1578m = true;
                g0Var2.k();
            }
        }
        ArrayList<String> arrayList2 = c0Var.f1440c;
        ((ArrayList) h0Var.f1492a).clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                o c6 = h0Var.c(str3);
                if (c6 != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + c6);
                    }
                    h0Var.a(c6);
                } else {
                    throw new IllegalStateException(b5.b.b("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (c0Var.f1441d != null) {
            this.f1389d = new ArrayList<>(c0Var.f1441d.length);
            int i7 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = c0Var.f1441d;
                if (i7 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i7];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    int[] iArr = bVar.f1423b;
                    if (i8 >= iArr.length) {
                        break;
                    }
                    i0.a aVar2 = new i0.a();
                    int i10 = i8 + 1;
                    aVar2.f1514a = iArr[i8];
                    if (J(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    aVar2.f1521h = j.c.values()[bVar.f1425d[i9]];
                    aVar2.f1522i = j.c.values()[bVar.f1426e[i9]];
                    int i11 = i10 + 1;
                    if (iArr[i10] != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    aVar2.f1516c = z5;
                    int i12 = i11 + 1;
                    int i13 = iArr[i11];
                    aVar2.f1517d = i13;
                    int i14 = i12 + 1;
                    int i15 = iArr[i12];
                    aVar2.f1518e = i15;
                    int i16 = i14 + 1;
                    int i17 = iArr[i14];
                    aVar2.f1519f = i17;
                    int i18 = iArr[i16];
                    aVar2.f1520g = i18;
                    aVar.f1500b = i13;
                    aVar.f1501c = i15;
                    aVar.f1502d = i17;
                    aVar.f1503e = i18;
                    aVar.b(aVar2);
                    i9++;
                    i8 = i16 + 1;
                }
                aVar.f1504f = bVar.f1427f;
                aVar.f1506h = bVar.f1428g;
                aVar.f1505g = true;
                aVar.f1507i = bVar.f1430i;
                aVar.f1508j = bVar.f1431j;
                aVar.f1509k = bVar.f1432k;
                aVar.f1510l = bVar.f1433l;
                aVar.f1511m = bVar.f1434m;
                aVar.f1512n = bVar.f1435n;
                aVar.f1513o = bVar.f1436o;
                aVar.f1385r = bVar.f1429h;
                int i19 = 0;
                while (true) {
                    ArrayList<String> arrayList3 = bVar.f1424c;
                    if (i19 >= arrayList3.size()) {
                        break;
                    }
                    String str4 = arrayList3.get(i19);
                    if (str4 != null) {
                        aVar.f1499a.get(i19).f1515b = C(str4);
                    }
                    i19++;
                }
                aVar.c(1);
                if (J(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + aVar.f1385r + "): " + aVar);
                    PrintWriter printWriter = new PrintWriter(new s0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1389d.add(aVar);
                i7++;
            }
        } else {
            this.f1389d = null;
        }
        this.f1394i.set(c0Var.f1442e);
        String str5 = c0Var.f1443f;
        if (str5 != null) {
            o C = C(str5);
            this.f1406w = C;
            r(C);
        }
        ArrayList<String> arrayList4 = c0Var.f1444g;
        if (arrayList4 != null) {
            while (i6 < arrayList4.size()) {
                this.f1395j.put(arrayList4.get(i6), c0Var.f1445h.get(i6));
                i6++;
            }
        }
        this.C = new ArrayDeque<>(c0Var.f1446i);
    }

    public final Bundle X() {
        int i6;
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v0 v0Var = (v0) it.next();
            if (v0Var.f1656e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                v0Var.f1656e = false;
                v0Var.c();
            }
        }
        w();
        z(true);
        this.E = true;
        this.L.f1456i = true;
        h0 h0Var = this.f1388c;
        h0Var.getClass();
        HashMap hashMap = (HashMap) h0Var.f1493b;
        ArrayList<String> arrayList2 = new ArrayList<>(hashMap.size());
        for (g0 g0Var : hashMap.values()) {
            if (g0Var != null) {
                g0Var.p();
                o oVar = g0Var.f1484c;
                arrayList2.add(oVar.f1571f);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + oVar.f1568c);
                }
            }
        }
        h0 h0Var2 = this.f1388c;
        h0Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) h0Var2.f1494c).values());
        if (arrayList3.isEmpty()) {
            if (J(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            h0 h0Var3 = this.f1388c;
            synchronized (((ArrayList) h0Var3.f1492a)) {
                bVarArr = null;
                if (((ArrayList) h0Var3.f1492a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) h0Var3.f1492a).size());
                    Iterator it2 = ((ArrayList) h0Var3.f1492a).iterator();
                    while (it2.hasNext()) {
                        o oVar2 = (o) it2.next();
                        arrayList.add(oVar2.f1571f);
                        if (J(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar2.f1571f + "): " + oVar2);
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList4 = this.f1389d;
            if (arrayList4 != null && (size = arrayList4.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (i6 = 0; i6 < size; i6++) {
                    bVarArr[i6] = new androidx.fragment.app.b(this.f1389d.get(i6));
                    if (J(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i6 + ": " + this.f1389d.get(i6));
                    }
                }
            }
            c0 c0Var = new c0();
            c0Var.f1439b = arrayList2;
            c0Var.f1440c = arrayList;
            c0Var.f1441d = bVarArr;
            c0Var.f1442e = this.f1394i.get();
            o oVar3 = this.f1406w;
            if (oVar3 != null) {
                c0Var.f1443f = oVar3.f1571f;
            }
            c0Var.f1444g.addAll(this.f1395j.keySet());
            c0Var.f1445h.addAll(this.f1395j.values());
            c0Var.f1446i = new ArrayList<>(this.C);
            bundle.putParcelable("state", c0Var);
            for (String str : this.f1396k.keySet()) {
                bundle.putBundle("result_" + str, this.f1396k.get(str));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                f0 f0Var = (f0) it3.next();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", f0Var);
                bundle.putBundle("fragment_" + f0Var.f1465c, bundle2);
            }
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f1386a) {
            boolean z5 = true;
            if (this.f1386a.size() != 1) {
                z5 = false;
            }
            if (z5) {
                this.f1404t.f1667e.removeCallbacks(this.M);
                this.f1404t.f1667e.post(this.M);
                g0();
            }
        }
    }

    public final void Z(o oVar, boolean z5) {
        ViewGroup F = F(oVar);
        if (F == null || !(F instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z5);
    }

    public final g0 a(o oVar) {
        String str = oVar.L;
        if (str != null) {
            s0.b.d(oVar, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        g0 g2 = g(oVar);
        oVar.s = this;
        h0 h0Var = this.f1388c;
        h0Var.h(g2);
        if (!oVar.A) {
            h0Var.a(oVar);
            oVar.f1578m = false;
            if (oVar.F == null) {
                oVar.J = false;
            }
            if (K(oVar)) {
                this.D = true;
            }
        }
        return g2;
    }

    public final void a0(o oVar, j.c cVar) {
        if (oVar.equals(C(oVar.f1571f)) && (oVar.f1584t == null || oVar.s == this)) {
            oVar.M = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(e0 e0Var) {
        this.f1398m.add(e0Var);
    }

    public final void b0(o oVar) {
        if (oVar == null || (oVar.equals(C(oVar.f1571f)) && (oVar.f1584t == null || oVar.s == this))) {
            o oVar2 = this.f1406w;
            this.f1406w = oVar;
            r(oVar2);
            r(this.f1406w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.fragment.app.w<?> r4, androidx.activity.result.c r5, androidx.fragment.app.o r6) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a0.c(androidx.fragment.app.w, androidx.activity.result.c, androidx.fragment.app.o):void");
    }

    public final void c0(o oVar) {
        int i6;
        int i7;
        int i8;
        int i9;
        ViewGroup F = F(oVar);
        if (F != null) {
            o.c cVar = oVar.I;
            boolean z5 = false;
            if (cVar == null) {
                i6 = 0;
            } else {
                i6 = cVar.f1593b;
            }
            if (cVar == null) {
                i7 = 0;
            } else {
                i7 = cVar.f1594c;
            }
            int i10 = i7 + i6;
            if (cVar == null) {
                i8 = 0;
            } else {
                i8 = cVar.f1595d;
            }
            int i11 = i8 + i10;
            if (cVar == null) {
                i9 = 0;
            } else {
                i9 = cVar.f1596e;
            }
            if (i9 + i11 > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, oVar);
                }
                o oVar2 = (o) F.getTag(R.id.visible_removing_fragment_view_tag);
                o.c cVar2 = oVar.I;
                if (cVar2 != null) {
                    z5 = cVar2.f1592a;
                }
                if (oVar2.I != null) {
                    oVar2.e().f1592a = z5;
                }
            }
        }
    }

    public final void d(o oVar) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.A) {
            oVar.A = false;
            if (oVar.f1577l) {
                return;
            }
            this.f1388c.a(oVar);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + oVar);
            }
            if (K(oVar)) {
                this.D = true;
            }
        }
    }

    public final void e() {
        this.f1387b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void e0() {
        Iterator it = this.f1388c.e().iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            o oVar = g0Var.f1484c;
            if (oVar.G) {
                if (this.f1387b) {
                    this.H = true;
                } else {
                    oVar.G = false;
                    g0Var.k();
                }
            }
        }
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1388c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((g0) it.next()).f1484c.E;
            if (viewGroup != null) {
                hashSet.add(v0.f(viewGroup, H()));
            }
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new s0());
        w<?> wVar = this.f1404t;
        try {
            if (wVar != null) {
                wVar.A(printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e6) {
            Log.e("FragmentManager", "Failed dumping state", e6);
        }
        throw illegalStateException;
    }

    public final g0 g(o oVar) {
        String str = oVar.f1571f;
        h0 h0Var = this.f1388c;
        g0 g0Var = (g0) ((HashMap) h0Var.f1493b).get(str);
        if (g0Var != null) {
            return g0Var;
        }
        g0 g0Var2 = new g0(this.f1397l, h0Var, oVar);
        g0Var2.m(this.f1404t.f1666d.getClassLoader());
        g0Var2.f1486e = this.s;
        return g0Var2;
    }

    public final void g0() {
        int i6;
        synchronized (this.f1386a) {
            try {
                boolean z5 = true;
                if (!this.f1386a.isEmpty()) {
                    b bVar = this.f1393h;
                    bVar.f274a = true;
                    e0.a<Boolean> aVar = bVar.f276c;
                    if (aVar != null) {
                        aVar.accept(Boolean.TRUE);
                    }
                    return;
                }
                b bVar2 = this.f1393h;
                ArrayList<androidx.fragment.app.a> arrayList = this.f1389d;
                if (arrayList != null) {
                    i6 = arrayList.size();
                } else {
                    i6 = 0;
                }
                if (i6 <= 0 || !N(this.f1405v)) {
                    z5 = false;
                }
                bVar2.f274a = z5;
                e0.a<Boolean> aVar2 = bVar2.f276c;
                if (aVar2 != null) {
                    aVar2.accept(Boolean.valueOf(z5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(o oVar) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.A) {
            oVar.A = true;
            if (oVar.f1577l) {
                if (J(2)) {
                    Log.v("FragmentManager", "remove from detach: " + oVar);
                }
                h0 h0Var = this.f1388c;
                synchronized (((ArrayList) h0Var.f1492a)) {
                    ((ArrayList) h0Var.f1492a).remove(oVar);
                }
                oVar.f1577l = false;
                if (K(oVar)) {
                    this.D = true;
                }
                c0(oVar);
            }
        }
    }

    public final void i(boolean z5, Configuration configuration) {
        if (z5 && (this.f1404t instanceof w.b)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null) {
                oVar.onConfigurationChanged(configuration);
                if (z5) {
                    oVar.u.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        boolean z5;
        if (this.s < 1) {
            return false;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null) {
                if (!oVar.f1589z) {
                    z5 = oVar.u.j();
                } else {
                    z5 = false;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z5;
        if (this.s < 1) {
            return false;
        }
        ArrayList<o> arrayList = null;
        boolean z6 = false;
        for (o oVar : this.f1388c.g()) {
            if (oVar != null && M(oVar)) {
                if (!oVar.f1589z) {
                    z5 = oVar.u.k() | false;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(oVar);
                    z6 = true;
                }
            }
        }
        if (this.f1390e != null) {
            for (int i6 = 0; i6 < this.f1390e.size(); i6++) {
                o oVar2 = this.f1390e.get(i6);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.getClass();
                }
            }
        }
        this.f1390e = arrayList;
        return z6;
    }

    public final void l() {
        boolean z5 = true;
        this.G = true;
        z(true);
        w();
        w<?> wVar = this.f1404t;
        boolean z6 = wVar instanceof androidx.lifecycle.l0;
        h0 h0Var = this.f1388c;
        if (z6) {
            z5 = ((d0) h0Var.f1495d).f1455h;
        } else {
            Context context = wVar.f1666d;
            if (context instanceof Activity) {
                z5 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z5) {
            for (androidx.fragment.app.c cVar : this.f1395j.values()) {
                for (String str : cVar.f1437b) {
                    d0 d0Var = (d0) h0Var.f1495d;
                    d0Var.getClass();
                    if (J(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    d0Var.e(str);
                }
            }
        }
        u(-1);
        w<?> wVar2 = this.f1404t;
        if (wVar2 instanceof w.c) {
            ((w.c) wVar2).h(this.f1400o);
        }
        w<?> wVar3 = this.f1404t;
        if (wVar3 instanceof w.b) {
            ((w.b) wVar3).o(this.f1399n);
        }
        w<?> wVar4 = this.f1404t;
        if (wVar4 instanceof v.l) {
            ((v.l) wVar4).r(this.f1401p);
        }
        w<?> wVar5 = this.f1404t;
        if (wVar5 instanceof v.m) {
            ((v.m) wVar5).m(this.f1402q);
        }
        w<?> wVar6 = this.f1404t;
        if (wVar6 instanceof f0.n) {
            ((f0.n) wVar6).l(this.f1403r);
        }
        this.f1404t = null;
        this.u = null;
        this.f1405v = null;
        if (this.f1392g != null) {
            Iterator<androidx.activity.a> it = this.f1393h.f275b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f1392g = null;
        }
        androidx.activity.result.d dVar = this.f1409z;
        if (dVar != null) {
            dVar.A();
            this.A.A();
            this.B.A();
        }
    }

    public final void m(boolean z5) {
        if (z5 && (this.f1404t instanceof w.c)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null) {
                oVar.onLowMemory();
                if (z5) {
                    oVar.u.m(true);
                }
            }
        }
    }

    public final void n(boolean z5, boolean z6) {
        if (z6 && (this.f1404t instanceof v.l)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null && z6) {
                oVar.u.n(z5, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f1388c.f().iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (oVar != null) {
                oVar.r();
                oVar.u.o();
            }
        }
    }

    public final boolean p() {
        boolean z5;
        if (this.s < 1) {
            return false;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null) {
                if (!oVar.f1589z) {
                    z5 = oVar.u.p();
                } else {
                    z5 = false;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.s < 1) {
            return;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null && !oVar.f1589z) {
                oVar.u.q();
            }
        }
    }

    public final void r(o oVar) {
        if (oVar != null && oVar.equals(C(oVar.f1571f))) {
            oVar.s.getClass();
            boolean N = N(oVar);
            Boolean bool = oVar.f1576k;
            if (bool == null || bool.booleanValue() != N) {
                oVar.f1576k = Boolean.valueOf(N);
                b0 b0Var = oVar.u;
                b0Var.g0();
                b0Var.r(b0Var.f1406w);
            }
        }
    }

    public final void s(boolean z5, boolean z6) {
        if (z6 && (this.f1404t instanceof v.m)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.f1388c.g()) {
            if (oVar != null && z6) {
                oVar.u.s(z5, true);
            }
        }
    }

    public final boolean t() {
        boolean z5;
        if (this.s < 1) {
            return false;
        }
        boolean z6 = false;
        for (o oVar : this.f1388c.g()) {
            if (oVar != null && M(oVar)) {
                if (!oVar.f1589z) {
                    z5 = oVar.u.t() | false;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o oVar = this.f1405v;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1405v;
        } else {
            w<?> wVar = this.f1404t;
            if (wVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(wVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1404t;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i6) {
        try {
            this.f1387b = true;
            for (g0 g0Var : ((HashMap) this.f1388c.f1493b).values()) {
                if (g0Var != null) {
                    g0Var.f1486e = i6;
                }
            }
            P(i6, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((v0) it.next()).e();
            }
            this.f1387b = false;
            z(true);
        } catch (Throwable th) {
            this.f1387b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        String str3 = str + "    ";
        h0 h0Var = this.f1388c;
        h0Var.getClass();
        String str4 = str + "    ";
        HashMap hashMap = (HashMap) h0Var.f1493b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (g0 g0Var : hashMap.values()) {
                printWriter.print(str);
                if (g0Var != null) {
                    o oVar = g0Var.f1484c;
                    printWriter.println(oVar);
                    oVar.getClass();
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(oVar.f1586w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(oVar.f1587x));
                    printWriter.print(" mTag=");
                    printWriter.println(oVar.f1588y);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(oVar.f1567b);
                    printWriter.print(" mWho=");
                    printWriter.print(oVar.f1571f);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(oVar.f1583r);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(oVar.f1577l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(oVar.f1578m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(oVar.f1579n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(oVar.f1580o);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(oVar.f1589z);
                    printWriter.print(" mDetached=");
                    printWriter.print(oVar.A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(oVar.C);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(oVar.B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(oVar.H);
                    if (oVar.s != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(oVar.s);
                    }
                    if (oVar.f1584t != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(oVar.f1584t);
                    }
                    if (oVar.f1585v != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(oVar.f1585v);
                    }
                    if (oVar.f1572g != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(oVar.f1572g);
                    }
                    if (oVar.f1568c != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(oVar.f1568c);
                    }
                    if (oVar.f1569d != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(oVar.f1569d);
                    }
                    if (oVar.f1570e != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(oVar.f1570e);
                    }
                    Object obj = oVar.f1573h;
                    if (obj == null) {
                        a0 a0Var = oVar.s;
                        if (a0Var != null && (str2 = oVar.f1574i) != null) {
                            obj = a0Var.C(str2);
                        } else {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(oVar.f1575j);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    o.c cVar = oVar.I;
                    if (cVar == null) {
                        z5 = false;
                    } else {
                        z5 = cVar.f1592a;
                    }
                    printWriter.println(z5);
                    o.c cVar2 = oVar.I;
                    if (cVar2 == null) {
                        i6 = 0;
                    } else {
                        i6 = cVar2.f1593b;
                    }
                    if (i6 != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        o.c cVar3 = oVar.I;
                        if (cVar3 == null) {
                            i13 = 0;
                        } else {
                            i13 = cVar3.f1593b;
                        }
                        printWriter.println(i13);
                    }
                    o.c cVar4 = oVar.I;
                    if (cVar4 == null) {
                        i7 = 0;
                    } else {
                        i7 = cVar4.f1594c;
                    }
                    if (i7 != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        o.c cVar5 = oVar.I;
                        if (cVar5 == null) {
                            i12 = 0;
                        } else {
                            i12 = cVar5.f1594c;
                        }
                        printWriter.println(i12);
                    }
                    o.c cVar6 = oVar.I;
                    if (cVar6 == null) {
                        i8 = 0;
                    } else {
                        i8 = cVar6.f1595d;
                    }
                    if (i8 != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        o.c cVar7 = oVar.I;
                        if (cVar7 == null) {
                            i11 = 0;
                        } else {
                            i11 = cVar7.f1595d;
                        }
                        printWriter.println(i11);
                    }
                    o.c cVar8 = oVar.I;
                    if (cVar8 == null) {
                        i9 = 0;
                    } else {
                        i9 = cVar8.f1596e;
                    }
                    if (i9 != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        o.c cVar9 = oVar.I;
                        if (cVar9 == null) {
                            i10 = 0;
                        } else {
                            i10 = cVar9.f1596e;
                        }
                        printWriter.println(i10);
                    }
                    if (oVar.E != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(oVar.E);
                    }
                    if (oVar.F != null) {
                        printWriter.print(str4);
                        printWriter.print("mView=");
                        printWriter.println(oVar.F);
                    }
                    if (oVar.h() != null) {
                        new v0.a(oVar, oVar.t()).A(str4, printWriter);
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + oVar.u + ":");
                    oVar.u.v(str4 + "  ", fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) h0Var.f1492a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i14 = 0; i14 < size3; i14++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i14);
                printWriter.print(": ");
                printWriter.println(((o) arrayList.get(i14)).toString());
            }
        }
        ArrayList<o> arrayList2 = this.f1390e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i15 = 0; i15 < size2; i15++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i15);
                printWriter.print(": ");
                printWriter.println(this.f1390e.get(i15).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1389d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i16 = 0; i16 < size; i16++) {
                androidx.fragment.app.a aVar = this.f1389d.get(i16);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i16);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1394i.get());
        synchronized (this.f1386a) {
            int size4 = this.f1386a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i17 = 0; i17 < size4; i17++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i17);
                    printWriter.print(": ");
                    printWriter.println((m) this.f1386a.get(i17));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1404t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.f1405v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1405v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((v0) it.next()).e();
        }
    }

    public final void x(m mVar, boolean z5) {
        if (!z5) {
            if (this.f1404t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1386a) {
            if (this.f1404t == null) {
                if (z5) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f1386a.add(mVar);
            Y();
        }
    }

    public final void y(boolean z5) {
        if (!this.f1387b) {
            if (this.f1404t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f1404t.f1667e.getLooper()) {
                if (!z5 && O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.I == null) {
                    this.I = new ArrayList<>();
                    this.J = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean z(boolean z5) {
        boolean z6;
        y(z5);
        boolean z7 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.I;
            ArrayList<Boolean> arrayList2 = this.J;
            synchronized (this.f1386a) {
                if (this.f1386a.isEmpty()) {
                    z6 = false;
                } else {
                    int size = this.f1386a.size();
                    z6 = false;
                    for (int i6 = 0; i6 < size; i6++) {
                        z6 |= this.f1386a.get(i6).a(arrayList, arrayList2);
                    }
                    this.f1386a.clear();
                    this.f1404t.f1667e.removeCallbacks(this.M);
                }
            }
            if (!z6) {
                break;
            }
            z7 = true;
            this.f1387b = true;
            try {
                V(this.I, this.J);
            } finally {
                e();
            }
        }
        g0();
        if (this.H) {
            this.H = false;
            e0();
        }
        this.f1388c.b();
        return z7;
    }
}
