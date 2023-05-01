package j3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f4720b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4721a = new Object();

    /* renamed from: j3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0053a implements Handler.Callback {
        public C0053a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f4721a) {
                if (bVar == null || bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public a() {
        new Handler(Looper.getMainLooper(), new C0053a());
    }

    public static a a() {
        if (f4720b == null) {
            f4720b = new a();
        }
        return f4720b;
    }
}
