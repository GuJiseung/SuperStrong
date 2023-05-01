package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class i<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f4964a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4965b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4966c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4967d;

    /* renamed from: g  reason: collision with root package name */
    public static final a1.r f4963g = new a1.r(4, "REMOVE_FROZEN");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4961e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4962f = AtomicLongFieldUpdater.newUpdater(i.class, "_state");

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4968a;

        public a(int i6) {
            this.f4968a = i6;
        }
    }

    public i(int i6, boolean z5) {
        this.f4964a = i6;
        this.f4965b = z5;
        int i7 = i6 - 1;
        this.f4966c = i7;
        this.f4967d = new AtomicReferenceArray(i6);
        if (!(i7 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i6 & i7) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(E r15) {
        /*
            r14 = this;
        L0:
            long r2 = r14._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L15
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 == 0) goto L14
            r1 = 2
        L14:
            return r1
        L15:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r11 = r14.f4966c
            int r4 = r10 + 2
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L30
            return r1
        L30:
            boolean r4 = r14.f4965b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r14.f4967d
            r12 = r10 & r11
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r2 = r14.f4964a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r2 >> 1
            if (r0 <= r2) goto L0
        L4e:
            return r1
        L4f:
            int r0 = r10 + 1
            r0 = r0 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.i.f4962f
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r0
            long r12 = r12 << r9
            long r4 = r4 | r12
            r0 = r1
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f4967d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L77
            goto L95
        L77:
            kotlinx.coroutines.internal.i r0 = r0.e()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f4967d
            int r2 = r0.f4966c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.i.a
            if (r4 == 0) goto L92
            kotlinx.coroutines.internal.i$a r3 = (kotlinx.coroutines.internal.i.a) r3
            int r3 = r3.f4968a
            if (r3 != r10) goto L92
            r1.set(r2, r15)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 != 0) goto L6d
        L95:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.i.a(java.lang.Object):int");
    }

    public final boolean b() {
        long j5;
        do {
            j5 = this._state;
            if ((j5 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j5) != 0) {
                return false;
            }
        } while (!f4962f.compareAndSet(this, j5, j5 | 2305843009213693952L));
        return true;
    }

    public final int c() {
        long j5 = this._state;
        return (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j5) >> 0))) & 1073741823;
    }

    public final boolean d() {
        long j5 = this._state;
        return ((int) ((1073741823 & j5) >> 0)) == ((int) ((j5 & 1152921503533105152L) >> 30));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<E> e() {
        long j5;
        while (true) {
            j5 = this._state;
            if ((j5 & 1152921504606846976L) == 0) {
                long j6 = j5 | 1152921504606846976L;
                if (f4962f.compareAndSet(this, j5, j6)) {
                    j5 = j6;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            i<E> iVar = (i) this._next;
            if (iVar != null) {
                return iVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4961e;
            i iVar2 = new i(this.f4964a * 2, this.f4965b);
            int i6 = (int) ((1073741823 & j5) >> 0);
            int i7 = (int) ((1152921503533105152L & j5) >> 30);
            while (true) {
                int i8 = this.f4966c;
                int i9 = i6 & i8;
                if (i9 == (i8 & i7)) {
                    break;
                }
                Object obj = this.f4967d.get(i9);
                if (obj == null) {
                    obj = new a(i6);
                }
                iVar2.f4967d.set(iVar2.f4966c & i6, obj);
                i6++;
            }
            iVar2._state = (-1152921504606846977L) & j5;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object f() {
        while (true) {
            long j5 = this._state;
            if ((j5 & 1152921504606846976L) != 0) {
                return f4963g;
            }
            int i6 = (int) ((j5 & 1073741823) >> 0);
            int i7 = this.f4966c;
            int i8 = ((int) ((1152921503533105152L & j5) >> 30)) & i7;
            int i9 = i7 & i6;
            if (i8 == i9) {
                return null;
            }
            Object obj = this.f4967d.get(i9);
            if (obj == null) {
                if (this.f4965b) {
                    return null;
                }
            } else if (obj instanceof a) {
                return null;
            } else {
                long j6 = ((i6 + 1) & 1073741823) << 0;
                if (f4962f.compareAndSet(this, j5, (j5 & (-1073741824)) | j6)) {
                    this.f4967d.set(this.f4966c & i6, null);
                    return obj;
                } else if (this.f4965b) {
                    i<E> iVar = this;
                    while (true) {
                        long j7 = iVar._state;
                        int i10 = (int) ((j7 & 1073741823) >> 0);
                        if ((j7 & 1152921504606846976L) != 0) {
                            iVar = iVar.e();
                        } else {
                            if (f4962f.compareAndSet(iVar, j7, (j7 & (-1073741824)) | j6)) {
                                iVar.f4967d.set(iVar.f4966c & i10, null);
                                iVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (iVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
