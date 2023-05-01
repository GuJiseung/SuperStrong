package v;

import v.e;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f6244b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6245c;

    public b(e.a aVar, Object obj) {
        this.f6244b = aVar;
        this.f6245c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6244b.f6257a = this.f6245c;
    }
}
