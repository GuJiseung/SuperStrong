package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import c.a;
import o.d;
import o.j;
import r.f;
/* loaded from: classes.dex */
public class Flow extends f {

    /* renamed from: l  reason: collision with root package name */
    public o.f f1023l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // r.f, androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1023l = new o.f();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.f2640c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.f1023l.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    o.f fVar = this.f1023l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar.f5496u0 = dimensionPixelSize;
                    fVar.f5497v0 = dimensionPixelSize;
                    fVar.w0 = dimensionPixelSize;
                    fVar.f5498x0 = dimensionPixelSize;
                } else if (index == 18) {
                    o.f fVar2 = this.f1023l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    fVar2.w0 = dimensionPixelSize2;
                    fVar2.f5499y0 = dimensionPixelSize2;
                    fVar2.f5500z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1023l.f5498x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1023l.f5499y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1023l.f5496u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1023l.f5500z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1023l.f5497v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1023l.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1023l.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1023l.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1023l.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1023l.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1023l.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1023l.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1023l.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1023l.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1023l.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1023l.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1023l.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1023l.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1023l.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1023l.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1023l.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1023l.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1023l.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1096e = this.f1023l;
        k();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void j(d dVar, boolean z5) {
        o.f fVar = this.f1023l;
        int i6 = fVar.w0;
        if (i6 > 0 || fVar.f5498x0 > 0) {
            if (z5) {
                fVar.f5499y0 = fVar.f5498x0;
                fVar.f5500z0 = i6;
                return;
            }
            fVar.f5499y0 = i6;
            fVar.f5500z0 = fVar.f5498x0;
        }
    }

    @Override // r.f
    public final void l(j jVar, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        if (jVar != null) {
            jVar.R(mode, size, mode2, size2);
            setMeasuredDimension(jVar.B0, jVar.C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i6, int i7) {
        l(this.f1023l, i6, i7);
    }

    public void setFirstHorizontalBias(float f6) {
        this.f1023l.N0 = f6;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.f1023l.H0 = i6;
        requestLayout();
    }

    public void setFirstVerticalBias(float f6) {
        this.f1023l.O0 = f6;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.f1023l.I0 = i6;
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.f1023l.T0 = i6;
        requestLayout();
    }

    public void setHorizontalBias(float f6) {
        this.f1023l.L0 = f6;
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.f1023l.R0 = i6;
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.f1023l.F0 = i6;
        requestLayout();
    }

    public void setLastHorizontalBias(float f6) {
        this.f1023l.P0 = f6;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.f1023l.J0 = i6;
        requestLayout();
    }

    public void setLastVerticalBias(float f6) {
        this.f1023l.Q0 = f6;
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.f1023l.K0 = i6;
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.f1023l.W0 = i6;
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.f1023l.X0 = i6;
        requestLayout();
    }

    public void setPadding(int i6) {
        o.f fVar = this.f1023l;
        fVar.f5496u0 = i6;
        fVar.f5497v0 = i6;
        fVar.w0 = i6;
        fVar.f5498x0 = i6;
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.f1023l.f5497v0 = i6;
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.f1023l.f5499y0 = i6;
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.f1023l.f5500z0 = i6;
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.f1023l.f5496u0 = i6;
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.f1023l.U0 = i6;
        requestLayout();
    }

    public void setVerticalBias(float f6) {
        this.f1023l.M0 = f6;
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.f1023l.S0 = i6;
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.f1023l.G0 = i6;
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.f1023l.V0 = i6;
        requestLayout();
    }
}
