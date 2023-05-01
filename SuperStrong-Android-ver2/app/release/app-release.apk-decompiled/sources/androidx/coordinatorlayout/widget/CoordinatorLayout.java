package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.superstrong.android.R;
import f0.g0;
import f0.k;
import f0.r0;
import f0.u;
import f0.v;
import f0.w;
import f0.x;
import f0.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import w.a;
import z.a;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements u, v {
    public static final String u;

    /* renamed from: v  reason: collision with root package name */
    public static final Class<?>[] f1205v;

    /* renamed from: w  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1206w;

    /* renamed from: x  reason: collision with root package name */
    public static final i f1207x;

    /* renamed from: y  reason: collision with root package name */
    public static final e0.f f1208y;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1209b;

    /* renamed from: c  reason: collision with root package name */
    public final m.c f1210c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1211d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f1212e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1213f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1214g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1215h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1216i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f1217j;

    /* renamed from: k  reason: collision with root package name */
    public View f1218k;

    /* renamed from: l  reason: collision with root package name */
    public View f1219l;

    /* renamed from: m  reason: collision with root package name */
    public g f1220m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1221n;

    /* renamed from: o  reason: collision with root package name */
    public x0 f1222o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1223p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f1224q;

    /* renamed from: r  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1225r;
    public a s;

    /* renamed from: t  reason: collision with root package name */
    public final w f1226t;

    /* loaded from: classes.dex */
    public class a implements x {
        public a() {
        }

        @Override // f0.x
        public final x0 a(View view, x0 x0Var) {
            boolean z5;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!e0.b.a(coordinatorLayout.f1222o, x0Var)) {
                coordinatorLayout.f1222o = x0Var;
                boolean z6 = true;
                if (x0Var.d() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                coordinatorLayout.f1223p = z5;
                coordinatorLayout.setWillNotDraw((z5 || coordinatorLayout.getBackground() != null) ? false : false);
                x0.k kVar = x0Var.f3921a;
                if (!kVar.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = coordinatorLayout.getChildAt(i6);
                        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                        if (g0.d.b(childAt) && ((f) childAt.getLayoutParams()).f1229a != null && kVar.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return x0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i6, int i7, int[] iArr, int i8) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z5) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i6, int i7) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i6) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1225r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f1225r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1229a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1230b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1231c;

        /* renamed from: d  reason: collision with root package name */
        public int f1232d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1233e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1234f;

        /* renamed from: g  reason: collision with root package name */
        public int f1235g;

        /* renamed from: h  reason: collision with root package name */
        public int f1236h;

        /* renamed from: i  reason: collision with root package name */
        public int f1237i;

        /* renamed from: j  reason: collision with root package name */
        public int f1238j;

        /* renamed from: k  reason: collision with root package name */
        public View f1239k;

        /* renamed from: l  reason: collision with root package name */
        public View f1240l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1241m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1242n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1243o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1244p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1245q;

        public f() {
            super(-2, -2);
            this.f1230b = false;
            this.f1231c = 0;
            this.f1232d = 0;
            this.f1233e = -1;
            this.f1234f = -1;
            this.f1235g = 0;
            this.f1236h = 0;
            this.f1245q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f1230b = false;
            this.f1231c = 0;
            this.f1232d = 0;
            this.f1233e = -1;
            this.f1234f = -1;
            this.f1235g = 0;
            this.f1236h = 0;
            this.f1245q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.app.r0.f1628f);
            this.f1231c = obtainStyledAttributes.getInteger(0, 0);
            this.f1234f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1232d = obtainStyledAttributes.getInteger(2, 0);
            this.f1233e = obtainStyledAttributes.getInteger(6, -1);
            this.f1235g = obtainStyledAttributes.getInt(5, 0);
            this.f1236h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1230b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.u;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f1206w;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1205v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e6) {
                        throw new RuntimeException("Could not inflate Behavior subclass " + string, e6);
                    }
                }
                this.f1229a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f1229a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1230b = false;
            this.f1231c = 0;
            this.f1232d = 0;
            this.f1233e = -1;
            this.f1234f = -1;
            this.f1235g = 0;
            this.f1236h = 0;
            this.f1245q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1230b = false;
            this.f1231c = 0;
            this.f1232d = 0;
            this.f1233e = -1;
            this.f1234f = -1;
            this.f1235g = 0;
            this.f1236h = 0;
            this.f1245q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1230b = false;
            this.f1231c = 0;
            this.f1232d = 0;
            this.f1233e = -1;
            this.f1234f = -1;
            this.f1235g = 0;
            this.f1236h = 0;
            this.f1245q = new Rect();
        }

        public final boolean a(int i6) {
            if (i6 != 0) {
                if (i6 != 1) {
                    return false;
                }
                return this.f1243o;
            }
            return this.f1242n;
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.p(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends l0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public SparseArray<Parcelable> f1247d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
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

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1247d = new SparseArray<>(readInt);
            for (int i6 = 0; i6 < readInt; i6++) {
                this.f1247d.append(iArr[i6], readParcelableArray[i6]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            int i7;
            parcel.writeParcelable(this.f5073b, i6);
            SparseArray<Parcelable> sparseArray = this.f1247d;
            if (sparseArray != null) {
                i7 = sparseArray.size();
            } else {
                i7 = 0;
            }
            parcel.writeInt(i7);
            int[] iArr = new int[i7];
            Parcelable[] parcelableArr = new Parcelable[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = this.f1247d.keyAt(i8);
                parcelableArr[i8] = this.f1247d.valueAt(i8);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i6);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            float m5 = g0.i.m(view);
            float m6 = g0.i.m(view2);
            if (m5 > m6) {
                return -1;
            }
            if (m5 < m6) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        u = r0 != null ? r0.getName() : null;
        f1207x = new i();
        f1205v = new Class[]{Context.class, AttributeSet.class};
        f1206w = new ThreadLocal<>();
        f1208y = new e0.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1209b = new ArrayList();
        this.f1210c = new m.c(1);
        this.f1211d = new ArrayList();
        this.f1212e = new ArrayList();
        this.f1213f = new int[2];
        this.f1214g = new int[2];
        this.f1226t = new w();
        int[] iArr = androidx.fragment.app.r0.f1627e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1217j = intArray;
            float f6 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i6 = 0; i6 < length; i6++) {
                int[] iArr2 = this.f1217j;
                iArr2[i6] = (int) (iArr2[i6] * f6);
            }
        }
        this.f1224q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        x();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.d.c(this) == 0) {
            g0.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f1208y.b();
        return rect == null ? new Rect() : rect;
    }

    public static void g(int i6, Rect rect, Rect rect2, f fVar, int i7, int i8) {
        int width;
        int height;
        int i9 = fVar.f1231c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
        int i10 = fVar.f1232d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i6);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        if (i13 != 1) {
            if (i13 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i14 != 16) {
            if (i14 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i11 != 1) {
            if (i11 != 5) {
                width -= i7;
            }
        } else {
            width -= i7 / 2;
        }
        if (i12 != 16) {
            if (i12 != 80) {
                height -= i8;
            }
        } else {
            height -= i8 / 2;
        }
        rect2.set(width, height, i7 + width, i8 + height);
    }

    public static f k(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1230b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c cVar = fVar.f1229a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.f();
                    }
                    fVar.f1229a = behavior;
                    fVar.f1230b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c newInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        c cVar2 = fVar.f1229a;
                        if (cVar2 != newInstance) {
                            if (cVar2 != null) {
                                cVar2.f();
                            }
                            fVar.f1229a = newInstance;
                            fVar.f1230b = true;
                            if (newInstance != null) {
                                newInstance.c(fVar);
                            }
                        }
                    } catch (Exception e6) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e6);
                    }
                }
            }
            fVar.f1230b = true;
        }
        return fVar;
    }

    public static void v(View view, int i6) {
        f fVar = (f) view.getLayoutParams();
        int i7 = fVar.f1237i;
        if (i7 != i6) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            view.offsetLeftAndRight(i6 - i7);
            fVar.f1237i = i6;
        }
    }

    public static void w(View view, int i6) {
        f fVar = (f) view.getLayoutParams();
        int i7 = fVar.f1238j;
        if (i7 != i6) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            view.offsetTopAndBottom(i6 - i7);
            fVar.f1238j = i6;
        }
    }

    @Override // f0.u
    public final void b(View view, View view2, int i6, int i7) {
        w wVar = this.f1226t;
        if (i7 == 1) {
            wVar.f3919b = i6;
        } else {
            wVar.f3918a = i6;
        }
        this.f1219l = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((f) getChildAt(i8).getLayoutParams()).getClass();
        }
    }

    public final void c(f fVar, Rect rect, int i6, int i7) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i6) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i7) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i6 + max, i7 + max2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        c cVar = ((f) view.getLayoutParams()).f1229a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1224q;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        l.h hVar = (l.h) this.f1210c.f5160b;
        int i6 = hVar.f5067d;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < i6; i7++) {
            ArrayList arrayList2 = (ArrayList) hVar.l(i7);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(hVar.h(i7));
            }
        }
        ArrayList arrayList3 = this.f1212e;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = t.a.f6124a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = t.a.f6124a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        t.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = t.a.f6125b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f1209b);
    }

    public final x0 getLastWindowInsets() {
        return this.f1222o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        w wVar = this.f1226t;
        return wVar.f3919b | wVar.f3918a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1224q;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i6) {
        StringBuilder sb;
        int[] iArr = this.f1217j;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i6);
        } else if (i6 >= 0 && i6 < iArr.length) {
            return iArr[i6];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i6);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // f0.u
    public final void i(View view, int i6) {
        w wVar = this.f1226t;
        if (i6 == 1) {
            wVar.f3919b = 0;
        } else {
            wVar.f3918a = 0;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i6)) {
                c cVar = fVar.f1229a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i6);
                }
                if (i6 != 0) {
                    if (i6 == 1) {
                        fVar.f1243o = false;
                    }
                } else {
                    fVar.f1242n = false;
                }
                fVar.f1244p = false;
            }
        }
        this.f1219l = null;
    }

    @Override // f0.u
    public final void j(View view, int i6, int i7, int[] iArr, int i8) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i8) && (cVar = fVar.f1229a) != null) {
                    int[] iArr2 = this.f1213f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i6, i7, iArr2, i8);
                    int[] iArr3 = this.f1213f;
                    if (i6 > 0) {
                        min = Math.max(i9, iArr3[0]);
                    } else {
                        min = Math.min(i9, iArr3[0]);
                    }
                    i9 = min;
                    if (i7 > 0) {
                        min2 = Math.max(i10, iArr3[1]);
                    } else {
                        min2 = Math.min(i10, iArr3[1]);
                    }
                    i10 = min2;
                    z5 = true;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
        if (z5) {
            p(1);
        }
    }

    public final boolean l(View view, int i6, int i7) {
        e0.f fVar = f1208y;
        Rect a6 = a();
        f(view, a6);
        try {
            return a6.contains(i6, i7);
        } finally {
            a6.setEmpty();
            fVar.a(a6);
        }
    }

    @Override // f0.v
    public final void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i10) && (cVar = fVar.f1229a) != null) {
                    int[] iArr2 = this.f1213f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i7, i8, i9, iArr2);
                    i11 = i8 > 0 ? Math.max(i11, iArr2[0]) : Math.min(i11, iArr2[0]);
                    i12 = i9 > 0 ? Math.max(i12, iArr2[1]) : Math.min(i12, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i11;
        iArr[1] = iArr[1] + i12;
        if (z5) {
            p(1);
        }
    }

    @Override // f0.u
    public final void n(View view, int i6, int i7, int i8, int i9, int i10) {
        m(view, i6, i7, i8, i9, 0, this.f1214g);
    }

    @Override // f0.u
    public final boolean o(View view, View view2, int i6, int i7) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1229a;
                if (cVar != null) {
                    boolean p5 = cVar.p(this, childAt, view, view2, i6, i7);
                    z5 |= p5;
                    if (i7 != 0) {
                        if (i7 == 1) {
                            fVar.f1243o = p5;
                        }
                    } else {
                        fVar.f1242n = p5;
                    }
                } else if (i7 != 0) {
                    if (i7 == 1) {
                        fVar.f1243o = false;
                    }
                } else {
                    fVar.f1242n = false;
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.f1221n) {
            if (this.f1220m == null) {
                this.f1220m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1220m);
        }
        if (this.f1222o == null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.d.b(this)) {
                g0.h.c(this);
            }
        }
        this.f1216i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.f1221n && this.f1220m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1220m);
        }
        View view = this.f1219l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1216i = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1223p || this.f1224q == null) {
            return;
        }
        x0 x0Var = this.f1222o;
        int d6 = x0Var != null ? x0Var.d() : 0;
        if (d6 > 0) {
            this.f1224q.setBounds(0, 0, getWidth(), d6);
            this.f1224q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        c cVar;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        int d6 = g0.e.d(this);
        ArrayList arrayList = this.f1209b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1229a) == null || !cVar.h(this, view, d6))) {
                q(view, d6);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0193, code lost:
        if (r0.i(r32, r19, r25, r20, r26) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1229a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        c cVar;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1229a) != null) {
                    z5 |= cVar.j(view);
                }
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i6, int i7, int[] iArr) {
        j(view, i6, i7, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i6, int i7, int i8, int i9) {
        n(view, i6, i7, i8, i9, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i6) {
        b(view, view2, i6, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f5073b);
        SparseArray<Parcelable> sparseArray = hVar.f1247d;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            c cVar = k(childAt).f1229a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o5;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1229a;
            if (id != -1 && cVar != null && (o5 = cVar.o(childAt)) != null) {
                sparseArray.append(id, o5);
            }
        }
        hVar.f1247d = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i6) {
        return o(view, view2, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1218k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f1218k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1229a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f1218k
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f1218k
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.u(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i6) {
        int i7;
        Rect rect;
        int i8;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int width;
        int i9;
        int i10;
        int i11;
        int height;
        int i12;
        int i13;
        int i14;
        int i15;
        f fVar;
        ArrayList arrayList2;
        int i16;
        Rect rect2;
        int i17;
        View view;
        e0.f fVar2;
        f fVar3;
        int i18;
        boolean z9;
        c cVar;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        int d6 = g0.e.d(this);
        ArrayList arrayList3 = this.f1209b;
        int size = arrayList3.size();
        Rect a6 = a();
        Rect a7 = a();
        Rect a8 = a();
        int i19 = i6;
        int i20 = 0;
        while (true) {
            e0.f fVar4 = f1208y;
            if (i20 < size) {
                View view2 = (View) arrayList3.get(i20);
                f fVar5 = (f) view2.getLayoutParams();
                if (i19 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i8 = size;
                    rect = a8;
                    i7 = i20;
                } else {
                    int i21 = 0;
                    while (i21 < i20) {
                        if (fVar5.f1240l == ((View) arrayList3.get(i21))) {
                            f fVar6 = (f) view2.getLayoutParams();
                            if (fVar6.f1239k != null) {
                                Rect a9 = a();
                                Rect a10 = a();
                                arrayList2 = arrayList3;
                                Rect a11 = a();
                                i15 = i21;
                                f(fVar6.f1239k, a9);
                                d(view2, a10, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i16 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i17 = i20;
                                fVar = fVar5;
                                view = view2;
                                rect2 = a8;
                                fVar2 = fVar4;
                                g(d6, a9, a11, fVar6, measuredWidth, measuredHeight);
                                if (a11.left == a10.left && a11.top == a10.top) {
                                    fVar3 = fVar6;
                                    i18 = measuredWidth;
                                    z9 = false;
                                } else {
                                    fVar3 = fVar6;
                                    i18 = measuredWidth;
                                    z9 = true;
                                }
                                c(fVar3, a11, i18, measuredHeight);
                                int i22 = a11.left - a10.left;
                                int i23 = a11.top - a10.top;
                                if (i22 != 0) {
                                    WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                                    view.offsetLeftAndRight(i22);
                                }
                                if (i23 != 0) {
                                    WeakHashMap<View, r0> weakHashMap3 = g0.f3878a;
                                    view.offsetTopAndBottom(i23);
                                }
                                if (z9 && (cVar = fVar3.f1229a) != null) {
                                    cVar.d(this, view, fVar3.f1239k);
                                }
                                a9.setEmpty();
                                fVar2.a(a9);
                                a10.setEmpty();
                                fVar2.a(a10);
                                a11.setEmpty();
                                fVar2.a(a11);
                                i21 = i15 + 1;
                                fVar4 = fVar2;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i16;
                                i20 = i17;
                                fVar5 = fVar;
                                a8 = rect2;
                            }
                        }
                        i15 = i21;
                        fVar = fVar5;
                        arrayList2 = arrayList3;
                        i16 = size;
                        rect2 = a8;
                        i17 = i20;
                        view = view2;
                        fVar2 = fVar4;
                        i21 = i15 + 1;
                        fVar4 = fVar2;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i16;
                        i20 = i17;
                        fVar5 = fVar;
                        a8 = rect2;
                    }
                    f fVar7 = fVar5;
                    ArrayList arrayList4 = arrayList3;
                    int i24 = size;
                    Rect rect3 = a8;
                    i7 = i20;
                    View view3 = view2;
                    e0.f fVar8 = fVar4;
                    d(view3, a7, true);
                    if (fVar7.f1235g != 0 && !a7.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar7.f1235g, d6);
                        int i25 = absoluteGravity & 112;
                        if (i25 != 48) {
                            if (i25 == 80) {
                                a6.bottom = Math.max(a6.bottom, getHeight() - a7.top);
                            }
                        } else {
                            a6.top = Math.max(a6.top, a7.bottom);
                        }
                        int i26 = absoluteGravity & 7;
                        if (i26 != 3) {
                            if (i26 == 5) {
                                a6.right = Math.max(a6.right, getWidth() - a7.left);
                            }
                        } else {
                            a6.left = Math.max(a6.left, a7.right);
                        }
                    }
                    if (fVar7.f1236h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, r0> weakHashMap4 = g0.f3878a;
                        if (g0.g.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            f fVar9 = (f) view3.getLayoutParams();
                            c cVar2 = fVar9.f1229a;
                            Rect a12 = a();
                            Rect a13 = a();
                            a13.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (cVar2 != null && cVar2.a(view3)) {
                                if (!a13.contains(a12)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a12.toShortString() + " | Bounds:" + a13.toShortString());
                                }
                            } else {
                                a12.set(a13);
                            }
                            a13.setEmpty();
                            fVar8.a(a13);
                            if (!a12.isEmpty()) {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar9.f1236h, d6);
                                if ((absoluteGravity2 & 48) == 48 && (i13 = (a12.top - ((ViewGroup.MarginLayoutParams) fVar9).topMargin) - fVar9.f1238j) < (i14 = a6.top)) {
                                    w(view3, i14 - i13);
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a12.bottom) - ((ViewGroup.MarginLayoutParams) fVar9).bottomMargin) + fVar9.f1238j) < (i12 = a6.bottom)) {
                                    w(view3, height - i12);
                                    z6 = true;
                                }
                                if (!z6) {
                                    w(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i10 = (a12.left - ((ViewGroup.MarginLayoutParams) fVar9).leftMargin) - fVar9.f1237i) < (i11 = a6.left)) {
                                    v(view3, i11 - i10);
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a12.right) - ((ViewGroup.MarginLayoutParams) fVar9).rightMargin) + fVar9.f1237i) < (i9 = a6.right)) {
                                    v(view3, width - i9);
                                    z8 = true;
                                } else {
                                    z8 = z7;
                                }
                                if (!z8) {
                                    v(view3, 0);
                                }
                            }
                            a12.setEmpty();
                            fVar8.a(a12);
                        }
                    }
                    if (i6 != 2) {
                        rect = rect3;
                        rect.set(((f) view3.getLayoutParams()).f1245q);
                        if (rect.equals(a7)) {
                            arrayList = arrayList4;
                            i8 = i24;
                            i19 = i6;
                        } else {
                            ((f) view3.getLayoutParams()).f1245q.set(a7);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i27 = i7 + 1;
                    i8 = i24;
                    while (true) {
                        arrayList = arrayList4;
                        if (i27 >= i8) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i27);
                        f fVar10 = (f) view4.getLayoutParams();
                        c cVar3 = fVar10.f1229a;
                        if (cVar3 != null && cVar3.b(view4, view3)) {
                            if (i6 == 0 && fVar10.f1244p) {
                                fVar10.f1244p = false;
                            } else {
                                if (i6 != 2) {
                                    z5 = cVar3.d(this, view4, view3);
                                } else {
                                    cVar3.e(this, view3);
                                    z5 = true;
                                }
                                if (i6 == 1) {
                                    fVar10.f1244p = z5;
                                }
                            }
                        }
                        i27++;
                        arrayList4 = arrayList;
                    }
                    i19 = i6;
                }
                i20 = i7 + 1;
                a8 = rect;
                size = i8;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a8;
                a6.setEmpty();
                fVar4.a(a6);
                a7.setEmpty();
                fVar4.a(a7);
                rect4.setEmpty();
                fVar4.a(rect4);
                return;
            }
        }
    }

    public final void q(View view, int i6) {
        boolean z5;
        Rect a6;
        Rect a7;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1239k;
        int i7 = 0;
        if (view2 == null && fVar.f1234f != -1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            e0.f fVar2 = f1208y;
            if (view2 != null) {
                a6 = a();
                a7 = a();
                try {
                    f(view2, a6);
                    f fVar3 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    g(i6, a6, a7, fVar3, measuredWidth, measuredHeight);
                    c(fVar3, a7, measuredWidth, measuredHeight);
                    view.layout(a7.left, a7.top, a7.right, a7.bottom);
                    return;
                } finally {
                    a6.setEmpty();
                    fVar2.a(a6);
                    a7.setEmpty();
                    fVar2.a(a7);
                }
            }
            int i8 = fVar.f1233e;
            if (i8 >= 0) {
                f fVar4 = (f) view.getLayoutParams();
                int i9 = fVar4.f1231c;
                if (i9 == 0) {
                    i9 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i9, i6);
                int i10 = absoluteGravity & 7;
                int i11 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i6 == 1) {
                    i8 = width - i8;
                }
                int h6 = h(i8) - measuredWidth2;
                if (i10 != 1) {
                    if (i10 == 5) {
                        h6 += measuredWidth2;
                    }
                } else {
                    h6 += measuredWidth2 / 2;
                }
                if (i11 != 16) {
                    if (i11 == 80) {
                        i7 = measuredHeight2 + 0;
                    }
                } else {
                    i7 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(h6, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar5 = (f) view.getLayoutParams();
            a6 = a();
            a6.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin);
            if (this.f1222o != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.d.b(this) && !g0.d.b(view)) {
                    a6.left = this.f1222o.b() + a6.left;
                    a6.top = this.f1222o.d() + a6.top;
                    a6.right -= this.f1222o.c();
                    a6.bottom -= this.f1222o.a();
                }
            }
            a7 = a();
            int i12 = fVar5.f1231c;
            if ((i12 & 7) == 0) {
                i12 |= 8388611;
            }
            if ((i12 & 112) == 0) {
                i12 |= 48;
            }
            k.b(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), a6, a7, i6);
            view.layout(a7.left, a7.top, a7.right, a7.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final void r(View view, int i6, int i7, int i8) {
        measureChildWithMargins(view, i6, i7, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        c cVar = ((f) view.getLayoutParams()).f1229a;
        if (cVar != null && cVar.m(this, view, rect, z5)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f1215h) {
            return;
        }
        u(false);
        this.f1215h = true;
    }

    public final boolean s(MotionEvent motionEvent, int i6) {
        boolean z5;
        int i7;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f1211d;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i8 = childCount - 1; i8 >= 0; i8--) {
            if (isChildrenDrawingOrderEnabled) {
                i7 = getChildDrawingOrder(childCount, i8);
            } else {
                i7 = i8;
            }
            arrayList.add(getChildAt(i7));
        }
        i iVar = f1207x;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z6 = false;
        boolean z7 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1229a;
            if ((z6 || z7) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i6 != 0) {
                        if (i6 == 1) {
                            cVar.r(this, view, motionEvent2);
                        }
                    } else {
                        cVar.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z6 && cVar != null) {
                    if (i6 != 0) {
                        if (i6 == 1) {
                            z6 = cVar.r(this, view, motionEvent);
                        }
                    } else {
                        z6 = cVar.g(this, view, motionEvent);
                    }
                    if (z6) {
                        this.f1218k = view;
                    }
                }
                if (fVar.f1229a == null) {
                    fVar.f1241m = false;
                }
                boolean z8 = fVar.f1241m;
                if (z8) {
                    z5 = true;
                } else {
                    z5 = z8 | false;
                    fVar.f1241m = z5;
                }
                if (z5 && !z8) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z5 && !z7) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z6;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1225r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z5;
        Drawable drawable2 = this.f1224q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1224q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1224q.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1224q;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                a.c.b(drawable4, g0.e.d(this));
                Drawable drawable5 = this.f1224q;
                if (getVisibility() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                drawable5.setVisible(z5, false);
                this.f1224q.setCallback(this);
            }
            WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
            g0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i6) {
        setStatusBarBackground(new ColorDrawable(i6));
    }

    public void setStatusBarBackgroundResource(int i6) {
        Drawable drawable;
        if (i6 != 0) {
            Context context = getContext();
            Object obj = w.a.f6573a;
            drawable = a.b.b(context, i6);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        boolean z5 = i6 == 0;
        Drawable drawable = this.f1224q;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.f1224q.setVisible(z5, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r12 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0159, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            c cVar = ((f) childAt.getLayoutParams()).f1229a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ((f) getChildAt(i7).getLayoutParams()).f1241m = false;
        }
        this.f1218k = null;
        this.f1215h = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1224q;
    }

    public final void x() {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.d.b(this)) {
            if (this.s == null) {
                this.s = new a();
            }
            g0.i.u(this, this.s);
            setSystemUiVisibility(1280);
            return;
        }
        g0.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
