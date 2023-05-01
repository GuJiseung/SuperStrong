package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.j;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: b  reason: collision with root package name */
    public final Context f370b;

    /* renamed from: c  reason: collision with root package name */
    public Context f371c;

    /* renamed from: d  reason: collision with root package name */
    public f f372d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f373e;

    /* renamed from: f  reason: collision with root package name */
    public j.a f374f;

    /* renamed from: g  reason: collision with root package name */
    public final int f375g = R.layout.abc_action_menu_layout;

    /* renamed from: h  reason: collision with root package name */
    public final int f376h = R.layout.abc_action_menu_item_layout;

    /* renamed from: i  reason: collision with root package name */
    public k f377i;

    /* renamed from: j  reason: collision with root package name */
    public int f378j;

    public a(Context context) {
        this.f370b = context;
        this.f373e = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.f378j;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(j.a aVar) {
        this.f374f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }
}
