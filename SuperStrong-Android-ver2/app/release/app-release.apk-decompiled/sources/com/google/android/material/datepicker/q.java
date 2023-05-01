package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.r0;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.superstrong.android.R;
import f0.e1;
import f0.f1;
import f0.g0;
import f0.g1;
import f0.u0;
import f0.w0;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class q<S> extends androidx.fragment.app.n {
    public static final /* synthetic */ int K0 = 0;
    public int A0;
    public CharSequence B0;
    public TextView C0;
    public TextView D0;
    public CheckableImageButton E0;
    public h3.f F0;
    public Button G0;
    public boolean H0;
    public CharSequence I0;
    public CharSequence J0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet<t<? super S>> f3150k0 = new LinkedHashSet<>();

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f3151l0 = new LinkedHashSet<>();

    /* renamed from: m0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f3152m0 = new LinkedHashSet<>();

    /* renamed from: n0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f3153n0 = new LinkedHashSet<>();

    /* renamed from: o0  reason: collision with root package name */
    public int f3154o0;

    /* renamed from: p0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f3155p0;

    /* renamed from: q0  reason: collision with root package name */
    public a0<S> f3156q0;
    public com.google.android.material.datepicker.a r0;

    /* renamed from: s0  reason: collision with root package name */
    public f f3157s0;

    /* renamed from: t0  reason: collision with root package name */
    public i<S> f3158t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f3159u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f3160v0;
    public boolean w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f3161x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f3162y0;

    /* renamed from: z0  reason: collision with root package name */
    public CharSequence f3163z0;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q qVar = q.this;
            Iterator<t<? super S>> it = qVar.f3150k0.iterator();
            while (it.hasNext()) {
                qVar.S().i();
                it.next().a();
            }
            qVar.P(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f0.a {
        public b() {
        }

        @Override // f0.a
        public final void d(View view, g0.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            int i6 = q.K0;
            sb.append(q.this.S().l());
            sb.append(", ");
            sb.append((Object) fVar.e());
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            q qVar = q.this;
            Iterator<View.OnClickListener> it = qVar.f3151l0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            qVar.P(false, false);
        }
    }

    /* loaded from: classes.dex */
    public class d extends z<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.z
        public final void a(S s) {
            q qVar = q.this;
            com.google.android.material.datepicker.d<S> S = qVar.S();
            qVar.h();
            String b6 = S.b();
            TextView textView = qVar.D0;
            com.google.android.material.datepicker.d<S> S2 = qVar.S();
            qVar.L();
            textView.setContentDescription(S2.g());
            qVar.D0.setText(b6);
            qVar.G0.setEnabled(qVar.S().f());
        }
    }

    public static int T(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c6 = e0.c();
        c6.set(5, 1);
        Calendar b6 = e0.b(c6);
        b6.get(2);
        b6.get(1);
        int maximum = b6.getMaximum(7);
        b6.getActualMaximum(5);
        b6.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean U(Context context) {
        return V(context, 16843277);
    }

    public static boolean V(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d3.b.c(context, R.attr.materialCalendarStyle, i.class.getCanonicalName()).data, new int[]{i6});
        boolean z5 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z5;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void E(Bundle bundle) {
        v m5;
        super.E(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3154o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f3155p0);
        a.b bVar = new a.b(this.r0);
        v vVar = this.f3158t0.f3128a0;
        if (vVar != null) {
            bVar.f3095c = Long.valueOf(vVar.f3178g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f3097e);
        v m6 = v.m(bVar.f3093a);
        v m7 = v.m(bVar.f3094b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l5 = bVar.f3095c;
        if (l5 == null) {
            m5 = null;
        } else {
            m5 = v.m(l5.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new com.google.android.material.datepicker.a(m6, m7, cVar, m5, bVar.f3096d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f3157s0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3159u0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3160v0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3162y0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3163z0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.A0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.B0);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void F() {
        Integer num;
        boolean z5;
        int i6;
        boolean z6;
        r0 e1Var;
        r0 e1Var2;
        super.F();
        Window window = R().getWindow();
        if (this.w0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.F0);
            if (!this.H0) {
                View findViewById = M().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i7 = Build.VERSION.SDK_INT;
                boolean z7 = false;
                if (num != null && num.intValue() != 0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                int l5 = c.a.l(window.getContext(), 16842801, -16777216);
                if (z5) {
                    num = Integer.valueOf(l5);
                }
                Integer valueOf = Integer.valueOf(l5);
                if (i7 >= 30) {
                    w0.a(window, false);
                } else {
                    u0.a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i7 < 27) {
                    i6 = y.a.c(c.a.l(context, 16843858, -16777216), 128);
                } else {
                    i6 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i6);
                boolean n5 = c.a.n(num.intValue());
                if (!c.a.n(0) && !n5) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                window.getDecorView();
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 30) {
                    e1Var = new g1(window);
                } else if (i8 >= 26) {
                    e1Var = new f1(window);
                } else {
                    e1Var = new e1(window);
                }
                e1Var.g(z6);
                boolean n6 = c.a.n(valueOf.intValue());
                if (c.a.n(i6) || (i6 == 0 && n6)) {
                    z7 = true;
                }
                window.getDecorView();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    e1Var2 = new g1(window);
                } else if (i9 >= 26) {
                    e1Var2 = new f1(window);
                } else {
                    e1Var2 = new e1(window);
                }
                e1Var2.f(z7);
                r rVar = new r(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                g0.i.u(findViewById, rVar);
                this.H0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = L().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new u2.a(R(), rect));
        }
        W();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void G() {
        this.f3156q0.V.clear();
        super.G();
    }

    @Override // androidx.fragment.app.n
    public final Dialog Q() {
        Context L = L();
        L();
        int i6 = this.f3154o0;
        if (i6 == 0) {
            i6 = S().c();
        }
        Dialog dialog = new Dialog(L, i6);
        Context context = dialog.getContext();
        this.w0 = U(context);
        int i7 = d3.b.c(context, R.attr.colorSurface, q.class.getCanonicalName()).data;
        h3.f fVar = new h3.f(context, null, R.attr.materialCalendarStyle, 2131952637);
        this.F0 = fVar;
        fVar.i(context);
        this.F0.k(ColorStateList.valueOf(i7));
        h3.f fVar2 = this.F0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        fVar2.j(g0.i.i(decorView));
        return dialog;
    }

    public final com.google.android.material.datepicker.d<S> S() {
        if (this.f3155p0 == null) {
            this.f3155p0 = (com.google.android.material.datepicker.d) this.f1572g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f3155p0;
    }

    public final void W() {
        a0<S> a0Var;
        CharSequence charSequence;
        boolean z5;
        L();
        int i6 = this.f3154o0;
        if (i6 == 0) {
            i6 = S().c();
        }
        com.google.android.material.datepicker.d<S> S = S();
        com.google.android.material.datepicker.a aVar = this.r0;
        f fVar = this.f3157s0;
        i<S> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("GRID_SELECTOR_KEY", S);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", fVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f3087e);
        iVar.O(bundle);
        this.f3158t0 = iVar;
        boolean isChecked = this.E0.isChecked();
        if (isChecked) {
            com.google.android.material.datepicker.d<S> S2 = S();
            com.google.android.material.datepicker.a aVar2 = this.r0;
            a0Var = new u<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i6);
            bundle2.putParcelable("DATE_SELECTOR_KEY", S2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            a0Var.O(bundle2);
        } else {
            a0Var = this.f3158t0;
        }
        this.f3156q0 = a0Var;
        TextView textView = this.C0;
        if (isChecked) {
            if (L().getResources().getConfiguration().orientation == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                charSequence = this.J0;
                textView.setText(charSequence);
                com.google.android.material.datepicker.d<S> S3 = S();
                h();
                String b6 = S3.b();
                TextView textView2 = this.D0;
                com.google.android.material.datepicker.d<S> S4 = S();
                L();
                textView2.setContentDescription(S4.g());
                this.D0.setText(b6);
                androidx.fragment.app.a0 g2 = g();
                g2.getClass();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(g2);
                aVar3.f(R.id.mtrl_calendar_frame, this.f3156q0, null, 2);
                aVar3.e();
                this.f3156q0.P(new d());
            }
        }
        charSequence = this.I0;
        textView.setText(charSequence);
        com.google.android.material.datepicker.d<S> S32 = S();
        h();
        String b62 = S32.b();
        TextView textView22 = this.D0;
        com.google.android.material.datepicker.d<S> S42 = S();
        L();
        textView22.setContentDescription(S42.g());
        this.D0.setText(b62);
        androidx.fragment.app.a0 g22 = g();
        g22.getClass();
        androidx.fragment.app.a aVar32 = new androidx.fragment.app.a(g22);
        aVar32.f(R.id.mtrl_calendar_frame, this.f3156q0, null, 2);
        aVar32.e();
        this.f3156q0.P(new d());
    }

    public final void X(CheckableImageButton checkableImageButton) {
        this.E0.setContentDescription(checkableImageButton.getContext().getString(this.E0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f3152m0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f3153n0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f1572g;
        }
        this.f3154o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f3155p0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.r0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f3157s0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f3159u0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3160v0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3161x0 = bundle.getInt("INPUT_MODE_KEY");
        this.f3162y0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3163z0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.A0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.B0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f3160v0;
        if (charSequence == null) {
            charSequence = L().getResources().getText(this.f3159u0);
        }
        this.I0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.J0 = charSequence;
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z5;
        if (this.w0) {
            i6 = R.layout.mtrl_picker_fullscreen;
        } else {
            i6 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i6, viewGroup);
        Context context = inflate.getContext();
        f fVar = this.f3157s0;
        if (fVar != null) {
            fVar.getClass();
        }
        if (this.w0) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(T(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(T(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.D0 = textView;
        WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
        g0.g.f(textView, 1);
        this.E0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.C0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.E0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.E0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.E0;
        if (this.f3161x0 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        checkableImageButton2.setChecked(z5);
        f0.g0.l(this.E0, null);
        X(this.E0);
        this.E0.setOnClickListener(new s(this));
        this.G0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (S().f()) {
            this.G0.setEnabled(true);
        } else {
            this.G0.setEnabled(false);
        }
        this.G0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.f3163z0;
        if (charSequence != null) {
            this.G0.setText(charSequence);
        } else {
            int i7 = this.f3162y0;
            if (i7 != 0) {
                this.G0.setText(i7);
            }
        }
        this.G0.setOnClickListener(new a());
        f0.g0.l(this.G0, new b());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence2 = this.B0;
        if (charSequence2 != null) {
            button.setText(charSequence2);
        } else {
            int i8 = this.A0;
            if (i8 != 0) {
                button.setText(i8);
            }
        }
        button.setOnClickListener(new c());
        return inflate;
    }
}
