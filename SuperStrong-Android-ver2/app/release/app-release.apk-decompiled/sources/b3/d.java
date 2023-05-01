package b3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import g0.f;
import h3.i;
import java.util.HashSet;
import java.util.WeakHashMap;
import z2.l;
/* loaded from: classes.dex */
public abstract class d extends ViewGroup implements k {
    public static final int[] E = {16842912};
    public static final int[] F = {-16842910};
    public boolean A;
    public ColorStateList B;
    public e C;
    public androidx.appcompat.view.menu.f D;

    /* renamed from: b  reason: collision with root package name */
    public final a1.a f2394b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2395c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.f f2396d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f2397e;

    /* renamed from: f  reason: collision with root package name */
    public int f2398f;

    /* renamed from: g  reason: collision with root package name */
    public b3.a[] f2399g;

    /* renamed from: h  reason: collision with root package name */
    public int f2400h;

    /* renamed from: i  reason: collision with root package name */
    public int f2401i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2402j;

    /* renamed from: k  reason: collision with root package name */
    public int f2403k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f2404l;

    /* renamed from: m  reason: collision with root package name */
    public final ColorStateList f2405m;

    /* renamed from: n  reason: collision with root package name */
    public int f2406n;

    /* renamed from: o  reason: collision with root package name */
    public int f2407o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f2408p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f2409q;

    /* renamed from: r  reason: collision with root package name */
    public int f2410r;
    public final SparseArray<j2.a> s;

    /* renamed from: t  reason: collision with root package name */
    public int f2411t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2412v;

    /* renamed from: w  reason: collision with root package name */
    public int f2413w;

    /* renamed from: x  reason: collision with root package name */
    public int f2414x;

    /* renamed from: y  reason: collision with root package name */
    public int f2415y;

    /* renamed from: z  reason: collision with root package name */
    public i f2416z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f2417b;

        public a(m2.b bVar) {
            this.f2417b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((b3.a) view).getItemData();
            d dVar = this.f2417b;
            if (!dVar.D.q(itemData, dVar.C, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public d(Context context) {
        super(context);
        this.f2396d = new e0.f(5);
        this.f2397e = new SparseArray<>(5);
        this.f2400h = 0;
        this.f2401i = 0;
        this.s = new SparseArray<>(5);
        this.f2411t = -1;
        this.u = -1;
        this.A = false;
        this.f2405m = c();
        if (isInEditMode()) {
            this.f2394b = null;
        } else {
            a1.a aVar = new a1.a();
            this.f2394b = aVar;
            aVar.N(0);
            aVar.C(a3.a.c(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            aVar.E(a3.a.d(getContext(), R.attr.motionEasingStandard, h2.a.f4423b));
            aVar.K(new l());
        }
        this.f2395c = new a((m2.b) this);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(this, 1);
    }

    private b3.a getNewItem() {
        b3.a aVar = (b3.a) this.f2396d.b();
        return aVar == null ? e(getContext()) : aVar;
    }

    private void setBadgeIfNeeded(b3.a aVar) {
        j2.a aVar2;
        int id = aVar.getId();
        if ((id != -1) && (aVar2 = this.s.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        boolean z5;
        boolean z6;
        removeAllViews();
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f2396d.a(aVar);
                    if (aVar.E != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        ImageView imageView = aVar.f2377n;
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            j2.a aVar2 = aVar.E;
                            if (aVar2 != null) {
                                if (aVar2.d() != null) {
                                    aVar2.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.E = null;
                    }
                    aVar.s = null;
                    aVar.f2386y = 0.0f;
                    aVar.f2365b = false;
                }
            }
        }
        if (this.D.size() == 0) {
            this.f2400h = 0;
            this.f2401i = 0;
            this.f2399g = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i6 = 0; i6 < this.D.size(); i6++) {
            hashSet.add(Integer.valueOf(this.D.getItem(i6).getItemId()));
        }
        int i7 = 0;
        while (true) {
            SparseArray<j2.a> sparseArray = this.s;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i7++;
        }
        this.f2399g = new b3.a[this.D.size()];
        int i8 = this.f2398f;
        int size = this.D.l().size();
        if (i8 != -1 ? i8 == 0 : size > 3) {
            z5 = true;
        } else {
            z5 = false;
        }
        for (int i9 = 0; i9 < this.D.size(); i9++) {
            this.C.f2419c = true;
            this.D.getItem(i9).setCheckable(true);
            this.C.f2419c = false;
            b3.a newItem = getNewItem();
            this.f2399g[i9] = newItem;
            newItem.setIconTintList(this.f2402j);
            newItem.setIconSize(this.f2403k);
            newItem.setTextColor(this.f2405m);
            newItem.setTextAppearanceInactive(this.f2406n);
            newItem.setTextAppearanceActive(this.f2407o);
            newItem.setTextColor(this.f2404l);
            int i10 = this.f2411t;
            if (i10 != -1) {
                newItem.setItemPaddingTop(i10);
            }
            int i11 = this.u;
            if (i11 != -1) {
                newItem.setItemPaddingBottom(i11);
            }
            newItem.setActiveIndicatorWidth(this.f2413w);
            newItem.setActiveIndicatorHeight(this.f2414x);
            newItem.setActiveIndicatorMarginHorizontal(this.f2415y);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.A);
            newItem.setActiveIndicatorEnabled(this.f2412v);
            Drawable drawable = this.f2408p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f2410r);
            }
            newItem.setItemRippleColor(this.f2409q);
            newItem.setShifting(z5);
            newItem.setLabelVisibilityMode(this.f2398f);
            h hVar = (h) this.D.getItem(i9);
            newItem.c(hVar);
            newItem.setItemPosition(i9);
            SparseArray<View.OnTouchListener> sparseArray2 = this.f2397e;
            int i12 = hVar.f451a;
            newItem.setOnTouchListener(sparseArray2.get(i12));
            newItem.setOnClickListener(this.f2395c);
            int i13 = this.f2400h;
            if (i13 != 0 && i12 == i13) {
                this.f2401i = i9;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.D.size() - 1, this.f2401i);
        this.f2401i = min;
        this.D.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.D = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList a6 = w.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = a6.getDefaultColor();
        int[] iArr = F;
        return new ColorStateList(new int[][]{iArr, E, ViewGroup.EMPTY_STATE_SET}, new int[]{a6.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    public final h3.f d() {
        if (this.f2416z == null || this.B == null) {
            return null;
        }
        h3.f fVar = new h3.f(this.f2416z);
        fVar.k(this.B);
        return fVar;
    }

    public abstract m2.a e(Context context);

    public SparseArray<j2.a> getBadgeDrawables() {
        return this.s;
    }

    public ColorStateList getIconTintList() {
        return this.f2402j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.B;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f2412v;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f2414x;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f2415y;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f2416z;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f2413w;
    }

    public Drawable getItemBackground() {
        b3.a[] aVarArr = this.f2399g;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f2408p : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f2410r;
    }

    public int getItemIconSize() {
        return this.f2403k;
    }

    public int getItemPaddingBottom() {
        return this.u;
    }

    public int getItemPaddingTop() {
        return this.f2411t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f2409q;
    }

    public int getItemTextAppearanceActive() {
        return this.f2407o;
    }

    public int getItemTextAppearanceInactive() {
        return this.f2406n;
    }

    public ColorStateList getItemTextColor() {
        return this.f2404l;
    }

    public int getLabelVisibilityMode() {
        return this.f2398f;
    }

    public androidx.appcompat.view.menu.f getMenu() {
        return this.D;
    }

    public int getSelectedItemId() {
        return this.f2400h;
    }

    public int getSelectedItemPosition() {
        return this.f2401i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, this.D.l().size(), 1).f4110a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2402j = colorStateList;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f2412v = z5;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z5);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.f2414x = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i6);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.f2415y = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i6);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z5) {
        this.A = z5;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z5);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f2416z = iVar;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.f2413w = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i6);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f2408p = drawable;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i6) {
        this.f2410r = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setItemBackground(i6);
            }
        }
    }

    public void setItemIconSize(int i6) {
        this.f2403k = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setIconSize(i6);
            }
        }
    }

    public void setItemPaddingBottom(int i6) {
        this.u = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i6);
            }
        }
    }

    public void setItemPaddingTop(int i6) {
        this.f2411t = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i6);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2409q = colorStateList;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i6) {
        this.f2407o = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i6);
                ColorStateList colorStateList = this.f2404l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.f2406n = i6;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i6);
                ColorStateList colorStateList = this.f2404l;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f2404l = colorStateList;
        b3.a[] aVarArr = this.f2399g;
        if (aVarArr != null) {
            for (b3.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i6) {
        this.f2398f = i6;
    }

    public void setPresenter(e eVar) {
        this.C = eVar;
    }
}
