package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.superstrong.android.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public final class w extends BaseAdapter {

    /* renamed from: h  reason: collision with root package name */
    public static final int f3180h = e0.d(null).getMaximum(4);

    /* renamed from: i  reason: collision with root package name */
    public static final int f3181i = (e0.d(null).getMaximum(7) + e0.d(null).getMaximum(5)) - 1;

    /* renamed from: b  reason: collision with root package name */
    public final v f3182b;

    /* renamed from: c  reason: collision with root package name */
    public final d<?> f3183c;

    /* renamed from: d  reason: collision with root package name */
    public Collection<Long> f3184d;

    /* renamed from: e  reason: collision with root package name */
    public c f3185e;

    /* renamed from: f  reason: collision with root package name */
    public final a f3186f;

    /* renamed from: g  reason: collision with root package name */
    public final f f3187g;

    public w(v vVar, d<?> dVar, a aVar, f fVar) {
        this.f3182b = vVar;
        this.f3183c = dVar;
        this.f3186f = aVar;
        this.f3187g = fVar;
        this.f3184d = dVar.h();
    }

    public final int b() {
        int i6 = this.f3186f.f3088f;
        v vVar = this.f3182b;
        Calendar calendar = vVar.f3173b;
        int i7 = calendar.get(7);
        if (i6 <= 0) {
            i6 = calendar.getFirstDayOfWeek();
        }
        int i8 = i7 - i6;
        if (i8 < 0) {
            return i8 + vVar.f3176e;
        }
        return i8;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i6) {
        if (i6 >= b()) {
            int b6 = b();
            v vVar = this.f3182b;
            if (i6 <= (b6 + vVar.f3177f) - 1) {
                Calendar b7 = e0.b(vVar.f3173b);
                b7.set(5, (i6 - b()) + 1);
                return Long.valueOf(b7.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    public final void d(TextView textView, long j5, int i6) {
        boolean z5;
        boolean z6;
        String format;
        b bVar;
        boolean z7;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z8 = true;
        if (e0.c().getTimeInMillis() == j5) {
            z5 = true;
        } else {
            z5 = false;
        }
        d<?> dVar = this.f3183c;
        for (e0.c<Long, Long> cVar : dVar.d()) {
            cVar.getClass();
        }
        for (e0.c<Long, Long> cVar2 : dVar.d()) {
            cVar2.getClass();
        }
        Calendar c6 = e0.c();
        Calendar d6 = e0.d(null);
        d6.setTimeInMillis(j5);
        if (c6.get(1) == d6.get(1)) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            format = instanceForSkeleton.format(new Date(j5));
        } else {
            DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
            instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
            format = instanceForSkeleton2.format(new Date(j5));
        }
        if (z5) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        textView.setContentDescription(format);
        if (this.f3186f.f3086d.e(j5)) {
            textView.setEnabled(true);
            Iterator<Long> it = dVar.h().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (e0.a(j5) == e0.a(it.next().longValue())) {
                        z7 = true;
                        break;
                    }
                } else {
                    z7 = false;
                    break;
                }
            }
            textView.setSelected(z7);
            if (z7) {
                bVar = this.f3185e.f3105b;
            } else {
                if (e0.c().getTimeInMillis() != j5) {
                    z8 = false;
                }
                c cVar3 = this.f3185e;
                if (z8) {
                    bVar = cVar3.f3106c;
                } else {
                    bVar = cVar3.f3104a;
                }
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f3185e.f3110g;
        }
        if (this.f3187g != null && i6 != -1) {
            int i7 = this.f3182b.f3175d;
            bVar.b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        bVar.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j5) {
        v m5 = v.m(j5);
        v vVar = this.f3182b;
        if (m5.equals(vVar)) {
            Calendar b6 = e0.b(vVar.f3173b);
            b6.setTimeInMillis(j5);
            int i6 = b6.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().b() + (i6 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j5, i6);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3181i;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6 / this.f3182b.f3176e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f3185e
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f3185e = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131492966(0x7f0c0066, float:1.8609399E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.v r8 = r5.f3182b
            int r2 = r8.f3177f
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            goto L74
        L6d:
            long r1 = r6.longValue()
            r5.d(r0, r1, r7)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.w.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
