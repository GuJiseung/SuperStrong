package z4;

import java.net.ProtocolException;
import v4.v;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final v f7094a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7095b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7096c;

    public j(v vVar, int i6, String str) {
        this.f7094a = vVar;
        this.f7095b = i6;
        this.f7096c = str;
    }

    public static j a(String str) {
        int i6;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        v vVar = v.f6540c;
        if (startsWith) {
            i6 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                vVar = v.f6541d;
            }
        } else if (!str.startsWith("ICY ")) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        } else {
            i6 = 4;
        }
        int i7 = i6 + 3;
        if (str.length() >= i7) {
            try {
                int parseInt = Integer.parseInt(str.substring(i6, i7));
                if (str.length() <= i7) {
                    str2 = "";
                } else if (str.charAt(i7) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                } else {
                    str2 = str.substring(i6 + 4);
                }
                return new j(vVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7094a == v.f6540c ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f7095b);
        String str = this.f7096c;
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        return sb.toString();
    }
}
