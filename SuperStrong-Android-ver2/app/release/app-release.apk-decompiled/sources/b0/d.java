package b0;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2260a;

    /* renamed from: b  reason: collision with root package name */
    public a f2261b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2262c;

    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    public final void a(a aVar) {
        synchronized (this) {
            while (this.f2262c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f2261b == aVar) {
                return;
            }
            this.f2261b = aVar;
            if (this.f2260a) {
                aVar.onCancel();
            }
        }
    }
}
