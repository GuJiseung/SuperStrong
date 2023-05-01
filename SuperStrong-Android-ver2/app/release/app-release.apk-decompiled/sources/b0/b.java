package b0;

import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class b {
    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        l4.f.f(bundle, "bundle");
        l4.f.f(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
