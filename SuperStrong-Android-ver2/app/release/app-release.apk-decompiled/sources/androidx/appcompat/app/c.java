package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.k;
import androidx.appcompat.widget.r1;
import androidx.fragment.app.r;
import com.superstrong.android.R;
import d.d;
import d.f;
import d.g;
import d.r;
import d.w;
import java.util.ArrayList;
import v.a;
import v.j;
import w.a;
/* loaded from: classes.dex */
public class c extends r implements d {

    /* renamed from: w  reason: collision with root package name */
    public g f339w;

    public c() {
        this.f236f.f6661b.c("androidx:appcompat", new d.b(this));
        x(new d.c(this));
    }

    public final f B() {
        if (this.f339w == null) {
            r.a aVar = f.f3572b;
            this.f339w = new g(this, null, this, this);
        }
        return this.f339w;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        B().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(B().d(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((g) B()).M();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // v.h, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g) B()).M();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i6) {
        return (T) B().e(i6);
    }

    @Override // d.d
    public final void g() {
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return B().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i6 = r1.f918a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        B().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        B().l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        B().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z5;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        Intent a6;
        Intent component;
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        g gVar = (g) B();
        gVar.M();
        w wVar = gVar.f3599p;
        if (menuItem.getItemId() == 16908332 && wVar != null && (wVar.f3696e.o() & 4) != 0 && (a6 = j.a(this)) != null) {
            if (j.a.c(this, a6)) {
                ArrayList arrayList = new ArrayList();
                Intent a7 = j.a(this);
                if (a7 == null) {
                    a7 = j.a(this);
                }
                if (a7 != null) {
                    ComponentName component2 = a7.getComponent();
                    if (component2 == null) {
                        component2 = a7.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            String b6 = j.b(this, component2);
                            if (b6 == null) {
                                component = null;
                            } else {
                                ComponentName componentName = new ComponentName(component2.getPackageName(), b6);
                                if (j.b(this, componentName) == null) {
                                    component = Intent.makeMainActivity(componentName);
                                } else {
                                    component = new Intent().setComponent(componentName);
                                }
                            }
                            if (component == null) {
                                break;
                            }
                            arrayList.add(size, component);
                            component2 = component.getComponent();
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(e6);
                        }
                    }
                    arrayList.add(a7);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = w.a.f6573a;
                    a.C0098a.a(this, intentArr, null);
                    try {
                        int i7 = v.a.f6243b;
                        a.C0094a.a(this);
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            j.a.b(this, a6);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i6, Menu menu) {
        return super.onMenuOpened(i6, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g) B()).H();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        B().o();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onStart() {
        super.onStart();
        B().p();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onStop() {
        super.onStop();
        B().q();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i6) {
        super.onTitleChanged(charSequence, i6);
        B().x(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((g) B()).M();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // d.d
    public final void p() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i6) {
        y();
        B().t(i6);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        y();
        B().u(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        B().v(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        super.setTheme(i6);
        B().w(i6);
    }

    @Override // d.d
    public final void u() {
    }

    public final void y() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        l4.f.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        k.m(getWindow().getDecorView(), this);
    }
}
