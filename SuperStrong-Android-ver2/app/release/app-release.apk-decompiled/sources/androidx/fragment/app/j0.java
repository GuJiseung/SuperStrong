package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f1526a = new l0();

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f1527b;

    static {
        p0 p0Var;
        try {
            p0Var = (p0) a1.f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            p0Var = null;
        }
        f1527b = p0Var;
    }

    public static void a(ArrayList<View> arrayList, int i6) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i6);
        }
    }
}
