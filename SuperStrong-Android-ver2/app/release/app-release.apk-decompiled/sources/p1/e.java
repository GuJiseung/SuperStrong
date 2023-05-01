package p1;

import i1.h;
import java.io.InputStream;
import java.net.URL;
import o1.f;
import o1.n;
import o1.o;
import o1.r;
/* loaded from: classes.dex */
public final class e implements n<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<f, InputStream> f5732a;

    /* loaded from: classes.dex */
    public static class a implements o<URL, InputStream> {
        @Override // o1.o
        public final n<URL, InputStream> a(r rVar) {
            return new e(rVar.b(f.class, InputStream.class));
        }
    }

    public e(n<f, InputStream> nVar) {
        this.f5732a = nVar;
    }

    @Override // o1.n
    public final n.a<InputStream> a(URL url, int i6, int i7, h hVar) {
        return this.f5732a.a(new f(url), i6, i7, hVar);
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(URL url) {
        return true;
    }
}
