package androidx.activity;

import android.content.Intent;
import androidx.appcompat.widget.p1;
import com.superstrong.android.mmaaaq;
import com.superstrong.android.view.SplashActivity;
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f266b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f267c;

    public /* synthetic */ b(int i6, Object obj) {
        this.f266b = i6;
        this.f267c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f266b;
        Object obj = this.f267c;
        switch (i6) {
            case 0:
                ((ComponentActivity) obj).invalidateOptionsMenu();
                return;
            case 1:
                e.c((e) obj);
                return;
            case 2:
                ((OnBackPressedDispatcher) obj).b();
                return;
            case 3:
                ((p1) obj).a();
                return;
            case 4:
            default:
                SplashActivity splashActivity = (SplashActivity) obj;
                int i7 = SplashActivity.f3552x;
                l4.f.f(splashActivity, "this$0");
                splashActivity.startActivity(new Intent(splashActivity, mmaaaq.class));
                splashActivity.finish();
                return;
            case 5:
                ((m3.g) obj).t(true);
                return;
        }
    }
}
