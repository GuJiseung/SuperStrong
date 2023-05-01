package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f1464b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1465c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1466d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1467e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1468f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1469g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1470h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1471i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1472j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f1473k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1474l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1475m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f1476n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i6) {
            return new f0[i6];
        }
    }

    public f0(Parcel parcel) {
        this.f1464b = parcel.readString();
        this.f1465c = parcel.readString();
        this.f1466d = parcel.readInt() != 0;
        this.f1467e = parcel.readInt();
        this.f1468f = parcel.readInt();
        this.f1469g = parcel.readString();
        this.f1470h = parcel.readInt() != 0;
        this.f1471i = parcel.readInt() != 0;
        this.f1472j = parcel.readInt() != 0;
        this.f1473k = parcel.readBundle();
        this.f1474l = parcel.readInt() != 0;
        this.f1476n = parcel.readBundle();
        this.f1475m = parcel.readInt();
    }

    public f0(o oVar) {
        this.f1464b = oVar.getClass().getName();
        this.f1465c = oVar.f1571f;
        this.f1466d = oVar.f1579n;
        this.f1467e = oVar.f1586w;
        this.f1468f = oVar.f1587x;
        this.f1469g = oVar.f1588y;
        this.f1470h = oVar.B;
        this.f1471i = oVar.f1578m;
        this.f1472j = oVar.A;
        this.f1473k = oVar.f1572g;
        this.f1474l = oVar.f1589z;
        this.f1475m = oVar.M.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1464b);
        sb.append(" (");
        sb.append(this.f1465c);
        sb.append(")}:");
        if (this.f1466d) {
            sb.append(" fromLayout");
        }
        int i6 = this.f1468f;
        if (i6 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i6));
        }
        String str = this.f1469g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1470h) {
            sb.append(" retainInstance");
        }
        if (this.f1471i) {
            sb.append(" removing");
        }
        if (this.f1472j) {
            sb.append(" detached");
        }
        if (this.f1474l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f1464b);
        parcel.writeString(this.f1465c);
        parcel.writeInt(this.f1466d ? 1 : 0);
        parcel.writeInt(this.f1467e);
        parcel.writeInt(this.f1468f);
        parcel.writeString(this.f1469g);
        parcel.writeInt(this.f1470h ? 1 : 0);
        parcel.writeInt(this.f1471i ? 1 : 0);
        parcel.writeInt(this.f1472j ? 1 : 0);
        parcel.writeBundle(this.f1473k);
        parcel.writeInt(this.f1474l ? 1 : 0);
        parcel.writeBundle(this.f1476n);
        parcel.writeInt(this.f1475m);
    }
}
