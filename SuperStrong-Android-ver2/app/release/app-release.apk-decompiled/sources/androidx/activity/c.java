package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.a0;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.HashMap;
import x0.b;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements b.InterfaceC0100b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f269b;

    public /* synthetic */ c(int i6, Object obj) {
        this.f268a = i6;
        this.f269b = obj;
    }

    @Override // x0.b.InterfaceC0100b
    public final Bundle a() {
        int i6 = this.f268a;
        Object obj = this.f269b;
        switch (i6) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.f240j;
                bVar.getClass();
                HashMap hashMap = bVar.f290c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bVar.f292e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f295h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f288a);
                return bundle;
            case 1:
                return ((a0) obj).X();
            default:
                return z.a((z) obj);
        }
    }
}
