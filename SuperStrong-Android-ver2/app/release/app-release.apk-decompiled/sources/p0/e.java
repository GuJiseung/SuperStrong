package p0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.j;
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: b  reason: collision with root package name */
    public final KeyListener f5695b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5696c;

    /* loaded from: classes.dex */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f5695b = keyListener;
        this.f5696c = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i6) {
        this.f5695b.clearMetaKeyState(view, editable, i6);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f5695b.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i6, KeyEvent keyEvent) {
        boolean a6;
        boolean z5;
        this.f5696c.getClass();
        Object obj = androidx.emoji2.text.f.f1316i;
        if (i6 != 67) {
            if (i6 != 112) {
                a6 = false;
            } else {
                a6 = j.a(editable, keyEvent, true);
            }
        } else {
            a6 = j.a(editable, keyEvent, false);
        }
        if (a6) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && !this.f5695b.onKeyDown(view, editable, i6, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5695b.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i6, KeyEvent keyEvent) {
        return this.f5695b.onKeyUp(view, editable, i6, keyEvent);
    }
}
