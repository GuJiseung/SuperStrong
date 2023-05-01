package g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import g.a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4041a;

    /* renamed from: b  reason: collision with root package name */
    public final g.a f4042b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0039a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f4043a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f4044b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f4045c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final l.h<Menu, Menu> f4046d = new l.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f4044b = context;
            this.f4043a = callback;
        }

        @Override // g.a.InterfaceC0039a
        public final boolean a(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e6 = e(aVar);
            l.h<Menu, Menu> hVar = this.f4046d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new h.e(this.f4044b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f4043a.onCreateActionMode(e6, orDefault);
        }

        @Override // g.a.InterfaceC0039a
        public final boolean b(g.a aVar, MenuItem menuItem) {
            return this.f4043a.onActionItemClicked(e(aVar), new h.c(this.f4044b, (a0.b) menuItem));
        }

        @Override // g.a.InterfaceC0039a
        public final boolean c(g.a aVar, androidx.appcompat.view.menu.f fVar) {
            e e6 = e(aVar);
            l.h<Menu, Menu> hVar = this.f4046d;
            Menu orDefault = hVar.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new h.e(this.f4044b, fVar);
                hVar.put(fVar, orDefault);
            }
            return this.f4043a.onPrepareActionMode(e6, orDefault);
        }

        @Override // g.a.InterfaceC0039a
        public final void d(g.a aVar) {
            this.f4043a.onDestroyActionMode(e(aVar));
        }

        public final e e(g.a aVar) {
            ArrayList<e> arrayList = this.f4045c;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                e eVar = arrayList.get(i6);
                if (eVar != null && eVar.f4042b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f4044b, aVar);
            arrayList.add(eVar2);
            return eVar2;
        }
    }

    public e(Context context, g.a aVar) {
        this.f4041a = context;
        this.f4042b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f4042b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f4042b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new h.e(this.f4041a, this.f4042b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f4042b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f4042b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f4042b.f4027b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f4042b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f4042b.f4028c;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f4042b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f4042b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f4042b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i6) {
        this.f4042b.l(i6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f4042b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f4042b.f4027b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i6) {
        this.f4042b.n(i6);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f4042b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z5) {
        this.f4042b.p(z5);
    }
}
