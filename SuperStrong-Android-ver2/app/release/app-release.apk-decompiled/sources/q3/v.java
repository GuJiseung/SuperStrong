package q3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5849b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ v[] f5850c;

    /* loaded from: classes.dex */
    public enum a extends v {
        public a() {
            super("DEFAULT", 0);
        }
    }

    static {
        a aVar = new a();
        f5849b = aVar;
        f5850c = new v[]{aVar, new v() { // from class: q3.v.b
        }};
    }

    public v() {
        throw null;
    }

    public v(String str, int i6) {
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f5850c.clone();
    }
}
