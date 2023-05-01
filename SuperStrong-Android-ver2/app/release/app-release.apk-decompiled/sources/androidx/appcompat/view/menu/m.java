package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public final class m extends f implements SubMenu {
    public final h A;

    /* renamed from: z  reason: collision with root package name */
    public final f f509z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.f509z = fVar;
        this.A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.f509z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.f509z.e(fVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean f(h hVar) {
        return this.f509z.f(hVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final String j() {
        int i6;
        h hVar = this.A;
        if (hVar != null) {
            i6 = hVar.f451a;
        } else {
            i6 = 0;
        }
        if (i6 == 0) {
            return null;
        }
        return androidx.activity.j.a("android:menu:actionviewstates:", i6);
    }

    @Override // androidx.appcompat.view.menu.f
    public final f k() {
        return this.f509z.k();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean m() {
        return this.f509z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean n() {
        return this.f509z.n();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.f509z.o();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z5) {
        this.f509z.setGroupDividerEnabled(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        u(0, null, i6, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        u(i6, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.A.setIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f509z.setQwertyMode(z5);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }
}
