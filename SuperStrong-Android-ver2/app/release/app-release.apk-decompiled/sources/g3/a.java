package g3;

import android.graphics.Paint;
import android.graphics.Path;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f4148i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f4149j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4150k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4151l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f4152a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4153b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f4154c;

    /* renamed from: d  reason: collision with root package name */
    public int f4155d;

    /* renamed from: e  reason: collision with root package name */
    public int f4156e;

    /* renamed from: f  reason: collision with root package name */
    public int f4157f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f4158g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4159h;

    public a() {
        Paint paint = new Paint();
        this.f4159h = paint;
        this.f4152a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f4153b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f4154c = new Paint(paint2);
    }

    public final void a(int i6) {
        this.f4155d = y.a.c(i6, 68);
        this.f4156e = y.a.c(i6, 20);
        this.f4157f = y.a.c(i6, 0);
        this.f4152a.setColor(this.f4155d);
    }
}
