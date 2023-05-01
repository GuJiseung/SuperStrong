package s4;

import e4.f;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public interface u0 extends f.b {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ i0 a(u0 u0Var, boolean z5, y0 y0Var, int i6) {
            if ((i6 & 1) != 0) {
                z5 = false;
            }
            return u0Var.k(z5, (i6 & 2) != 0, y0Var);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f.c<u0> {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ b f6108b = new b();
    }

    j F(z0 z0Var);

    boolean c();

    i0 k(boolean z5, boolean z6, y0 y0Var);

    CancellationException s();

    boolean start();

    void w(CancellationException cancellationException);
}
