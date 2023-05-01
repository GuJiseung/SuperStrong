package l1;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f5100d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f5101e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f5102f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f5103g;

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f5104h;

    /* renamed from: a  reason: collision with root package name */
    public final c f5105a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final g<b, Bitmap> f5106b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f5107c = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5108a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5108a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5108a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5108a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5108a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements l {

        /* renamed from: a  reason: collision with root package name */
        public final c f5109a;

        /* renamed from: b  reason: collision with root package name */
        public int f5110b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f5111c;

        public b(c cVar) {
            this.f5109a = cVar;
        }

        @Override // l1.l
        public final void a() {
            this.f5109a.c(this);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5110b == bVar.f5110b && e2.j.a(this.f5111c, bVar.f5111c);
            }
            return false;
        }

        public final int hashCode() {
            int i6 = this.f5110b * 31;
            Bitmap.Config config = this.f5111c;
            return i6 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return m.c(this.f5110b, this.f5111c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l1.c<b> {
        @Override // l1.c
        public final b a() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        f5100d = configArr;
        f5101e = configArr;
        f5102f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5103g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5104h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i6, Bitmap.Config config) {
        return "[" + i6 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d6 = d(bitmap.getConfig());
        Integer num2 = d6.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d6.remove(num);
                return;
            } else {
                d6.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[EDGE_INSN: B:40:0x008c->B:35:0x008c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = e2.j.b(r11, r12, r13)
            l1.m$c r1 = r10.f5105a
            l1.l r2 = r1.b()
            l1.m$b r2 = (l1.m.b) r2
            r2.f5110b = r0
            r2.f5111c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L24
            android.graphics.Bitmap$Config r3 = androidx.appcompat.widget.g0.d()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L24
            android.graphics.Bitmap$Config[] r3 = l1.m.f5101e
            goto L48
        L24:
            int[] r3 = l1.m.a.f5108a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L46
            r6 = 2
            if (r3 == r6) goto L43
            r6 = 3
            if (r3 == r6) goto L40
            r6 = 4
            if (r3 == r6) goto L3d
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r4]
            r3[r5] = r13
            goto L48
        L3d:
            android.graphics.Bitmap$Config[] r3 = l1.m.f5104h
            goto L48
        L40:
            android.graphics.Bitmap$Config[] r3 = l1.m.f5103g
            goto L48
        L43:
            android.graphics.Bitmap$Config[] r3 = l1.m.f5102f
            goto L48
        L46:
            android.graphics.Bitmap$Config[] r3 = l1.m.f5100d
        L48:
            int r4 = r3.length
        L49:
            if (r5 >= r4) goto L8c
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.d(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L89
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto L89
            int r3 = r7.intValue()
            if (r3 != r0) goto L76
            if (r6 != 0) goto L70
            if (r13 == 0) goto L8c
            goto L76
        L70:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto L8c
        L76:
            r1.c(r2)
            int r0 = r7.intValue()
            l1.l r1 = r1.b()
            r2 = r1
            l1.m$b r2 = (l1.m.b) r2
            r2.f5110b = r0
            r2.f5111c = r6
            goto L8c
        L89:
            int r5 = r5 + 1
            goto L49
        L8c:
            l1.g<l1.m$b, android.graphics.Bitmap> r0 = r10.f5106b
            java.lang.Object r0 = r0.a(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto La2
            int r1 = r2.f5110b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.a(r1, r0)
            r0.reconfigure(r11, r12, r13)
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.m.b(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.f5107c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(e2.j.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c6 = e2.j.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b b6 = this.f5105a.b();
        b6.f5110b = c6;
        b6.f5111c = config;
        this.f5106b.b(b6, bitmap);
        NavigableMap<Integer, Integer> d6 = d(bitmap.getConfig());
        Integer num = d6.get(Integer.valueOf(b6.f5110b));
        Integer valueOf = Integer.valueOf(b6.f5110b);
        int i6 = 1;
        if (num != null) {
            i6 = 1 + num.intValue();
        }
        d6.put(valueOf, Integer.valueOf(i6));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f5106b);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.f5107c;
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
