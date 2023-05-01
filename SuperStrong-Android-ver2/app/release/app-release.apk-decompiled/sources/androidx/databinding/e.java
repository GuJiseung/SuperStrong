package androidx.databinding;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class e implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1306a;

    public e(ViewDataBinding viewDataBinding) {
        this.f1306a = viewDataBinding;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f1306a.f1295e.run();
    }
}
