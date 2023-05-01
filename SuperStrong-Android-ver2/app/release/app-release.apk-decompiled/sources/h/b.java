package h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.h;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4361a;

    /* renamed from: b  reason: collision with root package name */
    public h<a0.b, MenuItem> f4362b;

    /* renamed from: c  reason: collision with root package name */
    public h<a0.c, SubMenu> f4363c;

    public b(Context context) {
        this.f4361a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof a0.b) {
            a0.b bVar = (a0.b) menuItem;
            if (this.f4362b == null) {
                this.f4362b = new h<>();
            }
            MenuItem orDefault = this.f4362b.getOrDefault(bVar, null);
            if (orDefault == null) {
                c cVar = new c(this.f4361a, bVar);
                this.f4362b.put(bVar, cVar);
                return cVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof a0.c) {
            a0.c cVar = (a0.c) subMenu;
            if (this.f4363c == null) {
                this.f4363c = new h<>();
            }
            SubMenu orDefault = this.f4363c.getOrDefault(cVar, null);
            if (orDefault == null) {
                g gVar = new g(this.f4361a, cVar);
                this.f4363c.put(cVar, gVar);
                return gVar;
            }
            return orDefault;
        }
        return subMenu;
    }
}
