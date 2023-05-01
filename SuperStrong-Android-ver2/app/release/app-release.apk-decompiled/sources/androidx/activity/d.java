package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.r;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f270a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f271b;

    public /* synthetic */ d(ComponentActivity componentActivity, int i6) {
        this.f270a = i6;
        this.f271b = componentActivity;
    }

    @Override // a.b
    public final void a() {
        int i6 = this.f270a;
        ComponentActivity componentActivity = this.f271b;
        switch (i6) {
            case 0:
                Bundle a6 = componentActivity.f236f.f6661b.a("android:support:activity-result");
                if (a6 != null) {
                    ComponentActivity.b bVar = componentActivity.f240j;
                    bVar.getClass();
                    ArrayList<Integer> integerArrayList = a6.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        bVar.f292e = a6.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bVar.f288a = (Random) a6.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        Bundle bundle = a6.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = bVar.f295h;
                        bundle2.putAll(bundle);
                        for (int i7 = 0; i7 < stringArrayList.size(); i7++) {
                            String str = stringArrayList.get(i7);
                            HashMap hashMap = bVar.f290c;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = bVar.f289b;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i7).intValue();
                            String str2 = stringArrayList.get(i7);
                            hashMap2.put(Integer.valueOf(intValue), str2);
                            hashMap.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                w<?> wVar = ((r) componentActivity).f1619r.f1648a;
                wVar.f1668f.c(wVar, wVar, null);
                return;
        }
    }
}
