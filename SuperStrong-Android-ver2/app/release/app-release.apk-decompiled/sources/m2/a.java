package m2;

import android.content.Context;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class a extends b3.a {
    public a(Context context) {
        super(context);
    }

    @Override // b3.a
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // b3.a
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
