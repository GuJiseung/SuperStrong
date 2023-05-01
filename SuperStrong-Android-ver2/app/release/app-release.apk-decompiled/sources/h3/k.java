package h3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import h3.l;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class k extends l.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f4525c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f4526d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f4525c = arrayList;
        this.f4526d = matrix;
    }

    @Override // h3.l.f
    public final void a(Matrix matrix, g3.a aVar, int i6, Canvas canvas) {
        for (l.f fVar : this.f4525c) {
            fVar.a(this.f4526d, aVar, i6, canvas);
        }
    }
}
