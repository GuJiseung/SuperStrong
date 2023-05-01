package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import o.i;
/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f1093b;

    /* renamed from: c  reason: collision with root package name */
    public int f1094c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f1095d;

    /* renamed from: e  reason: collision with root package name */
    public i f1096e;

    /* renamed from: f  reason: collision with root package name */
    public String f1097f;

    /* renamed from: g  reason: collision with root package name */
    public String f1098g;

    /* renamed from: h  reason: collision with root package name */
    public View[] f1099h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap<Integer, String> f1100i;

    public a(Context context) {
        super(context);
        this.f1093b = new int[32];
        this.f1099h = null;
        this.f1100i = new HashMap<>();
        this.f1095d = context;
        i(null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1093b = new int[32];
        this.f1099h = null;
        this.f1100i = new HashMap<>();
        this.f1095d = context;
        i(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f1095d
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1040n
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1040n
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.h(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<r.d> r1 = r.d.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f1100i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.d(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.c(java.lang.String):void");
    }

    public final void d(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i7 = this.f1094c + 1;
        int[] iArr = this.f1093b;
        if (i7 > iArr.length) {
            this.f1093b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1093b;
        int i8 = this.f1094c;
        iArr2[i8] = i6;
        this.f1094c = i8 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f1095d == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f1094c; i6++) {
            View view = constraintLayout.f1028b.get(this.f1093b[i6]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1093b, this.f1094c);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1095d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.a.f2640c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1097f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1098g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(o.d dVar, boolean z5) {
    }

    public final void k() {
        if (this.f1096e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f1076q0 = this.f1096e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1097f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1098g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1097f = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f1094c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                c(str.substring(i6));
                return;
            } else {
                c(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1098g = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f1094c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                e(str.substring(i6));
                return;
            } else {
                e(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1097f = null;
        this.f1094c = 0;
        for (int i6 : iArr) {
            d(i6);
        }
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        super.setTag(i6, obj);
        if (obj == null && this.f1097f == null) {
            d(i6);
        }
    }
}
