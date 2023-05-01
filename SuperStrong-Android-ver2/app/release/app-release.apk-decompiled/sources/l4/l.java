package l4;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final m f5142a;

    /* renamed from: b  reason: collision with root package name */
    public static final p4.b[] f5143b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f5142a = mVar;
        f5143b = new p4.b[0];
    }

    public static d a(Class cls) {
        f5142a.getClass();
        return new d(cls);
    }
}
