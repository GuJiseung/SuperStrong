package s4;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6094a;

    /* renamed from: b  reason: collision with root package name */
    public final k4.l<Throwable, c4.h> f6095b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Object obj, k4.l<? super Throwable, c4.h> lVar) {
        this.f6094a = obj;
        this.f6095b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return l4.f.a(this.f6094a, oVar.f6094a) && l4.f.a(this.f6095b, oVar.f6095b);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f6094a;
        return this.f6095b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f6094a + ", onCancellation=" + this.f6095b + ')';
    }
}
