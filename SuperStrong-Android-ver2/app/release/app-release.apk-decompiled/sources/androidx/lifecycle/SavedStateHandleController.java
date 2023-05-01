package androidx.lifecycle;

import androidx.lifecycle.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements m {

    /* renamed from: b  reason: collision with root package name */
    public final String f1704b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1705c = false;

    /* renamed from: d  reason: collision with root package name */
    public final z f1706d;

    public SavedStateHandleController(String str, z zVar) {
        this.f1704b = str;
        this.f1706d = zVar;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        if (bVar == j.b.ON_DESTROY) {
            this.f1705c = false;
            oVar.v().c(this);
        }
    }
}
