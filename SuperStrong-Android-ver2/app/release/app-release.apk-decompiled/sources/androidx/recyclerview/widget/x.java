package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class x extends f0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2171d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2172e;

    /* loaded from: classes.dex */
    public static class a extends f0.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f2173d;

        /* renamed from: e  reason: collision with root package name */
        public final WeakHashMap f2174e = new WeakHashMap();

        public a(x xVar) {
            this.f2173d = xVar;
        }

        @Override // f0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // f0.a
        public final g0.g b(View view) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // f0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // f0.a
        public final void d(View view, g0.f fVar) {
            boolean z5;
            x xVar = this.f2173d;
            RecyclerView recyclerView = xVar.f2171d;
            if (recyclerView.s && !recyclerView.A && !recyclerView.f1837e.g()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                RecyclerView recyclerView2 = xVar.f2171d;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().V(view, fVar);
                    f0.a aVar = (f0.a) this.f2174e.get(view);
                    if (aVar != null) {
                        aVar.d(view, fVar);
                        return;
                    }
                }
            }
            this.f3856a.onInitializeAccessibilityNodeInfo(view, fVar.f4095a);
        }

        @Override // f0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // f0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            f0.a aVar = (f0.a) this.f2174e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // f0.a
        public final boolean g(View view, int i6, Bundle bundle) {
            boolean z5;
            x xVar = this.f2173d;
            RecyclerView recyclerView = xVar.f2171d;
            if (recyclerView.s && !recyclerView.A && !recyclerView.f1837e.g()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                RecyclerView recyclerView2 = xVar.f2171d;
                if (recyclerView2.getLayoutManager() != null) {
                    f0.a aVar = (f0.a) this.f2174e.get(view);
                    if (aVar != null) {
                        if (aVar.g(view, i6, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i6, bundle)) {
                        return true;
                    }
                    RecyclerView.s sVar = recyclerView2.getLayoutManager().f1904b.f1833c;
                    return false;
                }
            }
            return super.g(view, i6, bundle);
        }

        @Override // f0.a
        public final void h(View view, int i6) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            if (aVar != null) {
                aVar.h(view, i6);
            } else {
                super.h(view, i6);
            }
        }

        @Override // f0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            f0.a aVar = (f0.a) this.f2174e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f2171d = recyclerView;
        a aVar = this.f2172e;
        this.f2172e = aVar == null ? new a(this) : aVar;
    }

    @Override // f0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z5;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f2171d;
            if (recyclerView.s && !recyclerView.A && !recyclerView.f1837e.g()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(accessibilityEvent);
                }
            }
        }
    }

    @Override // f0.a
    public final void d(View view, g0.f fVar) {
        boolean z5;
        this.f3856a.onInitializeAccessibilityNodeInfo(view, fVar.f4095a);
        RecyclerView recyclerView = this.f2171d;
        if (recyclerView.s && !recyclerView.A && !recyclerView.f1837e.g()) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5 && recyclerView.getLayoutManager() != null) {
            RecyclerView.l layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f1904b;
            layoutManager.U(recyclerView2.f1833c, recyclerView2.f1838e0, fVar);
        }
    }

    @Override // f0.a
    public final boolean g(View view, int i6, Bundle bundle) {
        boolean z5 = true;
        if (super.g(view, i6, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2171d;
        if (recyclerView.s && !recyclerView.A && !recyclerView.f1837e.g()) {
            z5 = false;
        }
        if (z5 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1904b;
        return layoutManager.h0(recyclerView2.f1833c, recyclerView2.f1838e0, i6, bundle);
    }
}
