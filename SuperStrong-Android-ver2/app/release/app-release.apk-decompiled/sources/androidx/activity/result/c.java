package androidx.activity.result;

import android.content.Intent;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import java.lang.reflect.Modifier;
import java.util.List;
import x3.a;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: b  reason: collision with root package name */
    public static a.C0101a f285b;

    public static void g(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    public abstract List j(String str, List list);

    public abstract Path k(float f6, float f7, float f8, float f9);

    public abstract Object p(Class cls);

    public abstract View u(int i6);

    public abstract void w(int i6);

    public abstract void x(Typeface typeface, boolean z5);

    public abstract boolean y();

    public abstract Object z(Intent intent, int i6);
}
