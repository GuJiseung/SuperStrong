package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.appcompat.widget.b0;
import d0.j;
import j0.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class j0 extends TextView {

    /* renamed from: b  reason: collision with root package name */
    public final e f805b;

    /* renamed from: c  reason: collision with root package name */
    public final c0 f806c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f807d;

    /* renamed from: e  reason: collision with root package name */
    public l f808e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f809f;

    /* renamed from: g  reason: collision with root package name */
    public b f810g;

    /* renamed from: h  reason: collision with root package name */
    public Future<d0.j> f811h;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i6);

        void b(int i6);
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.j0.a
        public void a(int i6) {
        }

        @Override // androidx.appcompat.widget.j0.a
        public void b(int i6) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.j0.b, androidx.appcompat.widget.j0.a
        public final void a(int i6) {
            j0.super.setLastBaselineToBottomHeight(i6);
        }

        @Override // androidx.appcompat.widget.j0.b, androidx.appcompat.widget.j0.a
        public final void b(int i6) {
            j0.super.setFirstBaselineToTopHeight(i6);
        }
    }

    public j0() {
        throw null;
    }

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        g1.a(context);
        this.f809f = false;
        this.f810g = null;
        e1.a(this, getContext());
        e eVar = new e(this);
        this.f805b = eVar;
        eVar.d(attributeSet, i6);
        c0 c0Var = new c0(this);
        this.f806c = c0Var;
        c0Var.f(attributeSet, i6);
        c0Var.b();
        this.f807d = new b0(this);
        getEmojiTextViewHelper().a(attributeSet, i6);
    }

    private l getEmojiTextViewHelper() {
        if (this.f808e == null) {
            this.f808e = new l(this);
        }
        return this.f808e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f805b;
        if (eVar != null) {
            eVar.a();
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (s1.f935b) {
            return super.getAutoSizeMaxTextSize();
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f825e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (s1.f935b) {
            return super.getAutoSizeMinTextSize();
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f824d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (s1.f935b) {
            return super.getAutoSizeStepGranularity();
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            return Math.round(c0Var.f726i.f823c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (s1.f935b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            return c0Var.f726i.f826f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (s1.f935b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        c0 c0Var = this.f806c;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f726i.f821a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.k.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        b bVar;
        if (this.f810g == null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                bVar = new c();
            } else if (i6 >= 26) {
                bVar = new b();
            }
            this.f810g = bVar;
        }
        return this.f810g;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f805b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f805b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f806c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f806c.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<d0.j> future = this.f811h;
        if (future != null) {
            try {
                this.f811h = null;
                d0.j jVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    jVar.getClass();
                    setText((CharSequence) null);
                } else {
                    j.a a6 = j0.k.a(this);
                    jVar.getClass();
                    a6.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f807d) != null) {
            TextClassifier textClassifier = b0Var.f686b;
            if (textClassifier == null) {
                return b0.a.a(b0Var.f685a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public j.a getTextMetricsParamsCompat() {
        return j0.k.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f806c.getClass();
        c0.h(this, onCreateInputConnection, editorInfo);
        a1.f0.i(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        super.onLayout(z5, i6, i7, i8, i9);
        c0 c0Var = this.f806c;
        if (c0Var != null && !s1.f935b) {
            c0Var.f726i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        Future<d0.j> future = this.f811h;
        if (future != null) {
            try {
                this.f811h = null;
                d0.j jVar = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    jVar.getClass();
                    setText((CharSequence) null);
                } else {
                    j.a a6 = j0.k.a(this);
                    jVar.getClass();
                    a6.a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i6, i7);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        boolean z5;
        super.onTextChanged(charSequence, i6, i7, i8);
        boolean z6 = false;
        c0 c0Var = this.f806c;
        if (c0Var != null && !s1.f935b) {
            k0 k0Var = c0Var.f726i;
            if (k0Var.i() && k0Var.f821a != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                z6 = true;
            }
        }
        if (z6) {
            c0Var.f726i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i6, int i7, int i8, int i9) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i6, i7, i8, i9);
            return;
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.i(i6, i7, i8, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i6) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i6);
            return;
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.j(iArr, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i6) {
        if (s1.f935b) {
            super.setAutoSizeTextTypeWithDefaults(i6);
            return;
        }
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.k(i6);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f805b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f805b;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i6 != 0 ? e.a.a(context, i6) : null, i7 != 0 ? e.a.a(context, i7) : null, i8 != 0 ? e.a.a(context, i8) : null, i9 != 0 ? e.a.a(context, i9) : null);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i6 != 0 ? e.a.a(context, i6) : null, i7 != 0 ? e.a.a(context, i7) : null, i8 != 0 ? e.a.a(context, i8) : null, i9 != 0 ? e.a.a(context, i9) : null);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f835b.f5697a.a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i6);
        } else {
            j0.k.b(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i6) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i6);
        } else {
            j0.k.c(this, i6);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i6) {
        c.a.h(i6);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i6 != fontMetricsInt) {
            setLineSpacing(i6 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(d0.j jVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            jVar.getClass();
            setText((CharSequence) null);
            return;
        }
        j.a a6 = j0.k.a(this);
        jVar.getClass();
        a6.a(null);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f805b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f805b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f806c;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f806c;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.g(context, i6);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT < 28 && (b0Var = this.f807d) != null) {
            b0Var.f686b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<d0.j> future) {
        this.f811h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(j.a aVar) {
        int i6;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f3736b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i6 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i6 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i6 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i6 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i6 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i6 = 7;
            }
            k.b.h(this, i6);
            getPaint().set(aVar.f3735a);
            k.c.e(this, aVar.f3737c);
            k.c.h(this, aVar.f3738d);
        }
        i6 = 1;
        k.b.h(this, i6);
        getPaint().set(aVar.f3735a);
        k.c.e(this, aVar.f3737c);
        k.c.h(this, aVar.f3738d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        boolean z5;
        boolean z6 = s1.f935b;
        if (z6) {
            super.setTextSize(i6, f6);
            return;
        }
        c0 c0Var = this.f806c;
        if (c0Var != null && !z6) {
            k0 k0Var = c0Var.f726i;
            if (k0Var.i() && k0Var.f821a != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                k0Var.f(i6, f6);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i6) {
        Typeface typeface2;
        if (this.f809f) {
            return;
        }
        if (typeface != null && i6 > 0) {
            Context context = getContext();
            y.l lVar = y.e.f6730a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i6);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f809f = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i6);
        } finally {
            this.f809f = false;
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f806c;
        if (c0Var != null) {
            c0Var.b();
        }
    }
}
