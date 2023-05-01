package x3;

import java.io.Closeable;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import q3.s;
import t3.e;
/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: q  reason: collision with root package name */
    public static final char[] f6692q = ")]}'\n".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public final Reader f6693b;

    /* renamed from: j  reason: collision with root package name */
    public long f6701j;

    /* renamed from: k  reason: collision with root package name */
    public int f6702k;

    /* renamed from: l  reason: collision with root package name */
    public String f6703l;

    /* renamed from: m  reason: collision with root package name */
    public int[] f6704m;

    /* renamed from: o  reason: collision with root package name */
    public String[] f6706o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f6707p;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6694c = false;

    /* renamed from: d  reason: collision with root package name */
    public final char[] f6695d = new char[1024];

    /* renamed from: e  reason: collision with root package name */
    public int f6696e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f6697f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f6698g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f6699h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f6700i = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f6705n = 1;

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0101a extends androidx.activity.result.c {
        public final void A(a aVar) {
            int i6;
            if (aVar instanceof e) {
                e eVar = (e) aVar;
                eVar.T(5);
                Map.Entry entry = (Map.Entry) ((Iterator) eVar.U()).next();
                eVar.W(entry.getValue());
                eVar.W(new s((String) entry.getKey()));
                return;
            }
            int i7 = aVar.f6700i;
            if (i7 == 0) {
                i7 = aVar.j();
            }
            if (i7 == 13) {
                i6 = 9;
            } else if (i7 == 12) {
                i6 = 8;
            } else if (i7 == 14) {
                i6 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + b.a(aVar.M()) + aVar.s());
            }
            aVar.f6700i = i6;
        }
    }

    static {
        androidx.activity.result.c.f285b = new C0101a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f6704m = iArr;
        iArr[0] = 6;
        this.f6706o = new String[32];
        this.f6707p = new int[32];
        this.f6693b = reader;
    }

    public int E() {
        String J;
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 15) {
            long j5 = this.f6701j;
            int i7 = (int) j5;
            if (j5 != i7) {
                throw new NumberFormatException("Expected an int but was " + this.f6701j + s());
            }
            this.f6700i = 0;
            int[] iArr = this.f6707p;
            int i8 = this.f6705n - 1;
            iArr[i8] = iArr[i8] + 1;
            return i7;
        }
        if (i6 == 16) {
            this.f6703l = new String(this.f6695d, this.f6696e, this.f6702k);
            this.f6696e += this.f6702k;
        } else if (i6 != 8 && i6 != 9 && i6 != 10) {
            throw new IllegalStateException("Expected an int but was " + b.a(M()) + s());
        } else {
            if (i6 == 10) {
                J = L();
            } else {
                J = J(i6 == 8 ? '\'' : '\"');
            }
            this.f6703l = J;
            try {
                int parseInt = Integer.parseInt(this.f6703l);
                this.f6700i = 0;
                int[] iArr2 = this.f6707p;
                int i9 = this.f6705n - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6700i = 11;
        double parseDouble = Double.parseDouble(this.f6703l);
        int i10 = (int) parseDouble;
        if (i10 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f6703l + s());
        }
        this.f6703l = null;
        this.f6700i = 0;
        int[] iArr3 = this.f6707p;
        int i11 = this.f6705n - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return i10;
    }

    public long F() {
        String J;
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 15) {
            this.f6700i = 0;
            int[] iArr = this.f6707p;
            int i7 = this.f6705n - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f6701j;
        }
        if (i6 == 16) {
            this.f6703l = new String(this.f6695d, this.f6696e, this.f6702k);
            this.f6696e += this.f6702k;
        } else if (i6 != 8 && i6 != 9 && i6 != 10) {
            throw new IllegalStateException("Expected a long but was " + b.a(M()) + s());
        } else {
            if (i6 == 10) {
                J = L();
            } else {
                J = J(i6 == 8 ? '\'' : '\"');
            }
            this.f6703l = J;
            try {
                long parseLong = Long.parseLong(this.f6703l);
                this.f6700i = 0;
                int[] iArr2 = this.f6707p;
                int i8 = this.f6705n - 1;
                iArr2[i8] = iArr2[i8] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f6700i = 11;
        double parseDouble = Double.parseDouble(this.f6703l);
        long j5 = (long) parseDouble;
        if (j5 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f6703l + s());
        }
        this.f6703l = null;
        this.f6700i = 0;
        int[] iArr3 = this.f6707p;
        int i9 = this.f6705n - 1;
        iArr3[i9] = iArr3[i9] + 1;
        return j5;
    }

    public String G() {
        char c6;
        String J;
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 14) {
            J = L();
        } else {
            if (i6 == 12) {
                c6 = '\'';
            } else if (i6 != 13) {
                throw new IllegalStateException("Expected a name but was " + b.a(M()) + s());
            } else {
                c6 = '\"';
            }
            J = J(c6);
        }
        this.f6700i = 0;
        this.f6706o[this.f6705n - 1] = J;
        return J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r0 != '/') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        r9.f6696e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r3 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
        r9.f6696e = r3 - 1;
        r1 = o(2);
        r9.f6696e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r1 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
        h();
        r1 = r9.f6696e;
        r3 = r4[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r3 == '*') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r3 == '/') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        r9.f6696e = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
        r9.f6696e = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r9.f6696e + 2) <= r9.f6697f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        if (o(2) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r0 = r9.f6696e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
        if (r4[r0] != '\n') goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        r9.f6698g++;
        r9.f6699h = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
        if (r3 >= 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ae, code lost:
        if (r4[r9.f6696e + r3] == "*\/".charAt(r3)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b0, code lost:
        r9.f6696e++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
        if (r2 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
        S("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
        r9.f6696e = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cb, code lost:
        if (r0 != '#') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d5, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(boolean r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.a.H(boolean):int");
    }

    public void I() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 != 7) {
            throw new IllegalStateException("Expected null but was " + b.a(M()) + s());
        }
        this.f6700i = 0;
        int[] iArr = this.f6707p;
        int i7 = this.f6705n - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    public final String J(char c6) {
        StringBuilder sb = null;
        while (true) {
            int i6 = this.f6696e;
            int i7 = this.f6697f;
            int i8 = i6;
            while (true) {
                char[] cArr = this.f6695d;
                if (i8 < i7) {
                    int i9 = i8 + 1;
                    char c7 = cArr[i8];
                    if (c7 == c6) {
                        this.f6696e = i9;
                        int i10 = (i9 - i6) - 1;
                        if (sb == null) {
                            return new String(cArr, i6, i10);
                        }
                        sb.append(cArr, i6, i10);
                        return sb.toString();
                    } else if (c7 == '\\') {
                        this.f6696e = i9;
                        int i11 = (i9 - i6) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i11 + 1) * 2, 16));
                        }
                        sb.append(cArr, i6, i11);
                        sb.append(O());
                    } else {
                        if (c7 == '\n') {
                            this.f6698g++;
                            this.f6699h = i9;
                        }
                        i8 = i9;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i8 - i6) * 2, 16));
                    }
                    sb.append(cArr, i6, i8 - i6);
                    this.f6696e = i8;
                    if (!o(1)) {
                        S("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public String K() {
        String str;
        char c6;
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 10) {
            str = L();
        } else {
            if (i6 == 8) {
                c6 = '\'';
            } else if (i6 == 9) {
                c6 = '\"';
            } else if (i6 == 11) {
                str = this.f6703l;
                this.f6703l = null;
            } else if (i6 == 15) {
                str = Long.toString(this.f6701j);
            } else if (i6 != 16) {
                throw new IllegalStateException("Expected a string but was " + b.a(M()) + s());
            } else {
                str = new String(this.f6695d, this.f6696e, this.f6702k);
                this.f6696e += this.f6702k;
            }
            str = J(c6);
        }
        this.f6700i = 0;
        int[] iArr = this.f6707p;
        int i7 = this.f6705n - 1;
        iArr[i7] = iArr[i7] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        h();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String L() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f6696e
            int r4 = r3 + r2
            int r5 = r7.f6697f
            char[] r6 = r7.f6695d
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.h()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.o(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f6696e
            r0.append(r6, r3, r2)
            int r3 = r7.f6696e
            int r3 = r3 + r2
            r7.f6696e = r3
            r2 = 1
            boolean r2 = r7.o(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f6696e
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f6696e
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f6696e
            int r2 = r2 + r1
            r7.f6696e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.a.L():java.lang.String");
    }

    public int M() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        switch (i6) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void N(int i6) {
        int i7 = this.f6705n;
        int[] iArr = this.f6704m;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[i7 * 2];
            int[] iArr3 = new int[i7 * 2];
            String[] strArr = new String[i7 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            System.arraycopy(this.f6707p, 0, iArr3, 0, this.f6705n);
            System.arraycopy(this.f6706o, 0, strArr, 0, this.f6705n);
            this.f6704m = iArr2;
            this.f6707p = iArr3;
            this.f6706o = strArr;
        }
        int[] iArr4 = this.f6704m;
        int i8 = this.f6705n;
        this.f6705n = i8 + 1;
        iArr4[i8] = i6;
    }

    public final char O() {
        int i6;
        int i7;
        if (this.f6696e == this.f6697f && !o(1)) {
            S("Unterminated escape sequence");
            throw null;
        }
        int i8 = this.f6696e;
        int i9 = i8 + 1;
        this.f6696e = i9;
        char[] cArr = this.f6695d;
        char c6 = cArr[i8];
        if (c6 == '\n') {
            this.f6698g++;
            this.f6699h = i9;
        } else if (c6 != '\"' && c6 != '\'' && c6 != '/' && c6 != '\\') {
            if (c6 != 'b') {
                if (c6 != 'f') {
                    if (c6 != 'n') {
                        if (c6 != 'r') {
                            if (c6 != 't') {
                                if (c6 != 'u') {
                                    S("Invalid escape sequence");
                                    throw null;
                                } else if (i9 + 4 > this.f6697f && !o(4)) {
                                    S("Unterminated escape sequence");
                                    throw null;
                                } else {
                                    int i10 = this.f6696e;
                                    int i11 = i10 + 4;
                                    char c7 = 0;
                                    while (i10 < i11) {
                                        char c8 = cArr[i10];
                                        char c9 = (char) (c7 << 4);
                                        if (c8 < '0' || c8 > '9') {
                                            if (c8 >= 'a' && c8 <= 'f') {
                                                i6 = c8 - 'a';
                                            } else if (c8 < 'A' || c8 > 'F') {
                                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f6696e, 4)));
                                            } else {
                                                i6 = c8 - 'A';
                                            }
                                            i7 = i6 + 10;
                                        } else {
                                            i7 = c8 - '0';
                                        }
                                        c7 = (char) (i7 + c9);
                                        i10++;
                                    }
                                    this.f6696e += 4;
                                    return c7;
                                }
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c6;
    }

    public final void P(char c6) {
        while (true) {
            int i6 = this.f6696e;
            int i7 = this.f6697f;
            while (true) {
                if (i6 < i7) {
                    int i8 = i6 + 1;
                    char c7 = this.f6695d[i6];
                    if (c7 == c6) {
                        this.f6696e = i8;
                        return;
                    } else if (c7 == '\\') {
                        this.f6696e = i8;
                        O();
                        break;
                    } else {
                        if (c7 == '\n') {
                            this.f6698g++;
                            this.f6699h = i8;
                        }
                        i6 = i8;
                    }
                } else {
                    this.f6696e = i6;
                    if (!o(1)) {
                        S("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void Q() {
        char c6;
        do {
            if (this.f6696e >= this.f6697f && !o(1)) {
                return;
            }
            int i6 = this.f6696e;
            int i7 = i6 + 1;
            this.f6696e = i7;
            c6 = this.f6695d[i6];
            if (c6 == '\n') {
                this.f6698g++;
                this.f6699h = i7;
                return;
            }
        } while (c6 != '\r');
    }

    public void R() {
        char c6;
        int i6 = 0;
        do {
            int i7 = this.f6700i;
            if (i7 == 0) {
                i7 = j();
            }
            if (i7 == 3) {
                N(1);
            } else if (i7 == 1) {
                N(3);
            } else {
                if (i7 == 4 || i7 == 2) {
                    this.f6705n--;
                    i6--;
                } else if (i7 != 14 && i7 != 10) {
                    if (i7 != 8 && i7 != 12) {
                        if (i7 != 9 && i7 != 13) {
                            if (i7 == 16) {
                                this.f6696e += this.f6702k;
                            }
                        } else {
                            c6 = '\"';
                        }
                    } else {
                        c6 = '\'';
                    }
                    P(c6);
                } else {
                    do {
                        int i8 = 0;
                        while (true) {
                            int i9 = this.f6696e + i8;
                            if (i9 < this.f6697f) {
                                char c7 = this.f6695d[i9];
                                if (c7 != '\t' && c7 != '\n' && c7 != '\f' && c7 != '\r' && c7 != ' ') {
                                    if (c7 != '#') {
                                        if (c7 != ',') {
                                            if (c7 != '/' && c7 != '=') {
                                                if (c7 != '{' && c7 != '}' && c7 != ':') {
                                                    if (c7 != ';') {
                                                        switch (c7) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i8++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f6696e = i9;
                            }
                        }
                        h();
                        this.f6696e += i8;
                    } while (o(1));
                }
                this.f6700i = 0;
            }
            i6++;
            this.f6700i = 0;
        } while (i6 != 0);
        int[] iArr = this.f6707p;
        int i10 = this.f6705n;
        int i11 = i10 - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f6706o[i10 - 1] = "null";
    }

    public final void S(String str) {
        throw new d(str + s());
    }

    public void c() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 3) {
            N(1);
            this.f6707p[this.f6705n - 1] = 0;
            this.f6700i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + b.a(M()) + s());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6700i = 0;
        this.f6704m[0] = 8;
        this.f6705n = 1;
        this.f6693b.close();
    }

    public void f() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 1) {
            N(3);
            this.f6700i = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + b.a(M()) + s());
    }

    public final void h() {
        if (this.f6694c) {
            return;
        }
        S("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0205, code lost:
        if (r(r1) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0207, code lost:
        if (r10 != 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0209, code lost:
        if (r18 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x020f, code lost:
        if (r12 != Long.MIN_VALUE) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0211, code lost:
        if (r11 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0217, code lost:
        if (r12 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0219, code lost:
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x021b, code lost:
        if (r11 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x021e, code lost:
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x021f, code lost:
        r21.f6701j = r12;
        r21.f6696e += r6;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0229, code lost:
        if (r10 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x022c, code lost:
        if (r10 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x022f, code lost:
        if (r10 != 7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0231, code lost:
        r21.f6702k = r6;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0235, code lost:
        r7 = r1;
        r21.f6700i = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.a.j():int");
    }

    public void k() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + b.a(M()) + s());
        }
        int i7 = this.f6705n - 1;
        this.f6705n = i7;
        int[] iArr = this.f6707p;
        int i8 = i7 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f6700i = 0;
    }

    public void n() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + b.a(M()) + s());
        }
        int i7 = this.f6705n - 1;
        this.f6705n = i7;
        this.f6706o[i7] = null;
        int[] iArr = this.f6707p;
        int i8 = i7 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f6700i = 0;
    }

    public final boolean o(int i6) {
        int i7;
        int i8;
        int i9 = this.f6699h;
        int i10 = this.f6696e;
        this.f6699h = i9 - i10;
        int i11 = this.f6697f;
        char[] cArr = this.f6695d;
        if (i11 != i10) {
            int i12 = i11 - i10;
            this.f6697f = i12;
            System.arraycopy(cArr, i10, cArr, 0, i12);
        } else {
            this.f6697f = 0;
        }
        this.f6696e = 0;
        do {
            int i13 = this.f6697f;
            int read = this.f6693b.read(cArr, i13, cArr.length - i13);
            if (read == -1) {
                return false;
            }
            i7 = this.f6697f + read;
            this.f6697f = i7;
            if (this.f6698g == 0 && (i8 = this.f6699h) == 0 && i7 > 0 && cArr[0] == 65279) {
                this.f6696e++;
                this.f6699h = i8 + 1;
                i6++;
                continue;
            }
        } while (i7 < i6);
        return true;
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i6 = this.f6705n;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = this.f6704m[i7];
            if (i8 == 1 || i8 == 2) {
                sb.append('[');
                sb.append(this.f6707p[i7]);
                sb.append(']');
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                sb.append('.');
                String str = this.f6706o[i7];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean q() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        return (i6 == 2 || i6 == 4) ? false : true;
    }

    public final boolean r(char c6) {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    public final String s() {
        return " at line " + (this.f6698g + 1) + " column " + ((this.f6696e - this.f6699h) + 1) + " path " + p();
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public boolean w() {
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 5) {
            this.f6700i = 0;
            int[] iArr = this.f6707p;
            int i7 = this.f6705n - 1;
            iArr[i7] = iArr[i7] + 1;
            return true;
        } else if (i6 != 6) {
            throw new IllegalStateException("Expected a boolean but was " + b.a(M()) + s());
        } else {
            this.f6700i = 0;
            int[] iArr2 = this.f6707p;
            int i8 = this.f6705n - 1;
            iArr2[i8] = iArr2[i8] + 1;
            return false;
        }
    }

    public double x() {
        String J;
        int i6 = this.f6700i;
        if (i6 == 0) {
            i6 = j();
        }
        if (i6 == 15) {
            this.f6700i = 0;
            int[] iArr = this.f6707p;
            int i7 = this.f6705n - 1;
            iArr[i7] = iArr[i7] + 1;
            return this.f6701j;
        }
        if (i6 == 16) {
            this.f6703l = new String(this.f6695d, this.f6696e, this.f6702k);
            this.f6696e += this.f6702k;
        } else {
            if (i6 == 8 || i6 == 9) {
                J = J(i6 == 8 ? '\'' : '\"');
            } else if (i6 == 10) {
                J = L();
            } else if (i6 != 11) {
                throw new IllegalStateException("Expected a double but was " + b.a(M()) + s());
            }
            this.f6703l = J;
        }
        this.f6700i = 11;
        double parseDouble = Double.parseDouble(this.f6703l);
        if (!this.f6694c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new d("JSON forbids NaN and infinities: " + parseDouble + s());
        }
        this.f6703l = null;
        this.f6700i = 0;
        int[] iArr2 = this.f6707p;
        int i8 = this.f6705n - 1;
        iArr2[i8] = iArr2[i8] + 1;
        return parseDouble;
    }
}
