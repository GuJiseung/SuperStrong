package t1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.activity.k;
import k1.s;
import k1.w;
/* loaded from: classes.dex */
public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: b  reason: collision with root package name */
    public final T f6132b;

    public b(T t5) {
        k.h(t5);
        this.f6132b = t5;
    }

    @Override // k1.s
    public void a() {
        Bitmap bitmap;
        T t5 = this.f6132b;
        if (t5 instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) t5).getBitmap();
        } else if (t5 instanceof v1.c) {
            bitmap = ((v1.c) t5).f6281b.f6291a.f6304l;
        } else {
            return;
        }
        bitmap.prepareToDraw();
    }

    @Override // k1.w
    public final Object get() {
        T t5 = this.f6132b;
        Drawable.ConstantState constantState = t5.getConstantState();
        return constantState == null ? t5 : constantState.newDrawable();
    }
}
