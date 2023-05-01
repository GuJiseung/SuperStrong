package h5;

import f5.d;
import f5.e;
import f5.h;
import g5.f;
import java.io.EOFException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import q3.j;
import q3.x;
import v4.a0;
import v4.s;
import v4.y;
import x3.c;
/* loaded from: classes.dex */
public final class b<T> implements f<T, a0> {

    /* renamed from: d  reason: collision with root package name */
    public static final s f4554d = s.a("application/json; charset=UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f4555e = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public final j f4556b;

    /* renamed from: c  reason: collision with root package name */
    public final x<T> f4557c;

    public b(j jVar, x<T> xVar) {
        this.f4556b = jVar;
        this.f4557c = xVar;
    }

    @Override // g5.f
    public final a0 a(Object obj) {
        e eVar = new e();
        c e6 = this.f4556b.e(new OutputStreamWriter(new d(eVar), f4555e));
        this.f4557c.b(e6, obj);
        e6.close();
        try {
            return new y(f4554d, new h(eVar.q(eVar.f3977c)));
        } catch (EOFException e7) {
            throw new AssertionError(e7);
        }
    }
}
