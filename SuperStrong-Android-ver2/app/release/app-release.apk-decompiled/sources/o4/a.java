package o4;

import java.util.Iterator;
/* loaded from: classes.dex */
public class a implements Iterable<Integer> {

    /* renamed from: b  reason: collision with root package name */
    public final int f5610b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5611c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5612d;

    public a(int i6, int i7, int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MIN_VALUE) {
                this.f5610b = i6;
                if (i8 > 0) {
                    if (i6 < i7) {
                        int i9 = i7 % i8;
                        int i10 = i6 % i8;
                        int i11 = ((i9 < 0 ? i9 + i8 : i9) - (i10 < 0 ? i10 + i8 : i10)) % i8;
                        i7 -= i11 < 0 ? i11 + i8 : i11;
                    }
                } else if (i8 < 0) {
                    if (i6 > i7) {
                        int i12 = -i8;
                        int i13 = i6 % i12;
                        int i14 = i7 % i12;
                        int i15 = ((i13 < 0 ? i13 + i12 : i13) - (i14 < 0 ? i14 + i12 : i14)) % i12;
                        i7 += i15 < 0 ? i15 + i12 : i15;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.f5611c = i7;
                this.f5612d = i8;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new b(this.f5610b, this.f5611c, this.f5612d);
    }
}
