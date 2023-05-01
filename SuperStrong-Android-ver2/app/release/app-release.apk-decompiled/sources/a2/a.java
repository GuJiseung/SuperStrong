package a2;

import a2.a;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.k;
import k1.l;
import r1.o;
/* loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;

    /* renamed from: b  reason: collision with root package name */
    public int f106b;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f110f;

    /* renamed from: g  reason: collision with root package name */
    public int f111g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f112h;

    /* renamed from: i  reason: collision with root package name */
    public int f113i;

    /* renamed from: n  reason: collision with root package name */
    public boolean f118n;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f120p;

    /* renamed from: q  reason: collision with root package name */
    public int f121q;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public Resources.Theme f124v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f125w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f126x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f127y;

    /* renamed from: c  reason: collision with root package name */
    public float f107c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public l f108d = l.f4827c;

    /* renamed from: e  reason: collision with root package name */
    public com.bumptech.glide.i f109e = com.bumptech.glide.i.NORMAL;

    /* renamed from: j  reason: collision with root package name */
    public boolean f114j = true;

    /* renamed from: k  reason: collision with root package name */
    public int f115k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f116l = -1;

    /* renamed from: m  reason: collision with root package name */
    public i1.f f117m = d2.c.f3773b;

    /* renamed from: o  reason: collision with root package name */
    public boolean f119o = true;

    /* renamed from: r  reason: collision with root package name */
    public i1.h f122r = new i1.h();
    public e2.b s = new e2.b();

    /* renamed from: t  reason: collision with root package name */
    public Class<?> f123t = Object.class;

    /* renamed from: z  reason: collision with root package name */
    public boolean f128z = true;

    public static boolean e(int i6, int i7) {
        return (i6 & i7) != 0;
    }

    public T a(a<?> aVar) {
        if (this.f125w) {
            return (T) clone().a(aVar);
        }
        if (e(aVar.f106b, 2)) {
            this.f107c = aVar.f107c;
        }
        if (e(aVar.f106b, 262144)) {
            this.f126x = aVar.f126x;
        }
        if (e(aVar.f106b, 1048576)) {
            this.A = aVar.A;
        }
        if (e(aVar.f106b, 4)) {
            this.f108d = aVar.f108d;
        }
        if (e(aVar.f106b, 8)) {
            this.f109e = aVar.f109e;
        }
        if (e(aVar.f106b, 16)) {
            this.f110f = aVar.f110f;
            this.f111g = 0;
            this.f106b &= -33;
        }
        if (e(aVar.f106b, 32)) {
            this.f111g = aVar.f111g;
            this.f110f = null;
            this.f106b &= -17;
        }
        if (e(aVar.f106b, 64)) {
            this.f112h = aVar.f112h;
            this.f113i = 0;
            this.f106b &= -129;
        }
        if (e(aVar.f106b, 128)) {
            this.f113i = aVar.f113i;
            this.f112h = null;
            this.f106b &= -65;
        }
        if (e(aVar.f106b, 256)) {
            this.f114j = aVar.f114j;
        }
        if (e(aVar.f106b, 512)) {
            this.f116l = aVar.f116l;
            this.f115k = aVar.f115k;
        }
        if (e(aVar.f106b, 1024)) {
            this.f117m = aVar.f117m;
        }
        if (e(aVar.f106b, 4096)) {
            this.f123t = aVar.f123t;
        }
        if (e(aVar.f106b, 8192)) {
            this.f120p = aVar.f120p;
            this.f121q = 0;
            this.f106b &= -16385;
        }
        if (e(aVar.f106b, 16384)) {
            this.f121q = aVar.f121q;
            this.f120p = null;
            this.f106b &= -8193;
        }
        if (e(aVar.f106b, 32768)) {
            this.f124v = aVar.f124v;
        }
        if (e(aVar.f106b, 65536)) {
            this.f119o = aVar.f119o;
        }
        if (e(aVar.f106b, 131072)) {
            this.f118n = aVar.f118n;
        }
        if (e(aVar.f106b, 2048)) {
            this.s.putAll(aVar.s);
            this.f128z = aVar.f128z;
        }
        if (e(aVar.f106b, 524288)) {
            this.f127y = aVar.f127y;
        }
        if (!this.f119o) {
            this.s.clear();
            this.f118n = false;
            this.f106b = this.f106b & (-2049) & (-131073);
            this.f128z = true;
        }
        this.f106b |= aVar.f106b;
        this.f122r.f4591b.i(aVar.f122r.f4591b);
        i();
        return this;
    }

    @Override // 
    /* renamed from: b */
    public T clone() {
        try {
            T t5 = (T) super.clone();
            i1.h hVar = new i1.h();
            t5.f122r = hVar;
            hVar.f4591b.i(this.f122r.f4591b);
            e2.b bVar = new e2.b();
            t5.s = bVar;
            bVar.putAll(this.s);
            t5.u = false;
            t5.f125w = false;
            return t5;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final T c(Class<?> cls) {
        if (this.f125w) {
            return (T) clone().c(cls);
        }
        this.f123t = cls;
        this.f106b |= 4096;
        i();
        return this;
    }

    public final T d(l lVar) {
        if (this.f125w) {
            return (T) clone().d(lVar);
        }
        k.h(lVar);
        this.f108d = lVar;
        this.f106b |= 4;
        i();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f107c, this.f107c) == 0 && this.f111g == aVar.f111g && e2.j.a(this.f110f, aVar.f110f) && this.f113i == aVar.f113i && e2.j.a(this.f112h, aVar.f112h) && this.f121q == aVar.f121q && e2.j.a(this.f120p, aVar.f120p) && this.f114j == aVar.f114j && this.f115k == aVar.f115k && this.f116l == aVar.f116l && this.f118n == aVar.f118n && this.f119o == aVar.f119o && this.f126x == aVar.f126x && this.f127y == aVar.f127y && this.f108d.equals(aVar.f108d) && this.f109e == aVar.f109e && this.f122r.equals(aVar.f122r) && this.s.equals(aVar.s) && this.f123t.equals(aVar.f123t) && e2.j.a(this.f117m, aVar.f117m) && e2.j.a(this.f124v, aVar.f124v)) {
                return true;
            }
        }
        return false;
    }

    public final a f(r1.l lVar, r1.f fVar) {
        if (this.f125w) {
            return clone().f(lVar, fVar);
        }
        i1.g gVar = r1.l.f5914f;
        k.h(lVar);
        j(gVar, lVar);
        return p(fVar, false);
    }

    public final T g(int i6, int i7) {
        if (this.f125w) {
            return (T) clone().g(i6, i7);
        }
        this.f116l = i6;
        this.f115k = i7;
        this.f106b |= 512;
        i();
        return this;
    }

    public final a h() {
        com.bumptech.glide.i iVar = com.bumptech.glide.i.LOW;
        if (this.f125w) {
            return clone().h();
        }
        this.f109e = iVar;
        this.f106b |= 8;
        i();
        return this;
    }

    public final int hashCode() {
        float f6 = this.f107c;
        char[] cArr = e2.j.f3832a;
        return e2.j.f(e2.j.f(e2.j.f(e2.j.f(e2.j.f(e2.j.f(e2.j.f((((((((((((((e2.j.f((e2.j.f((e2.j.f(((Float.floatToIntBits(f6) + 527) * 31) + this.f111g, this.f110f) * 31) + this.f113i, this.f112h) * 31) + this.f121q, this.f120p) * 31) + (this.f114j ? 1 : 0)) * 31) + this.f115k) * 31) + this.f116l) * 31) + (this.f118n ? 1 : 0)) * 31) + (this.f119o ? 1 : 0)) * 31) + (this.f126x ? 1 : 0)) * 31) + (this.f127y ? 1 : 0), this.f108d), this.f109e), this.f122r), this.s), this.f123t), this.f117m), this.f124v);
    }

    public final void i() {
        if (this.u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final <Y> T j(i1.g<Y> gVar, Y y5) {
        if (this.f125w) {
            return (T) clone().j(gVar, y5);
        }
        k.h(gVar);
        k.h(y5);
        this.f122r.f4591b.put(gVar, y5);
        i();
        return this;
    }

    public final T l(i1.f fVar) {
        if (this.f125w) {
            return (T) clone().l(fVar);
        }
        this.f117m = fVar;
        this.f106b |= 1024;
        i();
        return this;
    }

    public final a m() {
        if (this.f125w) {
            return clone().m();
        }
        this.f114j = false;
        this.f106b |= 256;
        i();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T p(i1.l<Bitmap> lVar, boolean z5) {
        if (this.f125w) {
            return (T) clone().p(lVar, z5);
        }
        o oVar = new o(lVar, z5);
        q(Bitmap.class, lVar, z5);
        q(Drawable.class, oVar, z5);
        q(BitmapDrawable.class, oVar, z5);
        q(v1.c.class, new v1.e(lVar), z5);
        i();
        return this;
    }

    public final <Y> T q(Class<Y> cls, i1.l<Y> lVar, boolean z5) {
        if (this.f125w) {
            return (T) clone().q(cls, lVar, z5);
        }
        k.h(lVar);
        this.s.put(cls, lVar);
        this.f119o = true;
        int i6 = this.f106b | 2048 | 65536;
        this.f106b = i6;
        this.f128z = false;
        if (z5) {
            this.f106b = i6 | 131072;
            this.f118n = true;
        }
        i();
        return this;
    }

    public final a r() {
        if (this.f125w) {
            return clone().r();
        }
        this.A = true;
        this.f106b |= 1048576;
        i();
        return this;
    }
}
