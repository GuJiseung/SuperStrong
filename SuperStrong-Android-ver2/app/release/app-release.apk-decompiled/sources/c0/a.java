package c0;

import android.graphics.Typeface;
import x.f;
import y.e;
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f2692b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f2693c;

    public a(n nVar, Typeface typeface) {
        this.f2692b = nVar;
        this.f2693c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f2692b).f6732f;
        if (eVar != null) {
            eVar.d(this.f2693c);
        }
    }
}
