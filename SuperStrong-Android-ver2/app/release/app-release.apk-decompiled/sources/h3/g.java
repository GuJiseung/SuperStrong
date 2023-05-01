package h3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f4486a;

    public g(float f6) {
        this.f4486a = f6;
    }

    @Override // h3.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f4486a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f4486a == ((g) obj).f4486a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4486a)});
    }
}
