package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class w<E> extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f1665c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f1666d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f1667e;

    /* renamed from: f  reason: collision with root package name */
    public final b0 f1668f;

    public w(r rVar) {
        Handler handler = new Handler();
        this.f1668f = new b0();
        this.f1665c = rVar;
        if (rVar != null) {
            this.f1666d = rVar;
            this.f1667e = handler;
            return;
        }
        throw new NullPointerException("context == null");
    }

    public abstract void A(PrintWriter printWriter, String[] strArr);

    public abstract r B();

    public abstract LayoutInflater C();

    public abstract void D();
}
