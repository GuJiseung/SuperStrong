package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.l1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.g;
import h3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class c extends ConstraintLayout {

    /* renamed from: r  reason: collision with root package name */
    public final l1 f3499r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public h3.f f3500t;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        h3.f fVar = new h3.f();
        this.f3500t = fVar;
        g gVar = new g(0.5f);
        i iVar = fVar.f4446b.f4467a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f4504e = gVar;
        aVar.f4505f = gVar;
        aVar.f4506g = gVar;
        aVar.f4507h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.f3500t.k(ColorStateList.valueOf(-1));
        h3.f fVar2 = this.f3500t;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.Z, i6, 0);
        this.s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3499r = new l1(4, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            view.setId(g0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            l1 l1Var = this.f3499r;
            handler.removeCallbacks(l1Var);
            handler.post(l1Var);
        }
    }

    public void k() {
        int i6;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.c(this);
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i8 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i8 == null) {
                    i8 = 1;
                }
                if (!hashMap.containsKey(i8)) {
                    hashMap.put(i8, new ArrayList());
                }
                ((List) hashMap.get(i8)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i6 = Math.round(this.s * 0.66f);
            } else {
                i6 = this.s;
            }
            float f6 = 0.0f;
            for (View view : list) {
                int id = view.getId();
                HashMap<Integer, b.a> hashMap2 = bVar.f1106c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new b.a());
                }
                b.C0009b c0009b = hashMap2.get(Integer.valueOf(id)).f1110d;
                c0009b.f1164z = R.id.circle_center;
                c0009b.A = i6;
                c0009b.B = f6;
                f6 += 360.0f / list.size();
            }
        }
        bVar.a(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        k();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            l1 l1Var = this.f3499r;
            handler.removeCallbacks(l1Var);
            handler.post(l1Var);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i6) {
        this.f3500t.k(ColorStateList.valueOf(i6));
    }
}
