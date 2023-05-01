package l4;

import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class b implements p4.a, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public transient p4.a f5129b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5130c;

    /* renamed from: d  reason: collision with root package name */
    public final Class f5131d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5132e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5133f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5134g;

    /* loaded from: classes.dex */
    public static class a implements Serializable {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5135b = new a();
    }

    public b(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f5130c = obj;
        this.f5131d = cls;
        this.f5132e = str;
        this.f5133f = str2;
        this.f5134g = z5;
    }

    public abstract i b();

    public final c c() {
        Class cls = this.f5131d;
        if (cls == null) {
            return null;
        }
        if (this.f5134g) {
            l.f5142a.getClass();
            return new h(cls);
        }
        return l.a(cls);
    }
}
