package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.i0;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int[] f1423b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f1424c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1425d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1426e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1427f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1428g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1429h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1430i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f1431j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1432k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f1433l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f1434m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f1435n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1436o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i6) {
            return new b[i6];
        }
    }

    public b(Parcel parcel) {
        this.f1423b = parcel.createIntArray();
        this.f1424c = parcel.createStringArrayList();
        this.f1425d = parcel.createIntArray();
        this.f1426e = parcel.createIntArray();
        this.f1427f = parcel.readInt();
        this.f1428g = parcel.readString();
        this.f1429h = parcel.readInt();
        this.f1430i = parcel.readInt();
        this.f1431j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1432k = parcel.readInt();
        this.f1433l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1434m = parcel.createStringArrayList();
        this.f1435n = parcel.createStringArrayList();
        this.f1436o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1499a.size();
        this.f1423b = new int[size * 6];
        if (!aVar.f1505g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1424c = new ArrayList<>(size);
        this.f1425d = new int[size];
        this.f1426e = new int[size];
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            i0.a aVar2 = aVar.f1499a.get(i6);
            int i8 = i7 + 1;
            this.f1423b[i7] = aVar2.f1514a;
            ArrayList<String> arrayList = this.f1424c;
            o oVar = aVar2.f1515b;
            arrayList.add(oVar != null ? oVar.f1571f : null);
            int[] iArr = this.f1423b;
            int i9 = i8 + 1;
            iArr[i8] = aVar2.f1516c ? 1 : 0;
            int i10 = i9 + 1;
            iArr[i9] = aVar2.f1517d;
            int i11 = i10 + 1;
            iArr[i10] = aVar2.f1518e;
            int i12 = i11 + 1;
            iArr[i11] = aVar2.f1519f;
            iArr[i12] = aVar2.f1520g;
            this.f1425d[i6] = aVar2.f1521h.ordinal();
            this.f1426e[i6] = aVar2.f1522i.ordinal();
            i6++;
            i7 = i12 + 1;
        }
        this.f1427f = aVar.f1504f;
        this.f1428g = aVar.f1506h;
        this.f1429h = aVar.f1385r;
        this.f1430i = aVar.f1507i;
        this.f1431j = aVar.f1508j;
        this.f1432k = aVar.f1509k;
        this.f1433l = aVar.f1510l;
        this.f1434m = aVar.f1511m;
        this.f1435n = aVar.f1512n;
        this.f1436o = aVar.f1513o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeIntArray(this.f1423b);
        parcel.writeStringList(this.f1424c);
        parcel.writeIntArray(this.f1425d);
        parcel.writeIntArray(this.f1426e);
        parcel.writeInt(this.f1427f);
        parcel.writeString(this.f1428g);
        parcel.writeInt(this.f1429h);
        parcel.writeInt(this.f1430i);
        TextUtils.writeToParcel(this.f1431j, parcel, 0);
        parcel.writeInt(this.f1432k);
        TextUtils.writeToParcel(this.f1433l, parcel, 0);
        parcel.writeStringList(this.f1434m);
        parcel.writeStringList(this.f1435n);
        parcel.writeInt(this.f1436o ? 1 : 0);
    }
}
