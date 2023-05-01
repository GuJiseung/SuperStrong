package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import g0.j;
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2912c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2913d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2914e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i6) {
        this.f2914e = baseBehavior;
        this.f2910a = coordinatorLayout;
        this.f2911b = appBarLayout;
        this.f2912c = view;
        this.f2913d = i6;
    }

    @Override // g0.j
    public final boolean a(View view) {
        this.f2914e.E(this.f2910a, this.f2911b, this.f2912c, this.f2913d, new int[]{0, 0});
        return true;
    }
}
