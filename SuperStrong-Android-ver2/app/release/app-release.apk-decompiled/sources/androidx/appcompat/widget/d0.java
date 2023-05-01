package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f740c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f741d;

    public d0(TextView textView, Typeface typeface, int i6) {
        this.f739b = textView;
        this.f740c = typeface;
        this.f741d = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f739b.setTypeface(this.f740c, this.f741d);
    }
}
