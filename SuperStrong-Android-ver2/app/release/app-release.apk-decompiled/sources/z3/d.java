package z3;

import android.util.SparseIntArray;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final SparseIntArray f7016x;

    /* renamed from: w  reason: collision with root package name */
    public long f7017w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7016x = sparseIntArray;
        sparseIntArray.put(R.id.loginBtn, 3);
        sparseIntArray.put(R.id.signupBtn, 4);
        sparseIntArray.put(R.id.findPassBtn, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(androidx.databinding.b r11, android.view.View r12) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = z3.d.f7016x
            r1 = 6
            java.lang.Object[] r0 = androidx.databinding.ViewDataBinding.u(r12, r1, r0)
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            android.widget.Button r5 = (android.widget.Button) r5
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.widget.EditText r7 = (android.widget.EditText) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            android.widget.Button r8 = (android.widget.Button) r8
            r1 = 1
            r1 = r0[r1]
            r9 = r1
            android.widget.EditText r9 = (android.widget.EditText) r9
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1 = -1
            r10.f7017w = r1
            r11 = 0
            r11 = r0[r11]
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r0 = 0
            r11.setTag(r0)
            android.widget.EditText r11 = r10.s
            r11.setTag(r0)
            android.widget.EditText r11 = r10.u
            r11.setTag(r0)
            r11 = 2131296430(0x7f0900ae, float:1.8210776E38)
            r12.setTag(r11, r10)
            monitor-enter(r10)
            r11 = 8
            r10.f7017w = r11     // Catch: java.lang.Throwable -> L52
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L52
            r10.v()
            return
        L52:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L52
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.d.<init>(androidx.databinding.b, android.view.View):void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void q() {
        long j5;
        synchronized (this) {
            j5 = this.f7017w;
            this.f7017w = 0L;
        }
        if ((15 & j5) != 0) {
            if ((j5 & 13) != 0) {
                w(0);
            }
            if ((j5 & 14) != 0) {
                w(1);
            }
        }
        if ((14 & j5) != 0) {
            n0.a.a(this.s);
        }
        if ((j5 & 13) != 0) {
            n0.a.a(this.u);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean r() {
        synchronized (this) {
            return this.f7017w != 0;
        }
    }
}
