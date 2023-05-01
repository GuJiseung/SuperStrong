package a1;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
public final class i0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f79a;

    public i0(View view) {
        this.f79a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).f79a.equals(this.f79a);
    }

    public final int hashCode() {
        return this.f79a.hashCode();
    }
}
