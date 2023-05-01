package m1;

import androidx.activity.k;
import f2.a;
import f2.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final e2.g<i1.f, String> f5264a = new e2.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f5265b = f2.a.a(10, new a());

    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // f2.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: b  reason: collision with root package name */
        public final MessageDigest f5266b;

        /* renamed from: c  reason: collision with root package name */
        public final d.a f5267c = new d.a();

        public b(MessageDigest messageDigest) {
            this.f5266b = messageDigest;
        }

        @Override // f2.a.d
        public final d.a b() {
            return this.f5267c;
        }
    }

    public final String a(i1.f fVar) {
        String a6;
        synchronized (this.f5264a) {
            a6 = this.f5264a.a(fVar);
        }
        if (a6 == null) {
            Object b6 = this.f5265b.b();
            k.h(b6);
            b bVar = (b) b6;
            try {
                fVar.b(bVar.f5266b);
                byte[] digest = bVar.f5266b.digest();
                char[] cArr = e2.j.f3833b;
                synchronized (cArr) {
                    for (int i6 = 0; i6 < digest.length; i6++) {
                        int i7 = digest[i6] & 255;
                        int i8 = i6 * 2;
                        char[] cArr2 = e2.j.f3832a;
                        cArr[i8] = cArr2[i7 >>> 4];
                        cArr[i8 + 1] = cArr2[i7 & 15];
                    }
                    a6 = new String(cArr);
                }
            } finally {
                this.f5265b.a(bVar);
            }
        }
        synchronized (this.f5264a) {
            this.f5264a.d(fVar, a6);
        }
        return a6;
    }
}
