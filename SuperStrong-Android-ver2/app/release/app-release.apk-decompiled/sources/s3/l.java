package s3;

import java.math.BigDecimal;
/* loaded from: classes.dex */
public final class l extends Number {

    /* renamed from: b  reason: collision with root package name */
    public final String f6023b;

    public l(String str) {
        this.f6023b = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f6023b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            String str = ((l) obj).f6023b;
            String str2 = this.f6023b;
            return str2 == str || str2.equals(str);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f6023b);
    }

    public final int hashCode() {
        return this.f6023b.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f6023b;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f6023b;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f6023b;
    }
}
