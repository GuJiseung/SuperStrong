package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.j;
/* loaded from: classes.dex */
public final class w extends e {
    final /* synthetic */ v this$0;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            w.this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            v vVar = w.this.this$0;
            int i6 = vVar.f1772b + 1;
            vVar.f1772b = i6;
            if (i6 == 1 && vVar.f1775e) {
                vVar.f1777g.f(j.b.ON_START);
                vVar.f1775e = false;
            }
        }
    }

    public w(v vVar) {
        this.this$0 = vVar;
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = x.f1782c;
            ((x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1783b = this.this$0.f1779i;
        }
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        v vVar = this.this$0;
        int i6 = vVar.f1773c - 1;
        vVar.f1773c = i6;
        if (i6 == 0) {
            vVar.f1776f.postDelayed(vVar.f1778h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        v vVar = this.this$0;
        int i6 = vVar.f1772b - 1;
        vVar.f1772b = i6;
        if (i6 == 0 && vVar.f1774d) {
            vVar.f1777g.f(j.b.ON_STOP);
            vVar.f1775e = true;
        }
    }
}
