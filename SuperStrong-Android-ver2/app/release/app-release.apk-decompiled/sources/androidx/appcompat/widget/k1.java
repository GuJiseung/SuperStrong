package androidx.appcompat.widget;

import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f832b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f833c;

    public /* synthetic */ k1(int i6, Object obj) {
        this.f832b = i6;
        this.f833c = obj;
    }

    private final void a() {
        long j5;
        y4.f fVar = (y4.f) this.f833c;
        ThreadPoolExecutor threadPoolExecutor = y4.f.f6881g;
        fVar.getClass();
        while (true) {
            long nanoTime = System.nanoTime();
            synchronized (fVar) {
                Iterator it = fVar.f6885d.iterator();
                y4.e eVar = null;
                long j6 = Long.MIN_VALUE;
                int i6 = 0;
                int i7 = 0;
                while (it.hasNext()) {
                    y4.e eVar2 = (y4.e) it.next();
                    if (fVar.b(eVar2, nanoTime) > 0) {
                        i7++;
                    } else {
                        i6++;
                        long j7 = nanoTime - eVar2.f6880q;
                        if (j7 > j6) {
                            eVar = eVar2;
                            j6 = j7;
                        }
                    }
                }
                j5 = fVar.f6883b;
                if (j6 < j5 && i6 <= fVar.f6882a) {
                    if (i6 > 0) {
                        j5 -= j6;
                    } else if (i7 <= 0) {
                        fVar.f6887f = false;
                        j5 = -1;
                    }
                }
                fVar.f6885d.remove(eVar);
                w4.e.c(eVar.f6868e);
                j5 = 0;
            }
            if (j5 == -1) {
                return;
            }
            if (j5 > 0) {
                long j8 = j5 / 1000000;
                long j9 = j5 - (1000000 * j8);
                synchronized (fVar) {
                    try {
                        fVar.wait(j8, (int) j9);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k1.run():void");
    }
}
