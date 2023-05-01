package m3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.v0;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.Locale;
import java.util.WeakHashMap;
import z.a;
/* loaded from: classes.dex */
public final class u extends androidx.appcompat.widget.d {

    /* renamed from: f  reason: collision with root package name */
    public final v0 f5342f;

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager f5343g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f5344h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5345i;

    /* renamed from: j  reason: collision with root package name */
    public final float f5346j;

    /* renamed from: k  reason: collision with root package name */
    public int f5347k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5348l;

    /* loaded from: classes.dex */
    public class a<T> extends ArrayAdapter<String> {

        /* renamed from: b  reason: collision with root package name */
        public ColorStateList f5349b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f5350c;

        public a(Context context, int i6, String[] strArr) {
            super(context, i6, strArr);
            b();
        }

        public final void b() {
            boolean z5;
            ColorStateList colorStateList;
            boolean z6;
            boolean z7;
            u uVar = u.this;
            ColorStateList colorStateList2 = uVar.f5348l;
            if (colorStateList2 != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z5) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f5350c = colorStateList;
            if (uVar.f5347k != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                if (uVar.f5348l != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{y.a.b(uVar.f5348l.getColorForState(iArr3, 0), uVar.f5347k), y.a.b(uVar.f5348l.getColorForState(iArr2, 0), uVar.f5347k), uVar.f5347k});
                }
            }
            this.f5349b = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            boolean z5;
            View view2 = super.getView(i6, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                u uVar = u.this;
                RippleDrawable rippleDrawable = null;
                if (uVar.getText().toString().contentEquals(textView.getText())) {
                    if (uVar.f5347k != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        ColorDrawable colorDrawable = new ColorDrawable(uVar.f5347k);
                        if (this.f5350c != null) {
                            a.b.h(colorDrawable, this.f5349b);
                            rippleDrawable = new RippleDrawable(this.f5350c, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public u(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f5344h = new Rect();
        Context context2 = getContext();
        TypedArray d6 = z2.n.d(context2, attributeSet, c.b.M, R.attr.autoCompleteTextViewStyle, 2131952348, new int[0]);
        if (d6.hasValue(0) && d6.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f5345i = d6.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f5346j = d6.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f5347k = d6.getColor(3, 0);
        this.f5348l = d3.c.a(context2, d6, 4);
        this.f5343g = (AccessibilityManager) context2.getSystemService("accessibility");
        v0 v0Var = new v0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f5342f = v0Var;
        v0Var.f976z = true;
        androidx.appcompat.widget.q qVar = v0Var.A;
        qVar.setFocusable(true);
        v0Var.f968p = this;
        qVar.setInputMethodMode(2);
        v0Var.p(getAdapter());
        v0Var.f969q = new t(this);
        if (d6.hasValue(5)) {
            setSimpleItems(d6.getResourceId(5, 0));
        }
        d6.recycle();
    }

    public static void a(u uVar, Object obj) {
        uVar.setText(uVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z5;
        AccessibilityManager accessibilityManager = this.f5343g;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f5342f.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b6 = b();
        if (b6 != null && b6.D) {
            return b6.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f5346j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f5347k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f5348l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b6 = b();
        if (b6 != null && b6.D && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5342f.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        int selectedItemPosition;
        super.onMeasure(i6, i7);
        if (View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b6 = b();
            int i8 = 0;
            if (adapter != null && b6 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                v0 v0Var = this.f5342f;
                if (!v0Var.b()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = v0Var.f956d.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i9 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i8) {
                        view = null;
                        i8 = itemViewType;
                    }
                    view = adapter.getView(max, view, b6);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i9 = Math.max(i9, view.getMeasuredWidth());
                }
                Drawable f6 = v0Var.f();
                if (f6 != null) {
                    Rect rect = this.f5344h;
                    f6.getPadding(rect);
                    i9 += rect.left + rect.right;
                }
                i8 = b6.getEndIconView().getMeasuredWidth() + i9;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i8), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        boolean z6;
        AccessibilityManager accessibilityManager = this.f5343g;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return;
        }
        super.onWindowFocusChanged(z5);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f5342f.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        v0 v0Var = this.f5342f;
        if (v0Var != null) {
            v0Var.i(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f5342f.f970r = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i6) {
        super.setRawInputType(i6);
        TextInputLayout b6 = b();
        if (b6 != null) {
            b6.q();
        }
    }

    public void setSimpleItemSelectedColor(int i6) {
        this.f5347k = i6;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f5348l = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i6) {
        setSimpleItems(getResources().getStringArray(i6));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f5345i, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z5;
        AccessibilityManager accessibilityManager = this.f5343g;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f5342f.d();
        } else {
            super.showDropDown();
        }
    }
}
