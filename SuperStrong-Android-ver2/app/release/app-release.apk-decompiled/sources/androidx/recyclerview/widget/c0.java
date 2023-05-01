package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final l.h<RecyclerView.a0, a> f2047a = new l.h<>();

    /* renamed from: b  reason: collision with root package name */
    public final l.e<RecyclerView.a0> f2048b = new l.e<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final e0.e f2049d = new e0.e(20);

        /* renamed from: a  reason: collision with root package name */
        public int f2050a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f2051b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f2052c;

        public static a a() {
            a aVar = (a) f2049d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    public final RecyclerView.i.c a(RecyclerView.a0 a0Var, int i6) {
        a l5;
        RecyclerView.i.c cVar;
        l.h<RecyclerView.a0, a> hVar = this.f2047a;
        int e6 = hVar.e(a0Var);
        if (e6 >= 0 && (l5 = hVar.l(e6)) != null) {
            int i7 = l5.f2050a;
            if ((i7 & i6) != 0) {
                int i8 = i7 & (~i6);
                l5.f2050a = i8;
                if (i6 == 4) {
                    cVar = l5.f2051b;
                } else if (i6 == 8) {
                    cVar = l5.f2052c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i8 & 12) == 0) {
                    hVar.j(e6);
                    l5.f2050a = 0;
                    l5.f2051b = null;
                    l5.f2052c = null;
                    a.f2049d.a(l5);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void b(RecyclerView.a0 a0Var) {
        a orDefault = this.f2047a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.f2050a &= -2;
    }

    public final void c(RecyclerView.a0 a0Var) {
        l.e<RecyclerView.a0> eVar = this.f2048b;
        int h6 = eVar.h() - 1;
        while (true) {
            if (h6 < 0) {
                break;
            } else if (a0Var == eVar.i(h6)) {
                Object[] objArr = eVar.f5039d;
                Object obj = objArr[h6];
                Object obj2 = l.e.f5036f;
                if (obj != obj2) {
                    objArr[h6] = obj2;
                    eVar.f5037b = true;
                }
            } else {
                h6--;
            }
        }
        a remove = this.f2047a.remove(a0Var);
        if (remove != null) {
            remove.f2050a = 0;
            remove.f2051b = null;
            remove.f2052c = null;
            a.f2049d.a(remove);
        }
    }
}
