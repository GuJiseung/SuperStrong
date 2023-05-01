package s4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public abstract class m0 extends n0 implements d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6084f = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_queue");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6085g = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public static abstract class a implements Runnable, Comparable<a>, i0, kotlinx.coroutines.internal.s {

        /* renamed from: b  reason: collision with root package name */
        public long f6086b;

        /* renamed from: c  reason: collision with root package name */
        public Object f6087c;

        /* renamed from: d  reason: collision with root package name */
        public int f6088d;

        @Override // s4.i0
        public final synchronized void a() {
            b bVar;
            Object obj = this.f6087c;
            a1.r rVar = androidx.activity.k.f281c;
            if (obj == rVar) {
                return;
            }
            kotlinx.coroutines.internal.r rVar2 = null;
            if (obj instanceof b) {
                bVar = (b) obj;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                synchronized (bVar) {
                    Object obj2 = this.f6087c;
                    if (obj2 instanceof kotlinx.coroutines.internal.r) {
                        rVar2 = (kotlinx.coroutines.internal.r) obj2;
                    }
                    if (rVar2 != null) {
                        bVar.c(this.f6088d);
                    }
                }
            }
            this.f6087c = rVar;
        }

        @Override // kotlinx.coroutines.internal.s
        public final void b(b bVar) {
            if (!(this.f6087c != androidx.activity.k.f281c)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f6087c = bVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            int i6 = ((this.f6086b - aVar.f6086b) > 0L ? 1 : ((this.f6086b - aVar.f6086b) == 0L ? 0 : -1));
            if (i6 > 0) {
                return 1;
            }
            if (i6 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.s
        public final void setIndex(int i6) {
            this.f6088d = i6;
        }

        public final String toString() {
            return "Delayed[nanos=" + this.f6086b + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends kotlinx.coroutines.internal.r<a> {

        /* renamed from: b  reason: collision with root package name */
        public long f6089b;

        public b(long j5) {
            this.f6089b = j5;
        }
    }

    public void N(Runnable runnable) {
        if (O(runnable)) {
            Thread L = L();
            if (Thread.currentThread() != L) {
                LockSupport.unpark(L);
                return;
            }
            return;
        }
        z.f6113h.N(runnable);
    }

    public final boolean O(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z5 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6084f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z5 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z5) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.i) {
                kotlinx.coroutines.internal.i iVar = (kotlinx.coroutines.internal.i) obj;
                int a6 = iVar.a(runnable);
                if (a6 == 0) {
                    return true;
                }
                if (a6 != 1) {
                    if (a6 == 2) {
                        return false;
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6084f;
                    kotlinx.coroutines.internal.i e6 = iVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e6) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                }
            } else if (obj == androidx.activity.k.f282d) {
                return false;
            } else {
                kotlinx.coroutines.internal.i iVar2 = new kotlinx.coroutines.internal.i(8, true);
                iVar2.a((Runnable) obj);
                iVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f6084f;
                while (true) {
                    if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, iVar2)) {
                        z5 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                        break;
                    }
                }
                if (z5) {
                    return true;
                }
            }
        }
    }

    public final boolean P() {
        boolean z5;
        kotlinx.coroutines.internal.a<g0<?>> aVar = this.f6077e;
        if (aVar == null || aVar.f4941b == aVar.f4942c) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.b()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.i) {
                return ((kotlinx.coroutines.internal.i) obj).d();
            }
            if (obj != androidx.activity.k.f282d) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f A[EDGE_INSN: B:116:0x007f->B:53:0x007f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b9  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, s4.m0, s4.l0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T extends kotlinx.coroutines.internal.s & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [T extends kotlinx.coroutines.internal.s & java.lang.Comparable<? super T>[]] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.m0.Q():long");
    }

    public final void R() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        if ((r8 - r0.f6089b) > 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S(long r13, s4.m0.a r15) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.m0.S(long, s4.m0$a):void");
    }

    @Override // s4.t
    public final void h(e4.f fVar, Runnable runnable) {
        N(runnable);
    }

    @Override // s4.l0
    public void shutdown() {
        a d6;
        ThreadLocal<l0> threadLocal = j1.f6071a;
        j1.f6071a.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            a1.r rVar = androidx.activity.k.f282d;
            boolean z5 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6084f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        z5 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z5) {
                    break;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.i) {
                ((kotlinx.coroutines.internal.i) obj).b();
                break;
            } else if (obj == rVar) {
                break;
            } else {
                kotlinx.coroutines.internal.i iVar = new kotlinx.coroutines.internal.i(8, true);
                iVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6084f;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar)) {
                        z5 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                if (z5) {
                    break;
                }
            }
        }
        do {
        } while (Q() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            if (bVar == null) {
                d6 = null;
            } else {
                d6 = bVar.d();
            }
            if (d6 == null) {
                return;
            }
            M(nanoTime, d6);
        }
    }
}
