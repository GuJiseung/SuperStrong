package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0023a();

    /* renamed from: b  reason: collision with root package name */
    public final v f3084b;

    /* renamed from: c  reason: collision with root package name */
    public final v f3085c;

    /* renamed from: d  reason: collision with root package name */
    public final c f3086d;

    /* renamed from: e  reason: collision with root package name */
    public final v f3087e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3088f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3089g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3090h;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0023a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((v) parcel.readParcelable(v.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (v) parcel.readParcelable(v.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f3091f = e0.a(v.k(1900, 0).f3178g);

        /* renamed from: g  reason: collision with root package name */
        public static final long f3092g = e0.a(v.k(2100, 11).f3178g);

        /* renamed from: a  reason: collision with root package name */
        public final long f3093a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3094b;

        /* renamed from: c  reason: collision with root package name */
        public Long f3095c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3096d;

        /* renamed from: e  reason: collision with root package name */
        public final c f3097e;

        public b(a aVar) {
            this.f3093a = f3091f;
            this.f3094b = f3092g;
            this.f3097e = new e(Long.MIN_VALUE);
            this.f3093a = aVar.f3084b.f3178g;
            this.f3094b = aVar.f3085c.f3178g;
            this.f3095c = Long.valueOf(aVar.f3087e.f3178g);
            this.f3096d = aVar.f3088f;
            this.f3097e = aVar.f3086d;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean e(long j5);
    }

    public a(v vVar, v vVar2, c cVar, v vVar3, int i6) {
        Objects.requireNonNull(vVar, "start cannot be null");
        Objects.requireNonNull(vVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f3084b = vVar;
        this.f3085c = vVar2;
        this.f3087e = vVar3;
        this.f3088f = i6;
        this.f3086d = cVar;
        Calendar calendar = vVar.f3173b;
        if (vVar3 != null && calendar.compareTo(vVar3.f3173b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (vVar3 != null && vVar3.f3173b.compareTo(vVar2.f3173b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 >= 0 && i6 <= e0.d(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i7 = vVar2.f3175d;
                int i8 = vVar.f3175d;
                this.f3090h = (vVar2.f3174c - vVar.f3174c) + ((i7 - i8) * 12) + 1;
                this.f3089g = (i7 - i8) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3084b.equals(aVar.f3084b) && this.f3085c.equals(aVar.f3085c) && e0.b.a(this.f3087e, aVar.f3087e) && this.f3088f == aVar.f3088f && this.f3086d.equals(aVar.f3086d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3084b, this.f3085c, this.f3087e, Integer.valueOf(this.f3088f), this.f3086d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f3084b, 0);
        parcel.writeParcelable(this.f3085c, 0);
        parcel.writeParcelable(this.f3087e, 0);
        parcel.writeParcelable(this.f3086d, 0);
        parcel.writeInt(this.f3088f);
    }
}
