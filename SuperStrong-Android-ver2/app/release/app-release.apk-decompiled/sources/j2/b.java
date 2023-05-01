package j2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f4698a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4699b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f4700c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4701d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4702e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0052a();

        /* renamed from: b  reason: collision with root package name */
        public int f4703b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f4704c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f4705d;

        /* renamed from: e  reason: collision with root package name */
        public int f4706e;

        /* renamed from: f  reason: collision with root package name */
        public int f4707f;

        /* renamed from: g  reason: collision with root package name */
        public int f4708g;

        /* renamed from: h  reason: collision with root package name */
        public Locale f4709h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f4710i;

        /* renamed from: j  reason: collision with root package name */
        public int f4711j;

        /* renamed from: k  reason: collision with root package name */
        public int f4712k;

        /* renamed from: l  reason: collision with root package name */
        public Integer f4713l;

        /* renamed from: m  reason: collision with root package name */
        public Boolean f4714m;

        /* renamed from: n  reason: collision with root package name */
        public Integer f4715n;

        /* renamed from: o  reason: collision with root package name */
        public Integer f4716o;

        /* renamed from: p  reason: collision with root package name */
        public Integer f4717p;

        /* renamed from: q  reason: collision with root package name */
        public Integer f4718q;

        /* renamed from: r  reason: collision with root package name */
        public Integer f4719r;
        public Integer s;

        /* renamed from: j2.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0052a implements Parcelable.Creator<a> {
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
            this.f4706e = 255;
            this.f4707f = -2;
            this.f4708g = -2;
            this.f4714m = Boolean.TRUE;
        }

        public a(Parcel parcel) {
            this.f4706e = 255;
            this.f4707f = -2;
            this.f4708g = -2;
            this.f4714m = Boolean.TRUE;
            this.f4703b = parcel.readInt();
            this.f4704c = (Integer) parcel.readSerializable();
            this.f4705d = (Integer) parcel.readSerializable();
            this.f4706e = parcel.readInt();
            this.f4707f = parcel.readInt();
            this.f4708g = parcel.readInt();
            this.f4710i = parcel.readString();
            this.f4711j = parcel.readInt();
            this.f4713l = (Integer) parcel.readSerializable();
            this.f4715n = (Integer) parcel.readSerializable();
            this.f4716o = (Integer) parcel.readSerializable();
            this.f4717p = (Integer) parcel.readSerializable();
            this.f4718q = (Integer) parcel.readSerializable();
            this.f4719r = (Integer) parcel.readSerializable();
            this.s = (Integer) parcel.readSerializable();
            this.f4714m = (Boolean) parcel.readSerializable();
            this.f4709h = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f4703b);
            parcel.writeSerializable(this.f4704c);
            parcel.writeSerializable(this.f4705d);
            parcel.writeInt(this.f4706e);
            parcel.writeInt(this.f4707f);
            parcel.writeInt(this.f4708g);
            CharSequence charSequence = this.f4710i;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f4711j);
            parcel.writeSerializable(this.f4713l);
            parcel.writeSerializable(this.f4715n);
            parcel.writeSerializable(this.f4716o);
            parcel.writeSerializable(this.f4717p);
            parcel.writeSerializable(this.f4718q);
            parcel.writeSerializable(this.f4719r);
            parcel.writeSerializable(this.s);
            parcel.writeSerializable(this.f4714m);
            parcel.writeSerializable(this.f4709h);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r17, j2.b.a r18) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.b.<init>(android.content.Context, j2.b$a):void");
    }
}
