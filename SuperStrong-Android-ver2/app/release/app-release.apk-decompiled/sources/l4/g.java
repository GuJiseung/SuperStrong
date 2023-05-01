package l4;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class g<R> implements e<R>, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public final int f5138b;

    public g(int i6) {
        this.f5138b = i6;
    }

    @Override // l4.e
    public final int c() {
        return this.f5138b;
    }

    public final String toString() {
        l.f5142a.getClass();
        String a6 = m.a(this);
        f.e(a6, "renderLambdaToString(this)");
        return a6;
    }
}
