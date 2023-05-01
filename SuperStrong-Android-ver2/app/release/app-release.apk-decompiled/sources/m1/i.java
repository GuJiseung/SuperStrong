package m1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f5255a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5256b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5257c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final int f5258e;

        /* renamed from: a  reason: collision with root package name */
        public final Context f5259a;

        /* renamed from: b  reason: collision with root package name */
        public final ActivityManager f5260b;

        /* renamed from: c  reason: collision with root package name */
        public final b f5261c;

        /* renamed from: d  reason: collision with root package name */
        public final float f5262d;

        static {
            f5258e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f5262d = f5258e;
            this.f5259a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f5260b = activityManager;
            this.f5261c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.f5262d = 0.0f;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f5263a;

        public b(DisplayMetrics displayMetrics) {
            this.f5263a = displayMetrics;
        }
    }

    public i(a aVar) {
        int i6;
        float f6;
        boolean z5;
        Context context = aVar.f5259a;
        ActivityManager activityManager = aVar.f5260b;
        if (activityManager.isLowRamDevice()) {
            i6 = 2097152;
        } else {
            i6 = 4194304;
        }
        this.f5257c = i6;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (isLowRamDevice) {
            f6 = 0.33f;
        } else {
            f6 = 0.4f;
        }
        int round = Math.round(memoryClass * f6);
        DisplayMetrics displayMetrics = aVar.f5261c.f5263a;
        float f7 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f8 = aVar.f5262d;
        int round2 = Math.round(f7 * f8);
        int round3 = Math.round(f7 * 2.0f);
        int i7 = round - i6;
        int i8 = round3 + round2;
        if (i8 <= i7) {
            this.f5256b = round3;
            this.f5255a = round2;
        } else {
            float f9 = i7 / (f8 + 2.0f);
            this.f5256b = Math.round(2.0f * f9);
            this.f5255a = Math.round(f9 * f8);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f5256b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f5255a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i6));
            sb.append(", memory class limited? ");
            if (i8 > round) {
                z5 = true;
            } else {
                z5 = false;
            }
            sb.append(z5);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
