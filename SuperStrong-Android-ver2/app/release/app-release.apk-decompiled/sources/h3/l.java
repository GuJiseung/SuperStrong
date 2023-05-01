package h3;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f4527a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f4528b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f4529c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f4530d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f4531e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4532f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f4533g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f4534h = new ArrayList();

    /* loaded from: classes.dex */
    public static class a extends f {

        /* renamed from: c  reason: collision with root package name */
        public final c f4535c;

        public a(c cVar) {
            this.f4535c = cVar;
        }

        @Override // h3.l.f
        public final void a(Matrix matrix, g3.a aVar, int i6, Canvas canvas) {
            boolean z5;
            c cVar = this.f4535c;
            float f6 = cVar.f4544f;
            float f7 = cVar.f4545g;
            RectF rectF = new RectF(cVar.f4540b, cVar.f4541c, cVar.f4542d, cVar.f4543e);
            aVar.getClass();
            if (f7 < 0.0f) {
                z5 = true;
            } else {
                z5 = false;
            }
            Path path = aVar.f4158g;
            int[] iArr = g3.a.f4150k;
            if (z5) {
                iArr[0] = 0;
                iArr[1] = aVar.f4157f;
                iArr[2] = aVar.f4156e;
                iArr[3] = aVar.f4155d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f6, f7);
                path.close();
                float f8 = -i6;
                rectF.inset(f8, f8);
                iArr[0] = 0;
                iArr[1] = aVar.f4155d;
                iArr[2] = aVar.f4156e;
                iArr[3] = aVar.f4157f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f9 = 1.0f - (i6 / width);
                float[] fArr = g3.a.f4151l;
                fArr[1] = f9;
                fArr[2] = ((1.0f - f9) / 2.0f) + f9;
                RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint = aVar.f4153b;
                paint.setShader(radialGradient);
                canvas.save();
                canvas.concat(matrix);
                canvas.scale(1.0f, rectF.height() / rectF.width());
                if (!z5) {
                    canvas.clipPath(path, Region.Op.DIFFERENCE);
                    canvas.drawPath(path, aVar.f4159h);
                }
                canvas.drawArc(rectF, f6, f7, true, paint);
                canvas.restore();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: c  reason: collision with root package name */
        public final d f4536c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4537d;

        /* renamed from: e  reason: collision with root package name */
        public final float f4538e;

        public b(d dVar, float f6, float f7) {
            this.f4536c = dVar;
            this.f4537d = f6;
            this.f4538e = f7;
        }

        @Override // h3.l.f
        public final void a(Matrix matrix, g3.a aVar, int i6, Canvas canvas) {
            d dVar = this.f4536c;
            float f6 = dVar.f4547c;
            float f7 = this.f4538e;
            float f8 = dVar.f4546b;
            float f9 = this.f4537d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f7, f8 - f9), 0.0f);
            Matrix matrix2 = this.f4550a;
            matrix2.set(matrix);
            matrix2.preTranslate(f9, f7);
            matrix2.preRotate(b());
            aVar.getClass();
            rectF.bottom += i6;
            rectF.offset(0.0f, -i6);
            int[] iArr = g3.a.f4148i;
            iArr[0] = aVar.f4157f;
            iArr[1] = aVar.f4156e;
            iArr[2] = aVar.f4155d;
            Paint paint = aVar.f4154c;
            float f10 = rectF.left;
            paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, g3.a.f4149j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            d dVar = this.f4536c;
            return (float) Math.toDegrees(Math.atan((dVar.f4547c - this.f4538e) / (dVar.f4546b - this.f4537d)));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f4539h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4540b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f4541c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f4542d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f4543e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4544f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f4545g;

        public c(float f6, float f7, float f8, float f9) {
            this.f4540b = f6;
            this.f4541c = f7;
            this.f4542d = f8;
            this.f4543e = f9;
        }

        @Override // h3.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4548a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4539h;
            rectF.set(this.f4540b, this.f4541c, this.f4542d, this.f4543e);
            path.arcTo(rectF, this.f4544f, this.f4545g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f4546b;

        /* renamed from: c  reason: collision with root package name */
        public float f4547c;

        @Override // h3.l.e
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4548a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4546b, this.f4547c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4548a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: b  reason: collision with root package name */
        public static final Matrix f4549b = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4550a = new Matrix();

        public abstract void a(Matrix matrix, g3.a aVar, int i6, Canvas canvas);
    }

    public l() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f6, float f7, float f8, float f9, float f10, float f11) {
        boolean z5;
        float f12;
        c cVar = new c(f6, f7, f8, f9);
        cVar.f4544f = f10;
        cVar.f4545g = f11;
        this.f4533g.add(cVar);
        a aVar = new a(cVar);
        float f13 = f10 + f11;
        if (f11 < 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            f10 = (f10 + 180.0f) % 360.0f;
        }
        if (z5) {
            f12 = (180.0f + f13) % 360.0f;
        } else {
            f12 = f13;
        }
        b(f10);
        this.f4534h.add(aVar);
        this.f4531e = f12;
        double d6 = f13;
        this.f4529c = (((f8 - f6) / 2.0f) * ((float) Math.cos(Math.toRadians(d6)))) + ((f6 + f8) * 0.5f);
        this.f4530d = (((f9 - f7) / 2.0f) * ((float) Math.sin(Math.toRadians(d6)))) + ((f7 + f9) * 0.5f);
    }

    public final void b(float f6) {
        float f7 = this.f4531e;
        if (f7 == f6) {
            return;
        }
        float f8 = ((f6 - f7) + 360.0f) % 360.0f;
        if (f8 > 180.0f) {
            return;
        }
        float f9 = this.f4529c;
        float f10 = this.f4530d;
        c cVar = new c(f9, f10, f9, f10);
        cVar.f4544f = this.f4531e;
        cVar.f4545g = f8;
        this.f4534h.add(new a(cVar));
        this.f4531e = f6;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f4533g;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((e) arrayList.get(i6)).a(matrix, path);
        }
    }

    public final void d(float f6, float f7) {
        d dVar = new d();
        dVar.f4546b = f6;
        dVar.f4547c = f7;
        this.f4533g.add(dVar);
        b bVar = new b(dVar, this.f4529c, this.f4530d);
        b(bVar.b() + 270.0f);
        this.f4534h.add(bVar);
        this.f4531e = bVar.b() + 270.0f;
        this.f4529c = f6;
        this.f4530d = f7;
    }

    public final void e(float f6, float f7, float f8) {
        this.f4527a = 0.0f;
        this.f4528b = f6;
        this.f4529c = 0.0f;
        this.f4530d = f6;
        this.f4531e = f7;
        this.f4532f = (f7 + f8) % 360.0f;
        this.f4533g.clear();
        this.f4534h.clear();
    }
}
