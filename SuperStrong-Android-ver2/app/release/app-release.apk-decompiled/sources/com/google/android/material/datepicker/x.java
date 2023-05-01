package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class x implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3188b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f3189c;

    public x(y yVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f3189c = yVar;
        this.f3188b = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
        boolean z5;
        MaterialCalendarGridView materialCalendarGridView = this.f3188b;
        w adapter2 = materialCalendarGridView.getAdapter2();
        if (i6 >= adapter2.b() && i6 <= (adapter2.b() + adapter2.f3182b.f3177f) - 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i.e eVar = this.f3189c.f3193f;
            long longValue = materialCalendarGridView.getAdapter2().getItem(i6).longValue();
            i iVar = i.this;
            if (iVar.Y.f3086d.e(longValue)) {
                iVar.X.a();
                Iterator it = iVar.V.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).a(iVar.X.i());
                }
                iVar.f3132e0.getAdapter().f1892a.b();
                RecyclerView recyclerView = iVar.f3131d0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1892a.b();
                }
            }
        }
    }
}
