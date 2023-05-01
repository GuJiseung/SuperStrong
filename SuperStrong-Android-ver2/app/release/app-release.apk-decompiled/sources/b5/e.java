package b5;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final f5.h f2518a = f5.h.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f2519b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f2520c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f2521d = new String[256];

    static {
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr = f2521d;
            if (i7 >= strArr.length) {
                break;
            }
            strArr[i7] = w4.e.i("%8s", Integer.toBinaryString(i7)).replace(' ', '0');
            i7++;
        }
        String[] strArr2 = f2520c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[1 | 8] = strArr2[1] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            int i10 = iArr[0];
            String[] strArr3 = f2520c;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + '|' + strArr3[i9];
            strArr3[i11 | 8] = strArr3[i10] + '|' + strArr3[i9] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f2520c;
            if (i6 >= strArr4.length) {
                return;
            }
            if (strArr4[i6] == null) {
                strArr4[i6] = f2521d[i6];
            }
            i6++;
        }
    }

    public static String a(boolean z5, int i6, int i7, byte b6, byte b7) {
        String i8;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = f2519b;
        if (b6 < strArr.length) {
            i8 = strArr[b6];
        } else {
            i8 = w4.e.i("0x%02x", Byte.valueOf(b6));
        }
        if (b7 == 0) {
            str = "";
        } else {
            String[] strArr2 = f2521d;
            if (b6 != 2 && b6 != 3) {
                if (b6 != 4 && b6 != 6) {
                    if (b6 != 7 && b6 != 8) {
                        String[] strArr3 = f2520c;
                        if (b7 < strArr3.length) {
                            str2 = strArr3[b7];
                        } else {
                            str2 = strArr2[b7];
                        }
                        if (b6 == 5 && (b7 & 4) != 0) {
                            str3 = "HEADERS";
                            str4 = "PUSH_PROMISE";
                        } else if (b6 == 0 && (b7 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        } else {
                            str = str2;
                        }
                        str = str2.replace(str3, str4);
                    }
                } else if (b7 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[b7];
                }
            }
            str = strArr2[b7];
        }
        Object[] objArr = new Object[5];
        if (z5) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        objArr[0] = str5;
        objArr[1] = Integer.valueOf(i6);
        objArr[2] = Integer.valueOf(i7);
        objArr[3] = i8;
        objArr[4] = str;
        return w4.e.i("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static void b(String str, Object... objArr) {
        throw new IOException(w4.e.i(str, objArr));
    }
}
