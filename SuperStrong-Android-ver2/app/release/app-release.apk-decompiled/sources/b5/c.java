package b5;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f5.h f2491d = f5.h.d(":");

    /* renamed from: e  reason: collision with root package name */
    public static final f5.h f2492e = f5.h.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final f5.h f2493f = f5.h.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final f5.h f2494g = f5.h.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final f5.h f2495h = f5.h.d(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final f5.h f2496i = f5.h.d(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final f5.h f2497a;

    /* renamed from: b  reason: collision with root package name */
    public final f5.h f2498b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2499c;

    public c(f5.h hVar, f5.h hVar2) {
        this.f2497a = hVar;
        this.f2498b = hVar2;
        this.f2499c = hVar2.j() + hVar.j() + 32;
    }

    public c(f5.h hVar, String str) {
        this(hVar, f5.h.d(str));
    }

    public c(String str, String str2) {
        this(f5.h.d(str), f5.h.d(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f2497a.equals(cVar.f2497a) && this.f2498b.equals(cVar.f2498b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2498b.hashCode() + ((this.f2497a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return w4.e.i("%s: %s", this.f2497a.m(), this.f2498b.m());
    }
}
