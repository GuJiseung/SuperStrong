package b5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
/* loaded from: classes.dex */
public final /* synthetic */ class b {
    public static int[] _values() {
        return m.g.b(11);
    }

    public static /* synthetic */ int a(int i6) {
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 == 4) {
            return 3;
        }
        if (i6 == 5) {
            return 7;
        }
        if (i6 == 6) {
            return 8;
        }
        if (i6 == 7) {
            return 9;
        }
        if (i6 == 8) {
            return 10;
        }
        if (i6 == 9) {
            return 11;
        }
        if (i6 == 10) {
            return 12;
        }
        if (i6 == 11) {
            return 13;
        }
        throw null;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ Iterator c() {
        try {
            return Arrays.asList(new AndroidExceptionPreHandler()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* bridge */ /* synthetic */ void d(Object obj, int i6, int i7, int i8) {
        throw null;
    }

    public static /* synthetic */ String e(int i6) {
        return i6 == 1 ? "NO_ERROR" : i6 == 2 ? "PROTOCOL_ERROR" : i6 == 3 ? "INTERNAL_ERROR" : i6 == 4 ? "FLOW_CONTROL_ERROR" : i6 == 5 ? "REFUSED_STREAM" : i6 == 6 ? "CANCEL" : i6 == 7 ? "COMPRESSION_ERROR" : i6 == 8 ? "CONNECT_ERROR" : i6 == 9 ? "ENHANCE_YOUR_CALM" : i6 == 10 ? "INADEQUATE_SECURITY" : i6 == 11 ? "HTTP_1_1_REQUIRED" : "null";
    }
}
