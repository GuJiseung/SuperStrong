package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import c1.a;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        int i6 = iconCompat.f1255a;
        if (aVar.h(1)) {
            i6 = aVar.i();
        }
        iconCompat.f1255a = i6;
        byte[] bArr = iconCompat.f1257c;
        if (aVar.h(2)) {
            bArr = aVar.f();
        }
        iconCompat.f1257c = bArr;
        Parcelable parcelable2 = iconCompat.f1258d;
        if (aVar.h(3)) {
            parcelable2 = aVar.j();
        }
        iconCompat.f1258d = parcelable2;
        int i7 = iconCompat.f1259e;
        if (aVar.h(4)) {
            i7 = aVar.i();
        }
        iconCompat.f1259e = i7;
        int i8 = iconCompat.f1260f;
        if (aVar.h(5)) {
            i8 = aVar.i();
        }
        iconCompat.f1260f = i8;
        Parcelable parcelable3 = iconCompat.f1261g;
        if (aVar.h(6)) {
            parcelable3 = aVar.j();
        }
        iconCompat.f1261g = (ColorStateList) parcelable3;
        String str = iconCompat.f1263i;
        if (aVar.h(7)) {
            str = aVar.k();
        }
        iconCompat.f1263i = str;
        String str2 = iconCompat.f1264j;
        if (aVar.h(8)) {
            str2 = aVar.k();
        }
        iconCompat.f1264j = str2;
        iconCompat.f1262h = PorterDuff.Mode.valueOf(iconCompat.f1263i);
        switch (iconCompat.f1255a) {
            case -1:
                parcelable = iconCompat.f1258d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1256b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f1258d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f1257c;
                    iconCompat.f1256b = bArr2;
                    iconCompat.f1255a = 3;
                    iconCompat.f1259e = 0;
                    iconCompat.f1260f = bArr2.length;
                    break;
                }
                iconCompat.f1256b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1257c, Charset.forName("UTF-16"));
                iconCompat.f1256b = str3;
                if (iconCompat.f1255a == 2 && iconCompat.f1264j == null) {
                    iconCompat.f1264j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f1256b = iconCompat.f1257c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1263i = iconCompat.f1262h.name();
        switch (iconCompat.f1255a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1258d = (Parcelable) iconCompat.f1256b;
                break;
            case 2:
                iconCompat.f1257c = ((String) iconCompat.f1256b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1257c = (byte[]) iconCompat.f1256b;
                break;
            case 4:
            case 6:
                iconCompat.f1257c = iconCompat.f1256b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.f1255a;
        if (-1 != i6) {
            aVar.m(1);
            aVar.q(i6);
        }
        byte[] bArr = iconCompat.f1257c;
        if (bArr != null) {
            aVar.m(2);
            aVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.f1258d;
        if (parcelable != null) {
            aVar.m(3);
            aVar.r(parcelable);
        }
        int i7 = iconCompat.f1259e;
        if (i7 != 0) {
            aVar.m(4);
            aVar.q(i7);
        }
        int i8 = iconCompat.f1260f;
        if (i8 != 0) {
            aVar.m(5);
            aVar.q(i8);
        }
        ColorStateList colorStateList = iconCompat.f1261g;
        if (colorStateList != null) {
            aVar.m(6);
            aVar.r(colorStateList);
        }
        String str = iconCompat.f1263i;
        if (str != null) {
            aVar.m(7);
            aVar.s(str);
        }
        String str2 = iconCompat.f1264j;
        if (str2 != null) {
            aVar.m(8);
            aVar.s(str2);
        }
    }
}
