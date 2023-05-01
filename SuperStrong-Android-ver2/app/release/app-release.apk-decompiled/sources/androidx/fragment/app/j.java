package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f1523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1524c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Rect f1525d;

    public j(p0 p0Var, View view, Rect rect) {
        this.f1523b = p0Var;
        this.f1524c = view;
        this.f1525d = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1523b.getClass();
        p0.g(this.f1524c, this.f1525d);
    }
}
