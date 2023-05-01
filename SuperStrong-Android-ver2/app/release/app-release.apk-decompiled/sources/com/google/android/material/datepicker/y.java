package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;
import com.superstrong.android.R;
import f0.r0;
import java.util.Calendar;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class y extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.material.datepicker.a f3190c;

    /* renamed from: d  reason: collision with root package name */
    public final d<?> f3191d;

    /* renamed from: e  reason: collision with root package name */
    public final f f3192e;

    /* renamed from: f  reason: collision with root package name */
    public final i.e f3193f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3194g;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f3195t;
        public final MaterialCalendarGridView u;

        public a(LinearLayout linearLayout, boolean z5) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f3195t = textView;
            WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
            new f0.f0().e(textView, Boolean.TRUE);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z5) {
                textView.setVisibility(8);
            }
        }
    }

    public y(ContextThemeWrapper contextThemeWrapper, d dVar, com.google.android.material.datepicker.a aVar, f fVar, i.d dVar2) {
        int i6;
        Calendar calendar = aVar.f3084b.f3173b;
        v vVar = aVar.f3087e;
        if (calendar.compareTo(vVar.f3173b) <= 0) {
            if (vVar.f3173b.compareTo(aVar.f3085c.f3173b) <= 0) {
                int i7 = w.f3180h;
                int i8 = i.f3127j0;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i7;
                if (q.U(contextThemeWrapper)) {
                    i6 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i6 = 0;
                }
                this.f3194g = dimensionPixelSize + i6;
                this.f3190c = aVar;
                this.f3191d = dVar;
                this.f3192e = fVar;
                this.f3193f = dVar2;
                if (!this.f1892a.a()) {
                    this.f1893b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final int c() {
        return this.f3190c.f3090h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final long d(int i6) {
        Calendar b6 = e0.b(this.f3190c.f3084b.f3173b);
        b6.add(2, i6);
        return new v(b6).f3173b.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void f(a aVar, int i6) {
        a aVar2 = aVar;
        com.google.android.material.datepicker.a aVar3 = this.f3190c;
        Calendar b6 = e0.b(aVar3.f3084b.f3173b);
        b6.add(2, i6);
        v vVar = new v(b6);
        aVar2.f3195t.setText(vVar.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar2.u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && vVar.equals(materialCalendarGridView.getAdapter2().f3182b)) {
            materialCalendarGridView.invalidate();
            w adapter2 = materialCalendarGridView.getAdapter2();
            for (Long l5 : adapter2.f3184d) {
                adapter2.e(materialCalendarGridView, l5.longValue());
            }
            d<?> dVar = adapter2.f3183c;
            if (dVar != null) {
                for (Long l6 : dVar.h()) {
                    adapter2.e(materialCalendarGridView, l6.longValue());
                }
                adapter2.f3184d = dVar.h();
            }
        } else {
            w wVar = new w(vVar, this.f3191d, aVar3, this.f3192e);
            materialCalendarGridView.setNumColumns(vVar.f3176e);
            materialCalendarGridView.setAdapter((ListAdapter) wVar);
        }
        materialCalendarGridView.setOnItemClickListener(new x(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final RecyclerView.a0 g(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (q.U(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f3194g));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }
}
