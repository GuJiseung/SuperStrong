package o3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.superstrong.android.R;
import g.c;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5608a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5609b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i6, int i7) {
        boolean z5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5609b, i6, i7);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof c) && ((c) context).f4030a == resourceId) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (resourceId != 0 && !z5) {
            c cVar = new c(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5608a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                cVar.getTheme().applyStyle(resourceId2, true);
            }
            return cVar;
        }
        return context;
    }
}
