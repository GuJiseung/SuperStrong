package c0;

import android.content.Context;
import c0.k;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2705a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2706b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f2707c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2708d;

    public g(String str, Context context, f fVar, int i6) {
        this.f2705a = str;
        this.f2706b = context;
        this.f2707c = fVar;
        this.f2708d = i6;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        return k.a(this.f2705a, this.f2706b, this.f2707c, this.f2708d);
    }
}
