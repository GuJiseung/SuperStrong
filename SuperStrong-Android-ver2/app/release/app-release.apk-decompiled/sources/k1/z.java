package k1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4936a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f4937b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((w) message.obj).e();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(w<?> wVar, boolean z5) {
        if (!this.f4936a && !z5) {
            this.f4936a = true;
            wVar.e();
            this.f4936a = false;
        }
        this.f4937b.obtainMessage(1, wVar).sendToTarget();
    }
}
