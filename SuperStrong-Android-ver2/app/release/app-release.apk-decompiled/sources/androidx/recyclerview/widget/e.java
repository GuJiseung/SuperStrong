package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2055b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2056c;

    public e(k kVar, ArrayList arrayList) {
        this.f2056c = kVar;
        this.f2055b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2055b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2056c;
            if (hasNext) {
                RecyclerView.a0 a0Var = (RecyclerView.a0) it.next();
                kVar.getClass();
                View view = a0Var.f1873a;
                ViewPropertyAnimator animate = view.animate();
                kVar.f2086o.add(a0Var);
                animate.alpha(1.0f).setDuration(kVar.f1896c).setListener(new g(view, animate, kVar, a0Var)).start();
            } else {
                arrayList.clear();
                kVar.f2083l.remove(arrayList);
                return;
            }
        }
    }
}
