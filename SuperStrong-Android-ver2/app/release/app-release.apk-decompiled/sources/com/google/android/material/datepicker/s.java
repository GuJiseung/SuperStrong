package com.google.android.material.datepicker;

import android.view.View;
/* loaded from: classes.dex */
public final class s implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f3171b;

    public s(q qVar) {
        this.f3171b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f3171b;
        qVar.G0.setEnabled(qVar.S().f());
        qVar.E0.toggle();
        qVar.X(qVar.E0);
        qVar.W();
    }
}
