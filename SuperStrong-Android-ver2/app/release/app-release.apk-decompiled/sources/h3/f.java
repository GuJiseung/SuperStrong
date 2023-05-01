package h3;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import h3.j;
import h3.l;
import java.util.BitSet;
/* loaded from: classes.dex */
public class f extends Drawable implements m {

    /* renamed from: x  reason: collision with root package name */
    public static final Paint f4445x;

    /* renamed from: b  reason: collision with root package name */
    public b f4446b;

    /* renamed from: c  reason: collision with root package name */
    public final l.f[] f4447c;

    /* renamed from: d  reason: collision with root package name */
    public final l.f[] f4448d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f4449e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4450f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f4451g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f4452h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f4453i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f4454j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f4455k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f4456l;

    /* renamed from: m  reason: collision with root package name */
    public final Region f4457m;

    /* renamed from: n  reason: collision with root package name */
    public i f4458n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f4459o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f4460p;

    /* renamed from: q  reason: collision with root package name */
    public final g3.a f4461q;

    /* renamed from: r  reason: collision with root package name */
    public final a f4462r;
    public final j s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f4463t;
    public PorterDuffColorFilter u;

    /* renamed from: v  reason: collision with root package name */
    public final RectF f4464v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f4465w;

    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f4467a;

        /* renamed from: b  reason: collision with root package name */
        public w2.a f4468b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f4469c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f4470d;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f4471e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f4472f;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f4473g;

        /* renamed from: h  reason: collision with root package name */
        public Rect f4474h;

        /* renamed from: i  reason: collision with root package name */
        public final float f4475i;

        /* renamed from: j  reason: collision with root package name */
        public float f4476j;

        /* renamed from: k  reason: collision with root package name */
        public float f4477k;

        /* renamed from: l  reason: collision with root package name */
        public int f4478l;

        /* renamed from: m  reason: collision with root package name */
        public float f4479m;

        /* renamed from: n  reason: collision with root package name */
        public float f4480n;

        /* renamed from: o  reason: collision with root package name */
        public final float f4481o;

        /* renamed from: p  reason: collision with root package name */
        public final int f4482p;

        /* renamed from: q  reason: collision with root package name */
        public int f4483q;

        /* renamed from: r  reason: collision with root package name */
        public int f4484r;
        public int s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f4485t;
        public final Paint.Style u;

        public b(b bVar) {
            this.f4469c = null;
            this.f4470d = null;
            this.f4471e = null;
            this.f4472f = null;
            this.f4473g = PorterDuff.Mode.SRC_IN;
            this.f4474h = null;
            this.f4475i = 1.0f;
            this.f4476j = 1.0f;
            this.f4478l = 255;
            this.f4479m = 0.0f;
            this.f4480n = 0.0f;
            this.f4481o = 0.0f;
            this.f4482p = 0;
            this.f4483q = 0;
            this.f4484r = 0;
            this.s = 0;
            this.f4485t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.f4467a = bVar.f4467a;
            this.f4468b = bVar.f4468b;
            this.f4477k = bVar.f4477k;
            this.f4469c = bVar.f4469c;
            this.f4470d = bVar.f4470d;
            this.f4473g = bVar.f4473g;
            this.f4472f = bVar.f4472f;
            this.f4478l = bVar.f4478l;
            this.f4475i = bVar.f4475i;
            this.f4484r = bVar.f4484r;
            this.f4482p = bVar.f4482p;
            this.f4485t = bVar.f4485t;
            this.f4476j = bVar.f4476j;
            this.f4479m = bVar.f4479m;
            this.f4480n = bVar.f4480n;
            this.f4481o = bVar.f4481o;
            this.f4483q = bVar.f4483q;
            this.s = bVar.s;
            this.f4471e = bVar.f4471e;
            this.u = bVar.u;
            if (bVar.f4474h != null) {
                this.f4474h = new Rect(bVar.f4474h);
            }
        }

        public b(i iVar) {
            this.f4469c = null;
            this.f4470d = null;
            this.f4471e = null;
            this.f4472f = null;
            this.f4473g = PorterDuff.Mode.SRC_IN;
            this.f4474h = null;
            this.f4475i = 1.0f;
            this.f4476j = 1.0f;
            this.f4478l = 255;
            this.f4479m = 0.0f;
            this.f4480n = 0.0f;
            this.f4481o = 0.0f;
            this.f4482p = 0;
            this.f4483q = 0;
            this.f4484r = 0;
            this.s = 0;
            this.f4485t = false;
            this.u = Paint.Style.FILL_AND_STROKE;
            this.f4467a = iVar;
            this.f4468b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f4450f = true;
            return fVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f4445x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public f(Context context, AttributeSet attributeSet, int i6, int i7) {
        this(i.b(context, attributeSet, i6, i7).a());
    }

    public f(b bVar) {
        j jVar;
        this.f4447c = new l.f[4];
        this.f4448d = new l.f[4];
        this.f4449e = new BitSet(8);
        this.f4451g = new Matrix();
        this.f4452h = new Path();
        this.f4453i = new Path();
        this.f4454j = new RectF();
        this.f4455k = new RectF();
        this.f4456l = new Region();
        this.f4457m = new Region();
        Paint paint = new Paint(1);
        this.f4459o = paint;
        Paint paint2 = new Paint(1);
        this.f4460p = paint2;
        this.f4461q = new g3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f4524a;
        } else {
            jVar = new j();
        }
        this.s = jVar;
        this.f4464v = new RectF();
        this.f4465w = true;
        this.f4446b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f4462r = new a();
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.s;
        b bVar = this.f4446b;
        jVar.a(bVar.f4467a, bVar.f4476j, rectF, this.f4462r, path);
        if (this.f4446b.f4475i != 1.0f) {
            Matrix matrix = this.f4451g;
            matrix.reset();
            float f6 = this.f4446b.f4475i;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f4464v, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z5) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d6;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z5) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z5 && (d6 = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d6, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i6) {
        b bVar = this.f4446b;
        float f6 = bVar.f4480n + bVar.f4481o + bVar.f4479m;
        w2.a aVar = bVar.f4468b;
        if (aVar != null) {
            return aVar.a(i6, f6);
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0128, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0211  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.f.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f4449e.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i6 = this.f4446b.f4484r;
        Path path = this.f4452h;
        g3.a aVar = this.f4461q;
        if (i6 != 0) {
            canvas.drawPath(path, aVar.f4152a);
        }
        for (int i7 = 0; i7 < 4; i7++) {
            l.f fVar = this.f4447c[i7];
            int i8 = this.f4446b.f4483q;
            Matrix matrix = l.f.f4549b;
            fVar.a(matrix, aVar, i8, canvas);
            this.f4448d[i7].a(matrix, aVar, this.f4446b.f4483q, canvas);
        }
        if (this.f4465w) {
            b bVar = this.f4446b;
            int sin = (int) (Math.sin(Math.toRadians(bVar.s)) * bVar.f4484r);
            b bVar2 = this.f4446b;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.s)) * bVar2.f4484r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f4445x);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (!iVar.d(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a6 = iVar.f4493f.a(rectF) * this.f4446b.f4476j;
        canvas.drawRoundRect(rectF, a6, a6, paint);
    }

    public void g(Canvas canvas) {
        boolean z5;
        Paint paint = this.f4460p;
        Path path = this.f4453i;
        i iVar = this.f4458n;
        RectF rectF = this.f4455k;
        rectF.set(h());
        Paint.Style style = this.f4446b.u;
        float f6 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            f6 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f6, f6);
        f(canvas, paint, path, iVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4446b.f4478l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4446b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f4446b;
        if (bVar.f4482p == 2) {
            return;
        }
        if (bVar.f4467a.d(h())) {
            outline.setRoundRect(getBounds(), this.f4446b.f4467a.f4492e.a(h()) * this.f4446b.f4476j);
            return;
        }
        RectF h6 = h();
        Path path = this.f4452h;
        b(h6, path);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            outline.setPath(path);
        } else if (i6 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f4446b.f4474h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f4456l;
        region.set(bounds);
        RectF h6 = h();
        Path path = this.f4452h;
        b(h6, path);
        Region region2 = this.f4457m;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f4454j;
        rectF.set(getBounds());
        return rectF;
    }

    public final void i(Context context) {
        this.f4446b.f4468b = new w2.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f4450f = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4446b.f4472f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4446b.f4471e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4446b.f4470d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4446b.f4469c) != null && colorStateList4.isStateful())));
    }

    public final void j(float f6) {
        b bVar = this.f4446b;
        if (bVar.f4480n != f6) {
            bVar.f4480n = f6;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f4446b;
        if (bVar.f4469c != colorStateList) {
            bVar.f4469c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z5;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f4446b.f4469c == null || color2 == (colorForState2 = this.f4446b.f4469c.getColorForState(iArr, (color2 = (paint2 = this.f4459o).getColor())))) {
            z5 = false;
        } else {
            paint2.setColor(colorForState2);
            z5 = true;
        }
        if (this.f4446b.f4470d == null || color == (colorForState = this.f4446b.f4470d.getColorForState(iArr, (color = (paint = this.f4460p).getColor())))) {
            return z5;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4463t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        b bVar = this.f4446b;
        this.f4463t = c(bVar.f4472f, bVar.f4473g, this.f4459o, true);
        b bVar2 = this.f4446b;
        this.u = c(bVar2.f4471e, bVar2.f4473g, this.f4460p, false);
        b bVar3 = this.f4446b;
        if (bVar3.f4485t) {
            this.f4461q.a(bVar3.f4472f.getColorForState(getState(), 0));
        }
        if (!e0.b.a(porterDuffColorFilter, this.f4463t) || !e0.b.a(porterDuffColorFilter2, this.u)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f4446b = new b(this.f4446b);
        return this;
    }

    public final void n() {
        b bVar = this.f4446b;
        float f6 = bVar.f4480n + bVar.f4481o;
        bVar.f4483q = (int) Math.ceil(0.75f * f6);
        this.f4446b.f4484r = (int) Math.ceil(f6 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4450f = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, z2.k.b
    public boolean onStateChange(int[] iArr) {
        boolean z5 = l(iArr) || m();
        if (z5) {
            invalidateSelf();
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        b bVar = this.f4446b;
        if (bVar.f4478l != i6) {
            bVar.f4478l = i6;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4446b.getClass();
        super.invalidateSelf();
    }

    @Override // h3.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f4446b.f4467a = iVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4446b.f4472f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f4446b;
        if (bVar.f4473g != mode) {
            bVar.f4473g = mode;
            m();
            super.invalidateSelf();
        }
    }
}
