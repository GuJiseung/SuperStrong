package t3;

import java.util.LinkedHashMap;
import java.util.Map;
import q3.c;
import q3.u;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class j implements y {

    /* renamed from: b  reason: collision with root package name */
    public final s3.c f6165b;

    /* renamed from: c  reason: collision with root package name */
    public final q3.d f6166c;

    /* renamed from: d  reason: collision with root package name */
    public final s3.j f6167d;

    /* renamed from: e  reason: collision with root package name */
    public final d f6168e;

    /* renamed from: f  reason: collision with root package name */
    public final v3.b f6169f = v3.b.f6320a;

    /* loaded from: classes.dex */
    public static final class a<T> extends x<T> {

        /* renamed from: a  reason: collision with root package name */
        public final s3.n<T> f6170a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f6171b;

        public a(s3.n nVar, LinkedHashMap linkedHashMap) {
            this.f6170a = nVar;
            this.f6171b = linkedHashMap;
        }

        @Override // q3.x
        public final T a(x3.a aVar) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            T e6 = this.f6170a.e();
            try {
                aVar.f();
                while (aVar.q()) {
                    b bVar = this.f6171b.get(aVar.G());
                    if (bVar != null && bVar.f6174c) {
                        bVar.a(aVar, e6);
                    }
                    aVar.R();
                }
                aVar.n();
                return e6;
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (IllegalStateException e8) {
                throw new u(e8);
            }
        }

        @Override // q3.x
        public final void b(x3.c cVar, T t5) {
            if (t5 == null) {
                cVar.q();
                return;
            }
            cVar.h();
            try {
                for (b bVar : this.f6171b.values()) {
                    if (bVar.c(t5)) {
                        cVar.o(bVar.f6172a);
                        bVar.b(cVar, t5);
                    }
                }
                cVar.n();
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f6172a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6173b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6174c;

        public b(String str, boolean z5, boolean z6) {
            this.f6172a = str;
            this.f6173b = z5;
            this.f6174c = z6;
        }

        public abstract void a(x3.a aVar, Object obj);

        public abstract void b(x3.c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(s3.c cVar, c.a aVar, s3.j jVar, d dVar) {
        this.f6165b = cVar;
        this.f6166c = aVar;
        this.f6167d = jVar;
        this.f6168e = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01aa, code lost:
        r27 = r7;
        r6 = new w3.a<>(s3.a.g(r1, r27, r27.getGenericSuperclass(), new java.util.HashSet()));
        r7 = r6.f6586a;
        r0 = r33;
        r11 = r34;
        r12 = r12;
        r8 = r8;
        r9 = r9;
        r10 = r10;
        r13 = r13;
        r15 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    @Override // q3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> q3.x<T> a(q3.j r34, w3.a<T> r35) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.j.a(q3.j, w3.a):q3.x");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r0 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.reflect.Field r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Class r0 = r10.getType()
            s3.j r1 = r9.f6167d
            boolean r2 = r1.b(r0)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L17
            boolean r0 = r1.c(r0, r11)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = r3
            goto L18
        L17:
            r0 = r4
        L18:
            if (r0 != 0) goto Lb5
            int r0 = r10.getModifiers()
            int r2 = r1.f6012c
            r0 = r0 & r2
            if (r0 == 0) goto L25
            goto Laf
        L25:
            double r5 = r1.f6011b
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L45
            java.lang.Class<r3.c> r0 = r3.c.class
            java.lang.annotation.Annotation r0 = r10.getAnnotation(r0)
            r3.c r0 = (r3.c) r0
            java.lang.Class<r3.d> r2 = r3.d.class
            java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
            r3.d r2 = (r3.d) r2
            boolean r0 = r1.d(r0, r2)
            if (r0 != 0) goto L45
            goto Laf
        L45:
            boolean r0 = r10.isSynthetic()
            if (r0 == 0) goto L4d
            goto Laf
        L4d:
            boolean r0 = r1.f6013d
            if (r0 != 0) goto L6e
            java.lang.Class r0 = r10.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L6a
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L65
            r0 = r4
            goto L66
        L65:
            r0 = r3
        L66:
            if (r0 != 0) goto L6a
            r0 = r4
            goto L6b
        L6a:
            r0 = r3
        L6b:
            if (r0 == 0) goto L6e
            goto Laf
        L6e:
            java.lang.Class r10 = r10.getType()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 != 0) goto L88
            boolean r0 = r10.isAnonymousClass()
            if (r0 != 0) goto L86
            boolean r10 = r10.isLocalClass()
            if (r10 == 0) goto L88
        L86:
            r10 = r4
            goto L89
        L88:
            r10 = r3
        L89:
            if (r10 == 0) goto L8c
            goto Laf
        L8c:
            if (r11 == 0) goto L91
            java.util.List<q3.a> r10 = r1.f6014e
            goto L93
        L91:
            java.util.List<q3.a> r10 = r1.f6015f
        L93:
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto Lb1
            java.util.Iterator r10 = r10.iterator()
        L9d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb1
            java.lang.Object r11 = r10.next()
            q3.a r11 = (q3.a) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto L9d
        Laf:
            r10 = r4
            goto Lb2
        Lb1:
            r10 = r3
        Lb2:
            if (r10 != 0) goto Lb5
            r3 = r4
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.j.b(java.lang.reflect.Field, boolean):boolean");
    }
}
