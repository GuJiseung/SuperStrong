package i;

import androidx.activity.result.c;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f4558d;

    /* renamed from: c  reason: collision with root package name */
    public final b f4559c = new b();

    public static a A() {
        if (f4558d != null) {
            return f4558d;
        }
        synchronized (a.class) {
            if (f4558d == null) {
                f4558d = new a();
            }
        }
        return f4558d;
    }

    public final boolean B() {
        return this.f4559c.A();
    }
}
