package o4;

import d4.g;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: b  reason: collision with root package name */
    public final int f5613b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5614c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5615d;

    /* renamed from: e  reason: collision with root package name */
    public int f5616e;

    public b(int i6, int i7, int i8) {
        this.f5613b = i8;
        this.f5614c = i7;
        boolean z5 = true;
        if (i8 <= 0 ? i6 < i7 : i6 > i7) {
            z5 = false;
        }
        this.f5615d = z5;
        this.f5616e = z5 ? i6 : i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5615d;
    }

    @Override // d4.g
    public final int nextInt() {
        int i6 = this.f5616e;
        if (i6 != this.f5614c) {
            this.f5616e = this.f5613b + i6;
        } else if (!this.f5615d) {
            throw new NoSuchElementException();
        } else {
            this.f5615d = false;
        }
        return i6;
    }
}
