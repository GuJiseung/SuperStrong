package y;

import android.graphics.Path;
import android.util.Log;
/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f6728a;

        /* renamed from: b  reason: collision with root package name */
        public final float[] f6729b;

        public a(char c6, float[] fArr) {
            this.f6728a = c6;
            this.f6729b = fArr;
        }

        public a(a aVar) {
            this.f6728a = aVar.f6728a;
            float[] fArr = aVar.f6729b;
            this.f6729b = d.b(fArr, fArr.length);
        }

        public static void a(Path path, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z5, boolean z6) {
            double d6;
            double d7;
            double radians = Math.toRadians(f12);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d8 = f6;
            double d9 = f7;
            double d10 = (d9 * sin) + (d8 * cos);
            double d11 = d8;
            double d12 = f10;
            double d13 = d10 / d12;
            double d14 = f11;
            double d15 = ((d9 * cos) + ((-f6) * sin)) / d14;
            double d16 = d9;
            double d17 = f9;
            double d18 = ((d17 * sin) + (f8 * cos)) / d12;
            double d19 = ((d17 * cos) + ((-f8) * sin)) / d14;
            double d20 = d13 - d18;
            double d21 = d15 - d19;
            double d22 = (d13 + d18) / 2.0d;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d21 * d21) + (d20 * d20);
            if (d24 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d24);
                float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
                a(path, f6, f7, f8, f9, f10 * sqrt, f11 * sqrt, f12, z5, z6);
                return;
            }
            double sqrt2 = Math.sqrt(d25);
            double d26 = d20 * sqrt2;
            double d27 = sqrt2 * d21;
            if (z5 == z6) {
                d6 = d22 - d27;
                d7 = d23 + d26;
            } else {
                d6 = d22 + d27;
                d7 = d23 - d26;
            }
            double atan2 = Math.atan2(d15 - d7, d13 - d6);
            double atan22 = Math.atan2(d19 - d7, d18 - d6) - atan2;
            int i6 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z6 != (i6 >= 0)) {
                atan22 = i6 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d28 = d6 * d12;
            double d29 = d7 * d14;
            double d30 = (d28 * cos) - (d29 * sin);
            double d31 = (d29 * cos) + (d28 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d32 = -d12;
            double d33 = d32 * cos2;
            double d34 = d14 * sin2;
            double d35 = (d33 * sin3) - (d34 * cos3);
            double d36 = d32 * sin2;
            double d37 = d14 * cos2;
            double d38 = (cos3 * d37) + (sin3 * d36);
            double d39 = d37;
            double d40 = atan22 / ceil;
            int i7 = 0;
            while (i7 < ceil) {
                double d41 = atan2 + d40;
                double sin4 = Math.sin(d41);
                double cos4 = Math.cos(d41);
                double d42 = d40;
                double d43 = (((d12 * cos2) * cos4) + d30) - (d34 * sin4);
                double d44 = d39;
                double d45 = d30;
                double d46 = (d44 * sin4) + (d12 * sin2 * cos4) + d31;
                double d47 = (d33 * sin4) - (d34 * cos4);
                double d48 = (cos4 * d44) + (sin4 * d36);
                double d49 = d41 - atan2;
                double tan = Math.tan(d49 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d35 * sqrt3) + d11), (float) ((d38 * sqrt3) + d16), (float) (d43 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d43, (float) d46);
                i7++;
                atan2 = d41;
                d36 = d36;
                cos2 = cos2;
                ceil = ceil;
                d38 = d48;
                d12 = d12;
                d35 = d47;
                d11 = d43;
                d16 = d46;
                d30 = d45;
                d40 = d42;
                d39 = d44;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i6;
            int i7;
            char c6;
            a aVar;
            int i8;
            boolean z5;
            boolean z6;
            float f6;
            float f7;
            boolean z7;
            boolean z8;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            a[] aVarArr2 = aVarArr;
            int i9 = 6;
            float[] fArr = new float[6];
            char c7 = 'm';
            int i10 = 0;
            char c8 = 'm';
            int i11 = 0;
            while (i11 < aVarArr2.length) {
                a aVar2 = aVarArr2[i11];
                char c9 = aVar2.f6728a;
                float f27 = fArr[i10];
                float f28 = fArr[1];
                float f29 = fArr[2];
                float f30 = fArr[3];
                float f31 = fArr[4];
                float f32 = fArr[5];
                switch (c9) {
                    case 'A':
                    case 'a':
                        i6 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i6 = i9;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i6 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i6 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f31, f32);
                        f27 = f31;
                        f29 = f27;
                        f28 = f32;
                        f30 = f28;
                    default:
                        i6 = 2;
                        break;
                }
                float f33 = f31;
                float f34 = f32;
                float f35 = f27;
                float f36 = f28;
                int i12 = i10;
                while (true) {
                    float[] fArr2 = aVar2.f6729b;
                    if (i12 < fArr2.length) {
                        if (c9 != 'A') {
                            if (c9 != 'C') {
                                if (c9 != 'H') {
                                    if (c9 != 'Q') {
                                        if (c9 != 'V') {
                                            if (c9 != 'a') {
                                                if (c9 != 'c') {
                                                    if (c9 != 'h') {
                                                        if (c9 != 'q') {
                                                            if (c9 != 'v') {
                                                                if (c9 != 'L') {
                                                                    if (c9 != 'M') {
                                                                        if (c9 != 'S') {
                                                                            if (c9 != 'T') {
                                                                                if (c9 != 'l') {
                                                                                    if (c9 != c7) {
                                                                                        if (c9 != 's') {
                                                                                            if (c9 == 't') {
                                                                                                if (c8 != 'q' && c8 != 't' && c8 != 'Q' && c8 != 'T') {
                                                                                                    f26 = 0.0f;
                                                                                                    f25 = 0.0f;
                                                                                                } else {
                                                                                                    f25 = f35 - f29;
                                                                                                    f26 = f36 - f30;
                                                                                                }
                                                                                                int i13 = i12 + 0;
                                                                                                int i14 = i12 + 1;
                                                                                                path.rQuadTo(f25, f26, fArr2[i13], fArr2[i14]);
                                                                                                float f37 = f25 + f35;
                                                                                                float f38 = f26 + f36;
                                                                                                f35 += fArr2[i13];
                                                                                                f36 += fArr2[i14];
                                                                                                f30 = f38;
                                                                                                f29 = f37;
                                                                                            }
                                                                                            i7 = i12;
                                                                                        } else {
                                                                                            if (c8 != 'c' && c8 != 's' && c8 != 'C' && c8 != 'S') {
                                                                                                f23 = 0.0f;
                                                                                                f24 = 0.0f;
                                                                                            } else {
                                                                                                float f39 = f35 - f29;
                                                                                                f23 = f36 - f30;
                                                                                                f24 = f39;
                                                                                            }
                                                                                            int i15 = i12 + 0;
                                                                                            int i16 = i12 + 1;
                                                                                            int i17 = i12 + 2;
                                                                                            int i18 = i12 + 3;
                                                                                            i7 = i12;
                                                                                            f8 = f36;
                                                                                            float f40 = f35;
                                                                                            path.rCubicTo(f24, f23, fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                                                                                            f9 = fArr2[i15] + f40;
                                                                                            f10 = fArr2[i16] + f8;
                                                                                            f11 = f40 + fArr2[i17];
                                                                                            f12 = fArr2[i18];
                                                                                        }
                                                                                    } else {
                                                                                        i7 = i12;
                                                                                        float f41 = fArr2[i7 + 0];
                                                                                        f35 += f41;
                                                                                        float f42 = fArr2[i7 + 1];
                                                                                        f36 += f42;
                                                                                        if (i7 > 0) {
                                                                                            path.rLineTo(f41, f42);
                                                                                        } else {
                                                                                            path.rMoveTo(f41, f42);
                                                                                            f34 = f36;
                                                                                            f33 = f35;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    i7 = i12;
                                                                                    f15 = f36;
                                                                                    int i19 = i7 + 0;
                                                                                    float f43 = fArr2[i19];
                                                                                    int i20 = i7 + 1;
                                                                                    path.rLineTo(f43, fArr2[i20]);
                                                                                    f35 += fArr2[i19];
                                                                                    f16 = fArr2[i20];
                                                                                }
                                                                            } else {
                                                                                i7 = i12;
                                                                                float f44 = f36;
                                                                                float f45 = f35;
                                                                                if (c8 != 'q' && c8 != 't' && c8 != 'Q' && c8 != 'T') {
                                                                                    f21 = f45;
                                                                                    f22 = f44;
                                                                                } else {
                                                                                    f21 = (f45 * 2.0f) - f29;
                                                                                    f22 = (f44 * 2.0f) - f30;
                                                                                }
                                                                                int i21 = i7 + 0;
                                                                                int i22 = i7 + 1;
                                                                                path.quadTo(f21, f22, fArr2[i21], fArr2[i22]);
                                                                                f30 = f22;
                                                                                f29 = f21;
                                                                                c6 = c9;
                                                                                aVar = aVar2;
                                                                                i8 = i11;
                                                                                f35 = fArr2[i21];
                                                                                f36 = fArr2[i22];
                                                                            }
                                                                        } else {
                                                                            i7 = i12;
                                                                            float f46 = f36;
                                                                            float f47 = f35;
                                                                            if (c8 != 'c' && c8 != 's' && c8 != 'C' && c8 != 'S') {
                                                                                f20 = f47;
                                                                                f19 = f46;
                                                                            } else {
                                                                                f19 = (f46 * 2.0f) - f30;
                                                                                f20 = (f47 * 2.0f) - f29;
                                                                            }
                                                                            int i23 = i7 + 0;
                                                                            int i24 = i7 + 1;
                                                                            int i25 = i7 + 2;
                                                                            int i26 = i7 + 3;
                                                                            path.cubicTo(f20, f19, fArr2[i23], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                                            float f48 = fArr2[i23];
                                                                            float f49 = fArr2[i24];
                                                                            f14 = fArr2[i25];
                                                                            f13 = fArr2[i26];
                                                                            f29 = f48;
                                                                            f30 = f49;
                                                                            f35 = f14;
                                                                            f36 = f13;
                                                                        }
                                                                    } else {
                                                                        i7 = i12;
                                                                        f17 = fArr2[i7 + 0];
                                                                        f18 = fArr2[i7 + 1];
                                                                        if (i7 > 0) {
                                                                            path.lineTo(f17, f18);
                                                                        } else {
                                                                            path.moveTo(f17, f18);
                                                                            f33 = f17;
                                                                            f34 = f18;
                                                                        }
                                                                    }
                                                                    f35 = f33;
                                                                    f36 = f34;
                                                                } else {
                                                                    i7 = i12;
                                                                    int i27 = i7 + 0;
                                                                    int i28 = i7 + 1;
                                                                    path.lineTo(fArr2[i27], fArr2[i28]);
                                                                    f17 = fArr2[i27];
                                                                    f18 = fArr2[i28];
                                                                }
                                                                f35 = f17;
                                                                f36 = f18;
                                                            } else {
                                                                i7 = i12;
                                                                f15 = f36;
                                                                int i29 = i7 + 0;
                                                                path.rLineTo(0.0f, fArr2[i29]);
                                                                f16 = fArr2[i29];
                                                            }
                                                            f36 = f15 + f16;
                                                        } else {
                                                            i7 = i12;
                                                            f8 = f36;
                                                            float f50 = f35;
                                                            int i30 = i7 + 0;
                                                            float f51 = fArr2[i30];
                                                            int i31 = i7 + 1;
                                                            int i32 = i7 + 2;
                                                            int i33 = i7 + 3;
                                                            path.rQuadTo(f51, fArr2[i31], fArr2[i32], fArr2[i33]);
                                                            f9 = fArr2[i30] + f50;
                                                            f10 = fArr2[i31] + f8;
                                                            float f52 = f50 + fArr2[i32];
                                                            float f53 = fArr2[i33];
                                                            f11 = f52;
                                                            f12 = f53;
                                                        }
                                                    } else {
                                                        i7 = i12;
                                                        int i34 = i7 + 0;
                                                        path.rLineTo(fArr2[i34], 0.0f);
                                                        f35 += fArr2[i34];
                                                    }
                                                    c6 = c9;
                                                    aVar = aVar2;
                                                    i8 = i11;
                                                } else {
                                                    i7 = i12;
                                                    f8 = f36;
                                                    float f54 = f35;
                                                    int i35 = i7 + 2;
                                                    int i36 = i7 + 3;
                                                    int i37 = i7 + 4;
                                                    int i38 = i7 + 5;
                                                    path.rCubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                                                    f9 = fArr2[i35] + f54;
                                                    f10 = fArr2[i36] + f8;
                                                    f11 = f54 + fArr2[i37];
                                                    f12 = fArr2[i38];
                                                }
                                                f13 = f8 + f12;
                                                f29 = f9;
                                                f30 = f10;
                                                f14 = f11;
                                                f35 = f14;
                                                f36 = f13;
                                                c6 = c9;
                                                aVar = aVar2;
                                                i8 = i11;
                                            } else {
                                                i7 = i12;
                                                float f55 = f36;
                                                float f56 = f35;
                                                int i39 = i7 + 5;
                                                float f57 = fArr2[i39] + f56;
                                                int i40 = i7 + 6;
                                                float f58 = fArr2[i40] + f55;
                                                float f59 = fArr2[i7 + 0];
                                                float f60 = fArr2[i7 + 1];
                                                float f61 = fArr2[i7 + 2];
                                                if (fArr2[i7 + 3] != 0.0f) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (fArr2[i7 + 4] != 0.0f) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                c6 = c9;
                                                aVar = aVar2;
                                                i8 = i11;
                                                a(path, f56, f55, f57, f58, f59, f60, f61, z7, z8);
                                                f35 = f56 + fArr2[i39];
                                                f36 = f55 + fArr2[i40];
                                            }
                                        } else {
                                            i7 = i12;
                                            c6 = c9;
                                            aVar = aVar2;
                                            i8 = i11;
                                            int i41 = i7 + 0;
                                            path.lineTo(f35, fArr2[i41]);
                                            f36 = fArr2[i41];
                                        }
                                    } else {
                                        i7 = i12;
                                        c6 = c9;
                                        aVar = aVar2;
                                        i8 = i11;
                                        int i42 = i7 + 0;
                                        int i43 = i7 + 1;
                                        int i44 = i7 + 2;
                                        int i45 = i7 + 3;
                                        path.quadTo(fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                                        f6 = fArr2[i42];
                                        f7 = fArr2[i43];
                                        f35 = fArr2[i44];
                                        f36 = fArr2[i45];
                                    }
                                } else {
                                    i7 = i12;
                                    c6 = c9;
                                    aVar = aVar2;
                                    i8 = i11;
                                    int i46 = i7 + 0;
                                    path.lineTo(fArr2[i46], f36);
                                    f35 = fArr2[i46];
                                }
                                i12 = i7 + i6;
                                aVar2 = aVar;
                                c8 = c6;
                                c9 = c8;
                                i11 = i8;
                                c7 = 'm';
                                i10 = 0;
                            } else {
                                i7 = i12;
                                c6 = c9;
                                aVar = aVar2;
                                i8 = i11;
                                int i47 = i7 + 2;
                                int i48 = i7 + 3;
                                int i49 = i7 + 4;
                                int i50 = i7 + 5;
                                path.cubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i47], fArr2[i48], fArr2[i49], fArr2[i50]);
                                float f62 = fArr2[i49];
                                float f63 = fArr2[i50];
                                f6 = fArr2[i47];
                                f35 = f62;
                                f36 = f63;
                                f7 = fArr2[i48];
                            }
                            f29 = f6;
                            f30 = f7;
                            i12 = i7 + i6;
                            aVar2 = aVar;
                            c8 = c6;
                            c9 = c8;
                            i11 = i8;
                            c7 = 'm';
                            i10 = 0;
                        } else {
                            i7 = i12;
                            float f64 = f36;
                            float f65 = f35;
                            c6 = c9;
                            aVar = aVar2;
                            i8 = i11;
                            int i51 = i7 + 5;
                            float f66 = fArr2[i51];
                            int i52 = i7 + 6;
                            float f67 = fArr2[i52];
                            float f68 = fArr2[i7 + 0];
                            float f69 = fArr2[i7 + 1];
                            float f70 = fArr2[i7 + 2];
                            if (fArr2[i7 + 3] != 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (fArr2[i7 + 4] != 0.0f) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            a(path, f65, f64, f66, f67, f68, f69, f70, z5, z6);
                            f35 = fArr2[i51];
                            f36 = fArr2[i52];
                        }
                        f30 = f36;
                        f29 = f35;
                        i12 = i7 + i6;
                        aVar2 = aVar;
                        c8 = c6;
                        c9 = c8;
                        i11 = i8;
                        c7 = 'm';
                        i10 = 0;
                    }
                }
                int i53 = i11;
                int i54 = i10;
                fArr[i54] = f35;
                fArr[1] = f36;
                fArr[2] = f29;
                fArr[3] = f30;
                fArr[4] = f33;
                fArr[5] = f34;
                i11 = i53 + 1;
                i9 = 6;
                c7 = 'm';
                i10 = i54;
                c8 = aVarArr[i53].f6728a;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            a aVar = aVarArr[i6];
            char c6 = aVar.f6728a;
            a aVar2 = aVarArr2[i6];
            if (c6 != aVar2.f6728a || aVar.f6729b.length != aVar2.f6729b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i6) {
        if (i6 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i7 = i6 - 0;
                int min = Math.min(i7, length - 0);
                float[] fArr2 = new float[i7];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if (r13 == 0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:49:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y.d.a[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.d.c(java.lang.String):y.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c6 = c(str);
        if (c6 != null) {
            try {
                a.b(c6, path);
                return path;
            } catch (RuntimeException e6) {
                throw new RuntimeException("Error in parsing " + str, e6);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            aVarArr2[i6] = new a(aVarArr[i6]);
        }
        return aVarArr2;
    }
}
