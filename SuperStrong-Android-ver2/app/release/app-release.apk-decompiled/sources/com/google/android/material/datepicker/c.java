package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3104a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3105b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3106c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3107d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3108e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3109f;

    /* renamed from: g  reason: collision with root package name */
    public final b f3110g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f3111h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d3.b.c(context, R.attr.materialCalendarStyle, i.class.getCanonicalName()).data, c.b.P);
        this.f3104a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f3110g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3105b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3106c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a6 = d3.c.a(context, obtainStyledAttributes, 6);
        this.f3107d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3108e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3109f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f3111h = paint;
        paint.setColor(a6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
