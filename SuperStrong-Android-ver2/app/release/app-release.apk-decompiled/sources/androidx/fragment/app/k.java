package androidx.fragment.app;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1528b;

    public k(ArrayList arrayList) {
        this.f1528b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.a(this.f1528b, 4);
    }
}
