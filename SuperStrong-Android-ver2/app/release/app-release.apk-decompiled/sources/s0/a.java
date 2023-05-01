package s0;

import android.view.ViewGroup;
import androidx.fragment.app.o;
import l4.f;
/* loaded from: classes.dex */
public final class a extends c {
    public /* synthetic */ a(o oVar, ViewGroup viewGroup) {
        super(oVar, "Attempting to use <fragment> tag to add fragment " + oVar + " to container " + viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, String str) {
        super(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        f.f(oVar, "fragment");
        f.f(str, "previousFragmentId");
    }
}
