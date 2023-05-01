package s3;

import java.util.Collections;
import java.util.List;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class j implements y, Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final j f6010g = new j();

    /* renamed from: b  reason: collision with root package name */
    public final double f6011b = -1.0d;

    /* renamed from: c  reason: collision with root package name */
    public final int f6012c = 136;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6013d = true;

    /* renamed from: e  reason: collision with root package name */
    public final List<q3.a> f6014e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public final List<q3.a> f6015f = Collections.emptyList();

    /* loaded from: classes.dex */
    public class a extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public x<T> f6016a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f6017b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f6018c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ q3.j f6019d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ w3.a f6020e;

        public a(boolean z5, boolean z6, q3.j jVar, w3.a aVar) {
            this.f6017b = z5;
            this.f6018c = z6;
            this.f6019d = jVar;
            this.f6020e = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object] */
        @Override // q3.x
        public final T a(x3.a aVar) {
            if (this.f6017b) {
                aVar.R();
                return null;
            }
            x xVar = this.f6016a;
            if (xVar == null) {
                xVar = this.f6019d.d(j.this, this.f6020e);
                this.f6016a = xVar;
            }
            return xVar.a(aVar);
        }

        @Override // q3.x
        public final void b(x3.c cVar, T t5) {
            if (this.f6018c) {
                cVar.q();
                return;
            }
            x xVar = this.f6016a;
            if (xVar == null) {
                xVar = this.f6019d.d(j.this, this.f6020e);
                this.f6016a = xVar;
            }
            xVar.b(cVar, t5);
        }
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        boolean z5;
        boolean z6;
        Class<? super T> cls = aVar.f6586a;
        boolean b6 = b(cls);
        if (!b6 && !c(cls, true)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!b6 && !c(cls, false)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z5 && !z6) {
            return null;
        }
        return new a(z6, z5, jVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Class<?> r5) {
        /*
            r4 = this;
            double r0 = r4.f6011b
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L20
            java.lang.Class<r3.c> r0 = r3.c.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            r3.c r0 = (r3.c) r0
            java.lang.Class<r3.d> r2 = r3.d.class
            java.lang.annotation.Annotation r2 = r5.getAnnotation(r2)
            r3.d r2 = (r3.d) r2
            boolean r0 = r4.d(r0, r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            boolean r0 = r4.f6013d
            r2 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r5.isMemberClass()
            if (r0 == 0) goto L3a
            int r0 = r5.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L35
            r0 = r1
            goto L36
        L35:
            r0 = r2
        L36:
            if (r0 != 0) goto L3a
            r0 = r1
            goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 == 0) goto L3e
            return r1
        L3e:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 != 0) goto L54
            boolean r0 = r5.isAnonymousClass()
            if (r0 != 0) goto L52
            boolean r5 = r5.isLocalClass()
            if (r5 == 0) goto L54
        L52:
            r5 = r1
            goto L55
        L54:
            r5 = r2
        L55:
            if (r5 == 0) goto L58
            return r1
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.j.b(java.lang.Class):boolean");
    }

    public final boolean c(Class<?> cls, boolean z5) {
        for (q3.a aVar : z5 ? this.f6014e : this.f6015f) {
            if (aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (j) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean d(r3.c cVar, r3.d dVar) {
        boolean z5;
        boolean z6;
        double d6 = this.f6011b;
        if (cVar != null && cVar.value() > d6) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            return false;
        }
        if (dVar != null && dVar.value() <= d6) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6) {
            return false;
        }
        return true;
    }
}
