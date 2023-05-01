package v1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.activity.k;
import java.util.ArrayList;
import v1.f;
/* loaded from: classes.dex */
public final class c extends Drawable implements f.b, Animatable {

    /* renamed from: b  reason: collision with root package name */
    public final a f6281b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6282c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6283d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6284e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6285f;

    /* renamed from: g  reason: collision with root package name */
    public int f6286g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6287h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6288i;

    /* renamed from: j  reason: collision with root package name */
    public Paint f6289j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f6290k;

    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f6291a;

        public a(f fVar) {
            this.f6291a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c() {
        throw null;
    }

    public c(a aVar) {
        this.f6285f = true;
        this.f6287h = -1;
        k.h(aVar);
        this.f6281b = aVar;
    }

    @Override // v1.f.b
    public final void a() {
        f fVar;
        int i6;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f.a aVar = this.f6281b.f6291a.f6301i;
        if (aVar != null) {
            i6 = aVar.f6311f;
        } else {
            i6 = -1;
        }
        if (i6 == fVar.f6293a.d() - 1) {
            this.f6286g++;
        }
        int i7 = this.f6287h;
        if (i7 != -1 && this.f6286g >= i7) {
            stop();
        }
    }

    public final void b() {
        k.g("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f6284e);
        a aVar = this.f6281b;
        if (aVar.f6291a.f6293a.d() != 1) {
            if (!this.f6282c) {
                this.f6282c = true;
                f fVar = aVar.f6291a;
                if (!fVar.f6302j) {
                    ArrayList arrayList = fVar.f6295c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !fVar.f6298f) {
                            fVar.f6298f = true;
                            fVar.f6302j = false;
                            fVar.a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f6284e) {
            return;
        }
        if (this.f6288i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f6290k == null) {
                this.f6290k = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f6290k);
            this.f6288i = false;
        }
        f fVar = this.f6281b.f6291a;
        f.a aVar = fVar.f6301i;
        if (aVar != null) {
            bitmap = aVar.f6313h;
        } else {
            bitmap = fVar.f6304l;
        }
        if (this.f6290k == null) {
            this.f6290k = new Rect();
        }
        Rect rect = this.f6290k;
        if (this.f6289j == null) {
            this.f6289j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6289j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6281b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6281b.f6291a.f6309q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6281b.f6291a.f6308p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6282c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6288i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (this.f6289j == null) {
            this.f6289j = new Paint(2);
        }
        this.f6289j.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6289j == null) {
            this.f6289j = new Paint(2);
        }
        this.f6289j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        k.g("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f6284e);
        this.f6285f = z5;
        if (!z5) {
            this.f6282c = false;
            f fVar = this.f6281b.f6291a;
            ArrayList arrayList = fVar.f6295c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                fVar.f6298f = false;
            }
        } else if (this.f6283d) {
            b();
        }
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f6283d = true;
        this.f6286g = 0;
        if (this.f6285f) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f6283d = false;
        this.f6282c = false;
        f fVar = this.f6281b.f6291a;
        ArrayList arrayList = fVar.f6295c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            fVar.f6298f = false;
        }
    }
}
