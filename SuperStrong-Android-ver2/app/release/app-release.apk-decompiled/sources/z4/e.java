package z4;

import v4.b0;
/* loaded from: classes.dex */
public final class e {
    static {
        f5.h.d("\"\\");
        f5.h.d("\t ,=");
    }

    public static long a(b0 b0Var) {
        String c6 = b0Var.f6341g.c("Content-Length");
        if (c6 != null) {
            try {
                return Long.parseLong(c6);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    public static boolean b(b0 b0Var) {
        if (b0Var.f6336b.f6557b.equals("HEAD")) {
            return false;
        }
        int i6 = b0Var.f6338d;
        if (((i6 >= 100 && i6 < 200) || i6 == 204 || i6 == 304) && a(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0Var.c("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(String str, int i6) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x01f2, code lost:
        if ((r0.equals(r14) || (r0.endsWith(r14) && r0.charAt((r0.length() - r14.length()) - 1) == '.' && !w4.e.f6603k.matcher(r0).matches())) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0225, code lost:
        if (r11 != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0234, code lost:
        if (r11 == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0236, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0339, code lost:
        if (r0 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
        if (r19 <= 0) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x038e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(v4.j r33, v4.q r34, v4.p r35) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.e.d(v4.j, v4.q, v4.p):void");
    }

    public static int e(int i6, String str, String str2) {
        while (i6 < str.length() && str2.indexOf(str.charAt(i6)) == -1) {
            i6++;
        }
        return i6;
    }
}
