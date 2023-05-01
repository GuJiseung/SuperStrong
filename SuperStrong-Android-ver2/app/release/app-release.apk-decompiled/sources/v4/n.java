package v4;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class n extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final s f6449c = s.a("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6450a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f6451b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f6452a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f6453b = new ArrayList();
    }

    public n(ArrayList arrayList, ArrayList arrayList2) {
        this.f6450a = w4.e.k(arrayList);
        this.f6451b = w4.e.k(arrayList2);
    }

    @Override // v4.a0
    public final long a() {
        return d(null, true);
    }

    @Override // v4.a0
    public final s b() {
        return f6449c;
    }

    @Override // v4.a0
    public final void c(f5.f fVar) {
        d(fVar, false);
    }

    public final long d(@Nullable f5.f fVar, boolean z5) {
        f5.e a6;
        if (z5) {
            a6 = new f5.e();
        } else {
            a6 = fVar.a();
        }
        List<String> list = this.f6450a;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                a6.G(38);
            }
            String str = list.get(i6);
            a6.getClass();
            a6.L(0, str.length(), str);
            a6.G(61);
            String str2 = this.f6451b.get(i6);
            a6.L(0, str2.length(), str2);
        }
        if (z5) {
            long j5 = a6.f3977c;
            a6.c();
            return j5;
        }
        return 0L;
    }
}
