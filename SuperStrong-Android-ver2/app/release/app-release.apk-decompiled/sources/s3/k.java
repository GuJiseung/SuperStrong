package s3;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f6022a;

    static {
        int i6;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i6 = Integer.parseInt(split[0]);
            if (i6 == 1 && split.length > 1) {
                i6 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i6 = -1;
        }
        if (i6 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i7 = 0; i7 < property.length(); i7++) {
                    char charAt = property.charAt(i7);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i6 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i6 = -1;
            }
        }
        if (i6 == -1) {
            i6 = 6;
        }
        f6022a = i6;
    }
}
