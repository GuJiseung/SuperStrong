package z4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import v4.b0;
import v4.r;
import v4.u;
import v4.x;
/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: a  reason: collision with root package name */
    public final u f7093a;

    public i(u uVar) {
        this.f7093a = uVar;
    }

    public static int c(b0 b0Var, int i6) {
        String c6 = b0Var.c("Retry-After");
        if (c6 == null) {
            return i6;
        }
        if (c6.matches("\\d+")) {
            return Integer.valueOf(c6).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
        if (r10.f6338d == 408) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
        if (c(r11, 0) > 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
        if (r10.f6338d == 503) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0140, code lost:
        if (c(r11, Integer.MAX_VALUE) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0142, code lost:
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (r5.equals("HEAD") == false) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e  */
    /* JADX WARN: Type inference failed for: r19v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [v4.f] */
    /* JADX WARN: Type inference failed for: r26v0, types: [z4.i] */
    /* JADX WARN: Type inference failed for: r27v0, types: [z4.f] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [y4.d, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [y4.i] */
    @Override // v4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v4.b0 a(z4.f r27) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.i.a(z4.f):v4.b0");
    }

    public final boolean b(IOException iOException, y4.i iVar, boolean z5, x xVar) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (!this.f7093a.f6516t) {
            return false;
        }
        if (z5 && (iOException instanceof FileNotFoundException)) {
            return false;
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z5))) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6) {
            return false;
        }
        y4.d dVar = iVar.f6906h;
        synchronized (dVar.f6858c) {
            z7 = dVar.f6863h;
        }
        if (z7 && iVar.f6906h.c()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        return true;
    }
}
