package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o.g;
import p.b;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: q  reason: collision with root package name */
    public static r.e f1027q;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<View> f1028b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<androidx.constraintlayout.widget.a> f1029c;

    /* renamed from: d  reason: collision with root package name */
    public final o.e f1030d;

    /* renamed from: e  reason: collision with root package name */
    public int f1031e;

    /* renamed from: f  reason: collision with root package name */
    public int f1032f;

    /* renamed from: g  reason: collision with root package name */
    public int f1033g;

    /* renamed from: h  reason: collision with root package name */
    public int f1034h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1035i;

    /* renamed from: j  reason: collision with root package name */
    public int f1036j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.constraintlayout.widget.b f1037k;

    /* renamed from: l  reason: collision with root package name */
    public r.b f1038l;

    /* renamed from: m  reason: collision with root package name */
    public int f1039m;

    /* renamed from: n  reason: collision with root package name */
    public HashMap<String, Integer> f1040n;

    /* renamed from: o  reason: collision with root package name */
    public final SparseArray<o.d> f1041o;

    /* renamed from: p  reason: collision with root package name */
    public final b f1042p;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public final int C;
        public final int D;
        public float E;
        public float F;
        public String G;
        public float H;
        public float I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        public int U;
        public int V;
        public boolean W;
        public boolean X;
        public String Y;
        public int Z;

        /* renamed from: a  reason: collision with root package name */
        public int f1043a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f1044a0;

        /* renamed from: b  reason: collision with root package name */
        public int f1045b;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f1046b0;

        /* renamed from: c  reason: collision with root package name */
        public float f1047c;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f1048c0;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1049d;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f1050d0;

        /* renamed from: e  reason: collision with root package name */
        public int f1051e;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f1052e0;

        /* renamed from: f  reason: collision with root package name */
        public int f1053f;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f1054f0;

        /* renamed from: g  reason: collision with root package name */
        public int f1055g;

        /* renamed from: g0  reason: collision with root package name */
        public int f1056g0;

        /* renamed from: h  reason: collision with root package name */
        public int f1057h;

        /* renamed from: h0  reason: collision with root package name */
        public int f1058h0;

        /* renamed from: i  reason: collision with root package name */
        public int f1059i;

        /* renamed from: i0  reason: collision with root package name */
        public int f1060i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1061j;

        /* renamed from: j0  reason: collision with root package name */
        public int f1062j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1063k;

        /* renamed from: k0  reason: collision with root package name */
        public int f1064k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1065l;

        /* renamed from: l0  reason: collision with root package name */
        public int f1066l0;

        /* renamed from: m  reason: collision with root package name */
        public int f1067m;

        /* renamed from: m0  reason: collision with root package name */
        public float f1068m0;

        /* renamed from: n  reason: collision with root package name */
        public int f1069n;

        /* renamed from: n0  reason: collision with root package name */
        public int f1070n0;

        /* renamed from: o  reason: collision with root package name */
        public int f1071o;

        /* renamed from: o0  reason: collision with root package name */
        public int f1072o0;

        /* renamed from: p  reason: collision with root package name */
        public int f1073p;

        /* renamed from: p0  reason: collision with root package name */
        public float f1074p0;

        /* renamed from: q  reason: collision with root package name */
        public int f1075q;

        /* renamed from: q0  reason: collision with root package name */
        public o.d f1076q0;

        /* renamed from: r  reason: collision with root package name */
        public float f1077r;
        public int s;

        /* renamed from: t  reason: collision with root package name */
        public int f1078t;
        public int u;

        /* renamed from: v  reason: collision with root package name */
        public int f1079v;

        /* renamed from: w  reason: collision with root package name */
        public final int f1080w;

        /* renamed from: x  reason: collision with root package name */
        public int f1081x;

        /* renamed from: y  reason: collision with root package name */
        public final int f1082y;

        /* renamed from: z  reason: collision with root package name */
        public int f1083z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0007a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f1084a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1084a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a() {
            super(-2, -2);
            this.f1043a = -1;
            this.f1045b = -1;
            this.f1047c = -1.0f;
            this.f1049d = true;
            this.f1051e = -1;
            this.f1053f = -1;
            this.f1055g = -1;
            this.f1057h = -1;
            this.f1059i = -1;
            this.f1061j = -1;
            this.f1063k = -1;
            this.f1065l = -1;
            this.f1067m = -1;
            this.f1069n = -1;
            this.f1071o = -1;
            this.f1073p = -1;
            this.f1075q = 0;
            this.f1077r = 0.0f;
            this.s = -1;
            this.f1078t = -1;
            this.u = -1;
            this.f1079v = -1;
            this.f1080w = Integer.MIN_VALUE;
            this.f1081x = Integer.MIN_VALUE;
            this.f1082y = Integer.MIN_VALUE;
            this.f1083z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1044a0 = true;
            this.f1046b0 = true;
            this.f1048c0 = false;
            this.f1050d0 = false;
            this.f1052e0 = false;
            this.f1054f0 = false;
            this.f1056g0 = -1;
            this.f1058h0 = -1;
            this.f1060i0 = -1;
            this.f1062j0 = -1;
            this.f1064k0 = Integer.MIN_VALUE;
            this.f1066l0 = Integer.MIN_VALUE;
            this.f1068m0 = 0.5f;
            this.f1076q0 = new o.d();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.f1043a = -1;
            this.f1045b = -1;
            this.f1047c = -1.0f;
            this.f1049d = true;
            this.f1051e = -1;
            this.f1053f = -1;
            this.f1055g = -1;
            this.f1057h = -1;
            this.f1059i = -1;
            this.f1061j = -1;
            this.f1063k = -1;
            this.f1065l = -1;
            this.f1067m = -1;
            this.f1069n = -1;
            this.f1071o = -1;
            this.f1073p = -1;
            this.f1075q = 0;
            this.f1077r = 0.0f;
            this.s = -1;
            this.f1078t = -1;
            this.u = -1;
            this.f1079v = -1;
            this.f1080w = Integer.MIN_VALUE;
            this.f1081x = Integer.MIN_VALUE;
            this.f1082y = Integer.MIN_VALUE;
            this.f1083z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1044a0 = true;
            this.f1046b0 = true;
            this.f1048c0 = false;
            this.f1050d0 = false;
            this.f1052e0 = false;
            this.f1054f0 = false;
            this.f1056g0 = -1;
            this.f1058h0 = -1;
            this.f1060i0 = -1;
            this.f1062j0 = -1;
            this.f1064k0 = Integer.MIN_VALUE;
            this.f1066l0 = Integer.MIN_VALUE;
            this.f1068m0 = 0.5f;
            this.f1076q0 = new o.d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.f2640c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i7 = C0007a.f1084a.get(index);
                switch (i7) {
                    case 1:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1073p);
                        this.f1073p = resourceId;
                        if (resourceId == -1) {
                            this.f1073p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1075q = obtainStyledAttributes.getDimensionPixelSize(index, this.f1075q);
                        continue;
                    case 4:
                        float f6 = obtainStyledAttributes.getFloat(index, this.f1077r) % 360.0f;
                        this.f1077r = f6;
                        if (f6 < 0.0f) {
                            this.f1077r = (360.0f - f6) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1043a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1043a);
                        continue;
                    case 6:
                        this.f1045b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1045b);
                        continue;
                    case 7:
                        this.f1047c = obtainStyledAttributes.getFloat(index, this.f1047c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1051e);
                        this.f1051e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1051e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1053f);
                        this.f1053f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1053f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1055g);
                        this.f1055g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1055g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1057h);
                        this.f1057h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1057h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1059i);
                        this.f1059i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1059i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1061j);
                        this.f1061j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1061j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1063k);
                        this.f1063k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1063k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1065l);
                        this.f1065l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1065l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1067m);
                        this.f1067m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1067m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1078t);
                        this.f1078t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1078t = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1079v);
                        this.f1079v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1079v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1080w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1080w);
                        continue;
                    case 22:
                        this.f1081x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1081x);
                        continue;
                    case 23:
                        this.f1082y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1082y);
                        continue;
                    case 24:
                        this.f1083z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1083z);
                        continue;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                    case 27:
                        this.W = obtainStyledAttributes.getBoolean(index, this.W);
                        continue;
                    case 28:
                        this.X = obtainStyledAttributes.getBoolean(index, this.X);
                        continue;
                    case 29:
                        this.E = obtainStyledAttributes.getFloat(index, this.E);
                        continue;
                    case 30:
                        this.F = obtainStyledAttributes.getFloat(index, this.F);
                        continue;
                    case 31:
                        int i8 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i8;
                        if (i8 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i9 = obtainStyledAttributes.getInt(index, 0);
                        this.M = i9;
                        if (i9 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                            }
                        }
                    case 34:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                            }
                        }
                    case 35:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.L = 2;
                        continue;
                    case 36:
                        try {
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.O) == -2) {
                                this.O = -2;
                            }
                        }
                    case 37:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                    case 38:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.M = 2;
                        continue;
                    default:
                        switch (i7) {
                            case 44:
                                androidx.constraintlayout.widget.b.i(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.H = obtainStyledAttributes.getFloat(index, this.H);
                                continue;
                            case 46:
                                this.I = obtainStyledAttributes.getFloat(index, this.I);
                                continue;
                            case 47:
                                this.J = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.K = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.T = obtainStyledAttributes.getDimensionPixelOffset(index, this.T);
                                continue;
                            case 50:
                                this.U = obtainStyledAttributes.getDimensionPixelOffset(index, this.U);
                                continue;
                            case 51:
                                this.Y = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1069n);
                                this.f1069n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1069n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1071o);
                                this.f1071o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1071o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                continue;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                continue;
                            default:
                                switch (i7) {
                                    case 64:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        androidx.constraintlayout.widget.b.h(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 67:
                                        this.f1049d = obtainStyledAttributes.getBoolean(index, this.f1049d);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1043a = -1;
            this.f1045b = -1;
            this.f1047c = -1.0f;
            this.f1049d = true;
            this.f1051e = -1;
            this.f1053f = -1;
            this.f1055g = -1;
            this.f1057h = -1;
            this.f1059i = -1;
            this.f1061j = -1;
            this.f1063k = -1;
            this.f1065l = -1;
            this.f1067m = -1;
            this.f1069n = -1;
            this.f1071o = -1;
            this.f1073p = -1;
            this.f1075q = 0;
            this.f1077r = 0.0f;
            this.s = -1;
            this.f1078t = -1;
            this.u = -1;
            this.f1079v = -1;
            this.f1080w = Integer.MIN_VALUE;
            this.f1081x = Integer.MIN_VALUE;
            this.f1082y = Integer.MIN_VALUE;
            this.f1083z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = 0.5f;
            this.F = 0.5f;
            this.G = null;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.T = -1;
            this.U = -1;
            this.V = -1;
            this.W = false;
            this.X = false;
            this.Y = null;
            this.Z = 0;
            this.f1044a0 = true;
            this.f1046b0 = true;
            this.f1048c0 = false;
            this.f1050d0 = false;
            this.f1052e0 = false;
            this.f1054f0 = false;
            this.f1056g0 = -1;
            this.f1058h0 = -1;
            this.f1060i0 = -1;
            this.f1062j0 = -1;
            this.f1064k0 = Integer.MIN_VALUE;
            this.f1066l0 = Integer.MIN_VALUE;
            this.f1068m0 = 0.5f;
            this.f1076q0 = new o.d();
        }

        public final void a() {
            this.f1050d0 = false;
            this.f1044a0 = true;
            this.f1046b0 = true;
            int i6 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i6 == -2 && this.W) {
                this.f1044a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i7 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i7 == -2 && this.X) {
                this.f1046b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.f1044a0 = false;
                if (i6 == 0 && this.L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.W = true;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f1046b0 = false;
                if (i7 == 0 && this.M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.X = true;
                }
            }
            if (this.f1047c == -1.0f && this.f1043a == -1 && this.f1045b == -1) {
                return;
            }
            this.f1050d0 = true;
            this.f1044a0 = true;
            this.f1046b0 = true;
            if (!(this.f1076q0 instanceof g)) {
                this.f1076q0 = new g();
            }
            ((g) this.f1076q0).Q(this.V);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x00d0, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00df, code lost:
            if (r1 > 0) goto L52;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0073b {

        /* renamed from: a  reason: collision with root package name */
        public final ConstraintLayout f1085a;

        /* renamed from: b  reason: collision with root package name */
        public int f1086b;

        /* renamed from: c  reason: collision with root package name */
        public int f1087c;

        /* renamed from: d  reason: collision with root package name */
        public int f1088d;

        /* renamed from: e  reason: collision with root package name */
        public int f1089e;

        /* renamed from: f  reason: collision with root package name */
        public int f1090f;

        /* renamed from: g  reason: collision with root package name */
        public int f1091g;

        public b(ConstraintLayout constraintLayout) {
            this.f1085a = constraintLayout;
        }

        public static boolean a(int i6, int i7, int i8) {
            if (i6 == i7) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i6);
            View.MeasureSpec.getSize(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i8 == size;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01b3  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x01e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0134  */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(o.d r19, p.b.a r20) {
            /*
                Method dump skipped, instructions count: 737
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(o.d, p.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1028b = new SparseArray<>();
        this.f1029c = new ArrayList<>(4);
        this.f1030d = new o.e();
        this.f1031e = 0;
        this.f1032f = 0;
        this.f1033g = Integer.MAX_VALUE;
        this.f1034h = Integer.MAX_VALUE;
        this.f1035i = true;
        this.f1036j = 257;
        this.f1037k = null;
        this.f1038l = null;
        this.f1039m = -1;
        this.f1040n = new HashMap<>();
        this.f1041o = new SparseArray<>();
        this.f1042p = new b(this);
        d(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1028b = new SparseArray<>();
        this.f1029c = new ArrayList<>(4);
        this.f1030d = new o.e();
        this.f1031e = 0;
        this.f1032f = 0;
        this.f1033g = Integer.MAX_VALUE;
        this.f1034h = Integer.MAX_VALUE;
        this.f1035i = true;
        this.f1036j = 257;
        this.f1037k = null;
        this.f1038l = null;
        this.f1039m = -1;
        this.f1040n = new HashMap<>();
        this.f1041o = new SparseArray<>();
        this.f1042p = new b(this);
        d(attributeSet, i6);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static r.e getSharedValues() {
        if (f1027q == null) {
            f1027q = new r.e();
        }
        return f1027q;
    }

    public final o.d c(View view) {
        if (view == this) {
            return this.f1030d;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof a)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof a)) {
                    return null;
                }
            }
            return ((a) view.getLayoutParams()).f1076q0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(AttributeSet attributeSet, int i6) {
        o.e eVar = this.f1030d;
        eVar.f5437i0 = this;
        b bVar = this.f1042p;
        eVar.w0 = bVar;
        eVar.f5462u0.f5645f = bVar;
        this.f1028b.put(getId(), this);
        this.f1037k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c.a.f2640c, i6, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == 16) {
                    this.f1031e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1031e);
                } else if (index == 17) {
                    this.f1032f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1032f);
                } else if (index == 14) {
                    this.f1033g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1033g);
                } else if (index == 15) {
                    this.f1034h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1034h);
                } else if (index == 113) {
                    this.f1036j = obtainStyledAttributes.getInt(index, this.f1036j);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            f(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1038l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.f1037k = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1037k = null;
                    }
                    this.f1039m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        eVar.F0 = this.f1036j;
        m.d.f5163p = eVar.V(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1029c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.get(i6).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i8 = (int) ((parseInt / 1080.0f) * width);
                        int i9 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i8;
                        float f7 = i9;
                        float f8 = i8 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f7, f8, f7, paint);
                        float parseInt4 = i9 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f7, f8, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f8, f7, paint);
                    }
                }
            }
        }
    }

    public final boolean e() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void f(int i6) {
        this.f1038l = new r.b(getContext(), this, i6);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1035i = true;
        super.forceLayout();
    }

    public final void g(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f1040n == null) {
                this.f1040n = new HashMap<>();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1040n.put(str, Integer.valueOf(num.intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1034h;
    }

    public int getMaxWidth() {
        return this.f1033g;
    }

    public int getMinHeight() {
        return this.f1032f;
    }

    public int getMinWidth() {
        return this.f1031e;
    }

    public int getOptimizationLevel() {
        return this.f1030d.F0;
    }

    public String getSceneString() {
        int id;
        String str;
        StringBuilder sb = new StringBuilder();
        o.e eVar = this.f1030d;
        if (eVar.f5440k == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            eVar.f5440k = str;
        }
        if (eVar.f5441k0 == null) {
            eVar.f5441k0 = eVar.f5440k;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f5441k0);
        }
        Iterator<o.d> it = eVar.f5501s0.iterator();
        while (it.hasNext()) {
            o.d next = it.next();
            View view = (View) next.f5437i0;
            if (view != null) {
                if (next.f5440k == null && (id = view.getId()) != -1) {
                    next.f5440k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f5441k0 == null) {
                    next.f5441k0 = next.f5440k;
                    Log.v("ConstraintLayout", " setDebugName " + next.f5441k0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            Method dump skipped, instructions count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.h():boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            o.d dVar = aVar.f1076q0;
            if ((childAt.getVisibility() != 8 || aVar.f1050d0 || aVar.f1052e0 || isInEditMode) && !aVar.f1054f0) {
                int r5 = dVar.r();
                int s = dVar.s();
                int q5 = dVar.q() + r5;
                int l5 = dVar.l() + s;
                childAt.layout(r5, s, q5, l5);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(r5, s, q5, l5);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1029c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.get(i11).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o.d c6 = c(view);
        if ((view instanceof d) && !(c6 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.f1076q0 = gVar;
            aVar.f1050d0 = true;
            gVar.Q(aVar.V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f1052e0 = true;
            ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f1029c;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f1028b.put(view.getId(), view);
        this.f1035i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1028b.remove(view.getId());
        o.d c6 = c(view);
        this.f1030d.f5501s0.remove(c6);
        c6.C();
        this.f1029c.remove(view);
        this.f1035i = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1035i = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.f1037k = bVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        int id = getId();
        SparseArray<View> sparseArray = this.f1028b;
        sparseArray.remove(id);
        super.setId(i6);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.f1034h) {
            return;
        }
        this.f1034h = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f1033g) {
            return;
        }
        this.f1033g = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f1032f) {
            return;
        }
        this.f1032f = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f1031e) {
            return;
        }
        this.f1031e = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(r.c cVar) {
        r.b bVar = this.f1038l;
        if (bVar != null) {
            bVar.getClass();
        }
    }

    public void setOptimizationLevel(int i6) {
        this.f1036j = i6;
        o.e eVar = this.f1030d;
        eVar.F0 = i6;
        m.d.f5163p = eVar.V(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
