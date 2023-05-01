package androidx.fragment.app;

import androidx.lifecycle.j;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: b  reason: collision with root package name */
    public int f1500b;

    /* renamed from: c  reason: collision with root package name */
    public int f1501c;

    /* renamed from: d  reason: collision with root package name */
    public int f1502d;

    /* renamed from: e  reason: collision with root package name */
    public int f1503e;

    /* renamed from: f  reason: collision with root package name */
    public int f1504f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1505g;

    /* renamed from: h  reason: collision with root package name */
    public String f1506h;

    /* renamed from: i  reason: collision with root package name */
    public int f1507i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1508j;

    /* renamed from: k  reason: collision with root package name */
    public int f1509k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1510l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f1511m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f1512n;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f1499a = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public boolean f1513o = false;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1514a;

        /* renamed from: b  reason: collision with root package name */
        public o f1515b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1516c;

        /* renamed from: d  reason: collision with root package name */
        public int f1517d;

        /* renamed from: e  reason: collision with root package name */
        public int f1518e;

        /* renamed from: f  reason: collision with root package name */
        public int f1519f;

        /* renamed from: g  reason: collision with root package name */
        public int f1520g;

        /* renamed from: h  reason: collision with root package name */
        public j.c f1521h;

        /* renamed from: i  reason: collision with root package name */
        public j.c f1522i;

        public a() {
        }

        public a(int i6, o oVar) {
            this.f1514a = i6;
            this.f1515b = oVar;
            this.f1516c = false;
            j.c cVar = j.c.RESUMED;
            this.f1521h = cVar;
            this.f1522i = cVar;
        }

        public a(int i6, o oVar, int i7) {
            this.f1514a = i6;
            this.f1515b = oVar;
            this.f1516c = true;
            j.c cVar = j.c.RESUMED;
            this.f1521h = cVar;
            this.f1522i = cVar;
        }

        public a(o oVar, j.c cVar) {
            this.f1514a = 10;
            this.f1515b = oVar;
            this.f1516c = false;
            this.f1521h = oVar.M;
            this.f1522i = cVar;
        }
    }

    public final void b(a aVar) {
        this.f1499a.add(aVar);
        aVar.f1517d = this.f1500b;
        aVar.f1518e = this.f1501c;
        aVar.f1519f = this.f1502d;
        aVar.f1520g = this.f1503e;
    }
}
