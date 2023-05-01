package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.j0;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a  reason: collision with root package name */
    public final int f5311a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5312b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5313c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f5314d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f5315e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f5316f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f5317g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f5318h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f5319i;

    /* renamed from: j  reason: collision with root package name */
    public int f5320j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f5321k;

    /* renamed from: l  reason: collision with root package name */
    public Animator f5322l;

    /* renamed from: m  reason: collision with root package name */
    public final float f5323m;

    /* renamed from: n  reason: collision with root package name */
    public int f5324n;

    /* renamed from: o  reason: collision with root package name */
    public int f5325o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f5326p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5327q;

    /* renamed from: r  reason: collision with root package name */
    public j0 f5328r;
    public CharSequence s;

    /* renamed from: t  reason: collision with root package name */
    public int f5329t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f5330v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f5331w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5332x;

    /* renamed from: y  reason: collision with root package name */
    public j0 f5333y;

    /* renamed from: z  reason: collision with root package name */
    public int f5334z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f5335a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f5336b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f5337c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f5338d;

        public a(int i6, TextView textView, int i7, TextView textView2) {
            this.f5335a = i6;
            this.f5336b = textView;
            this.f5337c = i7;
            this.f5338d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            j0 j0Var;
            int i6 = this.f5335a;
            r rVar = r.this;
            rVar.f5324n = i6;
            rVar.f5322l = null;
            TextView textView = this.f5336b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f5337c == 1 && (j0Var = rVar.f5328r) != null) {
                    j0Var.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f5338d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f5338d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5317g = context;
        this.f5318h = textInputLayout;
        this.f5323m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5311a = a3.a.c(context, R.attr.motionDurationShort4, 217);
        this.f5312b = a3.a.c(context, R.attr.motionDurationMedium4, 167);
        this.f5313c = a3.a.c(context, R.attr.motionDurationShort4, 167);
        this.f5314d = a3.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, h2.a.f4425d);
        LinearInterpolator linearInterpolator = h2.a.f4422a;
        this.f5315e = a3.a.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5316f = a3.a.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i6) {
        if (this.f5319i == null && this.f5321k == null) {
            Context context = this.f5317g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5319i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5319i;
            TextInputLayout textInputLayout = this.f5318h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5321k = new FrameLayout(context);
            this.f5319i.addView(this.f5321k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i6 == 0 || i6 == 1) {
            this.f5321k.setVisibility(0);
            this.f5321k.addView(textView);
        } else {
            this.f5319i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5319i.setVisibility(0);
        this.f5320j++;
    }

    public final void b() {
        boolean z5;
        LinearLayout linearLayout = this.f5319i;
        TextInputLayout textInputLayout = this.f5318h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f5317g;
            boolean d6 = d3.c.d(context);
            LinearLayout linearLayout2 = this.f5319i;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            int f6 = g0.e.f(editText);
            if (d6) {
                f6 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (d6) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e6 = g0.e.e(editText);
            if (d6) {
                e6 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            g0.e.k(linearLayout2, f6, dimensionPixelSize, e6, 0);
        }
    }

    public final void c() {
        Animator animator = this.f5322l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z5, TextView textView, int i6, int i7, int i8) {
        boolean z6;
        boolean z7;
        float f6;
        int i9;
        TimeInterpolator timeInterpolator;
        boolean z8;
        if (textView != null && z5) {
            if (i6 != i8 && i6 != i7) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                if (i8 == i6) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f6);
                int i10 = this.f5313c;
                if (z7) {
                    i9 = this.f5312b;
                } else {
                    i9 = i10;
                }
                ofFloat.setDuration(i9);
                if (z7) {
                    timeInterpolator = this.f5315e;
                } else {
                    timeInterpolator = this.f5316f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i6 == i8 && i7 != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    ofFloat.setStartDelay(i10);
                }
                arrayList.add(ofFloat);
                if (i8 == i6 && i7 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f5323m, 0.0f);
                    ofFloat2.setDuration(this.f5311a);
                    ofFloat2.setInterpolator(this.f5314d);
                    ofFloat2.setStartDelay(i10);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i6) {
        if (i6 != 1) {
            if (i6 != 2) {
                return null;
            }
            return this.f5333y;
        }
        return this.f5328r;
    }

    public final void f() {
        this.f5326p = null;
        c();
        if (this.f5324n == 1) {
            this.f5325o = (!this.f5332x || TextUtils.isEmpty(this.f5331w)) ? 0 : 2;
        }
        i(this.f5324n, this.f5325o, h(this.f5328r, ""));
    }

    public final void g(TextView textView, int i6) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f5319i;
        if (viewGroup2 == null) {
            return;
        }
        boolean z5 = true;
        if (i6 != 0 && i6 != 1) {
            z5 = false;
        }
        if (z5 && (viewGroup = this.f5321k) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i7 = this.f5320j - 1;
        this.f5320j = i7;
        LinearLayout linearLayout = this.f5319i;
        if (i7 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        TextInputLayout textInputLayout = this.f5318h;
        if (g0.g.c(textInputLayout) && textInputLayout.isEnabled() && (this.f5325o != this.f5324n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i6, int i7, boolean z5) {
        TextView e6;
        TextView e7;
        if (i6 == i7) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5322l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f5332x, this.f5333y, 2, i6, i7);
            d(arrayList, this.f5327q, this.f5328r, 1, i6, i7);
            c.a.q(animatorSet, arrayList);
            animatorSet.addListener(new a(i7, e(i6), i6, e(i7)));
            animatorSet.start();
        } else if (i6 != i7) {
            if (i7 != 0 && (e7 = e(i7)) != null) {
                e7.setVisibility(0);
                e7.setAlpha(1.0f);
            }
            if (i6 != 0 && (e6 = e(i6)) != null) {
                e6.setVisibility(4);
                if (i6 == 1) {
                    e6.setText((CharSequence) null);
                }
            }
            this.f5324n = i7;
        }
        TextInputLayout textInputLayout = this.f5318h;
        textInputLayout.p();
        textInputLayout.s(z5, false);
        textInputLayout.v();
    }
}
