package v4;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f6386a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f6387b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f6388c;

    public e0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f6386a = aVar;
        this.f6387b = proxy;
        this.f6388c = inetSocketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (e0Var.f6386a.equals(this.f6386a) && e0Var.f6387b.equals(this.f6387b) && e0Var.f6388c.equals(this.f6388c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6387b.hashCode();
        return this.f6388c.hashCode() + ((hashCode + ((this.f6386a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6388c + "}";
    }
}
