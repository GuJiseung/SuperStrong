package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2053b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2054c;

    public d(k kVar, ArrayList arrayList) {
        this.f2054c = kVar;
        this.f2053b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ArrayList arrayList = this.f2053b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2054c;
            if (hasNext) {
                k.a aVar = (k.a) it.next();
                kVar.getClass();
                RecyclerView.a0 a0Var = aVar.f2090a;
                View view2 = null;
                if (a0Var == null) {
                    view = null;
                } else {
                    view = a0Var.f1873a;
                }
                RecyclerView.a0 a0Var2 = aVar.f2091b;
                if (a0Var2 != null) {
                    view2 = a0Var2.f1873a;
                }
                ArrayList<RecyclerView.a0> arrayList2 = kVar.f2089r;
                long j5 = kVar.f1899f;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j5);
                    arrayList2.add(aVar.f2090a);
                    duration.translationX(aVar.f2094e - aVar.f2092c);
                    duration.translationY(aVar.f2095f - aVar.f2093d);
                    duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator animate = view2.animate();
                    arrayList2.add(aVar.f2091b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(j5).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
                }
            } else {
                arrayList.clear();
                kVar.f2085n.remove(arrayList);
                return;
            }
        }
    }
}
