package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import f0.g0;
import f0.r0;
import h3.f;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3098a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f3099b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3100c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f3101d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3102e;

    /* renamed from: f  reason: collision with root package name */
    public final h3.i f3103f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i6, h3.i iVar, Rect rect) {
        c.a.h(rect.left);
        c.a.h(rect.top);
        c.a.h(rect.right);
        c.a.h(rect.bottom);
        this.f3098a = rect;
        this.f3099b = colorStateList2;
        this.f3100c = colorStateList;
        this.f3101d = colorStateList3;
        this.f3102e = i6;
        this.f3103f = iVar;
    }

    public static b a(Context context, int i6) {
        boolean z5;
        if (i6 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        c.a.f("Cannot create a CalendarItemStyle with a styleResId of 0", z5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, c.b.Q);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a6 = d3.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a7 = d3.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a8 = d3.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        h3.i iVar = new h3.i(h3.i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new h3.a(0)));
        obtainStyledAttributes.recycle();
        return new b(a6, a7, a8, dimensionPixelSize, iVar, rect);
    }

    public final void b(TextView textView) {
        h3.f fVar = new h3.f();
        h3.f fVar2 = new h3.f();
        h3.i iVar = this.f3103f;
        fVar.setShapeAppearanceModel(iVar);
        fVar2.setShapeAppearanceModel(iVar);
        fVar.k(this.f3100c);
        fVar.f4446b.f4477k = this.f3102e;
        fVar.invalidateSelf();
        f.b bVar = fVar.f4446b;
        ColorStateList colorStateList = bVar.f4470d;
        ColorStateList colorStateList2 = this.f3101d;
        if (colorStateList != colorStateList2) {
            bVar.f4470d = colorStateList2;
            fVar.onStateChange(fVar.getState());
        }
        ColorStateList colorStateList3 = this.f3099b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), fVar, fVar2);
        Rect rect = this.f3098a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
        g0.d.q(textView, insetDrawable);
    }
}
