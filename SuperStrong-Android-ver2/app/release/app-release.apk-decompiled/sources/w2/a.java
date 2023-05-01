package w2;

import android.content.Context;
import android.graphics.Color;
import com.superstrong.android.R;
import d3.b;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f6580f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6581a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6582b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6583c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6584d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6585e;

    public a(Context context) {
        boolean b6 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int l5 = c.a.l(context, R.attr.elevationOverlayColor, 0);
        int l6 = c.a.l(context, R.attr.elevationOverlayAccentColor, 0);
        int l7 = c.a.l(context, R.attr.colorSurface, 0);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f6581a = b6;
        this.f6582b = l5;
        this.f6583c = l6;
        this.f6584d = l7;
        this.f6585e = f6;
    }

    public final int a(int i6, float f6) {
        boolean z5;
        float f7;
        float f8;
        int i7;
        if (this.f6581a) {
            if (y.a.c(i6, 255) == this.f6584d) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if (this.f6585e > 0.0f && f6 > 0.0f) {
                    f8 = Math.min(((((float) Math.log1p(f6 / f7)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f8 = 0.0f;
                }
                int alpha = Color.alpha(i6);
                int p5 = c.a.p(f8, y.a.c(i6, 255), this.f6582b);
                if (f8 > 0.0f && (i7 = this.f6583c) != 0) {
                    p5 = y.a.b(y.a.c(i7, f6580f), p5);
                }
                return y.a.c(p5, alpha);
            }
            return i6;
        }
        return i6;
    }
}
