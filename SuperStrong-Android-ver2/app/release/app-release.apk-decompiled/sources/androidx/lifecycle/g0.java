package androidx.lifecycle;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
/* loaded from: classes.dex */
public final class g0<VM extends f0> {

    /* renamed from: a  reason: collision with root package name */
    public final p4.b<VM> f1736a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.a<k0> f1737b;

    /* renamed from: c  reason: collision with root package name */
    public final k4.a<i0.b> f1738c;

    /* renamed from: d  reason: collision with root package name */
    public final k4.a<u0.a> f1739d;

    /* renamed from: e  reason: collision with root package name */
    public VM f1740e;

    public g0(l4.d dVar, k4.a aVar, k4.a aVar2, k4.a aVar3) {
        this.f1736a = dVar;
        this.f1737b = aVar;
        this.f1738c = aVar2;
        this.f1739d = aVar3;
    }

    public final Object a() {
        VM vm = this.f1740e;
        if (vm == null) {
            i0 i0Var = new i0(this.f1737b.a(), this.f1738c.a(), this.f1739d.a());
            p4.b<VM> bVar = this.f1736a;
            l4.f.f(bVar, "<this>");
            Class<?> a6 = ((l4.c) bVar).a();
            l4.f.d(a6, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            VM vm2 = (VM) i0Var.a(a6);
            this.f1740e = vm2;
            return vm2;
        }
        return vm;
    }
}
