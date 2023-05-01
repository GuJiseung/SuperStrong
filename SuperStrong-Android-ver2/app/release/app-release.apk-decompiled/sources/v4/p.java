package v4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f6458a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6459a = new ArrayList(20);

        public final void a(String str, String str2) {
            ArrayList arrayList = this.f6459a;
            arrayList.add(str);
            arrayList.add(str2.trim());
        }

        public final void b(String str) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.f6459a;
                if (i6 >= arrayList.size()) {
                    return;
                }
                if (str.equalsIgnoreCase((String) arrayList.get(i6))) {
                    arrayList.remove(i6);
                    arrayList.remove(i6);
                    i6 -= 2;
                }
                i6 += 2;
            }
        }

        public final void c(String str, String str2) {
            p.a(str);
            p.b(str2, str);
            b(str);
            a(str, str2);
        }
    }

    public p(a aVar) {
        ArrayList arrayList = aVar.f6459a;
        this.f6458a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public p(String[] strArr) {
        this.f6458a = strArr;
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(w4.e.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = str.charAt(i6);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    throw new IllegalArgumentException(w4.e.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(b5.b.b("value for name ", str2, " == null"));
    }

    public static p f(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i6 = 0; i6 < strArr2.length; i6++) {
                String str = strArr2[i6];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i6] = str.trim();
            }
            for (int i7 = 0; i7 < strArr2.length; i7 += 2) {
                String str2 = strArr2[i7];
                String str3 = strArr2[i7 + 1];
                a(str2);
                b(str3, str2);
            }
            return new p(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public final String c(String str) {
        String[] strArr = this.f6458a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public final String d(int i6) {
        return this.f6458a[i6 * 2];
    }

    public final a e() {
        a aVar = new a();
        Collections.addAll(aVar.f6459a, this.f6458a);
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f6458a, this.f6458a);
    }

    public final String g(int i6) {
        return this.f6458a[(i6 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6458a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f6458a.length / 2;
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(d(i6));
            sb.append(": ");
            sb.append(g(i6));
            sb.append("\n");
        }
        return sb.toString();
    }
}
