package s0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.o;
import d.q;
import d4.f;
import java.util.LinkedHashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0086b f5973a = C0086b.f5980c;

    /* loaded from: classes.dex */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_RETAIN_INSTANCE_USAGE,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_SET_USER_VISIBLE_HINT,
        /* JADX INFO: Fake field, exist only in values array */
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: s0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0086b {

        /* renamed from: c  reason: collision with root package name */
        public static final C0086b f5980c = new C0086b();

        /* renamed from: a  reason: collision with root package name */
        public final Set<a> f5981a = f.f3803b;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedHashMap f5982b = new LinkedHashMap();
    }

    public static C0086b a(o oVar) {
        while (oVar != null) {
            if (oVar.q()) {
                oVar.l();
            }
            oVar = oVar.f1585v;
        }
        return f5973a;
    }

    public static void b(C0086b c0086b, c cVar) {
        o oVar = cVar.f5983b;
        String name = oVar.getClass().getName();
        a aVar = a.PENALTY_LOG;
        Set<a> set = c0086b.f5981a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), cVar);
        }
        if (set.contains(a.PENALTY_DEATH)) {
            q qVar = new q(name, 1, cVar);
            if (oVar.q()) {
                Handler handler = oVar.l().f1404t.f1667e;
                l4.f.e(handler, "fragment.parentFragmentManager.host.handler");
                if (!l4.f.a(handler.getLooper(), Looper.myLooper())) {
                    handler.post(qVar);
                    return;
                }
            }
            qVar.run();
        }
    }

    public static void c(c cVar) {
        if (a0.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(cVar.f5983b.getClass().getName()), cVar);
        }
    }

    public static final void d(o oVar, String str) {
        l4.f.f(oVar, "fragment");
        l4.f.f(str, "previousFragmentId");
        s0.a aVar = new s0.a(oVar, str);
        c(aVar);
        C0086b a6 = a(oVar);
        if (a6.f5981a.contains(a.DETECT_FRAGMENT_REUSE) && e(a6, oVar.getClass(), s0.a.class)) {
            b(a6, aVar);
        }
    }

    public static boolean e(C0086b c0086b, Class cls, Class cls2) {
        Set set = (Set) c0086b.f5982b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!l4.f.a(cls2.getSuperclass(), c.class) && set.contains(cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
