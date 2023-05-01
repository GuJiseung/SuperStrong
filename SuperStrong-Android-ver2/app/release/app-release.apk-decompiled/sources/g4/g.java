package g4;

import l4.l;
import l4.m;
/* loaded from: classes.dex */
public abstract class g extends c implements l4.e<Object> {

    /* renamed from: e  reason: collision with root package name */
    public final int f4169e;

    public g(int i6, e4.d<Object> dVar) {
        super(dVar);
        this.f4169e = i6;
    }

    @Override // l4.e
    public final int c() {
        return this.f4169e;
    }

    @Override // g4.a
    public final String toString() {
        if (this.f4160b == null) {
            l.f5142a.getClass();
            String a6 = m.a(this);
            l4.f.e(a6, "renderLambdaToString(this)");
            return a6;
        }
        return super.toString();
    }
}
