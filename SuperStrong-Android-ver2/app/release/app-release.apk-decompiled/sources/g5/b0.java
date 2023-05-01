package g5;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final v4.b0 f4211a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f4212b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final v4.d0 f4213c;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(v4.b0 b0Var, @Nullable Object obj, @Nullable v4.c0 c0Var) {
        this.f4211a = b0Var;
        this.f4212b = obj;
        this.f4213c = c0Var;
    }

    public final boolean a() {
        int i6 = this.f4211a.f6338d;
        return i6 >= 200 && i6 < 300;
    }

    public final String toString() {
        return this.f4211a.toString();
    }
}
