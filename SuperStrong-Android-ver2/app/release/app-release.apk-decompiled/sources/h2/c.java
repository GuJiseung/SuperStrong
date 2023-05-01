package h2;

import android.util.Property;
import android.view.ViewGroup;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class c extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4428a = new c();

    public c() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f6 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f6 == null) {
            return Float.valueOf(1.0f);
        }
        return f6;
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f6) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f6.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            viewGroup2.getChildAt(i6).setAlpha(floatValue);
        }
    }
}
