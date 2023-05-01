package com.google.android.material.textfield;

import a1.f0;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.k;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.p0;
import com.google.android.material.internal.CheckableImageButton;
import com.superstrong.android.R;
import d0.m;
import f0.g0;
import f0.r0;
import h3.f;
import h3.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m3.r;
import m3.s;
import m3.u;
import m3.x;
import w.a;
import z2.n;
import z2.q;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: z0  reason: collision with root package name */
    public static final int[][] f3393z0 = {new int[]{16842919}, new int[0]};
    public ColorStateList A;
    public boolean B;
    public CharSequence C;
    public boolean D;
    public h3.f E;
    public h3.f F;
    public StateListDrawable G;
    public boolean H;
    public h3.f I;
    public h3.f J;
    public h3.i K;
    public boolean L;
    public final int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final Rect U;
    public final Rect V;
    public final RectF W;

    /* renamed from: a0  reason: collision with root package name */
    public Typeface f3394a0;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f3395b;

    /* renamed from: b0  reason: collision with root package name */
    public ColorDrawable f3396b0;

    /* renamed from: c  reason: collision with root package name */
    public final x f3397c;

    /* renamed from: c0  reason: collision with root package name */
    public int f3398c0;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.material.textfield.a f3399d;

    /* renamed from: d0  reason: collision with root package name */
    public final LinkedHashSet<g> f3400d0;

    /* renamed from: e  reason: collision with root package name */
    public EditText f3401e;

    /* renamed from: e0  reason: collision with root package name */
    public ColorDrawable f3402e0;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3403f;

    /* renamed from: f0  reason: collision with root package name */
    public int f3404f0;

    /* renamed from: g  reason: collision with root package name */
    public int f3405g;

    /* renamed from: g0  reason: collision with root package name */
    public Drawable f3406g0;

    /* renamed from: h  reason: collision with root package name */
    public int f3407h;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f3408h0;

    /* renamed from: i  reason: collision with root package name */
    public int f3409i;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f3410i0;

    /* renamed from: j  reason: collision with root package name */
    public int f3411j;

    /* renamed from: j0  reason: collision with root package name */
    public int f3412j0;

    /* renamed from: k  reason: collision with root package name */
    public final r f3413k;

    /* renamed from: k0  reason: collision with root package name */
    public int f3414k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3415l;

    /* renamed from: l0  reason: collision with root package name */
    public int f3416l0;

    /* renamed from: m  reason: collision with root package name */
    public int f3417m;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f3418m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3419n;

    /* renamed from: n0  reason: collision with root package name */
    public int f3420n0;

    /* renamed from: o  reason: collision with root package name */
    public f f3421o;

    /* renamed from: o0  reason: collision with root package name */
    public int f3422o0;

    /* renamed from: p  reason: collision with root package name */
    public j0 f3423p;

    /* renamed from: p0  reason: collision with root package name */
    public int f3424p0;

    /* renamed from: q  reason: collision with root package name */
    public int f3425q;

    /* renamed from: q0  reason: collision with root package name */
    public int f3426q0;

    /* renamed from: r  reason: collision with root package name */
    public int f3427r;
    public int r0;
    public CharSequence s;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f3428s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3429t;

    /* renamed from: t0  reason: collision with root package name */
    public final z2.c f3430t0;
    public j0 u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3431u0;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f3432v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f3433v0;

    /* renamed from: w  reason: collision with root package name */
    public int f3434w;
    public ValueAnimator w0;

    /* renamed from: x  reason: collision with root package name */
    public a1.d f3435x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f3436x0;

    /* renamed from: y  reason: collision with root package name */
    public a1.d f3437y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f3438y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f3439z;

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s(!textInputLayout.f3438y0, false);
            if (textInputLayout.f3415l) {
                textInputLayout.m(editable);
            }
            if (textInputLayout.f3429t) {
                textInputLayout.t(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f3399d.f3453h;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f3401e.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f3430t0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e extends f0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f3444d;

        public e(TextInputLayout textInputLayout) {
            this.f3444d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
            if (r7 != null) goto L51;
         */
        @Override // f0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(android.view.View r18, g0.f r19) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, g0.f):void");
        }

        @Override // f0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            this.f3444d.f3399d.b().o(accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes.dex */
    public static class i extends l0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f3445d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3446e;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new i[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3445d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3446e = parcel.readInt() == 1;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3445d) + "}";
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            TextUtils.writeToParcel(this.f3445d, parcel, i6);
            parcel.writeInt(this.f3446e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.textInputStyle, 2131952423), attributeSet, R.attr.textInputStyle);
        int colorForState;
        this.f3405g = -1;
        this.f3407h = -1;
        this.f3409i = -1;
        this.f3411j = -1;
        this.f3413k = new r(this);
        this.f3421o = new a2.d();
        this.U = new Rect();
        this.V = new Rect();
        this.W = new RectF();
        this.f3400d0 = new LinkedHashSet<>();
        z2.c cVar = new z2.c(this);
        this.f3430t0 = cVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3395b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = h2.a.f4422a;
        cVar.Q = linearInterpolator;
        cVar.h(false);
        cVar.P = linearInterpolator;
        cVar.h(false);
        if (cVar.f6946g != 8388659) {
            cVar.f6946g = 8388659;
            cVar.h(false);
        }
        j1 e6 = n.e(context2, attributeSet, c.b.f2667i0, R.attr.textInputStyle, 2131952423, 22, 20, 38, 43, 47);
        x xVar = new x(this, e6);
        this.f3397c = xVar;
        this.B = e6.a(46, true);
        setHint(e6.k(4));
        this.f3433v0 = e6.a(45, true);
        this.f3431u0 = e6.a(40, true);
        if (e6.l(6)) {
            setMinEms(e6.h(6, -1));
        } else if (e6.l(3)) {
            setMinWidth(e6.d(3, -1));
        }
        if (e6.l(5)) {
            setMaxEms(e6.h(5, -1));
        } else if (e6.l(2)) {
            setMaxWidth(e6.d(2, -1));
        }
        this.K = new h3.i(h3.i.b(context2, attributeSet, R.attr.textInputStyle, 2131952423));
        this.M = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.O = e6.c(9, 0);
        this.Q = e6.d(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.R = e6.d(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.P = this.Q;
        TypedArray typedArray = e6.f815b;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        h3.i iVar = this.K;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        if (dimension >= 0.0f) {
            aVar.f4504e = new h3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar.f4505f = new h3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar.f4506g = new h3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar.f4507h = new h3.a(dimension4);
        }
        this.K = new h3.i(aVar);
        ColorStateList b6 = d3.c.b(context2, e6, 7);
        if (b6 != null) {
            int defaultColor = b6.getDefaultColor();
            this.f3420n0 = defaultColor;
            this.T = defaultColor;
            if (b6.isStateful()) {
                this.f3422o0 = b6.getColorForState(new int[]{-16842910}, -1);
                this.f3424p0 = b6.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = b6.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f3424p0 = this.f3420n0;
                ColorStateList a6 = w.a.a(context2, R.color.mtrl_filled_background_color);
                this.f3422o0 = a6.getColorForState(new int[]{-16842910}, -1);
                colorForState = a6.getColorForState(new int[]{16843623}, -1);
            }
            this.f3426q0 = colorForState;
        } else {
            this.T = 0;
            this.f3420n0 = 0;
            this.f3422o0 = 0;
            this.f3424p0 = 0;
            this.f3426q0 = 0;
        }
        if (e6.l(1)) {
            ColorStateList b7 = e6.b(1);
            this.f3410i0 = b7;
            this.f3408h0 = b7;
        }
        ColorStateList b8 = d3.c.b(context2, e6, 14);
        this.f3416l0 = typedArray.getColor(14, 0);
        Object obj = w.a.f6573a;
        this.f3412j0 = a.c.a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.r0 = a.c.a(context2, R.color.mtrl_textinput_disabled_color);
        this.f3414k0 = a.c.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (b8 != null) {
            setBoxStrokeColorStateList(b8);
        }
        if (e6.l(15)) {
            setBoxStrokeErrorColor(d3.c.b(context2, e6, 15));
        }
        if (e6.i(47, -1) != -1) {
            setHintTextAppearance(e6.i(47, 0));
        }
        int i6 = e6.i(38, 0);
        CharSequence k5 = e6.k(33);
        int h6 = e6.h(32, 1);
        boolean a7 = e6.a(34, false);
        int i7 = e6.i(43, 0);
        boolean a8 = e6.a(42, false);
        CharSequence k6 = e6.k(41);
        int i8 = e6.i(55, 0);
        CharSequence k7 = e6.k(54);
        boolean a9 = e6.a(18, false);
        setCounterMaxLength(e6.h(19, -1));
        this.f3427r = e6.i(22, 0);
        this.f3425q = e6.i(20, 0);
        setBoxBackgroundMode(e6.h(8, 0));
        setErrorContentDescription(k5);
        setErrorAccessibilityLiveRegion(h6);
        setCounterOverflowTextAppearance(this.f3425q);
        setHelperTextTextAppearance(i7);
        setErrorTextAppearance(i6);
        setCounterTextAppearance(this.f3427r);
        setPlaceholderText(k7);
        setPlaceholderTextAppearance(i8);
        if (e6.l(39)) {
            setErrorTextColor(e6.b(39));
        }
        if (e6.l(44)) {
            setHelperTextColor(e6.b(44));
        }
        if (e6.l(48)) {
            setHintTextColor(e6.b(48));
        }
        if (e6.l(23)) {
            setCounterTextColor(e6.b(23));
        }
        if (e6.l(21)) {
            setCounterOverflowTextColor(e6.b(21));
        }
        if (e6.l(56)) {
            setPlaceholderTextColor(e6.b(56));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, e6);
        this.f3399d = aVar2;
        boolean a10 = e6.a(0, true);
        e6.n();
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(this, 2);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 >= 26) {
            g0.l.l(this, 1);
        }
        frameLayout.addView(xVar);
        frameLayout.addView(aVar2);
        addView(frameLayout);
        setEnabled(a10);
        setHelperTextEnabled(a8);
        setErrorEnabled(a7);
        setCounterEnabled(a9);
        setHelperText(k6);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z5;
        int i6;
        EditText editText = this.f3401e;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                int m5 = c.a.m(this.f3401e, R.attr.colorControlHighlight);
                int i7 = this.N;
                int[][] iArr = f3393z0;
                if (i7 == 2) {
                    Context context = getContext();
                    h3.f fVar = this.E;
                    TypedValue c6 = d3.b.c(context, R.attr.colorSurface, "TextInputLayout");
                    int i8 = c6.resourceId;
                    if (i8 != 0) {
                        Object obj = w.a.f6573a;
                        i6 = a.c.a(context, i8);
                    } else {
                        i6 = c6.data;
                    }
                    h3.f fVar2 = new h3.f(fVar.f4446b.f4467a);
                    int p5 = c.a.p(0.1f, m5, i6);
                    fVar2.k(new ColorStateList(iArr, new int[]{p5, 0}));
                    fVar2.setTint(i6);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{p5, i6});
                    h3.f fVar3 = new h3.f(fVar.f4446b.f4467a);
                    fVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fVar2, fVar3), fVar});
                } else if (i7 == 1) {
                    h3.f fVar4 = this.E;
                    int i9 = this.T;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{c.a.p(0.1f, m5, i9), i9}), fVar4, fVar4);
                } else {
                    return null;
                }
            }
        }
        return this.E;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.G == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.G = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.G.addState(new int[0], f(false));
        }
        return this.G;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.F == null) {
            this.F = f(true);
        }
        return this.F;
    }

    public static void j(ViewGroup viewGroup, boolean z5) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            childAt.setEnabled(z5);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z5);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3401e == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f3401e = editText;
            int i6 = this.f3405g;
            if (i6 != -1) {
                setMinEms(i6);
            } else {
                setMinWidth(this.f3409i);
            }
            int i7 = this.f3407h;
            if (i7 != -1) {
                setMaxEms(i7);
            } else {
                setMaxWidth(this.f3411j);
            }
            this.H = false;
            h();
            setTextInputAccessibilityDelegate(new e(this));
            Typeface typeface = this.f3401e.getTypeface();
            z2.c cVar = this.f3430t0;
            cVar.m(typeface);
            float textSize = this.f3401e.getTextSize();
            if (cVar.f6947h != textSize) {
                cVar.f6947h = textSize;
                cVar.h(false);
            }
            float letterSpacing = this.f3401e.getLetterSpacing();
            if (cVar.W != letterSpacing) {
                cVar.W = letterSpacing;
                cVar.h(false);
            }
            int gravity = this.f3401e.getGravity();
            int i8 = (gravity & (-113)) | 48;
            if (cVar.f6946g != i8) {
                cVar.f6946g = i8;
                cVar.h(false);
            }
            if (cVar.f6944f != gravity) {
                cVar.f6944f = gravity;
                cVar.h(false);
            }
            this.f3401e.addTextChangedListener(new a());
            if (this.f3408h0 == null) {
                this.f3408h0 = this.f3401e.getHintTextColors();
            }
            if (this.B) {
                if (TextUtils.isEmpty(this.C)) {
                    CharSequence hint = this.f3401e.getHint();
                    this.f3403f = hint;
                    setHint(hint);
                    this.f3401e.setHint((CharSequence) null);
                }
                this.D = true;
            }
            if (this.f3423p != null) {
                m(this.f3401e.getText());
            }
            p();
            this.f3413k.b();
            this.f3397c.bringToFront();
            com.google.android.material.textfield.a aVar = this.f3399d;
            aVar.bringToFront();
            Iterator<g> it = this.f3400d0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            aVar.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.C)) {
            this.C = charSequence;
            z2.c cVar = this.f3430t0;
            if (charSequence == null || !TextUtils.equals(cVar.A, charSequence)) {
                cVar.A = charSequence;
                cVar.B = null;
                Bitmap bitmap = cVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.E = null;
                }
                cVar.h(false);
            }
            if (!this.f3428s0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z5) {
        if (this.f3429t == z5) {
            return;
        }
        if (z5) {
            j0 j0Var = this.u;
            if (j0Var != null) {
                this.f3395b.addView(j0Var);
                this.u.setVisibility(0);
            }
        } else {
            j0 j0Var2 = this.u;
            if (j0Var2 != null) {
                j0Var2.setVisibility(8);
            }
            this.u = null;
        }
        this.f3429t = z5;
    }

    public final void a(float f6) {
        z2.c cVar = this.f3430t0;
        if (cVar.f6936b == f6) {
            return;
        }
        if (this.w0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.w0 = valueAnimator;
            valueAnimator.setInterpolator(a3.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, h2.a.f4423b));
            this.w0.setDuration(a3.a.c(getContext(), R.attr.motionDurationMedium4, 167));
            this.w0.addUpdateListener(new d());
        }
        this.w0.setFloatValues(cVar.f6936b, f6);
        this.w0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i6, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3395b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        r();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            h3.f r0 = r7.E
            if (r0 != 0) goto L5
            return
        L5:
            h3.f$b r1 = r0.f4446b
            h3.i r1 = r1.f4467a
            h3.i r2 = r7.K
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.N
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.P
            if (r0 <= r2) goto L22
            int r0 = r7.S
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            h3.f r0 = r7.E
            int r1 = r7.P
            float r1 = (float) r1
            int r5 = r7.S
            h3.f$b r6 = r0.f4446b
            r6.f4477k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            h3.f$b r5 = r0.f4446b
            android.content.res.ColorStateList r6 = r5.f4470d
            if (r6 == r1) goto L4b
            r5.f4470d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.T
            int r1 = r7.N
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968839(0x7f040107, float:1.7546343E38)
            int r0 = c.a.l(r0, r1, r3)
            int r1 = r7.T
            int r0 = y.a.b(r1, r0)
        L62:
            r7.T = r0
            h3.f r1 = r7.E
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.k(r0)
            h3.f r0 = r7.I
            if (r0 == 0) goto La3
            h3.f r1 = r7.J
            if (r1 != 0) goto L76
            goto La3
        L76:
            int r1 = r7.P
            if (r1 <= r2) goto L7f
            int r1 = r7.S
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La0
            android.widget.EditText r1 = r7.f3401e
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8c
            int r1 = r7.f3412j0
            goto L8e
        L8c:
            int r1 = r7.S
        L8e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
            h3.f r0 = r7.J
            int r1 = r7.S
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.k(r1)
        La0:
            r7.invalidate()
        La3:
            r7.q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d6;
        if (this.B) {
            int i6 = this.N;
            z2.c cVar = this.f3430t0;
            if (i6 == 0) {
                d6 = cVar.d();
            } else if (i6 != 2) {
                return 0;
            } else {
                d6 = cVar.d() / 2.0f;
            }
            return (int) d6;
        }
        return 0;
    }

    public final a1.d d() {
        a1.d dVar = new a1.d();
        dVar.f58d = a3.a.c(getContext(), R.attr.motionDurationShort2, 87);
        dVar.f59e = a3.a.d(getContext(), R.attr.motionEasingLinearInterpolator, h2.a.f4422a);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i6) {
        EditText editText = this.f3401e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i6);
            return;
        }
        if (this.f3403f != null) {
            boolean z5 = this.D;
            this.D = false;
            CharSequence hint = editText.getHint();
            this.f3401e.setHint(this.f3403f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i6);
                return;
            } finally {
                this.f3401e.setHint(hint);
                this.D = z5;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i6);
        onProvideAutofillVirtualStructure(viewStructure, i6);
        FrameLayout frameLayout = this.f3395b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i7 = 0; i7 < frameLayout.getChildCount(); i7++) {
            View childAt = frameLayout.getChildAt(i7);
            ViewStructure newChild = viewStructure.newChild(i7);
            childAt.dispatchProvideAutofillStructure(newChild, i6);
            if (childAt == this.f3401e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f3438y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3438y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h3.f fVar;
        super.draw(canvas);
        boolean z5 = this.B;
        z2.c cVar = this.f3430t0;
        if (z5) {
            cVar.getClass();
            int save = canvas.save();
            if (cVar.B != null) {
                RectF rectF = cVar.f6942e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = cVar.N;
                    textPaint.setTextSize(cVar.G);
                    float f6 = cVar.f6955p;
                    float f7 = cVar.f6956q;
                    float f8 = cVar.F;
                    if (f8 != 1.0f) {
                        canvas.scale(f8, f8, f6, f7);
                    }
                    boolean z6 = true;
                    if (cVar.f6941d0 <= 1 || cVar.C) {
                        z6 = false;
                    }
                    if (z6) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(cVar.f6955p - cVar.Y.getLineStart(0), f7);
                        float f9 = alpha;
                        textPaint.setAlpha((int) (cVar.f6937b0 * f9));
                        int i6 = Build.VERSION.SDK_INT;
                        if (i6 >= 31) {
                            float f10 = cVar.H;
                            float f11 = cVar.I;
                            float f12 = cVar.J;
                            int i7 = cVar.K;
                            textPaint.setShadowLayer(f10, f11, f12, y.a.c(i7, (Color.alpha(i7) * textPaint.getAlpha()) / 255));
                        }
                        cVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (cVar.f6935a0 * f9));
                        if (i6 >= 31) {
                            float f13 = cVar.H;
                            float f14 = cVar.I;
                            float f15 = cVar.J;
                            int i8 = cVar.K;
                            textPaint.setShadowLayer(f13, f14, f15, y.a.c(i8, (Color.alpha(i8) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = cVar.Y.getLineBaseline(0);
                        CharSequence charSequence = cVar.f6939c0;
                        float f16 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                        if (i6 >= 31) {
                            textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                        }
                        String trim = cVar.f6939c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(cVar.Y.getLineEnd(0), str.length()), 0.0f, f16, (Paint) textPaint);
                    } else {
                        canvas.translate(f6, f7);
                        cVar.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.J != null && (fVar = this.I) != null) {
            fVar.draw(canvas);
            if (this.f3401e.isFocused()) {
                Rect bounds = this.J.getBounds();
                Rect bounds2 = this.I.getBounds();
                float f17 = cVar.f6936b;
                int centerX = bounds2.centerX();
                bounds.left = h2.a.b(f17, centerX, bounds2.left);
                bounds.right = h2.a.b(f17, centerX, bounds2.right);
                this.J.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z5;
        ColorStateList colorStateList;
        boolean z6;
        boolean z7;
        if (this.f3436x0) {
            return;
        }
        boolean z8 = true;
        this.f3436x0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        z2.c cVar = this.f3430t0;
        if (cVar != null) {
            cVar.L = drawableState;
            ColorStateList colorStateList2 = cVar.f6950k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = cVar.f6949j) != null && colorStateList.isStateful())) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                cVar.h(false);
                z7 = true;
            } else {
                z7 = false;
            }
            z5 = z7 | false;
        } else {
            z5 = false;
        }
        if (this.f3401e != null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (!g0.g.c(this) || !isEnabled()) {
                z8 = false;
            }
            s(z8, false);
        }
        p();
        v();
        if (z5) {
            invalidate();
        }
        this.f3436x0 = false;
    }

    public final boolean e() {
        return this.B && !TextUtils.isEmpty(this.C) && (this.E instanceof m3.i);
    }

    public final h3.f f(boolean z5) {
        float f6;
        float dimensionPixelOffset;
        int i6;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z5) {
            f6 = dimensionPixelOffset2;
        } else {
            f6 = 0.0f;
        }
        EditText editText = this.f3401e;
        if (editText instanceof u) {
            dimensionPixelOffset = ((u) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i.a aVar = new i.a();
        aVar.f4504e = new h3.a(f6);
        aVar.f4505f = new h3.a(f6);
        aVar.f4507h = new h3.a(dimensionPixelOffset2);
        aVar.f4506g = new h3.a(dimensionPixelOffset2);
        h3.i iVar = new h3.i(aVar);
        Context context = getContext();
        Paint paint = h3.f.f4445x;
        TypedValue c6 = d3.b.c(context, R.attr.colorSurface, h3.f.class.getSimpleName());
        int i7 = c6.resourceId;
        if (i7 != 0) {
            Object obj = w.a.f6573a;
            i6 = a.c.a(context, i7);
        } else {
            i6 = c6.data;
        }
        h3.f fVar = new h3.f();
        fVar.i(context);
        fVar.k(ColorStateList.valueOf(i6));
        fVar.j(dimensionPixelOffset);
        fVar.setShapeAppearanceModel(iVar);
        f.b bVar = fVar.f4446b;
        if (bVar.f4474h == null) {
            bVar.f4474h = new Rect();
        }
        fVar.f4446b.f4474h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        fVar.invalidateSelf();
        return fVar;
    }

    public final int g(int i6, boolean z5) {
        int compoundPaddingLeft = this.f3401e.getCompoundPaddingLeft() + i6;
        return (getPrefixText() == null || z5) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3401e;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public h3.f getBoxBackground() {
        int i6 = this.N;
        if (i6 == 1 || i6 == 2) {
            return this.E;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.T;
    }

    public int getBoxBackgroundMode() {
        return this.N;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.O;
    }

    public float getBoxCornerRadiusBottomEnd() {
        h3.c cVar;
        boolean c6 = q.c(this);
        RectF rectF = this.W;
        if (c6) {
            cVar = this.K.f4495h;
        } else {
            cVar = this.K.f4494g;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        h3.c cVar;
        boolean c6 = q.c(this);
        RectF rectF = this.W;
        if (c6) {
            cVar = this.K.f4494g;
        } else {
            cVar = this.K.f4495h;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        h3.c cVar;
        boolean c6 = q.c(this);
        RectF rectF = this.W;
        if (c6) {
            cVar = this.K.f4492e;
        } else {
            cVar = this.K.f4493f;
        }
        return cVar.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        h3.c cVar;
        boolean c6 = q.c(this);
        RectF rectF = this.W;
        if (c6) {
            cVar = this.K.f4493f;
        } else {
            cVar = this.K.f4492e;
        }
        return cVar.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3416l0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3418m0;
    }

    public int getBoxStrokeWidth() {
        return this.Q;
    }

    public int getBoxStrokeWidthFocused() {
        return this.R;
    }

    public int getCounterMaxLength() {
        return this.f3417m;
    }

    public CharSequence getCounterOverflowDescription() {
        j0 j0Var;
        if (this.f3415l && this.f3419n && (j0Var = this.f3423p) != null) {
            return j0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3439z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3408h0;
    }

    public EditText getEditText() {
        return this.f3401e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3399d.f3453h.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3399d.f3453h.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3399d.f3459n;
    }

    public int getEndIconMode() {
        return this.f3399d.f3455j;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3399d.f3460o;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3399d.f3453h;
    }

    public CharSequence getError() {
        r rVar = this.f3413k;
        if (rVar.f5327q) {
            return rVar.f5326p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3413k.f5329t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3413k.s;
    }

    public int getErrorCurrentTextColors() {
        j0 j0Var = this.f3413k.f5328r;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3399d.f3449d.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.f3413k;
        if (rVar.f5332x) {
            return rVar.f5331w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        j0 j0Var = this.f3413k.f5333y;
        if (j0Var != null) {
            return j0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.B) {
            return this.C;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3430t0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        z2.c cVar = this.f3430t0;
        return cVar.e(cVar.f6950k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3410i0;
    }

    public f getLengthCounter() {
        return this.f3421o;
    }

    public int getMaxEms() {
        return this.f3407h;
    }

    public int getMaxWidth() {
        return this.f3411j;
    }

    public int getMinEms() {
        return this.f3405g;
    }

    public int getMinWidth() {
        return this.f3409i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3399d.f3453h.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3399d.f3453h.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3429t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3434w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3432v;
    }

    public CharSequence getPrefixText() {
        return this.f3397c.f5357d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3397c.f5356c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3397c.f5356c;
    }

    public h3.i getShapeAppearanceModel() {
        return this.K;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3397c.f5358e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3397c.f5358e.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3397c.f5361h;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3397c.f5362i;
    }

    public CharSequence getSuffixText() {
        return this.f3399d.f3462q;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3399d.f3463r.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3399d.f3463r;
    }

    public Typeface getTypeface() {
        return this.f3394a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.h():void");
    }

    public final void i() {
        float f6;
        float f7;
        float f8;
        RectF rectF;
        float f9;
        if (!e()) {
            return;
        }
        int width = this.f3401e.getWidth();
        int gravity = this.f3401e.getGravity();
        z2.c cVar = this.f3430t0;
        boolean b6 = cVar.b(cVar.A);
        cVar.C = b6;
        Rect rect = cVar.f6940d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? b6 : !b6) {
                f8 = rect.left;
                float max = Math.max(f8, rect.left);
                rectF = this.W;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!cVar.C) {
                            f9 = cVar.Z + max;
                        }
                        f9 = rect.right;
                    } else {
                        if (cVar.C) {
                            f9 = cVar.Z + max;
                        }
                        f9 = rect.right;
                    }
                } else {
                    f9 = (width / 2.0f) + (cVar.Z / 2.0f);
                }
                rectF.right = Math.min(f9, rect.right);
                rectF.bottom = cVar.d() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f10 = rectF.left;
                    float f11 = this.M;
                    rectF.left = f10 - f11;
                    rectF.right += f11;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.P);
                    m3.i iVar = (m3.i) this.E;
                    iVar.getClass();
                    iVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f6 = rect.right;
            f7 = cVar.Z;
        } else {
            f6 = width / 2.0f;
            f7 = cVar.Z / 2.0f;
        }
        f8 = f6 - f7;
        float max2 = Math.max(f8, rect.left);
        rectF = this.W;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f9 = (width / 2.0f) + (cVar.Z / 2.0f);
        rectF.right = Math.min(f9, rect.right);
        rectF.bottom = cVar.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void k(TextView textView, int i6) {
        boolean z5 = true;
        try {
            textView.setTextAppearance(i6);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z5 = false;
            }
        } catch (Exception unused) {
        }
        if (z5) {
            textView.setTextAppearance(2131952008);
            Context context = getContext();
            Object obj = w.a.f6573a;
            textView.setTextColor(a.c.a(context, R.color.design_error));
        }
    }

    public final boolean l() {
        r rVar = this.f3413k;
        if (rVar.f5325o == 1 && rVar.f5328r != null && !TextUtils.isEmpty(rVar.f5326p)) {
            return true;
        }
        return false;
    }

    public final void m(Editable editable) {
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        d0.a aVar;
        ((a2.d) this.f3421o).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        boolean z7 = this.f3419n;
        int i8 = this.f3417m;
        String str = null;
        if (i8 == -1) {
            this.f3423p.setText(String.valueOf(i6));
            this.f3423p.setContentDescription(null);
            this.f3419n = false;
        } else {
            if (i6 > i8) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f3419n = z5;
            Context context = getContext();
            j0 j0Var = this.f3423p;
            int i9 = this.f3417m;
            if (this.f3419n) {
                i7 = R.string.character_counter_overflowed_content_description;
            } else {
                i7 = R.string.character_counter_content_description;
            }
            j0Var.setContentDescription(context.getString(i7, Integer.valueOf(i6), Integer.valueOf(i9)));
            if (z7 != this.f3419n) {
                n();
            }
            String str2 = d0.a.f3723d;
            Locale locale = Locale.getDefault();
            int i10 = m.f3746a;
            if (m.a.a(locale) == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                aVar = d0.a.f3726g;
            } else {
                aVar = d0.a.f3725f;
            }
            j0 j0Var2 = this.f3423p;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i6), Integer.valueOf(this.f3417m));
            if (string == null) {
                aVar.getClass();
            } else {
                str = aVar.c(string, aVar.f3729c).toString();
            }
            j0Var2.setText(str);
        }
        if (this.f3401e != null && z7 != this.f3419n) {
            s(false, false);
            v();
            p();
        }
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        j0 j0Var = this.f3423p;
        if (j0Var != null) {
            k(j0Var, this.f3419n ? this.f3425q : this.f3427r);
            if (!this.f3419n && (colorStateList2 = this.f3439z) != null) {
                this.f3423p.setTextColor(colorStateList2);
            }
            if (!this.f3419n || (colorStateList = this.A) == null) {
                return;
            }
            this.f3423p.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.c() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.f3462q != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.o():boolean");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3430t0.g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        boolean z5;
        EditText editText;
        int max;
        super.onMeasure(i6, i7);
        EditText editText2 = this.f3401e;
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (editText2 != null && this.f3401e.getMeasuredHeight() < (max = Math.max(aVar.getMeasuredHeight(), this.f3397c.getMeasuredHeight()))) {
            this.f3401e.setMinimumHeight(max);
            z5 = true;
        } else {
            z5 = false;
        }
        boolean o5 = o();
        if (z5 || o5) {
            this.f3401e.post(new c());
        }
        if (this.u != null && (editText = this.f3401e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.f3401e.getCompoundPaddingLeft(), this.f3401e.getCompoundPaddingTop(), this.f3401e.getCompoundPaddingRight(), this.f3401e.getCompoundPaddingBottom());
        }
        aVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.f5073b);
        setError(iVar.f3445d);
        if (iVar.f3446e) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        boolean z5 = true;
        if (i6 != 1) {
            z5 = false;
        }
        if (z5 != this.L) {
            h3.c cVar = this.K.f4492e;
            RectF rectF = this.W;
            float a6 = cVar.a(rectF);
            float a7 = this.K.f4493f.a(rectF);
            float a8 = this.K.f4495h.a(rectF);
            float a9 = this.K.f4494g.a(rectF);
            h3.i iVar = this.K;
            f0 f0Var = iVar.f4488a;
            i.a aVar = new i.a();
            f0 f0Var2 = iVar.f4489b;
            aVar.f4500a = f0Var2;
            float b6 = i.a.b(f0Var2);
            if (b6 != -1.0f) {
                aVar.f4504e = new h3.a(b6);
            }
            aVar.f4501b = f0Var;
            float b7 = i.a.b(f0Var);
            if (b7 != -1.0f) {
                aVar.f4505f = new h3.a(b7);
            }
            f0 f0Var3 = iVar.f4490c;
            aVar.f4503d = f0Var3;
            float b8 = i.a.b(f0Var3);
            if (b8 != -1.0f) {
                aVar.f4507h = new h3.a(b8);
            }
            f0 f0Var4 = iVar.f4491d;
            aVar.f4502c = f0Var4;
            float b9 = i.a.b(f0Var4);
            if (b9 != -1.0f) {
                aVar.f4506g = new h3.a(b9);
            }
            aVar.f4504e = new h3.a(a7);
            aVar.f4505f = new h3.a(a6);
            aVar.f4507h = new h3.a(a9);
            aVar.f4506g = new h3.a(a8);
            h3.i iVar2 = new h3.i(aVar);
            this.L = z5;
            setShapeAppearanceModel(iVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z5;
        i iVar = new i(super.onSaveInstanceState());
        if (l()) {
            iVar.f3445d = getError();
        }
        com.google.android.material.textfield.a aVar = this.f3399d;
        boolean z6 = true;
        if (aVar.f3455j != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 || !aVar.f3453h.isChecked()) {
            z6 = false;
        }
        iVar.f3446e = z6;
        return iVar;
    }

    public final void p() {
        Drawable background;
        j0 j0Var;
        int currentTextColor;
        EditText editText = this.f3401e;
        if (editText == null || this.N != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = p0.f875a;
        Drawable mutate = background.mutate();
        if (l()) {
            currentTextColor = getErrorCurrentTextColors();
        } else if (this.f3419n && (j0Var = this.f3423p) != null) {
            currentTextColor = j0Var.getCurrentTextColor();
        } else {
            mutate.clearColorFilter();
            this.f3401e.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(j.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void q() {
        EditText editText = this.f3401e;
        if (editText != null && this.E != null) {
            if ((this.H || editText.getBackground() == null) && this.N != 0) {
                EditText editText2 = this.f3401e;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.q(editText2, editTextBoxBackground);
                this.H = true;
            }
        }
    }

    public final void r() {
        if (this.N != 1) {
            FrameLayout frameLayout = this.f3395b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c6 = c();
            if (c6 != layoutParams.topMargin) {
                layoutParams.topMargin = c6;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s(boolean, boolean):void");
    }

    public void setBoxBackgroundColor(int i6) {
        if (this.T != i6) {
            this.T = i6;
            this.f3420n0 = i6;
            this.f3424p0 = i6;
            this.f3426q0 = i6;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i6) {
        Context context = getContext();
        Object obj = w.a.f6573a;
        setBoxBackgroundColor(a.c.a(context, i6));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3420n0 = defaultColor;
        this.T = defaultColor;
        this.f3422o0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3424p0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f3426q0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i6) {
        if (i6 == this.N) {
            return;
        }
        this.N = i6;
        if (this.f3401e != null) {
            h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i6) {
        this.O = i6;
    }

    public void setBoxCornerFamily(int i6) {
        h3.i iVar = this.K;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        h3.c cVar = this.K.f4492e;
        f0 j5 = k.j(i6);
        aVar.f4500a = j5;
        float b6 = i.a.b(j5);
        if (b6 != -1.0f) {
            aVar.f4504e = new h3.a(b6);
        }
        aVar.f4504e = cVar;
        h3.c cVar2 = this.K.f4493f;
        f0 j6 = k.j(i6);
        aVar.f4501b = j6;
        float b7 = i.a.b(j6);
        if (b7 != -1.0f) {
            aVar.f4505f = new h3.a(b7);
        }
        aVar.f4505f = cVar2;
        h3.c cVar3 = this.K.f4495h;
        f0 j7 = k.j(i6);
        aVar.f4503d = j7;
        float b8 = i.a.b(j7);
        if (b8 != -1.0f) {
            aVar.f4507h = new h3.a(b8);
        }
        aVar.f4507h = cVar3;
        h3.c cVar4 = this.K.f4494g;
        f0 j8 = k.j(i6);
        aVar.f4502c = j8;
        float b9 = i.a.b(j8);
        if (b9 != -1.0f) {
            aVar.f4506g = new h3.a(b9);
        }
        aVar.f4506g = cVar4;
        this.K = new h3.i(aVar);
        b();
    }

    public void setBoxStrokeColor(int i6) {
        if (this.f3416l0 != i6) {
            this.f3416l0 = i6;
            v();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f3416l0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            v();
        }
        this.f3412j0 = colorStateList.getDefaultColor();
        this.r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3414k0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f3416l0 = defaultColor;
        v();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3418m0 != colorStateList) {
            this.f3418m0 = colorStateList;
            v();
        }
    }

    public void setBoxStrokeWidth(int i6) {
        this.Q = i6;
        v();
    }

    public void setBoxStrokeWidthFocused(int i6) {
        this.R = i6;
        v();
    }

    public void setBoxStrokeWidthFocusedResource(int i6) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i6));
    }

    public void setBoxStrokeWidthResource(int i6) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i6));
    }

    public void setCounterEnabled(boolean z5) {
        if (this.f3415l != z5) {
            Editable editable = null;
            r rVar = this.f3413k;
            if (z5) {
                j0 j0Var = new j0(getContext(), null);
                this.f3423p = j0Var;
                j0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f3394a0;
                if (typeface != null) {
                    this.f3423p.setTypeface(typeface);
                }
                this.f3423p.setMaxLines(1);
                rVar.a(this.f3423p, 2);
                f0.m.h((ViewGroup.MarginLayoutParams) this.f3423p.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                n();
                if (this.f3423p != null) {
                    EditText editText = this.f3401e;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    m(editable);
                }
            } else {
                rVar.g(this.f3423p, 2);
                this.f3423p = null;
            }
            this.f3415l = z5;
        }
    }

    public void setCounterMaxLength(int i6) {
        Editable text;
        if (this.f3417m != i6) {
            if (i6 <= 0) {
                i6 = -1;
            }
            this.f3417m = i6;
            if (this.f3415l && this.f3423p != null) {
                EditText editText = this.f3401e;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                m(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i6) {
        if (this.f3425q != i6) {
            this.f3425q = i6;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i6) {
        if (this.f3427r != i6) {
            this.f3427r = i6;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3439z != colorStateList) {
            this.f3439z = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3408h0 = colorStateList;
        this.f3410i0 = colorStateList;
        if (this.f3401e != null) {
            s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        j(this, z5);
        super.setEnabled(z5);
    }

    public void setEndIconActivated(boolean z5) {
        this.f3399d.f3453h.setActivated(z5);
    }

    public void setEndIconCheckable(boolean z5) {
        this.f3399d.f3453h.setCheckable(z5);
    }

    public void setEndIconContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        CharSequence text = i6 != 0 ? aVar.getResources().getText(i6) : null;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        Drawable a6 = i6 != 0 ? e.a.a(aVar.getContext(), i6) : null;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        checkableImageButton.setImageDrawable(a6);
        if (a6 != null) {
            ColorStateList colorStateList = aVar.f3457l;
            PorterDuff.Mode mode = aVar.f3458m;
            TextInputLayout textInputLayout = aVar.f3447b;
            m3.q.a(textInputLayout, checkableImageButton, colorStateList, mode);
            m3.q.c(textInputLayout, checkableImageButton, aVar.f3457l);
        }
    }

    public void setEndIconMinSize(int i6) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (i6 >= 0) {
            if (i6 != aVar.f3459n) {
                aVar.f3459n = i6;
                CheckableImageButton checkableImageButton = aVar.f3453h;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                CheckableImageButton checkableImageButton2 = aVar.f3449d;
                checkableImageButton2.setMinimumWidth(i6);
                checkableImageButton2.setMinimumHeight(i6);
                return;
            }
            return;
        }
        aVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i6) {
        this.f3399d.f(i6);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        View.OnLongClickListener onLongClickListener = aVar.f3461p;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        checkableImageButton.setOnClickListener(onClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3461p = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3460o = scaleType;
        aVar.f3453h.setScaleType(scaleType);
        aVar.f3449d.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (aVar.f3457l != colorStateList) {
            aVar.f3457l = colorStateList;
            m3.q.a(aVar.f3447b, aVar.f3453h, colorStateList, aVar.f3458m);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (aVar.f3458m != mode) {
            aVar.f3458m = mode;
            m3.q.a(aVar.f3447b, aVar.f3453h, aVar.f3457l, mode);
        }
    }

    public void setEndIconVisible(boolean z5) {
        this.f3399d.g(z5);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.f3413k;
        if (!rVar.f5327q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            rVar.c();
            rVar.f5326p = charSequence;
            rVar.f5328r.setText(charSequence);
            int i6 = rVar.f5324n;
            if (i6 != 1) {
                rVar.f5325o = 1;
            }
            rVar.i(i6, rVar.f5325o, rVar.h(rVar.f5328r, charSequence));
            return;
        }
        rVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i6) {
        r rVar = this.f3413k;
        rVar.f5329t = i6;
        j0 j0Var = rVar.f5328r;
        if (j0Var != null) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.g.f(j0Var, i6);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.f3413k;
        rVar.s = charSequence;
        j0 j0Var = rVar.f5328r;
        if (j0Var != null) {
            j0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z5) {
        r rVar = this.f3413k;
        if (rVar.f5327q != z5) {
            rVar.c();
            TextInputLayout textInputLayout = rVar.f5318h;
            if (z5) {
                j0 j0Var = new j0(rVar.f5317g, null);
                rVar.f5328r = j0Var;
                j0Var.setId(R.id.textinput_error);
                rVar.f5328r.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f5328r.setTypeface(typeface);
                }
                int i6 = rVar.u;
                rVar.u = i6;
                j0 j0Var2 = rVar.f5328r;
                if (j0Var2 != null) {
                    textInputLayout.k(j0Var2, i6);
                }
                ColorStateList colorStateList = rVar.f5330v;
                rVar.f5330v = colorStateList;
                j0 j0Var3 = rVar.f5328r;
                if (j0Var3 != null && colorStateList != null) {
                    j0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = rVar.s;
                rVar.s = charSequence;
                j0 j0Var4 = rVar.f5328r;
                if (j0Var4 != null) {
                    j0Var4.setContentDescription(charSequence);
                }
                int i7 = rVar.f5329t;
                rVar.f5329t = i7;
                j0 j0Var5 = rVar.f5328r;
                if (j0Var5 != null) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.g.f(j0Var5, i7);
                }
                rVar.f5328r.setVisibility(4);
                rVar.a(rVar.f5328r, 0);
            } else {
                rVar.f();
                rVar.g(rVar.f5328r, 0);
                rVar.f5328r = null;
                textInputLayout.p();
                textInputLayout.v();
            }
            rVar.f5327q = z5;
        }
    }

    public void setErrorIconDrawable(int i6) {
        Drawable drawable;
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (i6 != 0) {
            drawable = e.a.a(aVar.getContext(), i6);
        } else {
            drawable = null;
        }
        aVar.h(drawable);
        m3.q.c(aVar.f3447b, aVar.f3449d, aVar.f3450e);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3399d.h(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        CheckableImageButton checkableImageButton = aVar.f3449d;
        View.OnLongClickListener onLongClickListener = aVar.f3452g;
        checkableImageButton.setOnClickListener(onClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3452g = onLongClickListener;
        CheckableImageButton checkableImageButton = aVar.f3449d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (aVar.f3450e != colorStateList) {
            aVar.f3450e = colorStateList;
            m3.q.a(aVar.f3447b, aVar.f3449d, colorStateList, aVar.f3451f);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (aVar.f3451f != mode) {
            aVar.f3451f = mode;
            m3.q.a(aVar.f3447b, aVar.f3449d, aVar.f3450e, mode);
        }
    }

    public void setErrorTextAppearance(int i6) {
        r rVar = this.f3413k;
        rVar.u = i6;
        j0 j0Var = rVar.f5328r;
        if (j0Var != null) {
            rVar.f5318h.k(j0Var, i6);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.f3413k;
        rVar.f5330v = colorStateList;
        j0 j0Var = rVar.f5328r;
        if (j0Var != null && colorStateList != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z5) {
        if (this.f3431u0 != z5) {
            this.f3431u0 = z5;
            s(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.f3413k;
        if (isEmpty) {
            if (rVar.f5332x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f5332x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f5331w = charSequence;
        rVar.f5333y.setText(charSequence);
        int i6 = rVar.f5324n;
        if (i6 != 2) {
            rVar.f5325o = 2;
        }
        rVar.i(i6, rVar.f5325o, rVar.h(rVar.f5333y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.f3413k;
        rVar.A = colorStateList;
        j0 j0Var = rVar.f5333y;
        if (j0Var != null && colorStateList != null) {
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z5) {
        r rVar = this.f3413k;
        if (rVar.f5332x != z5) {
            rVar.c();
            if (z5) {
                j0 j0Var = new j0(rVar.f5317g, null);
                rVar.f5333y = j0Var;
                j0Var.setId(R.id.textinput_helper_text);
                rVar.f5333y.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f5333y.setTypeface(typeface);
                }
                rVar.f5333y.setVisibility(4);
                j0 j0Var2 = rVar.f5333y;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.g.f(j0Var2, 1);
                int i6 = rVar.f5334z;
                rVar.f5334z = i6;
                j0 j0Var3 = rVar.f5333y;
                if (j0Var3 != null) {
                    j0Var3.setTextAppearance(i6);
                }
                ColorStateList colorStateList = rVar.A;
                rVar.A = colorStateList;
                j0 j0Var4 = rVar.f5333y;
                if (j0Var4 != null && colorStateList != null) {
                    j0Var4.setTextColor(colorStateList);
                }
                rVar.a(rVar.f5333y, 1);
                rVar.f5333y.setAccessibilityDelegate(new s(rVar));
            } else {
                rVar.c();
                int i7 = rVar.f5324n;
                if (i7 == 2) {
                    rVar.f5325o = 0;
                }
                rVar.i(i7, rVar.f5325o, rVar.h(rVar.f5333y, ""));
                rVar.g(rVar.f5333y, 1);
                rVar.f5333y = null;
                TextInputLayout textInputLayout = rVar.f5318h;
                textInputLayout.p();
                textInputLayout.v();
            }
            rVar.f5332x = z5;
        }
    }

    public void setHelperTextTextAppearance(int i6) {
        r rVar = this.f3413k;
        rVar.f5334z = i6;
        j0 j0Var = rVar.f5333y;
        if (j0Var != null) {
            j0Var.setTextAppearance(i6);
        }
    }

    public void setHint(int i6) {
        setHint(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.B) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z5) {
        this.f3433v0 = z5;
    }

    public void setHintEnabled(boolean z5) {
        if (z5 != this.B) {
            this.B = z5;
            if (z5) {
                CharSequence hint = this.f3401e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C)) {
                        setHint(hint);
                    }
                    this.f3401e.setHint((CharSequence) null);
                }
                this.D = true;
            } else {
                this.D = false;
                if (!TextUtils.isEmpty(this.C) && TextUtils.isEmpty(this.f3401e.getHint())) {
                    this.f3401e.setHint(this.C);
                }
                setHintInternal(null);
            }
            if (this.f3401e != null) {
                r();
            }
        }
    }

    public void setHintTextAppearance(int i6) {
        z2.c cVar = this.f3430t0;
        View view = cVar.f6934a;
        d3.d dVar = new d3.d(view.getContext(), i6);
        ColorStateList colorStateList = dVar.f3787j;
        if (colorStateList != null) {
            cVar.f6950k = colorStateList;
        }
        float f6 = dVar.f3788k;
        if (f6 != 0.0f) {
            cVar.f6948i = f6;
        }
        ColorStateList colorStateList2 = dVar.f3778a;
        if (colorStateList2 != null) {
            cVar.U = colorStateList2;
        }
        cVar.S = dVar.f3782e;
        cVar.T = dVar.f3783f;
        cVar.R = dVar.f3784g;
        cVar.V = dVar.f3786i;
        d3.a aVar = cVar.f6962y;
        if (aVar != null) {
            aVar.f3777e = true;
        }
        z2.b bVar = new z2.b(cVar);
        dVar.a();
        cVar.f6962y = new d3.a(bVar, dVar.f3791n);
        dVar.c(view.getContext(), cVar.f6962y);
        cVar.h(false);
        this.f3410i0 = cVar.f6950k;
        if (this.f3401e != null) {
            s(false, false);
            r();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3410i0 != colorStateList) {
            if (this.f3408h0 == null) {
                z2.c cVar = this.f3430t0;
                if (cVar.f6950k != colorStateList) {
                    cVar.f6950k = colorStateList;
                    cVar.h(false);
                }
            }
            this.f3410i0 = colorStateList;
            if (this.f3401e != null) {
                s(false, false);
            }
        }
    }

    public void setLengthCounter(f fVar) {
        this.f3421o = fVar;
    }

    public void setMaxEms(int i6) {
        this.f3407h = i6;
        EditText editText = this.f3401e;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxEms(i6);
    }

    public void setMaxWidth(int i6) {
        this.f3411j = i6;
        EditText editText = this.f3401e;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMaxWidth(i6);
    }

    public void setMaxWidthResource(int i6) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    public void setMinEms(int i6) {
        this.f3405g = i6;
        EditText editText = this.f3401e;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinEms(i6);
    }

    public void setMinWidth(int i6) {
        this.f3409i = i6;
        EditText editText = this.f3401e;
        if (editText == null || i6 == -1) {
            return;
        }
        editText.setMinWidth(i6);
    }

    public void setMinWidthResource(int i6) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i6));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i6) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3453h.setContentDescription(i6 != 0 ? aVar.getResources().getText(i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i6) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3453h.setImageDrawable(i6 != 0 ? e.a.a(aVar.getContext(), i6) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z5) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        if (z5 && aVar.f3455j != 1) {
            aVar.f(1);
        } else if (!z5) {
            aVar.f(0);
        } else {
            aVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3457l = colorStateList;
        m3.q.a(aVar.f3447b, aVar.f3453h, colorStateList, aVar.f3458m);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.f3458m = mode;
        m3.q.a(aVar.f3447b, aVar.f3453h, aVar.f3457l, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.u == null) {
            j0 j0Var = new j0(getContext(), null);
            this.u = j0Var;
            j0Var.setId(R.id.textinput_placeholder);
            j0 j0Var2 = this.u;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.s(j0Var2, 2);
            a1.d d6 = d();
            this.f3435x = d6;
            d6.f57c = 67L;
            this.f3437y = d();
            setPlaceholderTextAppearance(this.f3434w);
            setPlaceholderTextColor(this.f3432v);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3429t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.f3401e;
        if (editText != null) {
            editable = editText.getText();
        }
        t(editable);
    }

    public void setPlaceholderTextAppearance(int i6) {
        this.f3434w = i6;
        j0 j0Var = this.u;
        if (j0Var != null) {
            j0Var.setTextAppearance(i6);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3432v != colorStateList) {
            this.f3432v = colorStateList;
            j0 j0Var = this.u;
            if (j0Var == null || colorStateList == null) {
                return;
            }
            j0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        x xVar = this.f3397c;
        xVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        xVar.f5357d = charSequence2;
        xVar.f5356c.setText(charSequence);
        xVar.d();
    }

    public void setPrefixTextAppearance(int i6) {
        this.f3397c.f5356c.setTextAppearance(i6);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3397c.f5356c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(h3.i iVar) {
        h3.f fVar = this.E;
        if (fVar != null && fVar.f4446b.f4467a != iVar) {
            this.K = iVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z5) {
        this.f3397c.f5358e.setCheckable(z5);
    }

    public void setStartIconContentDescription(int i6) {
        setStartIconContentDescription(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3397c.f5358e;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i6) {
        setStartIconDrawable(i6 != 0 ? e.a.a(getContext(), i6) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3397c.a(drawable);
    }

    public void setStartIconMinSize(int i6) {
        x xVar = this.f3397c;
        if (i6 >= 0) {
            if (i6 != xVar.f5361h) {
                xVar.f5361h = i6;
                CheckableImageButton checkableImageButton = xVar.f5358e;
                checkableImageButton.setMinimumWidth(i6);
                checkableImageButton.setMinimumHeight(i6);
                return;
            }
            return;
        }
        xVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        x xVar = this.f3397c;
        View.OnLongClickListener onLongClickListener = xVar.f5363j;
        CheckableImageButton checkableImageButton = xVar.f5358e;
        checkableImageButton.setOnClickListener(onClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        x xVar = this.f3397c;
        xVar.f5363j = onLongClickListener;
        CheckableImageButton checkableImageButton = xVar.f5358e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m3.q.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        x xVar = this.f3397c;
        xVar.f5362i = scaleType;
        xVar.f5358e.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        x xVar = this.f3397c;
        if (xVar.f5359f != colorStateList) {
            xVar.f5359f = colorStateList;
            m3.q.a(xVar.f5355b, xVar.f5358e, colorStateList, xVar.f5360g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        x xVar = this.f3397c;
        if (xVar.f5360g != mode) {
            xVar.f5360g = mode;
            m3.q.a(xVar.f5355b, xVar.f5358e, xVar.f5359f, mode);
        }
    }

    public void setStartIconVisible(boolean z5) {
        this.f3397c.b(z5);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        com.google.android.material.textfield.a aVar = this.f3399d;
        aVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        aVar.f3462q = charSequence2;
        aVar.f3463r.setText(charSequence);
        aVar.m();
    }

    public void setSuffixTextAppearance(int i6) {
        this.f3399d.f3463r.setTextAppearance(i6);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3399d.f3463r.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f3401e;
        if (editText != null) {
            g0.l(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3394a0) {
            this.f3394a0 = typeface;
            this.f3430t0.m(typeface);
            r rVar = this.f3413k;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                j0 j0Var = rVar.f5328r;
                if (j0Var != null) {
                    j0Var.setTypeface(typeface);
                }
                j0 j0Var2 = rVar.f5333y;
                if (j0Var2 != null) {
                    j0Var2.setTypeface(typeface);
                }
            }
            j0 j0Var3 = this.f3423p;
            if (j0Var3 != null) {
                j0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(Editable editable) {
        int i6;
        ((a2.d) this.f3421o).getClass();
        if (editable != null) {
            i6 = editable.length();
        } else {
            i6 = 0;
        }
        FrameLayout frameLayout = this.f3395b;
        if (i6 == 0 && !this.f3428s0) {
            if (this.u != null && this.f3429t && !TextUtils.isEmpty(this.s)) {
                this.u.setText(this.s);
                a1.m.a(frameLayout, this.f3435x);
                this.u.setVisibility(0);
                this.u.bringToFront();
                announceForAccessibility(this.s);
                return;
            }
            return;
        }
        j0 j0Var = this.u;
        if (j0Var != null && this.f3429t) {
            j0Var.setText((CharSequence) null);
            a1.m.a(frameLayout, this.f3437y);
            this.u.setVisibility(4);
        }
    }

    public final void u(boolean z5, boolean z6) {
        int defaultColor = this.f3418m0.getDefaultColor();
        int colorForState = this.f3418m0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f3418m0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z5) {
            this.S = colorForState2;
        } else if (z6) {
            this.S = colorForState;
        } else {
            this.S = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.v():void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3399d.f3453h.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3399d.f3453h.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3399d.f3453h;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        com.google.android.material.textfield.a aVar = this.f3399d;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = aVar.f3457l;
            PorterDuff.Mode mode = aVar.f3458m;
            TextInputLayout textInputLayout = aVar.f3447b;
            m3.q.a(textInputLayout, checkableImageButton, colorStateList, mode);
            m3.q.c(textInputLayout, checkableImageButton, aVar.f3457l);
        }
    }
}
