package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.k;
import androidx.appcompat.widget.Toolbar;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import z.a;
import z2.n;
import z2.o;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: a0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f2906a0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer S;
    public boolean T;
    public boolean U;
    public ImageView.ScaleType V;
    public Boolean W;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.toolbarStyle, 2131952704), attributeSet, 0);
        Context context2 = getContext();
        TypedArray d6 = n.d(context2, attributeSet, c.b.W, R.attr.toolbarStyle, 2131952704, new int[0]);
        if (d6.hasValue(2)) {
            setNavigationIconTint(d6.getColor(2, -1));
        }
        this.T = d6.getBoolean(4, false);
        this.U = d6.getBoolean(3, false);
        int i6 = d6.getInt(1, -1);
        if (i6 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f2906a0;
            if (i6 < scaleTypeArr.length) {
                this.V = scaleTypeArr[i6];
            }
        }
        if (d6.hasValue(0)) {
            this.W = Boolean.valueOf(d6.getBoolean(0, false));
        }
        d6.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            fVar.i(context2);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            fVar.j(g0.i.i(this));
            g0.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.V;
    }

    public Integer getNavigationIconTint() {
        return this.S;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.o(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z5, i6, i7, i8, i9);
        int i10 = 0;
        ImageView imageView2 = null;
        if (this.T || this.U) {
            ArrayList b6 = o.b(this, getTitle());
            boolean isEmpty = b6.isEmpty();
            o.a aVar = o.f7000a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(b6, aVar);
            }
            ArrayList b7 = o.b(this, getSubtitle());
            if (b7.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(b7, aVar);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i11 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.T && textView != null) {
                    v(textView, pair);
                }
                if (this.U && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i10++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.W;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.V;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.n(this, f6);
    }

    public void setLogoAdjustViewBounds(boolean z5) {
        Boolean bool = this.W;
        if (bool == null || bool.booleanValue() != z5) {
            this.W = Boolean.valueOf(z5);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.V != scaleType) {
            this.V = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.S != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.S.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i6) {
        this.S = Integer.valueOf(i6);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z5) {
        if (this.U != z5) {
            this.U = z5;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z5) {
        if (this.T != z5) {
            this.T = z5;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i6 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i7 = measuredWidth2 + i6;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i6, 0), Math.max(i7 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i6 += max;
            i7 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i7 - i6, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i6, textView.getTop(), i7, textView.getBottom());
    }
}
