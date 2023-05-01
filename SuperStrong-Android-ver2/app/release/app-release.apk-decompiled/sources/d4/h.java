package d4;

import a1.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class h extends f0 {
    public static final Map n(ArrayList arrayList) {
        e eVar = e.f3802b;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(f0.h(arrayList.size()));
                o(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            c4.c cVar = (c4.c) arrayList.get(0);
            l4.f.f(cVar, "pair");
            Map singletonMap = Collections.singletonMap(cVar.f2755b, cVar.f2756c);
            l4.f.e(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return eVar;
    }

    public static final void o(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c4.c cVar = (c4.c) it.next();
            linkedHashMap.put(cVar.f2755b, cVar.f2756c);
        }
    }
}
