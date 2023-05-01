package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: b  reason: collision with root package name */
    public final OutputStream f2850b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2851c;

    /* renamed from: d  reason: collision with root package name */
    public final l1.b f2852d;

    /* renamed from: e  reason: collision with root package name */
    public int f2853e;

    public c(FileOutputStream fileOutputStream, l1.b bVar) {
        this.f2850b = fileOutputStream;
        this.f2852d = bVar;
        this.f2851c = (byte[]) bVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f2850b;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f2851c;
            if (bArr != null) {
                this.f2852d.put(bArr);
                this.f2851c = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i6 = this.f2853e;
        OutputStream outputStream = this.f2850b;
        if (i6 > 0) {
            outputStream.write(this.f2851c, 0, i6);
            this.f2853e = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i6) {
        byte[] bArr = this.f2851c;
        int i7 = this.f2853e;
        int i8 = i7 + 1;
        this.f2853e = i8;
        bArr[i7] = (byte) i6;
        if (i8 != bArr.length || i8 <= 0) {
            return;
        }
        this.f2850b.write(bArr, 0, i8);
        this.f2853e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i6, int i7) {
        int i8 = 0;
        do {
            int i9 = i7 - i8;
            int i10 = i6 + i8;
            int i11 = this.f2853e;
            OutputStream outputStream = this.f2850b;
            if (i11 == 0 && i9 >= this.f2851c.length) {
                outputStream.write(bArr, i10, i9);
                return;
            }
            int min = Math.min(i9, this.f2851c.length - i11);
            System.arraycopy(bArr, i10, this.f2851c, this.f2853e, min);
            int i12 = this.f2853e + min;
            this.f2853e = i12;
            i8 += min;
            byte[] bArr2 = this.f2851c;
            if (i12 == bArr2.length && i12 > 0) {
                outputStream.write(bArr2, 0, i12);
                this.f2853e = 0;
                continue;
            }
        } while (i8 < i7);
    }
}
