package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.j;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m3.g;
import m3.h;
import m3.o;
import m3.p;
import m3.v;
import m3.w;
import z2.m;
import z2.q;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f3447b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f3448c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f3449d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f3450e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f3451f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnLongClickListener f3452g;

    /* renamed from: h  reason: collision with root package name */
    public final CheckableImageButton f3453h;

    /* renamed from: i  reason: collision with root package name */
    public final d f3454i;

    /* renamed from: j  reason: collision with root package name */
    public int f3455j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.h> f3456k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3457l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3458m;

    /* renamed from: n  reason: collision with root package name */
    public int f3459n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView.ScaleType f3460o;

    /* renamed from: p  reason: collision with root package name */
    public View.OnLongClickListener f3461p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3462q;

    /* renamed from: r  reason: collision with root package name */
    public final j0 f3463r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public EditText f3464t;
    public final AccessibilityManager u;

    /* renamed from: v  reason: collision with root package name */
    public g0.d f3465v;

    /* renamed from: w  reason: collision with root package name */
    public final C0029a f3466w;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0029a extends m {
        public C0029a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // z2.m, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            a.this.b().b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            if (aVar.f3464t == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.f3464t;
            C0029a c0029a = aVar.f3466w;
            if (editText != null) {
                editText.removeTextChangedListener(c0029a);
                if (aVar.f3464t.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.f3464t.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.f3464t = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0029a);
            }
            aVar.b().m(aVar.f3464t);
            aVar.i(aVar.b());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            if (aVar.f3465v != null && (accessibilityManager = aVar.u) != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.g.b(aVar)) {
                    g0.c.a(accessibilityManager, aVar.f3465v);
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            g0.d dVar = aVar.f3465v;
            if (dVar != null && (accessibilityManager = aVar.u) != null) {
                g0.c.b(accessibilityManager, dVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<p> f3470a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public final a f3471b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3472c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3473d;

        public d(a aVar, j1 j1Var) {
            this.f3471b = aVar;
            this.f3472c = j1Var.i(26, 0);
            this.f3473d = j1Var.i(50, 0);
        }
    }

    public a(TextInputLayout textInputLayout, j1 j1Var) {
        super(textInputLayout.getContext());
        CharSequence k5;
        this.f3455j = 0;
        this.f3456k = new LinkedHashSet<>();
        this.f3466w = new C0029a();
        b bVar = new b();
        this.u = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3447b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3448c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a6 = a(this, from, R.id.text_input_error_icon);
        this.f3449d = a6;
        CheckableImageButton a7 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f3453h = a7;
        this.f3454i = new d(this, j1Var);
        j0 j0Var = new j0(getContext(), null);
        this.f3463r = j0Var;
        if (j1Var.l(36)) {
            this.f3450e = d3.c.b(getContext(), j1Var, 36);
        }
        if (j1Var.l(37)) {
            this.f3451f = q.d(j1Var.h(37, -1), null);
        }
        if (j1Var.l(35)) {
            h(j1Var.e(35));
        }
        a6.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.s(a6, 2);
        a6.setClickable(false);
        a6.setPressable(false);
        a6.setFocusable(false);
        if (!j1Var.l(51)) {
            if (j1Var.l(30)) {
                this.f3457l = d3.c.b(getContext(), j1Var, 30);
            }
            if (j1Var.l(31)) {
                this.f3458m = q.d(j1Var.h(31, -1), null);
            }
        }
        if (j1Var.l(28)) {
            f(j1Var.h(28, 0));
            if (j1Var.l(25) && a7.getContentDescription() != (k5 = j1Var.k(25))) {
                a7.setContentDescription(k5);
            }
            a7.setCheckable(j1Var.a(24, true));
        } else if (j1Var.l(51)) {
            if (j1Var.l(52)) {
                this.f3457l = d3.c.b(getContext(), j1Var, 52);
            }
            if (j1Var.l(53)) {
                this.f3458m = q.d(j1Var.h(53, -1), null);
            }
            f(j1Var.a(51, false) ? 1 : 0);
            CharSequence k6 = j1Var.k(49);
            if (a7.getContentDescription() != k6) {
                a7.setContentDescription(k6);
            }
        }
        int d6 = j1Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d6 >= 0) {
            if (d6 != this.f3459n) {
                this.f3459n = d6;
                a7.setMinimumWidth(d6);
                a7.setMinimumHeight(d6);
                a6.setMinimumWidth(d6);
                a6.setMinimumHeight(d6);
            }
            if (j1Var.l(29)) {
                ImageView.ScaleType b6 = m3.q.b(j1Var.h(29, -1));
                this.f3460o = b6;
                a7.setScaleType(b6);
                a6.setScaleType(b6);
            }
            j0Var.setVisibility(8);
            j0Var.setId(R.id.textinput_suffix_text);
            j0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            g0.g.f(j0Var, 1);
            j0Var.setTextAppearance(j1Var.i(70, 0));
            if (j1Var.l(71)) {
                j0Var.setTextColor(j1Var.b(71));
            }
            CharSequence k7 = j1Var.k(69);
            this.f3462q = TextUtils.isEmpty(k7) ? null : k7;
            j0Var.setText(k7);
            m();
            frameLayout.addView(a7);
            addView(j0Var);
            addView(frameLayout);
            addView(a6);
            textInputLayout.f3400d0.add(bVar);
            if (textInputLayout.f3401e != null) {
                bVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new c());
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i6) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i6);
        if (d3.c.d(getContext())) {
            f0.m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final p b() {
        p hVar;
        int i6 = this.f3455j;
        d dVar = this.f3454i;
        SparseArray<p> sparseArray = dVar.f3470a;
        p pVar = sparseArray.get(i6);
        if (pVar == null) {
            a aVar = dVar.f3471b;
            if (i6 != -1) {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                hVar = new o(aVar);
                            } else {
                                throw new IllegalArgumentException(j.a("Invalid end icon mode: ", i6));
                            }
                        } else {
                            hVar = new g(aVar);
                        }
                    } else {
                        pVar = new w(aVar, dVar.f3473d);
                        sparseArray.append(i6, pVar);
                    }
                } else {
                    hVar = new v(aVar);
                }
            } else {
                hVar = new h(aVar);
            }
            pVar = hVar;
            sparseArray.append(i6, pVar);
        }
        return pVar;
    }

    public final boolean c() {
        return this.f3448c.getVisibility() == 0 && this.f3453h.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f3449d.getVisibility() == 0;
    }

    public final void e(boolean z5) {
        boolean z6;
        boolean isActivated;
        boolean isChecked;
        p b6 = b();
        boolean k5 = b6.k();
        CheckableImageButton checkableImageButton = this.f3453h;
        boolean z7 = true;
        if (k5 && (isChecked = checkableImageButton.isChecked()) != b6.l()) {
            checkableImageButton.setChecked(!isChecked);
            z6 = true;
        } else {
            z6 = false;
        }
        if ((b6 instanceof o) && (isActivated = checkableImageButton.isActivated()) != b6.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z7 = z6;
        }
        if (z5 || z7) {
            m3.q.c(this.f3447b, checkableImageButton, this.f3457l);
        }
    }

    public final void f(int i6) {
        boolean z5;
        Drawable drawable;
        if (this.f3455j == i6) {
            return;
        }
        p b6 = b();
        g0.d dVar = this.f3465v;
        AccessibilityManager accessibilityManager = this.u;
        if (dVar != null && accessibilityManager != null) {
            g0.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.f3465v = null;
        b6.s();
        this.f3455j = i6;
        Iterator<TextInputLayout.h> it = this.f3456k.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        if (i6 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        g(z5);
        p b7 = b();
        int i7 = this.f3454i.f3472c;
        if (i7 == 0) {
            i7 = b7.d();
        }
        if (i7 != 0) {
            drawable = e.a.a(getContext(), i7);
        } else {
            drawable = null;
        }
        CheckableImageButton checkableImageButton = this.f3453h;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f3447b;
        if (drawable != null) {
            m3.q.a(textInputLayout, checkableImageButton, this.f3457l, this.f3458m);
            m3.q.c(textInputLayout, checkableImageButton, this.f3457l);
        }
        int c6 = b7.c();
        if (c6 != 0) {
            charSequence = getResources().getText(c6);
        }
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
        checkableImageButton.setCheckable(b7.k());
        if (b7.i(textInputLayout.getBoxBackgroundMode())) {
            b7.r();
            g0.d h6 = b7.h();
            this.f3465v = h6;
            if (h6 != null && accessibilityManager != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                if (g0.g.b(this)) {
                    g0.c.a(accessibilityManager, this.f3465v);
                }
            }
            View.OnClickListener f6 = b7.f();
            View.OnLongClickListener onLongClickListener = this.f3461p;
            checkableImageButton.setOnClickListener(f6);
            m3.q.d(checkableImageButton, onLongClickListener);
            EditText editText = this.f3464t;
            if (editText != null) {
                b7.m(editText);
                i(b7);
            }
            m3.q.a(textInputLayout, checkableImageButton, this.f3457l, this.f3458m);
            e(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i6);
    }

    public final void g(boolean z5) {
        if (c() != z5) {
            this.f3453h.setVisibility(z5 ? 0 : 8);
            j();
            l();
            this.f3447b.o();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f3449d;
        checkableImageButton.setImageDrawable(drawable);
        k();
        m3.q.a(this.f3447b, checkableImageButton, this.f3450e, this.f3451f);
    }

    public final void i(p pVar) {
        if (this.f3464t == null) {
            return;
        }
        if (pVar.e() != null) {
            this.f3464t.setOnFocusChangeListener(pVar.e());
        }
        if (pVar.g() != null) {
            this.f3453h.setOnFocusChangeListener(pVar.g());
        }
    }

    public final void j() {
        this.f3448c.setVisibility((this.f3453h.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility(c() || d() || !((this.f3462q == null || this.s) ? true : false) ? 0 : 8);
    }

    public final void k() {
        boolean z5;
        int i6;
        CheckableImageButton checkableImageButton = this.f3449d;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z6 = true;
        TextInputLayout textInputLayout = this.f3447b;
        if (drawable != null && textInputLayout.f3413k.f5327q && textInputLayout.l()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        checkableImageButton.setVisibility(i6);
        j();
        l();
        if (this.f3455j == 0) {
            z6 = false;
        }
        if (!z6) {
            textInputLayout.o();
        }
    }

    public final void l() {
        int i6;
        TextInputLayout textInputLayout = this.f3447b;
        if (textInputLayout.f3401e == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f3401e;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            i6 = g0.e.e(editText);
        } else {
            i6 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f3401e.getPaddingTop();
        int paddingBottom = textInputLayout.f3401e.getPaddingBottom();
        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
        g0.e.k(this.f3463r, dimensionPixelSize, paddingTop, i6, paddingBottom);
    }

    public final void m() {
        j0 j0Var = this.f3463r;
        int visibility = j0Var.getVisibility();
        int i6 = (this.f3462q == null || this.s) ? 8 : 0;
        if (visibility != i6) {
            b().p(i6 == 0);
        }
        j();
        j0Var.setVisibility(i6);
        this.f3447b.o();
    }
}
