package androidx.fragment.app;

import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.v0;
import b0.d;
/* loaded from: classes.dex */
public final class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0.b f1463b;

    public f(Animator animator, v0.b bVar) {
        this.f1462a = animator;
        this.f1463b = bVar;
    }

    @Override // b0.d.a
    public final void onCancel() {
        this.f1462a.end();
        if (a0.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + this.f1463b + " has been canceled.");
        }
    }
}
