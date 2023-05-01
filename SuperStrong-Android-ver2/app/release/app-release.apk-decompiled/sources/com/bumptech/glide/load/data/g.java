package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f2857d = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final int f2858e = 31;

    /* renamed from: b  reason: collision with root package name */
    public final byte f2859b;

    /* renamed from: c  reason: collision with root package name */
    public int f2860c;

    public g(InputStream inputStream, int i6) {
        super(inputStream);
        if (i6 >= -1 && i6 <= 8) {
            this.f2859b = (byte) i6;
            return;
        }
        throw new IllegalArgumentException(androidx.activity.j.a("Cannot add invalid orientation: ", i6));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i6;
        int i7 = this.f2860c;
        int read = (i7 < 2 || i7 > (i6 = f2858e)) ? super.read() : i7 == i6 ? this.f2859b : f2857d[i7 - 2] & 255;
        if (read != -1) {
            this.f2860c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i6, int i7) {
        int i8;
        int i9 = this.f2860c;
        int i10 = f2858e;
        if (i9 > i10) {
            i8 = super.read(bArr, i6, i7);
        } else if (i9 == i10) {
            bArr[i6] = this.f2859b;
            i8 = 1;
        } else if (i9 < 2) {
            i8 = super.read(bArr, i6, 2 - i9);
        } else {
            int min = Math.min(i10 - i9, i7);
            System.arraycopy(f2857d, this.f2860c - 2, bArr, i6, min);
            i8 = min;
        }
        if (i8 > 0) {
            this.f2860c += i8;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.f2860c = (int) (this.f2860c + skip);
        }
        return skip;
    }
}
