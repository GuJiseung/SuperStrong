package x3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f6708k = new String[128];

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f6709l;

    /* renamed from: b  reason: collision with root package name */
    public final Writer f6710b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f6711c;

    /* renamed from: d  reason: collision with root package name */
    public int f6712d;

    /* renamed from: e  reason: collision with root package name */
    public String f6713e;

    /* renamed from: f  reason: collision with root package name */
    public String f6714f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6715g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6716h;

    /* renamed from: i  reason: collision with root package name */
    public String f6717i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6718j;

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            f6708k[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = f6708k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f6709l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f6711c = iArr;
        this.f6712d = 0;
        if (iArr.length == 0) {
            int[] iArr2 = new int[0 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, 0);
            this.f6711c = iArr2;
        }
        int[] iArr3 = this.f6711c;
        int i6 = this.f6712d;
        this.f6712d = i6 + 1;
        iArr3[i6] = 6;
        this.f6714f = ":";
        this.f6718j = true;
        if (writer != null) {
            this.f6710b = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public void E(Number number) {
        if (number == null) {
            q();
            return;
        }
        H();
        String obj = number.toString();
        if (this.f6715g || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            c();
            this.f6710b.append((CharSequence) obj);
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void F(String str) {
        if (str == null) {
            q();
            return;
        }
        H();
        c();
        s(str);
    }

    public void G(boolean z5) {
        H();
        c();
        this.f6710b.write(z5 ? "true" : "false");
    }

    public final void H() {
        if (this.f6717i != null) {
            int r5 = r();
            if (r5 == 5) {
                this.f6710b.write(44);
            } else if (r5 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            p();
            this.f6711c[this.f6712d - 1] = 4;
            s(this.f6717i);
            this.f6717i = null;
        }
    }

    public final void c() {
        int r5 = r();
        if (r5 != 1) {
            Writer writer = this.f6710b;
            if (r5 != 2) {
                if (r5 != 4) {
                    if (r5 != 6) {
                        if (r5 == 7) {
                            if (!this.f6715g) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f6711c[this.f6712d - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f6714f);
                this.f6711c[this.f6712d - 1] = 5;
                return;
            }
            writer.append(',');
        } else {
            this.f6711c[this.f6712d - 1] = 2;
        }
        p();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6710b.close();
        int i6 = this.f6712d;
        if (i6 > 1 || (i6 == 1 && this.f6711c[i6 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6712d = 0;
    }

    public void f() {
        H();
        c();
        int i6 = this.f6712d;
        int[] iArr = this.f6711c;
        if (i6 == iArr.length) {
            int[] iArr2 = new int[i6 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.f6711c = iArr2;
        }
        int[] iArr3 = this.f6711c;
        int i7 = this.f6712d;
        this.f6712d = i7 + 1;
        iArr3[i7] = 1;
        this.f6710b.write("[");
    }

    public void flush() {
        if (this.f6712d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6710b.flush();
    }

    public void h() {
        H();
        c();
        int i6 = this.f6712d;
        int[] iArr = this.f6711c;
        if (i6 == iArr.length) {
            int[] iArr2 = new int[i6 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.f6711c = iArr2;
        }
        int[] iArr3 = this.f6711c;
        int i7 = this.f6712d;
        this.f6712d = i7 + 1;
        iArr3[i7] = 3;
        this.f6710b.write("{");
    }

    public final void j(int i6, int i7, String str) {
        int r5 = r();
        if (r5 != i7 && r5 != i6) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f6717i != null) {
            throw new IllegalStateException("Dangling name: " + this.f6717i);
        }
        this.f6712d--;
        if (r5 == i7) {
            p();
        }
        this.f6710b.write(str);
    }

    public void k() {
        j(1, 2, "]");
    }

    public void n() {
        j(3, 5, "}");
    }

    public void o(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f6717i != null) {
            throw new IllegalStateException();
        }
        if (this.f6712d == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f6717i = str;
    }

    public final void p() {
        if (this.f6713e == null) {
            return;
        }
        Writer writer = this.f6710b;
        writer.write("\n");
        int i6 = this.f6712d;
        for (int i7 = 1; i7 < i6; i7++) {
            writer.write(this.f6713e);
        }
    }

    public c q() {
        if (this.f6717i != null) {
            if (!this.f6718j) {
                this.f6717i = null;
                return this;
            }
            H();
        }
        c();
        this.f6710b.write("null");
        return this;
    }

    public final int r() {
        int i6 = this.f6712d;
        if (i6 != 0) {
            return this.f6711c[i6 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f6716h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = x3.c.f6709l
            goto L9
        L7:
            java.lang.String[] r0 = x3.c.f6708k
        L9:
            java.io.Writer r1 = r8.f6710b
            java.lang.String r2 = "\""
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.c.s(java.lang.String):void");
    }

    public void w(long j5) {
        H();
        c();
        this.f6710b.write(Long.toString(j5));
    }

    public void x(Boolean bool) {
        if (bool == null) {
            q();
            return;
        }
        H();
        c();
        this.f6710b.write(bool.booleanValue() ? "true" : "false");
    }
}
