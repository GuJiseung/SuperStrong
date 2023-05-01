package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final o0.b f1366a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1367b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1368c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1369d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1370a;

        /* renamed from: b  reason: collision with root package name */
        public i f1371b;

        public a() {
            this(1);
        }

        public a(int i6) {
            this.f1370a = new SparseArray<>(i6);
        }

        public final void a(i iVar, int i6, int i7) {
            a aVar;
            int a6 = iVar.a(i6);
            SparseArray<a> sparseArray = this.f1370a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a6);
            }
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(iVar.a(i6), aVar);
            }
            if (i7 > i6) {
                aVar.a(iVar, i6 + 1, i7);
            } else {
                aVar.f1371b = iVar;
            }
        }
    }

    public n(Typeface typeface, o0.b bVar) {
        int i6;
        int i7;
        int i8;
        boolean z5;
        this.f1369d = typeface;
        this.f1366a = bVar;
        int a6 = bVar.a(6);
        if (a6 != 0) {
            int i9 = a6 + bVar.f5502a;
            i6 = bVar.f5503b.getInt(bVar.f5503b.getInt(i9) + i9);
        } else {
            i6 = 0;
        }
        this.f1367b = new char[i6 * 2];
        int a7 = bVar.a(6);
        if (a7 != 0) {
            int i10 = a7 + bVar.f5502a;
            i7 = bVar.f5503b.getInt(bVar.f5503b.getInt(i10) + i10);
        } else {
            i7 = 0;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            i iVar = new i(this, i11);
            o0.a c6 = iVar.c();
            int a8 = c6.a(4);
            if (a8 != 0) {
                i8 = c6.f5503b.getInt(a8 + c6.f5502a);
            } else {
                i8 = 0;
            }
            Character.toChars(i8, this.f1367b, i11 * 2);
            if (iVar.b() > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            c.a.f("invalid metadata codepoint length", z5);
            this.f1368c.a(iVar, 0, iVar.b() - 1);
        }
    }
}
