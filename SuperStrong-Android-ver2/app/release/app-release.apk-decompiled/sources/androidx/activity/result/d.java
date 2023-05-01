package androidx.activity.result;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.e;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f286c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f287d;

    public d(e eVar, String str) {
        this.f287d = eVar;
        this.f286c = str;
    }

    public final void A() {
        Integer num;
        e eVar = this.f287d;
        ArrayList<String> arrayList = eVar.f292e;
        String str = this.f286c;
        if (!arrayList.contains(str) && (num = (Integer) eVar.f290c.remove(str)) != null) {
            eVar.f289b.remove(num);
        }
        eVar.f293f.remove(str);
        HashMap hashMap = eVar.f294g;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = eVar.f295h;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        if (((e.b) eVar.f291d.get(str)) == null) {
            return;
        }
        throw null;
    }
}
