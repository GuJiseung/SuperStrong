package c0;

import c0.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j implements e0.a<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2714a;

    public j(String str) {
        this.f2714a = str;
    }

    @Override // e0.a
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f2717c) {
            l.h<String, ArrayList<e0.a<k.a>>> hVar = k.f2718d;
            ArrayList<e0.a<k.a>> orDefault = hVar.getOrDefault(this.f2714a, null);
            if (orDefault != null) {
                hVar.remove(this.f2714a);
                for (int i6 = 0; i6 < orDefault.size(); i6++) {
                    orDefault.get(i6).accept(aVar2);
                }
            }
        }
    }
}
