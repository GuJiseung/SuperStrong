package g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    public final int f4090b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4091c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4092d;

    public a(int i6, f fVar, int i7) {
        this.f4090b = i6;
        this.f4091c = fVar;
        this.f4092d = i7;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4090b);
        this.f4091c.f4095a.performAction(this.f4092d, bundle);
    }
}
