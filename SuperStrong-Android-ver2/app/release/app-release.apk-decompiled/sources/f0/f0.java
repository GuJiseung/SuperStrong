package f0;

import android.view.View;
import com.superstrong.android.R;
import f0.g0;
/* loaded from: classes.dex */
public final class f0 extends g0.b<Boolean> {
    public f0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // f0.g0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(g0.m.c(view));
    }

    @Override // f0.g0.b
    public final void c(View view, Boolean bool) {
        g0.m.g(view, bool.booleanValue());
    }

    @Override // f0.g0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !g0.b.a(bool, bool2);
    }
}
