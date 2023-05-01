package m;

import java.util.ArrayList;
import m.d;
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public a f5157d;

    /* renamed from: a  reason: collision with root package name */
    public h f5154a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f5155b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f5156c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f5158e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i6);

        void b(h hVar, float f6, boolean z5);

        boolean c(h hVar);

        void clear();

        float d(h hVar);

        int e();

        void f(h hVar, float f6);

        h g(int i6);

        void h(float f6);

        float i(b bVar, boolean z5);

        float j(h hVar, boolean z5);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f5157d = new m.a(this, cVar);
    }

    @Override // m.d.a
    public h a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(d dVar, int i6) {
        this.f5157d.f(dVar.k(i6), 1.0f);
        this.f5157d.f(dVar.k(i6), -1.0f);
    }

    public final void c(h hVar, h hVar2, h hVar3, int i6) {
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            this.f5155b = i6;
        }
        if (z5) {
            this.f5157d.f(hVar, 1.0f);
            this.f5157d.f(hVar2, -1.0f);
            this.f5157d.f(hVar3, -1.0f);
            return;
        }
        this.f5157d.f(hVar, -1.0f);
        this.f5157d.f(hVar2, 1.0f);
        this.f5157d.f(hVar3, 1.0f);
    }

    public final void d(h hVar, h hVar2, h hVar3, int i6) {
        boolean z5 = false;
        if (i6 != 0) {
            if (i6 < 0) {
                i6 *= -1;
                z5 = true;
            }
            this.f5155b = i6;
        }
        if (z5) {
            this.f5157d.f(hVar, 1.0f);
            this.f5157d.f(hVar2, -1.0f);
            this.f5157d.f(hVar3, 1.0f);
            return;
        }
        this.f5157d.f(hVar, -1.0f);
        this.f5157d.f(hVar2, 1.0f);
        this.f5157d.f(hVar3, -1.0f);
    }

    public boolean e() {
        return this.f5154a == null && this.f5155b == 0.0f && this.f5157d.e() == 0;
    }

    public final h f(boolean[] zArr, h hVar) {
        int i6;
        int e6 = this.f5157d.e();
        h hVar2 = null;
        float f6 = 0.0f;
        for (int i7 = 0; i7 < e6; i7++) {
            float a6 = this.f5157d.a(i7);
            if (a6 < 0.0f) {
                h g2 = this.f5157d.g(i7);
                if ((zArr == null || !zArr[g2.f5190c]) && g2 != hVar && (((i6 = g2.f5197j) == 3 || i6 == 4) && a6 < f6)) {
                    f6 = a6;
                    hVar2 = g2;
                }
            }
        }
        return hVar2;
    }

    public final void g(h hVar) {
        h hVar2 = this.f5154a;
        if (hVar2 != null) {
            this.f5157d.f(hVar2, -1.0f);
            this.f5154a.f5191d = -1;
            this.f5154a = null;
        }
        float j5 = this.f5157d.j(hVar, true) * (-1.0f);
        this.f5154a = hVar;
        if (j5 == 1.0f) {
            return;
        }
        this.f5155b /= j5;
        this.f5157d.h(j5);
    }

    public final void h(d dVar, h hVar, boolean z5) {
        if (hVar == null || !hVar.f5194g) {
            return;
        }
        float d6 = this.f5157d.d(hVar);
        this.f5155b = (hVar.f5193f * d6) + this.f5155b;
        this.f5157d.j(hVar, z5);
        if (z5) {
            hVar.b(this);
        }
        if (this.f5157d.e() == 0) {
            this.f5158e = true;
            dVar.f5165a = true;
        }
    }

    public void i(d dVar, b bVar, boolean z5) {
        float i6 = this.f5157d.i(bVar, z5);
        this.f5155b = (bVar.f5155b * i6) + this.f5155b;
        if (z5) {
            bVar.f5154a.b(this);
        }
        if (this.f5154a == null || this.f5157d.e() != 0) {
            return;
        }
        this.f5158e = true;
        dVar.f5165a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            m.h r0 = r9.f5154a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            m.h r1 = r9.f5154a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f5155b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f5155b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L45
        L44:
            r1 = r4
        L45:
            m.b$a r5 = r9.f5157d
            int r5 = r5.e()
        L4b:
            if (r4 >= r5) goto Lbd
            m.b$a r6 = r9.f5157d
            m.h r6 = r6.g(r4)
            if (r6 != 0) goto L56
            goto Lba
        L56:
            m.b$a r7 = r9.f5157d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L61
            goto Lba
        L61:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L76
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L96
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L8c
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L8a
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L96
        L8a:
            java.lang.String r0 = " - "
        L8c:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L96:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Laf
        La2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Laf:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r3
        Lba:
            int r4 = r4 + 1
            goto L4b
        Lbd:
            if (r1 != 0) goto Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.toString():java.lang.String");
    }
}
