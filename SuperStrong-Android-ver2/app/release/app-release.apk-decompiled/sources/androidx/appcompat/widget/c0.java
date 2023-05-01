package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f0.g0;
import j0.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import x.f;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f718a;

    /* renamed from: b  reason: collision with root package name */
    public h1 f719b;

    /* renamed from: c  reason: collision with root package name */
    public h1 f720c;

    /* renamed from: d  reason: collision with root package name */
    public h1 f721d;

    /* renamed from: e  reason: collision with root package name */
    public h1 f722e;

    /* renamed from: f  reason: collision with root package name */
    public h1 f723f;

    /* renamed from: g  reason: collision with root package name */
    public h1 f724g;

    /* renamed from: h  reason: collision with root package name */
    public h1 f725h;

    /* renamed from: i  reason: collision with root package name */
    public final k0 f726i;

    /* renamed from: j  reason: collision with root package name */
    public int f727j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f728k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f729l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f730m;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f731a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f732b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f733c;

        public a(int i6, int i7, WeakReference weakReference) {
            this.f731a = i6;
            this.f732b = i7;
            this.f733c = weakReference;
        }

        @Override // x.f.e
        public final void c(int i6) {
        }

        @Override // x.f.e
        public final void d(Typeface typeface) {
            int i6;
            boolean z5;
            if (Build.VERSION.SDK_INT >= 28 && (i6 = this.f731a) != -1) {
                if ((this.f732b & 2) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                typeface = e.a(typeface, i6, z5);
            }
            c0 c0Var = c0.this;
            if (c0Var.f730m) {
                c0Var.f729l = typeface;
                TextView textView = (TextView) this.f733c.get();
                if (textView != null) {
                    WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                    if (g0.g.b(textView)) {
                        textView.post(new d0(textView, typeface, c0Var.f727j));
                    } else {
                        textView.setTypeface(typeface, c0Var.f727j);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        public static void b(TextView textView, int i6, int i7, int i8, int i9) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
        }

        public static void c(TextView textView, int[] iArr, int i6) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
        }

        public static boolean d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Typeface a(Typeface typeface, int i6, boolean z5) {
            Typeface create;
            create = Typeface.create(typeface, i6, z5);
            return create;
        }
    }

    public c0(TextView textView) {
        this.f718a = textView;
        this.f726i = new k0(textView);
    }

    public static h1 c(Context context, j jVar, int i6) {
        ColorStateList h6;
        synchronized (jVar) {
            h6 = jVar.f798a.h(context, i6);
        }
        if (h6 != null) {
            h1 h1Var = new h1();
            h1Var.f789d = true;
            h1Var.f786a = h6;
            return h1Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i6;
        int i7;
        boolean z5;
        int i8;
        CharSequence subSequence;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i9 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i9 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i10 = editorInfo.initialSelStart;
            int i11 = editorInfo.initialSelEnd;
            if (i10 > i11) {
                i6 = i11 + 0;
            } else {
                i6 = i10 + 0;
            }
            if (i10 > i11) {
                i7 = i10 - 0;
            } else {
                i7 = i11 + 0;
            }
            int length = text.length();
            if (i6 >= 0 && i7 <= length) {
                int i12 = editorInfo.inputType & 4095;
                if (i12 != 129 && i12 != 225 && i12 != 18) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (!z5) {
                    if (length <= 2048) {
                        i0.c.a(editorInfo, text, i6, i7);
                        return;
                    }
                    int i13 = i7 - i6;
                    if (i13 > 1024) {
                        i8 = 0;
                    } else {
                        i8 = i13;
                    }
                    int i14 = 2048 - i8;
                    int min = Math.min(text.length() - i7, i14 - Math.min(i6, (int) (i14 * 0.8d)));
                    int min2 = Math.min(i6, i14 - min);
                    int i15 = i6 - min2;
                    if (Character.isLowSurrogate(text.charAt(i15))) {
                        i15++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i7 + min) - 1))) {
                        min--;
                    }
                    int i16 = min2 + i8 + min;
                    if (i8 != i13) {
                        subSequence = TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i7, min + i7));
                    } else {
                        subSequence = text.subSequence(i15, i16 + i15);
                    }
                    int i17 = min2 + 0;
                    i0.c.a(editorInfo, subSequence, i17, i8 + i17);
                    return;
                }
            }
            i0.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, h1 h1Var) {
        if (drawable == null || h1Var == null) {
            return;
        }
        j.e(drawable, h1Var, this.f718a.getDrawableState());
    }

    public final void b() {
        h1 h1Var = this.f719b;
        TextView textView = this.f718a;
        if (h1Var != null || this.f720c != null || this.f721d != null || this.f722e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f719b);
            a(compoundDrawables[1], this.f720c);
            a(compoundDrawables[2], this.f721d);
            a(compoundDrawables[3], this.f722e);
        }
        if (this.f723f == null && this.f724g == null) {
            return;
        }
        Drawable[] a6 = b.a(textView);
        a(a6[0], this.f723f);
        a(a6[2], this.f724g);
    }

    public final ColorStateList d() {
        h1 h1Var = this.f725h;
        if (h1Var != null) {
            return h1Var.f786a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        h1 h1Var = this.f725h;
        if (h1Var != null) {
            return h1Var.f787b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    public final void f(AttributeSet attributeSet, int i6) {
        boolean z5;
        boolean z6;
        String str;
        String str2;
        float f6;
        float f7;
        float f8;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i7;
        Paint.FontMetricsInt fontMetricsInt;
        int fontMetricsInt2;
        int i8;
        int resourceId;
        int i9;
        TextView textView = this.f718a;
        Context context = textView.getContext();
        j a6 = j.a();
        int[] iArr = c.b.f2666i;
        j1 m5 = j1.m(context, attributeSet, iArr, i6);
        f0.g0.k(textView, textView.getContext(), iArr, attributeSet, m5.f815b, i6);
        int i10 = m5.i(0, -1);
        if (m5.l(3)) {
            this.f719b = c(context, a6, m5.i(3, 0));
        }
        if (m5.l(1)) {
            this.f720c = c(context, a6, m5.i(1, 0));
        }
        if (m5.l(4)) {
            this.f721d = c(context, a6, m5.i(4, 0));
        }
        if (m5.l(2)) {
            this.f722e = c(context, a6, m5.i(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (m5.l(5)) {
            this.f723f = c(context, a6, m5.i(5, 0));
        }
        if (m5.l(6)) {
            this.f724g = c(context, a6, m5.i(6, 0));
        }
        m5.n();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = c.b.f2689x;
        if (i10 != -1) {
            j1 j1Var = new j1(context, context.obtainStyledAttributes(i10, iArr2));
            if (!z7 && j1Var.l(14)) {
                z5 = j1Var.a(14, false);
                z6 = true;
            } else {
                z5 = false;
                z6 = false;
            }
            n(context, j1Var);
            if (j1Var.l(15)) {
                str = j1Var.j(15);
                i9 = 26;
            } else {
                i9 = 26;
                str = null;
            }
            if (i11 >= i9 && j1Var.l(13)) {
                str2 = j1Var.j(13);
            } else {
                str2 = null;
            }
            j1Var.n();
        } else {
            z5 = false;
            z6 = false;
            str = null;
            str2 = null;
        }
        j1 j1Var2 = new j1(context, context.obtainStyledAttributes(attributeSet, iArr2, i6, 0));
        if (!z7 && j1Var2.l(14)) {
            z5 = j1Var2.a(14, false);
            z6 = true;
        }
        if (j1Var2.l(15)) {
            str = j1Var2.j(15);
        }
        if (i11 >= 26 && j1Var2.l(13)) {
            str2 = j1Var2.j(13);
        }
        String str3 = str2;
        if (i11 >= 28 && j1Var2.l(0) && j1Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, j1Var2);
        j1Var2.n();
        if (!z7 && z6) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f729l;
        if (typeface != null) {
            if (this.f728k == -1) {
                textView.setTypeface(typeface, this.f727j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            d.d(textView, str3);
        }
        if (str != null) {
            c.b(textView, c.a(str));
        }
        int[] iArr3 = c.b.f2668j;
        k0 k0Var = this.f726i;
        Context context2 = k0Var.f830j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i6, 0);
        TextView textView2 = k0Var.f829i;
        f0.g0.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i6);
        if (obtainStyledAttributes.hasValue(5)) {
            k0Var.f821a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f6 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f6 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f7 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f7 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f8 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f8 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                k0Var.f826f = k0.b(iArr4);
                k0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (k0Var.i()) {
            if (k0Var.f821a == 1) {
                if (!k0Var.f827g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f7 == -1.0f) {
                        i8 = 2;
                        f7 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i8 = 2;
                    }
                    if (f8 == -1.0f) {
                        f8 = TypedValue.applyDimension(i8, 112.0f, displayMetrics);
                    }
                    if (f6 == -1.0f) {
                        f6 = 1.0f;
                    }
                    k0Var.j(f7, f8, f6);
                }
                k0Var.g();
            }
        } else {
            k0Var.f821a = 0;
        }
        if (s1.f935b && k0Var.f821a != 0) {
            int[] iArr5 = k0Var.f826f;
            if (iArr5.length > 0) {
                if (d.a(textView) != -1.0f) {
                    d.b(textView, Math.round(k0Var.f824d), Math.round(k0Var.f825e), Math.round(k0Var.f823c), 0);
                } else {
                    d.c(textView, iArr5, 0);
                }
            }
        }
        j1 j1Var3 = new j1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i13 = j1Var3.i(8, -1);
        if (i13 != -1) {
            drawable = a6.b(context, i13);
        } else {
            drawable = null;
        }
        int i14 = j1Var3.i(13, -1);
        if (i14 != -1) {
            drawable2 = a6.b(context, i14);
        } else {
            drawable2 = null;
        }
        int i15 = j1Var3.i(9, -1);
        if (i15 != -1) {
            drawable3 = a6.b(context, i15);
        } else {
            drawable3 = null;
        }
        int i16 = j1Var3.i(6, -1);
        if (i16 != -1) {
            drawable4 = a6.b(context, i16);
        } else {
            drawable4 = null;
        }
        int i17 = j1Var3.i(10, -1);
        if (i17 != -1) {
            drawable5 = a6.b(context, i17);
        } else {
            drawable5 = null;
        }
        int i18 = j1Var3.i(7, -1);
        if (i18 != -1) {
            drawable6 = a6.b(context, i18);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a7 = b.a(textView);
                Drawable drawable7 = a7[0];
                if (drawable7 == null && a7[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a7[1];
                    }
                    Drawable drawable8 = a7[2];
                    if (drawable4 == null) {
                        drawable4 = a7[3];
                    }
                    b.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a8 = b.a(textView);
            if (drawable5 == null) {
                drawable5 = a8[0];
            }
            if (drawable2 == null) {
                drawable2 = a8[1];
            }
            if (drawable6 == null) {
                drawable6 = a8[2];
            }
            if (drawable4 == null) {
                drawable4 = a8[3];
            }
            b.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (j1Var3.l(11)) {
            k.c.f(textView, j1Var3.b(11));
        }
        if (j1Var3.l(12)) {
            i7 = -1;
            fontMetricsInt = null;
            k.c.g(textView, p0.b(j1Var3.h(12, -1), null));
        } else {
            i7 = -1;
            fontMetricsInt = null;
        }
        int d6 = j1Var3.d(15, i7);
        int d7 = j1Var3.d(18, i7);
        int d8 = j1Var3.d(19, i7);
        j1Var3.n();
        if (d6 != i7) {
            j0.k.b(textView, d6);
        }
        if (d7 != i7) {
            j0.k.c(textView, d7);
        }
        if (d8 != i7) {
            c.a.h(d8);
            if (d8 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(d8 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final void g(Context context, int i6) {
        String j5;
        j1 j1Var = new j1(context, context.obtainStyledAttributes(i6, c.b.f2689x));
        boolean l5 = j1Var.l(14);
        TextView textView = this.f718a;
        if (l5) {
            textView.setAllCaps(j1Var.a(14, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (j1Var.l(0) && j1Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, j1Var);
        if (i7 >= 26 && j1Var.l(13) && (j5 = j1Var.j(13)) != null) {
            d.d(textView, j5);
        }
        j1Var.n();
        Typeface typeface = this.f729l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f727j);
        }
    }

    public final void i(int i6, int i7, int i8, int i9) {
        k0 k0Var = this.f726i;
        if (k0Var.i()) {
            DisplayMetrics displayMetrics = k0Var.f830j.getResources().getDisplayMetrics();
            k0Var.j(TypedValue.applyDimension(i9, i6, displayMetrics), TypedValue.applyDimension(i9, i7, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (k0Var.g()) {
                k0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i6) {
        k0 k0Var = this.f726i;
        if (k0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i6 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = k0Var.f830j.getResources().getDisplayMetrics();
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr2[i7] = Math.round(TypedValue.applyDimension(i6, iArr[i7], displayMetrics));
                    }
                }
                k0Var.f826f = k0.b(iArr2);
                if (!k0Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                k0Var.f827g = false;
            }
            if (k0Var.g()) {
                k0Var.a();
            }
        }
    }

    public final void k(int i6) {
        k0 k0Var = this.f726i;
        if (k0Var.i()) {
            if (i6 != 0) {
                if (i6 == 1) {
                    DisplayMetrics displayMetrics = k0Var.f830j.getResources().getDisplayMetrics();
                    k0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (k0Var.g()) {
                        k0Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(androidx.activity.j.a("Unknown auto-size text type: ", i6));
            }
            k0Var.f821a = 0;
            k0Var.f824d = -1.0f;
            k0Var.f825e = -1.0f;
            k0Var.f823c = -1.0f;
            k0Var.f826f = new int[0];
            k0Var.f822b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z5;
        if (this.f725h == null) {
            this.f725h = new h1();
        }
        h1 h1Var = this.f725h;
        h1Var.f786a = colorStateList;
        if (colorStateList != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        h1Var.f789d = z5;
        this.f719b = h1Var;
        this.f720c = h1Var;
        this.f721d = h1Var;
        this.f722e = h1Var;
        this.f723f = h1Var;
        this.f724g = h1Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z5;
        if (this.f725h == null) {
            this.f725h = new h1();
        }
        h1 h1Var = this.f725h;
        h1Var.f787b = mode;
        if (mode != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        h1Var.f788c = z5;
        this.f719b = h1Var;
        this.f720c = h1Var;
        this.f721d = h1Var;
        this.f722e = h1Var;
        this.f723f = h1Var;
        this.f724g = h1Var;
    }

    public final void n(Context context, j1 j1Var) {
        String j5;
        Typeface create;
        Typeface typeface;
        this.f727j = j1Var.h(2, this.f727j);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            int h6 = j1Var.h(11, -1);
            this.f728k = h6;
            if (h6 != -1) {
                this.f727j = (this.f727j & 2) | 0;
            }
        }
        if (!j1Var.l(10) && !j1Var.l(12)) {
            if (j1Var.l(1)) {
                this.f730m = false;
                int h7 = j1Var.h(1, 1);
                if (h7 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h7 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h7 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f729l = typeface;
                return;
            }
            return;
        }
        this.f729l = null;
        int i7 = j1Var.l(12) ? 12 : 10;
        int i8 = this.f728k;
        int i9 = this.f727j;
        if (!context.isRestricted()) {
            try {
                Typeface g2 = j1Var.g(i7, this.f727j, new a(i8, i9, new WeakReference(this.f718a)));
                if (g2 != null) {
                    if (i6 >= 28 && this.f728k != -1) {
                        g2 = e.a(Typeface.create(g2, 0), this.f728k, (this.f727j & 2) != 0);
                    }
                    this.f729l = g2;
                }
                this.f730m = this.f729l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f729l != null || (j5 = j1Var.j(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f728k == -1) {
            create = Typeface.create(j5, this.f727j);
        } else {
            create = e.a(Typeface.create(j5, 0), this.f728k, (this.f727j & 2) != 0);
        }
        this.f729l = create;
    }
}
