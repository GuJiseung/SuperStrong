package q2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.j1;
import b1.d;
import b1.e;
import com.superstrong.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.f;
import z.a;
import z2.n;
import z2.q;
/* loaded from: classes.dex */
public final class a extends AppCompatCheckBox {

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<c> f5808f;

    /* renamed from: g  reason: collision with root package name */
    public final LinkedHashSet<b> f5809g;

    /* renamed from: h  reason: collision with root package name */
    public ColorStateList f5810h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5811i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5812j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5813k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f5814l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f5815m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f5816n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5817o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f5818p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f5819q;

    /* renamed from: r  reason: collision with root package name */
    public PorterDuff.Mode f5820r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f5821t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f5822v;

    /* renamed from: w  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5823w;

    /* renamed from: x  reason: collision with root package name */
    public final b1.d f5824x;

    /* renamed from: y  reason: collision with root package name */
    public final C0081a f5825y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f5807z = {R.attr.state_indeterminate};
    public static final int[] A = {R.attr.state_error};
    public static final int[][] B = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})
    public static final int C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: q2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0081a extends b1.c {
        public C0081a() {
        }

        @Override // b1.c
        public final void a(Drawable drawable) {
            ColorStateList colorStateList = a.this.f5818p;
            if (colorStateList != null) {
                a.b.h(drawable, colorStateList);
            }
        }

        @Override // b1.c
        public final void b(Drawable drawable) {
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f5818p;
            if (colorStateList != null) {
                a.b.g(drawable, colorStateList.getColorForState(aVar.f5821t, colorStateList.getDefaultColor()));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new C0082a();

        /* renamed from: b  reason: collision with root package name */
        public int f5827b;

        /* renamed from: q2.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0082a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f5827b = ((Integer) parcel.readValue(d.class.getClassLoader())).intValue();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i6 = this.f5827b;
            if (i6 != 1) {
                if (i6 != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeValue(Integer.valueOf(this.f5827b));
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.checkboxStyle, 2131952628), attributeSet, R.attr.checkboxStyle);
        boolean z5;
        this.f5808f = new LinkedHashSet<>();
        this.f5809g = new LinkedHashSet<>();
        Context context2 = getContext();
        b1.d dVar = new b1.d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = f.f6627a;
        Drawable a6 = f.a.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        dVar.f2288b = a6;
        a6.setCallback(dVar.f2280g);
        new d.c(dVar.f2288b.getConstantState());
        this.f5824x = dVar;
        this.f5825y = new C0081a();
        Context context3 = getContext();
        this.f5815m = j0.c.a(this);
        this.f5818p = getSuperButtonTintList();
        setSupportButtonTintList(null);
        j1 e6 = n.e(context3, attributeSet, c.b.R, R.attr.checkboxStyle, 2131952628, new int[0]);
        this.f5816n = e6.e(2);
        if (this.f5815m != null && d3.b.b(context3, R.attr.isMaterial3Theme, false)) {
            int i6 = e6.i(0, 0);
            int i7 = e6.i(1, 0);
            if (i6 == C && i7 == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                super.setButtonDrawable((Drawable) null);
                this.f5815m = e.a.a(context3, R.drawable.mtrl_checkbox_button);
                this.f5817o = true;
                if (this.f5816n == null) {
                    this.f5816n = e.a.a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f5819q = d3.c.b(context3, e6, 3);
        this.f5820r = q.d(e6.h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f5811i = e6.a(10, false);
        this.f5812j = e6.a(6, true);
        this.f5813k = e6.a(9, false);
        this.f5814l = e6.k(8);
        if (e6.l(7)) {
            setCheckedState(e6.h(7, 0));
        }
        e6.n();
        b();
    }

    private String getButtonStateDescription() {
        Resources resources;
        int i6;
        int i7 = this.s;
        if (i7 == 1) {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_checked;
        } else if (i7 == 0) {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i6 = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i6);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5810h == null) {
            int m5 = c.a.m(this, R.attr.colorControlActivated);
            int m6 = c.a.m(this, R.attr.colorError);
            int m7 = c.a.m(this, R.attr.colorSurface);
            int m8 = c.a.m(this, R.attr.colorOnSurface);
            this.f5810h = new ColorStateList(B, new int[]{c.a.p(1.0f, m7, m6), c.a.p(1.0f, m7, m5), c.a.p(0.54f, m7, m8), c.a.p(0.38f, m7, m8), c.a.p(0.38f, m7, m8)});
        }
        return this.f5810h;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f5818p;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void b() {
        int intrinsicHeight;
        int i6;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        e eVar;
        Drawable drawable = this.f5815m;
        ColorStateList colorStateList3 = this.f5818p;
        PorterDuff.Mode b6 = j0.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b6 != null) {
                a.b.i(drawable, b6);
            }
        }
        this.f5815m = drawable;
        Drawable drawable2 = this.f5816n;
        ColorStateList colorStateList4 = this.f5819q;
        PorterDuff.Mode mode = this.f5820r;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                a.b.i(drawable2, mode);
            }
        }
        this.f5816n = drawable2;
        if (this.f5817o) {
            b1.d dVar = this.f5824x;
            if (dVar != null) {
                Drawable drawable3 = dVar.f2288b;
                C0081a c0081a = this.f5825y;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0081a.f2275a == null) {
                        c0081a.f2275a = new b1.b(c0081a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0081a.f2275a);
                }
                ArrayList<b1.c> arrayList = dVar.f2279f;
                d.b bVar = dVar.f2276c;
                if (arrayList != null && c0081a != null) {
                    arrayList.remove(c0081a);
                    if (dVar.f2279f.size() == 0 && (eVar = dVar.f2278e) != null) {
                        bVar.f2283b.removeListener(eVar);
                        dVar.f2278e = null;
                    }
                }
                Drawable drawable4 = dVar.f2288b;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0081a.f2275a == null) {
                        c0081a.f2275a = new b1.b(c0081a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0081a.f2275a);
                } else if (c0081a != null) {
                    if (dVar.f2279f == null) {
                        dVar.f2279f = new ArrayList<>();
                    }
                    if (!dVar.f2279f.contains(c0081a)) {
                        dVar.f2279f.add(c0081a);
                        if (dVar.f2278e == null) {
                            dVar.f2278e = new e(dVar);
                        }
                        bVar.f2283b.addListener(dVar.f2278e);
                    }
                }
            }
            Drawable drawable5 = this.f5815m;
            if ((drawable5 instanceof AnimatedStateListDrawable) && dVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, dVar, false);
                ((AnimatedStateListDrawable) this.f5815m).addTransition(R.id.indeterminate, R.id.unchecked, dVar, false);
            }
        }
        Drawable drawable6 = this.f5815m;
        if (drawable6 != null && (colorStateList2 = this.f5818p) != null) {
            a.b.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f5816n;
        if (drawable7 != null && (colorStateList = this.f5819q) != null) {
            a.b.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f5815m;
        Drawable drawable9 = this.f5816n;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() != -1 && drawable9.getIntrinsicHeight() != -1) {
                if (drawable9.getIntrinsicWidth() <= drawable8.getIntrinsicWidth() && drawable9.getIntrinsicHeight() <= drawable8.getIntrinsicHeight()) {
                    i6 = drawable9.getIntrinsicWidth();
                    intrinsicHeight = drawable9.getIntrinsicHeight();
                } else {
                    float intrinsicWidth = drawable9.getIntrinsicWidth() / drawable9.getIntrinsicHeight();
                    if (intrinsicWidth >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                        i6 = drawable8.getIntrinsicWidth();
                        intrinsicHeight = (int) (i6 / intrinsicWidth);
                    } else {
                        intrinsicHeight = drawable8.getIntrinsicHeight();
                        i6 = (int) (intrinsicWidth * intrinsicHeight);
                    }
                }
            } else {
                int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
                i6 = intrinsicWidth2;
            }
            layerDrawable.setLayerSize(1, i6, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f5815m;
    }

    public Drawable getButtonIconDrawable() {
        return this.f5816n;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f5819q;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f5820r;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f5818p;
    }

    public int getCheckedState() {
        return this.s;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f5814l;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.s == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5811i && this.f5818p == null && this.f5819q == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f5807z);
        }
        if (this.f5813k) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        int i7 = 0;
        while (true) {
            if (i7 < onCreateDrawableState.length) {
                int i8 = onCreateDrawableState[i7];
                if (i8 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i8 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i7] = 16842912;
                    break;
                } else {
                    i7++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f5821t = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a6;
        int i6;
        if (this.f5812j && TextUtils.isEmpty(getText()) && (a6 = j0.c.a(this)) != null) {
            if (q.c(this)) {
                i6 = -1;
            } else {
                i6 = 1;
            }
            int width = ((getWidth() - a6.getIntrinsicWidth()) / 2) * i6;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a6.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f5813k) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f5814l));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setCheckedState(dVar.f5827b);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f5827b = getCheckedState();
        return dVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i6) {
        setButtonDrawable(e.a.a(getContext(), i6));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f5815m = drawable;
        this.f5817o = false;
        b();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f5816n = drawable;
        b();
    }

    public void setButtonIconDrawableResource(int i6) {
        setButtonIconDrawable(e.a.a(getContext(), i6));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f5819q == colorStateList) {
            return;
        }
        this.f5819q = colorStateList;
        b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f5820r == mode) {
            return;
        }
        this.f5820r = mode;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f5818p == colorStateList) {
            return;
        }
        this.f5818p = colorStateList;
        b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        b();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.f5812j = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i6) {
        boolean z5;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.s != i6) {
            this.s = i6;
            if (i6 == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            super.setChecked(z5);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f5822v == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet<b> linkedHashSet = this.f5809g;
            if (linkedHashSet != null) {
                Iterator<b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            if (this.s != 2 && (onCheckedChangeListener = this.f5823w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f5814l = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i6) {
        setErrorAccessibilityLabel(i6 != 0 ? getResources().getText(i6) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.f5813k == z5) {
            return;
        }
        this.f5813k = z5;
        refreshDrawableState();
        Iterator<c> it = this.f5808f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5823w = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f5822v = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z5) {
        ColorStateList colorStateList;
        this.f5811i = z5;
        if (z5) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        j0.b.c(this, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
