package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class m0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f1543a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1544b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1545c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1546d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1547e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1548f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ l0 f1549g;

    public m0(l0 l0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1549g = l0Var;
        this.f1543a = obj;
        this.f1544b = arrayList;
        this.f1547e = obj2;
        this.f1548f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        l0 l0Var = this.f1549g;
        Object obj = this.f1543a;
        if (obj != null) {
            l0Var.t(obj, this.f1544b, null);
        }
        Object obj2 = this.f1545c;
        if (obj2 != null) {
            l0Var.t(obj2, this.f1546d, null);
        }
        Object obj3 = this.f1547e;
        if (obj3 != null) {
            l0Var.t(obj3, this.f1548f, null);
        }
    }
}
