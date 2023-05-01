package y;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f6722e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f6723a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6724b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6725c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6726d;

    /* loaded from: classes.dex */
    public static class a {
        public static Insets a(int i6, int i7, int i8, int i9) {
            Insets of;
            of = Insets.of(i6, i7, i8, i9);
            return of;
        }
    }

    public b(int i6, int i7, int i8, int i9) {
        this.f6723a = i6;
        this.f6724b = i7;
        this.f6725c = i8;
        this.f6726d = i9;
    }

    public static b a(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f6722e : new b(i6, i7, i8, i9);
    }

    public static b b(Insets insets) {
        int i6;
        int i7;
        int i8;
        int i9;
        i6 = insets.left;
        i7 = insets.top;
        i8 = insets.right;
        i9 = insets.bottom;
        return a(i6, i7, i8, i9);
    }

    public final Insets c() {
        return a.a(this.f6723a, this.f6724b, this.f6725c, this.f6726d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6726d == bVar.f6726d && this.f6723a == bVar.f6723a && this.f6725c == bVar.f6725c && this.f6724b == bVar.f6724b;
    }

    public final int hashCode() {
        return (((((this.f6723a * 31) + this.f6724b) * 31) + this.f6725c) * 31) + this.f6726d;
    }

    public final String toString() {
        return "Insets{left=" + this.f6723a + ", top=" + this.f6724b + ", right=" + this.f6725c + ", bottom=" + this.f6726d + '}';
    }
}
