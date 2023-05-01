package l4;

import k4.p;
/* loaded from: classes.dex */
public final class n {
    public static void a(p pVar) {
        int i6;
        if (pVar != null) {
            boolean z5 = false;
            if (pVar instanceof e) {
                i6 = ((e) pVar).c();
            } else if (pVar instanceof k4.a) {
                i6 = 0;
            } else if (pVar instanceof k4.l) {
                i6 = 1;
            } else {
                i6 = 2;
            }
            if (i6 == 2) {
                z5 = true;
            }
            if (!z5) {
                ClassCastException classCastException = new ClassCastException(pVar.getClass().getName().concat(" cannot be cast to kotlin.jvm.functions.Function2"));
                f.i(n.class.getName(), classCastException);
                throw classCastException;
            }
        }
    }
}
