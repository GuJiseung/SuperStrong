package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* loaded from: classes.dex */
public final class h extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.ClassLoaderCreator<h> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new h(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i6) {
            return new h[i6];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new h(parcel, classLoader);
        }
    }

    public h() {
    }

    public h(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i6 = 0; i6 < readInt; i6++) {
            put(iArr[i6], readParcelableArray[i6]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = keyAt(i7);
            parcelableArr[i7] = valueAt(i7);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i6);
    }
}
