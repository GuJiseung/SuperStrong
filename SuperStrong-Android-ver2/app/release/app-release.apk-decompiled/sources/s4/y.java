package s4;

import android.util.Log;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public final class y implements i1.k, x1.m {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(e4.d dVar) {
        String str;
        if (dVar instanceof kotlinx.coroutines.internal.c) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            str = a1.f0.e(th);
        }
        Throwable a6 = c4.d.a(str);
        String str2 = str;
        if (a6 != null) {
            str2 = ((Object) dVar.getClass().getName()) + '@' + a(dVar);
        }
        return (String) str2;
    }

    @Override // i1.d
    public final boolean b(Object obj, File file, i1.h hVar) {
        try {
            e2.a.b(((v1.c) ((k1.w) obj).get()).f6281b.f6291a.f6293a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            }
            return false;
        }
    }

    @Override // i1.k
    public final i1.c d(i1.h hVar) {
        return i1.c.SOURCE;
    }
}
