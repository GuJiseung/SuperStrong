package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a0;
import androidx.fragment.app.q;
import androidx.fragment.app.z;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import com.superstrong.android.R;
import f0.n;
import f0.o;
import f0.r;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v.l;
import v.m;
/* loaded from: classes.dex */
public class ComponentActivity extends v.h implements l0, androidx.lifecycle.h, x0.d, i, androidx.activity.result.f, w.b, w.c, l, m, n {

    /* renamed from: c  reason: collision with root package name */
    public final a.a f233c = new a.a();

    /* renamed from: d  reason: collision with root package name */
    public final o f234d = new o(new androidx.activity.b(0, this));

    /* renamed from: e  reason: collision with root package name */
    public final p f235e;

    /* renamed from: f  reason: collision with root package name */
    public final x0.c f236f;

    /* renamed from: g  reason: collision with root package name */
    public k0 f237g;

    /* renamed from: h  reason: collision with root package name */
    public d0 f238h;

    /* renamed from: i  reason: collision with root package name */
    public final OnBackPressedDispatcher f239i;

    /* renamed from: j  reason: collision with root package name */
    public final b f240j;

    /* renamed from: k  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0.a<Configuration>> f241k;

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0.a<Integer>> f242l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0.a<Intent>> f243m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0.a<v.i>> f244n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<e0.a<v.n>> f245o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f246p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f247q;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e6) {
                if (!TextUtils.equals(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e6;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.e {
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public k0 f252a;
    }

    public ComponentActivity() {
        p pVar = new p(this);
        this.f235e = pVar;
        x0.c cVar = new x0.c(this);
        this.f236f = cVar;
        this.f239i = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f240j = new b();
        this.f241k = new CopyOnWriteArrayList<>();
        this.f242l = new CopyOnWriteArrayList<>();
        this.f243m = new CopyOnWriteArrayList<>();
        this.f244n = new CopyOnWriteArrayList<>();
        this.f245o = new CopyOnWriteArrayList<>();
        this.f246p = false;
        this.f247q = false;
        pVar.a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.m
            public final void f(androidx.lifecycle.o oVar, j.b bVar) {
                View view;
                if (bVar == j.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        pVar.a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.m
            public final void f(androidx.lifecycle.o oVar, j.b bVar) {
                if (bVar == j.b.ON_DESTROY) {
                    ComponentActivity.this.f233c.f1b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.t().a();
                    }
                }
            }
        });
        pVar.a(new androidx.lifecycle.m() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.m
            public final void f(androidx.lifecycle.o oVar, j.b bVar) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f237g == null) {
                    d dVar = (d) componentActivity.getLastNonConfigurationInstance();
                    if (dVar != null) {
                        componentActivity.f237g = dVar.f252a;
                    }
                    if (componentActivity.f237g == null) {
                        componentActivity.f237g = new k0();
                    }
                }
                componentActivity.f235e.c(this);
            }
        });
        cVar.a();
        a0.b(this);
        cVar.f6661b.c("android:support:activity-result", new androidx.activity.c(0, this));
        x(new androidx.activity.d(this, 0));
    }

    private void y() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        l4.f.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        k.m(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.i
    public final OnBackPressedDispatcher a() {
        return this.f239i;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        y();
        super.addContentView(view, layoutParams);
    }

    @Override // x0.d
    public final x0.b b() {
        return this.f236f.f6661b;
    }

    @Override // f0.n
    public final void c(a0.c cVar) {
        o oVar = this.f234d;
        oVar.f3907b.add(cVar);
        oVar.f3906a.run();
    }

    @Override // w.c
    public final void f(q qVar) {
        this.f242l.add(qVar);
    }

    @Override // w.c
    public final void h(q qVar) {
        this.f242l.remove(qVar);
    }

    @Override // w.b
    public final void i(z zVar) {
        this.f241k.add(zVar);
    }

    @Override // androidx.lifecycle.h
    public final i0.b j() {
        if (this.f238h == null) {
            this.f238h = new d0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f238h;
    }

    @Override // androidx.lifecycle.h
    public final u0.a k() {
        u0.d dVar = new u0.d();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f6231a;
        if (application != null) {
            linkedHashMap.put(h0.f1741a, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.a0.f1708a, this);
        linkedHashMap.put(androidx.lifecycle.a0.f1709b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(androidx.lifecycle.a0.f1710c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // f0.n
    public final void l(a0.c cVar) {
        o oVar = this.f234d;
        oVar.f3907b.remove(cVar);
        if (((o.a) oVar.f3908c.remove(cVar)) == null) {
            oVar.f3906a.run();
            return;
        }
        throw null;
    }

    @Override // v.m
    public final void m(z zVar) {
        this.f245o.remove(zVar);
    }

    @Override // v.l
    public final void n(g gVar) {
        this.f244n.add(gVar);
    }

    @Override // w.b
    public final void o(z zVar) {
        this.f241k.remove(zVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i6, int i7, Intent intent) {
        if (this.f240j.a(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f239i.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<e0.a<Configuration>> it = this.f241k.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // v.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f236f.b(bundle);
        a.a aVar = this.f233c;
        aVar.f1b = this;
        Iterator it = aVar.f0a.iterator();
        while (it.hasNext()) {
            ((a.b) it.next()).a();
        }
        super.onCreate(bundle);
        x.c(this);
        if (b0.a.a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f239i;
            onBackPressedDispatcher.f258e = c.a(this);
            onBackPressedDispatcher.c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i6, Menu menu) {
        if (i6 == 0) {
            super.onCreatePanelMenu(i6, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator<r> it = this.f234d.f3907b.iterator();
            while (it.hasNext()) {
                it.next().c(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 != 0) {
            return false;
        }
        Iterator<r> it = this.f234d.f3907b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f246p) {
            return;
        }
        Iterator<e0.a<v.i>> it = this.f244n.iterator();
        while (it.hasNext()) {
            it.next().accept(new v.i(z5));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        this.f246p = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f246p = false;
            Iterator<e0.a<v.i>> it = this.f244n.iterator();
            while (it.hasNext()) {
                it.next().accept(new v.i(z5, 0));
            }
        } catch (Throwable th) {
            this.f246p = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<e0.a<Intent>> it = this.f243m.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        Iterator<r> it = this.f234d.f3907b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.f247q) {
            return;
        }
        Iterator<e0.a<v.n>> it = this.f245o.iterator();
        while (it.hasNext()) {
            it.next().accept(new v.n(z5));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        this.f247q = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f247q = false;
            Iterator<e0.a<v.n>> it = this.f245o.iterator();
            while (it.hasNext()) {
                it.next().accept(new v.n(z5, 0));
            }
        } catch (Throwable th) {
            this.f247q = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i6, View view, Menu menu) {
        if (i6 == 0) {
            super.onPreparePanel(i6, view, menu);
            Iterator<r> it = this.f234d.f3907b.iterator();
            while (it.hasNext()) {
                it.next().d(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        if (this.f240j.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        k0 k0Var = this.f237g;
        if (k0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            k0Var = dVar.f252a;
        }
        if (k0Var == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f252a = k0Var;
        return dVar2;
    }

    @Override // v.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        p pVar = this.f235e;
        if (pVar instanceof p) {
            j.c cVar = j.c.CREATED;
            pVar.e("setCurrentState");
            pVar.g(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.f236f.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator<e0.a<Integer>> it = this.f242l.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i6));
        }
    }

    @Override // androidx.activity.result.f
    public final androidx.activity.result.e q() {
        return this.f240j;
    }

    @Override // v.l
    public final void r(g gVar) {
        this.f244n.remove(gVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (z0.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // v.m
    public final void s(z zVar) {
        this.f245o.add(zVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i6) {
        y();
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        y();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        y();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i6) {
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9) {
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }

    @Override // androidx.lifecycle.l0
    public final k0 t() {
        if (getApplication() != null) {
            if (this.f237g == null) {
                d dVar = (d) getLastNonConfigurationInstance();
                if (dVar != null) {
                    this.f237g = dVar.f252a;
                }
                if (this.f237g == null) {
                    this.f237g = new k0();
                }
            }
            return this.f237g;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // v.h, androidx.lifecycle.o
    public final p v() {
        return this.f235e;
    }

    public final void x(a.b bVar) {
        a.a aVar = this.f233c;
        if (aVar.f1b != null) {
            bVar.a();
        }
        aVar.f0a.add(bVar);
    }
}
