package t4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.k;
import l4.f;
import s4.a1;
import s4.h0;
import s4.u0;
/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6227c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6228d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6229e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6230f;

    public a(Handler handler) {
        this(handler, null, false);
    }

    @Override // s4.t
    public final boolean G() {
        return (this.f6229e && f.a(Looper.myLooper(), this.f6227c.getLooper())) ? false : true;
    }

    @Override // s4.a1
    public final a1 H() {
        return this.f6230f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f6227c == this.f6227c;
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        if (!this.f6227c.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            u0 u0Var = (u0) fVar.get(u0.b.f6108b);
            if (u0Var != null) {
                u0Var.w(cancellationException);
            }
            h0.f6068b.h(fVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f6227c);
    }

    @Override // s4.a1, s4.t
    public final String toString() {
        a1 a1Var;
        String str;
        kotlinx.coroutines.scheduling.c cVar = h0.f6067a;
        a1 a1Var2 = k.f4969a;
        if (this == a1Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                a1Var = a1Var2.H();
            } catch (UnsupportedOperationException unused) {
                a1Var = null;
            }
            if (this == a1Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f6228d;
            if (str2 == null) {
                str2 = this.f6227c.toString();
            }
            if (this.f6229e) {
                return f.j(".immediate", str2);
            }
            return str2;
        }
        return str;
    }

    public a(Handler handler, String str, boolean z5) {
        this.f6227c = handler;
        this.f6228d = str;
        this.f6229e = z5;
        this._immediate = z5 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f6230f = aVar;
    }
}
