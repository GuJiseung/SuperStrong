package q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.f;
/* loaded from: classes.dex */
public final class c extends e {
    public static final List q(b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : bVar) {
            arrayList.add(obj);
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size == 1) {
                List singletonList = Collections.singletonList(arrayList.get(0));
                f.e(singletonList, "singletonList(element)");
                return singletonList;
            }
            return arrayList;
        }
        return d4.d.f3801b;
    }
}
