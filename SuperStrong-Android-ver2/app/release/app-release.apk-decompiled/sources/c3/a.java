package c3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import c.b;
import com.superstrong.android.R;
import d3.c;
import z2.n;
/* loaded from: classes.dex */
public final class a extends s {

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f2752h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f2753f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2754g;

    public a(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952629), attributeSet);
        Context context2 = getContext();
        TypedArray d6 = n.d(context2, attributeSet, b.S, R.attr.radioButtonStyle, 2131952629, new int[0]);
        if (d6.hasValue(0)) {
            j0.b.c(this, c.a(context2, d6, 0));
        }
        this.f2754g = d6.getBoolean(1, false);
        d6.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2753f == null) {
            int m5 = c.a.m(this, R.attr.colorControlActivated);
            int m6 = c.a.m(this, R.attr.colorOnSurface);
            int m7 = c.a.m(this, R.attr.colorSurface);
            this.f2753f = new ColorStateList(f2752h, new int[]{c.a.p(1.0f, m7, m5), c.a.p(0.54f, m7, m6), c.a.p(0.38f, m7, m6), c.a.p(0.38f, m7, m6)});
        }
        return this.f2753f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2754g && j0.b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        ColorStateList colorStateList;
        this.f2754g = z5;
        if (z5) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        j0.b.c(this, colorStateList);
    }
}
