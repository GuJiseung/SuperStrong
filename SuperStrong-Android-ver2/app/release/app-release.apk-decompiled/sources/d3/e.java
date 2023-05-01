package d3;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
/* loaded from: classes.dex */
public final class e extends androidx.activity.result.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f3794c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextPaint f3795d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.c f3796e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f3797f;

    public e(d dVar, Context context, TextPaint textPaint, androidx.activity.result.c cVar) {
        this.f3797f = dVar;
        this.f3794c = context;
        this.f3795d = textPaint;
        this.f3796e = cVar;
    }

    @Override // androidx.activity.result.c
    public final void w(int i6) {
        this.f3796e.w(i6);
    }

    @Override // androidx.activity.result.c
    public final void x(Typeface typeface, boolean z5) {
        this.f3797f.g(this.f3794c, this.f3795d, typeface);
        this.f3796e.x(typeface, z5);
    }
}
