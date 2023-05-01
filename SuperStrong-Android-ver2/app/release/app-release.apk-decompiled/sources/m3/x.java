package m3;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.j1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class x extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f5355b;

    /* renamed from: c  reason: collision with root package name */
    public final j0 f5356c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f5357d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckableImageButton f5358e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f5359f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f5360g;

    /* renamed from: h  reason: collision with root package name */
    public int f5361h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView.ScaleType f5362i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnLongClickListener f5363j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5364k;

    public x(TextInputLayout textInputLayout, j1 j1Var) {
        super(textInputLayout.getContext());
        CharSequence k5;
        this.f5355b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f5358e = checkableImageButton;
        j0 j0Var = new j0(getContext(), null);
        this.f5356c = j0Var;
        if (d3.c.d(getContext())) {
            f0.m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f5363j;
        checkableImageButton.setOnClickListener(null);
        q.d(checkableImageButton, onLongClickListener);
        this.f5363j = null;
        checkableImageButton.setOnLongClickListener(null);
        q.d(checkableImageButton, null);
        if (j1Var.l(67)) {
            this.f5359f = d3.c.b(getContext(), j1Var, 67);
        }
        if (j1Var.l(68)) {
            this.f5360g = z2.q.d(j1Var.h(68, -1), null);
        }
        if (j1Var.l(64)) {
            a(j1Var.e(64));
            if (j1Var.l(63) && checkableImageButton.getContentDescription() != (k5 = j1Var.k(63))) {
                checkableImageButton.setContentDescription(k5);
            }
            checkableImageButton.setCheckable(j1Var.a(62, true));
        }
        int d6 = j1Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d6 >= 0) {
            if (d6 != this.f5361h) {
                this.f5361h = d6;
                checkableImageButton.setMinimumWidth(d6);
                checkableImageButton.setMinimumHeight(d6);
            }
            if (j1Var.l(66)) {
                ImageView.ScaleType b6 = q.b(j1Var.h(66, -1));
                this.f5362i = b6;
                checkableImageButton.setScaleType(b6);
            }
            j0Var.setVisibility(8);
            j0Var.setId(R.id.textinput_prefix_text);
            j0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.g.f(j0Var, 1);
            j0Var.setTextAppearance(j1Var.i(58, 0));
            if (j1Var.l(59)) {
                j0Var.setTextColor(j1Var.b(59));
            }
            CharSequence k6 = j1Var.k(57);
            this.f5357d = TextUtils.isEmpty(k6) ? null : k6;
            j0Var.setText(k6);
            d();
            addView(checkableImageButton);
            addView(j0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5358e;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f5359f;
            PorterDuff.Mode mode = this.f5360g;
            TextInputLayout textInputLayout = this.f5355b;
            q.a(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            q.c(textInputLayout, checkableImageButton, this.f5359f);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f5363j;
        checkableImageButton.setOnClickListener(null);
        q.d(checkableImageButton, onLongClickListener);
        this.f5363j = null;
        checkableImageButton.setOnLongClickListener(null);
        q.d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z5) {
        boolean z6;
        CheckableImageButton checkableImageButton = this.f5358e;
        int i6 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6 != z5) {
            if (!z5) {
                i6 = 8;
            }
            checkableImageButton.setVisibility(i6);
            c();
            d();
        }
    }

    public final void c() {
        boolean z5;
        EditText editText = this.f5355b.f3401e;
        if (editText == null) {
            return;
        }
        int i6 = 0;
        if (this.f5358e.getVisibility() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            i6 = g0.e.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
        g0.e.k(this.f5356c, i6, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i6 = (this.f5357d == null || this.f5364k) ? 8 : 0;
        setVisibility(this.f5358e.getVisibility() == 0 || i6 == 0 ? 0 : 8);
        this.f5356c.setVisibility(i6);
        this.f5355b.o();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        c();
    }
}
