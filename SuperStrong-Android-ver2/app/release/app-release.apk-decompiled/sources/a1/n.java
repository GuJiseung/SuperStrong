package a1;

import a1.i;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class n extends i {
    public int A;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<i> f90y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public boolean f91z = true;
    public boolean B = false;
    public int C = 0;

    /* loaded from: classes.dex */
    public class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f92a;

        public a(i iVar) {
            this.f92a = iVar;
        }

        @Override // a1.i.d
        public final void e(i iVar) {
            this.f92a.B();
            iVar.y(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public final n f93a;

        public b(n nVar) {
            this.f93a = nVar;
        }

        @Override // a1.l, a1.i.d
        public final void a() {
            n nVar = this.f93a;
            if (nVar.B) {
                return;
            }
            nVar.I();
            nVar.B = true;
        }

        @Override // a1.i.d
        public final void e(i iVar) {
            n nVar = this.f93a;
            int i6 = nVar.A - 1;
            nVar.A = i6;
            if (i6 == 0) {
                nVar.B = false;
                nVar.p();
            }
            iVar.y(this);
        }
    }

    @Override // a1.i
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f90y.get(i6).A(viewGroup);
        }
    }

    @Override // a1.i
    public final void B() {
        if (this.f90y.isEmpty()) {
            I();
            p();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.f90y.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.A = this.f90y.size();
        if (!this.f91z) {
            for (int i6 = 1; i6 < this.f90y.size(); i6++) {
                this.f90y.get(i6 - 1).a(new a(this.f90y.get(i6)));
            }
            i iVar = this.f90y.get(0);
            if (iVar != null) {
                iVar.B();
                return;
            }
            return;
        }
        Iterator<i> it2 = this.f90y.iterator();
        while (it2.hasNext()) {
            it2.next().B();
        }
    }

    @Override // a1.i
    public final void D(i.c cVar) {
        this.f73t = cVar;
        this.C |= 8;
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f90y.get(i6).D(cVar);
        }
    }

    @Override // a1.i
    public final void F(androidx.activity.result.c cVar) {
        super.F(cVar);
        this.C |= 4;
        if (this.f90y != null) {
            for (int i6 = 0; i6 < this.f90y.size(); i6++) {
                this.f90y.get(i6).F(cVar);
            }
        }
    }

    @Override // a1.i
    public final void G() {
        this.C |= 2;
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f90y.get(i6).G();
        }
    }

    @Override // a1.i
    public final void H(long j5) {
        this.f57c = j5;
    }

    @Override // a1.i
    public final String J(String str) {
        String J = super.J(str);
        for (int i6 = 0; i6 < this.f90y.size(); i6++) {
            StringBuilder sb = new StringBuilder();
            sb.append(J);
            sb.append("\n");
            sb.append(this.f90y.get(i6).J(str + "  "));
            J = sb.toString();
        }
        return J;
    }

    public final void K(i iVar) {
        this.f90y.add(iVar);
        iVar.f64j = this;
        long j5 = this.f58d;
        if (j5 >= 0) {
            iVar.C(j5);
        }
        if ((this.C & 1) != 0) {
            iVar.E(this.f59e);
        }
        if ((this.C & 2) != 0) {
            iVar.G();
        }
        if ((this.C & 4) != 0) {
            iVar.F(this.u);
        }
        if ((this.C & 8) != 0) {
            iVar.D(this.f73t);
        }
    }

    @Override // a1.i
    /* renamed from: L */
    public final void C(long j5) {
        ArrayList<i> arrayList;
        this.f58d = j5;
        if (j5 >= 0 && (arrayList = this.f90y) != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f90y.get(i6).C(j5);
            }
        }
    }

    @Override // a1.i
    /* renamed from: M */
    public final void E(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList<i> arrayList = this.f90y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.f90y.get(i6).E(timeInterpolator);
            }
        }
        this.f59e = timeInterpolator;
    }

    public final void N(int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                this.f91z = false;
                return;
            }
            throw new AndroidRuntimeException(androidx.activity.j.a("Invalid parameter for TransitionSet ordering: ", i6));
        }
        this.f91z = true;
    }

    @Override // a1.i
    public final void a(i.d dVar) {
        super.a(dVar);
    }

    @Override // a1.i
    public final void b(View view) {
        for (int i6 = 0; i6 < this.f90y.size(); i6++) {
            this.f90y.get(i6).b(view);
        }
        this.f61g.add(view);
    }

    @Override // a1.i
    public final void d(q qVar) {
        View view = qVar.f98b;
        if (v(view)) {
            Iterator<i> it = this.f90y.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.v(view)) {
                    next.d(qVar);
                    qVar.f99c.add(next);
                }
            }
        }
    }

    @Override // a1.i
    public final void f(q qVar) {
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f90y.get(i6).f(qVar);
        }
    }

    @Override // a1.i
    public final void g(q qVar) {
        View view = qVar.f98b;
        if (v(view)) {
            Iterator<i> it = this.f90y.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.v(view)) {
                    next.g(qVar);
                    qVar.f99c.add(next);
                }
            }
        }
    }

    @Override // a1.i
    /* renamed from: j */
    public final i clone() {
        n nVar = (n) super.clone();
        nVar.f90y = new ArrayList<>();
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            i clone = this.f90y.get(i6).clone();
            nVar.f90y.add(clone);
            clone.f64j = nVar;
        }
        return nVar;
    }

    @Override // a1.i
    public final void m(ViewGroup viewGroup, androidx.fragment.app.h0 h0Var, androidx.fragment.app.h0 h0Var2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j5 = this.f57c;
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = this.f90y.get(i6);
            if (j5 > 0 && (this.f91z || i6 == 0)) {
                long j6 = iVar.f57c;
                if (j6 > 0) {
                    iVar.H(j6 + j5);
                } else {
                    iVar.H(j5);
                }
            }
            iVar.m(viewGroup, h0Var, h0Var2, arrayList, arrayList2);
        }
    }

    @Override // a1.i
    public final void x(View view) {
        super.x(view);
        int size = this.f90y.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f90y.get(i6).x(view);
        }
    }

    @Override // a1.i
    public final void y(i.d dVar) {
        super.y(dVar);
    }

    @Override // a1.i
    public final void z(View view) {
        for (int i6 = 0; i6 < this.f90y.size(); i6++) {
            this.f90y.get(i6).z(view);
        }
        this.f61g.remove(view);
    }
}
