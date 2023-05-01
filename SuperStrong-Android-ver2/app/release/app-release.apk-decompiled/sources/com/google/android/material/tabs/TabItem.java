package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class TabItem extends View {

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f3320b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f3321c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3322d;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2659e0);
        this.f3320b = obtainStyledAttributes.getText(2);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        this.f3321c = drawable;
        this.f3322d = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
