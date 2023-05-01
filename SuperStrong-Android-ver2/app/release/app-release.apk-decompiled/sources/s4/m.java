package s4;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6079a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6080b;

    /* renamed from: c  reason: collision with root package name */
    public final k4.l<Throwable, c4.h> f6081c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6082d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f6083e;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Object obj, d dVar, k4.l<? super Throwable, c4.h> lVar, Object obj2, Throwable th) {
        this.f6079a = obj;
        this.f6080b = dVar;
        this.f6081c = lVar;
        this.f6082d = obj2;
        this.f6083e = th;
    }

    public /* synthetic */ m(Object obj, d dVar, k4.l lVar, CancellationException cancellationException, int i6) {
        this(obj, (i6 & 2) != 0 ? null : dVar, (i6 & 4) != 0 ? null : lVar, (Object) null, (i6 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static m a(m mVar, d dVar, CancellationException cancellationException, int i6) {
        Object obj;
        k4.l<Throwable, c4.h> lVar;
        Object obj2 = null;
        if ((i6 & 1) != 0) {
            obj = mVar.f6079a;
        } else {
            obj = null;
        }
        if ((i6 & 2) != 0) {
            dVar = mVar.f6080b;
        }
        d dVar2 = dVar;
        if ((i6 & 4) != 0) {
            lVar = mVar.f6081c;
        } else {
            lVar = null;
        }
        if ((i6 & 8) != 0) {
            obj2 = mVar.f6082d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i6 & 16) != 0) {
            cancellationException2 = mVar.f6083e;
        }
        mVar.getClass();
        return new m(obj, dVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return l4.f.a(this.f6079a, mVar.f6079a) && l4.f.a(this.f6080b, mVar.f6080b) && l4.f.a(this.f6081c, mVar.f6081c) && l4.f.a(this.f6082d, mVar.f6082d) && l4.f.a(this.f6083e, mVar.f6083e);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6079a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        d dVar = this.f6080b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        k4.l<Throwable, c4.h> lVar = this.f6081c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f6082d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f6083e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f6079a + ", cancelHandler=" + this.f6080b + ", onCancellation=" + this.f6081c + ", idempotentResume=" + this.f6082d + ", cancelCause=" + this.f6083e + ')';
    }
}
