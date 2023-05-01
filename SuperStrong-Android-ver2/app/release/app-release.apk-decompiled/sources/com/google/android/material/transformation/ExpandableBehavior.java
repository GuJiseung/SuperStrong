package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f0.g0;
import f0.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f3504a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3505b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f3506c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x2.a f3507d;

        public a(View view, int i6, x2.a aVar) {
            this.f3505b = view;
            this.f3506c = i6;
            this.f3507d = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f3505b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f3504a == this.f3506c) {
                x2.a aVar = this.f3507d;
                expandableBehavior.s((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f3504a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3504a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z5;
        int i6;
        x2.a aVar = (x2.a) view2;
        int i7 = 2;
        if (!aVar.a() ? this.f3504a != 1 : (i6 = this.f3504a) != 0 && i6 != 2) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z5) {
            return false;
        }
        if (aVar.a()) {
            i7 = 1;
        }
        this.f3504a = i7;
        s((View) aVar, view, aVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i6) {
        x2.a aVar;
        boolean z5;
        int i7;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (!g0.g.c(view)) {
            ArrayList e6 = coordinatorLayout.e(view);
            int size = e6.size();
            int i8 = 0;
            while (true) {
                if (i8 < size) {
                    View view2 = (View) e6.get(i8);
                    if (b(view, view2)) {
                        aVar = (x2.a) view2;
                        break;
                    }
                    i8++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i9 = 2;
                if (!aVar.a() ? this.f3504a != 1 : (i7 = this.f3504a) != 0 && i7 != 2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    if (aVar.a()) {
                        i9 = 1;
                    }
                    this.f3504a = i9;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i9, aVar));
                }
            }
        }
        return false;
    }

    public abstract void s(View view, View view2, boolean z5, boolean z6);
}
