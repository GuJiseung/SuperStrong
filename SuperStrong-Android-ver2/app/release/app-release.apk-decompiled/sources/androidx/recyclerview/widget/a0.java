package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a0 extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f2029a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2030b = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2031a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(int i6, RecyclerView recyclerView) {
            if (i6 == 0 && this.f2031a) {
                this.f2031a = false;
                a0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i6, int i7) {
            if (i6 == 0 && i7 == 0) {
                return;
            }
            this.f2031a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2029a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f2030b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1842g0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f2029a.setOnFlingListener(null);
        }
        this.f2029a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f2029a.h(aVar);
                this.f2029a.setOnFlingListener(this);
                new Scroller(this.f2029a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.l lVar, View view);

    public abstract View c(RecyclerView.l lVar);

    public final void d() {
        RecyclerView.l layoutManager;
        View c6;
        RecyclerView recyclerView = this.f2029a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c6 = c(layoutManager)) == null) {
            return;
        }
        int[] b6 = b(layoutManager, c6);
        int i6 = b6[0];
        if (i6 != 0 || b6[1] != 0) {
            this.f2029a.b0(i6, b6[1], false);
        }
    }
}
