package p0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;
/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f5686a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f5687b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f5688c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f5688c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f5688c;
        if (cls != null) {
            return new o(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
