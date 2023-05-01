package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.h f3379b;

    public c(TabLayout.h hVar, View view) {
        this.f3379b = hVar;
        this.f3378a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        View view2 = this.f3378a;
        if (view2.getVisibility() == 0) {
            this.f3379b.d(view2);
        }
    }
}
