package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.k;
import androidx.activity.result.c;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.a;
import com.superstrong.android.R;
import d0.m;
import d3.d;
import f0.g0;
import f0.r0;
import g0.f;
import h2.g;
import h3.i;
import h3.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import z.a;
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements a.InterfaceC0022a, m, Checkable {

    /* renamed from: x  reason: collision with root package name */
    public static final Rect f3035x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3036y = {16842913};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f3037z = {16842911};

    /* renamed from: f  reason: collision with root package name */
    public com.google.android.material.chip.a f3038f;

    /* renamed from: g  reason: collision with root package name */
    public InsetDrawable f3039g;

    /* renamed from: h  reason: collision with root package name */
    public RippleDrawable f3040h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f3041i;

    /* renamed from: j  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f3042j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3043k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3044l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3045m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3046n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3047o;

    /* renamed from: p  reason: collision with root package name */
    public int f3048p;

    /* renamed from: q  reason: collision with root package name */
    public int f3049q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3050r;
    public final b s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3051t;
    public final Rect u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f3052v;

    /* renamed from: w  reason: collision with root package name */
    public final a f3053w;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // androidx.activity.result.c
        public final void w(int i6) {
        }

        @Override // androidx.activity.result.c
        public final void x(Typeface typeface, boolean z5) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f3038f;
            if (aVar.E0) {
                text = aVar.F;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends m0.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // m0.a
        public final void l(ArrayList arrayList) {
            boolean z5 = false;
            arrayList.add(0);
            Rect rect = Chip.f3035x;
            Chip chip = Chip.this;
            if (chip.d()) {
                com.google.android.material.chip.a aVar = chip.f3038f;
                if (aVar != null && aVar.L) {
                    z5 = true;
                }
                if (z5 && chip.f3041i != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // m0.a
        public final void o(int i6, f fVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
            String str = "";
            if (i6 == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                fVar.b(f.a.f4098e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f3035x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3052v;
        rectF.setEmpty();
        if (d() && this.f3041i != null) {
            com.google.android.material.chip.a aVar = this.f3038f;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.T()) {
                float f6 = aVar.f3060e0 + aVar.f3059d0 + aVar.P + aVar.f3058c0 + aVar.f3057b0;
                if (a.c.a(aVar) == 0) {
                    float f7 = bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f6;
                } else {
                    float f8 = bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f6;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.u;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3067l0.f6995f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z5) {
        if (this.f3045m != z5) {
            this.f3045m = z5;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z5) {
        if (this.f3044l != z5) {
            this.f3044l = z5;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0022a
    public final void a() {
        c(this.f3049q);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i6) {
        int i7;
        this.f3049q = i6;
        int i8 = 0;
        if (!this.f3047o) {
            InsetDrawable insetDrawable = this.f3039g;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f3039g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = e3.a.f3836a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = e3.a.f3836a;
            f();
            return;
        }
        int max = Math.max(0, i6 - ((int) this.f3038f.A));
        int max2 = Math.max(0, i6 - this.f3038f.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f3039g;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f3039g = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = e3.a.f3836a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = e3.a.f3836a;
            f();
            return;
        }
        if (max2 > 0) {
            i7 = max2 / 2;
        } else {
            i7 = 0;
        }
        if (max > 0) {
            i8 = max / 2;
        }
        int i9 = i8;
        if (this.f3039g != null) {
            Rect rect = new Rect();
            this.f3039g.getPadding(rect);
            if (rect.top == i9 && rect.bottom == i9 && rect.left == i7 && rect.right == i7) {
                int[] iArr5 = e3.a.f3836a;
                f();
                return;
            }
        }
        if (getMinHeight() != i6) {
            setMinHeight(i6);
        }
        if (getMinWidth() != i6) {
            setMinWidth(i6);
        }
        this.f3039g = new InsetDrawable((Drawable) this.f3038f, i7, i9, i7, i9);
        int[] iArr6 = e3.a.f3836a;
        f();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            Drawable drawable = aVar.M;
            if (drawable != null) {
                if (drawable instanceof z.b) {
                    drawable = ((z.b) drawable).b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f3051t
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            com.google.android.material.chip.Chip$b r0 = r10.s
            android.view.accessibility.AccessibilityManager r1 = r0.f5208h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.794E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f5213m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f5213m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r9 = r8.d()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f5213m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f5213m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3051t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.s;
        bVar.getClass();
        boolean z5 = false;
        int i6 = 0;
        z5 = false;
        z5 = false;
        z5 = false;
        z5 = false;
        z5 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i7 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i7 = 130;
                                        }
                                    } else {
                                        i7 = 17;
                                    }
                                } else {
                                    i7 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z6 = false;
                                while (i6 < repeatCount && bVar.m(i7, null)) {
                                    i6++;
                                    z6 = true;
                                }
                                z5 = z6;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i8 = bVar.f5212l;
                    if (i8 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i8 == 0) {
                            chip.performClick();
                        } else if (i8 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3041i;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f3051t) {
                                chip.s.q(1, 1);
                            }
                        }
                    }
                    z5 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z5 = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z5 = bVar.m(1, null);
            }
        }
        if (z5 && bVar.f5212l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i6;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f3038f;
        boolean z5 = false;
        if (aVar != null && com.google.android.material.chip.a.u(aVar.M)) {
            com.google.android.material.chip.a aVar2 = this.f3038f;
            ?? isEnabled = isEnabled();
            int i7 = isEnabled;
            if (this.f3046n) {
                i7 = isEnabled + 1;
            }
            int i8 = i7;
            if (this.f3045m) {
                i8 = i7 + 1;
            }
            int i9 = i8;
            if (this.f3044l) {
                i9 = i8 + 1;
            }
            int i10 = i9;
            if (isChecked()) {
                i10 = i9 + 1;
            }
            int[] iArr = new int[i10];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (this.f3046n) {
                iArr[i6] = 16842908;
                i6++;
            }
            if (this.f3045m) {
                iArr[i6] = 16843623;
                i6++;
            }
            if (this.f3044l) {
                iArr[i6] = 16842919;
                i6++;
            }
            if (isChecked()) {
                iArr[i6] = 16842913;
            }
            if (!Arrays.equals(aVar2.f3081z0, iArr)) {
                aVar2.f3081z0 = iArr;
                if (aVar2.T()) {
                    z5 = aVar2.w(aVar2.getState(), iArr);
                }
            }
        }
        if (z5) {
            invalidate();
        }
    }

    public final void e() {
        boolean z5;
        boolean z6 = false;
        if (d()) {
            com.google.android.material.chip.a aVar = this.f3038f;
            if (aVar != null && aVar.L) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && this.f3041i != null) {
                g0.l(this, this.s);
                z6 = true;
                this.f3051t = z6;
            }
        }
        g0.l(this, null);
        this.f3051t = z6;
    }

    public final void f() {
        this.f3040h = new RippleDrawable(e3.a.c(this.f3038f.E), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar.A0) {
            aVar.A0 = false;
            aVar.B0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f3040h;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.d.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f3038f) != null) {
            int r5 = (int) (aVar.r() + aVar.f3060e0 + aVar.f3057b0);
            com.google.android.material.chip.a aVar2 = this.f3038f;
            int q5 = (int) (aVar2.q() + aVar2.X + aVar2.f3056a0);
            if (this.f3039g != null) {
                Rect rect = new Rect();
                this.f3039g.getPadding(rect);
                q5 += rect.left;
                r5 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.e.k(this, q5, paddingTop, r5, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z5;
        if (!TextUtils.isEmpty(this.f3050r)) {
            return this.f3050r;
        }
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.R) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            ViewParent parent = getParent();
            if (!(parent instanceof r2.c)) {
                return "android.widget.Button";
            }
            ((r2.c) parent).getClass();
            throw null;
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3039g;
        return insetDrawable == null ? this.f3038f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.T;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.U;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3080z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3038f;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3060e0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar == null || (drawable = aVar.H) == null) {
            return null;
        }
        if (drawable instanceof z.b) {
            drawable = ((z.b) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.J;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.I;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar == null || (drawable = aVar.M) == null) {
            return null;
        }
        if (drawable instanceof z.b) {
            drawable = ((z.b) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3059d0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.P;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3058c0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.O;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.D0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3051t) {
            b bVar = this.s;
            if (bVar.f5212l == 1 || bVar.f5211k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.E;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f3038f.f4446b.f4467a;
    }

    public g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3057b0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            return aVar.f3056a0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f3053w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.p(this, this.f3038f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        boolean z5;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3036y);
        }
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.R) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            View.mergeDrawableStates(onCreateDrawableState, f3037z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        super.onFocusChanged(z5, i6, rect);
        if (this.f3051t) {
            b bVar = this.s;
            int i7 = bVar.f5212l;
            if (i7 != Integer.MIN_VALUE) {
                bVar.j(i7);
            }
            if (z5) {
                bVar.m(i6, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z5;
        int i6;
        boolean z6;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.R) {
            z5 = true;
        } else {
            z5 = false;
        }
        accessibilityNodeInfo.setCheckable(z5);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof r2.c) {
            r2.c cVar = (r2.c) getParent();
            int i7 = -1;
            if (cVar.f6968d) {
                i6 = 0;
                for (int i8 = 0; i8 < cVar.getChildCount(); i8++) {
                    View childAt = cVar.getChildAt(i8);
                    if (childAt instanceof Chip) {
                        if (cVar.getChildAt(i8).getVisibility() == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            i6 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i7 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f.c.a(i7, 1, i6, 1, isChecked()).f4111a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i6) {
        super.onRtlPropertiesChanged(i6);
        if (this.f3048p != i6) {
            this.f3048p = i6;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f3044l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f3044l
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f3041i
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f3051t
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.s
            r0.q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3050r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3040h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3040h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i6) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z5) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.x(z5);
        }
    }

    public void setCheckableResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.x(aVar.f3061f0.getResources().getBoolean(i6));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar == null) {
            this.f3043k = z5;
        } else if (aVar.R) {
            super.setChecked(z5);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z5) {
        setCheckedIconVisible(z5);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i6) {
        setCheckedIconVisible(i6);
    }

    public void setCheckedIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.y(e.a.a(aVar.f3061f0, i6));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.z(w.a.a(aVar.f3061f0, i6));
        }
    }

    public void setCheckedIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.A(aVar.f3061f0.getResources().getBoolean(i6));
        }
    }

    public void setCheckedIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.A(z5);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.f3080z != colorStateList) {
            aVar.f3080z = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i6) {
        ColorStateList a6;
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.f3080z != (a6 = w.a.a(aVar.f3061f0, i6))) {
            aVar.f3080z = a6;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.B(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.B(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f3038f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.C0 = new WeakReference<>(null);
            }
            this.f3038f = aVar;
            aVar.E0 = false;
            aVar.C0 = new WeakReference<>(this);
            c(this.f3049q);
        }
    }

    public void setChipEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.f3060e0 != f6) {
            aVar.f3060e0 = f6;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float dimension = aVar.f3061f0.getResources().getDimension(i6);
            if (aVar.f3060e0 != dimension) {
                aVar.f3060e0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z5) {
        setChipIconVisible(z5);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i6) {
        setChipIconVisible(i6);
    }

    public void setChipIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.C(e.a.a(aVar.f3061f0, i6));
        }
    }

    public void setChipIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.D(f6);
        }
    }

    public void setChipIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.D(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.E(w.a.a(aVar.f3061f0, i6));
        }
    }

    public void setChipIconVisible(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.F(aVar.f3061f0.getResources().getBoolean(i6));
        }
    }

    public void setChipIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.F(z5);
        }
    }

    public void setChipMinHeight(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.A != f6) {
            aVar.A = f6;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipMinHeightResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float dimension = aVar.f3061f0.getResources().getDimension(i6);
            if (aVar.A != dimension) {
                aVar.A = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.X != f6) {
            aVar.X = f6;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setChipStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float dimension = aVar.f3061f0.getResources().getDimension(i6);
            if (aVar.X != dimension) {
                aVar.X = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.G(w.a.a(aVar.f3061f0, i6));
        }
    }

    public void setChipStrokeWidth(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.H(f6);
        }
    }

    public void setChipStrokeWidthResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.H(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i6) {
        setText(getResources().getString(i6));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.I(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        d0.a aVar;
        com.google.android.material.chip.a aVar2 = this.f3038f;
        if (aVar2 != null && aVar2.Q != charSequence) {
            String str = d0.a.f3723d;
            Locale locale = Locale.getDefault();
            int i6 = d0.m.f3746a;
            boolean z5 = true;
            if (m.a.a(locale) != 1) {
                z5 = false;
            }
            if (z5) {
                aVar = d0.a.f3726g;
            } else {
                aVar = d0.a.f3725f;
            }
            aVar2.Q = aVar.c(charSequence, aVar.f3729c);
            aVar2.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z5) {
        setCloseIconVisible(z5);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i6) {
        setCloseIconVisible(i6);
    }

    public void setCloseIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.J(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.J(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.I(e.a.a(aVar.f3061f0, i6));
        }
        e();
    }

    public void setCloseIconSize(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.K(f6);
        }
    }

    public void setCloseIconSizeResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.K(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.L(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.L(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.M(w.a.a(aVar.f3061f0, i6));
        }
    }

    public void setCloseIconVisible(int i6) {
        setCloseIconVisible(getResources().getBoolean(i6));
    }

    public void setCloseIconVisible(boolean z5) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.N(z5);
        }
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i6, int i7, int i8, int i9) {
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i8 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i6, i7, i8, i9);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.j(f6);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3038f == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f3038f;
            if (aVar != null) {
                aVar.D0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z5) {
        this.f3047o = z5;
        c(this.f3049q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i6) {
        if (i6 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i6);
        }
    }

    public void setHideMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.W = gVar;
        }
    }

    public void setHideMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.W = g.a(aVar.f3061f0, i6);
        }
    }

    public void setIconEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.O(f6);
        }
    }

    public void setIconEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.O(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setIconStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.P(f6);
        }
    }

    public void setIconStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.P(aVar.f3061f0.getResources().getDimension(i6));
        }
    }

    public void setInternalOnCheckedChangeListener(z2.g<Chip> gVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
        if (this.f3038f == null) {
            return;
        }
        super.setLayoutDirection(i6);
    }

    @Override // android.widget.TextView
    public void setLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i6);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i6) {
        super.setMaxWidth(i6);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.F0 = i6;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i6) {
        if (i6 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i6);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3042j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3041i = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.Q(colorStateList);
        }
        if (!this.f3038f.A0) {
            f();
        }
    }

    public void setRippleColorResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.Q(w.a.a(aVar.f3061f0, i6));
            if (!this.f3038f.A0) {
                f();
            }
        }
    }

    @Override // h3.m
    public void setShapeAppearanceModel(i iVar) {
        this.f3038f.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.V = gVar;
        }
    }

    public void setShowMotionSpecResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.V = g.a(aVar.f3061f0, i6);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z5) {
        if (!z5) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z5);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.E0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f3038f;
        if (aVar2 != null && !TextUtils.equals(aVar2.F, charSequence)) {
            aVar2.F = charSequence;
            aVar2.f3067l0.f6993d = true;
            aVar2.invalidateSelf();
            aVar2.v();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i6) {
        super.setTextAppearance(i6);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            Context context = aVar.f3061f0;
            aVar.f3067l0.b(new d(context, i6), context);
        }
        h();
    }

    public void setTextAppearanceResource(int i6) {
        setTextAppearance(getContext(), i6);
    }

    public void setTextEndPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.f3057b0 != f6) {
            aVar.f3057b0 = f6;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextEndPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float dimension = aVar.f3061f0.getResources().getDimension(i6);
            if (aVar.f3057b0 != dimension) {
                aVar.f3057b0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i6, float f6) {
        super.setTextSize(i6, f6);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float applyDimension = TypedValue.applyDimension(i6, f6, getResources().getDisplayMetrics());
            z2.k kVar = aVar.f3067l0;
            d dVar = kVar.f6995f;
            if (dVar != null) {
                dVar.f3788k = applyDimension;
                kVar.f6990a.setTextSize(applyDimension);
                aVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null && aVar.f3056a0 != f6) {
            aVar.f3056a0 = f6;
            aVar.invalidateSelf();
            aVar.v();
        }
    }

    public void setTextStartPaddingResource(int i6) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            float dimension = aVar.f3061f0.getResources().getDimension(i6);
            if (aVar.f3056a0 != dimension) {
                aVar.f3056a0 = dimension;
                aVar.invalidateSelf();
                aVar.v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            Context context2 = aVar.f3061f0;
            aVar.f3067l0.b(new d(context2, i6), context2);
        }
        h();
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f3038f;
        if (aVar != null) {
            aVar.f3067l0.b(dVar, aVar.f3061f0);
        }
        h();
    }
}
