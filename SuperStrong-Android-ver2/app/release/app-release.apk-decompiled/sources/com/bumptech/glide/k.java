package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import x1.n;
/* loaded from: classes.dex */
public final class k<TranscodeType> extends a2.a<k<TranscodeType>> {
    public final Context B;
    public final l C;
    public final Class<TranscodeType> D;
    public final g E;
    public m<?, ? super TranscodeType> F;
    public Object G;
    public ArrayList H;
    public k<TranscodeType> I;
    public k<TranscodeType> J;
    public final boolean K = true;
    public boolean L;
    public boolean M;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2827a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2828b;

        static {
            int[] iArr = new int[i.values().length];
            f2828b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2828b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2828b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2828b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f2827a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2827a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2827a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2827a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2827a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2827a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2827a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2827a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        a2.g gVar = (a2.g) ((a2.g) new a2.g().d(k1.l.f4826b).h()).m();
    }

    @SuppressLint({"CheckResult"})
    public k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        a2.g gVar;
        this.C = lVar;
        this.D = cls;
        this.B = context;
        Map<Class<?>, m<?, ?>> map = lVar.f2830b.f2793d.f2805f;
        com.bumptech.glide.a aVar = map.get(cls);
        if (aVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aVar = (m<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.F = (m<?, ? super TranscodeType>) (aVar == null ? g.f2799k : aVar);
        this.E = bVar.f2793d;
        Iterator<a2.f<Object>> it = lVar.f2838j.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        synchronized (lVar) {
            gVar = lVar.f2839k;
        }
        t(gVar);
    }

    @Override // a2.a
    public final a2.a a(a2.a aVar) {
        androidx.activity.k.h(aVar);
        return (k) super.a(aVar);
    }

    public final k<TranscodeType> s(a2.f<TranscodeType> fVar) {
        if (this.f125w) {
            return clone().s(fVar);
        }
        if (fVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(fVar);
        }
        i();
        return this;
    }

    public final k<TranscodeType> t(a2.a<?> aVar) {
        androidx.activity.k.h(aVar);
        return (k) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a2.c u(int i6, int i7, i iVar, m mVar, a2.a aVar, a2.e eVar, b2.g gVar, Object obj) {
        a2.b bVar;
        a2.b bVar2;
        a2.i y5;
        int i8;
        i iVar2;
        int i9;
        int i10;
        if (this.J != null) {
            a2.b bVar3 = new a2.b(obj, eVar);
            bVar = bVar3;
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = eVar;
        }
        k<TranscodeType> kVar = this.I;
        if (kVar == null) {
            y5 = y(i6, i7, iVar, mVar, aVar, bVar2, gVar, obj);
        } else if (!this.M) {
            m<?, ? super TranscodeType> mVar2 = kVar.K ? mVar : kVar.F;
            if (a2.a.e(kVar.f106b, 8)) {
                iVar2 = this.I.f109e;
            } else {
                int ordinal = iVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    iVar2 = i.IMMEDIATE;
                } else if (ordinal == 2) {
                    iVar2 = i.HIGH;
                } else if (ordinal != 3) {
                    throw new IllegalArgumentException("unknown priority: " + this.f109e);
                } else {
                    iVar2 = i.NORMAL;
                }
            }
            i iVar3 = iVar2;
            k<TranscodeType> kVar2 = this.I;
            int i11 = kVar2.f116l;
            int i12 = kVar2.f115k;
            if (e2.j.g(i6, i7)) {
                k<TranscodeType> kVar3 = this.I;
                if (!e2.j.g(kVar3.f116l, kVar3.f115k)) {
                    i10 = aVar.f116l;
                    i9 = aVar.f115k;
                    a2.j jVar = new a2.j(obj, bVar2);
                    a2.i y6 = y(i6, i7, iVar, mVar, aVar, jVar, gVar, obj);
                    this.M = true;
                    k<TranscodeType> kVar4 = this.I;
                    a2.c u = kVar4.u(i10, i9, iVar3, mVar2, kVar4, jVar, gVar, obj);
                    this.M = false;
                    jVar.f161c = y6;
                    jVar.f162d = u;
                    y5 = jVar;
                }
            }
            i9 = i12;
            i10 = i11;
            a2.j jVar2 = new a2.j(obj, bVar2);
            a2.i y62 = y(i6, i7, iVar, mVar, aVar, jVar2, gVar, obj);
            this.M = true;
            k<TranscodeType> kVar42 = this.I;
            a2.c u5 = kVar42.u(i10, i9, iVar3, mVar2, kVar42, jVar2, gVar, obj);
            this.M = false;
            jVar2.f161c = y62;
            jVar2.f162d = u5;
            y5 = jVar2;
        } else {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        if (bVar == null) {
            return y5;
        }
        k<TranscodeType> kVar5 = this.J;
        int i13 = kVar5.f116l;
        int i14 = kVar5.f115k;
        if (e2.j.g(i6, i7)) {
            k<TranscodeType> kVar6 = this.J;
            if (!e2.j.g(kVar6.f116l, kVar6.f115k)) {
                int i15 = aVar.f116l;
                i8 = aVar.f115k;
                i13 = i15;
                k<TranscodeType> kVar7 = this.J;
                a2.c u6 = kVar7.u(i13, i8, kVar7.f109e, kVar7.F, kVar7, bVar, gVar, obj);
                bVar.f131c = y5;
                bVar.f132d = u6;
                return bVar;
            }
        }
        i8 = i14;
        k<TranscodeType> kVar72 = this.J;
        a2.c u62 = kVar72.u(i13, i8, kVar72.f109e, kVar72.F, kVar72, bVar, gVar, obj);
        bVar.f131c = y5;
        bVar.f132d = u62;
        return bVar;
    }

    @Override // a2.a
    /* renamed from: v */
    public final k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.F = (m<?, ? super TranscodeType>) kVar.F.clone();
        if (kVar.H != null) {
            kVar.H = new ArrayList(kVar.H);
        }
        k<TranscodeType> kVar2 = kVar.I;
        if (kVar2 != null) {
            kVar.I = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.J;
        if (kVar3 != null) {
            kVar.J = kVar3.clone();
        }
        return kVar;
    }

    public final void w(b2.g gVar, a2.a aVar) {
        boolean z5;
        androidx.activity.k.h(gVar);
        if (this.L) {
            Object obj = new Object();
            m<?, ? super TranscodeType> mVar = this.F;
            a2.c u = u(aVar.f116l, aVar.f115k, aVar.f109e, mVar, aVar, null, gVar, obj);
            a2.c g2 = gVar.g();
            if (u.d(g2)) {
                if (!aVar.f114j && g2.i()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    androidx.activity.k.h(g2);
                    if (!g2.isRunning()) {
                        g2.f();
                        return;
                    }
                    return;
                }
            }
            this.C.l(gVar);
            gVar.c(u);
            l lVar = this.C;
            synchronized (lVar) {
                lVar.f2835g.f6691b.add(gVar);
                n nVar = lVar.f2833e;
                nVar.f6686a.add(u);
                if (!nVar.f6688c) {
                    u.f();
                } else {
                    u.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    nVar.f6687b.add(u);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final k<TranscodeType> x(Object obj) {
        if (this.f125w) {
            return clone().x(obj);
        }
        this.G = obj;
        this.L = true;
        i();
        return this;
    }

    public final a2.i y(int i6, int i7, i iVar, m mVar, a2.a aVar, a2.e eVar, b2.g gVar, Object obj) {
        Context context = this.B;
        Object obj2 = this.G;
        Class<TranscodeType> cls = this.D;
        ArrayList arrayList = this.H;
        g gVar2 = this.E;
        return new a2.i(context, gVar2, obj, obj2, cls, aVar, i6, i7, iVar, gVar, arrayList, eVar, gVar2.f2806g, mVar.f2872b);
    }
}
