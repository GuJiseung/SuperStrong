package androidx.appcompat.widget;

import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.l;
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f836b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f837c;

    public /* synthetic */ l1(int i6, Object obj) {
        this.f836b = i6;
        this.f837c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.view.menu.h hVar;
        int i6 = this.f836b;
        Object obj = this.f837c;
        switch (i6) {
            case 0:
                Toolbar.f fVar = ((Toolbar) obj).M;
                if (fVar == null) {
                    hVar = null;
                } else {
                    hVar = fVar.f664c;
                }
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case 1:
                ((p1) obj).c(false);
                return;
            case 2:
                ((l.b) obj).c();
                return;
            default:
                ((com.google.android.material.timepicker.c) obj).k();
                return;
        }
    }
}
