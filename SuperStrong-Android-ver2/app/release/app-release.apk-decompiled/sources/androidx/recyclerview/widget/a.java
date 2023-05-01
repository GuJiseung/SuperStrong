package androidx.recyclerview.widget;

import androidx.recyclerview.widget.p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a implements p.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0014a f2023d;

    /* renamed from: a  reason: collision with root package name */
    public final e0.e f2020a = new e0.e(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2021b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f2022c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final p f2024e = new p(this);

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0014a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2025a;

        /* renamed from: b  reason: collision with root package name */
        public int f2026b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2027c;

        /* renamed from: d  reason: collision with root package name */
        public int f2028d;

        public b(Object obj, int i6, int i7, int i8) {
            this.f2025a = i6;
            this.f2026b = i7;
            this.f2028d = i8;
            this.f2027c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i6 = this.f2025a;
            if (i6 != bVar.f2025a) {
                return false;
            }
            if (i6 == 8 && Math.abs(this.f2028d - this.f2026b) == 1 && this.f2028d == bVar.f2026b && this.f2026b == bVar.f2028d) {
                return true;
            }
            if (this.f2028d == bVar.f2028d && this.f2026b == bVar.f2026b) {
                Object obj2 = this.f2027c;
                Object obj3 = bVar.f2027c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.f2025a * 31) + this.f2026b) * 31) + this.f2028d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i6 = this.f2025a;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 4) {
                        if (i6 != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.f2026b);
            sb.append("c:");
            sb.append(this.f2028d);
            sb.append(",p:");
            sb.append(this.f2027c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(w wVar) {
        this.f2023d = wVar;
    }

    public final boolean a(int i6) {
        ArrayList<b> arrayList = this.f2022c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = arrayList.get(i7);
            int i8 = bVar.f2025a;
            if (i8 == 8) {
                if (f(bVar.f2028d, i7 + 1) == i6) {
                    return true;
                }
            } else if (i8 == 1) {
                int i9 = bVar.f2026b;
                int i10 = bVar.f2028d + i9;
                while (i9 < i10) {
                    if (f(i9, i7 + 1) == i6) {
                        return true;
                    }
                    i9++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f2022c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((w) this.f2023d).a(arrayList.get(i6));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f2021b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = arrayList.get(i6);
            int i7 = bVar.f2025a;
            InterfaceC0014a interfaceC0014a = this.f2023d;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 == 8) {
                            w wVar = (w) interfaceC0014a;
                            wVar.a(bVar);
                            wVar.e(bVar.f2026b, bVar.f2028d);
                        }
                    } else {
                        w wVar2 = (w) interfaceC0014a;
                        wVar2.a(bVar);
                        wVar2.c(bVar.f2026b, bVar.f2028d, bVar.f2027c);
                    }
                } else {
                    w wVar3 = (w) interfaceC0014a;
                    wVar3.a(bVar);
                    int i8 = bVar.f2026b;
                    int i9 = bVar.f2028d;
                    RecyclerView recyclerView = wVar3.f2170a;
                    recyclerView.O(i8, i9, true);
                    recyclerView.f1844h0 = true;
                    recyclerView.f1838e0.f1961c += i9;
                }
            } else {
                w wVar4 = (w) interfaceC0014a;
                wVar4.a(bVar);
                wVar4.d(bVar.f2026b, bVar.f2028d);
            }
        }
        l(arrayList);
    }

    public final void d(b bVar) {
        int i6;
        e0.e eVar;
        boolean z5;
        int i7 = bVar.f2025a;
        if (i7 != 1 && i7 != 8) {
            int m5 = m(bVar.f2026b, i7);
            int i8 = bVar.f2026b;
            int i9 = bVar.f2025a;
            if (i9 != 2) {
                if (i9 == 4) {
                    i6 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i6 = 0;
            }
            int i10 = 1;
            int i11 = 1;
            while (true) {
                int i12 = bVar.f2028d;
                eVar = this.f2020a;
                if (i10 >= i12) {
                    break;
                }
                int m6 = m((i6 * i10) + bVar.f2026b, bVar.f2025a);
                int i13 = bVar.f2025a;
                if (i13 == 2 ? m6 == m5 : !(i13 != 4 || m6 != m5 + 1)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    i11++;
                } else {
                    b h6 = h(bVar.f2027c, i13, m5, i11);
                    e(h6, i8);
                    h6.f2027c = null;
                    eVar.a(h6);
                    if (bVar.f2025a == 4) {
                        i8 += i11;
                    }
                    i11 = 1;
                    m5 = m6;
                }
                i10++;
            }
            Object obj = bVar.f2027c;
            bVar.f2027c = null;
            eVar.a(bVar);
            if (i11 > 0) {
                b h7 = h(obj, bVar.f2025a, m5, i11);
                e(h7, i8);
                h7.f2027c = null;
                eVar.a(h7);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i6) {
        w wVar = (w) this.f2023d;
        wVar.a(bVar);
        int i7 = bVar.f2025a;
        if (i7 != 2) {
            if (i7 == 4) {
                wVar.c(i6, bVar.f2028d, bVar.f2027c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i8 = bVar.f2028d;
        RecyclerView recyclerView = wVar.f2170a;
        recyclerView.O(i6, i8, true);
        recyclerView.f1844h0 = true;
        recyclerView.f1838e0.f1961c += i8;
    }

    public final int f(int i6, int i7) {
        ArrayList<b> arrayList = this.f2022c;
        int size = arrayList.size();
        while (i7 < size) {
            b bVar = arrayList.get(i7);
            int i8 = bVar.f2025a;
            if (i8 == 8) {
                int i9 = bVar.f2026b;
                if (i9 == i6) {
                    i6 = bVar.f2028d;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (bVar.f2028d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = bVar.f2026b;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = bVar.f2028d;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += bVar.f2028d;
                }
            }
            i7++;
        }
        return i6;
    }

    public final boolean g() {
        return this.f2021b.size() > 0;
    }

    public final b h(Object obj, int i6, int i7, int i8) {
        b bVar = (b) this.f2020a.b();
        if (bVar == null) {
            return new b(obj, i6, i7, i8);
        }
        bVar.f2025a = i6;
        bVar.f2026b = i7;
        bVar.f2028d = i8;
        bVar.f2027c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.f2022c.add(bVar);
        int i6 = bVar.f2025a;
        InterfaceC0014a interfaceC0014a = this.f2023d;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 == 8) {
                        ((w) interfaceC0014a).e(bVar.f2026b, bVar.f2028d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                ((w) interfaceC0014a).c(bVar.f2026b, bVar.f2028d, bVar.f2027c);
                return;
            }
            int i7 = bVar.f2026b;
            int i8 = bVar.f2028d;
            RecyclerView recyclerView = ((w) interfaceC0014a).f2170a;
            recyclerView.O(i7, i8, false);
            recyclerView.f1844h0 = true;
            return;
        }
        ((w) interfaceC0014a).d(bVar.f2026b, bVar.f2028d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018e, code lost:
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
        if (r11.f2026b == r11.f2028d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0197, code lost:
        r1.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019b, code lost:
        r1.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019e, code lost:
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
        r1.add(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r5 > r12.f2026b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0187, code lost:
        if (r5 >= r12.f2026b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
        r11.f2028d = r5 - r12.f2028d;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.j():void");
    }

    public final void k(b bVar) {
        bVar.f2027c = null;
        this.f2020a.a(bVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            k((b) arrayList.get(i6));
        }
        arrayList.clear();
    }

    public final int m(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList<b> arrayList = this.f2022c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i14 = bVar.f2025a;
            if (i14 == 8) {
                int i15 = bVar.f2026b;
                int i16 = bVar.f2028d;
                if (i15 < i16) {
                    i10 = i15;
                    i9 = i16;
                } else {
                    i9 = i15;
                    i10 = i16;
                }
                if (i6 < i10 || i6 > i9) {
                    if (i6 < i15) {
                        if (i7 == 1) {
                            bVar.f2026b = i15 + 1;
                            i11 = i16 + 1;
                        } else if (i7 == 2) {
                            bVar.f2026b = i15 - 1;
                            i11 = i16 - 1;
                        }
                        bVar.f2028d = i11;
                    }
                } else if (i10 == i15) {
                    if (i7 == 1) {
                        i13 = i16 + 1;
                    } else {
                        if (i7 == 2) {
                            i13 = i16 - 1;
                        }
                        i6++;
                    }
                    bVar.f2028d = i13;
                    i6++;
                } else {
                    if (i7 == 1) {
                        i12 = i15 + 1;
                    } else {
                        if (i7 == 2) {
                            i12 = i15 - 1;
                        }
                        i6--;
                    }
                    bVar.f2026b = i12;
                    i6--;
                }
            } else {
                int i17 = bVar.f2026b;
                if (i17 > i6) {
                    if (i7 == 1) {
                        i8 = i17 + 1;
                    } else if (i7 == 2) {
                        i8 = i17 - 1;
                    }
                    bVar.f2026b = i8;
                } else if (i14 == 1) {
                    i6 -= bVar.f2028d;
                } else if (i14 == 2) {
                    i6 += bVar.f2028d;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f2025a == 8) {
                int i18 = bVar2.f2028d;
                if (i18 != bVar2.f2026b && i18 >= 0) {
                }
                arrayList.remove(size2);
                k(bVar2);
            } else {
                if (bVar2.f2028d > 0) {
                }
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i6;
    }
}
