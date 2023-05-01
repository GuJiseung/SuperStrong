package m3;

import android.view.View;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f5273b;

    public /* synthetic */ d(p pVar, int i6) {
        this.f5272a = i6;
        this.f5273b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z5) {
        int i6 = this.f5272a;
        p pVar = this.f5273b;
        switch (i6) {
            case 0:
                g gVar = (g) pVar;
                gVar.t(gVar.u());
                return;
            default:
                o oVar = (o) pVar;
                oVar.f5300l = z5;
                oVar.q();
                if (!z5) {
                    oVar.t(false);
                    oVar.f5301m = false;
                    return;
                }
                return;
        }
    }
}
