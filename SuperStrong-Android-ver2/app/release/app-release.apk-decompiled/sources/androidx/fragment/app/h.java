package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.fragment.app.v0;
import b0.d;
/* loaded from: classes.dex */
public final class h implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1488a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m.a f1490c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v0.b f1491d;

    public h(View view, ViewGroup viewGroup, m.a aVar, v0.b bVar) {
        this.f1488a = view;
        this.f1489b = viewGroup;
        this.f1490c = aVar;
        this.f1491d = bVar;
    }

    @Override // b0.d.a
    public final void onCancel() {
        View view = this.f1488a;
        view.clearAnimation();
        this.f1489b.endViewTransition(view);
        this.f1490c.a();
        if (a0.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1491d + " has been cancelled.");
        }
    }
}
