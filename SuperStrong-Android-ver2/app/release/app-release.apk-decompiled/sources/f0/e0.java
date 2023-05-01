package f0;

import android.text.TextUtils;
import android.view.View;
import com.superstrong.android.R;
import f0.g0;
/* loaded from: classes.dex */
public final class e0 extends g0.b<CharSequence> {
    public e0() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // f0.g0.b
    public final CharSequence b(View view) {
        return g0.m.b(view);
    }

    @Override // f0.g0.b
    public final void c(View view, CharSequence charSequence) {
        g0.m.h(view, charSequence);
    }

    @Override // f0.g0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
