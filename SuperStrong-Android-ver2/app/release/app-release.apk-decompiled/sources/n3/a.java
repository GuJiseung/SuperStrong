package n3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.j0;
import com.superstrong.android.R;
import d3.b;
/* loaded from: classes.dex */
public final class a extends j0 {
    public a(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (b.b(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = c.b.V;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m5 = m(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(m5 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    l(resourceId, theme);
                }
            }
        }
    }

    public static int m(Context context, TypedArray typedArray, int... iArr) {
        int i6 = -1;
        for (int i7 = 0; i7 < iArr.length && i6 < 0; i7++) {
            int i8 = iArr[i7];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i8, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i6 = dimensionPixelSize;
            } else {
                i6 = typedArray.getDimensionPixelSize(i8, -1);
            }
        }
        return i6;
    }

    public final void l(int i6, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i6, c.b.U);
        int m5 = m(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (m5 >= 0) {
            setLineHeight(m5);
        }
    }

    @Override // androidx.appcompat.widget.j0, android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        if (b.b(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            l(i6, context.getTheme());
        }
    }
}
