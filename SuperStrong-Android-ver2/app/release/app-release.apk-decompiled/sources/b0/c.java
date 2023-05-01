package b0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
/* loaded from: classes.dex */
public final class c {
    public static final void a(Bundle bundle, String str, Size size) {
        l4.f.f(bundle, "bundle");
        l4.f.f(str, "key");
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        l4.f.f(bundle, "bundle");
        l4.f.f(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
