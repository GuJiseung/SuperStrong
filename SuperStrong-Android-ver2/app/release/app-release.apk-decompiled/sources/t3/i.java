package t3;

import java.lang.reflect.Field;
import q3.x;
import t3.j;
/* loaded from: classes.dex */
public final class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f6159d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f6160e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f6161f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q3.j f6162g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ w3.a f6163h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f6164i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z5, boolean z6, Field field, boolean z7, x xVar, q3.j jVar, w3.a aVar, boolean z8) {
        super(str, z5, z6);
        this.f6159d = field;
        this.f6160e = z7;
        this.f6161f = xVar;
        this.f6162g = jVar;
        this.f6163h = aVar;
        this.f6164i = z8;
    }

    @Override // t3.j.b
    public final void a(x3.a aVar, Object obj) {
        Object a6 = this.f6161f.a(aVar);
        if (a6 == null && this.f6164i) {
            return;
        }
        this.f6159d.set(obj, a6);
    }

    @Override // t3.j.b
    public final void b(x3.c cVar, Object obj) {
        Object obj2 = this.f6159d.get(obj);
        boolean z5 = this.f6160e;
        x xVar = this.f6161f;
        if (!z5) {
            xVar = new n(this.f6162g, xVar, this.f6163h.f6587b);
        }
        xVar.b(cVar, obj2);
    }

    @Override // t3.j.b
    public final boolean c(Object obj) {
        return this.f6173b && this.f6159d.get(obj) != obj;
    }
}
