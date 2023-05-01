package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
/* loaded from: classes.dex */
public final class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final a0.c f4376e;

    public g(Context context, a0.c cVar) {
        super(context, cVar);
        this.f4376e = cVar;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f4376e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return c(this.f4376e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i6) {
        this.f4376e.setHeaderIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f4376e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i6) {
        this.f4376e.setHeaderTitle(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f4376e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f4376e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i6) {
        this.f4376e.setIcon(i6);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f4376e.setIcon(drawable);
        return this;
    }
}
