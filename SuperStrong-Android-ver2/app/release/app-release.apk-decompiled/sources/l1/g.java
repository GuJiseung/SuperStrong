package l1;

import java.util.ArrayList;
import java.util.HashMap;
import l1.l;
/* loaded from: classes.dex */
public final class g<K extends l, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f5075a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5076b = new HashMap();

    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f5077a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f5078b;

        /* renamed from: c  reason: collision with root package name */
        public a<K, V> f5079c;

        /* renamed from: d  reason: collision with root package name */
        public a<K, V> f5080d;

        public a() {
            this(null);
        }

        public a(K k5) {
            this.f5080d = this;
            this.f5079c = this;
            this.f5077a = k5;
        }
    }

    public final V a(K k5) {
        a aVar;
        int i6;
        HashMap hashMap = this.f5076b;
        a aVar2 = (a) hashMap.get(k5);
        if (aVar2 == null) {
            a aVar3 = new a(k5);
            hashMap.put(k5, aVar3);
            aVar = aVar3;
        } else {
            k5.a();
            aVar = aVar2;
        }
        a<K, V> aVar4 = aVar.f5080d;
        aVar4.f5079c = aVar.f5079c;
        aVar.f5079c.f5080d = aVar4;
        a<K, V> aVar5 = this.f5075a;
        aVar.f5080d = aVar5;
        a<K, V> aVar6 = aVar5.f5079c;
        aVar.f5079c = aVar6;
        aVar6.f5080d = aVar;
        aVar.f5080d.f5079c = aVar;
        ArrayList arrayList = aVar.f5078b;
        if (arrayList != null) {
            i6 = arrayList.size();
        } else {
            i6 = 0;
        }
        if (i6 > 0) {
            return (V) aVar.f5078b.remove(i6 - 1);
        }
        return null;
    }

    public final void b(K k5, V v2) {
        HashMap hashMap = this.f5076b;
        a aVar = (a) hashMap.get(k5);
        if (aVar == null) {
            aVar = new a(k5);
            a<K, V> aVar2 = aVar.f5080d;
            aVar2.f5079c = aVar.f5079c;
            aVar.f5079c.f5080d = aVar2;
            a<K, V> aVar3 = this.f5075a;
            aVar.f5080d = aVar3.f5080d;
            aVar.f5079c = aVar3;
            aVar3.f5080d = aVar;
            aVar.f5080d.f5079c = aVar;
            hashMap.put(k5, aVar);
        } else {
            k5.a();
        }
        if (aVar.f5078b == null) {
            aVar.f5078b = new ArrayList();
        }
        aVar.f5078b.add(v2);
    }

    public final V c() {
        int i6;
        a<K, V> aVar = this.f5075a;
        a aVar2 = aVar.f5080d;
        while (true) {
            V v2 = null;
            if (aVar2.equals(aVar)) {
                return null;
            }
            ArrayList arrayList = aVar2.f5078b;
            if (arrayList != null) {
                i6 = arrayList.size();
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                v2 = (V) aVar2.f5078b.remove(i6 - 1);
            }
            if (v2 != null) {
                return v2;
            }
            a<K, V> aVar3 = aVar2.f5080d;
            aVar3.f5079c = aVar2.f5079c;
            aVar2.f5079c.f5080d = aVar3;
            HashMap hashMap = this.f5076b;
            Object obj = aVar2.f5077a;
            hashMap.remove(obj);
            ((l) obj).a();
            aVar2 = aVar2.f5080d;
        }
    }

    public final String toString() {
        int i6;
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f5075a;
        a aVar2 = aVar.f5079c;
        boolean z5 = false;
        while (!aVar2.equals(aVar)) {
            sb.append('{');
            sb.append(aVar2.f5077a);
            sb.append(':');
            ArrayList arrayList = aVar2.f5078b;
            if (arrayList != null) {
                i6 = arrayList.size();
            } else {
                i6 = 0;
            }
            sb.append(i6);
            sb.append("}, ");
            aVar2 = aVar2.f5079c;
            z5 = true;
        }
        if (z5) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
