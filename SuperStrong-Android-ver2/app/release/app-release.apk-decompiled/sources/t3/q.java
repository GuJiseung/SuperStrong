package t3;

import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class q implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6217b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f6218c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f6219d;

    public q(Class cls, Class cls2, x xVar) {
        this.f6217b = cls;
        this.f6218c = cls2;
        this.f6219d = xVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        Class<? super T> cls = aVar.f6586a;
        if (cls != this.f6217b && cls != this.f6218c) {
            return null;
        }
        return this.f6219d;
    }

    public final String toString() {
        return "Factory[type=" + this.f6218c.getName() + "+" + this.f6217b.getName() + ",adapter=" + this.f6219d + "]";
    }
}
