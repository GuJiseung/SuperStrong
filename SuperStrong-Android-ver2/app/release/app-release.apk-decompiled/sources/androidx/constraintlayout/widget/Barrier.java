package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class Barrier extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f1024j;

    /* renamed from: k  reason: collision with root package name */
    public int f1025k;

    /* renamed from: l  reason: collision with root package name */
    public o.a f1026l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1026l.f5383v0;
    }

    public int getMargin() {
        return this.f1026l.w0;
    }

    public int getType() {
        return this.f1024j;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1026l = new o.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.a.f2640c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1026l.f5383v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1026l.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1096e = this.f1026l;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    @Override // androidx.constraintlayout.widget.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(o.d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1024j
            r3.f1025k = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f1025k = r5
        L17:
            boolean r5 = r4 instanceof o.a
            if (r5 == 0) goto L21
            o.a r4 = (o.a) r4
            int r5 = r3.f1025k
            r4.f5382u0 = r5
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(o.d, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f1026l.f5383v0 = z5;
    }

    public void setDpMargin(int i6) {
        this.f1026l.w0 = (int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i6) {
        this.f1026l.w0 = i6;
    }

    public void setType(int i6) {
        this.f1024j = i6;
    }
}
