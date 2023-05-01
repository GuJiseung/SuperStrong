package y0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.superstrong.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f6749d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f6750e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f6753c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f6752b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6751a = new HashMap();

    public a(Context context) {
        this.f6753c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6749d == null) {
            synchronized (f6750e) {
                if (f6749d == null) {
                    f6749d = new a(context);
                }
            }
        }
        return f6749d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6753c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f6752b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new c(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (z0.a.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f6751a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : a6) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f6753c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
