package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.superstrong.android.R;
import f0.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1379b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1380c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1381d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        l4.f.f(context, "context");
        this.f1379b = new ArrayList();
        this.f1380c = new ArrayList();
        this.f1382e = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2677n0, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1380c.contains(view)) {
            this.f1379b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        o oVar;
        l4.f.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof o) {
            oVar = (o) tag;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            super.addView(view, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f0.x0 x0Var;
        l4.f.f(windowInsets, "insets");
        f0.x0 g2 = f0.x0.g(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1381d;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            l4.f.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            x0Var = f0.x0.g(onApplyWindowInsets, null);
        } else {
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            WindowInsets f6 = g2.f();
            if (f6 != null) {
                WindowInsets b6 = g0.h.b(this, f6);
                if (!b6.equals(f6)) {
                    g2 = f0.x0.g(b6, this);
                }
            }
            x0Var = g2;
        }
        if (!x0Var.f3921a.m()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                WeakHashMap<View, f0.r0> weakHashMap2 = f0.g0.f3878a;
                WindowInsets f7 = x0Var.f();
                if (f7 != null) {
                    WindowInsets a6 = g0.h.a(childAt, f7);
                    if (!a6.equals(f7)) {
                        f0.x0.g(a6, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l4.f.f(canvas, "canvas");
        if (this.f1382e) {
            Iterator it = this.f1379b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        l4.f.f(canvas, "canvas");
        l4.f.f(view, "child");
        if (this.f1382e) {
            ArrayList arrayList = this.f1379b;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        l4.f.f(view, "view");
        this.f1380c.remove(view);
        if (this.f1379b.remove(view)) {
            this.f1382e = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends o> F getFragment() {
        r rVar;
        o oVar;
        a0 z5;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            rVar = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof o) {
                    oVar = (o) tag;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                oVar = null;
                break;
            }
        }
        if (oVar != null) {
            if (oVar.q()) {
                z5 = oVar.g();
            } else {
                throw new IllegalStateException("The Fragment " + oVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof r) {
                    rVar = (r) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rVar != null) {
                z5 = rVar.z();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) z5.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l4.f.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            l4.f.e(childAt, "view");
            a(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        l4.f.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i6) {
        View childAt = getChildAt(i6);
        l4.f.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        l4.f.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            l4.f.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i6, i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i6, int i7) {
        int i8 = i6 + i7;
        for (int i9 = i6; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            l4.f.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i6, i7);
    }

    public final void setDrawDisappearingViewsLast(boolean z5) {
        this.f1382e = z5;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        l4.f.f(onApplyWindowInsetsListener, "listener");
        this.f1381d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        l4.f.f(view, "view");
        if (view.getParent() == this) {
            this.f1380c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, a0 a0Var) {
        super(context, attributeSet);
        View view;
        l4.f.f(context, "context");
        l4.f.f(attributeSet, "attrs");
        l4.f.f(a0Var, "fm");
        this.f1379b = new ArrayList();
        this.f1380c = new ArrayList();
        this.f1382e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2677n0, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        o D = a0Var.D(id);
        if (classAttribute != null && D == null) {
            if (id == -1) {
                throw new IllegalStateException(b5.b.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            v G = a0Var.G();
            context.getClassLoader();
            o a6 = G.a(classAttribute);
            l4.f.e(a6, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a6.D = true;
            w<?> wVar = a6.f1584t;
            if ((wVar == null ? null : wVar.f1665c) != null) {
                a6.D = true;
            }
            a aVar = new a(a0Var);
            aVar.f1513o = true;
            a6.E = this;
            aVar.f(getId(), a6, string, 1);
            if (!aVar.f1505g) {
                aVar.f1383p.A(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = a0Var.f1388c.e().iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            o oVar = g0Var.f1484c;
            if (oVar.f1587x == getId() && (view = oVar.F) != null && view.getParent() == null) {
                oVar.E = this;
                g0Var.b();
            }
        }
    }
}
