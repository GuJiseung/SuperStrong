package z2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import f0.g0;
import f0.r0;
import f0.x;
import f0.x0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class q {

    /* loaded from: classes.dex */
    public class a implements x {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7002a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f7003b;

        public a(b bVar, c cVar) {
            this.f7002a = bVar;
            this.f7003b = cVar;
        }

        @Override // f0.x
        public final x0 a(View view, x0 x0Var) {
            return this.f7002a.a(view, x0Var, new c(this.f7003b));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        x0 a(View view, x0 x0Var, c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f7004a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7005b;

        /* renamed from: c  reason: collision with root package name */
        public int f7006c;

        /* renamed from: d  reason: collision with root package name */
        public int f7007d;

        public c(int i6, int i7, int i8, int i9) {
            this.f7004a = i6;
            this.f7005b = i7;
            this.f7006c = i8;
            this.f7007d = i9;
        }

        public c(c cVar) {
            this.f7004a = cVar.f7004a;
            this.f7005b = cVar.f7005b;
            this.f7006c = cVar.f7006c;
            this.f7007d = cVar.f7007d;
        }
    }

    public static void a(View view, b bVar) {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        g0.i.u(view, new a(bVar, new c(g0.e.f(view), view.getPaddingTop(), g0.e.e(view), view.getPaddingBottom())));
        if (g0.g.b(view)) {
            g0.h.c(view);
        } else {
            view.addOnAttachStateChangeListener(new r());
        }
    }

    public static float b(Context context, int i6) {
        return TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }

    public static boolean c(View view) {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.d(view) == 1) {
            return true;
        }
        return false;
    }

    public static PorterDuff.Mode d(int i6, PorterDuff.Mode mode) {
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 9) {
                    switch (i6) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
