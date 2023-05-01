package s4;
/* loaded from: classes.dex */
public abstract class l0 extends t {

    /* renamed from: c  reason: collision with root package name */
    public long f6075c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6076d;

    /* renamed from: e  reason: collision with root package name */
    public kotlinx.coroutines.internal.a<g0<?>> f6077e;

    public final void H() {
        long j5 = this.f6075c - 4294967296L;
        this.f6075c = j5;
        if (j5 <= 0 && this.f6076d) {
            shutdown();
        }
    }

    public final void I(g0<?> g0Var) {
        kotlinx.coroutines.internal.a<g0<?>> aVar = this.f6077e;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f6077e = aVar;
        }
        Object[] objArr = aVar.f4940a;
        int i6 = aVar.f4942c;
        objArr[i6] = g0Var;
        int length = (objArr.length - 1) & (i6 + 1);
        aVar.f4942c = length;
        int i7 = aVar.f4941b;
        if (length == i7) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            d4.b.r(objArr, objArr2, 0, i7, 0, 10);
            Object[] objArr3 = aVar.f4940a;
            int length3 = objArr3.length;
            int i8 = aVar.f4941b;
            d4.b.r(objArr3, objArr2, length3 - i8, 0, i8, 4);
            aVar.f4940a = objArr2;
            aVar.f4941b = 0;
            aVar.f4942c = length2;
        }
    }

    public final void J(boolean z5) {
        this.f6075c = (z5 ? 4294967296L : 1L) + this.f6075c;
        if (z5) {
            return;
        }
        this.f6076d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean K() {
        kotlinx.coroutines.internal.a<g0<?>> aVar = this.f6077e;
        if (aVar == null) {
            return false;
        }
        int i6 = aVar.f4941b;
        g0 g0Var = null;
        if (i6 != aVar.f4942c) {
            ?? r32 = aVar.f4940a;
            ?? r6 = r32[i6];
            r32[i6] = 0;
            aVar.f4941b = (i6 + 1) & (r32.length - 1);
            if (r6 != 0) {
                g0Var = r6;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
        }
        g0 g0Var2 = g0Var;
        if (g0Var2 == null) {
            return false;
        }
        g0Var2.run();
        return true;
    }

    public void shutdown() {
    }
}
