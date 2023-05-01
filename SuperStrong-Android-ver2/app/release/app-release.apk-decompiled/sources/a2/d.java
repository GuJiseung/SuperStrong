package a2;

import com.google.android.material.textfield.TextInputLayout;
import v4.l;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements TextInputLayout.f, l {
    public static /* synthetic */ boolean a(int i6) {
        if (i6 == 1 || i6 == 2 || i6 == 3) {
            return false;
        }
        if (i6 == 4 || i6 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String b(int i6) {
        return i6 == 1 ? "INITIALIZE" : i6 == 2 ? "RESOURCE_CACHE" : i6 == 3 ? "DATA_CACHE" : i6 == 4 ? "SOURCE" : i6 == 5 ? "ENCODE" : i6 == 6 ? "FINISHED" : "null";
    }
}
