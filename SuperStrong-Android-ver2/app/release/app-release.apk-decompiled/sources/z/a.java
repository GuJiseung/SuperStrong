package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: z.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102a {
        public static int a(Drawable drawable) {
            return drawable.getAlpha();
        }

        public static Drawable b(DrawableContainer.DrawableContainerState drawableContainerState, int i6) {
            return drawableContainerState.getChild(i6);
        }

        public static Drawable c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        public static boolean d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        public static void e(Drawable drawable, boolean z5) {
            drawable.setAutoMirrored(z5);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f6, float f7) {
            drawable.setHotspot(f6, f7);
        }

        public static void f(Drawable drawable, int i6, int i7, int i8, int i9) {
            drawable.setHotspotBounds(i6, i7, i8, i9);
        }

        public static void g(Drawable drawable, int i6) {
            drawable.setTint(i6);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i6) {
            return drawable.setLayoutDirection(i6);
        }
    }

    public static void a(Drawable drawable, int i6) {
        b.g(drawable, i6);
    }

    public static void b(Drawable drawable, ColorStateList colorStateList) {
        b.h(drawable, colorStateList);
    }

    public static void c(Drawable drawable, PorterDuff.Mode mode) {
        b.i(drawable, mode);
    }
}
