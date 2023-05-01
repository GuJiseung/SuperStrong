package o1;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o1.n;
/* loaded from: classes.dex */
public final class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f5587b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    public final n<f, Data> f5588a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // o1.o
        public final n<Uri, InputStream> a(r rVar) {
            return new w(rVar.b(f.class, InputStream.class));
        }
    }

    public w(n<f, Data> nVar) {
        this.f5588a = nVar;
    }

    @Override // o1.n
    public final n.a a(Uri uri, int i6, int i7, i1.h hVar) {
        return this.f5588a.a(new f(uri.toString()), i6, i7, hVar);
    }

    @Override // o1.n
    public final boolean b(Uri uri) {
        return f5587b.contains(uri.getScheme());
    }
}
