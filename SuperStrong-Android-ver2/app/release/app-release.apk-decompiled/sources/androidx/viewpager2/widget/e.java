package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* loaded from: classes.dex */
public final class e extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2258a;

    public e(ViewPager2 viewPager2) {
        this.f2258a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i6) {
        ViewPager2 viewPager2 = this.f2258a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f2217k.requestFocus(2);
        }
    }
}
