package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class k extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f3140a = e0.d(null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3141b = e0.d(null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f3142c;

    public k(i iVar) {
        this.f3142c = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof g0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            g0 g0Var = (g0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (e0.c<Long, Long> cVar : this.f3142c.X.d()) {
                cVar.getClass();
            }
        }
    }
}
