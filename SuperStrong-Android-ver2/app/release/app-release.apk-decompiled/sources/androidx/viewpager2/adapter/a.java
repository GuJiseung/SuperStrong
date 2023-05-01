package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f2198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f2199b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2200c;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, f fVar) {
        this.f2200c = fragmentStateAdapter;
        this.f2198a = frameLayout;
        this.f2199b = fVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        FrameLayout frameLayout = this.f2198a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f2200c.p(this.f2199b);
        }
    }
}
