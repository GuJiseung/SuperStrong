package v3;

import java.lang.reflect.AccessibleObject;
import s3.k;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6320a;

    static {
        b cVar;
        if (k.f6022a < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f6320a = cVar;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
