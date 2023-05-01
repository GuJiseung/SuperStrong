package g5;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Method f4255a;

    /* renamed from: b  reason: collision with root package name */
    public final List<?> f4256b;

    public l(Method method, ArrayList arrayList) {
        this.f4255a = method;
        this.f4256b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f4255a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f4256b);
    }
}
