package f1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i1.h;
import k1.w;
import r1.e;
/* loaded from: classes.dex */
public final class c implements w1.b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f3951b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3952c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3953d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f3951b = obj;
        this.f3952c = obj2;
        this.f3953d = obj3;
    }

    @Override // w1.b
    public final w a(w wVar, h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((w1.b) this.f3952c).a(e.b(((BitmapDrawable) drawable).getBitmap(), (l1.d) this.f3951b), hVar);
        }
        if (drawable instanceof v1.c) {
            return ((w1.b) this.f3953d).a(wVar, hVar);
        }
        return null;
    }
}
