package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.c0;
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f814a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f815b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f816c;

    public j1(Context context, TypedArray typedArray) {
        this.f814a = context;
        this.f815b = typedArray;
    }

    public static j1 m(Context context, AttributeSet attributeSet, int[] iArr, int i6) {
        return new j1(context, context.obtainStyledAttributes(attributeSet, iArr, i6, 0));
    }

    public final boolean a(int i6, boolean z5) {
        return this.f815b.getBoolean(i6, z5);
    }

    public final ColorStateList b(int i6) {
        int resourceId;
        ColorStateList a6;
        TypedArray typedArray = this.f815b;
        if (typedArray.hasValue(i6) && (resourceId = typedArray.getResourceId(i6, 0)) != 0 && (a6 = w.a.a(this.f814a, resourceId)) != null) {
            return a6;
        }
        return typedArray.getColorStateList(i6);
    }

    public final int c(int i6, int i7) {
        return this.f815b.getDimensionPixelOffset(i6, i7);
    }

    public final int d(int i6, int i7) {
        return this.f815b.getDimensionPixelSize(i6, i7);
    }

    public final Drawable e(int i6) {
        int resourceId;
        TypedArray typedArray = this.f815b;
        return (!typedArray.hasValue(i6) || (resourceId = typedArray.getResourceId(i6, 0)) == 0) ? typedArray.getDrawable(i6) : e.a.a(this.f814a, resourceId);
    }

    public final Drawable f(int i6) {
        int resourceId;
        Drawable f6;
        if (this.f815b.hasValue(i6) && (resourceId = this.f815b.getResourceId(i6, 0)) != 0) {
            j a6 = j.a();
            Context context = this.f814a;
            synchronized (a6) {
                f6 = a6.f798a.f(context, resourceId, true);
            }
            return f6;
        }
        return null;
    }

    public final Typeface g(int i6, int i7, c0.a aVar) {
        int resourceId = this.f815b.getResourceId(i6, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f816c == null) {
            this.f816c = new TypedValue();
        }
        TypedValue typedValue = this.f816c;
        ThreadLocal<TypedValue> threadLocal = x.f.f6627a;
        Context context = this.f814a;
        if (context.isRestricted()) {
            return null;
        }
        return x.f.b(context, resourceId, typedValue, i7, aVar, true, false);
    }

    public final int h(int i6, int i7) {
        return this.f815b.getInt(i6, i7);
    }

    public final int i(int i6, int i7) {
        return this.f815b.getResourceId(i6, i7);
    }

    public final String j(int i6) {
        return this.f815b.getString(i6);
    }

    public final CharSequence k(int i6) {
        return this.f815b.getText(i6);
    }

    public final boolean l(int i6) {
        return this.f815b.hasValue(i6);
    }

    public final void n() {
        this.f815b.recycle();
    }
}
