package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public final class q extends PopupWindow {
    public q(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2686t, i6, i7);
        if (obtainStyledAttributes.hasValue(2)) {
            j0.j.c(this, obtainStyledAttributes.getBoolean(2, false));
        }
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = e.a.a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i6, int i7) {
        super.showAsDropDown(view, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i6, int i7, int i8) {
        super.showAsDropDown(view, i6, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i6, int i7, int i8, int i9) {
        super.update(view, i6, i7, i8, i9);
    }
}
