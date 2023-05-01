package v0;

import androidx.activity.result.c;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.PrintWriter;
import l.i;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public final o f6267c;

    /* renamed from: d  reason: collision with root package name */
    public final b f6268d;

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0095a<D> extends s<D> {
        @Override // androidx.lifecycle.LiveData
        public final void g() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public final void h() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public final void i(t<? super D> tVar) {
            super.i(tVar);
        }

        @Override // androidx.lifecycle.s
        public final void j(D d6) {
            super.j(d6);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            c.a.d(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f0 {

        /* renamed from: e  reason: collision with root package name */
        public static final C0096a f6269e = new C0096a();

        /* renamed from: d  reason: collision with root package name */
        public final i<C0095a> f6270d = new i<>();

        /* renamed from: v0.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0096a implements i0.b {
            @Override // androidx.lifecycle.i0.b
            public final <T extends f0> T a(Class<T> cls) {
                return new b();
            }
        }

        @Override // androidx.lifecycle.f0
        public final void b() {
            i<C0095a> iVar = this.f6270d;
            int i6 = iVar.f5071d;
            if (i6 <= 0) {
                Object[] objArr = iVar.f5070c;
                for (int i7 = 0; i7 < i6; i7++) {
                    objArr[i7] = null;
                }
                iVar.f5071d = 0;
                return;
            }
            ((C0095a) iVar.f5070c[0]).getClass();
            throw null;
        }
    }

    public a(o oVar, k0 k0Var) {
        this.f6267c = oVar;
        this.f6268d = (b) new i0(k0Var, b.f6269e).a(b.class);
    }

    @Deprecated
    public final void A(String str, PrintWriter printWriter) {
        i<C0095a> iVar = this.f6268d.f6270d;
        if (iVar.f5071d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (iVar.f5071d > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(iVar.f5069b[0]);
                printWriter.print(": ");
                printWriter.println(((C0095a) iVar.f5070c[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.a.d(this.f6267c, sb);
        sb.append("}}");
        return sb.toString();
    }
}
