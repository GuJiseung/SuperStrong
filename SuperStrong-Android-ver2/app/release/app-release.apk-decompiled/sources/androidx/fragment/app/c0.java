package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a0;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f1439b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f1440c;

    /* renamed from: d  reason: collision with root package name */
    public b[] f1441d;

    /* renamed from: e  reason: collision with root package name */
    public int f1442e;

    /* renamed from: f  reason: collision with root package name */
    public String f1443f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<String> f1444g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<c> f1445h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<a0.l> f1446i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            return new c0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i6) {
            return new c0[i6];
        }
    }

    public c0() {
        this.f1443f = null;
        this.f1444g = new ArrayList<>();
        this.f1445h = new ArrayList<>();
    }

    public c0(Parcel parcel) {
        this.f1443f = null;
        this.f1444g = new ArrayList<>();
        this.f1445h = new ArrayList<>();
        this.f1439b = parcel.createStringArrayList();
        this.f1440c = parcel.createStringArrayList();
        this.f1441d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1442e = parcel.readInt();
        this.f1443f = parcel.readString();
        this.f1444g = parcel.createStringArrayList();
        this.f1445h = parcel.createTypedArrayList(c.CREATOR);
        this.f1446i = parcel.createTypedArrayList(a0.l.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeStringList(this.f1439b);
        parcel.writeStringList(this.f1440c);
        parcel.writeTypedArray(this.f1441d, i6);
        parcel.writeInt(this.f1442e);
        parcel.writeString(this.f1443f);
        parcel.writeStringList(this.f1444g);
        parcel.writeTypedList(this.f1445h);
        parcel.writeTypedList(this.f1446i);
    }
}
