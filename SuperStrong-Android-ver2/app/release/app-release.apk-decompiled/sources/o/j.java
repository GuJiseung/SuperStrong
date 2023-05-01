package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import p.b;
/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: u0  reason: collision with root package name */
    public int f5496u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f5497v0 = 0;
    public int w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public int f5498x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public int f5499y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5500z0 = 0;
    public boolean A0 = false;
    public int B0 = 0;
    public int C0 = 0;
    public final b.a D0 = new b.a();
    public b.InterfaceC0073b E0 = null;

    public void R(int i6, int i7, int i8, int i9) {
    }

    public final void S(d dVar, int i6, int i7, int i8, int i9) {
        b.InterfaceC0073b interfaceC0073b;
        boolean z5;
        d dVar2;
        while (true) {
            interfaceC0073b = this.E0;
            if (interfaceC0073b != null || (dVar2 = this.W) == null) {
                break;
            }
            this.E0 = ((e) dVar2).w0;
        }
        b.a aVar = this.D0;
        aVar.f5628a = i6;
        aVar.f5629b = i8;
        aVar.f5630c = i7;
        aVar.f5631d = i9;
        ((ConstraintLayout.b) interfaceC0073b).b(dVar, aVar);
        dVar.N(aVar.f5632e);
        dVar.K(aVar.f5633f);
        dVar.F = aVar.f5635h;
        int i10 = aVar.f5634g;
        dVar.f5427d0 = i10;
        if (i10 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        dVar.F = z5;
    }

    @Override // o.i, o.h
    public final void a() {
        for (int i6 = 0; i6 < this.f5495t0; i6++) {
            d dVar = this.f5494s0[i6];
            if (dVar != null) {
                dVar.H = true;
            }
        }
    }
}
