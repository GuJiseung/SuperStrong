package d;

import android.util.Log;
import d.r;
import s0.b;
/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3665b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3666c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3667d;

    public /* synthetic */ q(Object obj, int i6, Object obj2) {
        this.f3665b = i6;
        this.f3666c = obj;
        this.f3667d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f3665b;
        Object obj = this.f3667d;
        Object obj2 = this.f3666c;
        switch (i6) {
            case 0:
                r.a aVar = (r.a) obj2;
                Runnable runnable = (Runnable) obj;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            default:
                s0.c cVar = (s0.c) obj;
                b.C0086b c0086b = s0.b.f5973a;
                l4.f.f(cVar, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + ((String) obj2), cVar);
                throw cVar;
        }
    }
}
