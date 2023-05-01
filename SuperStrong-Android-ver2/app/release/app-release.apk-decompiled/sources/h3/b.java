package h3;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f4442a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4443b;

    public b(float f6, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4442a;
            f6 += ((b) cVar).f4443b;
        }
        this.f4442a = cVar;
        this.f4443b = f6;
    }

    @Override // h3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f4442a.a(rectF) + this.f4443b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f4442a.equals(bVar.f4442a) && this.f4443b == bVar.f4443b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4442a, Float.valueOf(this.f4443b)});
    }
}
