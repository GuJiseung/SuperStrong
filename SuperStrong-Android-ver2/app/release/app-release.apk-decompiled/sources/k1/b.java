package k1;

import k1.c;
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f4742b;

    public b(c cVar) {
        this.f4742b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f4742b;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f4752c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
