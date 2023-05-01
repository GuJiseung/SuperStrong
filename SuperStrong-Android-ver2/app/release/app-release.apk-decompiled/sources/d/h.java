package d;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.s1;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import f0.x;
import f0.x0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w.a;
/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f3642a;

    public h(g gVar) {
        this.f3642a = gVar;
    }

    @Override // f0.x
    public final x0 a(View view, x0 x0Var) {
        boolean z5;
        x0 x0Var2;
        x0.e bVar;
        boolean z6;
        int b6;
        int c6;
        boolean z7;
        boolean z8;
        int i6;
        int d6 = x0Var.d();
        g gVar = this.f3642a;
        gVar.getClass();
        int d7 = x0Var.d();
        ActionBarContextView actionBarContextView = gVar.f3604w;
        int i7 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gVar.f3604w.getLayoutParams();
            if (gVar.f3604w.isShown()) {
                if (gVar.f3589e0 == null) {
                    gVar.f3589e0 = new Rect();
                    gVar.f3590f0 = new Rect();
                }
                Rect rect = gVar.f3589e0;
                Rect rect2 = gVar.f3590f0;
                rect.set(x0Var.b(), x0Var.d(), x0Var.c(), x0Var.a());
                ViewGroup viewGroup = gVar.C;
                Method method = s1.f934a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e6) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                    }
                }
                int i8 = rect.top;
                int i9 = rect.left;
                int i10 = rect.right;
                ViewGroup viewGroup2 = gVar.C;
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                x0 a6 = g0.j.a(viewGroup2);
                if (a6 == null) {
                    b6 = 0;
                } else {
                    b6 = a6.b();
                }
                if (a6 == null) {
                    c6 = 0;
                } else {
                    c6 = a6.c();
                }
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z7 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z7 = true;
                }
                Context context = gVar.f3595l;
                if (i8 > 0 && gVar.E == null) {
                    View view2 = new View(context);
                    gVar.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b6;
                    layoutParams.rightMargin = c6;
                    gVar.C.addView(gVar.E, -1, layoutParams);
                } else {
                    View view3 = gVar.E;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i11 = marginLayoutParams2.height;
                        int i12 = marginLayoutParams.topMargin;
                        if (i11 != i12 || marginLayoutParams2.leftMargin != b6 || marginLayoutParams2.rightMargin != c6) {
                            marginLayoutParams2.height = i12;
                            marginLayoutParams2.leftMargin = b6;
                            marginLayoutParams2.rightMargin = c6;
                            gVar.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = gVar.E;
                if (view4 != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5 && view4.getVisibility() != 0) {
                    View view5 = gVar.E;
                    if ((g0.d.g(view5) & 8192) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        Object obj = w.a.f6573a;
                        i6 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = w.a.f6573a;
                        i6 = R.color.abc_decor_view_status_guard;
                    }
                    view5.setBackgroundColor(a.c.a(context, i6));
                }
                if (!gVar.J && z5) {
                    d7 = 0;
                }
                z6 = z7;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
                z6 = true;
            } else {
                z5 = false;
                z6 = false;
            }
            if (z6) {
                gVar.f3604w.setLayoutParams(marginLayoutParams);
            }
        } else {
            z5 = false;
        }
        View view6 = gVar.E;
        if (view6 != null) {
            if (!z5) {
                i7 = 8;
            }
            view6.setVisibility(i7);
        }
        if (d6 != d7) {
            int b7 = x0Var.b();
            int c7 = x0Var.c();
            int a7 = x0Var.a();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                bVar = new x0.d(x0Var);
            } else if (i13 >= 29) {
                bVar = new x0.c(x0Var);
            } else {
                bVar = new x0.b(x0Var);
            }
            bVar.d(y.b.a(b7, d7, c7, a7));
            x0Var2 = bVar.b();
        } else {
            x0Var2 = x0Var;
        }
        WeakHashMap<View, r0> weakHashMap2 = g0.f3878a;
        WindowInsets f6 = x0Var2.f();
        if (f6 != null) {
            WindowInsets b8 = g0.h.b(view, f6);
            if (!b8.equals(f6)) {
                return x0.g(b8, view);
            }
            return x0Var2;
        }
        return x0Var2;
    }
}
