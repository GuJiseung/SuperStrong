package v4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class t extends a0 {

    /* renamed from: e  reason: collision with root package name */
    public static final s f6483e = s.a("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final s f6484f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6485g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6486h;

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f6487i;

    /* renamed from: a  reason: collision with root package name */
    public final f5.h f6488a;

    /* renamed from: b  reason: collision with root package name */
    public final s f6489b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f6490c;

    /* renamed from: d  reason: collision with root package name */
    public long f6491d = -1;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final f5.h f6492a;

        /* renamed from: b  reason: collision with root package name */
        public s f6493b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f6494c;

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.f6493b = t.f6483e;
            this.f6494c = new ArrayList();
            this.f6492a = f5.h.d(uuid);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final p f6495a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f6496b;

        public b(@Nullable p pVar, a0 a0Var) {
            this.f6495a = pVar;
            this.f6496b = a0Var;
        }
    }

    static {
        s.a("multipart/alternative");
        s.a("multipart/digest");
        s.a("multipart/parallel");
        f6484f = s.a("multipart/form-data");
        f6485g = new byte[]{58, 32};
        f6486h = new byte[]{13, 10};
        f6487i = new byte[]{45, 45};
    }

    public t(f5.h hVar, s sVar, ArrayList arrayList) {
        this.f6488a = hVar;
        this.f6489b = s.a(sVar + "; boundary=" + hVar.m());
        this.f6490c = w4.e.k(arrayList);
    }

    @Override // v4.a0
    public final long a() {
        long j5 = this.f6491d;
        if (j5 != -1) {
            return j5;
        }
        long d6 = d(null, true);
        this.f6491d = d6;
        return d6;
    }

    @Override // v4.a0
    public final s b() {
        return this.f6489b;
    }

    @Override // v4.a0
    public final void c(f5.f fVar) {
        d(fVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(@Nullable f5.f fVar, boolean z5) {
        f5.e eVar;
        f5.f fVar2;
        if (z5) {
            fVar2 = new f5.e();
            eVar = fVar2;
        } else {
            eVar = 0;
            fVar2 = fVar;
        }
        List<b> list = this.f6490c;
        int size = list.size();
        long j5 = 0;
        int i6 = 0;
        while (true) {
            f5.h hVar = this.f6488a;
            byte[] bArr = f6487i;
            byte[] bArr2 = f6486h;
            if (i6 < size) {
                b bVar = list.get(i6);
                p pVar = bVar.f6495a;
                fVar2.write(bArr);
                fVar2.g(hVar);
                fVar2.write(bArr2);
                if (pVar != null) {
                    int length = pVar.f6458a.length / 2;
                    for (int i7 = 0; i7 < length; i7++) {
                        fVar2.z(pVar.d(i7)).write(f6485g).z(pVar.g(i7)).write(bArr2);
                    }
                }
                a0 a0Var = bVar.f6496b;
                s b6 = a0Var.b();
                if (b6 != null) {
                    fVar2.z("Content-Type: ").z(b6.f6480a).write(bArr2);
                }
                long a6 = a0Var.a();
                if (a6 != -1) {
                    fVar2.z("Content-Length: ").A(a6).write(bArr2);
                } else if (z5) {
                    eVar.c();
                    return -1L;
                }
                fVar2.write(bArr2);
                if (z5) {
                    j5 += a6;
                } else {
                    a0Var.c(fVar2);
                }
                fVar2.write(bArr2);
                i6++;
            } else {
                fVar2.write(bArr);
                fVar2.g(hVar);
                fVar2.write(bArr);
                fVar2.write(bArr2);
                if (z5) {
                    long j6 = j5 + eVar.f3977c;
                    eVar.c();
                    return j6;
                }
                return j5;
            }
        }
    }
}
