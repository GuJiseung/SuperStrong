package g5;
/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e4.d f4263b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Exception f4264c;

        public a(Exception exc, b bVar) {
            this.f4263b = bVar;
            this.f4264c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.n.g(this.f4263b).d(a1.f0.e(this.f4264c));
        }
    }

    @g4.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {113}, m = "suspendAndThrow")
    /* loaded from: classes.dex */
    public static final class b extends g4.c {

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f4265e;

        /* renamed from: f  reason: collision with root package name */
        public int f4266f;

        public b(e4.d dVar) {
            super(dVar);
        }

        @Override // g4.a
        public final Object i(Object obj) {
            this.f4265e = obj;
            this.f4266f |= Integer.MIN_VALUE;
            return s.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.Exception r4, e4.d<?> r5) {
        /*
            boolean r0 = r5 instanceof g5.s.b
            if (r0 == 0) goto L13
            r0 = r5
            g5.s$b r0 = (g5.s.b) r0
            int r1 = r0.f4266f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4266f = r1
            goto L18
        L13:
            g5.s$b r0 = new g5.s$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4265e
            f4.a r1 = f4.a.COROUTINE_SUSPENDED
            int r2 = r0.f4266f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a1.f0.l(r5)
            c4.h r4 = c4.h.f2763a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a1.f0.l(r5)
            r0.getClass()
            r0.f4266f = r3
            kotlinx.coroutines.scheduling.c r5 = s4.h0.f6067a
            e4.f r2 = r0.f4162c
            l4.f.c(r2)
            g5.s$a r3 = new g5.s$a
            r3.<init>(r4, r0)
            r5.h(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.s.a(java.lang.Exception, e4.d):java.lang.Object");
    }
}
