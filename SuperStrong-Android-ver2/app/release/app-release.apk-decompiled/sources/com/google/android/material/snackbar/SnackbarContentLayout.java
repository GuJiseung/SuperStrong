package com.google.android.material.snackbar;

import a3.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public TextView f3317b;

    /* renamed from: c  reason: collision with root package name */
    public Button f3318c;

    /* renamed from: d  reason: collision with root package name */
    public int f3319d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.d(context, R.attr.motionEasingEmphasizedInterpolator, h2.a.f4423b);
    }

    public final boolean a(int i6, int i7, int i8) {
        boolean z5;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f3317b.getPaddingTop() == i7 && this.f3317b.getPaddingBottom() == i8) {
            return z5;
        }
        TextView textView = this.f3317b;
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        if (g0.e.g(textView)) {
            g0.e.k(textView, g0.e.f(textView), i7, g0.e.e(textView), i8);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i7, textView.getPaddingRight(), i8);
        return true;
    }

    public Button getActionView() {
        return this.f3318c;
    }

    public TextView getMessageView() {
        return this.f3317b;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3317b = (TextView) findViewById(R.id.snackbar_text);
        this.f3318c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (a(1, r0, r0 - r2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (a(0, r0, r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165319(0x7f070087, float:1.7944852E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165318(0x7f070086, float:1.794485E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f3317b
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f3319d
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f3318c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f3319d
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f3319d = i6;
    }
}
