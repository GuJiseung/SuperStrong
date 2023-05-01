package b1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import y.d;
import z.a;
/* loaded from: classes.dex */
public final class g extends b1.f {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f2289k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public C0016g f2290c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f2291d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f2292e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2293f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2294g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f2295h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f2296i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f2297j;

    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public x.c f2298e;

        /* renamed from: f  reason: collision with root package name */
        public float f2299f;

        /* renamed from: g  reason: collision with root package name */
        public x.c f2300g;

        /* renamed from: h  reason: collision with root package name */
        public float f2301h;

        /* renamed from: i  reason: collision with root package name */
        public float f2302i;

        /* renamed from: j  reason: collision with root package name */
        public float f2303j;

        /* renamed from: k  reason: collision with root package name */
        public float f2304k;

        /* renamed from: l  reason: collision with root package name */
        public float f2305l;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f2306m;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f2307n;

        /* renamed from: o  reason: collision with root package name */
        public float f2308o;

        public b() {
            this.f2299f = 0.0f;
            this.f2301h = 1.0f;
            this.f2302i = 1.0f;
            this.f2303j = 0.0f;
            this.f2304k = 1.0f;
            this.f2305l = 0.0f;
            this.f2306m = Paint.Cap.BUTT;
            this.f2307n = Paint.Join.MITER;
            this.f2308o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f2299f = 0.0f;
            this.f2301h = 1.0f;
            this.f2302i = 1.0f;
            this.f2303j = 0.0f;
            this.f2304k = 1.0f;
            this.f2305l = 0.0f;
            this.f2306m = Paint.Cap.BUTT;
            this.f2307n = Paint.Join.MITER;
            this.f2308o = 4.0f;
            this.f2298e = bVar.f2298e;
            this.f2299f = bVar.f2299f;
            this.f2301h = bVar.f2301h;
            this.f2300g = bVar.f2300g;
            this.f2323c = bVar.f2323c;
            this.f2302i = bVar.f2302i;
            this.f2303j = bVar.f2303j;
            this.f2304k = bVar.f2304k;
            this.f2305l = bVar.f2305l;
            this.f2306m = bVar.f2306m;
            this.f2307n = bVar.f2307n;
            this.f2308o = bVar.f2308o;
        }

        @Override // b1.g.d
        public final boolean a() {
            return this.f2300g.b() || this.f2298e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // b1.g.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                x.c r0 = r6.f2300g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f6612b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f6613c
                if (r1 == r4) goto L1c
                r0.f6613c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                x.c r1 = r6.f2298e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f6612b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f6613c
                if (r7 == r4) goto L36
                r1.f6613c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: b1.g.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f2302i;
        }

        public int getFillColor() {
            return this.f2300g.f6613c;
        }

        public float getStrokeAlpha() {
            return this.f2301h;
        }

        public int getStrokeColor() {
            return this.f2298e.f6613c;
        }

        public float getStrokeWidth() {
            return this.f2299f;
        }

        public float getTrimPathEnd() {
            return this.f2304k;
        }

        public float getTrimPathOffset() {
            return this.f2305l;
        }

        public float getTrimPathStart() {
            return this.f2303j;
        }

        public void setFillAlpha(float f6) {
            this.f2302i = f6;
        }

        public void setFillColor(int i6) {
            this.f2300g.f6613c = i6;
        }

        public void setStrokeAlpha(float f6) {
            this.f2301h = f6;
        }

        public void setStrokeColor(int i6) {
            this.f2298e.f6613c = i6;
        }

        public void setStrokeWidth(float f6) {
            this.f2299f = f6;
        }

        public void setTrimPathEnd(float f6) {
            this.f2304k = f6;
        }

        public void setTrimPathOffset(float f6) {
            this.f2305l = f6;
        }

        public void setTrimPathStart(float f6) {
            this.f2303j = f6;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f2325p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f2326a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f2327b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f2328c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f2329d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f2330e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f2331f;

        /* renamed from: g  reason: collision with root package name */
        public final c f2332g;

        /* renamed from: h  reason: collision with root package name */
        public float f2333h;

        /* renamed from: i  reason: collision with root package name */
        public float f2334i;

        /* renamed from: j  reason: collision with root package name */
        public float f2335j;

        /* renamed from: k  reason: collision with root package name */
        public float f2336k;

        /* renamed from: l  reason: collision with root package name */
        public int f2337l;

        /* renamed from: m  reason: collision with root package name */
        public String f2338m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f2339n;

        /* renamed from: o  reason: collision with root package name */
        public final l.b<String, Object> f2340o;

        public f() {
            this.f2328c = new Matrix();
            this.f2333h = 0.0f;
            this.f2334i = 0.0f;
            this.f2335j = 0.0f;
            this.f2336k = 0.0f;
            this.f2337l = 255;
            this.f2338m = null;
            this.f2339n = null;
            this.f2340o = new l.b<>();
            this.f2332g = new c();
            this.f2326a = new Path();
            this.f2327b = new Path();
        }

        public f(f fVar) {
            this.f2328c = new Matrix();
            this.f2333h = 0.0f;
            this.f2334i = 0.0f;
            this.f2335j = 0.0f;
            this.f2336k = 0.0f;
            this.f2337l = 255;
            this.f2338m = null;
            this.f2339n = null;
            l.b<String, Object> bVar = new l.b<>();
            this.f2340o = bVar;
            this.f2332g = new c(fVar.f2332g, bVar);
            this.f2326a = new Path(fVar.f2326a);
            this.f2327b = new Path(fVar.f2327b);
            this.f2333h = fVar.f2333h;
            this.f2334i = fVar.f2334i;
            this.f2335j = fVar.f2335j;
            this.f2336k = fVar.f2336k;
            this.f2337l = fVar.f2337l;
            this.f2338m = fVar.f2338m;
            String str = fVar.f2338m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f2339n = fVar.f2339n;
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i6, int i7) {
            int i8;
            float f6;
            float f7;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f2309a.set(matrix);
            Matrix matrix2 = cVar.f2309a;
            matrix2.preConcat(cVar.f2318j);
            canvas.save();
            char c6 = 0;
            int i9 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f2310b;
                if (i9 < arrayList.size()) {
                    d dVar = arrayList.get(i9);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i6, i7);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f8 = i6 / this.f2335j;
                        float f9 = i7 / this.f2336k;
                        float min = Math.min(f8, f9);
                        Matrix matrix3 = this.f2328c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f8, f9);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i8 = i9;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f10 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c6], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f6 = Math.abs(f10) / max;
                        } else {
                            f6 = 0.0f;
                        }
                        if (f6 != 0.0f) {
                            eVar.getClass();
                            Path path = this.f2326a;
                            path.reset();
                            d.a[] aVarArr = eVar.f2321a;
                            if (aVarArr != null) {
                                d.a.b(aVarArr, path);
                            }
                            Path path2 = this.f2327b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.f2323c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f11 = bVar.f2303j;
                                if (f11 != 0.0f || bVar.f2304k != 1.0f) {
                                    float f12 = bVar.f2305l;
                                    float f13 = (f11 + f12) % 1.0f;
                                    float f14 = (bVar.f2304k + f12) % 1.0f;
                                    if (this.f2331f == null) {
                                        this.f2331f = new PathMeasure();
                                    }
                                    this.f2331f.setPath(path, false);
                                    float length = this.f2331f.getLength();
                                    float f15 = f13 * length;
                                    float f16 = f14 * length;
                                    path.reset();
                                    if (f15 > f16) {
                                        this.f2331f.getSegment(f15, length, path, true);
                                        f7 = 0.0f;
                                        this.f2331f.getSegment(0.0f, f16, path, true);
                                    } else {
                                        f7 = 0.0f;
                                        this.f2331f.getSegment(f15, f16, path, true);
                                    }
                                    path.rLineTo(f7, f7);
                                }
                                path2.addPath(path, matrix3);
                                x.c cVar2 = bVar.f2300g;
                                if (cVar2.f6611a != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5 && cVar2.f6613c == 0) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    if (this.f2330e == null) {
                                        Paint paint = new Paint(1);
                                        this.f2330e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f2330e;
                                    Shader shader = cVar2.f6611a;
                                    if (shader != null) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f2302i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i10 = cVar2.f6613c;
                                        float f17 = bVar.f2302i;
                                        PorterDuff.Mode mode = g.f2289k;
                                        paint2.setColor((i10 & 16777215) | (((int) (Color.alpha(i10) * f17)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.f2323c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                x.c cVar3 = bVar.f2298e;
                                if (cVar3.f6611a != null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (!z7 && cVar3.f6613c == 0) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (z8) {
                                    if (this.f2329d == null) {
                                        z9 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f2329d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z9 = true;
                                    }
                                    Paint paint4 = this.f2329d;
                                    Paint.Join join = bVar.f2307n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.f2306m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f2308o);
                                    Shader shader2 = cVar3.f6611a;
                                    if (shader2 == null) {
                                        z9 = false;
                                    }
                                    if (z9) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f2301h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i11 = cVar3.f6613c;
                                        float f18 = bVar.f2301h;
                                        PorterDuff.Mode mode2 = g.f2289k;
                                        paint4.setColor((i11 & 16777215) | (((int) (Color.alpha(i11) * f18)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f2299f * f6 * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i9 = i8 + 1;
                        c6 = 0;
                    }
                    i8 = i9;
                    i9 = i8 + 1;
                    c6 = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2337l;
        }

        public void setAlpha(float f6) {
            setRootAlpha((int) (f6 * 255.0f));
        }

        public void setRootAlpha(int i6) {
            this.f2337l = i6;
        }
    }

    /* renamed from: b1.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0016g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f2341a;

        /* renamed from: b  reason: collision with root package name */
        public f f2342b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f2343c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f2344d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2345e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f2346f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f2347g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f2348h;

        /* renamed from: i  reason: collision with root package name */
        public int f2349i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2350j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2351k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f2352l;

        public C0016g() {
            this.f2343c = null;
            this.f2344d = g.f2289k;
            this.f2342b = new f();
        }

        public C0016g(C0016g c0016g) {
            this.f2343c = null;
            this.f2344d = g.f2289k;
            if (c0016g != null) {
                this.f2341a = c0016g.f2341a;
                f fVar = new f(c0016g.f2342b);
                this.f2342b = fVar;
                if (c0016g.f2342b.f2330e != null) {
                    fVar.f2330e = new Paint(c0016g.f2342b.f2330e);
                }
                if (c0016g.f2342b.f2329d != null) {
                    this.f2342b.f2329d = new Paint(c0016g.f2342b.f2329d);
                }
                this.f2343c = c0016g.f2343c;
                this.f2344d = c0016g.f2344d;
                this.f2345e = c0016g.f2345e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2341a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f2353a;

        public h(Drawable.ConstantState constantState) {
            this.f2353a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f2353a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2353a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            g gVar = new g();
            gVar.f2288b = (VectorDrawable) this.f2353a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2288b = (VectorDrawable) this.f2353a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2288b = (VectorDrawable) this.f2353a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f2294g = true;
        this.f2295h = new float[9];
        this.f2296i = new Matrix();
        this.f2297j = new Rect();
        this.f2290c = new C0016g();
    }

    public g(C0016g c0016g) {
        this.f2294g = true;
        this.f2295h = new float[9];
        this.f2296i = new Matrix();
        this.f2297j = new Rect();
        this.f2290c = c0016g;
        this.f2291d = a(c0016g.f2343c, c0016g.f2344d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.C0102a.a(drawable);
        }
        return this.f2290c.f2342b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2290c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f2292e;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2288b != null) {
            return new h(this.f2288b.getConstantState());
        }
        this.f2290c.f2341a = getChangingConfigurations();
        return this.f2290c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2290c.f2342b.f2334i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2290c.f2342b.f2333h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.g.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.C0102a.d(drawable);
        }
        return this.f2290c.f2345e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0016g c0016g = this.f2290c;
            if (c0016g != null) {
                f fVar = c0016g.f2342b;
                if (fVar.f2339n == null) {
                    fVar.f2339n = Boolean.valueOf(fVar.f2332g.a());
                }
                if (fVar.f2339n.booleanValue() || ((colorStateList = this.f2290c.f2343c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2293f && super.mutate() == this) {
            this.f2290c = new C0016g(this.f2290c);
            this.f2293f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z5;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0016g c0016g = this.f2290c;
        ColorStateList colorStateList = c0016g.f2343c;
        if (colorStateList != null && (mode = c0016g.f2344d) != null) {
            this.f2291d = a(colorStateList, mode);
            invalidateSelf();
            z5 = true;
        } else {
            z5 = false;
        }
        f fVar = c0016g.f2342b;
        if (fVar.f2339n == null) {
            fVar.f2339n = Boolean.valueOf(fVar.f2332g.a());
        }
        if (fVar.f2339n.booleanValue()) {
            boolean b6 = c0016g.f2342b.f2332g.b(iArr);
            c0016g.f2351k |= b6;
            if (b6) {
                invalidateSelf();
                return true;
            }
        }
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f2290c.f2342b.getRootAlpha() != i6) {
            this.f2290c.f2342b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.C0102a.e(drawable, z5);
        } else {
            this.f2290c.f2345e = z5;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f2292e = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            z.a.a(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        C0016g c0016g = this.f2290c;
        if (c0016g.f2343c != colorStateList) {
            c0016g.f2343c = colorStateList;
            this.f2291d = a(colorStateList, c0016g.f2344d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        C0016g c0016g = this.f2290c;
        if (c0016g.f2344d != mode) {
            c0016g.f2344d = mode;
            this.f2291d = a(c0016g.f2343c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.setVisible(z5, z6) : super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f2309a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f2310b;

        /* renamed from: c  reason: collision with root package name */
        public float f2311c;

        /* renamed from: d  reason: collision with root package name */
        public float f2312d;

        /* renamed from: e  reason: collision with root package name */
        public float f2313e;

        /* renamed from: f  reason: collision with root package name */
        public float f2314f;

        /* renamed from: g  reason: collision with root package name */
        public float f2315g;

        /* renamed from: h  reason: collision with root package name */
        public float f2316h;

        /* renamed from: i  reason: collision with root package name */
        public float f2317i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f2318j;

        /* renamed from: k  reason: collision with root package name */
        public final int f2319k;

        /* renamed from: l  reason: collision with root package name */
        public String f2320l;

        public c() {
            this.f2309a = new Matrix();
            this.f2310b = new ArrayList<>();
            this.f2311c = 0.0f;
            this.f2312d = 0.0f;
            this.f2313e = 0.0f;
            this.f2314f = 1.0f;
            this.f2315g = 1.0f;
            this.f2316h = 0.0f;
            this.f2317i = 0.0f;
            this.f2318j = new Matrix();
            this.f2320l = null;
        }

        @Override // b1.g.d
        public final boolean a() {
            int i6 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f2310b;
                if (i6 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i6).a()) {
                    return true;
                }
                i6++;
            }
        }

        @Override // b1.g.d
        public final boolean b(int[] iArr) {
            int i6 = 0;
            boolean z5 = false;
            while (true) {
                ArrayList<d> arrayList = this.f2310b;
                if (i6 >= arrayList.size()) {
                    return z5;
                }
                z5 |= arrayList.get(i6).b(iArr);
                i6++;
            }
        }

        public final void c() {
            Matrix matrix = this.f2318j;
            matrix.reset();
            matrix.postTranslate(-this.f2312d, -this.f2313e);
            matrix.postScale(this.f2314f, this.f2315g);
            matrix.postRotate(this.f2311c, 0.0f, 0.0f);
            matrix.postTranslate(this.f2316h + this.f2312d, this.f2317i + this.f2313e);
        }

        public String getGroupName() {
            return this.f2320l;
        }

        public Matrix getLocalMatrix() {
            return this.f2318j;
        }

        public float getPivotX() {
            return this.f2312d;
        }

        public float getPivotY() {
            return this.f2313e;
        }

        public float getRotation() {
            return this.f2311c;
        }

        public float getScaleX() {
            return this.f2314f;
        }

        public float getScaleY() {
            return this.f2315g;
        }

        public float getTranslateX() {
            return this.f2316h;
        }

        public float getTranslateY() {
            return this.f2317i;
        }

        public void setPivotX(float f6) {
            if (f6 != this.f2312d) {
                this.f2312d = f6;
                c();
            }
        }

        public void setPivotY(float f6) {
            if (f6 != this.f2313e) {
                this.f2313e = f6;
                c();
            }
        }

        public void setRotation(float f6) {
            if (f6 != this.f2311c) {
                this.f2311c = f6;
                c();
            }
        }

        public void setScaleX(float f6) {
            if (f6 != this.f2314f) {
                this.f2314f = f6;
                c();
            }
        }

        public void setScaleY(float f6) {
            if (f6 != this.f2315g) {
                this.f2315g = f6;
                c();
            }
        }

        public void setTranslateX(float f6) {
            if (f6 != this.f2316h) {
                this.f2316h = f6;
                c();
            }
        }

        public void setTranslateY(float f6) {
            if (f6 != this.f2317i) {
                this.f2317i = f6;
                c();
            }
        }

        public c(c cVar, l.b<String, Object> bVar) {
            e aVar;
            this.f2309a = new Matrix();
            this.f2310b = new ArrayList<>();
            this.f2311c = 0.0f;
            this.f2312d = 0.0f;
            this.f2313e = 0.0f;
            this.f2314f = 1.0f;
            this.f2315g = 1.0f;
            this.f2316h = 0.0f;
            this.f2317i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2318j = matrix;
            this.f2320l = null;
            this.f2311c = cVar.f2311c;
            this.f2312d = cVar.f2312d;
            this.f2313e = cVar.f2313e;
            this.f2314f = cVar.f2314f;
            this.f2315g = cVar.f2315g;
            this.f2316h = cVar.f2316h;
            this.f2317i = cVar.f2317i;
            String str = cVar.f2320l;
            this.f2320l = str;
            this.f2319k = cVar.f2319k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f2318j);
            ArrayList<d> arrayList = cVar.f2310b;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                d dVar = arrayList.get(i6);
                if (dVar instanceof c) {
                    this.f2310b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (!(dVar instanceof a)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    } else {
                        aVar = new a((a) dVar);
                    }
                    this.f2310b.add(aVar);
                    String str2 = aVar.f2322b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f2321a;

        /* renamed from: b  reason: collision with root package name */
        public String f2322b;

        /* renamed from: c  reason: collision with root package name */
        public int f2323c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2324d;

        public e() {
            this.f2321a = null;
            this.f2323c = 0;
        }

        public d.a[] getPathData() {
            return this.f2321a;
        }

        public String getPathName() {
            return this.f2322b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!y.d.a(this.f2321a, aVarArr)) {
                this.f2321a = y.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f2321a;
            for (int i6 = 0; i6 < aVarArr.length; i6++) {
                aVarArr2[i6].f6728a = aVarArr[i6].f6728a;
                int i7 = 0;
                while (true) {
                    float[] fArr = aVarArr[i6].f6729b;
                    if (i7 < fArr.length) {
                        aVarArr2[i6].f6729b[i7] = fArr[i7];
                        i7++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f2321a = null;
            this.f2323c = 0;
            this.f2322b = eVar.f2322b;
            this.f2324d = eVar.f2324d;
            this.f2321a = y.d.e(eVar.f2321a);
        }
    }
}
