package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3117b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g0 f3118c;

    public f0(g0 g0Var, int i6) {
        this.f3118c = g0Var;
        this.f3117b = i6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g0 g0Var = this.f3118c;
        v k5 = v.k(this.f3117b, g0Var.f3123c.f3128a0.f3174c);
        i<?> iVar = g0Var.f3123c;
        a aVar = iVar.Y;
        v vVar = aVar.f3084b;
        Calendar calendar = vVar.f3173b;
        Calendar calendar2 = k5.f3173b;
        if (calendar2.compareTo(calendar) < 0) {
            k5 = vVar;
        } else {
            v vVar2 = aVar.f3085c;
            if (calendar2.compareTo(vVar2.f3173b) > 0) {
                k5 = vVar2;
            }
        }
        iVar.R(k5);
        iVar.S(1);
    }
}
