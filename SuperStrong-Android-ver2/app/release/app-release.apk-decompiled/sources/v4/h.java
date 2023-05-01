package v4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: e  reason: collision with root package name */
    public static final h f6417e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f6418f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6419a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6420b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String[] f6421c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String[] f6422d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f6423a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f6424b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String[] f6425c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6426d;

        public a(h hVar) {
            this.f6423a = hVar.f6419a;
            this.f6424b = hVar.f6421c;
            this.f6425c = hVar.f6422d;
            this.f6426d = hVar.f6420b;
        }

        public a(boolean z5) {
            this.f6423a = z5;
        }

        public final void a(String... strArr) {
            if (!this.f6423a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f6424b = (String[]) strArr.clone();
        }

        public final void b(g... gVarArr) {
            if (!this.f6423a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i6 = 0; i6 < gVarArr.length; i6++) {
                strArr[i6] = gVarArr[i6].f6416a;
            }
            a(strArr);
        }

        public final void c(String... strArr) {
            if (!this.f6423a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f6425c = (String[]) strArr.clone();
        }

        public final void d(f0... f0VarArr) {
            if (!this.f6423a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[f0VarArr.length];
            for (int i6 = 0; i6 < f0VarArr.length; i6++) {
                strArr[i6] = f0VarArr[i6].f6398b;
            }
            c(strArr);
        }
    }

    static {
        g gVar = g.f6414q;
        g gVar2 = g.f6415r;
        g gVar3 = g.s;
        g gVar4 = g.f6408k;
        g gVar5 = g.f6410m;
        g gVar6 = g.f6409l;
        g gVar7 = g.f6411n;
        g gVar8 = g.f6413p;
        g gVar9 = g.f6412o;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, g.f6406i, g.f6407j, g.f6404g, g.f6405h, g.f6402e, g.f6403f, g.f6401d};
        a aVar = new a(true);
        aVar.b(gVarArr);
        f0 f0Var = f0.f6392c;
        f0 f0Var2 = f0.f6393d;
        aVar.d(f0Var, f0Var2);
        aVar.f6426d = true;
        new h(aVar);
        a aVar2 = new a(true);
        aVar2.b(gVarArr2);
        aVar2.d(f0Var, f0Var2);
        aVar2.f6426d = true;
        f6417e = new h(aVar2);
        a aVar3 = new a(true);
        aVar3.b(gVarArr2);
        aVar3.d(f0Var, f0Var2, f0.f6394e, f0.f6395f);
        aVar3.f6426d = true;
        new h(aVar3);
        f6418f = new h(new a(false));
    }

    public h(a aVar) {
        this.f6419a = aVar.f6423a;
        this.f6421c = aVar.f6424b;
        this.f6422d = aVar.f6425c;
        this.f6420b = aVar.f6426d;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (this.f6419a) {
            String[] strArr = this.f6422d;
            if (strArr == null || w4.e.o(w4.e.f6601i, strArr, sSLSocket.getEnabledProtocols())) {
                String[] strArr2 = this.f6421c;
                return strArr2 == null || w4.e.o(g.f6399b, strArr2, sSLSocket.getEnabledCipherSuites());
            }
            return false;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof h) {
            if (obj == this) {
                return true;
            }
            h hVar = (h) obj;
            boolean z5 = hVar.f6419a;
            boolean z6 = this.f6419a;
            if (z6 != z5) {
                return false;
            }
            return !z6 || (Arrays.equals(this.f6421c, hVar.f6421c) && Arrays.equals(this.f6422d, hVar.f6422d) && this.f6420b == hVar.f6420b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f6419a) {
            return ((((527 + Arrays.hashCode(this.f6421c)) * 31) + Arrays.hashCode(this.f6422d)) * 31) + (!this.f6420b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List list;
        if (!this.f6419a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        List list2 = null;
        String[] strArr = this.f6421c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(g.a(str));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        sb.append(Objects.toString(list, "[all enabled]"));
        sb.append(", tlsVersions=");
        String[] strArr2 = this.f6422d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(f0.a(str2));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        sb.append(Objects.toString(list2, "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f6420b);
        sb.append(")");
        return sb.toString();
    }
}
