package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f1316i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile f f1317j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1318a;

    /* renamed from: b  reason: collision with root package name */
    public final l.d f1319b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1320c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1321d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1322e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1323f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1324g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.emoji2.text.d f1325h;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile j f1326b;

        /* renamed from: c  reason: collision with root package name */
        public volatile n f1327c;

        public a(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f1328a;

        public b(f fVar) {
            this.f1328a = fVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1329a;

        /* renamed from: b  reason: collision with root package name */
        public int f1330b = 0;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.emoji2.text.d f1331c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f1329a = gVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0011f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f1332b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1333c;

        public RunnableC0011f(List list, int i6, Throwable th) {
            if (list != null) {
                this.f1332b = new ArrayList(list);
                this.f1333c = i6;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f1332b;
            int size = arrayList.size();
            int i6 = 0;
            if (this.f1333c != 1) {
                while (i6 < size) {
                    ((e) arrayList.get(i6)).getClass();
                    i6++;
                }
                return;
            }
            while (i6 < size) {
                ((e) arrayList.get(i6)).a();
                i6++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1318a = reentrantReadWriteLock;
        this.f1320c = 3;
        g gVar = aVar.f1329a;
        this.f1323f = gVar;
        int i6 = aVar.f1330b;
        this.f1324g = i6;
        this.f1325h = aVar.f1331c;
        this.f1321d = new Handler(Looper.getMainLooper());
        this.f1319b = new l.d();
        a aVar2 = new a(this);
        this.f1322e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i6 == 0) {
            try {
                this.f1320c = 0;
            } catch (Throwable th) {
                this.f1318a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.e(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static f a() {
        f fVar;
        boolean z5;
        synchronized (f1316i) {
            fVar = f1317j;
            if (fVar != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f1318a.readLock().lock();
        try {
            return this.f1320c;
        } finally {
            this.f1318a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z5;
        boolean z6 = true;
        if (this.f1324g == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            if (b() != 1) {
                z6 = false;
            }
            if (z6) {
                return;
            }
            this.f1318a.writeLock().lock();
            try {
                if (this.f1320c == 0) {
                    return;
                }
                this.f1320c = 0;
                this.f1318a.writeLock().unlock();
                a aVar = this.f1322e;
                f fVar = aVar.f1328a;
                try {
                    fVar.f1323f.a(new androidx.emoji2.text.e(aVar));
                    return;
                } catch (Throwable th) {
                    fVar.d(th);
                    return;
                }
            } finally {
                this.f1318a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1318a.writeLock().lock();
        try {
            this.f1320c = 2;
            arrayList.addAll(this.f1319b);
            this.f1319b.clear();
            this.f1318a.writeLock().unlock();
            this.f1321d.post(new RunnableC0011f(arrayList, this.f1320c, th));
        } catch (Throwable th2) {
            this.f1318a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f1318a.writeLock().lock();
        try {
            this.f1320c = 1;
            arrayList.addAll(this.f1319b);
            this.f1319b.clear();
            this.f1318a.writeLock().unlock();
            this.f1321d.post(new RunnableC0011f(arrayList, this.f1320c, null));
        } catch (Throwable th) {
            this.f1318a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r3.b(r15, r6, r13, r5.f1350d.f1371b) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = new androidx.emoji2.text.q((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r10 = r5.f1350d.f1371b;
        r3.f1344a.getClass();
        r0.setSpan(new androidx.emoji2.text.p(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence f(int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.f.f(int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f1318a.writeLock().lock();
            try {
                if (this.f1320c != 1 && this.f1320c != 2) {
                    this.f1319b.add(eVar);
                    return;
                }
                this.f1321d.post(new RunnableC0011f(Arrays.asList(eVar), this.f1320c, null));
                return;
            } finally {
                this.f1318a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
