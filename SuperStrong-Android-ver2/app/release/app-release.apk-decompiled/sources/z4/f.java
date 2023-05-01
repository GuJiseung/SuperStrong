package z4;

import java.util.List;
import javax.annotation.Nullable;
import v4.b0;
import v4.r;
import v4.x;
/* loaded from: classes.dex */
public final class f implements r.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<r> f7080a;

    /* renamed from: b  reason: collision with root package name */
    public final y4.i f7081b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final y4.c f7082c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7083d;

    /* renamed from: e  reason: collision with root package name */
    public final x f7084e;

    /* renamed from: f  reason: collision with root package name */
    public final v4.d f7085f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7086g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7087h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7088i;

    /* renamed from: j  reason: collision with root package name */
    public int f7089j;

    public f(List<r> list, y4.i iVar, @Nullable y4.c cVar, int i6, x xVar, v4.d dVar, int i7, int i8, int i9) {
        this.f7080a = list;
        this.f7081b = iVar;
        this.f7082c = cVar;
        this.f7083d = i6;
        this.f7084e = xVar;
        this.f7085f = dVar;
        this.f7086g = i7;
        this.f7087h = i8;
        this.f7088i = i9;
    }

    public final b0 a(x xVar) {
        return b(xVar, this.f7081b, this.f7082c);
    }

    public final b0 b(x xVar, y4.i iVar, @Nullable y4.c cVar) {
        List<r> list = this.f7080a;
        int size = list.size();
        int i6 = this.f7083d;
        if (i6 < size) {
            this.f7089j++;
            y4.c cVar2 = this.f7082c;
            if (cVar2 != null && !cVar2.a().j(xVar.f6556a)) {
                throw new IllegalStateException("network interceptor " + list.get(i6 - 1) + " must retain the same host and port");
            }
            if (cVar2 != null && this.f7089j > 1) {
                throw new IllegalStateException("network interceptor " + list.get(i6 - 1) + " must call proceed() exactly once");
            }
            List<r> list2 = this.f7080a;
            int i7 = i6 + 1;
            f fVar = new f(list2, iVar, cVar, i7, xVar, this.f7085f, this.f7086g, this.f7087h, this.f7088i);
            r rVar = list2.get(i6);
            b0 a6 = rVar.a(fVar);
            if (cVar != null && i7 < list.size() && fVar.f7089j != 1) {
                throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
            } else if (a6 != null) {
                if (a6.f6342h != null) {
                    return a6;
                }
                throw new IllegalStateException("interceptor " + rVar + " returned a response with no body");
            } else {
                throw new NullPointerException("interceptor " + rVar + " returned null");
            }
        }
        throw new AssertionError();
    }
}
