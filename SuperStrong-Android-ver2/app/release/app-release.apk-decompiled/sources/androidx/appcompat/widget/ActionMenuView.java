package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.t0;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ActionMenuView extends t0 implements f.b, androidx.appcompat.view.menu.k {
    public final int A;
    public e B;

    /* renamed from: q  reason: collision with root package name */
    public androidx.appcompat.view.menu.f f557q;

    /* renamed from: r  reason: collision with root package name */
    public Context f558r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f559t;
    public androidx.appcompat.widget.c u;

    /* renamed from: v  reason: collision with root package name */
    public j.a f560v;

    /* renamed from: w  reason: collision with root package name */
    public f.a f561w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f562x;

    /* renamed from: y  reason: collision with root package name */
    public int f563y;

    /* renamed from: z  reason: collision with root package name */
    public final int f564z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends t0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f565a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f566b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f567c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f568d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f569e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f570f;

        public c() {
            super(-2, -2);
            this.f565a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f565a = cVar.f565a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            boolean z5;
            e eVar = ActionMenuView.this.B;
            if (eVar == null) {
                return false;
            }
            Iterator<f0.r> it = Toolbar.this.H.f3907b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().a(menuItem)) {
                        z5 = true;
                        break;
                    }
                } else {
                    z5 = false;
                    break;
                }
            }
            if (!z5) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            f.a aVar = ActionMenuView.this.f561w;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f564z = (int) (56.0f * f6);
        this.A = (int) (f6 * 4.0f);
        this.f558r = context;
        this.s = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        c cVar2 = new c();
        ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.f557q.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.f557q = fVar;
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.t0
    public final t0.a f() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.t0
    public final t0.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f557q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.f557q = fVar;
            fVar.f430e = new d();
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.u = cVar;
            cVar.f698n = true;
            cVar.f699o = true;
            j.a aVar = this.f560v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f374f = aVar;
            this.f557q.b(cVar, this.f558r);
            androidx.appcompat.widget.c cVar2 = this.u;
            cVar2.f377i = this;
            this.f557q = cVar2.f372d;
        }
        return this.f557q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.u;
        c.d dVar = cVar.f695k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f697m) {
            return cVar.f696l;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.t0
    public final /* bridge */ /* synthetic */ t0.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i6) {
        boolean z5 = false;
        if (i6 == 0) {
            return false;
        }
        View childAt = getChildAt(i6 - 1);
        View childAt2 = getChildAt(i6);
        if (i6 < getChildCount() && (childAt instanceof a)) {
            z5 = false | ((a) childAt).a();
        }
        return (i6 <= 0 || !(childAt2 instanceof a)) ? z5 : z5 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.u;
        if (cVar != null) {
            cVar.i(false);
            if (this.u.g()) {
                this.u.d();
                this.u.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.u;
        if (cVar != null) {
            cVar.d();
            c.a aVar = cVar.f704v;
            if (aVar != null && aVar.b()) {
                aVar.f485j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.t0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int width;
        int i10;
        if (!this.f562x) {
            super.onLayout(z5, i6, i7, i8, i9);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i9 - i7) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = i8 - i6;
        int paddingRight = (i12 - getPaddingRight()) - getPaddingLeft();
        boolean a6 = s1.a(this);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f565a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i15)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a6) {
                        i10 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i16 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i16, width, measuredHeight + i16);
                    paddingRight -= measuredWidth;
                    i13 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    k(i15);
                    i14++;
                }
            }
        }
        if (childCount == 1 && i13 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i17 = (i12 / 2) - (measuredWidth2 / 2);
            int i18 = i11 - (measuredHeight2 / 2);
            childAt2.layout(i17, i18, measuredWidth2 + i17, measuredHeight2 + i18);
            return;
        }
        int i19 = i14 - (i13 ^ 1);
        int max = Math.max(0, i19 > 0 ? paddingRight / i19 : 0);
        if (a6) {
            int width2 = getWidth() - getPaddingRight();
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f565a) {
                    int i21 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i22 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i21 - measuredWidth3, i22, i21, measuredHeight3 + i22);
                    width2 = i21 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt4 = getChildAt(i23);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f565a) {
                int i24 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i25 = i11 - (measuredHeight4 / 2);
                childAt4.layout(i24, i25, i24 + measuredWidth4, measuredHeight4 + i25);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i24;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.t0, android.view.View
    public final void onMeasure(int i6, int i7) {
        boolean z5;
        int i8;
        boolean z6;
        boolean z7;
        boolean z8;
        int i9;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        ?? r42;
        boolean z10;
        int i14;
        int i15;
        int i16;
        ActionMenuItemView actionMenuItemView;
        boolean z11;
        int i17;
        boolean z12;
        androidx.appcompat.view.menu.f fVar;
        boolean z13 = this.f562x;
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f562x = z5;
        if (z13 != z5) {
            this.f563y = 0;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (this.f562x && (fVar = this.f557q) != null && size != this.f563y) {
            this.f563y = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f562x && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i7);
            int size2 = View.MeasureSpec.getSize(i6);
            int size3 = View.MeasureSpec.getSize(i7);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, paddingBottom, -2);
            int i18 = size2 - paddingRight;
            int i19 = this.f564z;
            int i20 = i18 / i19;
            int i21 = i18 % i19;
            if (i20 == 0) {
                setMeasuredDimension(i18, 0);
                return;
            }
            int i22 = (i21 / i20) + i19;
            int childCount2 = getChildCount();
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            boolean z14 = false;
            int i27 = 0;
            long j5 = 0;
            while (true) {
                i8 = this.A;
                if (i26 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i26);
                int i28 = size3;
                int i29 = i18;
                if (childAt.getVisibility() == 8) {
                    i15 = mode;
                    i16 = paddingBottom;
                } else {
                    boolean z15 = childAt instanceof ActionMenuItemView;
                    int i30 = i24 + 1;
                    if (z15) {
                        childAt.setPadding(i8, 0, i8, 0);
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f570f = false;
                    cVar.f567c = 0;
                    cVar.f566b = 0;
                    cVar.f568d = false;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                    if (z15 && ((ActionMenuItemView) childAt).l()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f569e = z10;
                    if (cVar.f565a) {
                        i14 = 1;
                    } else {
                        i14 = i20;
                    }
                    c cVar2 = (c) childAt.getLayoutParams();
                    i15 = mode;
                    i16 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z15) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i14 > 0 && (!z11 || i14 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i17 = measuredWidth / i22;
                        if (measuredWidth % i22 != 0) {
                            i17++;
                        }
                        if (z11 && i17 < 2) {
                            i17 = 2;
                        }
                    } else {
                        i17 = 0;
                    }
                    if (!cVar2.f565a && z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar2.f568d = z12;
                    cVar2.f566b = i17;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22 * i17, 1073741824), makeMeasureSpec);
                    i25 = Math.max(i25, i17);
                    if (cVar.f568d) {
                        i27++;
                    }
                    if (cVar.f565a) {
                        z14 = true;
                    }
                    i20 -= i17;
                    i23 = Math.max(i23, childAt.getMeasuredHeight());
                    if (i17 == 1) {
                        j5 |= 1 << i26;
                    }
                    i24 = i30;
                }
                i26++;
                size3 = i28;
                i18 = i29;
                paddingBottom = i16;
                mode = i15;
            }
            int i31 = mode;
            int i32 = i18;
            int i33 = size3;
            if (z14 && i24 == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z16 = false;
            while (i27 > 0 && i20 > 0) {
                int i34 = Integer.MAX_VALUE;
                int i35 = 0;
                int i36 = 0;
                long j6 = 0;
                while (i36 < childCount2) {
                    c cVar3 = (c) getChildAt(i36).getLayoutParams();
                    boolean z17 = z16;
                    if (cVar3.f568d) {
                        int i37 = cVar3.f566b;
                        if (i37 < i34) {
                            j6 = 1 << i36;
                            i34 = i37;
                            i35 = 1;
                        } else if (i37 == i34) {
                            j6 |= 1 << i36;
                            i35++;
                        }
                    }
                    i36++;
                    z16 = z17;
                }
                z7 = z16;
                j5 |= j6;
                if (i35 > i20) {
                    break;
                }
                int i38 = i34 + 1;
                int i39 = 0;
                while (i39 < childCount2) {
                    View childAt2 = getChildAt(i39);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i40 = i23;
                    int i41 = childMeasureSpec;
                    int i42 = childCount2;
                    long j7 = 1 << i39;
                    if ((j6 & j7) == 0) {
                        if (cVar4.f566b == i38) {
                            j5 |= j7;
                        }
                    } else {
                        if (z6 && cVar4.f569e) {
                            r42 = 1;
                            r42 = 1;
                            if (i20 == 1) {
                                childAt2.setPadding(i8 + i22, 0, i8, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        cVar4.f566b += r42;
                        cVar4.f570f = r42;
                        i20--;
                    }
                    i39++;
                    childMeasureSpec = i41;
                    i23 = i40;
                    childCount2 = i42;
                }
                z16 = true;
            }
            z7 = z16;
            int i43 = i23;
            int i44 = childMeasureSpec;
            int i45 = childCount2;
            if (!z14 && i24 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i20 > 0 && j5 != 0 && (i20 < i24 - 1 || z8 || i25 > 1)) {
                float bitCount = Long.bitCount(j5);
                if (!z8) {
                    if ((j5 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f569e) {
                        bitCount -= 0.5f;
                    }
                    int i46 = i45 - 1;
                    if ((j5 & (1 << i46)) != 0 && !((c) getChildAt(i46).getLayoutParams()).f569e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i13 = (int) ((i20 * i22) / bitCount);
                } else {
                    i13 = 0;
                }
                boolean z18 = z7;
                i9 = i45;
                for (int i47 = 0; i47 < i9; i47++) {
                    if ((j5 & (1 << i47)) != 0) {
                        View childAt3 = getChildAt(i47);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.f567c = i13;
                            cVar5.f570f = true;
                            if (i47 == 0 && !cVar5.f569e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i13) / 2;
                            }
                            z18 = true;
                        } else {
                            if (cVar5.f565a) {
                                cVar5.f567c = i13;
                                cVar5.f570f = true;
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i13) / 2;
                                z18 = true;
                            } else {
                                if (i47 != 0) {
                                    ((LinearLayout.LayoutParams) cVar5).leftMargin = i13 / 2;
                                }
                                if (i47 != i9 - 1) {
                                    ((LinearLayout.LayoutParams) cVar5).rightMargin = i13 / 2;
                                }
                            }
                        }
                    }
                }
                z9 = z18;
            } else {
                i9 = i45;
                z9 = z7;
            }
            if (z9) {
                int i48 = 0;
                while (i48 < i9) {
                    View childAt4 = getChildAt(i48);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (!cVar6.f570f) {
                        i12 = i44;
                    } else {
                        i12 = i44;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f566b * i22) + cVar6.f567c, 1073741824), i12);
                    }
                    i48++;
                    i44 = i12;
                }
            }
            if (i31 != 1073741824) {
                i11 = i32;
                i10 = i43;
            } else {
                i10 = i33;
                i11 = i32;
            }
            setMeasuredDimension(i11, i10);
            return;
        }
        for (int i49 = 0; i49 < childCount; i49++) {
            c cVar7 = (c) getChildAt(i49).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i6, i7);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.u.s = z5;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.u;
        c.d dVar = cVar.f695k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f697m = true;
        cVar.f696l = drawable;
    }

    public void setOverflowReserved(boolean z5) {
        this.f559t = z5;
    }

    public void setPopupTheme(int i6) {
        if (this.s != i6) {
            this.s = i6;
            if (i6 == 0) {
                this.f558r = getContext();
            } else {
                this.f558r = new ContextThemeWrapper(getContext(), i6);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.u = cVar;
        cVar.f377i = this;
        this.f557q = cVar.f372d;
    }
}
