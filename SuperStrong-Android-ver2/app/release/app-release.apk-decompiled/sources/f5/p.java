package f5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class p extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f4000k;

    public p(Socket socket) {
        this.f4000k = socket;
    }

    @Override // f5.c
    public final IOException m(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // f5.c
    public final void n() {
        Logger logger;
        Level level;
        StringBuilder sb;
        boolean z5;
        Socket socket = this.f4000k;
        try {
            socket.close();
        } catch (AssertionError e6) {
            e = e6;
            if (e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed")) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                logger = q.f4001a;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                sb.append(socket);
                logger.log(level, sb.toString(), e);
            }
            throw e;
        } catch (Exception e7) {
            e = e7;
            logger = q.f4001a;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            sb.append(socket);
            logger.log(level, sb.toString(), e);
        }
    }
}
