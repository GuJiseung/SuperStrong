package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class t extends o {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ u f2166q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, Context context) {
        super(context);
        this.f2166q = uVar;
    }

    @Override // androidx.recyclerview.widget.o, androidx.recyclerview.widget.RecyclerView.w
    public final void c(View view, RecyclerView.w.a aVar) {
        u uVar = this.f2166q;
        int[] b6 = uVar.b(uVar.f2029a.getLayoutManager(), view);
        int i6 = b6[0];
        int i7 = b6[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i6), Math.abs(i7))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f2155j;
            aVar.f1952a = i6;
            aVar.f1953b = i7;
            aVar.f1954c = ceil;
            aVar.f1956e = decelerateInterpolator;
            aVar.f1957f = true;
        }
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o
    public final int g(int i6) {
        return Math.min(100, super.g(i6));
    }
}
