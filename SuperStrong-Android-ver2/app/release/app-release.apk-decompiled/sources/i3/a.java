package i3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final SideSheetBehavior<? extends View> f4621a;

    public a(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f4621a = sideSheetBehavior;
    }

    public final int a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f4621a;
        return Math.max(0, sideSheetBehavior.f3292m - sideSheetBehavior.f3291l);
    }
}
