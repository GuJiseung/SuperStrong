package k1;

import com.bumptech.glide.load.data.d;
import k1.h;
import o1.n;
/* loaded from: classes.dex */
public final class a0 implements d.a<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n.a f4740b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f4741c;

    public a0(b0 b0Var, n.a aVar) {
        this.f4741c = b0Var;
        this.f4740b = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        boolean z5;
        b0 b0Var = this.f4741c;
        n.a<?> aVar = this.f4740b;
        n.a<?> aVar2 = b0Var.f4748g;
        if (aVar2 != null && aVar2 == aVar) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            f fVar = b0Var.f4749h;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f5549c;
            b0Var.f4744c.d(fVar, exc, dVar, dVar.e());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(Object obj) {
        boolean z5;
        b0 b0Var = this.f4741c;
        n.a<?> aVar = this.f4740b;
        n.a<?> aVar2 = b0Var.f4748g;
        if (aVar2 != null && aVar2 == aVar) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            l lVar = b0Var.f4743b.f4786p;
            if (obj != null && lVar.c(aVar.f5549c.e())) {
                b0Var.f4747f = obj;
                b0Var.f4744c.a();
                return;
            }
            h.a aVar3 = b0Var.f4744c;
            i1.f fVar = aVar.f5547a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f5549c;
            aVar3.c(fVar, obj, dVar, dVar.e(), b0Var.f4749h);
        }
    }
}
