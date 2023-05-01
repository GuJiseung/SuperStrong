package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public b f1193b;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;
        public final float r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f1194s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f1195t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f1196u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f1197v0;
        public final float w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f1198x0;

        /* renamed from: y0  reason: collision with root package name */
        public final float f1199y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f1200z0;

        public a() {
            this.r0 = 1.0f;
            this.f1194s0 = false;
            this.f1195t0 = 0.0f;
            this.f1196u0 = 0.0f;
            this.f1197v0 = 0.0f;
            this.w0 = 0.0f;
            this.f1198x0 = 1.0f;
            this.f1199y0 = 1.0f;
            this.f1200z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.r0 = 1.0f;
            this.f1194s0 = false;
            this.f1195t0 = 0.0f;
            this.f1196u0 = 0.0f;
            this.f1197v0 = 0.0f;
            this.w0 = 0.0f;
            this.f1198x0 = 1.0f;
            this.f1199y0 = 1.0f;
            this.f1200z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2642e);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 15) {
                    this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 28) {
                    this.f1195t0 = obtainStyledAttributes.getFloat(index, this.f1195t0);
                    this.f1194s0 = true;
                } else if (index == 23) {
                    this.f1197v0 = obtainStyledAttributes.getFloat(index, this.f1197v0);
                } else if (index == 24) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 22) {
                    this.f1196u0 = obtainStyledAttributes.getFloat(index, this.f1196u0);
                } else if (index == 20) {
                    this.f1198x0 = obtainStyledAttributes.getFloat(index, this.f1198x0);
                } else if (index == 21) {
                    this.f1199y0 = obtainStyledAttributes.getFloat(index, this.f1199y0);
                } else if (index == 16) {
                    this.f1200z0 = obtainStyledAttributes.getFloat(index, this.f1200z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f1193b == null) {
            this.f1193b = new b();
        }
        b bVar = this.f1193b;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.f1106c;
        hashMap.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f1105b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new b.a());
            }
            b.a aVar2 = hashMap.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    aVar2.c(id, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0009b c0009b = aVar2.f1110d;
                        c0009b.f1141h0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        c0009b.f1137f0 = barrier.getType();
                        c0009b.f1143i0 = barrier.getReferencedIds();
                        c0009b.f1139g0 = barrier.getMargin();
                    }
                }
                aVar2.c(id, aVar);
            }
        }
        return this.f1193b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
    }
}
