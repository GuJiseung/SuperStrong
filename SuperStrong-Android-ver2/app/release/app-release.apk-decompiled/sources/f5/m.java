package f5;

import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: b  reason: collision with root package name */
    public final g f3992b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f3993c;

    /* renamed from: d  reason: collision with root package name */
    public int f3994d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3995e;

    public m(t tVar, Inflater inflater) {
        this.f3992b = tVar;
        this.f3993c = inflater;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        r9 = r6.f3994d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r9 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        r9 = r9 - r8.getRemaining();
        r6.f3994d -= r9;
        r0.skip(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        if (r1.f4013b != r1.f4014c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        r7.f3976b = r1.a();
        f5.v.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: DataFormatException -> 0x00a7, TryCatch #0 {DataFormatException -> 0x00a7, blocks: (B:18:0x0044, B:20:0x005e, B:22:0x006a, B:24:0x0070, B:29:0x007a, B:30:0x0081, B:31:0x0082, B:35:0x0095, B:37:0x009b, B:34:0x0087), top: B:47:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e A[SYNTHETIC] */
    @Override // f5.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long B(f5.e r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.f3995e
            if (r8 != 0) goto Lb6
        L4:
            java.util.zip.Inflater r8 = r6.f3993c
            boolean r9 = r8.needsInput()
            f5.g r0 = r6.f3992b
            r1 = 1
            if (r9 != 0) goto L10
            goto L43
        L10:
            int r9 = r6.f3994d
            if (r9 != 0) goto L15
            goto L23
        L15:
            int r2 = r8.getRemaining()
            int r9 = r9 - r2
            int r2 = r6.f3994d
            int r2 = r2 - r9
            r6.f3994d = r2
            long r2 = (long) r9
            r0.skip(r2)
        L23:
            int r9 = r8.getRemaining()
            if (r9 != 0) goto Lae
            boolean r9 = r0.m()
            if (r9 == 0) goto L31
            r9 = r1
            goto L44
        L31:
            f5.e r9 = r0.a()
            f5.u r9 = r9.f3976b
            int r2 = r9.f4014c
            int r3 = r9.f4013b
            int r2 = r2 - r3
            r6.f3994d = r2
            byte[] r9 = r9.f4012a
            r8.setInput(r9, r3, r2)
        L43:
            r9 = 0
        L44:
            f5.u r1 = r7.E(r1)     // Catch: java.util.zip.DataFormatException -> La7
            int r2 = r1.f4014c     // Catch: java.util.zip.DataFormatException -> La7
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch: java.util.zip.DataFormatException -> La7
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = java.lang.Math.min(r4, r2)     // Catch: java.util.zip.DataFormatException -> La7
            int r2 = (int) r2     // Catch: java.util.zip.DataFormatException -> La7
            byte[] r3 = r1.f4012a     // Catch: java.util.zip.DataFormatException -> La7
            int r4 = r1.f4014c     // Catch: java.util.zip.DataFormatException -> La7
            int r2 = r8.inflate(r3, r4, r2)     // Catch: java.util.zip.DataFormatException -> La7
            if (r2 <= 0) goto L6a
            int r8 = r1.f4014c     // Catch: java.util.zip.DataFormatException -> La7
            int r8 = r8 + r2
            r1.f4014c = r8     // Catch: java.util.zip.DataFormatException -> La7
            long r8 = r7.f3977c     // Catch: java.util.zip.DataFormatException -> La7
            long r0 = (long) r2     // Catch: java.util.zip.DataFormatException -> La7
            long r8 = r8 + r0
            r7.f3977c = r8     // Catch: java.util.zip.DataFormatException -> La7
            return r0
        L6a:
            boolean r2 = r8.finished()     // Catch: java.util.zip.DataFormatException -> La7
            if (r2 != 0) goto L82
            boolean r2 = r8.needsDictionary()     // Catch: java.util.zip.DataFormatException -> La7
            if (r2 == 0) goto L77
            goto L82
        L77:
            if (r9 != 0) goto L7a
            goto L4
        L7a:
            java.io.EOFException r7 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> La7
            java.lang.String r8 = "source exhausted prematurely"
            r7.<init>(r8)     // Catch: java.util.zip.DataFormatException -> La7
            throw r7     // Catch: java.util.zip.DataFormatException -> La7
        L82:
            int r9 = r6.f3994d     // Catch: java.util.zip.DataFormatException -> La7
            if (r9 != 0) goto L87
            goto L95
        L87:
            int r8 = r8.getRemaining()     // Catch: java.util.zip.DataFormatException -> La7
            int r9 = r9 - r8
            int r8 = r6.f3994d     // Catch: java.util.zip.DataFormatException -> La7
            int r8 = r8 - r9
            r6.f3994d = r8     // Catch: java.util.zip.DataFormatException -> La7
            long r8 = (long) r9     // Catch: java.util.zip.DataFormatException -> La7
            r0.skip(r8)     // Catch: java.util.zip.DataFormatException -> La7
        L95:
            int r8 = r1.f4013b     // Catch: java.util.zip.DataFormatException -> La7
            int r9 = r1.f4014c     // Catch: java.util.zip.DataFormatException -> La7
            if (r8 != r9) goto La4
            f5.u r8 = r1.a()     // Catch: java.util.zip.DataFormatException -> La7
            r7.f3976b = r8     // Catch: java.util.zip.DataFormatException -> La7
            f5.v.a(r1)     // Catch: java.util.zip.DataFormatException -> La7
        La4:
            r7 = -1
            return r7
        La7:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        Lae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "?"
            r7.<init>(r8)
            throw r7
        Lb6:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.m.B(f5.e, long):long");
    }

    @Override // f5.y
    public final z b() {
        return this.f3992b.b();
    }

    @Override // f5.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3995e) {
            return;
        }
        this.f3993c.end();
        this.f3995e = true;
        this.f3992b.close();
    }
}
