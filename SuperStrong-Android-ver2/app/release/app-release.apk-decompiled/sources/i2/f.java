package i2;

import android.view.View;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final View f4617a;

    /* renamed from: b  reason: collision with root package name */
    public int f4618b;

    /* renamed from: c  reason: collision with root package name */
    public int f4619c;

    /* renamed from: d  reason: collision with root package name */
    public int f4620d;

    public f(View view) {
        this.f4617a = view;
    }

    public final void a() {
        int i6 = this.f4620d;
        View view = this.f4617a;
        int top = i6 - (view.getTop() - this.f4618b);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f4619c));
    }
}
