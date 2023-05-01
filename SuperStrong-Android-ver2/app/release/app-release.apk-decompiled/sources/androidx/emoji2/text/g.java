package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import g5.i;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1334b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1335c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1336d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1337e;

    public /* synthetic */ g(int i6, Object obj, Object obj2, Object obj3) {
        this.f1334b = i6;
        this.f1335c = obj;
        this.f1336d = obj2;
        this.f1337e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1334b) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1335c;
                f.h hVar = (f.h) this.f1336d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1337e;
                bVar.getClass();
                try {
                    l a6 = c.a(bVar.f1311a);
                    if (a6 != null) {
                        l.b bVar2 = (l.b) a6.f1329a;
                        synchronized (bVar2.f1360d) {
                            bVar2.f1362f = threadPoolExecutor;
                        }
                        a6.f1329a.a(new h(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                ((g5.d) this.f1336d).a(i.a.this, (Throwable) this.f1337e);
                return;
        }
    }
}
