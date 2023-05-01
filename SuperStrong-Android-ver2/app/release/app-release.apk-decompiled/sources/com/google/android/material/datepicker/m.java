package com.google.android.material.datepicker;

import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class m extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f3144a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3145b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3146c;

    public m(i iVar, y yVar, MaterialButton materialButton) {
        this.f3146c = iVar;
        this.f3144a = yVar;
        this.f3145b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void a(int i6, RecyclerView recyclerView) {
        if (i6 == 0) {
            recyclerView.announceForAccessibility(this.f3145b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public final void b(RecyclerView recyclerView, int i6, int i7) {
        int N0;
        i iVar = this.f3146c;
        if (i6 < 0) {
            N0 = ((LinearLayoutManager) iVar.f3132e0.getLayoutManager()).M0();
        } else {
            N0 = ((LinearLayoutManager) iVar.f3132e0.getLayoutManager()).N0();
        }
        y yVar = this.f3144a;
        Calendar b6 = e0.b(yVar.f3190c.f3084b.f3173b);
        b6.add(2, N0);
        iVar.f3128a0 = new v(b6);
        Calendar b7 = e0.b(yVar.f3190c.f3084b.f3173b);
        b7.add(2, N0);
        b7.set(5, 1);
        Calendar b8 = e0.b(b7);
        b8.get(2);
        b8.get(1);
        b8.getMaximum(7);
        b8.getActualMaximum(5);
        b8.getTimeInMillis();
        this.f3145b.setText(DateUtils.formatDateTime(null, b8.getTimeInMillis(), 8228));
    }
}
