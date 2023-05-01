package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b.d f407b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MenuItem f408c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f f409d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b.c f410e;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.f410e = cVar;
        this.f407b = dVar;
        this.f408c = hVar;
        this.f409d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.f407b;
        if (dVar != null) {
            b.c cVar = this.f410e;
            b.this.B = true;
            dVar.f405b.c(false);
            b.this.B = false;
        }
        MenuItem menuItem = this.f408c;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f409d.q(menuItem, null, 4);
        }
    }
}
