package g5;

import java.lang.reflect.Array;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f4286a;

    public w(x xVar) {
        this.f4286a = xVar;
    }

    @Override // g5.x
    public final void a(z zVar, @Nullable Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            this.f4286a.a(zVar, Array.get(obj, i6));
        }
    }
}
