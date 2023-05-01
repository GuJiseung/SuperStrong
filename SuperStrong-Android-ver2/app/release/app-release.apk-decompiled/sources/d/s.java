package d;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3672a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(int i6) {
        this(TimeUnit.MINUTES);
        if (i6 == 1) {
            this.f3672a = new HashMap();
        } else if (i6 != 2) {
            this.f3672a = new ArrayDeque();
        }
    }

    public /* synthetic */ s(TimeUnit timeUnit) {
        this.f3672a = new y4.f(timeUnit);
    }
}
