package b0;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f2263b = new e(new g(b.a(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final f f2264a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f2265a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z5;
            boolean z6;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f2265a;
            int length = localeArr.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    if (localeArr[i6].equals(locale)) {
                        z5 = true;
                        break;
                    }
                    i6++;
                } else {
                    z5 = false;
                    break;
                }
            }
            if (!z5) {
                int length2 = localeArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length2) {
                        if (localeArr[i7].equals(locale2)) {
                            z6 = true;
                            break;
                        }
                        i7++;
                    } else {
                        z6 = false;
                        break;
                    }
                }
                if (!z6) {
                    String c6 = d0.b.c(d0.b.a(d0.b.b(locale)));
                    if (c6.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return c6.equals(d0.b.c(d0.b.a(d0.b.b(locale2))));
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public e(g gVar) {
        this.f2264a = gVar;
    }

    public static e a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i6 = 0; i6 < length; i6++) {
                localeArr[i6] = a.a(split[i6]);
            }
            return new e(new g(b.a(localeArr)));
        }
        return f2263b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f2264a.equals(((e) obj).f2264a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2264a.hashCode();
    }

    public final String toString() {
        return this.f2264a.toString();
    }
}
