package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public Random f288a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f289b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f290c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f291d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f292e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f293f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f294g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f295h = new Bundle();

    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f296a;

        /* renamed from: b  reason: collision with root package name */
        public final c f297b;

        public a(androidx.activity.result.b<O> bVar, c cVar) {
            this.f296a = bVar;
            this.f297b = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public final boolean a(int i6, int i7, Intent intent) {
        androidx.activity.result.b<O> bVar;
        String str = (String) this.f289b.get(Integer.valueOf(i6));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f293f.get(str);
        if (aVar != null && (bVar = aVar.f296a) != 0 && this.f292e.contains(str)) {
            bVar.a(aVar.f297b.z(intent, i7));
            this.f292e.remove(str);
            return true;
        }
        this.f294g.remove(str);
        this.f295h.putParcelable(str, new androidx.activity.result.a(intent, i7));
        return true;
    }

    public final d b(String str, c cVar, androidx.activity.result.b bVar) {
        int nextInt;
        HashMap hashMap;
        HashMap hashMap2 = this.f290c;
        if (((Integer) hashMap2.get(str)) == null) {
            do {
                nextInt = this.f288a.nextInt(2147418112) + 65536;
                hashMap = this.f289b;
            } while (hashMap.containsKey(Integer.valueOf(nextInt)));
            hashMap.put(Integer.valueOf(nextInt), str);
            hashMap2.put(str, Integer.valueOf(nextInt));
        }
        this.f293f.put(str, new a(bVar, cVar));
        HashMap hashMap3 = this.f294g;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f295h;
        androidx.activity.result.a aVar = (androidx.activity.result.a) bundle.getParcelable(str);
        if (aVar != null) {
            bundle.remove(str);
            bVar.a(cVar.z(aVar.f284c, aVar.f283b));
        }
        return new d(this, str);
    }
}
