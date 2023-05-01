package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.q;
import com.superstrong.android.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class i<S> extends a0<S> {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f3127j0 = 0;
    public int W;
    public com.google.android.material.datepicker.d<S> X;
    public com.google.android.material.datepicker.a Y;
    public f Z;

    /* renamed from: a0  reason: collision with root package name */
    public v f3128a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f3129b0;

    /* renamed from: c0  reason: collision with root package name */
    public com.google.android.material.datepicker.c f3130c0;

    /* renamed from: d0  reason: collision with root package name */
    public RecyclerView f3131d0;

    /* renamed from: e0  reason: collision with root package name */
    public RecyclerView f3132e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f3133f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f3134g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f3135h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f3136i0;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3137b;

        public a(int i6) {
            this.f3137b = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.f3132e0.c0(this.f3137b);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f0.a {
        @Override // f0.a
        public final void d(View view, g0.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* loaded from: classes.dex */
    public class c extends c0 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i6, int i7) {
            super(i6);
            this.E = i7;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(RecyclerView.x xVar, int[] iArr) {
            int i6 = this.E;
            i iVar = i.this;
            if (i6 == 0) {
                iArr[0] = iVar.f3132e0.getWidth();
                iArr[1] = iVar.f3132e0.getWidth();
                return;
            }
            iArr[0] = iVar.f3132e0.getHeight();
            iArr[1] = iVar.f3132e0.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public class d implements e {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    @Override // androidx.fragment.app.o
    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.Z);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3128a0);
    }

    @Override // com.google.android.material.datepicker.a0
    public final boolean P(q.d dVar) {
        return super.P(dVar);
    }

    public final void Q(int i6) {
        this.f3132e0.post(new a(i6));
    }

    public final void R(v vVar) {
        boolean z5;
        RecyclerView recyclerView;
        int i6;
        v vVar2 = ((y) this.f3132e0.getAdapter()).f3190c.f3084b;
        Calendar calendar = vVar2.f3173b;
        if (calendar instanceof GregorianCalendar) {
            int i7 = vVar.f3175d;
            int i8 = vVar2.f3175d;
            int i9 = vVar.f3174c;
            int i10 = vVar2.f3174c;
            int i11 = (i9 - i10) + ((i7 - i8) * 12);
            v vVar3 = this.f3128a0;
            if (calendar instanceof GregorianCalendar) {
                int i12 = i11 - ((vVar3.f3174c - i10) + ((vVar3.f3175d - i8) * 12));
                boolean z6 = true;
                if (Math.abs(i12) > 3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (i12 <= 0) {
                    z6 = false;
                }
                this.f3128a0 = vVar;
                if (z5 && z6) {
                    recyclerView = this.f3132e0;
                    i6 = i11 - 3;
                } else {
                    if (z5) {
                        recyclerView = this.f3132e0;
                        i6 = i11 + 3;
                    }
                    Q(i11);
                    return;
                }
                recyclerView.a0(i6);
                Q(i11);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void S(int i6) {
        this.f3129b0 = i6;
        if (i6 == 2) {
            this.f3131d0.getLayoutManager().p0(this.f3128a0.f3175d - ((g0) this.f3131d0.getAdapter()).f3123c.Y.f3084b.f3175d);
            this.f3135h0.setVisibility(0);
            this.f3136i0.setVisibility(8);
            this.f3133f0.setVisibility(8);
            this.f3134g0.setVisibility(8);
        } else if (i6 == 1) {
            this.f3135h0.setVisibility(8);
            this.f3136i0.setVisibility(0);
            this.f3133f0.setVisibility(0);
            this.f3134g0.setVisibility(0);
            R(this.f3128a0);
        }
    }

    @Override // androidx.fragment.app.o
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f1572g;
        }
        this.W = bundle.getInt("THEME_RES_ID_KEY");
        this.X = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.Y = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.Z = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f3128a0 = (v) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6;
        int i7;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(h(), this.W);
        this.f3130c0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        v vVar = this.Y.f3084b;
        if (q.U(contextThemeWrapper)) {
            i6 = R.layout.mtrl_calendar_vertical;
            i7 = 1;
        } else {
            i6 = R.layout.mtrl_calendar_horizontal;
            i7 = 0;
        }
        View inflate = cloneInContext.inflate(i6, viewGroup, false);
        Resources resources = L().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i8 = w.f3180h;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i8 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i8) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        f0.g0.l(gridView, new b());
        int i9 = this.Y.f3088f;
        if (i9 > 0) {
            gVar = new g(i9);
        } else {
            gVar = new g();
        }
        gridView.setAdapter((ListAdapter) gVar);
        gridView.setNumColumns(vVar.f3176e);
        gridView.setEnabled(false);
        this.f3132e0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        h();
        this.f3132e0.setLayoutManager(new c(i7, i7));
        this.f3132e0.setTag("MONTHS_VIEW_GROUP_TAG");
        y yVar = new y(contextThemeWrapper, this.X, this.Y, this.Z, new d());
        this.f3132e0.setAdapter(yVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3131d0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f3131d0.setLayoutManager(new GridLayoutManager(integer));
            this.f3131d0.setAdapter(new g0(this));
            this.f3131d0.g(new k(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            f0.g0.l(materialButton, new l(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f3133f0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f3134g0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f3135h0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3136i0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            S(1);
            materialButton.setText(this.f3128a0.n());
            this.f3132e0.h(new m(this, yVar, materialButton));
            materialButton.setOnClickListener(new n(this));
            this.f3134g0.setOnClickListener(new o(this, yVar));
            this.f3133f0.setOnClickListener(new h(this, yVar));
        }
        if (!q.U(contextThemeWrapper)) {
            new androidx.recyclerview.widget.u().a(this.f3132e0);
        }
        RecyclerView recyclerView2 = this.f3132e0;
        v vVar2 = this.f3128a0;
        v vVar3 = yVar.f3190c.f3084b;
        if (vVar3.f3173b instanceof GregorianCalendar) {
            recyclerView2.a0((vVar2.f3174c - vVar3.f3174c) + ((vVar2.f3175d - vVar3.f3175d) * 12));
            f0.g0.l(this.f3132e0, new j());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
