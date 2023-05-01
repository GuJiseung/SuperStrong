package a1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final d0 f103a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f104b;

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(u.f103a.n(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f6) {
            float floatValue = f6.floatValue();
            u.f103a.o(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
            return g0.f.a(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
            g0.f.c(view, rect);
        }
    }

    static {
        f103a = Build.VERSION.SDK_INT >= 29 ? new e0() : new d0();
        f104b = new a();
        new b();
    }

    public static void a(View view, int i6, int i7, int i8, int i9) {
        f103a.r(view, i6, i7, i8, i9);
    }
}
