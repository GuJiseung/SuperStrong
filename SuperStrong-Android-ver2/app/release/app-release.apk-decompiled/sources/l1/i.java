package l1;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class i implements l1.b {

    /* renamed from: a  reason: collision with root package name */
    public final g<a, Object> f5081a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f5082b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5083c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5084d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f5085e;

    /* renamed from: f  reason: collision with root package name */
    public int f5086f;

    /* loaded from: classes.dex */
    public static final class a implements l {

        /* renamed from: a  reason: collision with root package name */
        public final b f5087a;

        /* renamed from: b  reason: collision with root package name */
        public int f5088b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f5089c;

        public a(b bVar) {
            this.f5087a = bVar;
        }

        @Override // l1.l
        public final void a() {
            this.f5087a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f5088b == aVar.f5088b && this.f5089c == aVar.f5089c;
            }
            return false;
        }

        public final int hashCode() {
            int i6 = this.f5088b * 31;
            Class<?> cls = this.f5089c;
            return i6 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f5088b + "array=" + this.f5089c + '}';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends c<a> {
        @Override // l1.c
        public final a a() {
            return new a(this);
        }
    }

    public i(int i6) {
        this.f5085e = i6;
    }

    @Override // l1.b
    public final synchronized void a(int i6) {
        try {
            if (i6 >= 40) {
                b();
            } else if (i6 >= 20 || i6 == 15) {
                f(this.f5085e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l1.b
    public final synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l1.b
    public final synchronized <T> T c(int i6, Class<T> cls) {
        a aVar;
        boolean z5;
        Integer ceilingKey = i(cls).ceilingKey(Integer.valueOf(i6));
        boolean z6 = false;
        if (ceilingKey != null) {
            int i7 = this.f5086f;
            if (i7 != 0 && this.f5085e / i7 < 2) {
                z5 = false;
                if (!z5 || ceilingKey.intValue() <= i6 * 8) {
                    z6 = true;
                }
            }
            z5 = true;
            if (!z5) {
            }
            z6 = true;
        }
        if (z6) {
            b bVar = this.f5082b;
            int intValue = ceilingKey.intValue();
            aVar = bVar.b();
            aVar.f5088b = intValue;
            aVar.f5089c = cls;
        } else {
            a b6 = this.f5082b.b();
            b6.f5088b = i6;
            b6.f5089c = cls;
            aVar = b6;
        }
        return (T) h(aVar, cls);
    }

    @Override // l1.b
    public final synchronized Object d() {
        a b6;
        b6 = this.f5082b.b();
        b6.f5088b = 8;
        b6.f5089c = byte[].class;
        return h(b6, byte[].class);
    }

    public final void e(int i6, Class<?> cls) {
        NavigableMap<Integer, Integer> i7 = i(cls);
        Integer num = i7.get(Integer.valueOf(i6));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i6 + ", this: " + this);
        }
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(i6);
        if (intValue == 1) {
            i7.remove(valueOf);
        } else {
            i7.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(int i6) {
        while (this.f5086f > i6) {
            Object c6 = this.f5081a.c();
            androidx.activity.k.h(c6);
            l1.a g2 = g(c6.getClass());
            this.f5086f -= g2.c() * g2.b(c6);
            e(g2.b(c6), c6.getClass());
            if (Log.isLoggable(g2.a(), 2)) {
                Log.v(g2.a(), "evicted: " + g2.b(c6));
            }
        }
    }

    public final <T> l1.a<T> g(Class<T> cls) {
        HashMap hashMap = this.f5084d;
        l1.a<T> aVar = (l1.a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            } else {
                aVar = new f();
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        l1.a<T> g2 = g(cls);
        T t5 = (T) this.f5081a.a(aVar);
        if (t5 != null) {
            this.f5086f -= g2.c() * g2.b(t5);
            e(g2.b(t5), cls);
        }
        if (t5 == null) {
            if (Log.isLoggable(g2.a(), 2)) {
                Log.v(g2.a(), "Allocated " + aVar.f5088b + " bytes");
            }
            return g2.newArray(aVar.f5088b);
        }
        return t5;
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        HashMap hashMap = this.f5083c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(cls, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // l1.b
    public final synchronized <T> void put(T t5) {
        boolean z5;
        Class<?> cls = t5.getClass();
        l1.a<T> g2 = g(cls);
        int b6 = g2.b(t5);
        int c6 = g2.c() * b6;
        int i6 = 1;
        if (c6 <= this.f5085e / 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return;
        }
        a b7 = this.f5082b.b();
        b7.f5088b = b6;
        b7.f5089c = cls;
        this.f5081a.b(b7, t5);
        NavigableMap<Integer, Integer> i7 = i(cls);
        Integer num = i7.get(Integer.valueOf(b7.f5088b));
        Integer valueOf = Integer.valueOf(b7.f5088b);
        if (num != null) {
            i6 = 1 + num.intValue();
        }
        i7.put(valueOf, Integer.valueOf(i6));
        this.f5086f += c6;
        f(this.f5085e);
    }
}
