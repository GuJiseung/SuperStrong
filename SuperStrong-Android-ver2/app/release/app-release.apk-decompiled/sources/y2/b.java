package y2;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;
/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f6755b;

    public b(d dVar) {
        this.f6755b = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f6755b;
        float rotation = dVar.f3240q.getRotation();
        if (dVar.f3233j != rotation) {
            dVar.f3233j = rotation;
            dVar.m();
            return true;
        }
        return true;
    }
}
