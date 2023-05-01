package d0;

import android.text.SpannableStringBuilder;
import d0.l;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f3723d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3724e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f3725f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f3726g;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3727a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3728b;

    /* renamed from: c  reason: collision with root package name */
    public final k f3729c;

    /* renamed from: d0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0032a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f3730e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f3731a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3732b;

        /* renamed from: c  reason: collision with root package name */
        public int f3733c;

        /* renamed from: d  reason: collision with root package name */
        public char f3734d;

        static {
            for (int i6 = 0; i6 < 1792; i6++) {
                f3730e[i6] = Character.getDirectionality(i6);
            }
        }

        public C0032a(CharSequence charSequence) {
            this.f3731a = charSequence;
            this.f3732b = charSequence.length();
        }

        public final byte a() {
            CharSequence charSequence = this.f3731a;
            char charAt = charSequence.charAt(this.f3733c - 1);
            this.f3734d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(charSequence, this.f3733c);
                this.f3733c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f3733c--;
            char c6 = this.f3734d;
            if (c6 < 1792) {
                return f3730e[c6];
            }
            return Character.getDirectionality(c6);
        }
    }

    static {
        l.d dVar = l.f3741c;
        f3723d = Character.toString((char) 8206);
        f3724e = Character.toString((char) 8207);
        f3725f = new a(false, 2, dVar);
        f3726g = new a(true, 2, dVar);
    }

    public a(boolean z5, int i6, l.d dVar) {
        this.f3727a = z5;
        this.f3728b = i6;
        this.f3729c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r1 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (r0.f3733c <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        switch(r0.a()) {
            case 14: goto L64;
            case 15: goto L64;
            case 16: goto L59;
            case 17: goto L59;
            case 18: goto L55;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0084, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        if (r1 != r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008c, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            d0.a$a r0 = new d0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f3733c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.f3733c
            int r5 = r0.f3732b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L6e
            if (r1 != 0) goto L6e
            java.lang.CharSequence r5 = r0.f3731a
            char r4 = r5.charAt(r4)
            r0.f3734d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L37
            int r4 = r0.f3733c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f3733c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f3733c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L4b
        L37:
            int r4 = r0.f3733c
            int r4 = r4 + r7
            r0.f3733c = r4
            char r4 = r0.f3734d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L47
            byte[] r5 = d0.a.C0032a.f3730e
            r4 = r5[r4]
            goto L4b
        L47:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L4b:
            if (r4 == 0) goto L69
            if (r4 == r7) goto L66
            r5 = 2
            if (r4 == r5) goto L66
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L5e:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L62:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L66:
            if (r3 != 0) goto L6c
            goto L86
        L69:
            if (r3 != 0) goto L6c
            goto L8a
        L6c:
            r1 = r3
            goto Lb
        L6e:
            if (r1 != 0) goto L71
            goto L8f
        L71:
            if (r2 == 0) goto L75
            r9 = r2
            goto L8f
        L75:
            int r2 = r0.f3733c
            if (r2 <= 0) goto L8f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r3 = r3 + 1
            goto L75
        L84:
            if (r1 != r3) goto L8c
        L86:
            r9 = r7
            goto L8f
        L88:
            if (r1 != r3) goto L8c
        L8a:
            r9 = r6
            goto L8f
        L8c:
            int r3 = r3 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            d0.a$a r0 = new d0.a$a
            r0.<init>(r6)
            int r6 = r0.f3732b
            r0.f3733c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.f3733c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence, k kVar) {
        boolean z5;
        l.d dVar;
        char c6;
        l.d dVar2;
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean b6 = ((l.c) kVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f3728b & 2) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        String str2 = f3724e;
        String str3 = f3723d;
        boolean z6 = this.f3727a;
        if (z5) {
            if (b6) {
                dVar2 = l.f3740b;
            } else {
                dVar2 = l.f3739a;
            }
            boolean b7 = dVar2.b(charSequence, charSequence.length());
            if (!z6 && (b7 || a(charSequence) == 1)) {
                str = str3;
            } else if (!z6 || (b7 && a(charSequence) != -1)) {
                str = "";
            } else {
                str = str2;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (b6 != z6) {
            if (b6) {
                c6 = 8235;
            } else {
                c6 = 8234;
            }
            spannableStringBuilder.append(c6);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b6) {
            dVar = l.f3740b;
        } else {
            dVar = l.f3739a;
        }
        boolean b8 = dVar.b(charSequence, charSequence.length());
        if (!z6 && (b8 || b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z6 || (b8 && b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
