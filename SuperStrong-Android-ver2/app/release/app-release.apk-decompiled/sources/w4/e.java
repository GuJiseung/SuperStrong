package w4;

import f5.r;
import f5.y;
import f5.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import v4.c0;
import v4.p;
import v4.q;
import v4.u;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f6593a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f6594b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final p f6595c = p.f(new String[0]);

    /* renamed from: d  reason: collision with root package name */
    public static final c0 f6596d;

    /* renamed from: e  reason: collision with root package name */
    public static final r f6597e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f6598f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f6599g;

    /* renamed from: h  reason: collision with root package name */
    public static final TimeZone f6600h;

    /* renamed from: i  reason: collision with root package name */
    public static final d f6601i;

    /* renamed from: j  reason: collision with root package name */
    public static final Method f6602j;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6603k;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r2v11, types: [w4.d] */
    static {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.<clinit>():void");
    }

    public static String a(String str) {
        InetAddress e6;
        int i6 = -1;
        int i7 = 0;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                e6 = e(1, str.length() - 1, str);
            } else {
                e6 = e(0, str.length(), str);
            }
            if (e6 == null) {
                return null;
            }
            byte[] address = e6.getAddress();
            if (address.length == 16) {
                int i8 = 0;
                int i9 = 0;
                while (i8 < address.length) {
                    int i10 = i8;
                    while (i10 < 16 && address[i10] == 0 && address[i10 + 1] == 0) {
                        i10 += 2;
                    }
                    int i11 = i10 - i8;
                    if (i11 > i9 && i11 >= 4) {
                        i6 = i8;
                        i9 = i11;
                    }
                    i8 = i10 + 2;
                }
                f5.e eVar = new f5.e();
                while (i7 < address.length) {
                    if (i7 == i6) {
                        eVar.G(58);
                        i7 += i9;
                        if (i7 == 16) {
                            eVar.G(58);
                        }
                    } else {
                        if (i7 > 0) {
                            eVar.G(58);
                        }
                        eVar.I(((address[i7] & 255) << 8) | (address[i7 + 1] & 255));
                        i7 += 2;
                    }
                }
                return eVar.s();
            } else if (address.length == 4) {
                return e6.getHostAddress();
            } else {
                throw new AssertionError(b5.b.b("Invalid IPv6 address: '", str, "'"));
            }
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            for (int i12 = 0; i12 < lowerCase.length(); i12++) {
                char charAt = lowerCase.charAt(i12);
                if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                }
                i7 = 1;
            }
            if (i7 != 0) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static void c(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e6) {
                if (!n(e6)) {
                    throw e6;
                }
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static int d(char c6) {
        if (c6 < '0' || c6 > '9') {
            char c7 = 'a';
            if (c6 < 'a' || c6 > 'f') {
                c7 = 'A';
                if (c6 < 'A' || c6 > 'F') {
                    return -1;
                }
            }
            return (c6 - c7) + 10;
        }
        return c6 - '0';
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
        if (r7 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00de, code lost:
        if (r8 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e1, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f3, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f9, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.InetAddress e(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.e.e(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int f(String str, int i6, int i7, char c6) {
        while (i6 < i7) {
            if (str.charAt(i6) == c6) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static int g(String str, int i6, int i7, String str2) {
        while (i6 < i7) {
            if (str2.indexOf(str.charAt(i6)) != -1) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static boolean h(y yVar, TimeUnit timeUnit) {
        try {
            return q(yVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String i(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String j(q qVar, boolean z5) {
        boolean contains = qVar.f6464d.contains(":");
        String str = qVar.f6464d;
        if (contains) {
            str = "[" + str + "]";
        }
        int i6 = qVar.f6465e;
        if (z5 || i6 != q.d(qVar.f6461a)) {
            return str + ":" + i6;
        }
        return str;
    }

    public static <T> List<T> k(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    public static <T> List<T> l(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static String[] m(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i6]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i6++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean n(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean o(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean p(q qVar, q qVar2) {
        if (qVar.f6464d.equals(qVar2.f6464d) && qVar.f6465e == qVar2.f6465e && qVar.f6461a.equals(qVar2.f6461a)) {
            return true;
        }
        return false;
    }

    public static boolean q(y yVar, int i6, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c6 = yVar.b().e() ? yVar.b().c() - nanoTime : Long.MAX_VALUE;
        yVar.b().d(Math.min(c6, timeUnit.toNanos(i6)) + nanoTime);
        try {
            f5.e eVar = new f5.e();
            while (yVar.B(eVar, 8192L) != -1) {
                eVar.c();
            }
            int i7 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            z b6 = yVar.b();
            if (i7 == 0) {
                b6.a();
                return true;
            }
            b6.d(nanoTime + c6);
            return true;
        } catch (InterruptedIOException unused) {
            int i8 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            z b7 = yVar.b();
            if (i8 == 0) {
                b7.a();
                return false;
            }
            b7.d(nanoTime + c6);
            return false;
        } catch (Throwable th) {
            int i9 = (c6 > Long.MAX_VALUE ? 1 : (c6 == Long.MAX_VALUE ? 0 : -1));
            z b8 = yVar.b();
            if (i9 == 0) {
                b8.a();
            } else {
                b8.d(nanoTime + c6);
            }
            throw th;
        }
    }

    public static int r(int i6, int i7, String str) {
        while (i6 < i7) {
            char charAt = str.charAt(i6);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static int s(int i6, int i7, String str) {
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            char charAt = str.charAt(i8);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i8 + 1;
            }
        }
        return i6;
    }

    public static p t(ArrayList arrayList) {
        p.a aVar = new p.a();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b5.c cVar = (b5.c) it.next();
            u.a aVar2 = a.f6589a;
            String m5 = cVar.f2497a.m();
            String m6 = cVar.f2498b.m();
            aVar2.getClass();
            aVar.a(m5, m6);
        }
        return new p(aVar);
    }

    public static String u(int i6, int i7, String str) {
        int r5 = r(i6, i7, str);
        return str.substring(r5, s(r5, i7, str));
    }
}
