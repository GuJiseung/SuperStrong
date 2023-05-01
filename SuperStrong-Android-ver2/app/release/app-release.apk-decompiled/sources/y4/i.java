package y4;

import d.s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import v4.m;
import v4.u;
import v4.w;
import v4.x;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final u f6899a;

    /* renamed from: b  reason: collision with root package name */
    public final f f6900b;

    /* renamed from: c  reason: collision with root package name */
    public final v4.d f6901c;

    /* renamed from: d  reason: collision with root package name */
    public final m f6902d;

    /* renamed from: e  reason: collision with root package name */
    public final a f6903e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Object f6904f;

    /* renamed from: g  reason: collision with root package name */
    public x f6905g;

    /* renamed from: h  reason: collision with root package name */
    public d f6906h;

    /* renamed from: i  reason: collision with root package name */
    public e f6907i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public c f6908j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6909k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6910l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6911m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6912n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6913o;

    /* loaded from: classes.dex */
    public class a extends f5.c {
        public a() {
        }

        @Override // f5.c
        public final void n() {
            i.this.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends WeakReference<i> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f6915a;

        public b(i iVar, Object obj) {
            super(iVar);
            this.f6915a = obj;
        }
    }

    public i(u uVar, w wVar) {
        a aVar = new a();
        this.f6903e = aVar;
        this.f6899a = uVar;
        u.a aVar2 = w4.a.f6589a;
        s sVar = uVar.f6513p;
        aVar2.getClass();
        this.f6900b = (f) sVar.f3672a;
        this.f6901c = wVar;
        this.f6902d = (m) uVar.f6504g.f5288b;
        aVar.g(0, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        c cVar;
        e eVar;
        synchronized (this.f6900b) {
            this.f6911m = true;
            cVar = this.f6908j;
            d dVar = this.f6906h;
            if (dVar == null || (eVar = dVar.f6862g) == null) {
                eVar = this.f6907i;
            }
        }
        if (cVar != null) {
            cVar.f6844d.cancel();
        } else if (eVar != null) {
            w4.e.c(eVar.f6867d);
        }
    }

    public final void b() {
        synchronized (this.f6900b) {
            if (this.f6913o) {
                throw new IllegalStateException();
            }
            this.f6908j = null;
        }
    }

    @Nullable
    public final IOException c(c cVar, boolean z5, boolean z6, @Nullable IOException iOException) {
        boolean z7;
        synchronized (this.f6900b) {
            c cVar2 = this.f6908j;
            if (cVar != cVar2) {
                return iOException;
            }
            boolean z8 = true;
            if (z5) {
                z7 = !this.f6909k;
                this.f6909k = true;
            } else {
                z7 = false;
            }
            if (z6) {
                if (!this.f6910l) {
                    z7 = true;
                }
                this.f6910l = true;
            }
            if (this.f6909k && this.f6910l && z7) {
                cVar2.a().f6876m++;
                this.f6908j = null;
            } else {
                z8 = false;
            }
            return z8 ? d(iOException, false) : iOException;
        }
    }

    @Nullable
    public final IOException d(@Nullable IOException iOException, boolean z5) {
        e eVar;
        Socket socket;
        boolean z6;
        synchronized (this.f6900b) {
            if (z5) {
                if (this.f6908j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f6907i;
            if (eVar != null && this.f6908j == null && (z5 || this.f6913o)) {
                socket = f();
            } else {
                socket = null;
            }
            if (this.f6907i != null) {
                eVar = null;
            }
            if (this.f6913o && this.f6908j == null) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        w4.e.c(socket);
        if (eVar != null) {
            this.f6902d.getClass();
        }
        if (z6) {
            if (!this.f6912n && this.f6903e.l()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            this.f6902d.getClass();
        }
        return iOException;
    }

    @Nullable
    public final IOException e(@Nullable IOException iOException) {
        synchronized (this.f6900b) {
            this.f6913o = true;
        }
        return d(iOException, false);
    }

    @Nullable
    public final Socket f() {
        int size = this.f6907i.f6879p.size();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                if (((Reference) this.f6907i.f6879p.get(i6)).get() == this) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 != -1) {
            e eVar = this.f6907i;
            eVar.f6879p.remove(i6);
            this.f6907i = null;
            if (eVar.f6879p.isEmpty()) {
                eVar.f6880q = System.nanoTime();
                f fVar = this.f6900b;
                fVar.getClass();
                if (!eVar.f6874k && fVar.f6882a != 0) {
                    fVar.notifyAll();
                } else {
                    fVar.f6885d.remove(eVar);
                    z5 = true;
                }
                if (z5) {
                    return eVar.f6868e;
                }
            }
            return null;
        }
        throw new IllegalStateException();
    }
}
