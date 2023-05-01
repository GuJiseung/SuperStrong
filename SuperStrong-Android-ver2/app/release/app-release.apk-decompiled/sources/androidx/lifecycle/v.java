package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.x;
/* loaded from: classes.dex */
public final class v implements o {

    /* renamed from: j  reason: collision with root package name */
    public static final v f1771j = new v();

    /* renamed from: f  reason: collision with root package name */
    public Handler f1776f;

    /* renamed from: b  reason: collision with root package name */
    public int f1772b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1773c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1774d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1775e = true;

    /* renamed from: g  reason: collision with root package name */
    public final p f1777g = new p(this);

    /* renamed from: h  reason: collision with root package name */
    public final a f1778h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final b f1779i = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v vVar = v.this;
            int i6 = vVar.f1773c;
            p pVar = vVar.f1777g;
            if (i6 == 0) {
                vVar.f1774d = true;
                pVar.f(j.b.ON_PAUSE);
            }
            if (vVar.f1772b == 0 && vVar.f1774d) {
                pVar.f(j.b.ON_STOP);
                vVar.f1775e = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements x.a {
        public b() {
        }
    }

    public final void c() {
        int i6 = this.f1773c + 1;
        this.f1773c = i6;
        if (i6 == 1) {
            if (!this.f1774d) {
                this.f1776f.removeCallbacks(this.f1778h);
                return;
            }
            this.f1777g.f(j.b.ON_RESUME);
            this.f1774d = false;
        }
    }

    @Override // androidx.lifecycle.o
    public final p v() {
        return this.f1777g;
    }
}
