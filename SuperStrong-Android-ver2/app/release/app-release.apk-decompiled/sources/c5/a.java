package c5;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import v4.v;
@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public final class a extends b {
    public a() {
        super(null, null, null, null, null);
    }

    @Override // c5.b, c5.f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void g(SSLSocket sSLSocket, String str, List<v> list) {
        boolean isSupportedSocket;
        try {
            isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
            if (isSupportedSocket) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) f.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }

    @Override // c5.b, c5.f
    @Nullable
    @IgnoreJRERequirement
    public final String j(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
