package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes.dex */
public final class g1 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f779a = new Object();

    public static void a(Context context) {
        if ((context instanceof g1) || (context.getResources() instanceof i1)) {
            return;
        }
        context.getResources();
        int i6 = r1.f918a;
    }
}
