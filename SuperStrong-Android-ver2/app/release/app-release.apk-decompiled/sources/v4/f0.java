package v4;
/* loaded from: classes.dex */
public enum f0 {
    f6392c("TLSv1.3"),
    f6393d("TLSv1.2"),
    f6394e("TLSv1.1"),
    f6395f("TLSv1"),
    f6396g("SSLv3");
    

    /* renamed from: b  reason: collision with root package name */
    public final String f6398b;

    f0(String str) {
        this.f6398b = str;
    }

    public static f0 a(String str) {
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c6 = 0;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c6 = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c6 = 2;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c6 = 3;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return f6394e;
            case 1:
                return f6393d;
            case 2:
                return f6392c;
            case 3:
                return f6396g;
            case 4:
                return f6395f;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
        }
    }
}
