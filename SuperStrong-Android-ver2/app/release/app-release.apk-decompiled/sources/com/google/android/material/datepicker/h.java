package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f3125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3126c;

    public h(i iVar, y yVar) {
        this.f3126c = iVar;
        this.f3125b = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f3126c;
        int N0 = ((LinearLayoutManager) iVar.f3132e0.getLayoutManager()).N0() - 1;
        if (N0 >= 0) {
            Calendar b6 = e0.b(this.f3125b.f3190c.f3084b.f3173b);
            b6.add(2, N0);
            iVar.R(new v(b6));
        }
    }
}
