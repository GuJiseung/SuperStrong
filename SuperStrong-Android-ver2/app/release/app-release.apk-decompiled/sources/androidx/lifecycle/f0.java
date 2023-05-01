package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1733a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f1734b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f1735c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f1733a) {
            obj2 = this.f1733a.get(str);
            if (obj2 == null) {
                this.f1733a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f1735c) {
            a(obj);
        }
        return obj;
    }
}
