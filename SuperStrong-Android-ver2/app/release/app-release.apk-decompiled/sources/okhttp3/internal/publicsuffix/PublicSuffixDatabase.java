package okhttp3.internal.publicsuffix;

import f5.l;
import f5.o;
import f5.q;
import f5.t;
import f5.z;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5617e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f5618f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f5619g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f5620h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5621a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f5622b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5623c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5624d;

    public static String a(byte[] bArr, byte[][] bArr2, int i6) {
        int i7;
        boolean z5;
        int i8;
        int i9;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (i10 + length) / 2;
            while (i11 > -1 && bArr[i11] != 10) {
                i11--;
            }
            int i12 = i11 + 1;
            int i13 = 1;
            while (true) {
                i7 = i12 + i13;
                if (bArr[i7] == 10) {
                    break;
                }
                i13++;
            }
            int i14 = i7 - i12;
            int i15 = i6;
            boolean z6 = false;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (z6) {
                    i8 = 46;
                    z5 = false;
                } else {
                    z5 = z6;
                    i8 = bArr2[i15][i16] & 255;
                }
                i9 = i8 - (bArr[i12 + i17] & 255);
                if (i9 == 0) {
                    i17++;
                    i16++;
                    if (i17 == i14) {
                        break;
                    } else if (bArr2[i15].length != i16) {
                        z6 = z5;
                    } else if (i15 == bArr2.length - 1) {
                        break;
                    } else {
                        i15++;
                        i16 = -1;
                        z6 = true;
                    }
                } else {
                    break;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i18 = i14 - i17;
                    int length2 = bArr2[i15].length - i16;
                    while (true) {
                        i15++;
                        if (i15 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i18) {
                        if (length2 <= i18) {
                            return new String(bArr, i12, i14, StandardCharsets.UTF_8);
                        }
                    }
                }
                i10 = i7 + 1;
            }
            length = i12 - 1;
        }
        return null;
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        z zVar = new z();
        Logger logger = q.f4001a;
        t tVar = new t(new l(new o(resourceAsStream, zVar)));
        try {
            byte[] bArr = new byte[tVar.readInt()];
            tVar.f(bArr);
            byte[] bArr2 = new byte[tVar.readInt()];
            tVar.f(bArr2);
            tVar.close();
            synchronized (this) {
                this.f5623c = bArr;
                this.f5624d = bArr2;
            }
            this.f5622b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    tVar.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
