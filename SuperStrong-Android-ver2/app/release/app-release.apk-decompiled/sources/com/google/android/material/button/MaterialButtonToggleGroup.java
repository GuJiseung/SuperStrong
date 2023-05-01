package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.superstrong.android.R;
import f0.g0;
import f0.m;
import f0.r0;
import g0.f;
import h3.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import z2.n;
import z2.q;
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f3016l = 0;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3017b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3018c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<d> f3019d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3020e;

    /* renamed from: f  reason: collision with root package name */
    public Integer[] f3021f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3022g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3023h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3024i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3025j;

    /* renamed from: k  reason: collision with root package name */
    public HashSet f3026k;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* loaded from: classes.dex */
    public class b extends f0.a {
        public b() {
        }

        @Override // f0.a
        public final void d(View view, f fVar) {
            int i6;
            this.f3856a.onInitializeAccessibilityNodeInfo(view, fVar.f4095a);
            int i7 = MaterialButtonToggleGroup.f3016l;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i6 = 0;
                for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                    if (materialButtonToggleGroup.getChildAt(i8) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.d(i8)) {
                        i6++;
                    }
                }
            }
            i6 = -1;
            fVar.g(f.c.a(0, 1, i6, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final h3.a f3029e = new h3.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public final h3.c f3030a;

        /* renamed from: b  reason: collision with root package name */
        public final h3.c f3031b;

        /* renamed from: c  reason: collision with root package name */
        public final h3.c f3032c;

        /* renamed from: d  reason: collision with root package name */
        public final h3.c f3033d;

        public c(h3.c cVar, h3.c cVar2, h3.c cVar3, h3.c cVar4) {
            this.f3030a = cVar;
            this.f3031b = cVar3;
            this.f3032c = cVar4;
            this.f3033d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952636), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f3017b = new ArrayList();
        this.f3018c = new e();
        this.f3019d = new LinkedHashSet<>();
        this.f3020e = new a();
        this.f3022g = false;
        this.f3026k = new HashSet();
        TypedArray d6 = n.d(getContext(), attributeSet, c.b.O, R.attr.materialButtonToggleGroupStyle, 2131952636, new int[0]);
        setSingleSelection(d6.getBoolean(3, false));
        this.f3025j = d6.getResourceId(1, -1);
        this.f3024i = d6.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(d6.getBoolean(0, true));
        d6.recycle();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            if (d(i6)) {
                return i6;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if ((getChildAt(i7) instanceof MaterialButton) && d(i7)) {
                i6++;
            }
        }
        return i6;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            materialButton.setId(g0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3018c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i6 = firstVisibleChildIndex + 1; i6 < getChildCount(); i6++) {
            MaterialButton c6 = c(i6);
            int min = Math.min(c6.getStrokeWidth(), c(i6 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c6.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                m.g(layoutParams, 0);
                m.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                m.h(layoutParams, 0);
            }
            c6.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            m.g(layoutParams3, 0);
            m.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i6, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3017b.add(new c(shapeAppearanceModel.f4492e, shapeAppearanceModel.f4495h, shapeAppearanceModel.f4493f, shapeAppearanceModel.f4494g));
        materialButton.setEnabled(isEnabled());
        g0.l(materialButton, new b());
    }

    public final void b(int i6, boolean z5) {
        if (i6 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i6);
            return;
        }
        HashSet hashSet = new HashSet(this.f3026k);
        if (z5 && !hashSet.contains(Integer.valueOf(i6))) {
            if (this.f3023h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i6));
        } else if (z5 || !hashSet.contains(Integer.valueOf(i6))) {
            return;
        } else {
            if (!this.f3024i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i6));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i6) {
        return (MaterialButton) getChildAt(i6);
    }

    public final boolean d(int i6) {
        return getChildAt(i6).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3020e);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            treeMap.put(c(i6), Integer.valueOf(i6));
        }
        this.f3021f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f3026k;
        this.f3026k = new HashSet(set);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = c(i6).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3022g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3022g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f3019d.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z5;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i6 = 0; i6 < childCount; i6++) {
            MaterialButton c6 = c(i6);
            if (c6.getVisibility() != 8) {
                i shapeAppearanceModel = c6.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f3017b.get(i6);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    h3.a aVar2 = c.f3029e;
                    if (i6 == firstVisibleChildIndex) {
                        if (z5) {
                            if (q.c(this)) {
                                cVar = new c(aVar2, aVar2, cVar2.f3031b, cVar2.f3032c);
                            } else {
                                cVar = new c(cVar2.f3030a, cVar2.f3033d, aVar2, aVar2);
                            }
                        } else {
                            cVar = new c(cVar2.f3030a, aVar2, cVar2.f3031b, aVar2);
                        }
                    } else if (i6 == lastVisibleChildIndex) {
                        if (z5) {
                            if (q.c(this)) {
                                cVar = new c(cVar2.f3030a, cVar2.f3033d, aVar2, aVar2);
                            } else {
                                cVar = new c(aVar2, aVar2, cVar2.f3031b, cVar2.f3032c);
                            }
                        } else {
                            cVar = new c(aVar2, cVar2.f3033d, aVar2, cVar2.f3032c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.f4504e = new h3.a(0.0f);
                    aVar.f4505f = new h3.a(0.0f);
                    aVar.f4506g = new h3.a(0.0f);
                    aVar.f4507h = new h3.a(0.0f);
                } else {
                    aVar.f4504e = cVar2.f3030a;
                    aVar.f4507h = cVar2.f3033d;
                    aVar.f4505f = cVar2.f3031b;
                    aVar.f4506g = cVar2.f3032c;
                }
                c6.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f3023h || this.f3026k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3026k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            int id = c(i6).getId();
            if (this.f3026k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i6, int i7) {
        Integer[] numArr = this.f3021f;
        if (numArr == null || i7 >= numArr.length) {
            Log.w("MButtonToggleGroup", "Child order wasn't updated");
            return i7;
        }
        return numArr[i7].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i6 = this.f3025j;
        if (i6 != -1) {
            e(Collections.singleton(Integer.valueOf(i6)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f3023h) {
            i6 = 1;
        } else {
            i6 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.b.a(1, visibleButtonCount, i6).f4110a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        f();
        a();
        super.onMeasure(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3017b.remove(indexOfChild);
        }
        f();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            c(i6).setEnabled(z5);
        }
    }

    public void setSelectionRequired(boolean z5) {
        this.f3024i = z5;
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    public void setSingleSelection(boolean z5) {
        if (this.f3023h != z5) {
            this.f3023h = z5;
            e(new HashSet());
        }
    }
}
