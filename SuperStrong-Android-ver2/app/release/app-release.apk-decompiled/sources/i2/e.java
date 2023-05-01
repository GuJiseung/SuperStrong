package i2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public class e<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public f f4615a;

    /* renamed from: b  reason: collision with root package name */
    public int f4616b;

    public e() {
        this.f4616b = 0;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4616b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        t(coordinatorLayout, v2, i6);
        if (this.f4615a == null) {
            this.f4615a = new f(v2);
        }
        f fVar = this.f4615a;
        View view = fVar.f4617a;
        fVar.f4618b = view.getTop();
        fVar.f4619c = view.getLeft();
        this.f4615a.a();
        int i7 = this.f4616b;
        if (i7 != 0) {
            f fVar2 = this.f4615a;
            if (fVar2.f4620d != i7) {
                fVar2.f4620d = i7;
                fVar2.a();
            }
            this.f4616b = 0;
            return true;
        }
        return true;
    }

    public final int s() {
        f fVar = this.f4615a;
        if (fVar != null) {
            return fVar.f4620d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        coordinatorLayout.q(v2, i6);
    }
}
