package v4;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f6460j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f6461a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6462b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6463c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6464d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6465e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f6466f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f6467g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f6468h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6469i;

    /* loaded from: classes.dex */
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public String f6470a;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public String f6473d;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f6475f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public ArrayList f6476g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f6477h;

        /* renamed from: b  reason: collision with root package name */
        public String f6471b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f6472c = "";

        /* renamed from: e  reason: collision with root package name */
        public int f6474e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f6475f = arrayList;
            arrayList.add("");
        }

        public final q a() {
            if (this.f6470a != null) {
                if (this.f6473d != null) {
                    return new q(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:118:0x023a
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final void b(@javax.annotation.Nullable v4.q r32, java.lang.String r33) {
            /*
                Method dump skipped, instructions count: 980
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v4.q.a.b(v4.q, java.lang.String):void");
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f6470a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f6471b.isEmpty() || !this.f6472c.isEmpty()) {
                sb.append(this.f6471b);
                if (!this.f6472c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f6472c);
                }
                sb.append('@');
            }
            String str3 = this.f6473d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f6473d);
                    sb.append(']');
                } else {
                    sb.append(this.f6473d);
                }
            }
            int i6 = this.f6474e;
            if (i6 != -1 || this.f6470a != null) {
                if (i6 == -1) {
                    i6 = q.d(this.f6470a);
                }
                String str4 = this.f6470a;
                if (str4 == null || i6 != q.d(str4)) {
                    sb.append(':');
                    sb.append(i6);
                }
            }
            ArrayList arrayList = this.f6475f;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                sb.append('/');
                sb.append((String) arrayList.get(i7));
            }
            if (this.f6476g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.f6476g;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8 += 2) {
                    String str5 = (String) arrayList2.get(i8);
                    String str6 = (String) arrayList2.get(i8 + 1);
                    if (i8 > 0) {
                        sb.append('&');
                    }
                    sb.append(str5);
                    if (str6 != null) {
                        sb.append('=');
                        sb.append(str6);
                    }
                }
            }
            if (this.f6477h != null) {
                sb.append('#');
                sb.append(this.f6477h);
            }
            return sb.toString();
        }
    }

    public q(a aVar) {
        List<String> list;
        this.f6461a = aVar.f6470a;
        String str = aVar.f6471b;
        this.f6462b = j(str, 0, str.length(), false);
        String str2 = aVar.f6472c;
        this.f6463c = j(str2, 0, str2.length(), false);
        this.f6464d = aVar.f6473d;
        int i6 = aVar.f6474e;
        this.f6465e = i6 == -1 ? d(aVar.f6470a) : i6;
        this.f6466f = k(aVar.f6475f, false);
        ArrayList arrayList = aVar.f6476g;
        if (arrayList != null) {
            list = k(arrayList, true);
        } else {
            list = null;
        }
        this.f6467g = list;
        String str3 = aVar.f6477h;
        this.f6468h = str3 != null ? j(str3, 0, str3.length(), false) : null;
        this.f6469i = aVar.toString();
    }

    public static String a(String str, int i6, int i7, String str2, boolean z5, boolean z6, boolean z7, boolean z8) {
        int i8 = i6;
        while (i8 < i7) {
            int codePointAt = str.codePointAt(i8);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z8) || str2.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z5 || (z6 && !l(i8, i7, str)))) || (codePointAt == 43 && z7)))) {
                f5.e eVar = new f5.e();
                eVar.L(i6, i8, str);
                f5.e eVar2 = null;
                while (i8 < i7) {
                    int codePointAt2 = str.codePointAt(i8);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z7) {
                            String str3 = z5 ? "+" : "%2B";
                            eVar.L(0, str3.length(), str3);
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z8) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z5 || (z6 && !l(i8, i7, str)))))) {
                            if (eVar2 == null) {
                                eVar2 = new f5.e();
                            }
                            eVar2.M(codePointAt2);
                            while (!eVar2.m()) {
                                int readByte = eVar2.readByte() & 255;
                                eVar.G(37);
                                char[] cArr = f6460j;
                                eVar.G(cArr[(readByte >> 4) & 15]);
                                eVar.G(cArr[readByte & 15]);
                            }
                        } else {
                            eVar.M(codePointAt2);
                        }
                    }
                    i8 += Character.charCount(codePointAt2);
                }
                return eVar.s();
            }
            i8 += Character.charCount(codePointAt);
        }
        return str.substring(i6, i7);
    }

    public static String b(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8) {
        return a(str, 0, str.length(), str2, z5, z6, z7, z8);
    }

    public static String c(String str, boolean z5) {
        return a(str, 0, str.length(), " \"':;<=>@[]^`{}|/\\?#&!$(),~", z5, false, true, true);
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String j(String str, int i6, int i7, boolean z5) {
        int i8;
        int i9 = i6;
        while (i9 < i7) {
            char charAt = str.charAt(i9);
            if (charAt != '%' && (charAt != '+' || !z5)) {
                i9++;
            } else {
                f5.e eVar = new f5.e();
                eVar.L(i6, i9, str);
                while (i9 < i7) {
                    int codePointAt = str.codePointAt(i9);
                    if (codePointAt == 37 && (i8 = i9 + 2) < i7) {
                        int d6 = w4.e.d(str.charAt(i9 + 1));
                        int d7 = w4.e.d(str.charAt(i8));
                        if (d6 != -1 && d7 != -1) {
                            eVar.G((d6 << 4) + d7);
                            i9 = i8;
                        }
                        eVar.M(codePointAt);
                    } else {
                        if (codePointAt == 43 && z5) {
                            eVar.G(32);
                        }
                        eVar.M(codePointAt);
                    }
                    i9 += Character.charCount(codePointAt);
                }
                return eVar.s();
            }
        }
        return str.substring(i6, i7);
    }

    public static List k(List list, boolean z5) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            String str2 = (String) list.get(i6);
            if (str2 != null) {
                str = j(str2, 0, str2.length(), z5);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean l(int i6, int i7, String str) {
        int i8 = i6 + 2;
        return i8 < i7 && str.charAt(i6) == '%' && w4.e.d(str.charAt(i6 + 1)) != -1 && w4.e.d(str.charAt(i8)) != -1;
    }

    public static ArrayList m(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 <= str.length()) {
            int indexOf = str.indexOf(38, i6);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i6);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i6, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i6, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i6 = indexOf + 1;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f6463c.isEmpty()) {
            return "";
        }
        String str = this.f6469i;
        return str.substring(str.indexOf(58, this.f6461a.length() + 3) + 1, str.indexOf(64));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof q) && ((q) obj).f6469i.equals(this.f6469i);
    }

    public final String f() {
        String str = this.f6469i;
        int indexOf = str.indexOf(47, this.f6461a.length() + 3);
        return str.substring(indexOf, w4.e.g(str, indexOf, str.length(), "?#"));
    }

    public final ArrayList g() {
        String str = this.f6469i;
        int indexOf = str.indexOf(47, this.f6461a.length() + 3);
        int g2 = w4.e.g(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < g2) {
            int i6 = indexOf + 1;
            int f6 = w4.e.f(str, i6, g2, '/');
            arrayList.add(str.substring(i6, f6));
            indexOf = f6;
        }
        return arrayList;
    }

    @Nullable
    public final String h() {
        if (this.f6467g == null) {
            return null;
        }
        String str = this.f6469i;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, w4.e.f(str, indexOf, str.length(), '#'));
    }

    public final int hashCode() {
        return this.f6469i.hashCode();
    }

    public final String i() {
        if (this.f6462b.isEmpty()) {
            return "";
        }
        int length = this.f6461a.length() + 3;
        String str = this.f6469i;
        return str.substring(length, w4.e.g(str, length, str.length(), ":@"));
    }

    public final String n() {
        a aVar;
        try {
            aVar = new a();
            aVar.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        aVar.getClass();
        aVar.f6471b = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        aVar.f6472c = b("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return aVar.a().f6469i;
    }

    public final URI o() {
        ArrayList arrayList;
        a aVar = new a();
        String str = this.f6461a;
        aVar.f6470a = str;
        aVar.f6471b = i();
        aVar.f6472c = e();
        aVar.f6473d = this.f6464d;
        int d6 = d(str);
        int i6 = this.f6465e;
        if (i6 == d6) {
            i6 = -1;
        }
        aVar.f6474e = i6;
        ArrayList arrayList2 = aVar.f6475f;
        arrayList2.clear();
        arrayList2.addAll(g());
        String h6 = h();
        String str2 = null;
        if (h6 != null) {
            arrayList = m(b(h6, " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        aVar.f6476g = arrayList;
        if (this.f6468h != null) {
            String str3 = this.f6469i;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        aVar.f6477h = str2;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.set(i7, b((String) arrayList2.get(i7), "[]", true, true, false, true));
        }
        ArrayList arrayList3 = aVar.f6476g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String str4 = (String) aVar.f6476g.get(i8);
                if (str4 != null) {
                    aVar.f6476g.set(i8, b(str4, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = aVar.f6477h;
        if (str5 != null) {
            aVar.f6477h = b(str5, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e6) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final String toString() {
        return this.f6469i;
    }
}
