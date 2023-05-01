package q;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.d;
/* loaded from: classes.dex */
public final class c extends androidx.constraintlayout.widget.a implements d.c {

    /* renamed from: j  reason: collision with root package name */
    public boolean f5736j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5737k;

    /* renamed from: l  reason: collision with root package name */
    public float f5738l;

    /* renamed from: m  reason: collision with root package name */
    public View[] f5739m;

    @Override // q.d.c
    public final void a() {
    }

    @Override // q.d.c
    public final void b() {
    }

    public float getProgress() {
        return this.f5738l;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.a.f2646i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.f5736j = obtainStyledAttributes.getBoolean(index, this.f5736j);
                } else if (index == 0) {
                    this.f5737k = obtainStyledAttributes.getBoolean(index, this.f5737k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f6) {
        this.f5738l = f6;
        int i6 = 0;
        if (this.f1094c > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f1099h;
            if (viewArr == null || viewArr.length != this.f1094c) {
                this.f1099h = new View[this.f1094c];
            }
            for (int i7 = 0; i7 < this.f1094c; i7++) {
                this.f1099h[i7] = constraintLayout.f1028b.get(this.f1093b[i7]);
            }
            this.f5739m = this.f1099h;
            while (i6 < this.f1094c) {
                View view = this.f5739m[i6];
                i6++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i6 < childCount) {
            boolean z5 = viewGroup.getChildAt(i6) instanceof c;
            i6++;
        }
    }
}
