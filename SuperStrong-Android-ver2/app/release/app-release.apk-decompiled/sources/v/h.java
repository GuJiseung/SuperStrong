package v;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import f0.l;
/* loaded from: classes.dex */
public class h extends Activity implements o, l.a {

    /* renamed from: b  reason: collision with root package name */
    public final p f6263b;

    public h() {
        new l.h();
        this.f6263b = new p(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f0.l.a(decorView, keyEvent)) {
            return f0.l.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !f0.l.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // f0.l.a
    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p pVar = this.f6263b;
        pVar.e("markState");
        j.c cVar = j.c.CREATED;
        pVar.e("setCurrentState");
        pVar.g(cVar);
        super.onSaveInstanceState(bundle);
    }

    public p v() {
        return this.f6263b;
    }
}
