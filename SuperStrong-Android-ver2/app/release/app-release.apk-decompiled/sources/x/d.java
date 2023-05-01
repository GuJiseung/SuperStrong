package x;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(TypedArray typedArray, int i6) {
            return typedArray.getType(i6);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final C0099d[] f6614a;

        public c(C0099d[] c0099dArr) {
            this.f6614a = c0099dArr;
        }
    }

    /* renamed from: x.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0099d {

        /* renamed from: a  reason: collision with root package name */
        public final String f6615a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6616b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6617c;

        /* renamed from: d  reason: collision with root package name */
        public final String f6618d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6619e;

        /* renamed from: f  reason: collision with root package name */
        public final int f6620f;

        public C0099d(int i6, int i7, int i8, String str, String str2, boolean z5) {
            this.f6615a = str;
            this.f6616b = i6;
            this.f6617c = z5;
            this.f6618d = str2;
            this.f6619e = i7;
            this.f6620f = i8;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final c0.f f6621a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6622b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6623c;

        /* renamed from: d  reason: collision with root package name */
        public final String f6624d;

        public e(c0.f fVar, int i6, int i7, String str) {
            this.f6621a = fVar;
            this.f6623c = i6;
            this.f6622b = i7;
            this.f6624d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i6;
        boolean z5;
        int i7;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c.b.f2681p0);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        c(xmlResourceParser);
                    }
                    return new e(new c0.f(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c.b.f2683q0);
                            int i8 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i8 = 1;
                            }
                            int i9 = obtainAttributes2.getInt(i8, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i6 = 6;
                            } else {
                                i6 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i6, 0)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int i10 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i10 = 3;
                            }
                            int i11 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i11 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i11);
                            int i12 = obtainAttributes2.getInt(i10, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i7 = 5;
                            } else {
                                i7 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                            String string6 = obtainAttributes2.getString(i7);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                c(xmlResourceParser);
                            }
                            arrayList.add(new C0099d(i9, i12, resourceId2, string6, string5, z5));
                        } else {
                            c(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new c((C0099d[]) arrayList.toArray(new C0099d[0]));
                }
            } else {
                c(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i6) {
        if (i6 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i6);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i7 = 0; i7 < obtainTypedArray.length(); i7++) {
                    int resourceId = obtainTypedArray.getResourceId(i7, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i6);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i6 = 1;
        while (i6 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i6++;
            } else if (next == 3) {
                i6--;
            }
        }
    }
}
