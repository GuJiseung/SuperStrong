package z4;

import f5.t;
import javax.annotation.Nullable;
import v4.d0;
import v4.s;
/* loaded from: classes.dex */
public final class g extends d0 {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f7090c;

    /* renamed from: d  reason: collision with root package name */
    public final long f7091d;

    /* renamed from: e  reason: collision with root package name */
    public final f5.g f7092e;

    public g(@Nullable String str, long j5, t tVar) {
        this.f7090c = str;
        this.f7091d = j5;
        this.f7092e = tVar;
    }

    @Override // v4.d0
    public final long c() {
        return this.f7091d;
    }

    @Override // v4.d0
    public final s f() {
        String str = this.f7090c;
        if (str == null) {
            return null;
        }
        try {
            return s.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // v4.d0
    public final f5.g h() {
        return this.f7092e;
    }
}
