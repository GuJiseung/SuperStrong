package b3;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import j2.b;
import z2.h;
/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: b  reason: collision with root package name */
    public d f2418b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2419c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f2420d;

    /* loaded from: classes.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0019a();

        /* renamed from: b  reason: collision with root package name */
        public int f2421b;

        /* renamed from: c  reason: collision with root package name */
        public h f2422c;

        /* renamed from: b3.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0019a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i6) {
                return new a[i6];
            }
        }

        public a() {
        }

        public a(Parcel parcel) {
            this.f2421b = parcel.readInt();
            this.f2422c = (h) parcel.readParcelable(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f2421b);
            parcel.writeParcelable(this.f2422c, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f2418b.D = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        SparseArray<j2.a> sparseArray;
        if (parcelable instanceof a) {
            d dVar = this.f2418b;
            a aVar = (a) parcelable;
            int i6 = aVar.f2421b;
            int size = dVar.D.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                MenuItem item = dVar.D.getItem(i7);
                if (i6 == item.getItemId()) {
                    dVar.f2400h = i6;
                    dVar.f2401i = i7;
                    item.setChecked(true);
                    break;
                }
                i7++;
            }
            Context context = this.f2418b.getContext();
            h hVar = aVar.f2422c;
            SparseArray sparseArray2 = new SparseArray(hVar.size());
            for (int i8 = 0; i8 < hVar.size(); i8++) {
                int keyAt = hVar.keyAt(i8);
                b.a aVar2 = (b.a) hVar.valueAt(i8);
                if (aVar2 != null) {
                    sparseArray2.put(keyAt, new j2.a(context, aVar2));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            d dVar2 = this.f2418b;
            dVar2.getClass();
            int i9 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = dVar2.s;
                if (i9 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i9);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (j2.a) sparseArray2.get(keyAt2));
                }
                i9++;
            }
            b3.a[] aVarArr = dVar2.f2399g;
            if (aVarArr != null) {
                for (b3.a aVar3 : aVarArr) {
                    aVar3.setBadge(sparseArray.get(aVar3.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f2420d;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean h(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(boolean z5) {
        boolean z6;
        a1.a aVar;
        if (this.f2419c) {
            return;
        }
        if (z5) {
            this.f2418b.a();
            return;
        }
        d dVar = this.f2418b;
        androidx.appcompat.view.menu.f fVar = dVar.D;
        if (fVar != null && dVar.f2399g != null) {
            int size = fVar.size();
            if (size != dVar.f2399g.length) {
                dVar.a();
                return;
            }
            int i6 = dVar.f2400h;
            for (int i7 = 0; i7 < size; i7++) {
                MenuItem item = dVar.D.getItem(i7);
                if (item.isChecked()) {
                    dVar.f2400h = item.getItemId();
                    dVar.f2401i = i7;
                }
            }
            if (i6 != dVar.f2400h && (aVar = dVar.f2394b) != null) {
                a1.m.a(dVar, aVar);
            }
            int i8 = dVar.f2398f;
            int size2 = dVar.D.l().size();
            if (i8 != -1 ? i8 == 0 : size2 > 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            for (int i9 = 0; i9 < size; i9++) {
                dVar.C.f2419c = true;
                dVar.f2399g[i9].setLabelVisibilityMode(dVar.f2398f);
                dVar.f2399g[i9].setShifting(z6);
                dVar.f2399g[i9].c((androidx.appcompat.view.menu.h) dVar.D.getItem(i9));
                dVar.C.f2419c = false;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable k() {
        a aVar = new a();
        aVar.f2421b = this.f2418b.getSelectedItemId();
        SparseArray<j2.a> badgeDrawables = this.f2418b.getBadgeDrawables();
        h hVar = new h();
        for (int i6 = 0; i6 < badgeDrawables.size(); i6++) {
            int keyAt = badgeDrawables.keyAt(i6);
            j2.a valueAt = badgeDrawables.valueAt(i6);
            if (valueAt != null) {
                hVar.put(keyAt, valueAt.f4689f.f4698a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f2422c = hVar;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(androidx.appcompat.view.menu.h hVar) {
        return false;
    }
}
