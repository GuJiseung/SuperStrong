package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;
/* loaded from: classes.dex */
public final class v implements b.InterfaceC0015b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2169a;

    public v(RecyclerView recyclerView) {
        this.f2169a = recyclerView;
    }

    public final int a() {
        return this.f2169a.getChildCount();
    }

    public final void b(int i6) {
        RecyclerView recyclerView = this.f2169a;
        View childAt = recyclerView.getChildAt(i6);
        if (childAt != null) {
            recyclerView.o(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i6);
    }
}
