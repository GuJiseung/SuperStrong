package z3;

import android.util.SparseIntArray;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: t  reason: collision with root package name */
    public static final SparseIntArray f7011t;
    public long s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7011t = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.btn_back, 2);
        sparseIntArray.put(R.id.toolbar_title, 3);
        sparseIntArray.put(R.id.frameLayout, 4);
        sparseIntArray.put(R.id.navigationView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(androidx.databinding.b r4, android.view.View r5) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = z3.b.f7011t
            r1 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.u(r5, r1, r0)
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 4
            r2 = r0[r2]
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2 = 5
            r2 = r0[r2]
            com.google.android.material.bottomnavigation.BottomNavigationView r2 = (com.google.android.material.bottomnavigation.BottomNavigationView) r2
            r2 = 1
            r2 = r0[r2]
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            r2 = 3
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3.<init>(r4, r5, r1)
            r1 = -1
            r3.s = r1
            r4 = 0
            r4 = r0[r4]
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r0 = 0
            r4.setTag(r0)
            r4 = 2131296430(0x7f0900ae, float:1.8210776E38)
            r5.setTag(r4, r3)
            monitor-enter(r3)
            r4 = 2
            r3.s = r4     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            r3.v()
            return
        L40:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.b.<init>(androidx.databinding.b, android.view.View):void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void q() {
        synchronized (this) {
            this.s = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean r() {
        synchronized (this) {
            return this.s != 0;
        }
    }

    @Override // z3.a
    public final void x() {
    }
}
