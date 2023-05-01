package f5;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class v {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public static u f4019a;

    /* renamed from: b  reason: collision with root package name */
    public static long f4020b;

    public static void a(u uVar) {
        if (uVar.f4017f != null || uVar.f4018g != null) {
            throw new IllegalArgumentException();
        }
        if (uVar.f4015d) {
            return;
        }
        synchronized (v.class) {
            long j5 = f4020b + 8192;
            if (j5 > 65536) {
                return;
            }
            f4020b = j5;
            uVar.f4017f = f4019a;
            uVar.f4014c = 0;
            uVar.f4013b = 0;
            f4019a = uVar;
        }
    }

    public static u b() {
        synchronized (v.class) {
            u uVar = f4019a;
            if (uVar != null) {
                f4019a = uVar.f4017f;
                uVar.f4017f = null;
                f4020b -= 8192;
                return uVar;
            }
            return new u();
        }
    }
}
