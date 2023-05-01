package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.a0;
import com.superstrong.android.R;
import d.a;
import f0.g0;
import f0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements f0.n {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public final f0.o H;
    public ArrayList<MenuItem> I;
    public final a J;
    public n1 K;
    public androidx.appcompat.widget.c L;
    public f M;
    public boolean N;
    public OnBackInvokedCallback O;
    public OnBackInvokedDispatcher P;
    public boolean Q;
    public final b R;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f636b;

    /* renamed from: c  reason: collision with root package name */
    public j0 f637c;

    /* renamed from: d  reason: collision with root package name */
    public j0 f638d;

    /* renamed from: e  reason: collision with root package name */
    public m f639e;

    /* renamed from: f  reason: collision with root package name */
    public o f640f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable f641g;

    /* renamed from: h  reason: collision with root package name */
    public final CharSequence f642h;

    /* renamed from: i  reason: collision with root package name */
    public m f643i;

    /* renamed from: j  reason: collision with root package name */
    public View f644j;

    /* renamed from: k  reason: collision with root package name */
    public Context f645k;

    /* renamed from: l  reason: collision with root package name */
    public int f646l;

    /* renamed from: m  reason: collision with root package name */
    public int f647m;

    /* renamed from: n  reason: collision with root package name */
    public int f648n;

    /* renamed from: o  reason: collision with root package name */
    public final int f649o;

    /* renamed from: p  reason: collision with root package name */
    public final int f650p;

    /* renamed from: q  reason: collision with root package name */
    public int f651q;

    /* renamed from: r  reason: collision with root package name */
    public int f652r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int f653t;
    public b1 u;

    /* renamed from: v  reason: collision with root package name */
    public int f654v;

    /* renamed from: w  reason: collision with root package name */
    public int f655w;

    /* renamed from: x  reason: collision with root package name */
    public final int f656x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f657y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f658z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f636b;
            if (actionMenuView != null && (cVar = actionMenuView.u) != null) {
                cVar.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements f.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            boolean z5;
            Toolbar toolbar = Toolbar.this;
            androidx.appcompat.widget.c cVar = toolbar.f636b.u;
            if (cVar != null && cVar.g()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                Iterator<f0.r> it = toolbar.H.f3907b.iterator();
                while (it.hasNext()) {
                    it.next().d(fVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            f fVar = Toolbar.this.M;
            if (fVar == null) {
                hVar = null;
            } else {
                hVar = fVar.f664c;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new d.l(1, runnable);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.j {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f663b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f664c;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean c(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            View view = toolbar.f644j;
            if (view instanceof g.b) {
                ((g.b) view).onActionViewCollapsed();
            }
            toolbar.removeView(toolbar.f644j);
            toolbar.removeView(toolbar.f643i);
            toolbar.f644j = null;
            ArrayList<View> arrayList = toolbar.F;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar.addView(arrayList.get(size));
                } else {
                    arrayList.clear();
                    this.f664c = null;
                    toolbar.requestLayout();
                    hVar.C = false;
                    hVar.f464n.p(false);
                    toolbar.u();
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f663b;
            if (fVar2 != null && (hVar = this.f664c) != null) {
                fVar2.d(hVar);
            }
            this.f663b = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean h(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void i(boolean z5) {
            if (this.f664c != null) {
                androidx.appcompat.view.menu.f fVar = this.f663b;
                boolean z6 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        } else if (this.f663b.getItem(i6) == this.f664c) {
                            z6 = true;
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                if (z6) {
                    return;
                }
                c(this.f664c);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean j() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable k() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar toolbar = Toolbar.this;
            toolbar.d();
            ViewParent parent = toolbar.f643i.getParent();
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f643i);
                }
                toolbar.addView(toolbar.f643i);
            }
            View actionView = hVar.getActionView();
            toolbar.f644j = actionView;
            this.f664c = hVar;
            ViewParent parent2 = actionView.getParent();
            if (parent2 != toolbar) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar.f644j);
                }
                g gVar = new g();
                gVar.f3568a = (toolbar.f649o & 112) | 8388611;
                gVar.f666b = 2;
                toolbar.f644j.setLayoutParams(gVar);
                toolbar.addView(toolbar.f644j);
            }
            int childCount = toolbar.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar.getChildAt(childCount);
                if (((g) childAt.getLayoutParams()).f666b != 2 && childAt != toolbar.f636b) {
                    toolbar.removeViewAt(childCount);
                    toolbar.F.add(childAt);
                }
            }
            toolbar.requestLayout();
            hVar.C = true;
            hVar.f464n.p(false);
            View view = toolbar.f644j;
            if (view instanceof g.b) {
                ((g.b) view).onActionViewExpanded();
            }
            toolbar.u();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0030a {

        /* renamed from: b  reason: collision with root package name */
        public int f666b;

        public g() {
            this.f666b = 0;
            this.f3568a = 8388627;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f666b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f666b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f666b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(g gVar) {
            super((a.C0030a) gVar);
            this.f666b = 0;
            this.f666b = gVar.f666b;
        }

        public g(a.C0030a c0030a) {
            super(c0030a);
            this.f666b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
    }

    /* loaded from: classes.dex */
    public static class i extends l0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f667d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f668e;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new i[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f667d = parcel.readInt();
            this.f668e = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeInt(this.f667d);
            parcel.writeInt(this.f668e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f656x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new f0.o(new k1(0, this));
        this.I = new ArrayList<>();
        this.J = new a();
        this.R = new b();
        Context context2 = getContext();
        int[] iArr = c.b.f2690y;
        j1 m5 = j1.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        f0.g0.k(this, context, iArr, attributeSet, m5.f815b, R.attr.toolbarStyle);
        this.f647m = m5.i(28, 0);
        this.f648n = m5.i(19, 0);
        TypedArray typedArray = m5.f815b;
        this.f656x = typedArray.getInteger(0, 8388627);
        this.f649o = typedArray.getInteger(2, 48);
        int c6 = m5.c(22, 0);
        c6 = m5.l(27) ? m5.c(27, c6) : c6;
        this.f653t = c6;
        this.s = c6;
        this.f652r = c6;
        this.f651q = c6;
        int c7 = m5.c(25, -1);
        if (c7 >= 0) {
            this.f651q = c7;
        }
        int c8 = m5.c(24, -1);
        if (c8 >= 0) {
            this.f652r = c8;
        }
        int c9 = m5.c(26, -1);
        if (c9 >= 0) {
            this.s = c9;
        }
        int c10 = m5.c(23, -1);
        if (c10 >= 0) {
            this.f653t = c10;
        }
        this.f650p = m5.d(13, -1);
        int c11 = m5.c(9, Integer.MIN_VALUE);
        int c12 = m5.c(5, Integer.MIN_VALUE);
        int d6 = m5.d(7, 0);
        int d7 = m5.d(8, 0);
        if (this.u == null) {
            this.u = new b1();
        }
        b1 b1Var = this.u;
        b1Var.f694h = false;
        if (d6 != Integer.MIN_VALUE) {
            b1Var.f691e = d6;
            b1Var.f687a = d6;
        }
        if (d7 != Integer.MIN_VALUE) {
            b1Var.f692f = d7;
            b1Var.f688b = d7;
        }
        if (c11 != Integer.MIN_VALUE || c12 != Integer.MIN_VALUE) {
            b1Var.a(c11, c12);
        }
        this.f654v = m5.c(10, Integer.MIN_VALUE);
        this.f655w = m5.c(6, Integer.MIN_VALUE);
        this.f641g = m5.e(4);
        this.f642h = m5.k(3);
        CharSequence k5 = m5.k(21);
        if (!TextUtils.isEmpty(k5)) {
            setTitle(k5);
        }
        CharSequence k6 = m5.k(18);
        if (!TextUtils.isEmpty(k6)) {
            setSubtitle(k6);
        }
        this.f645k = getContext();
        setPopupTheme(m5.i(17, 0));
        Drawable e6 = m5.e(16);
        if (e6 != null) {
            setNavigationIcon(e6);
        }
        CharSequence k7 = m5.k(15);
        if (!TextUtils.isEmpty(k7)) {
            setNavigationContentDescription(k7);
        }
        Drawable e7 = m5.e(11);
        if (e7 != null) {
            setLogo(e7);
        }
        CharSequence k8 = m5.k(12);
        if (!TextUtils.isEmpty(k8)) {
            setLogoDescription(k8);
        }
        if (m5.l(29)) {
            setTitleTextColor(m5.b(29));
        }
        if (m5.l(20)) {
            setSubtitleTextColor(m5.b(20));
        }
        if (m5.l(14)) {
            m(m5.i(14, 0));
        }
        m5.n();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i6 = 0; i6 < menu.size(); i6++) {
            arrayList.add(menu.getItem(i6));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new g.f(getContext());
    }

    public static g h(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0030a ? new g((a.C0030a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return f0.m.b(marginLayoutParams) + f0.m.c(marginLayoutParams);
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i6, ArrayList arrayList) {
        boolean z5;
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if (g0.e.d(this) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i6, g0.e.d(this));
        arrayList.clear();
        if (z5) {
            for (int i7 = childCount - 1; i7 >= 0; i7--) {
                View childAt = getChildAt(i7);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f666b == 0 && t(childAt)) {
                    int i8 = gVar.f3568a;
                    WeakHashMap<View, f0.r0> weakHashMap2 = f0.g0.f3878a;
                    int d6 = g0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, d6) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d6 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f666b == 0 && t(childAt2)) {
                int i10 = gVar2.f3568a;
                WeakHashMap<View, f0.r0> weakHashMap3 = f0.g0.f3878a;
                int d7 = g0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, d7) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d7 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z5) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = new g();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = h(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f666b = 1;
        if (z5 && this.f644j != null) {
            view.setLayoutParams(gVar);
            this.F.add(view);
            return;
        }
        addView(view, gVar);
    }

    @Override // f0.n
    public final void c(a0.c cVar) {
        f0.o oVar = this.H;
        oVar.f3907b.add(cVar);
        oVar.f3906a.run();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public final void d() {
        if (this.f643i == null) {
            m mVar = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f643i = mVar;
            mVar.setImageDrawable(this.f641g);
            this.f643i.setContentDescription(this.f642h);
            g gVar = new g();
            gVar.f3568a = (this.f649o & 112) | 8388611;
            gVar.f666b = 2;
            this.f643i.setLayoutParams(gVar);
            this.f643i.setOnClickListener(new d());
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f636b;
        if (actionMenuView.f557q == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new f();
            }
            this.f636b.setExpandedActionViewsExclusive(true);
            fVar.b(this.M, this.f645k);
            u();
        }
    }

    public final void f() {
        if (this.f636b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f636b = actionMenuView;
            actionMenuView.setPopupTheme(this.f646l);
            this.f636b.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f636b;
            c cVar = new c();
            actionMenuView2.f560v = null;
            actionMenuView2.f561w = cVar;
            g gVar = new g();
            gVar.f3568a = (this.f649o & 112) | 8388613;
            this.f636b.setLayoutParams(gVar);
            b(this.f636b, false);
        }
    }

    public final void g() {
        if (this.f639e == null) {
            this.f639e = new m(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVar = new g();
            gVar.f3568a = (this.f649o & 112) | 8388611;
            this.f639e.setLayoutParams(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        m mVar = this.f643i;
        if (mVar != null) {
            return mVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        m mVar = this.f643i;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        b1 b1Var = this.u;
        if (b1Var != null) {
            if (b1Var.f693g) {
                return b1Var.f687a;
            }
            return b1Var.f688b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i6 = this.f655w;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        b1 b1Var = this.u;
        if (b1Var != null) {
            return b1Var.f687a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        b1 b1Var = this.u;
        if (b1Var != null) {
            return b1Var.f688b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        b1 b1Var = this.u;
        if (b1Var != null) {
            if (b1Var.f693g) {
                return b1Var.f688b;
            }
            return b1Var.f687a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i6 = this.f654v;
        return i6 != Integer.MIN_VALUE ? i6 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z5;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f636b;
        if (actionMenuView != null && (fVar = actionMenuView.f557q) != null && fVar.hasVisibleItems()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return Math.max(getContentInsetEnd(), Math.max(this.f655w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if (g0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        if (g0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f654v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        o oVar = this.f640f;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        o oVar = this.f640f;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f636b.getMenu();
    }

    public View getNavButtonView() {
        return this.f639e;
    }

    public CharSequence getNavigationContentDescription() {
        m mVar = this.f639e;
        if (mVar != null) {
            return mVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        m mVar = this.f639e;
        if (mVar != null) {
            return mVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f636b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f645k;
    }

    public int getPopupTheme() {
        return this.f646l;
    }

    public CharSequence getSubtitle() {
        return this.f658z;
    }

    public final TextView getSubtitleTextView() {
        return this.f638d;
    }

    public CharSequence getTitle() {
        return this.f657y;
    }

    public int getTitleMarginBottom() {
        return this.f653t;
    }

    public int getTitleMarginEnd() {
        return this.f652r;
    }

    public int getTitleMarginStart() {
        return this.f651q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f637c;
    }

    public o0 getWrapper() {
        if (this.K == null) {
            this.K = new n1(this);
        }
        return this.K;
    }

    public final int i(View view, int i6) {
        int i7;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i6 > 0) {
            i7 = (measuredHeight - i6) / 2;
        } else {
            i7 = 0;
        }
        int i8 = gVar.f3568a & 112;
        if (i8 != 16 && i8 != 48 && i8 != 80) {
            i8 = this.f656x & 112;
        }
        if (i8 != 48) {
            if (i8 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i9 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i10 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i9 < i10) {
                    i9 = i10;
                } else {
                    int i11 = (((height - paddingBottom) - measuredHeight) - i9) - paddingTop;
                    int i12 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i11 < i12) {
                        i9 = Math.max(0, i9 - (i12 - i11));
                    }
                }
                return paddingTop + i9;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i7;
        }
        return getPaddingTop() - i7;
    }

    @Override // f0.n
    public final void l(a0.c cVar) {
        f0.o oVar = this.H;
        oVar.f3907b.remove(cVar);
        if (((o.a) oVar.f3908c.remove(cVar)) == null) {
            oVar.f3906a.run();
            return;
        }
        throw null;
    }

    public void m(int i6) {
        getMenuInflater().inflate(i6, getMenu());
    }

    public final void n() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<f0.r> it2 = this.H.f3907b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[LOOP:0: B:107:0x0286->B:108:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4 A[LOOP:1: B:110:0x02a2->B:111:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f5073b);
        ActionMenuView actionMenuView = this.f636b;
        if (actionMenuView != null) {
            fVar = actionMenuView.f557q;
        } else {
            fVar = null;
        }
        int i6 = iVar.f667d;
        if (i6 != 0 && this.M != null && fVar != null && (findItem = fVar.findItem(i6)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f668e) {
            b bVar = this.R;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.b1 r0 = r2.u
            if (r0 != 0) goto Le
            androidx.appcompat.widget.b1 r0 = new androidx.appcompat.widget.b1
            r0.<init>()
            r2.u = r0
        Le:
            androidx.appcompat.widget.b1 r0 = r2.u
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f693g
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f693g = r1
            boolean r3 = r0.f694h
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f690d
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f691e
        L2b:
            r0.f687a = r1
            int r1 = r0.f689c
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f689c
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f691e
        L39:
            r0.f687a = r1
            int r1 = r0.f690d
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f691e
            r0.f687a = r3
        L44:
            int r1 = r0.f692f
        L46:
            r0.f688b = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z5;
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.M;
        if (fVar != null && (hVar = fVar.f664c) != null) {
            iVar.f667d = hVar.f451a;
        }
        ActionMenuView actionMenuView = this.f636b;
        boolean z6 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.u;
            if (cVar != null && cVar.g()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                z6 = true;
            }
        }
        iVar.f668e = z6;
        return iVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i6, int i7, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = Math.max(0, i8) + i6;
        iArr[0] = Math.max(0, -i8);
        int i9 = i(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i9, max + measuredWidth, view.getMeasuredHeight() + i9);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + max;
    }

    public final int q(View view, int i6, int i7, int[] iArr) {
        g gVar = (g) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i6 - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int i9 = i(view, i7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i9, max, view.getMeasuredHeight() + i9);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int r(View view, int i6, int i7, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + max + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z5) {
        if (this.Q != z5) {
            this.Q = z5;
            u();
        }
    }

    public void setCollapseContentDescription(int i6) {
        setCollapseContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        m mVar = this.f643i;
        if (mVar != null) {
            mVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i6) {
        setCollapseIcon(e.a.a(getContext(), i6));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            this.f643i.setImageDrawable(drawable);
            return;
        }
        m mVar = this.f643i;
        if (mVar != null) {
            mVar.setImageDrawable(this.f641g);
        }
    }

    public void setCollapsible(boolean z5) {
        this.N = z5;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f655w) {
            this.f655w = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i6) {
        if (i6 < 0) {
            i6 = Integer.MIN_VALUE;
        }
        if (i6 != this.f654v) {
            this.f654v = i6;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i6) {
        setLogo(e.a.a(getContext(), i6));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f640f == null) {
                this.f640f = new o(getContext());
            }
            if (!o(this.f640f)) {
                b(this.f640f, true);
            }
        } else {
            o oVar = this.f640f;
            if (oVar != null && o(oVar)) {
                removeView(this.f640f);
                this.F.remove(this.f640f);
            }
        }
        o oVar2 = this.f640f;
        if (oVar2 != null) {
            oVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i6) {
        setLogoDescription(getContext().getText(i6));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f640f == null) {
            this.f640f = new o(getContext());
        }
        o oVar = this.f640f;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i6) {
        setNavigationContentDescription(i6 != 0 ? getContext().getText(i6) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        m mVar = this.f639e;
        if (mVar != null) {
            mVar.setContentDescription(charSequence);
            o1.a(this.f639e, charSequence);
        }
    }

    public void setNavigationIcon(int i6) {
        setNavigationIcon(e.a.a(getContext(), i6));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f639e)) {
                b(this.f639e, true);
            }
        } else {
            m mVar = this.f639e;
            if (mVar != null && o(mVar)) {
                removeView(this.f639e);
                this.F.remove(this.f639e);
            }
        }
        m mVar2 = this.f639e;
        if (mVar2 != null) {
            mVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f639e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f636b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i6) {
        if (this.f646l != i6) {
            this.f646l = i6;
            if (i6 == 0) {
                this.f645k = getContext();
            } else {
                this.f645k = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setSubtitle(int i6) {
        setSubtitle(getContext().getText(i6));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f638d == null) {
                Context context = getContext();
                j0 j0Var = new j0(context, null);
                this.f638d = j0Var;
                j0Var.setSingleLine();
                this.f638d.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f648n;
                if (i6 != 0) {
                    this.f638d.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f638d.setTextColor(colorStateList);
                }
            }
            if (!o(this.f638d)) {
                b(this.f638d, true);
            }
        } else {
            j0 j0Var2 = this.f638d;
            if (j0Var2 != null && o(j0Var2)) {
                removeView(this.f638d);
                this.F.remove(this.f638d);
            }
        }
        j0 j0Var3 = this.f638d;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.f658z = charSequence;
    }

    public void setSubtitleTextColor(int i6) {
        setSubtitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        j0 j0Var = this.f638d;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i6) {
        setTitle(getContext().getText(i6));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f637c == null) {
                Context context = getContext();
                j0 j0Var = new j0(context, null);
                this.f637c = j0Var;
                j0Var.setSingleLine();
                this.f637c.setEllipsize(TextUtils.TruncateAt.END);
                int i6 = this.f647m;
                if (i6 != 0) {
                    this.f637c.setTextAppearance(context, i6);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f637c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f637c)) {
                b(this.f637c, true);
            }
        } else {
            j0 j0Var2 = this.f637c;
            if (j0Var2 != null && o(j0Var2)) {
                removeView(this.f637c);
                this.F.remove(this.f637c);
            }
        }
        j0 j0Var3 = this.f637c;
        if (j0Var3 != null) {
            j0Var3.setText(charSequence);
        }
        this.f657y = charSequence;
    }

    public void setTitleMarginBottom(int i6) {
        this.f653t = i6;
        requestLayout();
    }

    public void setTitleMarginEnd(int i6) {
        this.f652r = i6;
        requestLayout();
    }

    public void setTitleMarginStart(int i6) {
        this.f651q = i6;
        requestLayout();
    }

    public void setTitleMarginTop(int i6) {
        this.s = i6;
        requestLayout();
    }

    public void setTitleTextColor(int i6) {
        setTitleTextColor(ColorStateList.valueOf(i6));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        j0 j0Var = this.f637c;
        if (j0Var != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r4.Q != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L52
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.e.a(r4)
            androidx.appcompat.widget.Toolbar$f r1 = r4.M
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            androidx.appcompat.view.menu.h r1 = r1.f664c
            if (r1 == 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = r3
        L17:
            if (r1 == 0) goto L28
            if (r0 == 0) goto L28
            java.util.WeakHashMap<android.view.View, f0.r0> r1 = f0.g0.f3878a
            boolean r1 = f0.g0.g.b(r4)
            if (r1 == 0) goto L28
            boolean r1 = r4.Q
            if (r1 == 0) goto L28
            goto L29
        L28:
            r2 = r3
        L29:
            if (r2 == 0) goto L44
            android.window.OnBackInvokedDispatcher r1 = r4.P
            if (r1 != 0) goto L44
            android.window.OnBackInvokedCallback r1 = r4.O
            if (r1 != 0) goto L3e
            androidx.appcompat.widget.l1 r1 = new androidx.appcompat.widget.l1
            r1.<init>(r3, r4)
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.widget.Toolbar.e.b(r1)
            r4.O = r1
        L3e:
            android.window.OnBackInvokedCallback r1 = r4.O
            androidx.appcompat.widget.Toolbar.e.c(r0, r1)
            goto L50
        L44:
            if (r2 != 0) goto L52
            android.window.OnBackInvokedDispatcher r0 = r4.P
            if (r0 == 0) goto L52
            android.window.OnBackInvokedCallback r1 = r4.O
            androidx.appcompat.widget.Toolbar.e.d(r0, r1)
            r0 = 0
        L50:
            r4.P = r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.u():void");
    }
}
