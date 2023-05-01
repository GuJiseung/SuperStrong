package k3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import l.h;
/* loaded from: classes.dex */
public final class a extends l0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0058a();

    /* renamed from: d  reason: collision with root package name */
    public final h<String, Bundle> f4939d;

    /* renamed from: k3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0058a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i6) {
            return new a[i6];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader);
        }
    }

    public a() {
        throw null;
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4939d = new h<>(readInt);
        for (int i6 = 0; i6 < readInt; i6++) {
            this.f4939d.put(strArr[i6], bundleArr[i6]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f4939d + "}";
    }

    @Override // l0.a, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f5073b, i6);
        h<String, Bundle> hVar = this.f4939d;
        int i7 = hVar.f5067d;
        parcel.writeInt(i7);
        String[] strArr = new String[i7];
        Bundle[] bundleArr = new Bundle[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            strArr[i8] = hVar.h(i8);
            bundleArr[i8] = hVar.l(i8);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
