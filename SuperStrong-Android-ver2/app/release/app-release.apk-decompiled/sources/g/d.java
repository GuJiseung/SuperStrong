package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import g.a;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class d extends a implements f.a {

    /* renamed from: d  reason: collision with root package name */
    public final Context f4035d;

    /* renamed from: e  reason: collision with root package name */
    public final ActionBarContextView f4036e;

    /* renamed from: f  reason: collision with root package name */
    public final a.InterfaceC0039a f4037f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f4038g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4039h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.appcompat.view.menu.f f4040i;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0039a interfaceC0039a) {
        this.f4035d = context;
        this.f4036e = actionBarContextView;
        this.f4037f = interfaceC0039a;
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(actionBarContextView.getContext());
        fVar.f437l = 1;
        this.f4040i = fVar;
        fVar.f430e = this;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f4037f.b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
        i();
        androidx.appcompat.widget.c cVar = this.f4036e.f676e;
        if (cVar != null) {
            cVar.n();
        }
    }

    @Override // g.a
    public final void c() {
        if (this.f4039h) {
            return;
        }
        this.f4039h = true;
        this.f4037f.d(this);
    }

    @Override // g.a
    public final View d() {
        WeakReference<View> weakReference = this.f4038g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // g.a
    public final androidx.appcompat.view.menu.f e() {
        return this.f4040i;
    }

    @Override // g.a
    public final MenuInflater f() {
        return new f(this.f4036e.getContext());
    }

    @Override // g.a
    public final CharSequence g() {
        return this.f4036e.getSubtitle();
    }

    @Override // g.a
    public final CharSequence h() {
        return this.f4036e.getTitle();
    }

    @Override // g.a
    public final void i() {
        this.f4037f.c(this, this.f4040i);
    }

    @Override // g.a
    public final boolean j() {
        return this.f4036e.f529t;
    }

    @Override // g.a
    public final void k(View view) {
        this.f4036e.setCustomView(view);
        this.f4038g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // g.a
    public final void l(int i6) {
        m(this.f4035d.getString(i6));
    }

    @Override // g.a
    public final void m(CharSequence charSequence) {
        this.f4036e.setSubtitle(charSequence);
    }

    @Override // g.a
    public final void n(int i6) {
        o(this.f4035d.getString(i6));
    }

    @Override // g.a
    public final void o(CharSequence charSequence) {
        this.f4036e.setTitle(charSequence);
    }

    @Override // g.a
    public final void p(boolean z5) {
        this.f4028c = z5;
        this.f4036e.setTitleOptional(z5);
    }
}
