package v4;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6362a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6363b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6364c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6365d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6366e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6367f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6368g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6369h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6370i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6371j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6372k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6373l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f6374m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6375a;

        /* renamed from: b  reason: collision with root package name */
        public int f6376b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f6377c;
    }

    static {
        a aVar = new a();
        aVar.f6375a = true;
        new c(aVar);
        a aVar2 = new a();
        aVar2.f6377c = true;
        int i6 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i6 = (int) seconds;
        }
        aVar2.f6376b = i6;
        new c(aVar2);
    }

    public c(a aVar) {
        this.f6362a = aVar.f6375a;
        this.f6363b = false;
        this.f6364c = -1;
        this.f6365d = -1;
        this.f6366e = false;
        this.f6367f = false;
        this.f6368g = false;
        this.f6369h = aVar.f6376b;
        this.f6370i = -1;
        this.f6371j = aVar.f6377c;
        this.f6372k = false;
        this.f6373l = false;
    }

    public c(boolean z5, boolean z6, int i6, int i7, boolean z7, boolean z8, boolean z9, int i8, int i9, boolean z10, boolean z11, boolean z12, @Nullable String str) {
        this.f6362a = z5;
        this.f6363b = z6;
        this.f6364c = i6;
        this.f6365d = i7;
        this.f6366e = z7;
        this.f6367f = z8;
        this.f6368g = z9;
        this.f6369h = i8;
        this.f6370i = i9;
        this.f6371j = z10;
        this.f6372k = z11;
        this.f6373l = z12;
        this.f6374m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v4.c a(v4.p r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c.a(v4.p):v4.c");
    }

    public final String toString() {
        String str = this.f6374m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f6362a) {
                sb.append("no-cache, ");
            }
            if (this.f6363b) {
                sb.append("no-store, ");
            }
            int i6 = this.f6364c;
            if (i6 != -1) {
                sb.append("max-age=");
                sb.append(i6);
                sb.append(", ");
            }
            int i7 = this.f6365d;
            if (i7 != -1) {
                sb.append("s-maxage=");
                sb.append(i7);
                sb.append(", ");
            }
            if (this.f6366e) {
                sb.append("private, ");
            }
            if (this.f6367f) {
                sb.append("public, ");
            }
            if (this.f6368g) {
                sb.append("must-revalidate, ");
            }
            int i8 = this.f6369h;
            if (i8 != -1) {
                sb.append("max-stale=");
                sb.append(i8);
                sb.append(", ");
            }
            int i9 = this.f6370i;
            if (i9 != -1) {
                sb.append("min-fresh=");
                sb.append(i9);
                sb.append(", ");
            }
            if (this.f6371j) {
                sb.append("only-if-cached, ");
            }
            if (this.f6372k) {
                sb.append("no-transform, ");
            }
            if (this.f6373l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f6374m = str;
        }
        return str;
    }
}
