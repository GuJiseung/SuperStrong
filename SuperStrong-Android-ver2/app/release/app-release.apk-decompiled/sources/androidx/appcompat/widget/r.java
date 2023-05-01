package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class r {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f915c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f916a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f917b;

    public r(ProgressBar progressBar) {
        this.f916a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i6) {
        ProgressBar progressBar = this.f916a;
        j1 m5 = j1.m(progressBar.getContext(), attributeSet, f915c, i6);
        Drawable f6 = m5.f(0);
        if (f6 != null) {
            if (f6 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f6;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i7 = 0; i7 < numberOfFrames; i7++) {
                    Drawable b6 = b(animationDrawable.getFrame(i7), true);
                    b6.setLevel(10000);
                    animationDrawable2.addFrame(b6, animationDrawable.getDuration(i7));
                }
                animationDrawable2.setLevel(10000);
                f6 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f6);
        }
        Drawable f7 = m5.f(1);
        if (f7 != null) {
            progressBar.setProgressDrawable(b(f7, false));
        }
        m5.n();
    }

    public final Drawable b(Drawable drawable, boolean z5) {
        boolean z6;
        if (drawable instanceof z.b) {
            z.b bVar = (z.b) drawable;
            Drawable b6 = bVar.b();
            if (b6 != null) {
                bVar.a(b(b6, z5));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i6 = 0; i6 < numberOfLayers; i6++) {
                int id = layerDrawable.getId(i6);
                Drawable drawable2 = layerDrawable.getDrawable(i6);
                if (id != 16908301 && id != 16908303) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                drawableArr[i6] = b(drawable2, z6);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i7 = 0; i7 < numberOfLayers; i7++) {
                layerDrawable2.setId(i7, layerDrawable.getId(i7));
                layerDrawable2.setLayerGravity(i7, layerDrawable.getLayerGravity(i7));
                layerDrawable2.setLayerWidth(i7, layerDrawable.getLayerWidth(i7));
                layerDrawable2.setLayerHeight(i7, layerDrawable.getLayerHeight(i7));
                layerDrawable2.setLayerInsetLeft(i7, layerDrawable.getLayerInsetLeft(i7));
                layerDrawable2.setLayerInsetRight(i7, layerDrawable.getLayerInsetRight(i7));
                layerDrawable2.setLayerInsetTop(i7, layerDrawable.getLayerInsetTop(i7));
                layerDrawable2.setLayerInsetBottom(i7, layerDrawable.getLayerInsetBottom(i7));
                layerDrawable2.setLayerInsetStart(i7, layerDrawable.getLayerInsetStart(i7));
                layerDrawable2.setLayerInsetEnd(i7, layerDrawable.getLayerInsetEnd(i7));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f917b == null) {
                this.f917b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z5) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }
}
