package h3;

import a1.f0;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import h3.f;
import java.util.ArrayList;
import java.util.BitSet;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f4512a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f4513b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f4514c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f4515d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f4516e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f4517f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f4518g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4519h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f4520i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f4521j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f4522k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4523l = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f4524a = new j();
    }

    public j() {
        for (int i6 = 0; i6 < 4; i6++) {
            this.f4512a[i6] = new l();
            this.f4513b[i6] = new Matrix();
            this.f4514c[i6] = new Matrix();
        }
    }

    public final void a(i iVar, float f6, RectF rectF, f.a aVar, Path path) {
        int i6;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        float centerX;
        float f7;
        e eVar;
        Path path2;
        f.a aVar2;
        char c6;
        c cVar;
        f0 f0Var;
        float f8;
        float f9;
        float f10;
        float f11;
        j jVar = this;
        i iVar2 = iVar;
        RectF rectF2 = rectF;
        f.a aVar3 = aVar;
        Path path3 = path;
        path.rewind();
        Path path4 = jVar.f4516e;
        path4.rewind();
        Path path5 = jVar.f4517f;
        path5.rewind();
        path5.addRect(rectF2, Path.Direction.CW);
        int i7 = 0;
        while (true) {
            i6 = 4;
            matrixArr = jVar.f4514c;
            fArr = jVar.f4519h;
            matrixArr2 = jVar.f4513b;
            lVarArr = jVar.f4512a;
            if (i7 >= 4) {
                break;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        cVar = iVar2.f4493f;
                    } else {
                        cVar = iVar2.f4492e;
                    }
                } else {
                    cVar = iVar2.f4495h;
                }
            } else {
                cVar = iVar2.f4494g;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        f0Var = iVar2.f4489b;
                    } else {
                        f0Var = iVar2.f4488a;
                    }
                } else {
                    f0Var = iVar2.f4491d;
                }
            } else {
                f0Var = iVar2.f4490c;
            }
            l lVar = lVarArr[i7];
            f0Var.getClass();
            f0Var.f(f6, cVar.a(rectF2), lVar);
            int i8 = i7 + 1;
            float f12 = (i8 % 4) * 90;
            matrixArr2[i7].reset();
            PointF pointF = jVar.f4515d;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        f11 = rectF2.right;
                    } else {
                        f11 = rectF2.left;
                    }
                    f9 = f11;
                    f10 = rectF2.top;
                    pointF.set(f9, f10);
                    matrixArr2[i7].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i7].preRotate(f12);
                    l lVar2 = lVarArr[i7];
                    fArr[0] = lVar2.f4529c;
                    fArr[1] = lVar2.f4530d;
                    matrixArr2[i7].mapPoints(fArr);
                    matrixArr[i7].reset();
                    matrixArr[i7].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i7].preRotate(f12);
                    rectF2 = rectF;
                    i7 = i8;
                } else {
                    f8 = rectF2.left;
                }
            } else {
                f8 = rectF2.right;
            }
            f9 = f8;
            f10 = rectF2.bottom;
            pointF.set(f9, f10);
            matrixArr2[i7].setTranslate(pointF.x, pointF.y);
            matrixArr2[i7].preRotate(f12);
            l lVar22 = lVarArr[i7];
            fArr[0] = lVar22.f4529c;
            fArr[1] = lVar22.f4530d;
            matrixArr2[i7].mapPoints(fArr);
            matrixArr[i7].reset();
            matrixArr[i7].setTranslate(fArr[0], fArr[1]);
            matrixArr[i7].preRotate(f12);
            rectF2 = rectF;
            i7 = i8;
        }
        char c7 = 1;
        char c8 = 0;
        int i9 = 0;
        while (i9 < i6) {
            l lVar3 = lVarArr[i9];
            fArr[c8] = lVar3.f4527a;
            fArr[c7] = lVar3.f4528b;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 == 0) {
                path3.moveTo(fArr[c8], fArr[c7]);
            } else {
                path3.lineTo(fArr[c8], fArr[c7]);
            }
            lVarArr[i9].c(matrixArr2[i9], path3);
            if (aVar3 != null) {
                l lVar4 = lVarArr[i9];
                Matrix matrix = matrixArr2[i9];
                f fVar = f.this;
                BitSet bitSet = fVar.f4449e;
                lVar4.getClass();
                bitSet.set(i9, false);
                lVar4.b(lVar4.f4532f);
                fVar.f4447c[i9] = new k(new ArrayList(lVar4.f4534h), new Matrix(matrix));
            }
            int i10 = i9 + 1;
            int i11 = i10 % 4;
            l lVar5 = lVarArr[i9];
            fArr[0] = lVar5.f4529c;
            fArr[1] = lVar5.f4530d;
            matrixArr2[i9].mapPoints(fArr);
            l lVar6 = lVarArr[i11];
            float f13 = lVar6.f4527a;
            float[] fArr2 = jVar.f4520i;
            fArr2[0] = f13;
            fArr2[1] = lVar6.f4528b;
            matrixArr2[i11].mapPoints(fArr2);
            Path path6 = path4;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i9];
            fArr[0] = lVar7.f4529c;
            fArr[1] = lVar7.f4530d;
            matrixArr2[i9].mapPoints(fArr);
            if (i9 != 1 && i9 != 3) {
                centerX = rectF.centerY();
                f7 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f7 = fArr[0];
            }
            float abs = Math.abs(centerX - f7);
            l lVar8 = jVar.f4518g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        eVar = iVar2.f4497j;
                    } else {
                        eVar = iVar2.f4496i;
                    }
                } else {
                    eVar = iVar2.f4499l;
                }
            } else {
                eVar = iVar2.f4498k;
            }
            eVar.a(max, abs, f6, lVar8);
            Path path7 = jVar.f4521j;
            path7.reset();
            lVar8.c(matrixArr[i9], path7);
            if (jVar.f4523l && (jVar.b(path7, i9) || jVar.b(path7, i11))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f4527a;
                fArr[1] = lVar8.f4528b;
                matrixArr[i9].mapPoints(fArr);
                path6.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i9], path6);
                aVar2 = aVar;
                path2 = path;
            } else {
                path2 = path;
                lVar8.c(matrixArr[i9], path2);
                aVar2 = aVar;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i9];
                f fVar2 = f.this;
                c6 = 0;
                fVar2.f4449e.set(i9 + 4, false);
                lVar8.b(lVar8.f4532f);
                fVar2.f4448d[i9] = new k(new ArrayList(lVar8.f4534h), new Matrix(matrix2));
            } else {
                c6 = 0;
            }
            jVar = this;
            c8 = c6;
            i9 = i10;
            c7 = 1;
            i6 = 4;
            iVar2 = iVar;
            Path path8 = path2;
            path4 = path6;
            aVar3 = aVar2;
            path3 = path8;
        }
        Path path9 = path4;
        Path path10 = path3;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path10.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i6) {
        Path path2 = this.f4522k;
        path2.reset();
        this.f4512a[i6].c(this.f4513b[i6], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
