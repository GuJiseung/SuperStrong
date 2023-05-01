package e5;
/* loaded from: classes.dex */
public final class a extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final d f3851c;

    public a(d dVar) {
        this.f3851c = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && ((a) obj).f3851c.equals(this.f3851c);
    }

    public final int hashCode() {
        return this.f3851c.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[SYNTHETIC] */
    @Override // androidx.activity.result.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List j(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.Object r0 = r10.removeFirst()
            java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0
            r11.add(r0)
            r0 = 0
            r1 = r0
            r2 = r1
        L16:
            r3 = 9
            if (r1 >= r3) goto La4
            int r3 = r11.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r3 = r11.get(r3)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            e5.d r5 = r9.f3851c
            java.security.cert.X509Certificate r5 = r5.a(r3)
            if (r5 == 0) goto L5a
            int r2 = r11.size()
            if (r2 > r4) goto L3a
            boolean r2 = r3.equals(r5)
            if (r2 != 0) goto L3d
        L3a:
            r11.add(r5)
        L3d:
            java.security.Principal r2 = r5.getIssuerDN()
            java.security.Principal r3 = r5.getSubjectDN()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = r0
            goto L55
        L4d:
            java.security.PublicKey r2 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L4b
            r5.verify(r2)     // Catch: java.security.GeneralSecurityException -> L4b
            r2 = r4
        L55:
            if (r2 == 0) goto L58
            return r11
        L58:
            r2 = r4
            goto L8a
        L5a:
            java.util.Iterator r5 = r10.iterator()
        L5e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r5.next()
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.security.Principal r7 = r3.getIssuerDN()
            java.security.Principal r8 = r6.getSubjectDN()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L7a
        L78:
            r7 = r0
            goto L82
        L7a:
            java.security.PublicKey r7 = r6.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L78
            r3.verify(r7)     // Catch: java.security.GeneralSecurityException -> L78
            r7 = r4
        L82:
            if (r7 == 0) goto L5e
            r5.remove()
            r11.add(r6)
        L8a:
            int r1 = r1 + 1
            goto L16
        L8d:
            if (r2 == 0) goto L90
            return r11
        L90:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r11.<init>(r0)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La4:
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Certificate chain too long: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.j(java.lang.String, java.util.List):java.util.List");
    }
}
