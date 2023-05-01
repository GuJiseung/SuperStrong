package b3;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.h;
/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.f {
    public final int A;

    /* renamed from: z  reason: collision with root package name */
    public final Class<?> f2393z;

    public c(Context context, Class<?> cls, int i6) {
        super(context);
        this.f2393z = cls;
        this.A = i6;
    }

    @Override // androidx.appcompat.view.menu.f
    public final h a(int i6, int i7, int i8, CharSequence charSequence) {
        int size = size() + 1;
        int i9 = this.A;
        if (size <= i9) {
            w();
            h a6 = super.a(i6, i7, i8, charSequence);
            a6.f472x = (a6.f472x & (-5)) | 4;
            v();
            return a6;
        }
        String simpleName = this.f2393z.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i9 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f2393z.getSimpleName().concat(" does not support submenus"));
    }
}
