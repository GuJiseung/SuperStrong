package t1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import w.a;
import x.f;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f6131a = true;

    public static Drawable a(Context context, Context context2, int i6, Resources.Theme theme) {
        Context context3;
        try {
            if (f6131a) {
                if (theme != null) {
                    context3 = new g.c(context2, theme);
                } else {
                    context3 = context2;
                }
                return e.a.a(context3, i6);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e6) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = w.a.f6573a;
                return a.b.b(context2, i6);
            }
            throw e6;
        } catch (NoClassDefFoundError unused2) {
            f6131a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f6627a;
        return f.a.a(resources, i6, theme);
    }
}
