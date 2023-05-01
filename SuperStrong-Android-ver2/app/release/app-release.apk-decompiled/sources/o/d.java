package o;

import androidx.fragment.app.r0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.c;
import p.l;
import p.n;
/* loaded from: classes.dex */
public class d {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c Q;
    public final c R;
    public final c[] S;
    public final ArrayList<c> T;
    public final boolean[] U;
    public final int[] V;
    public d W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f5421a0;

    /* renamed from: b  reason: collision with root package name */
    public p.c f5422b;

    /* renamed from: b0  reason: collision with root package name */
    public int f5423b0;

    /* renamed from: c  reason: collision with root package name */
    public p.c f5424c;

    /* renamed from: c0  reason: collision with root package name */
    public int f5425c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f5427d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f5429e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f5431f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f5433g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f5435h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f5437i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f5439j0;

    /* renamed from: k  reason: collision with root package name */
    public String f5440k;

    /* renamed from: k0  reason: collision with root package name */
    public String f5441k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5442l;

    /* renamed from: l0  reason: collision with root package name */
    public int f5443l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5444m;

    /* renamed from: m0  reason: collision with root package name */
    public int f5445m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5446n;

    /* renamed from: n0  reason: collision with root package name */
    public final float[] f5447n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5448o;

    /* renamed from: o0  reason: collision with root package name */
    public final d[] f5449o0;

    /* renamed from: p  reason: collision with root package name */
    public int f5450p;

    /* renamed from: p0  reason: collision with root package name */
    public final d[] f5451p0;

    /* renamed from: q  reason: collision with root package name */
    public int f5452q;

    /* renamed from: q0  reason: collision with root package name */
    public int f5453q0;

    /* renamed from: r  reason: collision with root package name */
    public int f5454r;
    public int r0;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int f5455t;
    public final int[] u;

    /* renamed from: v  reason: collision with root package name */
    public int f5456v;

    /* renamed from: w  reason: collision with root package name */
    public int f5457w;

    /* renamed from: x  reason: collision with root package name */
    public float f5458x;

    /* renamed from: y  reason: collision with root package name */
    public int f5459y;

    /* renamed from: z  reason: collision with root package name */
    public int f5460z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5420a = false;

    /* renamed from: d  reason: collision with root package name */
    public l f5426d = null;

    /* renamed from: e  reason: collision with root package name */
    public n f5428e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5430f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f5432g = true;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5434h = true;

    /* renamed from: i  reason: collision with root package name */
    public int f5436i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f5438j = -1;

    public d() {
        new HashMap();
        this.f5442l = false;
        this.f5444m = false;
        this.f5446n = false;
        this.f5448o = false;
        this.f5450p = -1;
        this.f5452q = -1;
        this.f5454r = 0;
        this.s = 0;
        this.f5455t = 0;
        this.u = new int[2];
        this.f5456v = 0;
        this.f5457w = 0;
        this.f5458x = 1.0f;
        this.f5459y = 0;
        this.f5460z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, c.a.LEFT);
        this.K = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.L = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.M = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.N = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.O = cVar5;
        c cVar6 = new c(this, c.a.CENTER_X);
        this.P = cVar6;
        c cVar7 = new c(this, c.a.CENTER_Y);
        this.Q = cVar7;
        c cVar8 = new c(this, c.a.CENTER);
        this.R = cVar8;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList<c> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        this.V = new int[]{1, 1};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f5421a0 = -1;
        this.f5423b0 = 0;
        this.f5425c0 = 0;
        this.f5427d0 = 0;
        this.f5433g0 = 0.5f;
        this.f5435h0 = 0.5f;
        this.f5439j0 = 0;
        this.f5441k0 = null;
        this.f5443l0 = 0;
        this.f5445m0 = 0;
        this.f5447n0 = new float[]{-1.0f, -1.0f};
        this.f5449o0 = new d[]{null, null};
        this.f5451p0 = new d[]{null, null};
        this.f5453q0 = -1;
        this.r0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i6, int i7, String str, StringBuilder sb) {
        if (i6 == i7) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i6);
        sb.append(",\n");
    }

    public static void H(StringBuilder sb, String str, float f6, float f7) {
        if (f6 == f7) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f6);
        sb.append(",\n");
    }

    public static void o(StringBuilder sb, String str, int i6, int i7, int i8, int i9, int i10, float f6) {
        sb.append(str);
        sb.append(" :  {\n");
        G(i6, 0, "      size", sb);
        G(i7, 0, "      min", sb);
        G(i8, Integer.MAX_VALUE, "      max", sb);
        G(i9, 0, "      matchMin", sb);
        G(i10, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f6, 1.0f);
        sb.append("    },\n");
    }

    public static void p(StringBuilder sb, String str, c cVar) {
        if (cVar.f5407f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(cVar.f5407f);
        sb.append("'");
        if (cVar.f5409h != Integer.MIN_VALUE || cVar.f5408g != 0) {
            sb.append(",");
            sb.append(cVar.f5408g);
            if (cVar.f5409h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f5409h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public boolean A() {
        if (!this.f5442l && (!this.K.f5404c || !this.M.f5404c)) {
            return false;
        }
        return true;
    }

    public boolean B() {
        if (!this.f5444m && (!this.L.f5404c || !this.N.f5404c)) {
            return false;
        }
        return true;
    }

    public void C() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f5421a0 = -1;
        this.f5423b0 = 0;
        this.f5425c0 = 0;
        this.f5427d0 = 0;
        this.f5429e0 = 0;
        this.f5431f0 = 0;
        this.f5433g0 = 0.5f;
        this.f5435h0 = 0.5f;
        int[] iArr = this.V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f5437i0 = null;
        this.f5439j0 = 0;
        this.f5443l0 = 0;
        this.f5445m0 = 0;
        float[] fArr = this.f5447n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f5450p = -1;
        this.f5452q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.f5455t = 0;
        this.f5458x = 1.0f;
        this.A = 1.0f;
        this.f5457w = Integer.MAX_VALUE;
        this.f5460z = Integer.MAX_VALUE;
        this.f5456v = 0;
        this.f5459y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f5430f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f5432g = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f5436i = -1;
        this.f5438j = -1;
    }

    public final void D() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.get(i6).j();
        }
    }

    public final void E() {
        this.f5442l = false;
        this.f5444m = false;
        this.f5446n = false;
        this.f5448o = false;
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            c cVar = arrayList.get(i6);
            cVar.f5404c = false;
            cVar.f5403b = 0;
        }
    }

    public void F(m.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void I(int i6, int i7) {
        if (this.f5442l) {
            return;
        }
        this.K.l(i6);
        this.M.l(i7);
        this.f5423b0 = i6;
        this.X = i7 - i6;
        this.f5442l = true;
    }

    public final void J(int i6, int i7) {
        if (this.f5444m) {
            return;
        }
        this.L.l(i6);
        this.N.l(i7);
        this.f5425c0 = i6;
        this.Y = i7 - i6;
        if (this.F) {
            this.O.l(i6 + this.f5427d0);
        }
        this.f5444m = true;
    }

    public final void K(int i6) {
        this.Y = i6;
        int i7 = this.f5431f0;
        if (i6 < i7) {
            this.Y = i7;
        }
    }

    public final void L(int i6) {
        this.V[0] = i6;
    }

    public final void M(int i6) {
        this.V[1] = i6;
    }

    public final void N(int i6) {
        this.X = i6;
        int i7 = this.f5429e0;
        if (i6 < i7) {
            this.X = i7;
        }
    }

    public void O(boolean z5, boolean z6) {
        int i6;
        int i7;
        l lVar = this.f5426d;
        boolean z7 = z5 & lVar.f5679g;
        n nVar = this.f5428e;
        boolean z8 = z6 & nVar.f5679g;
        int i8 = lVar.f5680h.f5654g;
        int i9 = nVar.f5680h.f5654g;
        int i10 = lVar.f5681i.f5654g;
        int i11 = nVar.f5681i.f5654g;
        int i12 = i11 - i9;
        if (i10 - i8 < 0 || i12 < 0 || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE) {
            i10 = 0;
            i11 = 0;
            i8 = 0;
            i9 = 0;
        }
        int i13 = i10 - i8;
        int i14 = i11 - i9;
        if (z7) {
            this.f5423b0 = i8;
        }
        if (z8) {
            this.f5425c0 = i9;
        }
        if (this.f5439j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        if (z7) {
            if (iArr[0] == 1 && i13 < (i7 = this.X)) {
                i13 = i7;
            }
            this.X = i13;
            int i15 = this.f5429e0;
            if (i13 < i15) {
                this.X = i15;
            }
        }
        if (z8) {
            if (iArr[1] == 1 && i14 < (i6 = this.Y)) {
                i14 = i6;
            }
            this.Y = i14;
            int i16 = this.f5431f0;
            if (i14 < i16) {
                this.Y = i16;
            }
        }
    }

    public void P(m.d dVar, boolean z5) {
        int i6;
        int i7;
        n nVar;
        l lVar;
        dVar.getClass();
        int o5 = m.d.o(this.K);
        int o6 = m.d.o(this.L);
        int o7 = m.d.o(this.M);
        int o8 = m.d.o(this.N);
        if (z5 && (lVar = this.f5426d) != null) {
            p.f fVar = lVar.f5680h;
            if (fVar.f5657j) {
                p.f fVar2 = lVar.f5681i;
                if (fVar2.f5657j) {
                    o5 = fVar.f5654g;
                    o7 = fVar2.f5654g;
                }
            }
        }
        if (z5 && (nVar = this.f5428e) != null) {
            p.f fVar3 = nVar.f5680h;
            if (fVar3.f5657j) {
                p.f fVar4 = nVar.f5681i;
                if (fVar4.f5657j) {
                    o6 = fVar3.f5654g;
                    o8 = fVar4.f5654g;
                }
            }
        }
        int i8 = o8 - o6;
        if (o7 - o5 < 0 || i8 < 0 || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE || o6 == Integer.MIN_VALUE || o6 == Integer.MAX_VALUE || o7 == Integer.MIN_VALUE || o7 == Integer.MAX_VALUE || o8 == Integer.MIN_VALUE || o8 == Integer.MAX_VALUE) {
            o5 = 0;
            o6 = 0;
            o7 = 0;
            o8 = 0;
        }
        int i9 = o7 - o5;
        int i10 = o8 - o6;
        this.f5423b0 = o5;
        this.f5425c0 = o6;
        if (this.f5439j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        int i11 = iArr[0];
        if (i11 == 1 && i9 < (i7 = this.X)) {
            i9 = i7;
        }
        if (iArr[1] == 1 && i10 < (i6 = this.Y)) {
            i10 = i6;
        }
        this.X = i9;
        this.Y = i10;
        int i12 = this.f5431f0;
        if (i10 < i12) {
            this.Y = i12;
        }
        int i13 = this.f5429e0;
        if (i9 < i13) {
            this.X = i13;
        }
        int i14 = this.f5457w;
        if (i14 > 0 && i11 == 3) {
            this.X = Math.min(this.X, i14);
        }
        int i15 = this.f5460z;
        if (i15 > 0 && iArr[1] == 3) {
            this.Y = Math.min(this.Y, i15);
        }
        int i16 = this.X;
        if (i9 != i16) {
            this.f5436i = i16;
        }
        int i17 = this.Y;
        if (i10 != i17) {
            this.f5438j = i17;
        }
    }

    public final void b(e eVar, m.d dVar, HashSet<d> hashSet, int i6, boolean z5) {
        if (z5) {
            if (!hashSet.contains(this)) {
                return;
            }
            r0.a(eVar, dVar, this);
            hashSet.remove(this);
            c(dVar, eVar.V(64));
        }
        if (i6 == 0) {
            HashSet<c> hashSet2 = this.K.f5402a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f5405d.b(eVar, dVar, hashSet, i6, true);
                }
            }
            HashSet<c> hashSet3 = this.M.f5402a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f5405d.b(eVar, dVar, hashSet, i6, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.L.f5402a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f5405d.b(eVar, dVar, hashSet, i6, true);
            }
        }
        HashSet<c> hashSet5 = this.N.f5402a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f5405d.b(eVar, dVar, hashSet, i6, true);
            }
        }
        HashSet<c> hashSet6 = this.O.f5402a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f5405d.b(eVar, dVar, hashSet, i6, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d9, code lost:
        if (r0.d() > r3.J0.get().d()) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(m.d r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 1943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.c(m.d, boolean):void");
    }

    public boolean d() {
        return this.f5439j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0364 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0411 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(m.d r29, boolean r30, boolean r31, boolean r32, boolean r33, m.h r34, m.h r35, int r36, boolean r37, o.c r38, o.c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.e(m.d, boolean, boolean, boolean, boolean, m.h, m.h, int, boolean, o.c, o.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013a, code lost:
        if (r13 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0161, code lost:
        if (r13.h() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0188, code lost:
        if (r13.h() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
        r11.j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(o.c.a r11, o.d r12, o.c.a r13, int r14) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.f(o.c$a, o.d, o.c$a, int):void");
    }

    public final void g(c cVar, c cVar2, int i6) {
        if (cVar.f5405d == this) {
            f(cVar.f5406e, cVar2.f5405d, cVar2.f5406e, i6);
        }
    }

    public final void h(m.d dVar) {
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        dVar.l(this.N);
        if (this.f5427d0 > 0) {
            dVar.l(this.O);
        }
    }

    public final void i() {
        if (this.f5426d == null) {
            this.f5426d = new l(this);
        }
        if (this.f5428e == null) {
            this.f5428e = new n(this);
        }
    }

    public c j(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int k(int i6) {
        int[] iArr = this.V;
        if (i6 == 0) {
            return iArr[0];
        }
        if (i6 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int l() {
        if (this.f5439j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final d m(int i6) {
        c cVar;
        c cVar2;
        if (i6 != 0) {
            if (i6 == 1 && (cVar2 = (cVar = this.N).f5407f) != null && cVar2.f5407f == cVar) {
                return cVar2.f5405d;
            }
            return null;
        }
        c cVar3 = this.M;
        c cVar4 = cVar3.f5407f;
        if (cVar4 == null || cVar4.f5407f != cVar3) {
            return null;
        }
        return cVar4.f5405d;
    }

    public void n(StringBuilder sb) {
        sb.append("  " + this.f5440k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f5423b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f5425c0);
        sb.append("\n");
        p(sb, "left", this.K);
        p(sb, "top", this.L);
        p(sb, "right", this.M);
        p(sb, "bottom", this.N);
        p(sb, "baseline", this.O);
        p(sb, "centerX", this.P);
        p(sb, "centerY", this.Q);
        int i6 = this.X;
        int i7 = this.f5429e0;
        int[] iArr = this.D;
        int i8 = iArr[0];
        int i9 = this.f5456v;
        int i10 = this.s;
        float f6 = this.f5458x;
        float[] fArr = this.f5447n0;
        float f7 = fArr[0];
        o(sb, "    width", i6, i7, i8, i9, i10, f6);
        int i11 = this.Y;
        int i12 = this.f5431f0;
        int i13 = iArr[1];
        int i14 = this.f5459y;
        int i15 = this.f5455t;
        float f8 = this.A;
        float f9 = fArr[1];
        o(sb, "    height", i11, i12, i13, i14, i15, f8);
        float f10 = this.Z;
        int i16 = this.f5421a0;
        if (f10 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f10);
            sb.append(",");
            sb.append(i16);
            sb.append("");
            sb.append("],\n");
        }
        H(sb, "    horizontalBias", this.f5433g0, 0.5f);
        H(sb, "    verticalBias", this.f5435h0, 0.5f);
        G(this.f5443l0, 0, "    horizontalChainStyle", sb);
        G(this.f5445m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int q() {
        if (this.f5439j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int r() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f5423b0 : ((e) dVar).f5466z0 + this.f5423b0;
    }

    public final int s() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f5425c0 : ((e) dVar).A0 + this.f5425c0;
    }

    public final boolean t(int i6) {
        if (i6 == 0) {
            return (this.K.f5407f != null ? 1 : 0) + (this.M.f5407f != null ? 1 : 0) < 2;
        }
        return ((this.L.f5407f != null ? 1 : 0) + (this.N.f5407f != null ? 1 : 0)) + (this.O.f5407f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append("");
        if (this.f5441k0 != null) {
            str = "id: " + this.f5441k0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f5423b0);
        sb.append(", ");
        sb.append(this.f5425c0);
        sb.append(") - (");
        sb.append(this.X);
        sb.append(" x ");
        sb.append(this.Y);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(int i6, int i7) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i6 == 0) {
            c cVar5 = this.K;
            c cVar6 = cVar5.f5407f;
            if (cVar6 != null && cVar6.f5404c && (cVar4 = (cVar3 = this.M).f5407f) != null && cVar4.f5404c) {
                if ((cVar4.d() - cVar3.e()) - (cVar5.e() + cVar5.f5407f.d()) >= i7) {
                    return true;
                }
                return false;
            }
        } else {
            c cVar7 = this.L;
            c cVar8 = cVar7.f5407f;
            if (cVar8 != null && cVar8.f5404c && (cVar2 = (cVar = this.N).f5407f) != null && cVar2.f5404c) {
                if ((cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f5407f.d()) >= i7) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void v(c.a aVar, d dVar, c.a aVar2, int i6, int i7) {
        j(aVar).b(dVar.j(aVar2), i6, i7, true);
    }

    public final boolean w(int i6) {
        c cVar;
        c cVar2;
        int i7 = i6 * 2;
        c[] cVarArr = this.S;
        c cVar3 = cVarArr[i7];
        c cVar4 = cVar3.f5407f;
        return (cVar4 == null || cVar4.f5407f == cVar3 || (cVar2 = (cVar = cVarArr[i7 + 1]).f5407f) == null || cVar2.f5407f != cVar) ? false : true;
    }

    public final boolean x() {
        c cVar = this.K;
        c cVar2 = cVar.f5407f;
        if (cVar2 == null || cVar2.f5407f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f5407f;
            return cVar4 != null && cVar4.f5407f == cVar3;
        }
        return true;
    }

    public final boolean y() {
        c cVar = this.L;
        c cVar2 = cVar.f5407f;
        if (cVar2 == null || cVar2.f5407f != cVar) {
            c cVar3 = this.N;
            c cVar4 = cVar3.f5407f;
            return cVar4 != null && cVar4.f5407f == cVar3;
        }
        return true;
    }

    public final boolean z() {
        return this.f5432g && this.f5439j0 != 8;
    }
}
