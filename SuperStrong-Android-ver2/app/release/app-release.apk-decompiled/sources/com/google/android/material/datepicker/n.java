package com.google.android.material.datepicker;

import android.view.View;
/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f3147b;

    public n(i iVar) {
        this.f3147b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f3147b;
        int i6 = iVar.f3129b0;
        if (i6 == 2) {
            iVar.S(1);
        } else if (i6 == 1) {
            iVar.S(2);
        }
    }
}
