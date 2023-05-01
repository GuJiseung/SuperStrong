package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: b  reason: collision with root package name */
    public final f f448b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.app.b f449c;

    /* renamed from: d  reason: collision with root package name */
    public d f450d;

    public g(f fVar) {
        this.f448b = fVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void a(f fVar, boolean z5) {
        androidx.appcompat.app.b bVar;
        if ((z5 || fVar == this.f448b) && (bVar = this.f449c) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean b(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        d dVar = this.f450d;
        if (dVar.f416g == null) {
            dVar.f416g = new d.a();
        }
        this.f448b.q(dVar.f416g.getItem(i6), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f450d.a(this.f448b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f fVar = this.f448b;
        if (i6 == 82 || i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f449c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f449c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                fVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return fVar.performShortcut(i6, keyEvent, 0);
    }
}
