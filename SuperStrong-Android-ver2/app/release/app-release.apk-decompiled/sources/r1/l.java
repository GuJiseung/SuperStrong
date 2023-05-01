package r1;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final e f5909a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f5910b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f5911c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f5912d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f5913e;

    /* renamed from: f  reason: collision with root package name */
    public static final i1.g<l> f5914f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f5915g;

    /* loaded from: classes.dex */
    public static class a extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            return 2;
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            int min = Math.min(i7 / i9, i6 / i8);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            return 1;
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            int ceil = (int) Math.ceil(Math.max(i7 / i9, i6 / i8));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            if (b(i6, i7, i8, i9) == 1.0f) {
                return 2;
            }
            return l.f5909a.a(i6, i7, i8, i9);
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            return Math.min(1.0f, l.f5909a.b(i6, i7, i8, i9));
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            return 2;
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            return Math.max(i8 / i6, i9 / i7);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            return l.f5915g ? 2 : 1;
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            if (l.f5915g) {
                return Math.min(i8 / i6, i9 / i7);
            }
            int max = Math.max(i7 / i9, i6 / i8);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends l {
        @Override // r1.l
        public final int a(int i6, int i7, int i8, int i9) {
            return 2;
        }

        @Override // r1.l
        public final float b(int i6, int i7, int i8, int i9) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f5909a = new e();
        f5910b = new c();
        d dVar = new d();
        f5911c = dVar;
        f5912d = new f();
        f5913e = dVar;
        f5914f = i1.g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f5915g = true;
    }

    public abstract int a(int i6, int i7, int i8, int i9);

    public abstract float b(int i6, int i7, int i8, int i9);
}
