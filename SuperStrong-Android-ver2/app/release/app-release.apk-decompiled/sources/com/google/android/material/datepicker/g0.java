package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.superstrong.android.R;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g0 extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f3123c;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.a0 {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f3124t;

        public a(TextView textView) {
            super(textView);
            this.f3124t = textView;
        }
    }

    public g0(i<?> iVar) {
        this.f3123c = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final int c() {
        return this.f3123c.Y.f3089g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void f(a aVar, int i6) {
        String format;
        b bVar;
        i<?> iVar = this.f3123c;
        int i7 = iVar.Y.f3084b.f3175d + i6;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i7));
        TextView textView = aVar.f3124t;
        textView.setText(format2);
        Context context = textView.getContext();
        if (e0.c().get(1) == i7) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7));
        }
        textView.setContentDescription(format);
        c cVar = iVar.f3130c0;
        Calendar c6 = e0.c();
        if (c6.get(1) == i7) {
            bVar = cVar.f3109f;
        } else {
            bVar = cVar.f3107d;
        }
        for (Long l5 : iVar.X.h()) {
            c6.setTimeInMillis(l5.longValue());
            if (c6.get(1) == i7) {
                bVar = cVar.f3108e;
            }
        }
        bVar.b(textView);
        textView.setOnClickListener(new f0(this, i7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final RecyclerView.a0 g(RecyclerView recyclerView) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
