package a1;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f28a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f29b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f30c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f31d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f32e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f33f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f34g;

    public g(f fVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f34g = fVar;
        this.f28a = obj;
        this.f29b = arrayList;
        this.f32e = obj2;
        this.f33f = arrayList2;
    }

    @Override // a1.l, a1.i.d
    public final void a() {
        f fVar = this.f34g;
        Object obj = this.f28a;
        if (obj != null) {
            fVar.s(obj, this.f29b, null);
        }
        Object obj2 = this.f30c;
        if (obj2 != null) {
            fVar.s(obj2, this.f31d, null);
        }
        Object obj3 = this.f32e;
        if (obj3 != null) {
            fVar.s(obj3, this.f33f, null);
        }
    }

    @Override // a1.i.d
    public final void e(i iVar) {
        iVar.y(this);
    }
}
