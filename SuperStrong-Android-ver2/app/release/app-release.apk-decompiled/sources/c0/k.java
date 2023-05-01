package c0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final l.f<String, Typeface> f2715a = new l.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f2716b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2717c;

    /* renamed from: d  reason: collision with root package name */
    public static final l.h<String, ArrayList<e0.a<a>>> f2718d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f2719a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2720b;

        public a(int i6) {
            this.f2719a = null;
            this.f2720b = i6;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f2719a = typeface;
            this.f2720b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2716b = threadPoolExecutor;
        f2717c = new Object();
        f2718d = new l.h<>();
    }

    public static a a(String str, Context context, f fVar, int i6) {
        int i7;
        l.f<String, Typeface> fVar2 = f2715a;
        Typeface a6 = fVar2.a(str);
        if (a6 != null) {
            return new a(a6);
        }
        try {
            l a7 = e.a(context, fVar);
            int i8 = 1;
            m[] mVarArr = a7.f2722b;
            int i9 = a7.f2721a;
            if (i9 != 0) {
                if (i9 == 1) {
                    i7 = -2;
                }
                i7 = -3;
            } else {
                if (mVarArr != null && mVarArr.length != 0) {
                    i8 = 0;
                    for (m mVar : mVarArr) {
                        int i10 = mVar.f2727e;
                        if (i10 != 0) {
                            if (i10 >= 0) {
                                i7 = i10;
                            }
                            i7 = -3;
                        }
                    }
                }
                i7 = i8;
            }
            if (i7 != 0) {
                return new a(i7);
            }
            Typeface b6 = y.e.f6730a.b(context, mVarArr, i6);
            if (b6 != null) {
                fVar2.b(str, b6);
                return new a(b6);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }
}
