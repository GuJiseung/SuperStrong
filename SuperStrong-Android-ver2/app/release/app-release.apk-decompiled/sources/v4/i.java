package v4;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f6427j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f6428k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f6429l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f6430m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f6431a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6432b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6433c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6434d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6435e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6436f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6437g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6438h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6439i;

    public i(String str, String str2, long j5, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f6431a = str;
        this.f6432b = str2;
        this.f6433c = j5;
        this.f6434d = str3;
        this.f6435e = str4;
        this.f6436f = z5;
        this.f6437g = z6;
        this.f6439i = z7;
        this.f6438h = z8;
    }

    public static int a(String str, int i6, int i7, boolean z5) {
        while (i6 < i7) {
            char charAt = str.charAt(i6);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z5)) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static long b(int i6, String str) {
        int a6 = a(str, 0, i6, false);
        Pattern pattern = f6430m;
        Matcher matcher = pattern.matcher(str);
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        while (a6 < i6) {
            int a7 = a(str, a6 + 1, i6, true);
            matcher.region(a6, a7);
            if (i8 == -1 && matcher.usePattern(pattern).matches()) {
                i8 = Integer.parseInt(matcher.group(1));
                i11 = Integer.parseInt(matcher.group(2));
                i12 = Integer.parseInt(matcher.group(3));
            } else if (i9 == -1 && matcher.usePattern(f6429l).matches()) {
                i9 = Integer.parseInt(matcher.group(1));
            } else {
                if (i10 == -1) {
                    Pattern pattern2 = f6428k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i10 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i7 == -1 && matcher.usePattern(f6427j).matches()) {
                    i7 = Integer.parseInt(matcher.group(1));
                }
            }
            a6 = a(str, a7 + 1, i6, false);
        }
        if (i7 >= 70 && i7 <= 99) {
            i7 += 1900;
        }
        if (i7 >= 0 && i7 <= 69) {
            i7 += 2000;
        }
        if (i7 >= 1601) {
            if (i10 != -1) {
                if (i9 < 1 || i9 > 31) {
                    throw new IllegalArgumentException();
                }
                if (i8 < 0 || i8 > 23) {
                    throw new IllegalArgumentException();
                }
                if (i11 < 0 || i11 > 59) {
                    throw new IllegalArgumentException();
                }
                if (i12 < 0 || i12 > 59) {
                    throw new IllegalArgumentException();
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(w4.e.f6600h);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, i7);
                gregorianCalendar.set(2, i10 - 1);
                gregorianCalendar.set(5, i9);
                gregorianCalendar.set(11, i8);
                gregorianCalendar.set(12, i11);
                gregorianCalendar.set(13, i12);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            return iVar.f6431a.equals(this.f6431a) && iVar.f6432b.equals(this.f6432b) && iVar.f6434d.equals(this.f6434d) && iVar.f6435e.equals(this.f6435e) && iVar.f6433c == this.f6433c && iVar.f6436f == this.f6436f && iVar.f6437g == this.f6437g && iVar.f6438h == this.f6438h && iVar.f6439i == this.f6439i;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6432b.hashCode();
        int hashCode2 = this.f6434d.hashCode();
        int hashCode3 = this.f6435e.hashCode();
        long j5 = this.f6433c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f6431a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (!this.f6436f ? 1 : 0)) * 31) + (!this.f6437g ? 1 : 0)) * 31) + (!this.f6438h ? 1 : 0)) * 31) + (!this.f6439i ? 1 : 0);
    }

    public final String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6431a);
        sb.append('=');
        sb.append(this.f6432b);
        if (this.f6438h) {
            long j5 = this.f6433c;
            if (j5 == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb.append("; expires=");
                format = z4.d.f7079a.get().format(new Date(j5));
            }
            sb.append(format);
        }
        if (!this.f6439i) {
            sb.append("; domain=");
            sb.append(this.f6434d);
        }
        sb.append("; path=");
        sb.append(this.f6435e);
        if (this.f6436f) {
            sb.append("; secure");
        }
        if (this.f6437g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
