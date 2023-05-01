package r1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5927a = new a();

    /* loaded from: classes.dex */
    public class a extends l1.e {
        @Override // l1.e, l1.d
        public final void e(Bitmap bitmap) {
        }
    }

    public static e a(l1.d dVar, Drawable drawable, int i6, int i7) {
        Bitmap bitmap;
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i6 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                bitmap = null;
            } else if (i7 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                bitmap = null;
            } else {
                if (current.getIntrinsicWidth() > 0) {
                    i6 = current.getIntrinsicWidth();
                }
                if (current.getIntrinsicHeight() > 0) {
                    i7 = current.getIntrinsicHeight();
                }
                Lock lock = z.f5965b;
                lock.lock();
                Bitmap d6 = dVar.d(i6, i7, Bitmap.Config.ARGB_8888);
                try {
                    Canvas canvas = new Canvas(d6);
                    current.setBounds(0, 0, i6, i7);
                    current.draw(canvas);
                    canvas.setBitmap(null);
                    lock.unlock();
                    bitmap = d6;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
            z5 = true;
        } else {
            bitmap = null;
        }
        if (!z5) {
            dVar = f5927a;
        }
        return e.b(bitmap, dVar);
    }
}
