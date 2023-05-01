package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* loaded from: classes.dex */
public final class d extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f2257a;

    public d(ViewPager2 viewPager2) {
        this.f2257a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i6) {
        if (i6 == 0) {
            this.f2257a.c();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i6) {
        ViewPager2 viewPager2 = this.f2257a;
        if (viewPager2.f2211e != i6) {
            viewPager2.f2211e = i6;
            viewPager2.u.b();
        }
    }
}
