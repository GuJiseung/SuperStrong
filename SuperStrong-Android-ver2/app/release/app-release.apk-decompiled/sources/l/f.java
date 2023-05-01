package l;

import java.util.LinkedHashMap;
import java.util.Locale;
/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f5041a;

    /* renamed from: b  reason: collision with root package name */
    public int f5042b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5043c;

    /* renamed from: d  reason: collision with root package name */
    public int f5044d;

    /* renamed from: e  reason: collision with root package name */
    public int f5045e;

    public f(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5043c = i6;
        this.f5041a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k5) {
        if (k5 != null) {
            synchronized (this) {
                V v2 = this.f5041a.get(k5);
                if (v2 != null) {
                    this.f5044d++;
                    return v2;
                }
                this.f5045e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V b(K r3, V r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L83
            monitor-enter(r2)
            int r0 = r2.f5042b     // Catch: java.lang.Throwable -> L80
            int r0 = r0 + 1
            r2.f5042b = r0     // Catch: java.lang.Throwable -> L80
            java.util.LinkedHashMap<K, V> r0 = r2.f5041a     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L17
            int r4 = r2.f5042b     // Catch: java.lang.Throwable -> L80
            int r4 = r4 + (-1)
            r2.f5042b = r4     // Catch: java.lang.Throwable -> L80
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            int r4 = r2.f5043c
        L1a:
            monitor-enter(r2)
            int r0 = r2.f5042b     // Catch: java.lang.Throwable -> L7d
            if (r0 < 0) goto L5e
            java.util.LinkedHashMap<K, V> r0 = r2.f5041a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L2b
            int r0 = r2.f5042b     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L5e
        L2b:
            int r0 = r2.f5042b     // Catch: java.lang.Throwable -> L7d
            if (r0 <= r4) goto L5c
            java.util.LinkedHashMap<K, V> r0 = r2.f5041a     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 == 0) goto L38
            goto L5c
        L38:
            java.util.LinkedHashMap<K, V> r0 = r2.f5041a     // Catch: java.lang.Throwable -> L7d
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L7d
            r0.getValue()     // Catch: java.lang.Throwable -> L7d
            java.util.LinkedHashMap<K, V> r0 = r2.f5041a     // Catch: java.lang.Throwable -> L7d
            r0.remove(r1)     // Catch: java.lang.Throwable -> L7d
            int r0 = r2.f5042b     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r2.f5042b = r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            goto L1a
        L5c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            return r3
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7d
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7d
            throw r3     // Catch: java.lang.Throwable -> L7d
        L7d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r3
        L80:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r3
        L83:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i6;
        int i7;
        i6 = this.f5044d;
        i7 = this.f5045e + i6;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f5043c), Integer.valueOf(this.f5044d), Integer.valueOf(this.f5045e), Integer.valueOf(i7 != 0 ? (i6 * 100) / i7 : 0));
    }
}
