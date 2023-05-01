package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.superstrong.android.R;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final int f3119e;

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3120b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3121c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3122d;

    static {
        f3119e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar d6 = e0.d(null);
        this.f3120b = d6;
        this.f3121c = d6.getMaximum(7);
        this.f3122d = d6.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3121c;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        int i7 = this.f3121c;
        if (i6 >= i7) {
            return null;
        }
        int i8 = i6 + this.f3122d;
        if (i8 > i7) {
            i8 -= i7;
        }
        return Integer.valueOf(i8);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i7 = i6 + this.f3122d;
        int i8 = this.f3121c;
        if (i7 > i8) {
            i7 -= i8;
        }
        Calendar calendar = this.f3120b;
        calendar.set(7, i7);
        textView.setText(calendar.getDisplayName(7, f3119e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public g(int i6) {
        Calendar d6 = e0.d(null);
        this.f3120b = d6;
        this.f3121c = d6.getMaximum(7);
        this.f3122d = i6;
    }
}
