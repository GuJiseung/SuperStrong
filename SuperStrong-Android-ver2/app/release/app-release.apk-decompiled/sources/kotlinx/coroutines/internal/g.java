package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.y;
/* loaded from: classes.dex */
public class g {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4955b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_next");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4956c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_prev");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4957d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* loaded from: classes.dex */
    public static abstract class a extends kotlinx.coroutines.internal.b<g> {

        /* renamed from: b  reason: collision with root package name */
        public final g f4958b;

        /* renamed from: c  reason: collision with root package name */
        public g f4959c;

        public a(g gVar) {
            this.f4958b = gVar;
        }

        @Override // kotlinx.coroutines.internal.b
        public final void b(g gVar, Object obj) {
            boolean z5;
            g gVar2;
            g gVar3 = gVar;
            boolean z6 = true;
            if (obj == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            g gVar4 = this.f4958b;
            if (z5) {
                gVar2 = gVar4;
            } else {
                gVar2 = this.f4959c;
            }
            if (gVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f4955b;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(gVar3, this, gVar2)) {
                        if (atomicReferenceFieldUpdater.get(gVar3) != this) {
                            z6 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z6 && z5) {
                    g gVar5 = this.f4959c;
                    l4.f.c(gVar5);
                    gVar4.g(gVar5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        r7 = kotlinx.coroutines.internal.g.f4955b;
        r4 = ((kotlinx.coroutines.internal.m) r4).f4970a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0048, code lost:
        if (r7.compareAndSet(r3, r1, r4) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
        if (r7.get(r3) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
        if (r5 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.g b() {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = r9._prev
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            r1 = r0
        L5:
            r2 = 0
            r3 = r2
        L7:
            java.lang.Object r4 = r1._next
            r5 = 0
            r6 = 1
            if (r4 != r9) goto L24
            if (r0 != r1) goto L10
            return r1
        L10:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.g.f4956c
        L12:
            boolean r2 = r7.compareAndSet(r9, r0, r1)
            if (r2 == 0) goto L1a
            r5 = r6
            goto L20
        L1a:
            java.lang.Object r2 = r7.get(r9)
            if (r2 == r0) goto L12
        L20:
            if (r5 != 0) goto L23
            goto L0
        L23:
            return r1
        L24:
            boolean r7 = r9.k()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r4 != 0) goto L2e
            return r1
        L2e:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.l
            if (r7 == 0) goto L38
            kotlinx.coroutines.internal.l r4 = (kotlinx.coroutines.internal.l) r4
            r4.a(r1)
            goto L0
        L38:
            boolean r7 = r4 instanceof kotlinx.coroutines.internal.m
            if (r7 == 0) goto L5c
            if (r3 == 0) goto L57
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.internal.g.f4955b
            kotlinx.coroutines.internal.m r4 = (kotlinx.coroutines.internal.m) r4
            kotlinx.coroutines.internal.g r4 = r4.f4970a
        L44:
            boolean r2 = r7.compareAndSet(r3, r1, r4)
            if (r2 == 0) goto L4c
            r5 = r6
            goto L52
        L4c:
            java.lang.Object r2 = r7.get(r3)
            if (r2 == r1) goto L44
        L52:
            if (r5 != 0) goto L55
            goto L0
        L55:
            r1 = r3
            goto L5
        L57:
            java.lang.Object r1 = r1._prev
            kotlinx.coroutines.internal.g r1 = (kotlinx.coroutines.internal.g) r1
            goto L7
        L5c:
            r3 = r4
            kotlinx.coroutines.internal.g r3 = (kotlinx.coroutines.internal.g) r3
            r8 = r3
            r3 = r1
            r1 = r8
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.g.b():kotlinx.coroutines.internal.g");
    }

    public final void g(g gVar) {
        boolean z5;
        do {
            g gVar2 = (g) gVar._prev;
            if (h() == gVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4956c;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(gVar, gVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != gVar2) {
                            z5 = false;
                            continue;
                            break;
                        }
                    } else {
                        z5 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z5);
        if (k()) {
            gVar.b();
        }
    }

    public final Object h() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof l)) {
                return obj;
            }
            ((l) obj).a(this);
        }
    }

    public final g i() {
        m mVar;
        Object h6 = h();
        g gVar = null;
        if (h6 instanceof m) {
            mVar = (m) h6;
        } else {
            mVar = null;
        }
        if (mVar != null) {
            gVar = mVar.f4970a;
        }
        if (gVar == null) {
            return (g) h6;
        }
        return gVar;
    }

    public final g j() {
        g b6 = b();
        if (b6 == null) {
            Object obj = this._prev;
            while (true) {
                b6 = (g) obj;
                if (!b6.k()) {
                    break;
                }
                obj = b6._prev;
            }
        }
        return b6;
    }

    public boolean k() {
        return h() instanceof m;
    }

    public final void l() {
        g gVar;
        boolean z5;
        do {
            Object h6 = h();
            if (h6 instanceof m) {
                g gVar2 = ((m) h6).f4970a;
                return;
            } else if (h6 == this) {
                g gVar3 = (g) h6;
                return;
            } else {
                gVar = (g) h6;
                m mVar = (m) gVar._removedRef;
                if (mVar == null) {
                    mVar = new m(gVar);
                    f4957d.lazySet(gVar, mVar);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4955b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, h6, mVar)) {
                        z5 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != h6) {
                        z5 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z5);
        gVar.b();
    }

    public String toString() {
        return new l4.i(this) { // from class: kotlinx.coroutines.internal.g.b
        } + '@' + y.a(this);
    }
}
