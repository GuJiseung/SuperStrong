package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.p;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final long f5010a = c.b.c("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    public static final int f5011b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5012c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f5013d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f5014e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f5015f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f5016g;

    static {
        int i6 = p.f4972a;
        if (i6 < 2) {
            i6 = 2;
        }
        f5011b = c.b.d("kotlinx.coroutines.scheduler.core.pool.size", i6, 1, 0, 8);
        f5012c = c.b.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f5013d = TimeUnit.SECONDS.toNanos(c.b.c("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5014e = e.f5004c;
        f5015f = new i(0);
        f5016g = new i(1);
    }
}
