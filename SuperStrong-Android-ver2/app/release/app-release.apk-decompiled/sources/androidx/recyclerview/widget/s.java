package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f2163a;

    /* renamed from: b  reason: collision with root package name */
    public int f2164b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2165c = new Rect();

    public s(RecyclerView.l lVar) {
        this.f2163a = lVar;
    }

    public static s a(RecyclerView.l lVar, int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return new r(lVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new q(lVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i6);
}
