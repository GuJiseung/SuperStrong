package y4;

import androidx.appcompat.widget.k1;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import v4.e0;
import v4.q;
import v4.u;
import y4.i;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f6881g;

    /* renamed from: b  reason: collision with root package name */
    public final long f6883b;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6887f;

    /* renamed from: c  reason: collision with root package name */
    public final k1 f6884c = new k1(5, this);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f6885d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final q3.b f6886e = new q3.b();

    /* renamed from: a  reason: collision with root package name */
    public final int f6882a = 5;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = w4.e.f6593a;
        f6881g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new w4.c("OkHttp ConnectionPool", true));
    }

    public f(TimeUnit timeUnit) {
        this.f6883b = timeUnit.toNanos(5L);
    }

    public final void a(e0 e0Var, IOException iOException) {
        if (e0Var.f6387b.type() != Proxy.Type.DIRECT) {
            v4.a aVar = e0Var.f6386a;
            aVar.f6330g.connectFailed(aVar.f6324a.o(), e0Var.f6387b.address(), iOException);
        }
        q3.b bVar = this.f6886e;
        synchronized (bVar) {
            ((Set) bVar.f5828a).add(e0Var);
        }
    }

    public final int b(e eVar, long j5) {
        ArrayList arrayList = eVar.f6879p;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i6);
            if (reference.get() != null) {
                i6++;
            } else {
                c5.f.f2787a.n(((i.b) reference).f6915a, "A connection to " + eVar.f6866c.f6386a.f6324a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i6);
                eVar.f6874k = true;
                if (arrayList.isEmpty()) {
                    eVar.f6880q = j5 - this.f6883b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public final boolean c(v4.a aVar, i iVar, @Nullable ArrayList arrayList, boolean z5) {
        boolean z6;
        boolean z7;
        Iterator it = this.f6885d.iterator();
        while (true) {
            boolean z8 = false;
            if (!it.hasNext()) {
                return false;
            }
            e eVar = (e) it.next();
            if (z5) {
                if (eVar.f6871h != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    continue;
                }
            }
            if (eVar.f6879p.size() < eVar.f6878o && !eVar.f6874k) {
                u.a aVar2 = w4.a.f6589a;
                e0 e0Var = eVar.f6866c;
                v4.a aVar3 = e0Var.f6386a;
                aVar2.getClass();
                if (aVar3.a(aVar)) {
                    q qVar = aVar.f6324a;
                    if (!qVar.f6464d.equals(e0Var.f6386a.f6324a.f6464d)) {
                        if (eVar.f6871h != null && arrayList != null) {
                            int size = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                    e0 e0Var2 = (e0) arrayList.get(i6);
                                    if (e0Var2.f6387b.type() == Proxy.Type.DIRECT && e0Var.f6387b.type() == Proxy.Type.DIRECT && e0Var.f6388c.equals(e0Var2.f6388c)) {
                                        z6 = true;
                                        break;
                                    }
                                    i6++;
                                } else {
                                    z6 = false;
                                    break;
                                }
                            }
                            if (z6) {
                                if (aVar.f6333j == e5.c.f3853a && eVar.j(qVar)) {
                                    try {
                                        aVar.f6334k.a(qVar.f6464d, eVar.f6869f.f6456c);
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                    z8 = true;
                }
            }
            if (z8) {
                if (iVar.f6907i == null) {
                    iVar.f6907i = eVar;
                    eVar.f6879p.add(new i.b(iVar, iVar.f6904f));
                    return true;
                }
                throw new IllegalStateException();
            }
        }
    }
}
