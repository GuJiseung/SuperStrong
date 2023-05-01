package d;
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f3644b;

    /* loaded from: classes.dex */
    public class a extends c.a {
        public a() {
        }

        @Override // f0.s0
        public final void a() {
            j jVar = j.this;
            jVar.f3644b.f3604w.setAlpha(1.0f);
            g gVar = jVar.f3644b;
            gVar.f3607z.d(null);
            gVar.f3607z = null;
        }

        @Override // c.a, f0.s0
        public final void c() {
            j.this.f3644b.f3604w.setVisibility(0);
        }
    }

    public j(g gVar) {
        this.f3644b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            d.g r0 = r5.f3644b
            android.widget.PopupWindow r1 = r0.f3605x
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f3604w
            r3 = 55
            r4 = 0
            r1.showAtLocation(r2, r3, r4, r4)
            f0.r0 r1 = r0.f3607z
            if (r1 == 0) goto L13
            r1.b()
        L13:
            boolean r1 = r0.B
            if (r1 == 0) goto L25
            android.view.ViewGroup r1 = r0.C
            if (r1 == 0) goto L25
            java.util.WeakHashMap<android.view.View, f0.r0> r2 = f0.g0.f3878a
            boolean r1 = f0.g0.g.c(r1)
            if (r1 == 0) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r4
        L26:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L44
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f3604w
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f3604w
            f0.r0 r1 = f0.g0.a(r1)
            r1.a(r2)
            r0.f3607z = r1
            d.j$a r0 = new d.j$a
            r0.<init>()
            r1.d(r0)
            goto L4e
        L44:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f3604w
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f3604w
            r0.setVisibility(r4)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.j.run():void");
    }
}
