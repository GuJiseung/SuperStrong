package b5;

import b5.g;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n extends w4.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2577c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e0.e f2578d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g.f f2579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g.f fVar, Object[] objArr, e0.e eVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f2579e = fVar;
        this.f2578d = eVar;
    }

    @Override // w4.b
    public final void a() {
        r[] rVarArr;
        long j5;
        g.f fVar = this.f2579e;
        boolean z5 = this.f2577c;
        e0.e eVar = this.f2578d;
        synchronized (g.this.f2544v) {
            synchronized (g.this) {
                int c6 = g.this.f2543t.c();
                if (z5) {
                    e0.e eVar2 = g.this.f2543t;
                    eVar2.f3804a = 0;
                    Arrays.fill((int[]) eVar2.f3805b, 0);
                }
                e0.e eVar3 = g.this.f2543t;
                eVar3.getClass();
                int i6 = 0;
                while (true) {
                    boolean z6 = true;
                    if (i6 >= 10) {
                        break;
                    }
                    if (((1 << i6) & eVar.f3804a) == 0) {
                        z6 = false;
                    }
                    if (z6) {
                        eVar3.d(i6, ((int[]) eVar.f3805b)[i6]);
                    }
                    i6++;
                }
                int c7 = g.this.f2543t.c();
                rVarArr = null;
                if (c7 != -1 && c7 != c6) {
                    j5 = c7 - c6;
                    if (!g.this.f2528d.isEmpty()) {
                        rVarArr = (r[]) g.this.f2528d.values().toArray(new r[g.this.f2528d.size()]);
                    }
                } else {
                    j5 = 0;
                }
            }
            try {
                g gVar = g.this;
                gVar.f2544v.c(gVar.f2543t);
            } catch (IOException e6) {
                g.this.c(2, 2, e6);
            }
        }
        if (rVarArr != null) {
            for (r rVar : rVarArr) {
                synchronized (rVar) {
                    rVar.f2601b += j5;
                    if (j5 > 0) {
                        rVar.notifyAll();
                    }
                }
            }
        }
        g.f2525y.execute(new o(fVar, g.this.f2529e));
    }
}
