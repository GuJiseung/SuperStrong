package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.j;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements m {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1701b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a f1702c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1701b = obj;
        this.f1702c = b.f1712c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        HashMap hashMap = this.f1702c.f1715a;
        Object obj = this.f1701b;
        b.a.a((List) hashMap.get(bVar), oVar, bVar, obj);
        b.a.a((List) hashMap.get(j.b.ON_ANY), oVar, bVar, obj);
    }
}
