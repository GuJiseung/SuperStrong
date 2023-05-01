package m3;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class g extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f5276e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5277f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f5278g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeInterpolator f5279h;

    /* renamed from: i  reason: collision with root package name */
    public EditText f5280i;

    /* renamed from: j  reason: collision with root package name */
    public final c f5281j;

    /* renamed from: k  reason: collision with root package name */
    public final d f5282k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f5283l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f5284m;

    public g(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f5281j = new c(0, this);
        this.f5282k = new d(this, 0);
        this.f5276e = a3.a.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f5277f = a3.a.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f5278g = a3.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, h2.a.f4422a);
        this.f5279h = a3.a.d(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, h2.a.f4425d);
    }

    @Override // m3.p
    public final void a() {
        if (this.f5308b.f3462q != null) {
            return;
        }
        t(u());
    }

    @Override // m3.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // m3.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // m3.p
    public final View.OnFocusChangeListener e() {
        return this.f5282k;
    }

    @Override // m3.p
    public final View.OnClickListener f() {
        return this.f5281j;
    }

    @Override // m3.p
    public final View.OnFocusChangeListener g() {
        return this.f5282k;
    }

    @Override // m3.p
    public final void m(EditText editText) {
        this.f5280i = editText;
        this.f5307a.setEndIconVisible(u());
    }

    @Override // m3.p
    public final void p(boolean z5) {
        if (this.f5308b.f3462q == null) {
            return;
        }
        t(z5);
    }

    @Override // m3.p
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f5279h);
        ofFloat.setDuration(this.f5277f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m3.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = gVar.f5310d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5278g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i6 = this.f5276e;
        ofFloat2.setDuration(i6);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m3.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                gVar.f5310d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5283l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f5283l.addListener(new e(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i6);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m3.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g gVar = g.this;
                gVar.getClass();
                gVar.f5310d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f5284m = ofFloat3;
        ofFloat3.addListener(new f(this));
    }

    @Override // m3.p
    public final void s() {
        EditText editText = this.f5280i;
        if (editText != null) {
            editText.post(new androidx.activity.b(5, this));
        }
    }

    public final void t(boolean z5) {
        boolean z6 = this.f5308b.c() == z5;
        if (z5 && !this.f5283l.isRunning()) {
            this.f5284m.cancel();
            this.f5283l.start();
            if (z6) {
                this.f5283l.end();
            }
        } else if (z5) {
        } else {
            this.f5283l.cancel();
            this.f5284m.start();
            if (z6) {
                this.f5284m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f5280i;
        return editText != null && (editText.hasFocus() || this.f5310d.hasFocus()) && this.f5280i.getText().length() > 0;
    }
}
