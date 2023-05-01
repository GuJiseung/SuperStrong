package r;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f5862a;

    /* renamed from: b  reason: collision with root package name */
    public int f5863b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f5864c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<a> f5865d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f5866e = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f5867a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<C0084b> f5868b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public final int f5869c;

        /* renamed from: d  reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f5870d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f5869c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.a.f2648k);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f5867a = obtainStyledAttributes.getResourceId(index, this.f5867a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f5869c);
                    this.f5869c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f5870d = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0084b {

        /* renamed from: a  reason: collision with root package name */
        public final float f5871a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5872b;

        /* renamed from: c  reason: collision with root package name */
        public final float f5873c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5874d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5875e;

        /* renamed from: f  reason: collision with root package name */
        public final androidx.constraintlayout.widget.b f5876f;

        public C0084b(Context context, XmlResourceParser xmlResourceParser) {
            this.f5871a = Float.NaN;
            this.f5872b = Float.NaN;
            this.f5873c = Float.NaN;
            this.f5874d = Float.NaN;
            this.f5875e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), c.a.f2650m);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f5875e);
                    this.f5875e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f5876f = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f5874d = obtainStyledAttributes.getDimension(index, this.f5874d);
                } else if (index == 2) {
                    this.f5872b = obtainStyledAttributes.getDimension(index, this.f5872b);
                } else if (index == 3) {
                    this.f5873c = obtainStyledAttributes.getDimension(index, this.f5873c);
                } else if (index == 4) {
                    this.f5871a = obtainStyledAttributes.getDimension(index, this.f5871a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f6, float f7) {
            float f8 = this.f5871a;
            if (Float.isNaN(f8) || f6 >= f8) {
                float f9 = this.f5872b;
                if (Float.isNaN(f9) || f7 >= f9) {
                    float f10 = this.f5873c;
                    if (Float.isNaN(f10) || f6 <= f10) {
                        float f11 = this.f5874d;
                        return Float.isNaN(f11) || f7 <= f11;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i6) {
        this.f5862a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                boolean z5 = true;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        z5 = true;
                                        break;
                                    }
                                    z5 = true;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        z5 = true;
                                        break;
                                    }
                                    z5 = true;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    z5 = true;
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        z5 = false;
                                        break;
                                    }
                                    z5 = true;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        z5 = true;
                                        break;
                                    }
                                    z5 = true;
                                    break;
                                default:
                                    z5 = true;
                                    break;
                            }
                            if (!z5) {
                                if (!z5) {
                                    if (!z5) {
                                        continue;
                                    } else {
                                        a(context, xml);
                                        continue;
                                    }
                                } else {
                                    C0084b c0084b = new C0084b(context, xml);
                                    if (aVar != null) {
                                        aVar.f5868b.add(c0084b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                a aVar2 = new a(context, xml);
                                this.f5865d.put(aVar2.f5867a, aVar2);
                                aVar = aVar2;
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0226, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.b.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
