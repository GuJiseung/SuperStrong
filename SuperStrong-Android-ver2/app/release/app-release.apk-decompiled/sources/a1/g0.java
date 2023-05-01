package a1;

import a1.i;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.superstrong.android.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class g0 extends l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f35a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f36b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f37c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h0 f38d;

    public g0(h0 h0Var, ViewGroup viewGroup, View view, View view2) {
        this.f38d = h0Var;
        this.f35a = viewGroup;
        this.f36b = view;
        this.f37c = view2;
    }

    @Override // a1.l, a1.i.d
    public final void b() {
        this.f35a.getOverlay().remove(this.f36b);
    }

    @Override // a1.l, a1.i.d
    public final void c() {
        View view = this.f36b;
        if (view.getParent() == null) {
            this.f35a.getOverlay().add(view);
            return;
        }
        h0 h0Var = this.f38d;
        ArrayList<Animator> arrayList = h0Var.f68n;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<i.d> arrayList2 = h0Var.f72r;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) h0Var.f72r.clone();
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                ((i.d) arrayList3.get(i6)).d();
            }
        }
    }

    @Override // a1.i.d
    public final void e(i iVar) {
        this.f37c.setTag(R.id.save_overlay_view, null);
        this.f35a.getOverlay().remove(this.f36b);
        iVar.y(this);
    }
}
