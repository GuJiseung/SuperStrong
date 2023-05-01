package s4;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class v0 extends CancellationException {

    /* renamed from: b  reason: collision with root package name */
    public final u0 f6110b;

    public v0(String str, Throwable th, u0 u0Var) {
        super(str);
        this.f6110b = u0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (!l4.f.a(v0Var.getMessage(), getMessage()) || !l4.f.a(v0Var.f6110b, this.f6110b) || !l4.f.a(v0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        l4.f.c(message);
        int hashCode = (this.f6110b.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f6110b;
    }
}
