package p;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public final p f5651d;

    /* renamed from: f  reason: collision with root package name */
    public int f5653f;

    /* renamed from: g  reason: collision with root package name */
    public int f5654g;

    /* renamed from: a  reason: collision with root package name */
    public p f5648a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5649b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5650c = false;

    /* renamed from: e  reason: collision with root package name */
    public int f5652e = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f5655h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f5656i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5657j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f5658k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f5659l = new ArrayList();

    public f(p pVar) {
        this.f5651d = pVar;
    }

    @Override // p.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f5659l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f5657j) {
                return;
            }
        }
        this.f5650c = true;
        p pVar = this.f5648a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f5649b) {
            this.f5651d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i6 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i6++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i6 == 1 && fVar.f5657j) {
            g gVar = this.f5656i;
            if (gVar != null) {
                if (!gVar.f5657j) {
                    return;
                }
                this.f5653f = this.f5655h * gVar.f5654g;
            }
            d(fVar.f5654g + this.f5653f);
        }
        p pVar2 = this.f5648a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f5658k.add(dVar);
        if (this.f5657j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f5659l.clear();
        this.f5658k.clear();
        this.f5657j = false;
        this.f5654g = 0;
        this.f5650c = false;
        this.f5649b = false;
    }

    public void d(int i6) {
        if (this.f5657j) {
            return;
        }
        this.f5657j = true;
        this.f5654g = i6;
        Iterator it = this.f5658k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5651d.f5674b.f5441k0);
        sb.append(":");
        sb.append(d0.d.b(this.f5652e));
        sb.append("(");
        if (this.f5657j) {
            obj = Integer.valueOf(this.f5654g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f5659l.size());
        sb.append(":d=");
        sb.append(this.f5658k.size());
        sb.append(">");
        return sb.toString();
    }
}
