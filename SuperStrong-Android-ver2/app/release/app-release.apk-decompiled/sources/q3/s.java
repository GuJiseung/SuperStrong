package q3;

import java.math.BigInteger;
/* loaded from: classes.dex */
public final class s extends n {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?>[] f5847c = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: b  reason: collision with root package name */
    public Object f5848b;

    public s(Boolean bool) {
        f(bool);
    }

    public s(Number number) {
        f(number);
    }

    public s(String str) {
        f(str);
    }

    public static boolean e(s sVar) {
        Object obj = sVar.f5848b;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    @Override // q3.n
    public final double a() {
        if (this.f5848b instanceof Number) {
            return d().doubleValue();
        }
        return Double.parseDouble(b());
    }

    @Override // q3.n
    public final String b() {
        Object obj = this.f5848b;
        if (obj instanceof Number) {
            return d().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public final boolean c() {
        Object obj = this.f5848b;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(b());
    }

    public final Number d() {
        Object obj = this.f5848b;
        return obj instanceof String ? new s3.l((String) obj) : (Number) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f5848b == null) {
            return sVar.f5848b == null;
        } else if (e(this) && e(sVar)) {
            return d().longValue() == sVar.d().longValue();
        } else {
            Object obj2 = this.f5848b;
            if ((obj2 instanceof Number) && (sVar.f5848b instanceof Number)) {
                double doubleValue = d().doubleValue();
                double doubleValue2 = sVar.d().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(sVar.f5848b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L11
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            java.lang.String r7 = java.lang.String.valueOf(r7)
        Le:
            r6.f5848b = r7
            goto L3d
        L11:
            boolean r0 = r7 instanceof java.lang.Number
            r1 = 1
            if (r0 != 0) goto L39
            boolean r0 = r7 instanceof java.lang.String
            r2 = 0
            if (r0 == 0) goto L1d
        L1b:
            r0 = r1
            goto L35
        L1d:
            java.lang.Class r0 = r7.getClass()
            java.lang.Class<?>[] r3 = q3.s.f5847c
            r4 = r2
        L24:
            r5 = 16
            if (r4 >= r5) goto L34
            r5 = r3[r4]
            boolean r5 = r5.isAssignableFrom(r0)
            if (r5 == 0) goto L31
            goto L1b
        L31:
            int r4 = r4 + 1
            goto L24
        L34:
            r0 = r2
        L35:
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            c.a.g(r1)
            goto Le
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.s.f(java.lang.Object):void");
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f5848b == null) {
            return 31;
        }
        if (e(this)) {
            doubleToLongBits = d().longValue();
        } else {
            Object obj = this.f5848b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }
}
