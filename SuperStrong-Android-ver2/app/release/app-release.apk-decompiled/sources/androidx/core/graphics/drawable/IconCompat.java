package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1254k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public Object f1256b;

    /* renamed from: j  reason: collision with root package name */
    public String f1264j;

    /* renamed from: a  reason: collision with root package name */
    public int f1255a = -1;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1257c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1258d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1259e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1260f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1261g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1262h = f1254k;

    /* renamed from: i  reason: collision with root package name */
    public String f1263i = null;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        public static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        public static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        public static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    public final String toString() {
        String str;
        int height;
        int i6;
        if (this.f1255a == -1) {
            return String.valueOf(this.f1256b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1255a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1255a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1256b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1256b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1264j);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i7 = this.f1255a;
                if (i7 == -1) {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj = this.f1256b;
                    if (i8 >= 28) {
                        i6 = a.a(obj);
                    } else {
                        try {
                            i6 = ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon resource", e6);
                            i6 = 0;
                        }
                    }
                } else if (i7 == 2) {
                    i6 = this.f1259e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i6);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1259e);
                if (this.f1260f != 0) {
                    sb.append(" off=");
                    height = this.f1260f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1256b);
                break;
        }
        if (this.f1261g != null) {
            sb.append(" tint=");
            sb.append(this.f1261g);
        }
        if (this.f1262h != f1254k) {
            sb.append(" mode=");
            sb.append(this.f1262h);
        }
        sb.append(")");
        return sb.toString();
    }
}
