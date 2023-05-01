package t3;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class f extends x3.c {

    /* renamed from: p  reason: collision with root package name */
    public static final a f6146p = new a();

    /* renamed from: q  reason: collision with root package name */
    public static final q3.s f6147q = new q3.s("closed");

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f6148m;

    /* renamed from: n  reason: collision with root package name */
    public String f6149n;

    /* renamed from: o  reason: collision with root package name */
    public q3.n f6150o;

    /* loaded from: classes.dex */
    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i6, int i7) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f6146p);
        this.f6148m = new ArrayList();
        this.f6150o = q3.p.f5845b;
    }

    @Override // x3.c
    public final void E(Number number) {
        if (number == null) {
            J(q3.p.f5845b);
            return;
        }
        if (!this.f6715g) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        J(new q3.s(number));
    }

    @Override // x3.c
    public final void F(String str) {
        if (str == null) {
            J(q3.p.f5845b);
        } else {
            J(new q3.s(str));
        }
    }

    @Override // x3.c
    public final void G(boolean z5) {
        J(new q3.s(Boolean.valueOf(z5)));
    }

    public final q3.n I() {
        ArrayList arrayList = this.f6148m;
        return (q3.n) arrayList.get(arrayList.size() - 1);
    }

    public final void J(q3.n nVar) {
        if (this.f6149n != null) {
            nVar.getClass();
            if (!(nVar instanceof q3.p) || this.f6718j) {
                ((q3.q) I()).f5846b.put(this.f6149n, nVar);
            }
            this.f6149n = null;
        } else if (this.f6148m.isEmpty()) {
            this.f6150o = nVar;
        } else {
            q3.n I = I();
            if (I instanceof q3.l) {
                q3.l lVar = (q3.l) I;
                if (nVar == null) {
                    lVar.getClass();
                    nVar = q3.p.f5845b;
                }
                lVar.f5844b.add(nVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // x3.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f6148m;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f6147q);
    }

    @Override // x3.c
    public final void f() {
        q3.l lVar = new q3.l();
        J(lVar);
        this.f6148m.add(lVar);
    }

    @Override // x3.c, java.io.Flushable
    public final void flush() {
    }

    @Override // x3.c
    public final void h() {
        q3.q qVar = new q3.q();
        J(qVar);
        this.f6148m.add(qVar);
    }

    @Override // x3.c
    public final void k() {
        ArrayList arrayList = this.f6148m;
        if (arrayList.isEmpty() || this.f6149n != null) {
            throw new IllegalStateException();
        }
        if (!(I() instanceof q3.l)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // x3.c
    public final void n() {
        ArrayList arrayList = this.f6148m;
        if (arrayList.isEmpty() || this.f6149n != null) {
            throw new IllegalStateException();
        }
        if (!(I() instanceof q3.q)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // x3.c
    public final void o(String str) {
        if (this.f6148m.isEmpty() || this.f6149n != null) {
            throw new IllegalStateException();
        }
        if (!(I() instanceof q3.q)) {
            throw new IllegalStateException();
        }
        this.f6149n = str;
    }

    @Override // x3.c
    public final x3.c q() {
        J(q3.p.f5845b);
        return this;
    }

    @Override // x3.c
    public final void w(long j5) {
        J(new q3.s(Long.valueOf(j5)));
    }

    @Override // x3.c
    public final void x(Boolean bool) {
        if (bool == null) {
            J(q3.p.f5845b);
        } else {
            J(new q3.s(bool));
        }
    }
}
