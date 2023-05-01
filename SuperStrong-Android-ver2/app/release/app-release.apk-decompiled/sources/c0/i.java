package c0;

import android.content.Context;
import c0.k;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2710a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2711b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f2712c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2713d;

    public i(String str, Context context, f fVar, int i6) {
        this.f2710a = str;
        this.f2711b = context;
        this.f2712c = fVar;
        this.f2713d = i6;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        try {
            return k.a(this.f2710a, this.f2711b, this.f2712c, this.f2713d);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
