package x1;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.a0;
import java.util.HashSet;
/* loaded from: classes.dex */
public class o extends androidx.fragment.app.o {
    public final x1.a V;
    public final a W;
    public final HashSet X;
    public o Y;
    public com.bumptech.glide.l Z;

    /* renamed from: a0  reason: collision with root package name */
    public androidx.fragment.app.o f6689a0;

    /* loaded from: classes.dex */
    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        x1.a aVar = new x1.a();
        this.W = new a();
        this.X = new HashSet();
        this.V = aVar;
    }

    @Override // androidx.fragment.app.o
    public final void A() {
        this.D = true;
        this.V.c();
        o oVar = this.Y;
        if (oVar != null) {
            oVar.X.remove(this);
            this.Y = null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void C() {
        this.D = true;
        this.f6689a0 = null;
        o oVar = this.Y;
        if (oVar != null) {
            oVar.X.remove(this);
            this.Y = null;
        }
    }

    @Override // androidx.fragment.app.o
    public final void F() {
        this.D = true;
        this.V.d();
    }

    @Override // androidx.fragment.app.o
    public final void G() {
        this.D = true;
        this.V.e();
    }

    public final void P(Context context, a0 a0Var) {
        o oVar = this.Y;
        if (oVar != null) {
            oVar.X.remove(this);
            this.Y = null;
        }
        o e6 = com.bumptech.glide.b.b(context).f2796g.e(a0Var);
        this.Y = e6;
        if (!equals(e6)) {
            this.Y.X.add(this);
        }
    }

    @Override // androidx.fragment.app.o
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        androidx.fragment.app.o oVar = this.f1585v;
        if (oVar == null) {
            oVar = this.f6689a0;
        }
        sb.append(oVar);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.o] */
    @Override // androidx.fragment.app.o
    public final void x(Context context) {
        super.x(context);
        o oVar = this;
        while (true) {
            ?? r0 = oVar.f1585v;
            if (r0 == 0) {
                break;
            }
            oVar = r0;
        }
        a0 a0Var = oVar.s;
        if (a0Var == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            P(h(), a0Var);
        } catch (IllegalStateException e6) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e6);
            }
        }
    }
}
