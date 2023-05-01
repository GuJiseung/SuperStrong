package f5;

import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class w extends h {

    /* renamed from: g  reason: collision with root package name */
    public final transient byte[][] f4021g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int[] f4022h;

    public w(e eVar, int i6) {
        super(null);
        a0.a(eVar.f3977c, 0L, i6);
        u uVar = eVar.f3976b;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            int i10 = uVar.f4014c;
            int i11 = uVar.f4013b;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i8 += i10 - i11;
            i9++;
            uVar = uVar.f4017f;
        }
        this.f4021g = new byte[i9];
        this.f4022h = new int[i9 * 2];
        u uVar2 = eVar.f3976b;
        int i12 = 0;
        while (i7 < i6) {
            byte[][] bArr = this.f4021g;
            bArr[i12] = uVar2.f4012a;
            int i13 = uVar2.f4014c;
            int i14 = uVar2.f4013b;
            int i15 = (i13 - i14) + i7;
            i7 = i15 > i6 ? i6 : i15;
            int[] iArr = this.f4022h;
            iArr[i12] = i7;
            iArr[bArr.length + i12] = i14;
            uVar2.f4015d = true;
            i12++;
            uVar2 = uVar2.f4017f;
        }
    }

    @Override // f5.h
    public final String a() {
        return p().a();
    }

    @Override // f5.h
    public final byte e(int i6) {
        byte[][] bArr = this.f4021g;
        int[] iArr = this.f4022h;
        a0.a(iArr[bArr.length - 1], i6, 1L);
        int o5 = o(i6);
        return bArr[o5][(i6 - (o5 == 0 ? 0 : iArr[o5 - 1])) + iArr[bArr.length + o5]];
    }

    @Override // f5.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.j() == j() && i(hVar, j())) {
                return true;
            }
        }
        return false;
    }

    @Override // f5.h
    public final String f() {
        return p().f();
    }

    @Override // f5.h
    public final boolean h(int i6, byte[] bArr, int i7, int i8) {
        int i9;
        if (i6 < 0 || i6 > j() - i8 || i7 < 0 || i7 > bArr.length - i8) {
            return false;
        }
        int o5 = o(i6);
        while (true) {
            boolean z5 = true;
            if (i8 <= 0) {
                return true;
            }
            int[] iArr = this.f4022h;
            if (o5 == 0) {
                i9 = 0;
            } else {
                i9 = iArr[o5 - 1];
            }
            int min = Math.min(i8, ((iArr[o5] - i9) + i9) - i6);
            byte[][] bArr2 = this.f4021g;
            int i10 = (i6 - i9) + iArr[bArr2.length + o5];
            byte[] bArr3 = bArr2[o5];
            Charset charset = a0.f3965a;
            int i11 = 0;
            while (true) {
                if (i11 >= min) {
                    break;
                } else if (bArr3[i11 + i10] != bArr[i11 + i7]) {
                    z5 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (!z5) {
                return false;
            }
            i6 += min;
            i7 += min;
            i8 -= min;
            o5++;
        }
    }

    @Override // f5.h
    public final int hashCode() {
        int i6 = this.f3982c;
        if (i6 != 0) {
            return i6;
        }
        byte[][] bArr = this.f4021g;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            byte[] bArr2 = bArr[i7];
            int[] iArr = this.f4022h;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr2[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        this.f3982c = i8;
        return i8;
    }

    @Override // f5.h
    public final boolean i(h hVar, int i6) {
        if (j() - i6 < 0) {
            return false;
        }
        int o5 = o(0);
        int i7 = 0;
        int i8 = 0;
        while (i6 > 0) {
            int[] iArr = this.f4022h;
            int i9 = o5 == 0 ? 0 : iArr[o5 - 1];
            int min = Math.min(i6, ((iArr[o5] - i9) + i9) - i7);
            byte[][] bArr = this.f4021g;
            if (!hVar.h(i8, bArr[o5], (i7 - i9) + iArr[bArr.length + o5], min)) {
                return false;
            }
            i7 += min;
            i8 += min;
            i6 -= min;
            o5++;
        }
        return true;
    }

    @Override // f5.h
    public final int j() {
        return this.f4022h[this.f4021g.length - 1];
    }

    @Override // f5.h
    public final h k() {
        return p().k();
    }

    @Override // f5.h
    public final h l() {
        return p().l();
    }

    @Override // f5.h
    public final String m() {
        return p().m();
    }

    @Override // f5.h
    public final void n(e eVar) {
        byte[][] bArr = this.f4021g;
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int[] iArr = this.f4022h;
            int i8 = iArr[length + i6];
            int i9 = iArr[i6];
            u uVar = new u(bArr[i6], i8, (i8 + i9) - i7);
            u uVar2 = eVar.f3976b;
            if (uVar2 == null) {
                uVar.f4018g = uVar;
                uVar.f4017f = uVar;
                eVar.f3976b = uVar;
            } else {
                uVar2.f4018g.b(uVar);
            }
            i6++;
            i7 = i9;
        }
        eVar.f3977c += i7;
    }

    public final int o(int i6) {
        int binarySearch = Arrays.binarySearch(this.f4022h, 0, this.f4021g.length, i6 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public final h p() {
        byte[][] bArr = this.f4021g;
        int[] iArr = this.f4022h;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int i8 = iArr[length + i6];
            int i9 = iArr[i6];
            System.arraycopy(bArr[i6], i8, bArr2, i7, i9 - i7);
            i6++;
            i7 = i9;
        }
        return new h(bArr2);
    }

    @Override // f5.h
    public final String toString() {
        return p().toString();
    }
}
