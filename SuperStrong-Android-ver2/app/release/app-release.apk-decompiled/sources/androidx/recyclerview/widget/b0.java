package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f2038a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2039b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2040a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2041b;

        /* renamed from: c  reason: collision with root package name */
        public int f2042c;

        /* renamed from: d  reason: collision with root package name */
        public int f2043d;

        /* renamed from: e  reason: collision with root package name */
        public int f2044e;

        public final boolean a() {
            int i6 = this.f2040a;
            int i7 = 2;
            if ((i6 & 7) != 0) {
                int i8 = this.f2043d;
                int i9 = this.f2041b;
                if ((((i8 > i9 ? 1 : i8 == i9 ? 2 : 4) << 0) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 112) != 0) {
                int i10 = this.f2043d;
                int i11 = this.f2042c;
                if ((((i10 > i11 ? 1 : i10 == i11 ? 2 : 4) << 4) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 1792) != 0) {
                int i12 = this.f2044e;
                int i13 = this.f2041b;
                if ((((i12 > i13 ? 1 : i12 == i13 ? 2 : 4) << 8) & i6) == 0) {
                    return false;
                }
            }
            if ((i6 & 28672) != 0) {
                int i14 = this.f2044e;
                int i15 = this.f2042c;
                if (i14 > i15) {
                    i7 = 1;
                } else if (i14 != i15) {
                    i7 = 4;
                }
                if ((i6 & (i7 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b(View view);

        View c(int i6);

        int d();

        int e(View view);
    }

    public b0(b bVar) {
        this.f2038a = bVar;
    }

    public final View a(int i6, int i7, int i8, int i9) {
        int i10;
        b bVar = this.f2038a;
        int d6 = bVar.d();
        int a6 = bVar.a();
        if (i7 > i6) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        View view = null;
        while (i6 != i7) {
            View c6 = bVar.c(i6);
            int b6 = bVar.b(c6);
            int e6 = bVar.e(c6);
            a aVar = this.f2039b;
            aVar.f2041b = d6;
            aVar.f2042c = a6;
            aVar.f2043d = b6;
            aVar.f2044e = e6;
            if (i8 != 0) {
                aVar.f2040a = i8 | 0;
                if (aVar.a()) {
                    return c6;
                }
            }
            if (i9 != 0) {
                aVar.f2040a = i9 | 0;
                if (aVar.a()) {
                    view = c6;
                }
            }
            i6 += i10;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f2038a;
        int d6 = bVar.d();
        int a6 = bVar.a();
        int b6 = bVar.b(view);
        int e6 = bVar.e(view);
        a aVar = this.f2039b;
        aVar.f2041b = d6;
        aVar.f2042c = a6;
        aVar.f2043d = b6;
        aVar.f2044e = e6;
        aVar.f2040a = 24579 | 0;
        return aVar.a();
    }
}
