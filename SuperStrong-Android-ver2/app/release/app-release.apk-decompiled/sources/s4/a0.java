package s4;
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f6053a;

    static {
        String str;
        boolean parseBoolean;
        d0 d0Var;
        int i6 = kotlinx.coroutines.internal.p.f4972a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            parseBoolean = false;
        } else {
            parseBoolean = Boolean.parseBoolean(str);
        }
        if (parseBoolean) {
            kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
            a1 a1Var = kotlinx.coroutines.internal.k.f4969a;
            a1Var.H();
            if (a1Var instanceof d0) {
                d0Var = (d0) a1Var;
                f6053a = d0Var;
            }
        }
        d0Var = z.f6113h;
        f6053a = d0Var;
    }
}
