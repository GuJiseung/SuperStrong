package b2;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* loaded from: classes.dex */
public abstract class e<Z> extends h<ImageView, Z> {

    /* renamed from: d  reason: collision with root package name */
    public Animatable f2357d;

    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // x1.i
    public final void a() {
        Animatable animatable = this.f2357d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // b2.g
    public final void d(Drawable drawable) {
        l(null);
        this.f2357d = null;
        ((ImageView) this.f2358b).setImageDrawable(drawable);
    }

    @Override // b2.g
    public final void f(Drawable drawable) {
        l(null);
        this.f2357d = null;
        ((ImageView) this.f2358b).setImageDrawable(drawable);
    }

    @Override // b2.h, b2.g
    public final void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.f2357d;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.f2357d = null;
        ((ImageView) this.f2358b).setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b2.g
    public final void j(Object obj) {
        l(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.f2357d = animatable;
            animatable.start();
            return;
        }
        this.f2357d = null;
    }

    @Override // x1.i
    public final void k() {
        Animatable animatable = this.f2357d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Z z5);
}
