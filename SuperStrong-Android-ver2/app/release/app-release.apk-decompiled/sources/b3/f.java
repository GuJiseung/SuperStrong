package b3;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import b3.g;
import com.google.android.material.bottomnavigation.BottomNavigationView;
/* loaded from: classes.dex */
public final class f implements f.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2423b;

    public f(BottomNavigationView bottomNavigationView) {
        this.f2423b = bottomNavigationView;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        g gVar = this.f2423b;
        gVar.getClass();
        g.b bVar = gVar.f2428f;
        if (bVar != null && !bVar.a(menuItem)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f fVar) {
    }
}
