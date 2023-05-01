package com.google.android.material.tabs;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.superstrong.android.view.WalletActivity;
import java.lang.ref.WeakReference;
import l4.f;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final TabLayout f3380a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewPager2 f3381b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3382c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.d<?> f3383d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3384e;

    /* loaded from: classes.dex */
    public class a extends RecyclerView.f {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            d.this.a();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends ViewPager2.e {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f3386a;

        /* renamed from: c  reason: collision with root package name */
        public int f3388c = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3387b = 0;

        public c(TabLayout tabLayout) {
            this.f3386a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void a(int i6) {
            this.f3387b = this.f3388c;
            this.f3388c = i6;
            TabLayout tabLayout = this.f3386a.get();
            if (tabLayout != null) {
                tabLayout.T = this.f3388c;
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void b(float f6, int i6, int i7) {
            TabLayout tabLayout = this.f3386a.get();
            if (tabLayout != null) {
                int i8 = this.f3388c;
                boolean z5 = false;
                boolean z6 = i8 != 2 || this.f3387b == 1;
                if (i8 != 2 || this.f3387b != 0) {
                    z5 = true;
                }
                tabLayout.k(i6, f6, z6, z5);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public final void c(int i6) {
            TabLayout tabLayout = this.f3386a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i6 || i6 >= tabLayout.getTabCount()) {
                return;
            }
            int i7 = this.f3388c;
            tabLayout.j(tabLayout.g(i6), i7 == 0 || (i7 == 2 && this.f3387b == 0));
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028d implements TabLayout.d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager2 f3389a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3390b;

        public C0028d(ViewPager2 viewPager2, boolean z5) {
            this.f3389a = viewPager2;
            this.f3390b = z5;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c(TabLayout.f fVar) {
            int i6 = fVar.f3354d;
            ViewPager2 viewPager2 = this.f3389a;
            if (!((androidx.viewpager2.widget.c) viewPager2.f2221o.f3952c).f2253m) {
                viewPager2.b(i6, this.f3390b);
                return;
            }
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
    }

    public d(TabLayout tabLayout, ViewPager2 viewPager2, i0.d dVar) {
        this.f3380a = tabLayout;
        this.f3381b = viewPager2;
        this.f3382c = dVar;
    }

    public final void a() {
        TabLayout tabLayout = this.f3380a;
        tabLayout.i();
        RecyclerView.d<?> dVar = this.f3383d;
        if (dVar != null) {
            int c6 = dVar.c();
            for (int i6 = 0; i6 < c6; i6++) {
                TabLayout.f h6 = tabLayout.h();
                WalletActivity walletActivity = (WalletActivity) ((i0.d) this.f3382c).f4564b;
                int i7 = WalletActivity.f3559z;
                f.f(walletActivity, "this$0");
                String str = walletActivity.f3560w[i6];
                if (TextUtils.isEmpty(h6.f3353c) && !TextUtils.isEmpty(str)) {
                    h6.f3358h.setContentDescription(str);
                }
                h6.f3352b = str;
                TabLayout.h hVar = h6.f3358h;
                if (hVar != null) {
                    hVar.e();
                }
                tabLayout.a(h6, false);
            }
            if (c6 > 0) {
                int min = Math.min(this.f3381b.getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.j(tabLayout.g(min), true);
                }
            }
        }
    }
}
