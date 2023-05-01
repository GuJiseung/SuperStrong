package y4;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import v4.h;
import v4.u;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<v4.h> f6837a;

    /* renamed from: b  reason: collision with root package name */
    public int f6838b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6839c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6840d;

    public b(List<v4.h> list) {
        this.f6837a = list;
    }

    public final v4.h a(SSLSocket sSLSocket) {
        v4.h hVar;
        boolean z5;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i6 = this.f6838b;
        List<v4.h> list = this.f6837a;
        int size = list.size();
        while (true) {
            if (i6 < size) {
                hVar = list.get(i6);
                if (hVar.a(sSLSocket)) {
                    this.f6838b = i6 + 1;
                    break;
                }
                i6++;
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            int i7 = this.f6838b;
            while (true) {
                if (i7 < list.size()) {
                    if (list.get(i7).a(sSLSocket)) {
                        z5 = true;
                        break;
                    }
                    i7++;
                } else {
                    z5 = false;
                    break;
                }
            }
            this.f6839c = z5;
            u.a aVar = w4.a.f6589a;
            boolean z6 = this.f6840d;
            aVar.getClass();
            String[] strArr = hVar.f6421c;
            if (strArr != null) {
                enabledCipherSuites = w4.e.m(v4.g.f6399b, sSLSocket.getEnabledCipherSuites(), strArr);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = hVar.f6422d;
            if (strArr2 != null) {
                enabledProtocols = w4.e.m(w4.e.f6601i, sSLSocket.getEnabledProtocols(), strArr2);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            c0.d dVar = v4.g.f6399b;
            byte[] bArr = w4.e.f6593a;
            int length = supportedCipherSuites.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    if (dVar.compare(supportedCipherSuites[i8], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i8++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (z6 && i8 != -1) {
                String str = supportedCipherSuites[i8];
                int length2 = enabledCipherSuites.length + 1;
                String[] strArr3 = new String[length2];
                System.arraycopy(enabledCipherSuites, 0, strArr3, 0, enabledCipherSuites.length);
                strArr3[length2 - 1] = str;
                enabledCipherSuites = strArr3;
            }
            h.a aVar2 = new h.a(hVar);
            aVar2.a(enabledCipherSuites);
            aVar2.c(enabledProtocols);
            v4.h hVar2 = new v4.h(aVar2);
            String[] strArr4 = hVar2.f6422d;
            if (strArr4 != null) {
                sSLSocket.setEnabledProtocols(strArr4);
            }
            String[] strArr5 = hVar2.f6421c;
            if (strArr5 != null) {
                sSLSocket.setEnabledCipherSuites(strArr5);
            }
            return hVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f6840d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
