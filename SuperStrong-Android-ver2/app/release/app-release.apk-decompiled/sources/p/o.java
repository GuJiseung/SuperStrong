package p;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    public static int f5667f;

    /* renamed from: b  reason: collision with root package name */
    public final int f5669b;

    /* renamed from: c  reason: collision with root package name */
    public int f5670c;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<o.d> f5668a = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f5671d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f5672e = -1;

    /* loaded from: classes.dex */
    public class a {
        public a(o.d dVar, m.d dVar2) {
            new WeakReference(dVar);
            o.c cVar = dVar.K;
            dVar2.getClass();
            m.d.o(cVar);
            m.d.o(dVar.L);
            m.d.o(dVar.M);
            m.d.o(dVar.N);
            m.d.o(dVar.O);
        }
    }

    public o(int i6) {
        this.f5669b = -1;
        int i7 = f5667f;
        f5667f = i7 + 1;
        this.f5669b = i7;
        this.f5670c = i6;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f5668a.size();
        if (this.f5672e != -1 && size > 0) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                o oVar = arrayList.get(i6);
                if (this.f5672e == oVar.f5669b) {
                    c(this.f5670c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(m.d dVar, int i6) {
        int o5;
        o.c cVar;
        ArrayList<o.d> arrayList = this.f5668a;
        if (arrayList.size() == 0) {
            return 0;
        }
        o.e eVar = (o.e) arrayList.get(0).W;
        dVar.u();
        eVar.c(dVar, false);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            arrayList.get(i7).c(dVar, false);
        }
        if (i6 == 0 && eVar.B0 > 0) {
            c.b.a(eVar, dVar, arrayList, 0);
        }
        if (i6 == 1 && eVar.C0 > 0) {
            c.b.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this.f5671d = new ArrayList<>();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            this.f5671d.add(new a(arrayList.get(i8), dVar));
        }
        if (i6 == 0) {
            o5 = m.d.o(eVar.K);
            cVar = eVar.M;
        } else {
            o5 = m.d.o(eVar.L);
            cVar = eVar.N;
        }
        int o6 = m.d.o(cVar);
        dVar.u();
        return o6 - o5;
    }

    public final void c(int i6, o oVar) {
        Iterator<o.d> it = this.f5668a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i7 = oVar.f5669b;
            if (hasNext) {
                o.d next = it.next();
                ArrayList<o.d> arrayList = oVar.f5668a;
                if (!arrayList.contains(next)) {
                    arrayList.add(next);
                }
                if (i6 == 0) {
                    next.f5453q0 = i7;
                } else {
                    next.r0 = i7;
                }
            } else {
                this.f5672e = i7;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        Iterator<o.d> it;
        StringBuilder sb = new StringBuilder();
        int i6 = this.f5670c;
        if (i6 == 0) {
            str = "Horizontal";
        } else if (i6 == 1) {
            str = "Vertical";
        } else if (i6 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f5669b);
        sb.append("] <");
        String sb2 = sb.toString();
        while (this.f5668a.iterator().hasNext()) {
            sb2 = sb2 + " " + it.next().f5441k0;
        }
        return sb2 + " >";
    }
}
