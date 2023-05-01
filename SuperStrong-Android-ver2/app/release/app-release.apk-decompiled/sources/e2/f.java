package e2;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final double f3821a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f3822b = 0;

    public static double a(long j5) {
        return (SystemClock.elapsedRealtimeNanos() - j5) * f3821a;
    }
}
