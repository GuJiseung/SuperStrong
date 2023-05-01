package f5;

import androidx.fragment.app.r0;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public class h implements Serializable, Comparable<h> {

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f3979e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f  reason: collision with root package name */
    public static final h f3980f = g(new byte[0]);

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3981b;

    /* renamed from: c  reason: collision with root package name */
    public transient int f3982c;

    /* renamed from: d  reason: collision with root package name */
    public transient String f3983d;

    public h(byte[] bArr) {
        this.f3981b = bArr;
    }

    public static h b(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                int i7 = i6 * 2;
                bArr[i6] = (byte) (c(str.charAt(i7 + 1)) + (c(str.charAt(i7)) << 4));
            }
            return g(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
    }

    public static int c(char c6) {
        if (c6 < '0' || c6 > '9') {
            char c7 = 'a';
            if (c6 < 'a' || c6 > 'f') {
                c7 = 'A';
                if (c6 < 'A' || c6 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c6);
                }
            }
            return (c6 - c7) + 10;
        }
        return c6 - '0';
    }

    public static h d(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(a0.f3965a));
            hVar.f3983d = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static h g(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = r0.f1623a;
        byte[] bArr2 = this.f3981b;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int i8 = i6 + 1;
            bArr3[i6] = bArr[(bArr2[i7] & 255) >> 2];
            int i9 = i8 + 1;
            int i10 = i7 + 1;
            bArr3[i8] = bArr[((bArr2[i7] & 3) << 4) | ((bArr2[i10] & 255) >> 4)];
            int i11 = i9 + 1;
            int i12 = i7 + 2;
            bArr3[i9] = bArr[((bArr2[i10] & 15) << 2) | ((bArr2[i12] & 255) >> 6)];
            i6 = i11 + 1;
            bArr3[i11] = bArr[bArr2[i12] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i6 + 1;
                bArr3[i6] = bArr[(bArr2[length] & 255) >> 2];
                int i14 = i13 + 1;
                int i15 = length + 1;
                bArr3[i13] = bArr[((bArr2[i15] & 255) >> 4) | ((bArr2[length] & 3) << 4)];
                bArr3[i14] = bArr[(bArr2[i15] & 15) << 2];
                bArr3[i14 + 1] = 61;
            }
        } else {
            int i16 = i6 + 1;
            bArr3[i6] = bArr[(bArr2[length] & 255) >> 2];
            int i17 = i16 + 1;
            bArr3[i16] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i17] = 61;
            bArr3[i17 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(f5.h r10) {
        /*
            r9 = this;
            f5.h r10 = (f5.h) r10
            int r0 = r9.j()
            int r1 = r10.j()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L2b
            byte r7 = r9.e(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.e(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = r6
            goto L31
        L29:
            r3 = r5
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.compareTo(java.lang.Object):int");
    }

    public byte e(int i6) {
        return this.f3981b[i6];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int j5 = hVar.j();
            byte[] bArr = this.f3981b;
            if (j5 == bArr.length && hVar.h(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f3981b;
        char[] cArr = new char[bArr.length * 2];
        int i6 = 0;
        for (byte b6 : bArr) {
            int i7 = i6 + 1;
            char[] cArr2 = f3979e;
            cArr[i6] = cArr2[(b6 >> 4) & 15];
            i6 = i7 + 1;
            cArr[i7] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    public boolean h(int i6, byte[] bArr, int i7, int i8) {
        boolean z5;
        if (i6 < 0) {
            return false;
        }
        byte[] bArr2 = this.f3981b;
        if (i6 > bArr2.length - i8 || i7 < 0 || i7 > bArr.length - i8) {
            return false;
        }
        Charset charset = a0.f3965a;
        int i9 = 0;
        while (true) {
            if (i9 < i8) {
                if (bArr2[i9 + i6] != bArr[i9 + i7]) {
                    z5 = false;
                    break;
                }
                i9++;
            } else {
                z5 = true;
                break;
            }
        }
        if (!z5) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i6 = this.f3982c;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = Arrays.hashCode(this.f3981b);
        this.f3982c = hashCode;
        return hashCode;
    }

    public boolean i(h hVar, int i6) {
        return hVar.h(0, this.f3981b, 0, i6);
    }

    public int j() {
        return this.f3981b.length;
    }

    public h k() {
        byte[] bArr = this.f3981b;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        } else if (64 == bArr.length) {
            return this;
        } else {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, 64);
            return new h(bArr2);
        }
    }

    public h l() {
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f3981b;
            if (i6 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i6];
            if (b6 >= 65 && b6 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i6] = (byte) (b6 + 32);
                for (int i7 = i6 + 1; i7 < bArr2.length; i7++) {
                    byte b7 = bArr2[i7];
                    if (b7 >= 65 && b7 <= 90) {
                        bArr2[i7] = (byte) (b7 + 32);
                    }
                }
                return new h(bArr2);
            }
            i6++;
        }
    }

    public String m() {
        String str = this.f3983d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f3981b, a0.f3965a);
        this.f3983d = str2;
        return str2;
    }

    public void n(e eVar) {
        byte[] bArr = this.f3981b;
        eVar.m0write(bArr, 0, bArr.length);
    }

    public String toString() {
        byte[] bArr = this.f3981b;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String m5 = m();
        int length = m5.length();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 < length) {
                if (i7 == 64) {
                    break;
                }
                int codePointAt = m5.codePointAt(i6);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i7++;
                    i6 += Character.charCount(codePointAt);
                }
            } else {
                i6 = m5.length();
                break;
            }
        }
        i6 = -1;
        if (i6 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + f() + "]";
            }
            return "[size=" + bArr.length + " hex=" + k().f() + "…]";
        }
        String replace = m5.substring(0, i6).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i6 < m5.length()) {
            return "[size=" + bArr.length + " text=" + replace + "…]";
        }
        return b5.b.b("[text=", replace, "]");
    }
}
