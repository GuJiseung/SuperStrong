package com.google.android.material.datepicker;

import android.view.View;
import f0.x0;
/* loaded from: classes.dex */
public final class r implements f0.x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3168a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3169b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3170c;

    public r(int i6, View view, int i7) {
        this.f3168a = i6;
        this.f3169b = view;
        this.f3170c = i7;
    }

    @Override // f0.x
    public final x0 a(View view, x0 x0Var) {
        int i6 = x0Var.f3921a.f(7).f6724b;
        View view2 = this.f3169b;
        int i7 = this.f3168a;
        if (i7 >= 0) {
            view2.getLayoutParams().height = i7 + i6;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f3170c + i6, view2.getPaddingRight(), view2.getPaddingBottom());
        return x0Var;
    }
}
