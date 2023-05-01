package t3;

import java.lang.reflect.Type;
import q3.t;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class m<T> extends x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final t<T> f6179a;

    /* renamed from: b  reason: collision with root package name */
    public final q3.m<T> f6180b;

    /* renamed from: c  reason: collision with root package name */
    public final q3.j f6181c;

    /* renamed from: d  reason: collision with root package name */
    public final w3.a<T> f6182d;

    /* renamed from: e  reason: collision with root package name */
    public final y f6183e;

    /* renamed from: f  reason: collision with root package name */
    public x<T> f6184f;

    /* loaded from: classes.dex */
    public final class a {
    }

    public m(t tVar, q3.m mVar, q3.j jVar, w3.a aVar) {
        new a();
        this.f6179a = tVar;
        this.f6180b = mVar;
        this.f6181c = jVar;
        this.f6182d = aVar;
        this.f6183e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004e  */
    @Override // q3.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T a(x3.a r4) {
        /*
            r3 = this;
            w3.a<T> r0 = r3.f6182d
            q3.m<T> r1 = r3.f6180b
            if (r1 != 0) goto L1a
            q3.x<T> r1 = r3.f6184f
            if (r1 == 0) goto Lb
            goto L15
        Lb:
            q3.y r1 = r3.f6183e
            q3.j r2 = r3.f6181c
            q3.x r1 = r2.d(r1, r0)
            r3.f6184f = r1
        L15:
            java.lang.Object r4 = r1.a(r4)
            return r4
        L1a:
            r4.M()     // Catch: java.lang.NumberFormatException -> L2a java.io.IOException -> L31 x3.d -> L38 java.io.EOFException -> L3f
            t3.o$u r2 = t3.o.A     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L2a java.io.IOException -> L31 x3.d -> L38
            r2.getClass()     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L2a java.io.IOException -> L31 x3.d -> L38
            q3.n r4 = t3.o.u.c(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L2a java.io.IOException -> L31 x3.d -> L38
            goto L45
        L27:
            r4 = move-exception
            r2 = 0
            goto L41
        L2a:
            r4 = move-exception
            q3.u r0 = new q3.u
            r0.<init>(r4)
            throw r0
        L31:
            r4 = move-exception
            q3.o r0 = new q3.o
            r0.<init>(r4)
            throw r0
        L38:
            r4 = move-exception
            q3.u r0 = new q3.u
            r0.<init>(r4)
            throw r0
        L3f:
            r4 = move-exception
            r2 = 1
        L41:
            if (r2 == 0) goto L55
            q3.p r4 = q3.p.f5845b
        L45:
            r4.getClass()
            boolean r4 = r4 instanceof q3.p
            if (r4 == 0) goto L4e
            r4 = 0
            return r4
        L4e:
            java.lang.reflect.Type r4 = r0.f6587b
            java.lang.Object r4 = r1.a()
            return r4
        L55:
            q3.u r0 = new q3.u
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.m.a(x3.a):java.lang.Object");
    }

    @Override // q3.x
    public final void b(x3.c cVar, T t5) {
        w3.a<T> aVar = this.f6182d;
        t<T> tVar = this.f6179a;
        if (tVar == null) {
            x<T> xVar = this.f6184f;
            if (xVar == null) {
                xVar = this.f6181c.d(this.f6183e, aVar);
                this.f6184f = xVar;
            }
            xVar.b(cVar, t5);
        } else if (t5 == null) {
            cVar.q();
        } else {
            Type type = aVar.f6587b;
            o.A.b(cVar, tVar.a());
        }
    }
}
