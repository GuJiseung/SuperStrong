package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p0.a;
import p0.g;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final View f817a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f818b;

    public /* synthetic */ k(EditText editText) {
        this.f817a = editText;
        this.f818b = new p0.a(editText);
    }

    public /* synthetic */ k(FrameLayout frameLayout, Button button) {
        this.f817a = frameLayout;
        this.f818b = button;
    }

    public final KeyListener a(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((p0.a) this.f818b).f5683a.getClass();
            if (!(keyListener instanceof p0.e)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new p0.e(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public final void b(AttributeSet attributeSet, int i6) {
        TypedArray obtainStyledAttributes = ((EditText) this.f817a).getContext().obtainStyledAttributes(attributeSet, c.b.f2668j, i6, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        p0.a aVar = (p0.a) this.f818b;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        a.C0074a c0074a = aVar.f5683a;
        c0074a.getClass();
        if (!(inputConnection instanceof p0.c)) {
            return new p0.c(c0074a.f5684a, inputConnection, editorInfo);
        }
        return inputConnection;
    }

    public final void d(boolean z5) {
        p0.g gVar = ((p0.a) this.f818b).f5683a.f5685b;
        if (gVar.f5705e != z5) {
            if (gVar.f5704d != null) {
                androidx.emoji2.text.f a6 = androidx.emoji2.text.f.a();
                g.a aVar = gVar.f5704d;
                a6.getClass();
                c.a.i(aVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a6.f1318a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a6.f1319b.remove(aVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f5705e = z5;
            if (z5) {
                p0.g.a(gVar.f5702b, androidx.emoji2.text.f.a().b());
            }
        }
    }
}
