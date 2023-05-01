package h3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f4441a;

    public a(float f6) {
        this.f4441a = f6;
    }

    @Override // h3.c
    public final float a(RectF rectF) {
        return this.f4441a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4441a == ((a) obj).f4441a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4441a)});
    }
}
