package r1;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import v4.d0;
/* loaded from: classes.dex */
public final class b implements i1.k, g5.f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f5882b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5883c;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f5882b = obj;
        this.f5883c = obj2;
    }

    @Override // g5.f
    public final Object a(Object obj) {
        v4.d0 d0Var = (v4.d0) obj;
        q3.j jVar = (q3.j) this.f5882b;
        d0.a aVar = d0Var.f6381b;
        if (aVar == null) {
            f5.g h6 = d0Var.h();
            v4.s f6 = d0Var.f();
            Charset charset = StandardCharsets.UTF_8;
            if (f6 != null) {
                try {
                    String str = f6.f6482c;
                    if (str != null) {
                        charset = Charset.forName(str);
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            aVar = new d0.a(h6, charset);
            d0Var.f6381b = aVar;
        }
        jVar.getClass();
        x3.a aVar2 = new x3.a(aVar);
        aVar2.f6694c = jVar.f5842j;
        try {
            Object a6 = ((q3.x) this.f5883c).a(aVar2);
            if (aVar2.M() == 10) {
                return a6;
            }
            throw new q3.o("JSON document was not fully consumed.");
        } finally {
            d0Var.close();
        }
    }

    @Override // i1.d
    public final boolean b(Object obj, File file, i1.h hVar) {
        return ((i1.k) this.f5883c).b(new e(((BitmapDrawable) ((k1.w) obj).get()).getBitmap(), (l1.d) this.f5882b), file, hVar);
    }

    @Override // i1.k
    public final i1.c d(i1.h hVar) {
        return ((i1.k) this.f5883c).d(hVar);
    }
}
