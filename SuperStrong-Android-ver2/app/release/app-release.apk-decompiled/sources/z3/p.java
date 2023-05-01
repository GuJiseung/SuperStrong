package z3;

import android.util.SparseIntArray;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: z  reason: collision with root package name */
    public static final SparseIntArray f7051z;

    /* renamed from: y  reason: collision with root package name */
    public long f7052y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7051z = sparseIntArray;
        sparseIntArray.put(R.id.navigationView, 1);
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.btn_back, 3);
        sparseIntArray.put(R.id.toolbar_title, 4);
        sparseIntArray.put(R.id.toolbar_line, 5);
        sparseIntArray.put(R.id.linearLayout1, 6);
        sparseIntArray.put(R.id.pub_address, 7);
        sparseIntArray.put(R.id.ic_main, 8);
        sparseIntArray.put(R.id.imgPayment, 9);
        sparseIntArray.put(R.id.textView11, 10);
        sparseIntArray.put(R.id.imgTimecoin, 11);
        sparseIntArray.put(R.id.textView12, 12);
        sparseIntArray.put(R.id.imgSwap, 13);
        sparseIntArray.put(R.id.textView13, 14);
        sparseIntArray.put(R.id.tab_layout1, 15);
        sparseIntArray.put(R.id.viewPager, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(androidx.databinding.b r13, android.view.View r14) {
        /*
            r12 = this;
            android.util.SparseIntArray r0 = z3.p.f7051z
            r1 = 17
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.u(r14, r1, r0)
            r1 = 3
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 8
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 9
            r1 = r0[r1]
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = 13
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 11
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 6
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 1
            r1 = r0[r1]
            com.google.android.material.bottomnavigation.BottomNavigationView r1 = (com.google.android.material.bottomnavigation.BottomNavigationView) r1
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 15
            r1 = r0[r1]
            r9 = r1
            com.google.android.material.tabs.TabLayout r9 = (com.google.android.material.tabs.TabLayout) r9
            r1 = 10
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 12
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 14
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 2
            r1 = r0[r1]
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r1 = 5
            r1 = r0[r1]
            android.view.View r1 = (android.view.View) r1
            r1 = 4
            r1 = r0[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 16
            r1 = r0[r1]
            r11 = r1
            androidx.viewpager2.widget.ViewPager2 r11 = (androidx.viewpager2.widget.ViewPager2) r11
            r2 = r12
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1
            r12.f7052y = r1
            r13 = 0
            r13 = r0[r13]
            androidx.constraintlayout.widget.ConstraintLayout r13 = (androidx.constraintlayout.widget.ConstraintLayout) r13
            r0 = 0
            r13.setTag(r0)
            r13 = 2131296430(0x7f0900ae, float:1.8210776E38)
            r14.setTag(r13, r12)
            monitor-enter(r12)
            r13 = 2
            r12.f7052y = r13     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8b
            r12.v()
            return
        L8b:
            r13 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8b
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.p.<init>(androidx.databinding.b, android.view.View):void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void q() {
        synchronized (this) {
            this.f7052y = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean r() {
        synchronized (this) {
            return this.f7052y != 0;
        }
    }

    @Override // z3.o
    public final void x() {
    }
}
