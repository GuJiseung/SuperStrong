package kotlinx.coroutines.internal;

import androidx.fragment.app.x0;
import java.util.Iterator;
import java.util.List;
import s4.a1;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a1 f4969a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [q4.a] */
    static {
        String str;
        Object next;
        int i6 = p.f4972a;
        a1 a1Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator d6 = x0.d();
        l4.f.f(d6, "<this>");
        q4.d dVar = new q4.d(d6);
        if (!(dVar instanceof q4.a)) {
            dVar = new q4.a(dVar);
        }
        List<? extends j> q5 = q4.c.q(dVar);
        Iterator it = q5.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((j) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((j) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            a1Var = jVar.createDispatcher(q5);
        }
        if (a1Var != null) {
            f4969a = a1Var;
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
