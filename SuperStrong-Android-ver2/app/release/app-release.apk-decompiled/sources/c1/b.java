package c1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f2743d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f2744e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2745f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2746g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2747h;

    /* renamed from: i  reason: collision with root package name */
    public int f2748i;

    /* renamed from: j  reason: collision with root package name */
    public int f2749j;

    /* renamed from: k  reason: collision with root package name */
    public int f2750k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l.b(), new l.b(), new l.b());
    }

    public b(Parcel parcel, int i6, int i7, String str, l.b<String, Method> bVar, l.b<String, Method> bVar2, l.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f2743d = new SparseIntArray();
        this.f2748i = -1;
        this.f2750k = -1;
        this.f2744e = parcel;
        this.f2745f = i6;
        this.f2746g = i7;
        this.f2749j = i6;
        this.f2747h = str;
    }

    @Override // c1.a
    public final b a() {
        Parcel parcel = this.f2744e;
        int dataPosition = parcel.dataPosition();
        int i6 = this.f2749j;
        if (i6 == this.f2745f) {
            i6 = this.f2746g;
        }
        int i7 = i6;
        return new b(parcel, dataPosition, i7, this.f2747h + "  ", this.f2740a, this.f2741b, this.f2742c);
    }

    @Override // c1.a
    public final boolean e() {
        return this.f2744e.readInt() != 0;
    }

    @Override // c1.a
    public final byte[] f() {
        Parcel parcel = this.f2744e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // c1.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2744e);
    }

    @Override // c1.a
    public final boolean h(int i6) {
        while (this.f2749j < this.f2746g) {
            int i7 = this.f2750k;
            if (i7 == i6) {
                return true;
            }
            if (String.valueOf(i7).compareTo(String.valueOf(i6)) > 0) {
                return false;
            }
            int i8 = this.f2749j;
            Parcel parcel = this.f2744e;
            parcel.setDataPosition(i8);
            int readInt = parcel.readInt();
            this.f2750k = parcel.readInt();
            this.f2749j += readInt;
        }
        return this.f2750k == i6;
    }

    @Override // c1.a
    public final int i() {
        return this.f2744e.readInt();
    }

    @Override // c1.a
    public final <T extends Parcelable> T j() {
        return (T) this.f2744e.readParcelable(b.class.getClassLoader());
    }

    @Override // c1.a
    public final String k() {
        return this.f2744e.readString();
    }

    @Override // c1.a
    public final void m(int i6) {
        u();
        this.f2748i = i6;
        this.f2743d.put(i6, this.f2744e.dataPosition());
        q(0);
        q(i6);
    }

    @Override // c1.a
    public final void n(boolean z5) {
        this.f2744e.writeInt(z5 ? 1 : 0);
    }

    @Override // c1.a
    public final void o(byte[] bArr) {
        Parcel parcel = this.f2744e;
        if (bArr == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }

    @Override // c1.a
    public final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2744e, 0);
    }

    @Override // c1.a
    public final void q(int i6) {
        this.f2744e.writeInt(i6);
    }

    @Override // c1.a
    public final void r(Parcelable parcelable) {
        this.f2744e.writeParcelable(parcelable, 0);
    }

    @Override // c1.a
    public final void s(String str) {
        this.f2744e.writeString(str);
    }

    public final void u() {
        int i6 = this.f2748i;
        if (i6 >= 0) {
            int i7 = this.f2743d.get(i6);
            Parcel parcel = this.f2744e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(dataPosition - i7);
            parcel.setDataPosition(dataPosition);
        }
    }
}
