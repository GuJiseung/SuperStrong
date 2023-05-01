package g5;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class v extends x<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f4285a;

    public v(x xVar) {
        this.f4285a = xVar;
    }

    @Override // g5.x
    public final void a(z zVar, @Nullable Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 != null) {
            for (Object obj : iterable2) {
                this.f4285a.a(zVar, obj);
            }
        }
    }
}
