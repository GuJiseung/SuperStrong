package d;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0;
import com.superstrong.android.R;
import d.a;
import d.g;
import f0.g0;
import f0.r0;
import f0.t0;
import g.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class w extends d.a implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f3692a;

    /* renamed from: b  reason: collision with root package name */
    public Context f3693b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f3694c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f3695d;

    /* renamed from: e  reason: collision with root package name */
    public o0 f3696e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f3697f;

    /* renamed from: g  reason: collision with root package name */
    public final View f3698g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3699h;

    /* renamed from: i  reason: collision with root package name */
    public d f3700i;

    /* renamed from: j  reason: collision with root package name */
    public d f3701j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0039a f3702k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3703l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<a.b> f3704m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3705n;

    /* renamed from: o  reason: collision with root package name */
    public int f3706o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3707p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3708q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3709r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public g.g f3710t;
    public boolean u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3711v;

    /* renamed from: w  reason: collision with root package name */
    public final a f3712w;

    /* renamed from: x  reason: collision with root package name */
    public final b f3713x;

    /* renamed from: y  reason: collision with root package name */
    public final c f3714y;

    /* renamed from: z  reason: collision with root package name */
    public static final AccelerateInterpolator f3691z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends c.a {
        public a() {
        }

        @Override // f0.s0
        public final void a() {
            View view;
            w wVar = w.this;
            if (wVar.f3707p && (view = wVar.f3698g) != null) {
                view.setTranslationY(0.0f);
                wVar.f3695d.setTranslationY(0.0f);
            }
            wVar.f3695d.setVisibility(8);
            wVar.f3695d.setTransitioning(false);
            wVar.f3710t = null;
            a.InterfaceC0039a interfaceC0039a = wVar.f3702k;
            if (interfaceC0039a != null) {
                interfaceC0039a.d(wVar.f3701j);
                wVar.f3701j = null;
                wVar.f3702k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = wVar.f3694c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.h.c(actionBarOverlayLayout);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.a {
        public b() {
        }

        @Override // f0.s0
        public final void a() {
            w wVar = w.this;
            wVar.f3710t = null;
            wVar.f3695d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements t0 {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends g.a implements f.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f3718d;

        /* renamed from: e  reason: collision with root package name */
        public final androidx.appcompat.view.menu.f f3719e;

        /* renamed from: f  reason: collision with root package name */
        public a.InterfaceC0039a f3720f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f3721g;

        public d(Context context, g.c cVar) {
            this.f3718d = context;
            this.f3720f = cVar;
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            fVar.f437l = 1;
            this.f3719e = fVar;
            fVar.f430e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            a.InterfaceC0039a interfaceC0039a = this.f3720f;
            if (interfaceC0039a != null) {
                return interfaceC0039a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            if (this.f3720f == null) {
                return;
            }
            i();
            androidx.appcompat.widget.c cVar = w.this.f3697f.f676e;
            if (cVar != null) {
                cVar.n();
            }
        }

        @Override // g.a
        public final void c() {
            w wVar = w.this;
            if (wVar.f3700i != this) {
                return;
            }
            if (!(!wVar.f3708q)) {
                wVar.f3701j = this;
                wVar.f3702k = this.f3720f;
            } else {
                this.f3720f.d(this);
            }
            this.f3720f = null;
            wVar.a(false);
            ActionBarContextView actionBarContextView = wVar.f3697f;
            if (actionBarContextView.f522l == null) {
                actionBarContextView.h();
            }
            wVar.f3694c.setHideOnContentScrollEnabled(wVar.f3711v);
            wVar.f3700i = null;
        }

        @Override // g.a
        public final View d() {
            WeakReference<View> weakReference = this.f3721g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // g.a
        public final androidx.appcompat.view.menu.f e() {
            return this.f3719e;
        }

        @Override // g.a
        public final MenuInflater f() {
            return new g.f(this.f3718d);
        }

        @Override // g.a
        public final CharSequence g() {
            return w.this.f3697f.getSubtitle();
        }

        @Override // g.a
        public final CharSequence h() {
            return w.this.f3697f.getTitle();
        }

        @Override // g.a
        public final void i() {
            if (w.this.f3700i != this) {
                return;
            }
            androidx.appcompat.view.menu.f fVar = this.f3719e;
            fVar.w();
            try {
                this.f3720f.c(this, fVar);
            } finally {
                fVar.v();
            }
        }

        @Override // g.a
        public final boolean j() {
            return w.this.f3697f.f529t;
        }

        @Override // g.a
        public final void k(View view) {
            w.this.f3697f.setCustomView(view);
            this.f3721g = new WeakReference<>(view);
        }

        @Override // g.a
        public final void l(int i6) {
            m(w.this.f3692a.getResources().getString(i6));
        }

        @Override // g.a
        public final void m(CharSequence charSequence) {
            w.this.f3697f.setSubtitle(charSequence);
        }

        @Override // g.a
        public final void n(int i6) {
            o(w.this.f3692a.getResources().getString(i6));
        }

        @Override // g.a
        public final void o(CharSequence charSequence) {
            w.this.f3697f.setTitle(charSequence);
        }

        @Override // g.a
        public final void p(boolean z5) {
            this.f4028c = z5;
            w.this.f3697f.setTitleOptional(z5);
        }
    }

    public w(Activity activity, boolean z5) {
        new ArrayList();
        this.f3704m = new ArrayList<>();
        this.f3706o = 0;
        this.f3707p = true;
        this.s = true;
        this.f3712w = new a();
        this.f3713x = new b();
        this.f3714y = new c();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z5) {
            return;
        }
        this.f3698g = decorView.findViewById(16908290);
    }

    public w(Dialog dialog) {
        new ArrayList();
        this.f3704m = new ArrayList<>();
        this.f3706o = 0;
        this.f3707p = true;
        this.s = true;
        this.f3712w = new a();
        this.f3713x = new b();
        this.f3714y = new c();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z5) {
        r0 r5;
        r0 e6;
        long j5;
        if (z5) {
            if (!this.f3709r) {
                this.f3709r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3694c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f3709r) {
            this.f3709r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3694c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f3695d;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.g.c(actionBarContainer)) {
            if (z5) {
                e6 = this.f3696e.r(4, 100L);
                r5 = this.f3697f.e(0, 200L);
            } else {
                r5 = this.f3696e.r(0, 200L);
                e6 = this.f3697f.e(8, 100L);
            }
            g.g gVar = new g.g();
            ArrayList<r0> arrayList = gVar.f4080a;
            arrayList.add(e6);
            View view = e6.f3912a.get();
            if (view != null) {
                j5 = view.animate().getDuration();
            } else {
                j5 = 0;
            }
            View view2 = r5.f3912a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j5);
            }
            arrayList.add(r5);
            gVar.b();
        } else if (z5) {
            this.f3696e.j(4);
            this.f3697f.setVisibility(0);
        } else {
            this.f3696e.j(0);
            this.f3697f.setVisibility(8);
        }
    }

    public final void b(boolean z5) {
        if (z5 == this.f3703l) {
            return;
        }
        this.f3703l = z5;
        ArrayList<a.b> arrayList = this.f3704m;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).a();
        }
    }

    public final Context c() {
        if (this.f3693b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3692a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                this.f3693b = new ContextThemeWrapper(this.f3692a, i6);
            } else {
                this.f3693b = this.f3692a;
            }
        }
        return this.f3693b;
    }

    public final void d(View view) {
        String str;
        o0 wrapper;
        boolean z5;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f3694c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof o0) {
            wrapper = (o0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f3696e = wrapper;
        this.f3697f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f3695d = actionBarContainer;
        o0 o0Var = this.f3696e;
        if (o0Var != null && this.f3697f != null && actionBarContainer != null) {
            this.f3692a = o0Var.b();
            if ((this.f3696e.o() & 4) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                this.f3699h = true;
            }
            Context context = this.f3692a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f3696e.k();
            f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f3692a.obtainStyledAttributes(null, c.b.f2652b, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3694c;
                if (actionBarOverlayLayout2.f538i) {
                    this.f3711v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f3695d;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.i.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(w.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void e(boolean z5) {
        int i6;
        if (!this.f3699h) {
            if (z5) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            int o5 = this.f3696e.o();
            this.f3699h = true;
            this.f3696e.m((i6 & 4) | (o5 & (-5)));
        }
    }

    public final void f(boolean z5) {
        this.f3705n = z5;
        if (!z5) {
            this.f3696e.n();
            this.f3695d.setTabContainer(null);
        } else {
            this.f3695d.setTabContainer(null);
            this.f3696e.n();
        }
        this.f3696e.q();
        o0 o0Var = this.f3696e;
        boolean z6 = this.f3705n;
        o0Var.u(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3694c;
        boolean z7 = this.f3705n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z5) {
        boolean z6;
        int[] iArr;
        int[] iArr2;
        boolean z7 = this.f3708q;
        if (this.f3709r || !z7) {
            z6 = true;
        } else {
            z6 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f3698g;
        final c cVar = this.f3714y;
        if (z6) {
            if (!this.s) {
                this.s = true;
                g.g gVar = this.f3710t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f3695d.setVisibility(0);
                int i6 = this.f3706o;
                b bVar = this.f3713x;
                if (i6 == 0 && (this.u || z5)) {
                    this.f3695d.setTranslationY(0.0f);
                    float f6 = -this.f3695d.getHeight();
                    if (z5) {
                        this.f3695d.getLocationInWindow(new int[]{0, 0});
                        f6 -= iArr2[1];
                    }
                    this.f3695d.setTranslationY(f6);
                    g.g gVar2 = new g.g();
                    r0 a6 = g0.a(this.f3695d);
                    a6.e(0.0f);
                    final View view2 = a6.f3912a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view2) { // from class: f0.p0

                                /* renamed from: a  reason: collision with root package name */
                                public final /* synthetic */ t0 f3909a;

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) d.w.this.f3695d.getParent()).invalidate();
                                }
                            };
                        }
                        r0.a.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z8 = gVar2.f4084e;
                    ArrayList<r0> arrayList = gVar2.f4080a;
                    if (!z8) {
                        arrayList.add(a6);
                    }
                    if (this.f3707p && view != null) {
                        view.setTranslationY(f6);
                        r0 a7 = g0.a(view);
                        a7.e(0.0f);
                        if (!gVar2.f4084e) {
                            arrayList.add(a7);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z9 = gVar2.f4084e;
                    if (!z9) {
                        gVar2.f4082c = decelerateInterpolator;
                    }
                    if (!z9) {
                        gVar2.f4081b = 250L;
                    }
                    if (!z9) {
                        gVar2.f4083d = bVar;
                    }
                    this.f3710t = gVar2;
                    gVar2.b();
                } else {
                    this.f3695d.setAlpha(1.0f);
                    this.f3695d.setTranslationY(0.0f);
                    if (this.f3707p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    bVar.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3694c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.s) {
            this.s = false;
            g.g gVar3 = this.f3710t;
            if (gVar3 != null) {
                gVar3.a();
            }
            int i7 = this.f3706o;
            a aVar = this.f3712w;
            if (i7 == 0 && (this.u || z5)) {
                this.f3695d.setAlpha(1.0f);
                this.f3695d.setTransitioning(true);
                g.g gVar4 = new g.g();
                float f7 = -this.f3695d.getHeight();
                if (z5) {
                    this.f3695d.getLocationInWindow(new int[]{0, 0});
                    f7 -= iArr[1];
                }
                r0 a8 = g0.a(this.f3695d);
                a8.e(f7);
                final View view3 = a8.f3912a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(cVar, view3) { // from class: f0.p0

                            /* renamed from: a  reason: collision with root package name */
                            public final /* synthetic */ t0 f3909a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) d.w.this.f3695d.getParent()).invalidate();
                            }
                        };
                    }
                    r0.a.a(view3.animate(), animatorUpdateListener);
                }
                boolean z10 = gVar4.f4084e;
                ArrayList<r0> arrayList2 = gVar4.f4080a;
                if (!z10) {
                    arrayList2.add(a8);
                }
                if (this.f3707p && view != null) {
                    r0 a9 = g0.a(view);
                    a9.e(f7);
                    if (!gVar4.f4084e) {
                        arrayList2.add(a9);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3691z;
                boolean z11 = gVar4.f4084e;
                if (!z11) {
                    gVar4.f4082c = accelerateInterpolator;
                }
                if (!z11) {
                    gVar4.f4081b = 250L;
                }
                if (!z11) {
                    gVar4.f4083d = aVar;
                }
                this.f3710t = gVar4;
                gVar4.b();
                return;
            }
            aVar.a();
        }
    }
}
