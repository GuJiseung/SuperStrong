package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<d0> f3116a = new AtomicReference<>();

    public static long a(long j5) {
        Calendar d6 = d(null);
        d6.setTimeInMillis(j5);
        return b(d6).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar d6 = d(calendar);
        Calendar d7 = d(null);
        d7.set(d6.get(1), d6.get(2), d6.get(5));
        return d7;
    }

    public static Calendar c() {
        Calendar calendar;
        d0 d0Var = f3116a.get();
        if (d0Var == null) {
            d0Var = d0.f3112c;
        }
        TimeZone timeZone = d0Var.f3114b;
        if (timeZone == null) {
            calendar = Calendar.getInstance();
        } else {
            calendar = Calendar.getInstance(timeZone);
        }
        Long l5 = d0Var.f3113a;
        if (l5 != null) {
            calendar.setTimeInMillis(l5.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
