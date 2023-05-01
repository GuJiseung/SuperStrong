package b;

import android.content.Intent;
import androidx.activity.result.c;
import d4.e;
import d4.h;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a extends c {
    @Override // androidx.activity.result.c
    public final Object z(Intent intent, int i6) {
        boolean z5;
        e eVar = e.f3802b;
        if (i6 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i7 : intArrayExtra) {
                    if (i7 == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(Boolean.valueOf(z5));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new c4.c(it.next(), it2.next()));
                }
                return h.n(arrayList3);
            }
            return eVar;
        }
        return eVar;
    }
}
