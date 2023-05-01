package g;

import android.view.View;
import android.view.animation.Interpolator;
import f0.r0;
import f0.s0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f4082c;

    /* renamed from: d  reason: collision with root package name */
    public s0 f4083d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4084e;

    /* renamed from: b  reason: collision with root package name */
    public long f4081b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final a f4085f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<r0> f4080a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends c.a {

        /* renamed from: n  reason: collision with root package name */
        public boolean f4086n = false;

        /* renamed from: o  reason: collision with root package name */
        public int f4087o = 0;

        public a() {
        }

        @Override // f0.s0
        public final void a() {
            int i6 = this.f4087o + 1;
            this.f4087o = i6;
            g gVar = g.this;
            if (i6 == gVar.f4080a.size()) {
                s0 s0Var = gVar.f4083d;
                if (s0Var != null) {
                    s0Var.a();
                }
                this.f4087o = 0;
                this.f4086n = false;
                gVar.f4084e = false;
            }
        }

        @Override // c.a, f0.s0
        public final void c() {
            if (this.f4086n) {
                return;
            }
            this.f4086n = true;
            s0 s0Var = g.this.f4083d;
            if (s0Var != null) {
                s0Var.c();
            }
        }
    }

    public final void a() {
        if (this.f4084e) {
            Iterator<r0> it = this.f4080a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f4084e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f4084e) {
            return;
        }
        Iterator<r0> it = this.f4080a.iterator();
        while (it.hasNext()) {
            r0 next = it.next();
            long j5 = this.f4081b;
            if (j5 >= 0) {
                next.c(j5);
            }
            Interpolator interpolator = this.f4082c;
            if (interpolator != null && (view = next.f3912a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f4083d != null) {
                next.d(this.f4085f);
            }
            View view2 = next.f3912a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4084e = true;
    }
}
