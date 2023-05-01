package androidx.fragment.app;

import android.view.View;
import f0.g0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1606b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1607c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1608d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1609e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1610f;

    public o0(int i6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1606b = i6;
        this.f1607c = arrayList;
        this.f1608d = arrayList2;
        this.f1609e = arrayList3;
        this.f1610f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i6 = 0; i6 < this.f1606b; i6++) {
            WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
            g0.i.v((View) this.f1607c.get(i6), (String) this.f1608d.get(i6));
            g0.i.v((View) this.f1609e.get(i6), (String) this.f1610f.get(i6));
        }
    }
}
