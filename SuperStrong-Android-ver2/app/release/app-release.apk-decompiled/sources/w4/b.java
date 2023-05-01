package w4;
/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final String f6590b;

    public b(String str, Object... objArr) {
        this.f6590b = e.i(str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f6590b);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
