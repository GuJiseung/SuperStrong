package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f3148b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3149c;

    public o(i iVar, y yVar) {
        this.f3149c = iVar;
        this.f3148b = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f3149c;
        int M0 = ((LinearLayoutManager) iVar.f3132e0.getLayoutManager()).M0() + 1;
        if (M0 < iVar.f3132e0.getAdapter().c()) {
            Calendar b6 = e0.b(this.f3148b.f3190c.f3084b.f3173b);
            b6.add(2, M0);
            iVar.R(new v(b6));
        }
    }
}
