package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
/* loaded from: classes.dex */
public abstract class z extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2175g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i6;
        int i7;
        int i8 = cVar.f1900a;
        int i9 = cVar.f1901b;
        if (a0Var2.o()) {
            int i10 = cVar.f1900a;
            i7 = cVar.f1901b;
            i6 = i10;
        } else {
            i6 = cVar2.f1900a;
            i7 = cVar2.f1901b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.g(a0Var, i8, i9, i6, i7);
        }
        View view = a0Var.f1873a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        kVar.l(a0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        kVar.l(a0Var2);
        View view2 = a0Var2.f1873a;
        view2.setTranslationX(-((int) ((i6 - i8) - translationX)));
        view2.setTranslationY(-((int) ((i7 - i9) - translationY)));
        view2.setAlpha(0.0f);
        kVar.f2082k.add(new k.a(a0Var, a0Var2, i8, i9, i6, i7));
        return true;
    }

    public abstract boolean g(RecyclerView.a0 a0Var, int i6, int i7, int i8, int i9);
}
