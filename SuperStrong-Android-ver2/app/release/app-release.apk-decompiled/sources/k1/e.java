package k1;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import k1.h;
import k1.m;
import o1.n;
/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final List<i1.f> f4757b;

    /* renamed from: c  reason: collision with root package name */
    public final i<?> f4758c;

    /* renamed from: d  reason: collision with root package name */
    public final h.a f4759d;

    /* renamed from: e  reason: collision with root package name */
    public int f4760e = -1;

    /* renamed from: f  reason: collision with root package name */
    public i1.f f4761f;

    /* renamed from: g  reason: collision with root package name */
    public List<o1.n<File, ?>> f4762g;

    /* renamed from: h  reason: collision with root package name */
    public int f4763h;

    /* renamed from: i  reason: collision with root package name */
    public volatile n.a<?> f4764i;

    /* renamed from: j  reason: collision with root package name */
    public File f4765j;

    public e(List<i1.f> list, i<?> iVar, h.a aVar) {
        this.f4757b = list;
        this.f4758c = iVar;
        this.f4759d = aVar;
    }

    @Override // k1.h
    public final boolean b() {
        boolean z5;
        boolean z6;
        boolean z7;
        while (true) {
            List<o1.n<File, ?>> list = this.f4762g;
            if (list != null) {
                if (this.f4763h < list.size()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    this.f4764i = null;
                    boolean z8 = false;
                    while (!z8) {
                        if (this.f4763h < this.f4762g.size()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (!z6) {
                            break;
                        }
                        List<o1.n<File, ?>> list2 = this.f4762g;
                        int i6 = this.f4763h;
                        this.f4763h = i6 + 1;
                        File file = this.f4765j;
                        i<?> iVar = this.f4758c;
                        this.f4764i = list2.get(i6).a(file, iVar.f4775e, iVar.f4776f, iVar.f4779i);
                        if (this.f4764i != null) {
                            if (this.f4758c.c(this.f4764i.f5549c.a()) != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                this.f4764i.f5549c.f(this.f4758c.f4785o, this);
                                z8 = true;
                            }
                        }
                    }
                    return z8;
                }
            }
            int i7 = this.f4760e + 1;
            this.f4760e = i7;
            if (i7 >= this.f4757b.size()) {
                return false;
            }
            i1.f fVar = this.f4757b.get(this.f4760e);
            i<?> iVar2 = this.f4758c;
            File a6 = ((m.c) iVar2.f4778h).a().a(new f(fVar, iVar2.f4784n));
            this.f4765j = a6;
            if (a6 != null) {
                this.f4761f = fVar;
                this.f4762g = this.f4758c.f4773c.f2801b.e(a6);
                this.f4763h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f4759d.d(this.f4761f, exc, this.f4764i.f5549c, i1.a.DATA_DISK_CACHE);
    }

    @Override // k1.h
    public final void cancel() {
        n.a<?> aVar = this.f4764i;
        if (aVar != null) {
            aVar.f5549c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void d(Object obj) {
        this.f4759d.c(this.f4761f, obj, this.f4764i.f5549c, i1.a.DATA_DISK_CACHE, this.f4761f);
    }
}
