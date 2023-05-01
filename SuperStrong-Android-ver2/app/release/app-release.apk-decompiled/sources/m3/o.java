package m3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.widget.k1;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: e  reason: collision with root package name */
    public final int f5293e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5294f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f5295g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f5296h;

    /* renamed from: i  reason: collision with root package name */
    public final c f5297i;

    /* renamed from: j  reason: collision with root package name */
    public final d f5298j;

    /* renamed from: k  reason: collision with root package name */
    public final j f5299k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5300l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5301m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5302n;

    /* renamed from: o  reason: collision with root package name */
    public long f5303o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f5304p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f5305q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f5306r;

    public o(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f5297i = new c(1, this);
        this.f5298j = new d(this, 1);
        this.f5299k = new j(0, this);
        this.f5303o = Long.MAX_VALUE;
        this.f5294f = a3.a.c(aVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f5293e = a3.a.c(aVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f5295g = a3.a.d(aVar.getContext(), R.attr.motionEasingLinearInterpolator, h2.a.f4422a);
    }

    @Override // m3.p
    public final void a() {
        boolean z5;
        if (this.f5304p.isTouchExplorationEnabled()) {
            if (this.f5296h.getInputType() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && !this.f5310d.hasFocus()) {
                this.f5296h.dismissDropDown();
            }
        }
        this.f5296h.post(new k1(4, this));
    }

    @Override // m3.p
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // m3.p
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // m3.p
    public final View.OnFocusChangeListener e() {
        return this.f5298j;
    }

    @Override // m3.p
    public final View.OnClickListener f() {
        return this.f5297i;
    }

    @Override // m3.p
    public final g0.d h() {
        return this.f5299k;
    }

    @Override // m3.p
    public final boolean i(int i6) {
        return i6 != 0;
    }

    @Override // m3.p
    public final boolean j() {
        return this.f5300l;
    }

    @Override // m3.p
    public final boolean l() {
        return this.f5302n;
    }

    @Override // m3.p
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f5296h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: m3.l
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z5;
                    o oVar = o.this;
                    oVar.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - oVar.f5303o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            oVar.f5301m = false;
                        }
                        oVar.u();
                        oVar.f5301m = true;
                        oVar.f5303o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f5296h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: m3.m
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    o oVar = o.this;
                    oVar.f5301m = true;
                    oVar.f5303o = System.currentTimeMillis();
                    oVar.t(false);
                }
            });
            boolean z5 = false;
            this.f5296h.setThreshold(0);
            TextInputLayout textInputLayout = this.f5307a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z5 = true;
            }
            if (!z5 && this.f5304p.isTouchExplorationEnabled()) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.s(this.f5310d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // m3.p
    public final void n(g0.f fVar) {
        boolean z5;
        boolean z6 = true;
        if (this.f5296h.getInputType() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
        if (!z5) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z6 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z6 = false;
            }
        }
        if (z6) {
            fVar.h(null);
        }
    }

    @Override // m3.p
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z5;
        if (accessibilityEvent.getEventType() == 1 && this.f5304p.isEnabled()) {
            if (this.f5296h.getInputType() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                u();
                this.f5301m = true;
                this.f5303o = System.currentTimeMillis();
            }
        }
    }

    @Override // m3.p
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5295g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f5294f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m3.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o oVar = o.this;
                oVar.getClass();
                oVar.f5310d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f5306r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f5293e);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m3.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o oVar = o.this;
                oVar.getClass();
                oVar.f5310d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f5305q = ofFloat2;
        ofFloat2.addListener(new n(this));
        this.f5304p = (AccessibilityManager) this.f5309c.getSystemService("accessibility");
    }

    @Override // m3.p
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f5296h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f5296h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z5) {
        if (this.f5302n != z5) {
            this.f5302n = z5;
            this.f5306r.cancel();
            this.f5305q.start();
        }
    }

    public final void u() {
        boolean z5;
        if (this.f5296h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f5303o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            this.f5301m = false;
        }
        if (!this.f5301m) {
            t(!this.f5302n);
            if (this.f5302n) {
                this.f5296h.requestFocus();
                this.f5296h.showDropDown();
                return;
            }
            this.f5296h.dismissDropDown();
            return;
        }
        this.f5301m = false;
    }
}
