package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import x0.b;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f1785f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1786a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f1787b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f1788c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f1789d;

    /* renamed from: e  reason: collision with root package name */
    public final b.InterfaceC0100b f1790e;

    /* loaded from: classes.dex */
    public static final class a {
        public static z a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new z();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    l4.f.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new z(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj = parcelableArrayList.get(i6);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i6));
                }
                return new z(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public z() {
        this.f1786a = new LinkedHashMap();
        this.f1787b = new LinkedHashMap();
        this.f1788c = new LinkedHashMap();
        this.f1789d = new LinkedHashMap();
        this.f1790e = new b.InterfaceC0100b() { // from class: androidx.lifecycle.y
            @Override // x0.b.InterfaceC0100b
            public final Bundle a() {
                return z.a(z.this);
            }
        };
    }

    public z(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1786a = linkedHashMap;
        this.f1787b = new LinkedHashMap();
        this.f1788c = new LinkedHashMap();
        this.f1789d = new LinkedHashMap();
        this.f1790e = new androidx.activity.c(2, this);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle a(androidx.lifecycle.z r10) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.z.a(androidx.lifecycle.z):android.os.Bundle");
    }
}
