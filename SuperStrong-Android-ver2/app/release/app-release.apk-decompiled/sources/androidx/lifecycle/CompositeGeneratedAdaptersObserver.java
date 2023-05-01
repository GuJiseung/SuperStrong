package androidx.lifecycle;

import androidx.lifecycle.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements m {

    /* renamed from: b  reason: collision with root package name */
    public final g[] f1679b;

    public CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.f1679b = gVarArr;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        new d.s(1);
        g[] gVarArr = this.f1679b;
        for (g gVar : gVarArr) {
            gVar.a();
        }
        for (g gVar2 : gVarArr) {
            gVar2.a();
        }
    }
}
