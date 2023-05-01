package x1;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.l;
import x1.b;
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: b  reason: collision with root package name */
    public final Context f6666b;

    /* renamed from: c  reason: collision with root package name */
    public final b.a f6667c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6668d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6669e;

    /* renamed from: f  reason: collision with root package name */
    public final a f6670f = new a();

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z5 = dVar.f6668d;
            dVar.f6668d = d.l(context);
            if (z5 != d.this.f6668d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + d.this.f6668d);
                }
                d dVar2 = d.this;
                l.b bVar = (l.b) dVar2.f6667c;
                if (dVar2.f6668d) {
                    synchronized (com.bumptech.glide.l.this) {
                        bVar.f2841a.b();
                    }
                    return;
                }
                bVar.getClass();
            }
        }
    }

    public d(Context context, l.b bVar) {
        this.f6666b = context.getApplicationContext();
        this.f6667c = bVar;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean l(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        androidx.activity.k.h(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e6);
            }
            return true;
        }
    }

    @Override // x1.i
    public final void a() {
        if (this.f6669e) {
            this.f6666b.unregisterReceiver(this.f6670f);
            this.f6669e = false;
        }
    }

    @Override // x1.i
    public final void b() {
    }

    @Override // x1.i
    public final void k() {
        if (this.f6669e) {
            return;
        }
        Context context = this.f6666b;
        this.f6668d = l(context);
        try {
            context.registerReceiver(this.f6670f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f6669e = true;
        } catch (SecurityException e6) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e6);
            }
        }
    }
}
