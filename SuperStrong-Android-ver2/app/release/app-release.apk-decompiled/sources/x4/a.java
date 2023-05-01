package x4;

import java.util.ArrayList;
import java.util.Collections;
import v4.b0;
import v4.c;
import v4.p;
import v4.r;
import v4.u;
import v4.v;
import v4.x;
import w4.e;
import z4.f;
/* loaded from: classes.dex */
public final class a implements r {
    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static b0 d(b0 b0Var) {
        if (b0Var != null && b0Var.f6342h != null) {
            b0.a aVar = new b0.a(b0Var);
            aVar.f6355g = null;
            return aVar.a();
        }
        return b0Var;
    }

    @Override // v4.r
    public final b0 a(f fVar) {
        p pVar;
        System.currentTimeMillis();
        x xVar = fVar.f7084e;
        b bVar = new b(xVar, null);
        if (xVar != null) {
            c cVar = xVar.f6561f;
            if (cVar == null) {
                cVar = c.a(xVar.f6558c);
                xVar.f6561f = cVar;
            }
            if (cVar.f6371j) {
                bVar = new b(null, null);
            }
        }
        x xVar2 = bVar.f6719a;
        b0 b0Var = bVar.f6720b;
        if (xVar2 == null && b0Var == null) {
            b0.a aVar = new b0.a();
            aVar.f6349a = fVar.f7084e;
            aVar.f6350b = v.f6541d;
            aVar.f6351c = 504;
            aVar.f6352d = "Unsatisfiable Request (only-if-cached)";
            aVar.f6355g = e.f6596d;
            aVar.f6359k = -1L;
            aVar.f6360l = System.currentTimeMillis();
            return aVar.a();
        } else if (xVar2 == null) {
            b0Var.getClass();
            b0.a aVar2 = new b0.a(b0Var);
            b0 d6 = d(b0Var);
            if (d6 != null) {
                b0.a.b("cacheResponse", d6);
            }
            aVar2.f6357i = d6;
            return aVar2.a();
        } else {
            b0 a6 = fVar.a(xVar2);
            if (b0Var != null) {
                if (a6.f6338d == 304) {
                    b0.a aVar3 = new b0.a(b0Var);
                    ArrayList arrayList = new ArrayList(20);
                    p pVar2 = b0Var.f6341g;
                    int length = pVar2.f6458a.length / 2;
                    int i6 = 0;
                    while (true) {
                        pVar = a6.f6341g;
                        if (i6 >= length) {
                            break;
                        }
                        String d7 = pVar2.d(i6);
                        String g2 = pVar2.g(i6);
                        if ((!"Warning".equalsIgnoreCase(d7) || !g2.startsWith("1")) && (b(d7) || !c(d7) || pVar.c(d7) == null)) {
                            w4.a.f6589a.getClass();
                            arrayList.add(d7);
                            arrayList.add(g2.trim());
                        }
                        i6++;
                    }
                    int length2 = pVar.f6458a.length / 2;
                    for (int i7 = 0; i7 < length2; i7++) {
                        String d8 = pVar.d(i7);
                        if (!b(d8) && c(d8)) {
                            u.a aVar4 = w4.a.f6589a;
                            String g6 = pVar.g(i7);
                            aVar4.getClass();
                            arrayList.add(d8);
                            arrayList.add(g6.trim());
                        }
                    }
                    p.a aVar5 = new p.a();
                    Collections.addAll(aVar5.f6459a, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    aVar3.f6354f = aVar5;
                    aVar3.f6359k = a6.f6346l;
                    aVar3.f6360l = a6.f6347m;
                    b0 d9 = d(b0Var);
                    if (d9 != null) {
                        b0.a.b("cacheResponse", d9);
                    }
                    aVar3.f6357i = d9;
                    b0 d10 = d(a6);
                    if (d10 != null) {
                        b0.a.b("networkResponse", d10);
                    }
                    aVar3.f6356h = d10;
                    aVar3.a();
                    a6.f6342h.close();
                    throw null;
                }
                e.b(b0Var.f6342h);
            }
            b0.a aVar6 = new b0.a(a6);
            b0 d11 = d(b0Var);
            if (d11 != null) {
                b0.a.b("cacheResponse", d11);
            }
            aVar6.f6357i = d11;
            b0 d12 = d(a6);
            if (d12 != null) {
                b0.a.b("networkResponse", d12);
            }
            aVar6.f6356h = d12;
            return aVar6.a();
        }
    }
}
