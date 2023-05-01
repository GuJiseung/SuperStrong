package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class v implements Comparable<v>, Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f3173b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3174c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3175d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3176e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3177f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3178g;

    /* renamed from: h  reason: collision with root package name */
    public String f3179h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            return v.k(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i6) {
            return new v[i6];
        }
    }

    public v(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b6 = e0.b(calendar);
        this.f3173b = b6;
        this.f3174c = b6.get(2);
        this.f3175d = b6.get(1);
        this.f3176e = b6.getMaximum(7);
        this.f3177f = b6.getActualMaximum(5);
        this.f3178g = b6.getTimeInMillis();
    }

    public static v k(int i6, int i7) {
        Calendar d6 = e0.d(null);
        d6.set(1, i6);
        d6.set(2, i7);
        return new v(d6);
    }

    public static v m(long j5) {
        Calendar d6 = e0.d(null);
        d6.setTimeInMillis(j5);
        return new v(d6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(v vVar) {
        return this.f3173b.compareTo(vVar.f3173b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f3174c == vVar.f3174c && this.f3175d == vVar.f3175d;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3174c), Integer.valueOf(this.f3175d)});
    }

    public final String n() {
        if (this.f3179h == null) {
            this.f3179h = DateUtils.formatDateTime(null, this.f3173b.getTimeInMillis(), 8228);
        }
        return this.f3179h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f3175d);
        parcel.writeInt(this.f3174c);
    }
}
