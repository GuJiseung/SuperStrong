package v4;

import java.io.IOException;
/* loaded from: classes.dex */
public enum v {
    f6540c("http/1.0"),
    f6541d("http/1.1"),
    f6542e("spdy/3.1"),
    f6543f("h2"),
    f6544g("h2_prior_knowledge"),
    f6545h("quic");
    

    /* renamed from: b  reason: collision with root package name */
    public final String f6547b;

    v(String str) {
        this.f6547b = str;
    }

    public static v a(String str) {
        if (str.equals("http/1.0")) {
            return f6540c;
        }
        if (str.equals("http/1.1")) {
            return f6541d;
        }
        if (str.equals("h2_prior_knowledge")) {
            return f6544g;
        }
        if (str.equals("h2")) {
            return f6543f;
        }
        if (str.equals("spdy/3.1")) {
            return f6542e;
        }
        if (str.equals("quic")) {
            return f6545h;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f6547b;
    }
}
