package u3;

import java.util.TimeZone;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f6242a = TimeZone.getTimeZone("UTC");

    public static boolean a(char c6, int i6, String str) {
        return i6 < str.length() && str.charAt(i6) == c6;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TRY_LEAVE, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b9, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c9, B:51:0x00cc, B:45:0x00b4), top: B:105:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6 A[Catch: IllegalArgumentException -> 0x01ce, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, IndexOutOfBoundsException -> 0x01d2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01d0, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b9, B:57:0x00db, B:59:0x00e1, B:86:0x0196, B:68:0x00f6, B:69:0x0111, B:70:0x0112, B:74:0x012e, B:76:0x013b, B:79:0x0144, B:81:0x0163, B:84:0x0173, B:85:0x0195, B:73:0x011d, B:88:0x01c6, B:89:0x01cd, B:50:0x00c9, B:51:0x00cc, B:45:0x00b4), top: B:105:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i6, int i7, String str) {
        int i8;
        int i9;
        if (i6 < 0 || i7 > str.length() || i6 > i7) {
            throw new NumberFormatException(str);
        }
        if (i6 < i7) {
            i9 = i6 + 1;
            int digit = Character.digit(str.charAt(i6), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i6, i7));
            }
            i8 = -digit;
        } else {
            i8 = 0;
            i9 = i6;
        }
        while (i9 < i7) {
            int i10 = i9 + 1;
            int digit2 = Character.digit(str.charAt(i9), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i6, i7));
            }
            i8 = (i8 * 10) - digit2;
            i9 = i10;
        }
        return -i8;
    }
}
