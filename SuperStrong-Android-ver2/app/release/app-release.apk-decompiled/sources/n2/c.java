package n2;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.j;
/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f5381b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i6) {
        this.f5381b = bottomSheetBehavior;
        this.f5380a = i6;
    }

    @Override // g0.j
    public final boolean a(View view) {
        this.f5381b.C(this.f5380a);
        return true;
    }
}
