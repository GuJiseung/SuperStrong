package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2045b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f2046c;

    public c(k kVar, ArrayList arrayList) {
        this.f2046c = kVar;
        this.f2045b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f2045b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            k kVar = this.f2046c;
            if (hasNext) {
                k.b bVar = (k.b) it.next();
                RecyclerView.a0 a0Var = bVar.f2096a;
                kVar.getClass();
                View view = a0Var.f1873a;
                int i6 = bVar.f2099d - bVar.f2097b;
                int i7 = bVar.f2100e - bVar.f2098c;
                if (i6 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i7 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                kVar.f2087p.add(a0Var);
                animate.setDuration(kVar.f1898e).setListener(new h(kVar, a0Var, i6, view, i7, animate)).start();
            } else {
                arrayList.clear();
                kVar.f2084m.remove(arrayList);
                return;
            }
        }
    }
}
