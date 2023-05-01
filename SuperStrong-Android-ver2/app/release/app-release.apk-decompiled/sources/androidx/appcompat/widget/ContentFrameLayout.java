package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f587b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f588c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f589d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f590e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f591f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f592g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f593h;

    /* renamed from: i  reason: collision with root package name */
    public a f594i;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f593h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f591f == null) {
            this.f591f = new TypedValue();
        }
        return this.f591f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f592g == null) {
            this.f592g = new TypedValue();
        }
        return this.f592g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f589d == null) {
            this.f589d = new TypedValue();
        }
        return this.f589d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f590e == null) {
            this.f590e = new TypedValue();
        }
        return this.f590e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f587b == null) {
            this.f587b = new TypedValue();
        }
        return this.f587b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f588c == null) {
            this.f588c = new TypedValue();
        }
        return this.f588c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f594i;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f594i;
        if (aVar != null) {
            d.g gVar = ((d.i) aVar).f3643a;
            n0 n0Var = gVar.s;
            if (n0Var != null) {
                n0Var.l();
            }
            if (gVar.f3605x != null) {
                gVar.f3596m.getDecorView().removeCallbacks(gVar.f3606y);
                if (gVar.f3605x.isShowing()) {
                    try {
                        gVar.f3605x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gVar.f3605x = null;
            }
            f0.r0 r0Var = gVar.f3607z;
            if (r0Var != null) {
                r0Var.b();
            }
            androidx.appcompat.view.menu.f fVar = gVar.K(0).f3632h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f594i = aVar;
    }
}
