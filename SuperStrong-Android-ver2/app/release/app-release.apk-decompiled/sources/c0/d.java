package c0;

import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2698a;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[ORIG_RETURN, RETURN] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.f2698a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto L25
        L7:
            byte[] r6 = (byte[]) r6
            byte[] r7 = (byte[]) r7
            int r0 = r6.length
            int r2 = r7.length
            if (r0 == r2) goto L14
            int r6 = r6.length
            int r7 = r7.length
            int r1 = r6 - r7
            goto L24
        L14:
            r0 = r1
        L15:
            int r2 = r6.length
            if (r0 >= r2) goto L24
            r2 = r6[r0]
            r3 = r7[r0]
            if (r2 == r3) goto L21
            int r1 = r2 - r3
            goto L24
        L21:
            int r0 = r0 + 1
            goto L15
        L24:
            return r1
        L25:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = (java.lang.String) r7
            c0.d r0 = v4.g.f6399b
            int r0 = r6.length()
            int r2 = r7.length()
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 4
        L38:
            if (r2 >= r0) goto L4a
            char r3 = r6.charAt(r2)
            char r4 = r7.charAt(r2)
            if (r3 == r4) goto L47
            if (r3 >= r4) goto L58
            goto L56
        L47:
            int r2 = r2 + 1
            goto L38
        L4a:
            int r6 = r6.length()
            int r7 = r7.length()
            if (r6 == r7) goto L59
            if (r6 >= r7) goto L58
        L56:
            r1 = -1
            goto L59
        L58:
            r1 = 1
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.compare(java.lang.Object, java.lang.Object):int");
    }
}
