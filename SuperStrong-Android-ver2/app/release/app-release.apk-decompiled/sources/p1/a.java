package p1;

import com.bumptech.glide.load.data.i;
import i1.g;
import i1.h;
import java.io.InputStream;
import java.util.ArrayDeque;
import o1.f;
import o1.l;
import o1.m;
import o1.n;
import o1.o;
import o1.r;
/* loaded from: classes.dex */
public final class a implements n<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f5708b = g.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final m<f, f> f5709a;

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075a implements o<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final m<f, f> f5710a = new m<>();

        @Override // o1.o
        public final n<f, InputStream> a(r rVar) {
            return new a(this.f5710a);
        }
    }

    public a(m<f, f> mVar) {
        this.f5709a = mVar;
    }

    @Override // o1.n
    public final n.a<InputStream> a(f fVar, int i6, int i7, h hVar) {
        f fVar2 = fVar;
        m<f, f> mVar = this.f5709a;
        if (mVar != null) {
            m.a a6 = m.a.a(fVar2);
            l lVar = mVar.f5542a;
            Object a7 = lVar.a(a6);
            ArrayDeque arrayDeque = m.a.f5543d;
            synchronized (arrayDeque) {
                arrayDeque.offer(a6);
            }
            f fVar3 = (f) a7;
            if (fVar3 == null) {
                lVar.d(m.a.a(fVar2), fVar2);
            } else {
                fVar2 = fVar3;
            }
        }
        return new n.a<>(fVar2, new i(fVar2, ((Integer) hVar.c(f5708b)).intValue()));
    }

    @Override // o1.n
    public final /* bridge */ /* synthetic */ boolean b(f fVar) {
        return true;
    }
}
