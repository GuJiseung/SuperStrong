package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f765a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f766b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f767c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f768d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f769e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f770f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f771g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.b.f2670k);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i6) {
        ColorStateList d6 = d(context, i6);
        if (d6 != null && d6.isStateful()) {
            return d6.getColorForState(f766b, d6.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f765a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f6 = typedValue.getFloat();
        int c6 = c(context, i6);
        return y.a.c(c6, Math.round(Color.alpha(c6) * f6));
    }

    public static int c(Context context, int i6) {
        int[] iArr = f771g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i6) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f771g;
        iArr[0] = i6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = w.a.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
