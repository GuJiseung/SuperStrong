package d;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static u f3681d;

    /* renamed from: a  reason: collision with root package name */
    public long f3682a;

    /* renamed from: b  reason: collision with root package name */
    public long f3683b;

    /* renamed from: c  reason: collision with root package name */
    public int f3684c;

    public final void a(long j5, double d6, double d7) {
        float f6;
        float f7;
        double d8;
        double d9 = (0.01720197f * (((float) (j5 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f7 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f7) * 3.4906598739326E-4d) + (Math.sin(d9) * 0.03341960161924362d) + d9 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d9) * 0.0053d) + ((float) Math.round((f6 - 9.0E-4f) - d8)) + 9.0E-4f + ((-d7) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d10 = 0.01745329238474369d * d6;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d10))) / (Math.cos(asin) * Math.cos(d10));
        if (sin3 >= 1.0d) {
            this.f3684c = 1;
        } else if (sin3 > -1.0d) {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f3682a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f3683b = round;
            if (round >= j5 || this.f3682a <= j5) {
                this.f3684c = 1;
                return;
            } else {
                this.f3684c = 0;
                return;
            }
        } else {
            this.f3684c = 0;
        }
        this.f3682a = -1L;
        this.f3683b = -1L;
    }
}
