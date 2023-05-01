package m2;

import android.view.View;
import f0.g0;
import f0.r0;
import f0.x0;
import java.util.WeakHashMap;
import z2.q;
/* loaded from: classes.dex */
public final class c implements q.b {
    @Override // z2.q.b
    public final x0 a(View view, x0 x0Var, q.c cVar) {
        int i6;
        cVar.f7007d = x0Var.a() + cVar.f7007d;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        boolean z5 = true;
        if (g0.e.d(view) != 1) {
            z5 = false;
        }
        int b6 = x0Var.b();
        int c6 = x0Var.c();
        int i7 = cVar.f7004a;
        if (z5) {
            i6 = c6;
        } else {
            i6 = b6;
        }
        int i8 = i7 + i6;
        cVar.f7004a = i8;
        int i9 = cVar.f7006c;
        if (!z5) {
            b6 = c6;
        }
        int i10 = i9 + b6;
        cVar.f7006c = i10;
        g0.e.k(view, i8, cVar.f7005b, i10, cVar.f7007d);
        return x0Var;
    }
}
