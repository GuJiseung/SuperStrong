package y;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import c0.n;
import java.lang.reflect.Method;
import x.f;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final l f6730a;

    /* renamed from: b  reason: collision with root package name */
    public static final l.f<String, Typeface> f6731b;

    /* loaded from: classes.dex */
    public static class a extends n {

        /* renamed from: f  reason: collision with root package name */
        public final f.e f6732f;

        public a(f.e eVar) {
            this.f6732f = eVar;
        }
    }

    static {
        boolean z5;
        l fVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            fVar = new j();
        } else if (i6 >= 28) {
            fVar = new i();
        } else if (i6 >= 26) {
            fVar = new h();
        } else {
            Method method = g.f6740c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                fVar = new g();
            } else {
                fVar = new f();
            }
        }
        f6730a = fVar;
        f6731b = new l.f<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r7, x.d.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, x.f.e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.e.a(android.content.Context, x.d$b, android.content.res.Resources, int, java.lang.String, int, int, x.f$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i6, String str, int i7, int i8) {
        return resources.getResourcePackageName(i6) + '-' + str + '-' + i7 + '-' + i6 + '-' + i8;
    }
}
