package x0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import j.b;
import java.util.Iterator;
import java.util.Map;
import l4.f;
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f6655b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f6656c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6657d;

    /* renamed from: e  reason: collision with root package name */
    public Recreator.a f6658e;

    /* renamed from: a  reason: collision with root package name */
    public final j.b<String, InterfaceC0100b> f6654a = new j.b<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f6659f = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    /* renamed from: x0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0100b {
        Bundle a();
    }

    public final Bundle a(String str) {
        if (this.f6657d) {
            Bundle bundle = this.f6656c;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                Bundle bundle3 = this.f6656c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f6656c;
                if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
                    this.f6656c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final InterfaceC0100b b() {
        Map.Entry entry;
        InterfaceC0100b interfaceC0100b;
        Iterator<Map.Entry<String, InterfaceC0100b>> it = this.f6654a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            entry = (Map.Entry) eVar.next();
            f.e(entry, "components");
            interfaceC0100b = (InterfaceC0100b) entry.getValue();
        } while (!f.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0100b;
    }

    public final void c(String str, InterfaceC0100b interfaceC0100b) {
        InterfaceC0100b interfaceC0100b2;
        f.f(str, "key");
        f.f(interfaceC0100b, "provider");
        j.b<String, InterfaceC0100b> bVar = this.f6654a;
        b.c<String, InterfaceC0100b> a6 = bVar.a(str);
        boolean z5 = true;
        if (a6 != null) {
            interfaceC0100b2 = a6.f4633c;
        } else {
            b.c<K, V> cVar = new b.c<>(str, interfaceC0100b);
            bVar.f4631e++;
            b.c cVar2 = bVar.f4629c;
            if (cVar2 == null) {
                bVar.f4628b = cVar;
            } else {
                cVar2.f4634d = cVar;
                cVar.f4635e = cVar2;
            }
            bVar.f4629c = cVar;
            interfaceC0100b2 = null;
        }
        if (interfaceC0100b2 != null) {
            z5 = false;
        }
        if (z5) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void d() {
        if (this.f6659f) {
            Recreator.a aVar = this.f6658e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f6658e = aVar;
            try {
                i.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f6658e;
                if (aVar2 != null) {
                    aVar2.f2177a.add(i.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e6) {
                throw new IllegalArgumentException("Class " + i.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e6);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
