package r1;

import e2.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import r1.s;
/* loaded from: classes.dex */
public final class g implements i1.j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5899a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5900b;

    public /* synthetic */ g(int i6, Object obj) {
        this.f5899a = i6;
        this.f5900b = obj;
    }

    @Override // i1.j
    public final k1.w a(Object obj, int i6, int i7, i1.h hVar) {
        int i8 = this.f5899a;
        Object obj2 = this.f5900b;
        switch (i8) {
            case 0:
                AtomicReference<byte[]> atomicReference = e2.a.f3807a;
                a.C0035a c0035a = new a.C0035a((ByteBuffer) obj);
                m mVar = (m) obj2;
                return mVar.a(new s.a(mVar.f5924c, c0035a, mVar.f5925d), i6, i7, hVar, m.f5920j);
            default:
                return e.b(((h1.a) obj).b(), (l1.d) obj2);
        }
    }

    @Override // i1.j
    public final boolean b(Object obj, i1.h hVar) {
        switch (this.f5899a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ((m) this.f5900b).getClass();
                return true;
            default:
                h1.a aVar = (h1.a) obj;
                return true;
        }
    }
}
