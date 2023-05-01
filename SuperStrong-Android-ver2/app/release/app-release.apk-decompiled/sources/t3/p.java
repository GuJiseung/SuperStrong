package t3;

import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class p implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6215b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f6216c;

    public p(Class cls, x xVar) {
        this.f6215b = cls;
        this.f6216c = xVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        if (aVar.f6586a == this.f6215b) {
            return this.f6216c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f6215b.getName() + ",adapter=" + this.f6216c + "]";
    }
}
