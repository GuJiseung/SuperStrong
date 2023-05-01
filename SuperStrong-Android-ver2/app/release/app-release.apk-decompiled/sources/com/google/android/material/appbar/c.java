package com.google.android.material.appbar;

import android.view.View;
import g0.j;
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2915a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2916b;

    public c(AppBarLayout appBarLayout, boolean z5) {
        this.f2915a = appBarLayout;
        this.f2916b = z5;
    }

    @Override // g0.j
    public final boolean a(View view) {
        this.f2915a.setExpanded(this.f2916b);
        return true;
    }
}
