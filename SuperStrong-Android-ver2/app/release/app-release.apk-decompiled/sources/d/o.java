package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.j0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f3652b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3653c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3654d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3655e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f3656f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3657g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final l.h<String, Constructor<? extends View>> f3658h = new l.h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3659a = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f3660b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3661c;

        /* renamed from: d  reason: collision with root package name */
        public Method f3662d;

        /* renamed from: e  reason: collision with root package name */
        public Context f3663e;

        public a(View view, String str) {
            this.f3660b = view;
            this.f3661c = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id;
            String str;
            Method method;
            if (this.f3662d == null) {
                View view2 = this.f3660b;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f3661c;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f3662d = method;
                                this.f3663e = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                        }
                        throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                    }
                }
            }
            try {
                this.f3662d.invoke(this.f3663e, view);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException("Could not execute method for android:onClick", e7);
            }
        }
    }

    public androidx.appcompat.widget.d a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public androidx.appcompat.widget.f b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public androidx.appcompat.widget.s d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    public j0 e(Context context, AttributeSet attributeSet) {
        return new j0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        l.h<String, Constructor<? extends View>> hVar = f3658h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3652b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f3659a);
    }
}
