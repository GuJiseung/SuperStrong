package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1101d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f1102e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f1103f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, r.a> f1104a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1105b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, a> f1106c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1107a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1108b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1109c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0009b f1110d = new C0009b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1111e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, r.a> f1112f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0008a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1113a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1114b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1115c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1116d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1117e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1118f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1119g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1120h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1121i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1122j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1123k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1124l = 0;

            public final void a(int i6, float f6) {
                int i7 = this.f1118f;
                int[] iArr = this.f1116d;
                if (i7 >= iArr.length) {
                    this.f1116d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1117e;
                    this.f1117e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1116d;
                int i8 = this.f1118f;
                iArr2[i8] = i6;
                float[] fArr2 = this.f1117e;
                this.f1118f = i8 + 1;
                fArr2[i8] = f6;
            }

            public final void b(int i6, int i7) {
                int i8 = this.f1115c;
                int[] iArr = this.f1113a;
                if (i8 >= iArr.length) {
                    this.f1113a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1114b;
                    this.f1114b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1113a;
                int i9 = this.f1115c;
                iArr3[i9] = i6;
                int[] iArr4 = this.f1114b;
                this.f1115c = i9 + 1;
                iArr4[i9] = i7;
            }

            public final void c(int i6, boolean z5) {
                int i7 = this.f1124l;
                int[] iArr = this.f1122j;
                if (i7 >= iArr.length) {
                    this.f1122j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1123k;
                    this.f1123k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1122j;
                int i8 = this.f1124l;
                iArr2[i8] = i6;
                boolean[] zArr2 = this.f1123k;
                this.f1124l = i8 + 1;
                zArr2[i8] = z5;
            }

            public final void d(String str, int i6) {
                int i7 = this.f1121i;
                int[] iArr = this.f1119g;
                if (i7 >= iArr.length) {
                    this.f1119g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1120h;
                    this.f1120h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1119g;
                int i8 = this.f1121i;
                iArr2[i8] = i6;
                String[] strArr2 = this.f1120h;
                this.f1121i = i8 + 1;
                strArr2[i8] = str;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0009b c0009b = this.f1110d;
            aVar.f1051e = c0009b.f1140h;
            aVar.f1053f = c0009b.f1142i;
            aVar.f1055g = c0009b.f1144j;
            aVar.f1057h = c0009b.f1146k;
            aVar.f1059i = c0009b.f1148l;
            aVar.f1061j = c0009b.f1150m;
            aVar.f1063k = c0009b.f1152n;
            aVar.f1065l = c0009b.f1154o;
            aVar.f1067m = c0009b.f1156p;
            aVar.f1069n = c0009b.f1157q;
            aVar.f1071o = c0009b.f1158r;
            aVar.s = c0009b.s;
            aVar.f1078t = c0009b.f1159t;
            aVar.u = c0009b.u;
            aVar.f1079v = c0009b.f1160v;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = c0009b.F;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = c0009b.G;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = c0009b.H;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = c0009b.I;
            aVar.A = c0009b.R;
            aVar.B = c0009b.Q;
            aVar.f1081x = c0009b.N;
            aVar.f1083z = c0009b.P;
            aVar.E = c0009b.f1161w;
            aVar.F = c0009b.f1162x;
            aVar.f1073p = c0009b.f1164z;
            aVar.f1075q = c0009b.A;
            aVar.f1077r = c0009b.B;
            aVar.G = c0009b.f1163y;
            aVar.T = c0009b.C;
            aVar.U = c0009b.D;
            aVar.I = c0009b.T;
            aVar.H = c0009b.U;
            aVar.K = c0009b.W;
            aVar.J = c0009b.V;
            aVar.W = c0009b.f1149l0;
            aVar.X = c0009b.f1151m0;
            aVar.L = c0009b.X;
            aVar.M = c0009b.Y;
            aVar.P = c0009b.Z;
            aVar.Q = c0009b.f1127a0;
            aVar.N = c0009b.f1129b0;
            aVar.O = c0009b.f1131c0;
            aVar.R = c0009b.f1133d0;
            aVar.S = c0009b.f1135e0;
            aVar.V = c0009b.E;
            aVar.f1047c = c0009b.f1136f;
            aVar.f1043a = c0009b.f1132d;
            aVar.f1045b = c0009b.f1134e;
            ((ViewGroup.MarginLayoutParams) aVar).width = c0009b.f1128b;
            ((ViewGroup.MarginLayoutParams) aVar).height = c0009b.f1130c;
            String str = c0009b.f1147k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = c0009b.f1155o0;
            aVar.setMarginStart(c0009b.K);
            aVar.setMarginEnd(c0009b.J);
            aVar.a();
        }

        public final void b(int i6, ConstraintLayout.a aVar) {
            this.f1107a = i6;
            int i7 = aVar.f1051e;
            C0009b c0009b = this.f1110d;
            c0009b.f1140h = i7;
            c0009b.f1142i = aVar.f1053f;
            c0009b.f1144j = aVar.f1055g;
            c0009b.f1146k = aVar.f1057h;
            c0009b.f1148l = aVar.f1059i;
            c0009b.f1150m = aVar.f1061j;
            c0009b.f1152n = aVar.f1063k;
            c0009b.f1154o = aVar.f1065l;
            c0009b.f1156p = aVar.f1067m;
            c0009b.f1157q = aVar.f1069n;
            c0009b.f1158r = aVar.f1071o;
            c0009b.s = aVar.s;
            c0009b.f1159t = aVar.f1078t;
            c0009b.u = aVar.u;
            c0009b.f1160v = aVar.f1079v;
            c0009b.f1161w = aVar.E;
            c0009b.f1162x = aVar.F;
            c0009b.f1163y = aVar.G;
            c0009b.f1164z = aVar.f1073p;
            c0009b.A = aVar.f1075q;
            c0009b.B = aVar.f1077r;
            c0009b.C = aVar.T;
            c0009b.D = aVar.U;
            c0009b.E = aVar.V;
            c0009b.f1136f = aVar.f1047c;
            c0009b.f1132d = aVar.f1043a;
            c0009b.f1134e = aVar.f1045b;
            c0009b.f1128b = ((ViewGroup.MarginLayoutParams) aVar).width;
            c0009b.f1130c = ((ViewGroup.MarginLayoutParams) aVar).height;
            c0009b.F = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            c0009b.G = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            c0009b.H = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            c0009b.I = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            c0009b.L = aVar.D;
            c0009b.T = aVar.I;
            c0009b.U = aVar.H;
            c0009b.W = aVar.K;
            c0009b.V = aVar.J;
            c0009b.f1149l0 = aVar.W;
            c0009b.f1151m0 = aVar.X;
            c0009b.X = aVar.L;
            c0009b.Y = aVar.M;
            c0009b.Z = aVar.P;
            c0009b.f1127a0 = aVar.Q;
            c0009b.f1129b0 = aVar.N;
            c0009b.f1131c0 = aVar.O;
            c0009b.f1133d0 = aVar.R;
            c0009b.f1135e0 = aVar.S;
            c0009b.f1147k0 = aVar.Y;
            c0009b.N = aVar.f1081x;
            c0009b.P = aVar.f1083z;
            c0009b.M = aVar.f1080w;
            c0009b.O = aVar.f1082y;
            c0009b.R = aVar.A;
            c0009b.Q = aVar.B;
            c0009b.S = aVar.C;
            c0009b.f1155o0 = aVar.Z;
            c0009b.J = aVar.getMarginEnd();
            c0009b.K = aVar.getMarginStart();
        }

        public final void c(int i6, c.a aVar) {
            b(i6, aVar);
            this.f1108b.f1177c = aVar.r0;
            float f6 = aVar.f1196u0;
            e eVar = this.f1111e;
            eVar.f1180a = f6;
            eVar.f1181b = aVar.f1197v0;
            eVar.f1182c = aVar.w0;
            eVar.f1183d = aVar.f1198x0;
            eVar.f1184e = aVar.f1199y0;
            eVar.f1185f = aVar.f1200z0;
            eVar.f1186g = aVar.A0;
            eVar.f1188i = aVar.B0;
            eVar.f1189j = aVar.C0;
            eVar.f1190k = aVar.D0;
            eVar.f1192m = aVar.f1195t0;
            eVar.f1191l = aVar.f1194s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0009b c0009b = aVar.f1110d;
            c0009b.getClass();
            C0009b c0009b2 = this.f1110d;
            c0009b.f1126a = c0009b2.f1126a;
            c0009b.f1128b = c0009b2.f1128b;
            c0009b.f1130c = c0009b2.f1130c;
            c0009b.f1132d = c0009b2.f1132d;
            c0009b.f1134e = c0009b2.f1134e;
            c0009b.f1136f = c0009b2.f1136f;
            c0009b.f1138g = c0009b2.f1138g;
            c0009b.f1140h = c0009b2.f1140h;
            c0009b.f1142i = c0009b2.f1142i;
            c0009b.f1144j = c0009b2.f1144j;
            c0009b.f1146k = c0009b2.f1146k;
            c0009b.f1148l = c0009b2.f1148l;
            c0009b.f1150m = c0009b2.f1150m;
            c0009b.f1152n = c0009b2.f1152n;
            c0009b.f1154o = c0009b2.f1154o;
            c0009b.f1156p = c0009b2.f1156p;
            c0009b.f1157q = c0009b2.f1157q;
            c0009b.f1158r = c0009b2.f1158r;
            c0009b.s = c0009b2.s;
            c0009b.f1159t = c0009b2.f1159t;
            c0009b.u = c0009b2.u;
            c0009b.f1160v = c0009b2.f1160v;
            c0009b.f1161w = c0009b2.f1161w;
            c0009b.f1162x = c0009b2.f1162x;
            c0009b.f1163y = c0009b2.f1163y;
            c0009b.f1164z = c0009b2.f1164z;
            c0009b.A = c0009b2.A;
            c0009b.B = c0009b2.B;
            c0009b.C = c0009b2.C;
            c0009b.D = c0009b2.D;
            c0009b.E = c0009b2.E;
            c0009b.F = c0009b2.F;
            c0009b.G = c0009b2.G;
            c0009b.H = c0009b2.H;
            c0009b.I = c0009b2.I;
            c0009b.J = c0009b2.J;
            c0009b.K = c0009b2.K;
            c0009b.L = c0009b2.L;
            c0009b.M = c0009b2.M;
            c0009b.N = c0009b2.N;
            c0009b.O = c0009b2.O;
            c0009b.P = c0009b2.P;
            c0009b.Q = c0009b2.Q;
            c0009b.R = c0009b2.R;
            c0009b.S = c0009b2.S;
            c0009b.T = c0009b2.T;
            c0009b.U = c0009b2.U;
            c0009b.V = c0009b2.V;
            c0009b.W = c0009b2.W;
            c0009b.X = c0009b2.X;
            c0009b.Y = c0009b2.Y;
            c0009b.Z = c0009b2.Z;
            c0009b.f1127a0 = c0009b2.f1127a0;
            c0009b.f1129b0 = c0009b2.f1129b0;
            c0009b.f1131c0 = c0009b2.f1131c0;
            c0009b.f1133d0 = c0009b2.f1133d0;
            c0009b.f1135e0 = c0009b2.f1135e0;
            c0009b.f1137f0 = c0009b2.f1137f0;
            c0009b.f1139g0 = c0009b2.f1139g0;
            c0009b.f1141h0 = c0009b2.f1141h0;
            c0009b.f1147k0 = c0009b2.f1147k0;
            int[] iArr = c0009b2.f1143i0;
            if (iArr != null && c0009b2.f1145j0 == null) {
                c0009b.f1143i0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                c0009b.f1143i0 = null;
            }
            c0009b.f1145j0 = c0009b2.f1145j0;
            c0009b.f1149l0 = c0009b2.f1149l0;
            c0009b.f1151m0 = c0009b2.f1151m0;
            c0009b.f1153n0 = c0009b2.f1153n0;
            c0009b.f1155o0 = c0009b2.f1155o0;
            c cVar = aVar.f1109c;
            cVar.getClass();
            c cVar2 = this.f1109c;
            cVar2.getClass();
            cVar.f1166a = cVar2.f1166a;
            cVar.f1168c = cVar2.f1168c;
            cVar.f1170e = cVar2.f1170e;
            cVar.f1169d = cVar2.f1169d;
            d dVar = aVar.f1108b;
            dVar.getClass();
            d dVar2 = this.f1108b;
            dVar2.getClass();
            dVar.f1175a = dVar2.f1175a;
            dVar.f1177c = dVar2.f1177c;
            dVar.f1178d = dVar2.f1178d;
            dVar.f1176b = dVar2.f1176b;
            e eVar = aVar.f1111e;
            eVar.getClass();
            e eVar2 = this.f1111e;
            eVar2.getClass();
            eVar.f1180a = eVar2.f1180a;
            eVar.f1181b = eVar2.f1181b;
            eVar.f1182c = eVar2.f1182c;
            eVar.f1183d = eVar2.f1183d;
            eVar.f1184e = eVar2.f1184e;
            eVar.f1185f = eVar2.f1185f;
            eVar.f1186g = eVar2.f1186g;
            eVar.f1187h = eVar2.f1187h;
            eVar.f1188i = eVar2.f1188i;
            eVar.f1189j = eVar2.f1189j;
            eVar.f1190k = eVar2.f1190k;
            eVar.f1191l = eVar2.f1191l;
            eVar.f1192m = eVar2.f1192m;
            aVar.f1107a = this.f1107a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0009b {

        /* renamed from: p0  reason: collision with root package name */
        public static final SparseIntArray f1125p0;

        /* renamed from: b  reason: collision with root package name */
        public int f1128b;

        /* renamed from: c  reason: collision with root package name */
        public int f1130c;

        /* renamed from: i0  reason: collision with root package name */
        public int[] f1143i0;

        /* renamed from: j0  reason: collision with root package name */
        public String f1145j0;

        /* renamed from: k0  reason: collision with root package name */
        public String f1147k0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1126a = false;

        /* renamed from: d  reason: collision with root package name */
        public int f1132d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f1134e = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f1136f = -1.0f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1138g = true;

        /* renamed from: h  reason: collision with root package name */
        public int f1140h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1142i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f1144j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f1146k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f1148l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1150m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1152n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1154o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1156p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1157q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1158r = -1;
        public int s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1159t = -1;
        public int u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1160v = -1;

        /* renamed from: w  reason: collision with root package name */
        public float f1161w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public float f1162x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public String f1163y = null;

        /* renamed from: z  reason: collision with root package name */
        public int f1164z = -1;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public int f1127a0 = 0;

        /* renamed from: b0  reason: collision with root package name */
        public int f1129b0 = 0;

        /* renamed from: c0  reason: collision with root package name */
        public int f1131c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public float f1133d0 = 1.0f;

        /* renamed from: e0  reason: collision with root package name */
        public float f1135e0 = 1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f1137f0 = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f1139g0 = 0;

        /* renamed from: h0  reason: collision with root package name */
        public int f1141h0 = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f1149l0 = false;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1151m0 = false;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1153n0 = true;

        /* renamed from: o0  reason: collision with root package name */
        public int f1155o0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1125p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2644g);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                SparseIntArray sparseIntArray = f1125p0;
                int i7 = sparseIntArray.get(index);
                switch (i7) {
                    case 1:
                        this.f1156p = b.g(obtainStyledAttributes, index, this.f1156p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f1154o = b.g(obtainStyledAttributes, index, this.f1154o);
                        break;
                    case 4:
                        this.f1152n = b.g(obtainStyledAttributes, index, this.f1152n);
                        break;
                    case 5:
                        this.f1163y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1160v = b.g(obtainStyledAttributes, index, this.f1160v);
                        break;
                    case 10:
                        this.u = b.g(obtainStyledAttributes, index, this.u);
                        break;
                    case 11:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1132d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1132d);
                        break;
                    case 18:
                        this.f1134e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1134e);
                        break;
                    case 19:
                        this.f1136f = obtainStyledAttributes.getFloat(index, this.f1136f);
                        break;
                    case 20:
                        this.f1161w = obtainStyledAttributes.getFloat(index, this.f1161w);
                        break;
                    case 21:
                        this.f1130c = obtainStyledAttributes.getLayoutDimension(index, this.f1130c);
                        break;
                    case 22:
                        this.f1128b = obtainStyledAttributes.getLayoutDimension(index, this.f1128b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1140h = b.g(obtainStyledAttributes, index, this.f1140h);
                        break;
                    case 25:
                        this.f1142i = b.g(obtainStyledAttributes, index, this.f1142i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1144j = b.g(obtainStyledAttributes, index, this.f1144j);
                        break;
                    case 29:
                        this.f1146k = b.g(obtainStyledAttributes, index, this.f1146k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.s = b.g(obtainStyledAttributes, index, this.s);
                        break;
                    case 32:
                        this.f1159t = b.g(obtainStyledAttributes, index, this.f1159t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.f1150m = b.g(obtainStyledAttributes, index, this.f1150m);
                        break;
                    case 35:
                        this.f1148l = b.g(obtainStyledAttributes, index, this.f1148l);
                        break;
                    case 36:
                        this.f1162x = obtainStyledAttributes.getFloat(index, this.f1162x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.h(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.h(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i7) {
                            case 61:
                                this.f1164z = b.g(obtainStyledAttributes, index, this.f1164z);
                                continue;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                continue;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                continue;
                            default:
                                switch (i7) {
                                    case 69:
                                        this.f1133d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1135e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1137f0 = obtainStyledAttributes.getInt(index, this.f1137f0);
                                        break;
                                    case 73:
                                        this.f1139g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1139g0);
                                        break;
                                    case 74:
                                        this.f1145j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1153n0 = obtainStyledAttributes.getBoolean(index, this.f1153n0);
                                        break;
                                    case 76:
                                        this.f1155o0 = obtainStyledAttributes.getInt(index, this.f1155o0);
                                        break;
                                    case 77:
                                        this.f1157q = b.g(obtainStyledAttributes, index, this.f1157q);
                                        break;
                                    case 78:
                                        this.f1158r = b.g(obtainStyledAttributes, index, this.f1158r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f1127a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1127a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f1131c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1131c0);
                                        break;
                                    case 86:
                                        this.f1129b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1129b0);
                                        break;
                                    case 87:
                                        this.f1149l0 = obtainStyledAttributes.getBoolean(index, this.f1149l0);
                                        break;
                                    case 88:
                                        this.f1151m0 = obtainStyledAttributes.getBoolean(index, this.f1151m0);
                                        break;
                                    case 89:
                                        this.f1147k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1138g = obtainStyledAttributes.getBoolean(index, this.f1138g);
                                        break;
                                    case 91:
                                        sb = new StringBuilder("unused attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                    default:
                                        sb = new StringBuilder("Unknown attribute 0x");
                                        sb.append(Integer.toHexString(index));
                                        sb.append("   ");
                                        sb.append(sparseIntArray.get(index));
                                        Log.w("ConstraintSet", sb.toString());
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: j  reason: collision with root package name */
        public static final SparseIntArray f1165j;

        /* renamed from: a  reason: collision with root package name */
        public int f1166a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1167b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1168c = -1;

        /* renamed from: d  reason: collision with root package name */
        public float f1169d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f1170e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f1171f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f1172g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f1173h = null;

        /* renamed from: i  reason: collision with root package name */
        public int f1174i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1165j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2645h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1165j.get(index)) {
                    case 1:
                        this.f1170e = obtainStyledAttributes.getFloat(index, this.f1170e);
                        break;
                    case 2:
                        this.f1168c = obtainStyledAttributes.getInt(index, this.f1168c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            String str = n.a.f5368b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1166a = b.g(obtainStyledAttributes, index, this.f1166a);
                        break;
                    case 6:
                        this.f1167b = obtainStyledAttributes.getInteger(index, this.f1167b);
                        break;
                    case 7:
                        this.f1169d = obtainStyledAttributes.getFloat(index, this.f1169d);
                        break;
                    case 8:
                        this.f1172g = obtainStyledAttributes.getInteger(index, this.f1172g);
                        break;
                    case 9:
                        this.f1171f = obtainStyledAttributes.getFloat(index, this.f1171f);
                        break;
                    case 10:
                        int i7 = obtainStyledAttributes.peekValue(index).type;
                        if (i7 != 1) {
                            if (i7 == 3) {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1173h = string;
                                if (string.indexOf("/") <= 0) {
                                    break;
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index, this.f1174i);
                                break;
                            }
                        }
                        this.f1174i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1175a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1176b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f1177c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1178d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2647j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.f1177c = obtainStyledAttributes.getFloat(index, this.f1177c);
                } else if (index == 0) {
                    int i7 = obtainStyledAttributes.getInt(index, this.f1175a);
                    this.f1175a = i7;
                    this.f1175a = b.f1101d[i7];
                } else if (index == 4) {
                    this.f1176b = obtainStyledAttributes.getInt(index, this.f1176b);
                } else if (index == 3) {
                    this.f1178d = obtainStyledAttributes.getFloat(index, this.f1178d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static final SparseIntArray f1179n;

        /* renamed from: a  reason: collision with root package name */
        public float f1180a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1181b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1182c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1183d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1184e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1185f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f1186g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1187h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1188i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f1189j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1190k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1191l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f1192m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1179n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2649l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1179n.get(index)) {
                    case 1:
                        this.f1180a = obtainStyledAttributes.getFloat(index, this.f1180a);
                        break;
                    case 2:
                        this.f1181b = obtainStyledAttributes.getFloat(index, this.f1181b);
                        break;
                    case 3:
                        this.f1182c = obtainStyledAttributes.getFloat(index, this.f1182c);
                        break;
                    case 4:
                        this.f1183d = obtainStyledAttributes.getFloat(index, this.f1183d);
                        break;
                    case 5:
                        this.f1184e = obtainStyledAttributes.getFloat(index, this.f1184e);
                        break;
                    case 6:
                        this.f1185f = obtainStyledAttributes.getDimension(index, this.f1185f);
                        break;
                    case 7:
                        this.f1186g = obtainStyledAttributes.getDimension(index, this.f1186g);
                        break;
                    case 8:
                        this.f1188i = obtainStyledAttributes.getDimension(index, this.f1188i);
                        break;
                    case 9:
                        this.f1189j = obtainStyledAttributes.getDimension(index, this.f1189j);
                        break;
                    case 10:
                        this.f1190k = obtainStyledAttributes.getDimension(index, this.f1190k);
                        break;
                    case 11:
                        this.f1191l = true;
                        this.f1192m = obtainStyledAttributes.getDimension(index, this.f1192m);
                        break;
                    case 12:
                        this.f1187h = b.g(obtainStyledAttributes, index, this.f1187h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1102e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1103f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] d(Barrier barrier, String str) {
        int i6;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < split.length) {
            String trim = split[i7].trim();
            Integer num = null;
            try {
                i6 = r.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i6 = 0;
            }
            if (i6 == 0) {
                i6 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i6 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f1040n) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f1040n.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i6 = num.intValue();
                }
            }
            iArr[i8] = i6;
            i7++;
            i8++;
        }
        if (i8 != split.length) {
            return Arrays.copyOf(iArr, i8);
        }
        return iArr;
    }

    public static a e(Context context, AttributeSet attributeSet, boolean z5) {
        String str;
        int i6;
        String[] strArr;
        int dimensionPixelSize;
        int i7;
        int i8;
        float f6;
        int i9;
        int i10;
        boolean z6;
        int i11;
        int i12;
        String str2;
        a.C0008a c0008a;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5 ? c.a.f2641d : c.a.f2639b);
        String[] strArr2 = n.a.f5368b;
        int[] iArr = f1101d;
        SparseIntArray sparseIntArray = f1102e;
        d dVar = aVar.f1108b;
        e eVar = aVar.f1111e;
        c cVar = aVar.f1109c;
        C0009b c0009b = aVar.f1110d;
        String str3 = "unused attribute 0x";
        if (z5) {
            int indexCount = obtainStyledAttributes.getIndexCount();
            String str4 = "Unknown attribute 0x";
            a.C0008a c0008a2 = new a.C0008a();
            cVar.getClass();
            c0009b.getClass();
            dVar.getClass();
            eVar.getClass();
            int i13 = 0;
            while (i13 < indexCount) {
                int i14 = indexCount;
                int index = obtainStyledAttributes.getIndex(i13);
                int i15 = i13;
                switch (f1103f.get(index)) {
                    case 2:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.I);
                        i7 = 2;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        strArr = strArr2;
                        str2 = str4;
                        StringBuilder sb = new StringBuilder(str2);
                        c0008a = c0008a2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        continue;
                        indexCount = i14;
                        c0008a2 = c0008a;
                        str4 = str2;
                        i13 = i15 + 1;
                        strArr2 = strArr;
                    case 5:
                        strArr = strArr2;
                        i8 = 5;
                        c0008a2.d(obtainStyledAttributes.getString(index), i8);
                        break;
                    case 6:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0009b.C);
                        i7 = 6;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 7:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0009b.D);
                        i7 = 7;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 8:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.J);
                        i7 = 8;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 11:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.P);
                        i7 = 11;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 12:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.Q);
                        i7 = 12;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 13:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.M);
                        i7 = 13;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 14:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.O);
                        i7 = 14;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 15:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.R);
                        i7 = 15;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 16:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.N);
                        i7 = 16;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 17:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0009b.f1132d);
                        i7 = 17;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 18:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelOffset(index, c0009b.f1134e);
                        i7 = 18;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 19:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.f1136f);
                        i9 = 19;
                        c0008a2.a(i9, f6);
                        break;
                    case 20:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.f1161w);
                        i9 = 20;
                        c0008a2.a(i9, f6);
                        break;
                    case 21:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0009b.f1130c);
                        i7 = 21;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 22:
                        strArr = strArr2;
                        dimensionPixelSize = iArr[obtainStyledAttributes.getInt(index, dVar.f1175a)];
                        i7 = 22;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 23:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getLayoutDimension(index, c0009b.f1128b);
                        i7 = 23;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 24:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.F);
                        i7 = 24;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 27:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.E);
                        i7 = 27;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 28:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.G);
                        i7 = 28;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 31:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.K);
                        i7 = 31;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 34:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.H);
                        i7 = 34;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 37:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.f1162x);
                        i9 = 37;
                        c0008a2.a(i9, f6);
                        break;
                    case 38:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getResourceId(index, aVar.f1107a);
                        aVar.f1107a = dimensionPixelSize;
                        i7 = 38;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 39:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.U);
                        i9 = 39;
                        c0008a2.a(i9, f6);
                        break;
                    case 40:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.T);
                        i9 = 40;
                        c0008a2.a(i9, f6);
                        break;
                    case 41:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.V);
                        i7 = 41;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 42:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.W);
                        i7 = 42;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 43:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, dVar.f1177c);
                        i9 = 43;
                        c0008a2.a(i9, f6);
                        break;
                    case 44:
                        strArr = strArr2;
                        c0008a2.c(44, true);
                        c0008a2.a(44, obtainStyledAttributes.getDimension(index, eVar.f1192m));
                        break;
                    case 45:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, eVar.f1181b);
                        i9 = 45;
                        c0008a2.a(i9, f6);
                        break;
                    case 46:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, eVar.f1182c);
                        i9 = 46;
                        c0008a2.a(i9, f6);
                        break;
                    case 47:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, eVar.f1183d);
                        i9 = 47;
                        c0008a2.a(i9, f6);
                        break;
                    case 48:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, eVar.f1184e);
                        i9 = 48;
                        c0008a2.a(i9, f6);
                        break;
                    case 49:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getDimension(index, eVar.f1185f);
                        i9 = 49;
                        c0008a2.a(i9, f6);
                        break;
                    case 50:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getDimension(index, eVar.f1186g);
                        i9 = 50;
                        c0008a2.a(i9, f6);
                        break;
                    case 51:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getDimension(index, eVar.f1188i);
                        i9 = 51;
                        c0008a2.a(i9, f6);
                        break;
                    case 52:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getDimension(index, eVar.f1189j);
                        i9 = 52;
                        c0008a2.a(i9, f6);
                        break;
                    case 53:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getDimension(index, eVar.f1190k);
                        i9 = 53;
                        c0008a2.a(i9, f6);
                        break;
                    case 54:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.X);
                        i7 = 54;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 55:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.Y);
                        i7 = 55;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 56:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.Z);
                        i7 = 56;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 57:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.f1127a0);
                        i7 = 57;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 58:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.f1129b0);
                        i7 = 58;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 59:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.f1131c0);
                        i7 = 59;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 60:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, eVar.f1180a);
                        i9 = 60;
                        c0008a2.a(i9, f6);
                        break;
                    case 62:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.A);
                        i7 = 62;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 63:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, c0009b.B);
                        i9 = 63;
                        c0008a2.a(i9, f6);
                        break;
                    case 64:
                        strArr = strArr2;
                        dimensionPixelSize = g(obtainStyledAttributes, index, cVar.f1166a);
                        i7 = 64;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 65:
                        strArr = strArr2;
                        c0008a2.d(obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : strArr[obtainStyledAttributes.getInteger(index, 0)], 65);
                        break;
                    case 66:
                        strArr = strArr2;
                        c0008a2.b(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, cVar.f1170e);
                        i9 = 67;
                        c0008a2.a(i9, f6);
                        break;
                    case 68:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, dVar.f1178d);
                        i9 = 68;
                        c0008a2.a(i9, f6);
                        break;
                    case 69:
                        strArr = strArr2;
                        i10 = 69;
                        c0008a2.a(i10, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        strArr = strArr2;
                        i10 = 70;
                        c0008a2.a(i10, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        strArr = strArr2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.f1137f0);
                        i7 = 72;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 73:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.f1139g0);
                        i7 = 73;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 74:
                        strArr = strArr2;
                        i8 = 74;
                        c0008a2.d(obtainStyledAttributes.getString(index), i8);
                        break;
                    case 75:
                        strArr = strArr2;
                        z6 = obtainStyledAttributes.getBoolean(index, c0009b.f1153n0);
                        i11 = 75;
                        c0008a2.c(i11, z6);
                        break;
                    case 76:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, cVar.f1168c);
                        i7 = 76;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 77:
                        strArr = strArr2;
                        i8 = 77;
                        c0008a2.d(obtainStyledAttributes.getString(index), i8);
                        break;
                    case 78:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, dVar.f1176b);
                        i7 = 78;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 79:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, cVar.f1169d);
                        i9 = 79;
                        c0008a2.a(i9, f6);
                        break;
                    case 80:
                        strArr = strArr2;
                        z6 = obtainStyledAttributes.getBoolean(index, c0009b.f1149l0);
                        i11 = 80;
                        c0008a2.c(i11, z6);
                        break;
                    case 81:
                        strArr = strArr2;
                        z6 = obtainStyledAttributes.getBoolean(index, c0009b.f1151m0);
                        i11 = 81;
                        c0008a2.c(i11, z6);
                        break;
                    case 82:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, cVar.f1167b);
                        i7 = 82;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 83:
                        strArr = strArr2;
                        dimensionPixelSize = g(obtainStyledAttributes, index, eVar.f1187h);
                        i7 = 83;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 84:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInteger(index, cVar.f1172g);
                        i7 = 84;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 85:
                        strArr = strArr2;
                        f6 = obtainStyledAttributes.getFloat(index, cVar.f1171f);
                        i9 = 85;
                        c0008a2.a(i9, f6);
                        break;
                    case 86:
                        strArr = strArr2;
                        int i16 = obtainStyledAttributes.peekValue(index).type;
                        if (i16 != 1) {
                            if (i16 != 3) {
                                c0008a2.b(88, obtainStyledAttributes.getInteger(index, cVar.f1174i));
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                cVar.f1173h = string;
                                c0008a2.d(string, 90);
                                if (cVar.f1173h.indexOf("/") <= 0) {
                                    c0008a2.b(88, -1);
                                    break;
                                } else {
                                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f1174i = resourceId;
                                    c0008a2.b(89, resourceId);
                                    c0008a2.b(88, -2);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            cVar.f1174i = resourceId2;
                            c0008a2.b(89, resourceId2);
                            if (cVar.f1174i != -1) {
                                c0008a2.b(88, -2);
                                break;
                            }
                        }
                        indexCount = i14;
                        c0008a2 = c0008a;
                        str4 = str2;
                        i13 = i15 + 1;
                        strArr2 = strArr;
                        break;
                    case 87:
                        strArr = strArr2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.L);
                        i7 = 93;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 94:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, c0009b.S);
                        i7 = 94;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 95:
                        strArr = strArr2;
                        i12 = 0;
                        h(c0008a2, obtainStyledAttributes, index, i12);
                        break;
                    case 96:
                        strArr = strArr2;
                        i12 = 1;
                        h(c0008a2, obtainStyledAttributes, index, i12);
                        break;
                    case 97:
                        strArr = strArr2;
                        dimensionPixelSize = obtainStyledAttributes.getInt(index, c0009b.f1155o0);
                        i7 = 97;
                        c0008a2.b(i7, dimensionPixelSize);
                        break;
                    case 98:
                        int i17 = q.d.L;
                        strArr = strArr2;
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.f1107a = obtainStyledAttributes.getResourceId(index, aVar.f1107a);
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        z6 = obtainStyledAttributes.getBoolean(index, c0009b.f1138g);
                        i11 = 99;
                        strArr = strArr2;
                        c0008a2.c(i11, z6);
                        break;
                }
                str2 = str4;
                c0008a = c0008a2;
                indexCount = i14;
                c0008a2 = c0008a;
                str4 = str2;
                i13 = i15 + 1;
                strArr2 = strArr;
            }
        } else {
            int indexCount2 = obtainStyledAttributes.getIndexCount();
            int i18 = 0;
            while (i18 < indexCount2) {
                int index2 = obtainStyledAttributes.getIndex(i18);
                int i19 = indexCount2;
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        cVar.getClass();
                        c0009b.getClass();
                        dVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str3;
                        c0009b.f1156p = g(obtainStyledAttributes, index2, c0009b.f1156p);
                        break;
                    case 2:
                        str = str3;
                        c0009b.I = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.I);
                        break;
                    case 3:
                        str = str3;
                        c0009b.f1154o = g(obtainStyledAttributes, index2, c0009b.f1154o);
                        break;
                    case 4:
                        str = str3;
                        c0009b.f1152n = g(obtainStyledAttributes, index2, c0009b.f1152n);
                        break;
                    case 5:
                        str = str3;
                        c0009b.f1163y = obtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str3;
                        c0009b.C = obtainStyledAttributes.getDimensionPixelOffset(index2, c0009b.C);
                        break;
                    case 7:
                        str = str3;
                        c0009b.D = obtainStyledAttributes.getDimensionPixelOffset(index2, c0009b.D);
                        break;
                    case 8:
                        str = str3;
                        c0009b.J = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.J);
                        break;
                    case 9:
                        str = str3;
                        c0009b.f1160v = g(obtainStyledAttributes, index2, c0009b.f1160v);
                        break;
                    case 10:
                        str = str3;
                        c0009b.u = g(obtainStyledAttributes, index2, c0009b.u);
                        break;
                    case 11:
                        str = str3;
                        c0009b.P = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.P);
                        break;
                    case 12:
                        str = str3;
                        c0009b.Q = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.Q);
                        break;
                    case 13:
                        str = str3;
                        c0009b.M = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.M);
                        break;
                    case 14:
                        str = str3;
                        c0009b.O = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.O);
                        break;
                    case 15:
                        str = str3;
                        c0009b.R = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.R);
                        break;
                    case 16:
                        str = str3;
                        c0009b.N = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.N);
                        break;
                    case 17:
                        str = str3;
                        c0009b.f1132d = obtainStyledAttributes.getDimensionPixelOffset(index2, c0009b.f1132d);
                        break;
                    case 18:
                        str = str3;
                        c0009b.f1134e = obtainStyledAttributes.getDimensionPixelOffset(index2, c0009b.f1134e);
                        break;
                    case 19:
                        str = str3;
                        c0009b.f1136f = obtainStyledAttributes.getFloat(index2, c0009b.f1136f);
                        break;
                    case 20:
                        str = str3;
                        c0009b.f1161w = obtainStyledAttributes.getFloat(index2, c0009b.f1161w);
                        break;
                    case 21:
                        str = str3;
                        c0009b.f1130c = obtainStyledAttributes.getLayoutDimension(index2, c0009b.f1130c);
                        break;
                    case 22:
                        str = str3;
                        dVar.f1175a = iArr[obtainStyledAttributes.getInt(index2, dVar.f1175a)];
                        break;
                    case 23:
                        str = str3;
                        c0009b.f1128b = obtainStyledAttributes.getLayoutDimension(index2, c0009b.f1128b);
                        break;
                    case 24:
                        str = str3;
                        c0009b.F = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.F);
                        break;
                    case 25:
                        str = str3;
                        c0009b.f1140h = g(obtainStyledAttributes, index2, c0009b.f1140h);
                        break;
                    case 26:
                        str = str3;
                        c0009b.f1142i = g(obtainStyledAttributes, index2, c0009b.f1142i);
                        break;
                    case 27:
                        str = str3;
                        c0009b.E = obtainStyledAttributes.getInt(index2, c0009b.E);
                        break;
                    case 28:
                        str = str3;
                        c0009b.G = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.G);
                        break;
                    case 29:
                        str = str3;
                        c0009b.f1144j = g(obtainStyledAttributes, index2, c0009b.f1144j);
                        break;
                    case 30:
                        str = str3;
                        c0009b.f1146k = g(obtainStyledAttributes, index2, c0009b.f1146k);
                        break;
                    case 31:
                        str = str3;
                        c0009b.K = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.K);
                        break;
                    case 32:
                        str = str3;
                        c0009b.s = g(obtainStyledAttributes, index2, c0009b.s);
                        break;
                    case 33:
                        str = str3;
                        c0009b.f1159t = g(obtainStyledAttributes, index2, c0009b.f1159t);
                        break;
                    case 34:
                        str = str3;
                        c0009b.H = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.H);
                        break;
                    case 35:
                        str = str3;
                        c0009b.f1150m = g(obtainStyledAttributes, index2, c0009b.f1150m);
                        break;
                    case 36:
                        str = str3;
                        c0009b.f1148l = g(obtainStyledAttributes, index2, c0009b.f1148l);
                        break;
                    case 37:
                        str = str3;
                        c0009b.f1162x = obtainStyledAttributes.getFloat(index2, c0009b.f1162x);
                        break;
                    case 38:
                        str = str3;
                        aVar.f1107a = obtainStyledAttributes.getResourceId(index2, aVar.f1107a);
                        break;
                    case 39:
                        str = str3;
                        c0009b.U = obtainStyledAttributes.getFloat(index2, c0009b.U);
                        break;
                    case 40:
                        str = str3;
                        c0009b.T = obtainStyledAttributes.getFloat(index2, c0009b.T);
                        break;
                    case 41:
                        str = str3;
                        c0009b.V = obtainStyledAttributes.getInt(index2, c0009b.V);
                        break;
                    case 42:
                        str = str3;
                        c0009b.W = obtainStyledAttributes.getInt(index2, c0009b.W);
                        break;
                    case 43:
                        str = str3;
                        dVar.f1177c = obtainStyledAttributes.getFloat(index2, dVar.f1177c);
                        break;
                    case 44:
                        str = str3;
                        eVar.f1191l = true;
                        eVar.f1192m = obtainStyledAttributes.getDimension(index2, eVar.f1192m);
                        break;
                    case 45:
                        str = str3;
                        eVar.f1181b = obtainStyledAttributes.getFloat(index2, eVar.f1181b);
                        break;
                    case 46:
                        str = str3;
                        eVar.f1182c = obtainStyledAttributes.getFloat(index2, eVar.f1182c);
                        break;
                    case 47:
                        str = str3;
                        eVar.f1183d = obtainStyledAttributes.getFloat(index2, eVar.f1183d);
                        break;
                    case 48:
                        str = str3;
                        eVar.f1184e = obtainStyledAttributes.getFloat(index2, eVar.f1184e);
                        break;
                    case 49:
                        str = str3;
                        eVar.f1185f = obtainStyledAttributes.getDimension(index2, eVar.f1185f);
                        break;
                    case 50:
                        str = str3;
                        eVar.f1186g = obtainStyledAttributes.getDimension(index2, eVar.f1186g);
                        break;
                    case 51:
                        str = str3;
                        eVar.f1188i = obtainStyledAttributes.getDimension(index2, eVar.f1188i);
                        break;
                    case 52:
                        str = str3;
                        eVar.f1189j = obtainStyledAttributes.getDimension(index2, eVar.f1189j);
                        break;
                    case 53:
                        str = str3;
                        eVar.f1190k = obtainStyledAttributes.getDimension(index2, eVar.f1190k);
                        break;
                    case 54:
                        str = str3;
                        c0009b.X = obtainStyledAttributes.getInt(index2, c0009b.X);
                        break;
                    case 55:
                        str = str3;
                        c0009b.Y = obtainStyledAttributes.getInt(index2, c0009b.Y);
                        break;
                    case 56:
                        str = str3;
                        c0009b.Z = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.Z);
                        break;
                    case 57:
                        str = str3;
                        c0009b.f1127a0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.f1127a0);
                        break;
                    case 58:
                        str = str3;
                        c0009b.f1129b0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.f1129b0);
                        break;
                    case 59:
                        str = str3;
                        c0009b.f1131c0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.f1131c0);
                        break;
                    case 60:
                        str = str3;
                        eVar.f1180a = obtainStyledAttributes.getFloat(index2, eVar.f1180a);
                        break;
                    case 61:
                        str = str3;
                        c0009b.f1164z = g(obtainStyledAttributes, index2, c0009b.f1164z);
                        break;
                    case 62:
                        str = str3;
                        c0009b.A = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.A);
                        break;
                    case 63:
                        str = str3;
                        c0009b.B = obtainStyledAttributes.getFloat(index2, c0009b.B);
                        break;
                    case 64:
                        str = str3;
                        cVar.f1166a = g(obtainStyledAttributes, index2, cVar.f1166a);
                        break;
                    case 65:
                        str = str3;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                        } else {
                            String str5 = strArr2[obtainStyledAttributes.getInteger(index2, 0)];
                        }
                        cVar.getClass();
                        break;
                    case 66:
                        str = str3;
                        obtainStyledAttributes.getInt(index2, 0);
                        cVar.getClass();
                        break;
                    case 67:
                        str = str3;
                        cVar.f1170e = obtainStyledAttributes.getFloat(index2, cVar.f1170e);
                        break;
                    case 68:
                        str = str3;
                        dVar.f1178d = obtainStyledAttributes.getFloat(index2, dVar.f1178d);
                        break;
                    case 69:
                        str = str3;
                        c0009b.f1133d0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str3;
                        c0009b.f1135e0 = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str3;
                        c0009b.f1137f0 = obtainStyledAttributes.getInt(index2, c0009b.f1137f0);
                        break;
                    case 73:
                        str = str3;
                        c0009b.f1139g0 = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.f1139g0);
                        break;
                    case 74:
                        str = str3;
                        c0009b.f1145j0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str3;
                        c0009b.f1153n0 = obtainStyledAttributes.getBoolean(index2, c0009b.f1153n0);
                        break;
                    case 76:
                        str = str3;
                        cVar.f1168c = obtainStyledAttributes.getInt(index2, cVar.f1168c);
                        break;
                    case 77:
                        str = str3;
                        c0009b.f1147k0 = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str3;
                        dVar.f1176b = obtainStyledAttributes.getInt(index2, dVar.f1176b);
                        break;
                    case 79:
                        str = str3;
                        cVar.f1169d = obtainStyledAttributes.getFloat(index2, cVar.f1169d);
                        break;
                    case 80:
                        str = str3;
                        c0009b.f1149l0 = obtainStyledAttributes.getBoolean(index2, c0009b.f1149l0);
                        break;
                    case 81:
                        str = str3;
                        c0009b.f1151m0 = obtainStyledAttributes.getBoolean(index2, c0009b.f1151m0);
                        break;
                    case 82:
                        str = str3;
                        cVar.f1167b = obtainStyledAttributes.getInteger(index2, cVar.f1167b);
                        break;
                    case 83:
                        str = str3;
                        eVar.f1187h = g(obtainStyledAttributes, index2, eVar.f1187h);
                        break;
                    case 84:
                        str = str3;
                        cVar.f1172g = obtainStyledAttributes.getInteger(index2, cVar.f1172g);
                        break;
                    case 85:
                        str = str3;
                        cVar.f1171f = obtainStyledAttributes.getFloat(index2, cVar.f1171f);
                        break;
                    case 86:
                        str = str3;
                        int i20 = obtainStyledAttributes.peekValue(index2).type;
                        if (i20 != 1) {
                            if (i20 == 3) {
                                String string2 = obtainStyledAttributes.getString(index2);
                                cVar.f1173h = string2;
                                if (string2.indexOf("/") <= 0) {
                                    break;
                                } else {
                                    cVar.f1174i = obtainStyledAttributes.getResourceId(index2, -1);
                                }
                            } else {
                                obtainStyledAttributes.getInteger(index2, cVar.f1174i);
                            }
                            cVar.getClass();
                            break;
                        } else {
                            cVar.f1174i = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        }
                    case 87:
                        StringBuilder sb2 = new StringBuilder(str3);
                        str = str3;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str3;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        c0009b.f1157q = g(obtainStyledAttributes, index2, c0009b.f1157q);
                        str = str3;
                        break;
                    case 92:
                        c0009b.f1158r = g(obtainStyledAttributes, index2, c0009b.f1158r);
                        str = str3;
                        break;
                    case 93:
                        c0009b.L = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.L);
                        str = str3;
                        break;
                    case 94:
                        c0009b.S = obtainStyledAttributes.getDimensionPixelSize(index2, c0009b.S);
                        str = str3;
                        break;
                    case 95:
                        i6 = 0;
                        h(c0009b, obtainStyledAttributes, index2, i6);
                        str = str3;
                        break;
                    case 96:
                        i6 = 1;
                        h(c0009b, obtainStyledAttributes, index2, i6);
                        str = str3;
                        break;
                    case 97:
                        c0009b.f1155o0 = obtainStyledAttributes.getInt(index2, c0009b.f1155o0);
                        str = str3;
                        break;
                }
                i18++;
                indexCount2 = i19;
                str3 = str;
            }
            if (c0009b.f1145j0 != null) {
                c0009b.f1143i0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public static int g(TypedArray typedArray, int i6, int i7) {
        int resourceId = typedArray.getResourceId(i6, i7);
        return resourceId == -1 ? typedArray.getInt(i6, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.h(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void i(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i6 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i6 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i6 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void b(ConstraintLayout constraintLayout) {
        View findViewById;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f1106c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + q.a.b(childAt));
            } else if (this.f1105b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = hashMap.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                C0009b c0009b = aVar.f1110d;
                                c0009b.f1141h0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(c0009b.f1137f0);
                                barrier.setMargin(c0009b.f1139g0);
                                barrier.setAllowsGoneWidget(c0009b.f1153n0);
                                int[] iArr = c0009b.f1143i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c0009b.f1145j0;
                                    if (str != null) {
                                        int[] d6 = d(barrier, str);
                                        c0009b.f1143i0 = d6;
                                        barrier.setReferencedIds(d6);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            r.a.b(childAt, aVar.f1112f);
                            childAt.setLayoutParams(aVar2);
                            d dVar = aVar.f1108b;
                            if (dVar.f1176b == 0) {
                                childAt.setVisibility(dVar.f1175a);
                            }
                            childAt.setAlpha(dVar.f1177c);
                            e eVar = aVar.f1111e;
                            childAt.setRotation(eVar.f1180a);
                            childAt.setRotationX(eVar.f1181b);
                            childAt.setRotationY(eVar.f1182c);
                            childAt.setScaleX(eVar.f1183d);
                            childAt.setScaleY(eVar.f1184e);
                            if (eVar.f1187h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.f1187h) != null) {
                                    float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                    float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1185f)) {
                                    childAt.setPivotX(eVar.f1185f);
                                }
                                if (!Float.isNaN(eVar.f1186g)) {
                                    childAt.setPivotY(eVar.f1186g);
                                }
                            }
                            childAt.setTranslationX(eVar.f1188i);
                            childAt.setTranslationY(eVar.f1189j);
                            childAt.setTranslationZ(eVar.f1190k);
                            if (eVar.f1191l) {
                                childAt.setElevation(eVar.f1192m);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = hashMap.get(num);
            if (aVar3 != null) {
                C0009b c0009b2 = aVar3.f1110d;
                if (c0009b2.f1141h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c0009b2.f1143i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = c0009b2.f1145j0;
                        if (str2 != null) {
                            int[] d7 = d(barrier2, str2);
                            c0009b2.f1143i0 = d7;
                            barrier2.setReferencedIds(d7);
                        }
                    }
                    barrier2.setType(c0009b2.f1137f0);
                    barrier2.setMargin(c0009b2.f1139g0);
                    r.e eVar2 = ConstraintLayout.f1027q;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (c0009b2.f1126a) {
                    View dVar2 = new androidx.constraintlayout.widget.d(constraintLayout.getContext());
                    dVar2.setId(num.intValue());
                    r.e eVar3 = ConstraintLayout.f1027q;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(dVar2, aVar5);
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).g(constraintLayout);
            }
        }
    }

    public final void c(ConstraintLayout constraintLayout) {
        int i6;
        int i7;
        r.a aVar;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = bVar.f1106c;
        hashMap.clear();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (bVar.f1105b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new a());
            }
            a aVar3 = hashMap.get(Integer.valueOf(id));
            if (aVar3 == null) {
                i6 = childCount;
            } else {
                HashMap<String, r.a> hashMap2 = bVar.f1104a;
                HashMap<String, r.a> hashMap3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : hashMap2.keySet()) {
                    r.a aVar4 = hashMap2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            aVar = new r.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            i7 = childCount;
                        } else {
                            i7 = childCount;
                            try {
                                aVar = new r.a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                            } catch (IllegalAccessException e6) {
                                e = e6;
                                e.printStackTrace();
                                childCount = i7;
                            } catch (NoSuchMethodException e7) {
                                e = e7;
                                e.printStackTrace();
                                childCount = i7;
                            } catch (InvocationTargetException e8) {
                                e = e8;
                                e.printStackTrace();
                                childCount = i7;
                            }
                        }
                        hashMap3.put(str, aVar);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
                        e = e9;
                        i7 = childCount;
                    }
                    childCount = i7;
                }
                i6 = childCount;
                aVar3.f1112f = hashMap3;
                aVar3.b(id, aVar2);
                int visibility = childAt.getVisibility();
                d dVar = aVar3.f1108b;
                dVar.f1175a = visibility;
                dVar.f1177c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar3.f1111e;
                eVar.f1180a = rotation;
                eVar.f1181b = childAt.getRotationX();
                eVar.f1182c = childAt.getRotationY();
                eVar.f1183d = childAt.getScaleX();
                eVar.f1184e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f1185f = pivotX;
                    eVar.f1186g = pivotY;
                }
                eVar.f1188i = childAt.getTranslationX();
                eVar.f1189j = childAt.getTranslationY();
                eVar.f1190k = childAt.getTranslationZ();
                if (eVar.f1191l) {
                    eVar.f1192m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    C0009b c0009b = aVar3.f1110d;
                    c0009b.f1153n0 = allowsGoneWidget;
                    c0009b.f1143i0 = barrier.getReferencedIds();
                    c0009b.f1137f0 = barrier.getType();
                    c0009b.f1139g0 = barrier.getMargin();
                }
            }
            i8++;
            bVar = this;
            childCount = i6;
        }
    }

    public final void f(Context context, int i6) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a e6 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e6.f1110d.f1126a = true;
                    }
                    this.f1106c.put(Integer.valueOf(e6.f1107a), e6);
                    continue;
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }
}
