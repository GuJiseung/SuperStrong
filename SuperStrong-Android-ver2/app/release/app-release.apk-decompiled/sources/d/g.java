package d;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.s1;
import androidx.appcompat.widget.z0;
import b0.e;
import com.superstrong.android.R;
import d.v;
import f0.g0;
import f0.l;
import f0.r0;
import g.a;
import g.e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class g extends d.f implements f.a, LayoutInflater.Factory2 {

    /* renamed from: j0  reason: collision with root package name */
    public static final l.h<String, Integer> f3581j0 = new l.h<>();

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f3582k0 = {16842836};

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f3583l0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: m0  reason: collision with root package name */
    public static final boolean f3584m0 = true;
    public boolean B;
    public ViewGroup C;
    public TextView D;
    public View E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public k[] N;
    public k O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Configuration T;
    public final int U;
    public int V;
    public int W;
    public boolean X;
    public i Y;
    public C0031g Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3585a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f3586b0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f3588d0;

    /* renamed from: e0  reason: collision with root package name */
    public Rect f3589e0;

    /* renamed from: f0  reason: collision with root package name */
    public Rect f3590f0;

    /* renamed from: g0  reason: collision with root package name */
    public o f3591g0;

    /* renamed from: h0  reason: collision with root package name */
    public OnBackInvokedDispatcher f3592h0;

    /* renamed from: i0  reason: collision with root package name */
    public OnBackInvokedCallback f3593i0;

    /* renamed from: k  reason: collision with root package name */
    public final Object f3594k;

    /* renamed from: l  reason: collision with root package name */
    public final Context f3595l;

    /* renamed from: m  reason: collision with root package name */
    public Window f3596m;

    /* renamed from: n  reason: collision with root package name */
    public f f3597n;

    /* renamed from: o  reason: collision with root package name */
    public final d.d f3598o;

    /* renamed from: p  reason: collision with root package name */
    public w f3599p;

    /* renamed from: q  reason: collision with root package name */
    public g.f f3600q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3601r;
    public n0 s;

    /* renamed from: t  reason: collision with root package name */
    public b f3602t;
    public l u;

    /* renamed from: v  reason: collision with root package name */
    public g.a f3603v;

    /* renamed from: w  reason: collision with root package name */
    public ActionBarContextView f3604w;

    /* renamed from: x  reason: collision with root package name */
    public PopupWindow f3605x;

    /* renamed from: y  reason: collision with root package name */
    public d.j f3606y;

    /* renamed from: z  reason: collision with root package name */
    public r0 f3607z = null;
    public final boolean A = true;

    /* renamed from: c0  reason: collision with root package name */
    public final a f3587c0 = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            if ((gVar.f3586b0 & 1) != 0) {
                gVar.G(0);
            }
            if ((gVar.f3586b0 & 4096) != 0) {
                gVar.G(108);
            }
            gVar.f3585a0 = false;
            gVar.f3586b0 = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements j.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
            g.this.C(fVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            Window.Callback L = g.this.L();
            if (L != null) {
                L.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0039a {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0039a f3610a;

        /* loaded from: classes.dex */
        public class a extends c.a {
            public a() {
            }

            @Override // f0.s0
            public final void a() {
                c cVar = c.this;
                g.this.f3604w.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f3605x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f3604w.getParent() instanceof View) {
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.h.c((View) gVar.f3604w.getParent());
                }
                gVar.f3604w.h();
                gVar.f3607z.d(null);
                gVar.f3607z = null;
                ViewGroup viewGroup = gVar.C;
                WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                g0.h.c(viewGroup);
            }
        }

        public c(e.a aVar) {
            this.f3610a = aVar;
        }

        @Override // g.a.InterfaceC0039a
        public final boolean a(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            return this.f3610a.a(aVar, fVar);
        }

        @Override // g.a.InterfaceC0039a
        public final boolean b(g.a aVar, MenuItem menuItem) {
            return this.f3610a.b(aVar, menuItem);
        }

        @Override // g.a.InterfaceC0039a
        public final boolean c(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            ViewGroup viewGroup = g.this.C;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.h.c(viewGroup);
            return this.f3610a.c(aVar, fVar);
        }

        @Override // g.a.InterfaceC0039a
        public final void d(g.a aVar) {
            this.f3610a.d(aVar);
            g gVar = g.this;
            if (gVar.f3605x != null) {
                gVar.f3596m.getDecorView().removeCallbacks(gVar.f3606y);
            }
            if (gVar.f3604w != null) {
                r0 r0Var = gVar.f3607z;
                if (r0Var != null) {
                    r0Var.b();
                }
                r0 a6 = g0.a(gVar.f3604w);
                a6.a(0.0f);
                gVar.f3607z = a6;
                a6.d(new a());
            }
            d.d dVar = gVar.f3598o;
            if (dVar != null) {
                dVar.g();
            }
            gVar.f3603v = null;
            ViewGroup viewGroup = gVar.C;
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.h.c(viewGroup);
            gVar.T();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static b0.e b(Configuration configuration) {
            return b0.e.a(configuration.getLocales().toLanguageTags());
        }

        public static void c(b0.e eVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f2264a.a()));
        }

        public static void d(Configuration configuration, b0.e eVar) {
            configuration.setLocales(LocaleList.forLanguageTags(eVar.f2264a.a()));
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, g gVar) {
            Objects.requireNonNull(gVar);
            d.l lVar = new d.l(0, gVar);
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, lVar);
            return lVar;
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class f extends g.h {

        /* renamed from: c  reason: collision with root package name */
        public boolean f3613c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3614d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3615e;

        public f(Window.Callback callback) {
            super(callback);
        }

        public final void a(Window.Callback callback) {
            try {
                this.f3613c = true;
                callback.onContentChanged();
            } finally {
                this.f3613c = false;
            }
        }

        @Override // g.h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f3614d ? this.f4089b.dispatchKeyEvent(keyEvent) : g.this.F(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
            if (r7 != false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // g.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r7)
                r1 = 1
                if (r0 != 0) goto L6e
                int r0 = r7.getKeyCode()
                d.g r2 = d.g.this
                r2.M()
                d.w r3 = r2.f3599p
                r4 = 0
                if (r3 == 0) goto L3b
                d.w$d r3 = r3.f3700i
                if (r3 != 0) goto L1a
                goto L37
            L1a:
                androidx.appcompat.view.menu.f r3 = r3.f3719e
                if (r3 == 0) goto L37
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L2e
                r5 = r1
                goto L2f
            L2e:
                r5 = r4
            L2f:
                r3.setQwertyMode(r5)
                boolean r0 = r3.performShortcut(r0, r7, r4)
                goto L38
            L37:
                r0 = r4
            L38:
                if (r0 == 0) goto L3b
                goto L67
            L3b:
                d.g$k r0 = r2.O
                if (r0 == 0) goto L50
                int r3 = r7.getKeyCode()
                boolean r0 = r2.Q(r0, r3, r7)
                if (r0 == 0) goto L50
                d.g$k r7 = r2.O
                if (r7 == 0) goto L67
                r7.f3636l = r1
                goto L67
            L50:
                d.g$k r0 = r2.O
                if (r0 != 0) goto L69
                d.g$k r0 = r2.K(r4)
                r2.R(r0, r7)
                int r3 = r7.getKeyCode()
                boolean r7 = r2.Q(r0, r3, r7)
                r0.f3635k = r4
                if (r7 == 0) goto L69
            L67:
                r7 = r1
                goto L6a
            L69:
                r7 = r4
            L6a:
                if (r7 == 0) goto L6d
                goto L6e
            L6d:
                r1 = r4
            L6e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d.g.f.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f3613c) {
                this.f4089b.onContentChanged();
            }
        }

        @Override // g.h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i6, Menu menu) {
            if (i6 != 0 || (menu instanceof androidx.appcompat.view.menu.f)) {
                return super.onCreatePanelMenu(i6, menu);
            }
            return false;
        }

        @Override // g.h, android.view.Window.Callback
        public final View onCreatePanelView(int i6) {
            return super.onCreatePanelView(i6);
        }

        @Override // g.h, android.view.Window.Callback
        public final boolean onMenuOpened(int i6, Menu menu) {
            super.onMenuOpened(i6, menu);
            g gVar = g.this;
            if (i6 == 108) {
                gVar.M();
                w wVar = gVar.f3599p;
                if (wVar != null) {
                    wVar.b(true);
                }
            } else {
                gVar.getClass();
            }
            return true;
        }

        @Override // g.h, android.view.Window.Callback
        public final void onPanelClosed(int i6, Menu menu) {
            if (this.f3615e) {
                this.f4089b.onPanelClosed(i6, menu);
                return;
            }
            super.onPanelClosed(i6, menu);
            g gVar = g.this;
            if (i6 == 108) {
                gVar.M();
                w wVar = gVar.f3599p;
                if (wVar != null) {
                    wVar.b(false);
                }
            } else if (i6 == 0) {
                k K = gVar.K(i6);
                if (K.f3637m) {
                    gVar.D(K, false);
                }
            } else {
                gVar.getClass();
            }
        }

        @Override // g.h, android.view.Window.Callback
        public final boolean onPreparePanel(int i6, View view, Menu menu) {
            androidx.appcompat.view.menu.f fVar;
            if (menu instanceof androidx.appcompat.view.menu.f) {
                fVar = (androidx.appcompat.view.menu.f) menu;
            } else {
                fVar = null;
            }
            if (i6 == 0 && fVar == null) {
                return false;
            }
            if (fVar != null) {
                fVar.f447x = true;
            }
            boolean onPreparePanel = super.onPreparePanel(i6, view, menu);
            if (fVar != null) {
                fVar.f447x = false;
            }
            return onPreparePanel;
        }

        @Override // g.h, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i6) {
            androidx.appcompat.view.menu.f fVar = g.this.K(0).f3632h;
            if (fVar != null) {
                super.onProvideKeyboardShortcuts(list, fVar, i6);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i6);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
            if (f0.g0.g.c(r10) != false) goto L73;
         */
        @Override // g.h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
            /*
                Method dump skipped, instructions count: 499
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d.g.f.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
        }
    }

    /* renamed from: d.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0031g extends h {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f3617c;

        public C0031g(Context context) {
            super();
            this.f3617c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // d.g.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // d.g.h
        public final int c() {
            return this.f3617c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // d.g.h
        public final void d() {
            g.this.y(true, true);
        }
    }

    /* loaded from: classes.dex */
    public abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public a f3619a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                h.this.d();
            }
        }

        public h() {
        }

        public final void a() {
            a aVar = this.f3619a;
            if (aVar != null) {
                try {
                    g.this.f3595l.unregisterReceiver(aVar);
                } catch (IllegalArgumentException unused) {
                }
                this.f3619a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
            a();
            IntentFilter b6 = b();
            if (b6 == null || b6.countActions() == 0) {
                return;
            }
            if (this.f3619a == null) {
                this.f3619a = new a();
            }
            g.this.f3595l.registerReceiver(this.f3619a, b6);
        }
    }

    /* loaded from: classes.dex */
    public class i extends h {

        /* renamed from: c  reason: collision with root package name */
        public final v f3622c;

        public i(v vVar) {
            super();
            this.f3622c = vVar;
        }

        @Override // d.g.h
        public final IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // d.g.h
        public final int c() {
            boolean z5;
            Location location;
            boolean z6;
            long j5;
            long j6;
            Location location2;
            v vVar = this.f3622c;
            v.a aVar = vVar.f3688c;
            boolean z7 = false;
            if (aVar.f3690b > System.currentTimeMillis()) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                z6 = aVar.f3689a;
            } else {
                Context context = vVar.f3686a;
                int i6 = androidx.activity.k.i(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = vVar.f3687b;
                if (i6 == 0) {
                    try {
                    } catch (Exception e6) {
                        Log.d("TwilightManager", "Failed to get last known location", e6);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (androidx.activity.k.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e7) {
                        Log.d("TwilightManager", "Failed to get last known location", e7);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (u.f3681d == null) {
                        u.f3681d = new u();
                    }
                    u uVar = u.f3681d;
                    uVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                    uVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                    if (uVar.f3684c == 1) {
                        z7 = true;
                    }
                    long j7 = uVar.f3683b;
                    long j8 = uVar.f3682a;
                    uVar.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                    long j9 = uVar.f3683b;
                    if (j7 != -1 && j8 != -1) {
                        if (currentTimeMillis > j8) {
                            j6 = j9 + 0;
                        } else if (currentTimeMillis > j7) {
                            j6 = j8 + 0;
                        } else {
                            j6 = j7 + 0;
                        }
                        j5 = j6 + 60000;
                    } else {
                        j5 = 43200000 + currentTimeMillis;
                    }
                    aVar.f3689a = z7;
                    aVar.f3690b = j5;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i7 = Calendar.getInstance().get(11);
                    if (i7 < 6 || i7 >= 22) {
                        z7 = true;
                    }
                }
                z6 = z7;
            }
            if (!z6) {
                return 1;
            }
            return 2;
        }

        @Override // d.g.h
        public final void d() {
            g.this.y(true, true);
        }
    }

    /* loaded from: classes.dex */
    public class j extends ContentFrameLayout {
        public j(g.c cVar) {
            super(cVar, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.F(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z5;
            if (motionEvent.getAction() == 0) {
                int x5 = (int) motionEvent.getX();
                int y5 = (int) motionEvent.getY();
                if (x5 >= -5 && y5 >= -5 && x5 <= getWidth() + 5 && y5 <= getHeight() + 5) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    g gVar = g.this;
                    gVar.D(gVar.K(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i6) {
            setBackgroundDrawable(e.a.a(getContext(), i6));
        }
    }

    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final int f3625a;

        /* renamed from: b  reason: collision with root package name */
        public int f3626b;

        /* renamed from: c  reason: collision with root package name */
        public int f3627c;

        /* renamed from: d  reason: collision with root package name */
        public int f3628d;

        /* renamed from: e  reason: collision with root package name */
        public j f3629e;

        /* renamed from: f  reason: collision with root package name */
        public View f3630f;

        /* renamed from: g  reason: collision with root package name */
        public View f3631g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.f f3632h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.d f3633i;

        /* renamed from: j  reason: collision with root package name */
        public g.c f3634j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3635k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3636l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3637m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3638n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3639o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f3640p;

        public k(int i6) {
            this.f3625a = i6;
        }
    }

    /* loaded from: classes.dex */
    public final class l implements j.a {
        public l() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
            boolean z6;
            int i6;
            k kVar;
            androidx.appcompat.view.menu.f k5 = fVar.k();
            int i7 = 0;
            if (k5 != fVar) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                fVar = k5;
            }
            g gVar = g.this;
            k[] kVarArr = gVar.N;
            if (kVarArr != null) {
                i6 = kVarArr.length;
            } else {
                i6 = 0;
            }
            while (true) {
                if (i7 < i6) {
                    kVar = kVarArr[i7];
                    if (kVar != null && kVar.f3632h == fVar) {
                        break;
                    }
                    i7++;
                } else {
                    kVar = null;
                    break;
                }
            }
            if (kVar != null) {
                if (z6) {
                    gVar.B(kVar.f3625a, kVar, k5);
                    gVar.D(kVar, true);
                    return;
                }
                gVar.D(kVar, z5);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            Window.Callback L;
            if (fVar == fVar.k()) {
                g gVar = g.this;
                if (!gVar.H || (L = gVar.L()) == null || gVar.S) {
                    return true;
                }
                L.onMenuOpened(108, fVar);
                return true;
            }
            return true;
        }
    }

    public g(Context context, Window window, d.d dVar, Object obj) {
        l.h<String, Integer> hVar;
        Integer orDefault;
        androidx.appcompat.app.c cVar;
        this.U = -100;
        this.f3595l = context;
        this.f3598o = dVar;
        this.f3594k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof androidx.appcompat.app.c) {
                    cVar = (androidx.appcompat.app.c) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            cVar = null;
            if (cVar != null) {
                this.U = cVar.B().g();
            }
        }
        if (this.U == -100 && (orDefault = (hVar = f3581j0).getOrDefault(this.f3594k.getClass().getName(), null)) != null) {
            this.U = orDefault.intValue();
            hVar.remove(this.f3594k.getClass().getName());
        }
        if (window != null) {
            z(window);
        }
        androidx.appcompat.widget.j.d();
    }

    public static b0.e A(Context context) {
        b0.e eVar;
        b0.e eVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (eVar = d.f.f3574d) == null) {
            return null;
        }
        b0.e b6 = d.b(context.getApplicationContext().getResources().getConfiguration());
        b0.f fVar = eVar.f2264a;
        if (fVar.isEmpty()) {
            eVar2 = b0.e.f2263b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i6 = 0; i6 < b6.f2264a.size() + fVar.size(); i6++) {
                if (i6 < fVar.size()) {
                    locale = fVar.get(i6);
                } else {
                    locale = b6.f2264a.get(i6 - fVar.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            eVar2 = new b0.e(new b0.g(e.b.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!eVar2.f2264a.isEmpty()) {
            return eVar2;
        }
        return b6;
    }

    public static Configuration E(Context context, int i6, b0.e eVar, Configuration configuration, boolean z5) {
        int i7;
        if (i6 != 1) {
            if (i6 != 2) {
                if (z5) {
                    i7 = 0;
                } else {
                    i7 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i7 = 32;
            }
        } else {
            i7 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i7 | (configuration2.uiMode & (-49));
        if (eVar != null) {
            d.d(configuration2, eVar);
        }
        return configuration2;
    }

    public final void B(int i6, k kVar, androidx.appcompat.view.menu.f fVar) {
        if (fVar == null) {
            if (kVar == null && i6 >= 0) {
                k[] kVarArr = this.N;
                if (i6 < kVarArr.length) {
                    kVar = kVarArr[i6];
                }
            }
            if (kVar != null) {
                fVar = kVar.f3632h;
            }
        }
        if ((kVar == null || kVar.f3637m) && !this.S) {
            f fVar2 = this.f3597n;
            Window.Callback callback = this.f3596m.getCallback();
            fVar2.getClass();
            try {
                fVar2.f3615e = true;
                callback.onPanelClosed(i6, fVar);
            } finally {
                fVar2.f3615e = false;
            }
        }
    }

    public final void C(androidx.appcompat.view.menu.f fVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.s.l();
        Window.Callback L = L();
        if (L != null && !this.S) {
            L.onPanelClosed(108, fVar);
        }
        this.M = false;
    }

    public final void D(k kVar, boolean z5) {
        j jVar;
        n0 n0Var;
        if (z5 && kVar.f3625a == 0 && (n0Var = this.s) != null && n0Var.a()) {
            C(kVar.f3632h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f3595l.getSystemService("window");
        if (windowManager != null && kVar.f3637m && (jVar = kVar.f3629e) != null) {
            windowManager.removeView(jVar);
            if (z5) {
                B(kVar.f3625a, kVar, null);
            }
        }
        kVar.f3635k = false;
        kVar.f3636l = false;
        kVar.f3637m = false;
        kVar.f3630f = null;
        kVar.f3638n = true;
        if (this.O == kVar) {
            this.O = null;
        }
        if (kVar.f3625a == 0) {
            T();
        }
    }

    public final boolean F(KeyEvent keyEvent) {
        View decorView;
        boolean z5;
        boolean z6;
        boolean z7;
        Object obj = this.f3594k;
        boolean z8 = true;
        if (((obj instanceof l.a) || (obj instanceof n)) && (decorView = this.f3596m.getDecorView()) != null && f0.l.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            f fVar = this.f3597n;
            Window.Callback callback = this.f3596m.getCallback();
            fVar.getClass();
            try {
                fVar.f3614d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                fVar.f3614d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    k K = K(0);
                    if (K.f3637m) {
                        return true;
                    }
                    R(K, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z8 = false;
                }
                this.P = z8;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f3603v != null) {
                    return true;
                }
                k K2 = K(0);
                n0 n0Var = this.s;
                Context context = this.f3595l;
                if (n0Var != null && n0Var.h() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.s.a()) {
                        if (!this.S && R(K2, keyEvent)) {
                            z6 = this.s.f();
                        }
                        z6 = false;
                    } else {
                        z6 = this.s.e();
                    }
                } else {
                    boolean z9 = K2.f3637m;
                    if (!z9 && !K2.f3636l) {
                        if (K2.f3635k) {
                            if (K2.f3639o) {
                                K2.f3635k = false;
                                z7 = R(K2, keyEvent);
                            } else {
                                z7 = true;
                            }
                            if (z7) {
                                P(K2, keyEvent);
                                z6 = true;
                            }
                        }
                        z6 = false;
                    } else {
                        D(K2, true);
                        z6 = z9;
                    }
                }
                if (!z6) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (O()) {
            return true;
        }
        return false;
    }

    public final void G(int i6) {
        k K = K(i6);
        if (K.f3632h != null) {
            Bundle bundle = new Bundle();
            K.f3632h.t(bundle);
            if (bundle.size() > 0) {
                K.f3640p = bundle;
            }
            K.f3632h.w();
            K.f3632h.clear();
        }
        K.f3639o = true;
        K.f3638n = true;
        if ((i6 == 108 || i6 == 0) && this.s != null) {
            k K2 = K(0);
            K2.f3635k = false;
            R(K2, null);
        }
    }

    public final void H() {
        int i6;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.B) {
            int[] iArr = c.b.f2670k;
            Context context2 = this.f3595l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    s(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    s(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    s(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    s(10);
                }
                this.K = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                I();
                this.f3596m.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.L) {
                    if (this.K) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.I = false;
                        this.H = false;
                    } else if (this.H) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new g.c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        n0 n0Var = (n0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.s = n0Var;
                        n0Var.setWindowCallback(L());
                        if (this.I) {
                            this.s.k(109);
                        }
                        if (this.F) {
                            this.s.k(2);
                        }
                        if (this.G) {
                            this.s.k(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.J) {
                        i6 = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i6 = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i6, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    d.h hVar = new d.h(this);
                    WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                    g0.i.u(viewGroup, hVar);
                    if (this.s == null) {
                        this.D = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = s1.f934a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f3596m.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f3596m.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new d.i(this));
                    this.C = viewGroup;
                    Object obj = this.f3594k;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f3601r;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        n0 n0Var2 = this.s;
                        if (n0Var2 != null) {
                            n0Var2.setWindowTitle(charSequence);
                        } else {
                            w wVar = this.f3599p;
                            if (wVar != null) {
                                wVar.f3696e.setWindowTitle(charSequence);
                            } else {
                                TextView textView = this.D;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.C.findViewById(16908290);
                    View decorView = this.f3596m.getDecorView();
                    contentFrameLayout2.f593h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
                    if (g0.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.B = true;
                    k K = K(0);
                    if (!this.S && K.f3632h == null) {
                        this.f3586b0 |= 4096;
                        if (!this.f3585a0) {
                            g0.d.m(this.f3596m.getDecorView(), this.f3587c0);
                            this.f3585a0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void I() {
        if (this.f3596m == null) {
            Object obj = this.f3594k;
            if (obj instanceof Activity) {
                z(((Activity) obj).getWindow());
            }
        }
        if (this.f3596m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final h J(Context context) {
        if (this.Y == null) {
            if (v.f3685d == null) {
                Context applicationContext = context.getApplicationContext();
                v.f3685d = new v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Y = new i(v.f3685d);
        }
        return this.Y;
    }

    public final k K(int i6) {
        k[] kVarArr = this.N;
        if (kVarArr == null || kVarArr.length <= i6) {
            k[] kVarArr2 = new k[i6 + 1];
            if (kVarArr != null) {
                System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
            }
            this.N = kVarArr2;
            kVarArr = kVarArr2;
        }
        k kVar = kVarArr[i6];
        if (kVar == null) {
            k kVar2 = new k(i6);
            kVarArr[i6] = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public final Window.Callback L() {
        return this.f3596m.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r3 = this;
            r3.H()
            boolean r0 = r3.H
            if (r0 == 0) goto L32
            d.w r0 = r3.f3599p
            if (r0 == 0) goto Lc
            goto L32
        Lc:
            java.lang.Object r0 = r3.f3594k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1c
            d.w r1 = new d.w
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.I
            r1.<init>(r0, r2)
            goto L27
        L1c:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L29
            d.w r1 = new d.w
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
        L27:
            r3.f3599p = r1
        L29:
            d.w r0 = r3.f3599p
            if (r0 == 0) goto L32
            boolean r1 = r3.f3588d0
            r0.e(r1)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.M():void");
    }

    public final int N(Context context, int i6) {
        h J;
        if (i6 == -100) {
            return -1;
        }
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    if (i6 == 3) {
                        if (this.Z == null) {
                            this.Z = new C0031g(context);
                        }
                        J = this.Z;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                J = J(context);
            }
            return J.c();
        }
        return i6;
    }

    public final boolean O() {
        boolean z5;
        boolean z6 = this.P;
        this.P = false;
        k K = K(0);
        if (K.f3637m) {
            if (!z6) {
                D(K, true);
            }
            return true;
        }
        g.a aVar = this.f3603v;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        M();
        w wVar = this.f3599p;
        if (wVar != null) {
            o0 o0Var = wVar.f3696e;
            if (o0Var != null && o0Var.l()) {
                wVar.f3696e.collapseActionView();
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0175, code lost:
        if (r2.f416g.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(d.g.k r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.P(d.g$k, android.view.KeyEvent):void");
    }

    public final boolean Q(k kVar, int i6, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.f fVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((kVar.f3635k || R(kVar, keyEvent)) && (fVar = kVar.f3632h) != null) {
            return fVar.performShortcut(i6, keyEvent, 1);
        }
        return false;
    }

    public final boolean R(k kVar, KeyEvent keyEvent) {
        boolean z5;
        n0 n0Var;
        n0 n0Var2;
        Resources.Theme theme;
        int i6;
        boolean z6;
        n0 n0Var3;
        n0 n0Var4;
        if (this.S) {
            return false;
        }
        if (kVar.f3635k) {
            return true;
        }
        k kVar2 = this.O;
        if (kVar2 != null && kVar2 != kVar) {
            D(kVar2, false);
        }
        Window.Callback L = L();
        int i7 = kVar.f3625a;
        if (L != null) {
            kVar.f3631g = L.onCreatePanelView(i7);
        }
        if (i7 != 0 && i7 != 108) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5 && (n0Var4 = this.s) != null) {
            n0Var4.c();
        }
        if (kVar.f3631g == null) {
            androidx.appcompat.view.menu.f fVar = kVar.f3632h;
            if (fVar == null || kVar.f3639o) {
                if (fVar == null) {
                    Context context = this.f3595l;
                    if ((i7 == 0 || i7 == 108) && this.s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            g.c cVar = new g.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.f fVar2 = new androidx.appcompat.view.menu.f(context);
                    fVar2.f430e = this;
                    androidx.appcompat.view.menu.f fVar3 = kVar.f3632h;
                    if (fVar2 != fVar3) {
                        if (fVar3 != null) {
                            fVar3.r(kVar.f3633i);
                        }
                        kVar.f3632h = fVar2;
                        androidx.appcompat.view.menu.d dVar = kVar.f3633i;
                        if (dVar != null) {
                            fVar2.b(dVar, fVar2.f426a);
                        }
                    }
                    if (kVar.f3632h == null) {
                        return false;
                    }
                }
                if (z5 && (n0Var2 = this.s) != null) {
                    if (this.f3602t == null) {
                        this.f3602t = new b();
                    }
                    n0Var2.g(kVar.f3632h, this.f3602t);
                }
                kVar.f3632h.w();
                if (!L.onCreatePanelMenu(i7, kVar.f3632h)) {
                    androidx.appcompat.view.menu.f fVar4 = kVar.f3632h;
                    if (fVar4 != null) {
                        if (fVar4 != null) {
                            fVar4.r(kVar.f3633i);
                        }
                        kVar.f3632h = null;
                    }
                    if (z5 && (n0Var = this.s) != null) {
                        n0Var.g(null, this.f3602t);
                    }
                    return false;
                }
                kVar.f3639o = false;
            }
            kVar.f3632h.w();
            Bundle bundle = kVar.f3640p;
            if (bundle != null) {
                kVar.f3632h.s(bundle);
                kVar.f3640p = null;
            }
            if (!L.onPreparePanel(0, kVar.f3631g, kVar.f3632h)) {
                if (z5 && (n0Var3 = this.s) != null) {
                    n0Var3.g(null, this.f3602t);
                }
                kVar.f3632h.v();
                return false;
            }
            if (keyEvent != null) {
                i6 = keyEvent.getDeviceId();
            } else {
                i6 = -1;
            }
            if (KeyCharacterMap.load(i6).getKeyboardType() != 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            kVar.f3632h.setQwertyMode(z6);
            kVar.f3632h.v();
        }
        kVar.f3635k = true;
        kVar.f3636l = false;
        this.O = kVar;
        return true;
    }

    public final void S() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void T() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.f3592h0 != null && (K(0).f3637m || this.f3603v != null)) {
                z5 = true;
            }
            if (z5 && this.f3593i0 == null) {
                this.f3593i0 = e.b(this.f3592h0, this);
            } else if (!z5 && (onBackInvokedCallback = this.f3593i0) != null) {
                e.c(this.f3592h0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        int i6;
        int i7;
        k kVar;
        Window.Callback L = L();
        if (L != null && !this.S) {
            androidx.appcompat.view.menu.f k5 = fVar.k();
            k[] kVarArr = this.N;
            if (kVarArr != null) {
                i6 = kVarArr.length;
                i7 = 0;
            } else {
                i6 = 0;
                i7 = 0;
            }
            while (true) {
                if (i7 < i6) {
                    kVar = kVarArr[i7];
                    if (kVar != null && kVar.f3632h == k5) {
                        break;
                    }
                    i7++;
                } else {
                    kVar = null;
                    break;
                }
            }
            if (kVar != null) {
                return L.onMenuItemSelected(kVar.f3625a, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        n0 n0Var = this.s;
        if (n0Var == null || !n0Var.h() || (ViewConfiguration.get(this.f3595l).hasPermanentMenuKey() && !this.s.d())) {
            k K = K(0);
            K.f3638n = true;
            D(K, false);
            P(K, null);
            return;
        }
        Window.Callback L = L();
        if (this.s.a()) {
            this.s.e();
            if (this.S) {
                return;
            }
            L.onPanelClosed(108, K(0).f3632h);
        } else if (L == null || this.S) {
        } else {
            if (this.f3585a0 && (1 & this.f3586b0) != 0) {
                View decorView = this.f3596m.getDecorView();
                a aVar = this.f3587c0;
                decorView.removeCallbacks(aVar);
                aVar.run();
            }
            k K2 = K(0);
            androidx.appcompat.view.menu.f fVar2 = K2.f3632h;
            if (fVar2 == null || K2.f3639o || !L.onPreparePanel(0, K2.f3631g, fVar2)) {
                return;
            }
            L.onMenuOpened(108, K2.f3632h);
            this.s.f();
        }
    }

    @Override // d.f
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ((ViewGroup) this.C.findViewById(16908290)).addView(view, layoutParams);
        this.f3597n.a(this.f3596m.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01f7  */
    @Override // d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Context d(final android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.d(android.content.Context):android.content.Context");
    }

    @Override // d.f
    public final <T extends View> T e(int i6) {
        H();
        return (T) this.f3596m.findViewById(i6);
    }

    @Override // d.f
    public final Context f() {
        return this.f3595l;
    }

    @Override // d.f
    public final int g() {
        return this.U;
    }

    @Override // d.f
    public final MenuInflater h() {
        if (this.f3600q == null) {
            M();
            w wVar = this.f3599p;
            this.f3600q = new g.f(wVar != null ? wVar.c() : this.f3595l);
        }
        return this.f3600q;
    }

    @Override // d.f
    public final void i() {
        LayoutInflater from = LayoutInflater.from(this.f3595l);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // d.f
    public final void j() {
        if (this.f3599p != null) {
            M();
            this.f3599p.getClass();
            this.f3586b0 |= 1;
            if (!this.f3585a0) {
                View decorView = this.f3596m.getDecorView();
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                g0.d.m(decorView, this.f3587c0);
                this.f3585a0 = true;
            }
        }
    }

    @Override // d.f
    public final void l() {
        if (this.H && this.B) {
            M();
            w wVar = this.f3599p;
            if (wVar != null) {
                wVar.f(wVar.f3692a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.j a6 = androidx.appcompat.widget.j.a();
        Context context = this.f3595l;
        synchronized (a6) {
            z0 z0Var = a6.f798a;
            synchronized (z0Var) {
                l.e<WeakReference<Drawable.ConstantState>> eVar = z0Var.f1019b.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        this.T = new Configuration(this.f3595l.getResources().getConfiguration());
        y(false, false);
    }

    @Override // d.f
    public final void m() {
        String str;
        this.Q = true;
        y(false, true);
        I();
        Object obj = this.f3594k;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = v.j.b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                w wVar = this.f3599p;
                if (wVar == null) {
                    this.f3588d0 = true;
                } else {
                    wVar.e(true);
                }
            }
            synchronized (d.f.f3579i) {
                d.f.r(this);
                d.f.f3578h.add(new WeakReference<>(this));
            }
        }
        this.T = new Configuration(this.f3595l.getResources().getConfiguration());
        this.R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // d.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3594k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = d.f.f3579i
            monitor-enter(r0)
            d.f.r(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f3585a0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f3596m
            android.view.View r0 = r0.getDecorView()
            d.g$a r1 = r3.f3587c0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.S = r0
            int r0 = r3.U
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f3594k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            l.h<java.lang.String, java.lang.Integer> r0 = d.g.f3581j0
            java.lang.Object r1 = r3.f3594k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            l.h<java.lang.String, java.lang.Integer> r0 = d.g.f3581j0
            java.lang.Object r1 = r3.f3594k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            d.g$i r0 = r3.Y
            if (r0 == 0) goto L63
            r0.a()
        L63:
            d.g$g r0 = r3.Z
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.n():void");
    }

    @Override // d.f
    public final void o() {
        M();
        w wVar = this.f3599p;
        if (wVar != null) {
            wVar.u = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
        if (r10.equals("ImageButton") == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd A[Catch: all -> 0x0207, Exception -> 0x020d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020d, all -> 0x0207, blocks: (B:108:0x01d6, B:111:0x01e3, B:113:0x01e7, B:118:0x01fd), top: B:151:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // d.f
    public final void p() {
        y(true, false);
    }

    @Override // d.f
    public final void q() {
        M();
        w wVar = this.f3599p;
        if (wVar != null) {
            wVar.u = false;
            g.g gVar = wVar.f3710t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // d.f
    public final boolean s(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i6 = 108;
        } else if (i6 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i6 = 109;
        }
        if (this.L && i6 == 108) {
            return false;
        }
        if (this.H && i6 == 1) {
            this.H = false;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 5) {
                    if (i6 != 10) {
                        if (i6 != 108) {
                            if (i6 != 109) {
                                return this.f3596m.requestFeature(i6);
                            }
                            S();
                            this.I = true;
                            return true;
                        }
                        S();
                        this.H = true;
                        return true;
                    }
                    S();
                    this.J = true;
                    return true;
                }
                S();
                this.G = true;
                return true;
            }
            S();
            this.F = true;
            return true;
        }
        S();
        this.L = true;
        return true;
    }

    @Override // d.f
    public final void t(int i6) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3595l).inflate(i6, viewGroup);
        this.f3597n.a(this.f3596m.getCallback());
    }

    @Override // d.f
    public final void u(View view) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3597n.a(this.f3596m.getCallback());
    }

    @Override // d.f
    public final void v(View view, ViewGroup.LayoutParams layoutParams) {
        H();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3597n.a(this.f3596m.getCallback());
    }

    @Override // d.f
    public final void w(int i6) {
        this.V = i6;
    }

    @Override // d.f
    public final void x(CharSequence charSequence) {
        this.f3601r = charSequence;
        n0 n0Var = this.s;
        if (n0Var != null) {
            n0Var.setWindowTitle(charSequence);
            return;
        }
        w wVar = this.f3599p;
        if (wVar != null) {
            wVar.f3696e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.y(boolean, boolean):boolean");
    }

    public final void z(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f3596m == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof f)) {
                f fVar = new f(callback);
                this.f3597n = fVar;
                window.setCallback(fVar);
                Context context = this.f3595l;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f3582k0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.j a6 = androidx.appcompat.widget.j.a();
                    synchronized (a6) {
                        drawable = a6.f798a.f(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f3596m = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f3592h0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3593i0) != null) {
                        e.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f3593i0 = null;
                    }
                    Object obj = this.f3594k;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = e.a(activity);
                        }
                    }
                    this.f3592h0 = onBackInvokedDispatcher2;
                    T();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
}
