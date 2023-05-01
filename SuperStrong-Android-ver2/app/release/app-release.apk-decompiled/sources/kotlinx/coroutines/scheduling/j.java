package kotlinx.coroutines.scheduling;

import s4.y;
/* loaded from: classes.dex */
public final class j extends g {

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f5009d;

    public j(Runnable runnable, long j5, h hVar) {
        super(j5, hVar);
        this.f5009d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f5009d.run();
        } finally {
            this.f5007c.a();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5009d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(y.a(runnable));
        sb.append(", ");
        sb.append(this.f5006b);
        sb.append(", ");
        sb.append(this.f5007c);
        sb.append(']');
        return sb.toString();
    }
}
