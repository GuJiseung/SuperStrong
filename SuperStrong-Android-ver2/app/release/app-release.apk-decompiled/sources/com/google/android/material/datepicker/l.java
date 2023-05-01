package com.google.android.material.datepicker;

import android.view.View;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class l extends f0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f3143d;

    public l(i iVar) {
        this.f3143d = iVar;
    }

    @Override // f0.a
    public final void d(View view, g0.f fVar) {
        int i6;
        this.f3856a.onInitializeAccessibilityNodeInfo(view, fVar.f4095a);
        i iVar = this.f3143d;
        if (iVar.f3136i0.getVisibility() == 0) {
            i6 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            i6 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        fVar.h(iVar.m(i6));
    }
}
