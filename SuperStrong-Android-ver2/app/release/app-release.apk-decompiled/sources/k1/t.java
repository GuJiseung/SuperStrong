package k1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f4907a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f4908b;

    public t(int i6) {
        if (i6 != 1) {
            this.f4907a = new HashMap();
            this.f4908b = new HashMap();
            return;
        }
        this.f4907a = new AtomicReference();
        this.f4908b = new l.b();
    }
}
