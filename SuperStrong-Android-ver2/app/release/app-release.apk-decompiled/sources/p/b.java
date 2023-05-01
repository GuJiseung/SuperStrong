package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<o.d> f5625a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final a f5626b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final o.e f5627c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5628a;

        /* renamed from: b  reason: collision with root package name */
        public int f5629b;

        /* renamed from: c  reason: collision with root package name */
        public int f5630c;

        /* renamed from: d  reason: collision with root package name */
        public int f5631d;

        /* renamed from: e  reason: collision with root package name */
        public int f5632e;

        /* renamed from: f  reason: collision with root package name */
        public int f5633f;

        /* renamed from: g  reason: collision with root package name */
        public int f5634g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5635h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5636i;

        /* renamed from: j  reason: collision with root package name */
        public int f5637j;
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0073b {
    }

    public b(o.e eVar) {
        this.f5627c = eVar;
    }

    public final boolean a(int i6, o.d dVar, InterfaceC0073b interfaceC0073b) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int[] iArr = dVar.V;
        int i7 = iArr[0];
        a aVar = this.f5626b;
        aVar.f5628a = i7;
        boolean z9 = true;
        aVar.f5629b = iArr[1];
        aVar.f5630c = dVar.q();
        aVar.f5631d = dVar.l();
        aVar.f5636i = false;
        aVar.f5637j = i6;
        if (aVar.f5628a == 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (aVar.f5629b == 3) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 && dVar.Z > 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z6 && dVar.Z > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        int[] iArr2 = dVar.u;
        if (z7 && iArr2[0] == 4) {
            aVar.f5628a = 1;
        }
        if (z8 && iArr2[1] == 4) {
            aVar.f5629b = 1;
        }
        ((ConstraintLayout.b) interfaceC0073b).b(dVar, aVar);
        dVar.N(aVar.f5632e);
        dVar.K(aVar.f5633f);
        dVar.F = aVar.f5635h;
        int i8 = aVar.f5634g;
        dVar.f5427d0 = i8;
        if (i8 <= 0) {
            z9 = false;
        }
        dVar.F = z9;
        aVar.f5637j = 0;
        return aVar.f5636i;
    }

    public final void b(o.e eVar, int i6, int i7, int i8) {
        int i9 = eVar.f5429e0;
        int i10 = eVar.f5431f0;
        eVar.f5429e0 = 0;
        eVar.f5431f0 = 0;
        eVar.N(i7);
        eVar.K(i8);
        if (i9 < 0) {
            i9 = 0;
        }
        eVar.f5429e0 = i9;
        if (i10 < 0) {
            i10 = 0;
        }
        eVar.f5431f0 = i10;
        o.e eVar2 = this.f5627c;
        eVar2.f5463v0 = i6;
        eVar2.Q();
    }

    public final void c(o.e eVar) {
        ArrayList<o.d> arrayList = this.f5625a;
        arrayList.clear();
        int size = eVar.f5501s0.size();
        for (int i6 = 0; i6 < size; i6++) {
            o.d dVar = eVar.f5501s0.get(i6);
            int[] iArr = dVar.V;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f5462u0.f5641b = true;
    }
}
