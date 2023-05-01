package g5;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import v4.n;
import v4.p;
import v4.q;
import v4.t;
import v4.x;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f4330l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f4331m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f4332a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.q f4333b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f4334c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public q.a f4335d;

    /* renamed from: e  reason: collision with root package name */
    public final x.a f4336e = new x.a();

    /* renamed from: f  reason: collision with root package name */
    public final p.a f4337f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public v4.s f4338g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4339h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final t.a f4340i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final n.a f4341j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public v4.a0 f4342k;

    /* loaded from: classes.dex */
    public static class a extends v4.a0 {

        /* renamed from: a  reason: collision with root package name */
        public final v4.a0 f4343a;

        /* renamed from: b  reason: collision with root package name */
        public final v4.s f4344b;

        public a(v4.a0 a0Var, v4.s sVar) {
            this.f4343a = a0Var;
            this.f4344b = sVar;
        }

        @Override // v4.a0
        public final long a() {
            return this.f4343a.a();
        }

        @Override // v4.a0
        public final v4.s b() {
            return this.f4344b;
        }

        @Override // v4.a0
        public final void c(f5.f fVar) {
            this.f4343a.c(fVar);
        }
    }

    public z(String str, v4.q qVar, @Nullable String str2, @Nullable v4.p pVar, @Nullable v4.s sVar, boolean z5, boolean z6, boolean z7) {
        this.f4332a = str;
        this.f4333b = qVar;
        this.f4334c = str2;
        this.f4338g = sVar;
        this.f4339h = z5;
        this.f4337f = pVar != null ? pVar.e() : new p.a();
        if (z6) {
            this.f4341j = new n.a();
        } else if (z7) {
            t.a aVar = new t.a();
            this.f4340i = aVar;
            v4.s sVar2 = v4.t.f6484f;
            if (sVar2 == null) {
                throw new NullPointerException("type == null");
            }
            if (sVar2.f6481b.equals("multipart")) {
                aVar.f6493b = sVar2;
                return;
            }
            throw new IllegalArgumentException("multipart != " + sVar2);
        }
    }

    public final void a(String str, String str2, boolean z5) {
        n.a aVar = this.f4341j;
        aVar.getClass();
        ArrayList arrayList = aVar.f6453b;
        ArrayList arrayList2 = aVar.f6452a;
        if (z5) {
            if (str != null) {
                arrayList2.add(v4.q.c(str, true));
                arrayList.add(v4.q.c(str2, true));
                return;
            }
            throw new NullPointerException("name == null");
        } else if (str != null) {
            arrayList2.add(v4.q.c(str, false));
            arrayList.add(v4.q.c(str2, false));
        } else {
            throw new NullPointerException("name == null");
        }
    }

    public final void b(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f4338g = v4.s.a(str2);
                return;
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e6);
            }
        }
        p.a aVar = this.f4337f;
        aVar.getClass();
        v4.p.a(str);
        v4.p.b(str2, str);
        aVar.a(str, str2);
    }

    public final void c(v4.p pVar, v4.a0 a0Var) {
        t.a aVar = this.f4340i;
        aVar.getClass();
        if (a0Var != null) {
            if (pVar != null && pVar.c("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (pVar != null && pVar.c("Content-Length") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
            aVar.f6494c.add(new t.b(pVar, a0Var));
            return;
        }
        throw new NullPointerException("body == null");
    }

    public final void d(String str, @Nullable String str2, boolean z5) {
        q.a aVar;
        String str3 = this.f4334c;
        String str4 = null;
        if (str3 != null) {
            v4.q qVar = this.f4333b;
            qVar.getClass();
            try {
                aVar = new q.a();
                aVar.b(qVar, str3);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            this.f4335d = aVar;
            if (aVar != null) {
                this.f4334c = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + qVar + ", Relative: " + this.f4334c);
            }
        }
        if (z5) {
            q.a aVar2 = this.f4335d;
            if (str != null) {
                if (aVar2.f6476g == null) {
                    aVar2.f6476g = new ArrayList();
                }
                aVar2.f6476g.add(v4.q.b(str, " \"'<>#&=", true, false, true, true));
                ArrayList arrayList = aVar2.f6476g;
                if (str2 != null) {
                    str4 = v4.q.b(str2, " \"'<>#&=", true, false, true, true);
                }
                arrayList.add(str4);
                return;
            }
            aVar2.getClass();
            throw new NullPointerException("encodedName == null");
        }
        q.a aVar3 = this.f4335d;
        if (str != null) {
            if (aVar3.f6476g == null) {
                aVar3.f6476g = new ArrayList();
            }
            aVar3.f6476g.add(v4.q.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            ArrayList arrayList2 = aVar3.f6476g;
            if (str2 != null) {
                str4 = v4.q.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            }
            arrayList2.add(str4);
            return;
        }
        aVar3.getClass();
        throw new NullPointerException("name == null");
    }
}
