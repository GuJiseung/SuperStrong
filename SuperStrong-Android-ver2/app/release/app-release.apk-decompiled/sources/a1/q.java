package a1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public final View f98b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f97a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<i> f99c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.f98b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f98b == qVar.f98b && this.f97a.equals(qVar.f97a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f97a.hashCode() + (this.f98b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f98b + "\n") + "    values:";
        for (String str2 : this.f97a.keySet()) {
            str = str + "    " + str2 + ": " + hashMap.get(str2) + "\n";
        }
        return str;
    }
}
