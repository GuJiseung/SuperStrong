package b4;

import a1.f0;
import org.json.JSONObject;
import s4.w;
import y3.j0;
@g4.e(c = "com.superstrong.android.viewmodel.LogVModel$getData$1", f = "LogVModel.kt", l = {30, 31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends g4.g implements k4.p<w, e4.d<? super c4.h>, Object> {

    /* renamed from: f  reason: collision with root package name */
    public int f2445f;

    /* renamed from: g  reason: collision with root package name */
    public /* synthetic */ Object f2446g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h f2447h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f2448i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f2449j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f2450k;

    @g4.e(c = "com.superstrong.android.viewmodel.LogVModel$getData$1$job1$1", f = "LogVModel.kt", l = {28}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends g4.g implements k4.p<w, e4.d<? super y3.c>, Object> {

        /* renamed from: f  reason: collision with root package name */
        public int f2451f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h f2452g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f2453h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f2454i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f2455j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, String str, String str2, String str3, e4.d<? super a> dVar) {
            super(2, dVar);
            this.f2452g = hVar;
            this.f2453h = str;
            this.f2454i = str2;
            this.f2455j = str3;
        }

        @Override // k4.p
        public final Object e(w wVar, e4.d<? super y3.c> dVar) {
            return ((a) g(wVar, dVar)).i(c4.h.f2763a);
        }

        @Override // g4.a
        public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
            return new a(this.f2452g, this.f2453h, this.f2454i, this.f2455j, dVar);
        }

        @Override // g4.a
        public final Object i(Object obj) {
            f4.a aVar = f4.a.COROUTINE_SUSPENDED;
            int i6 = this.f2451f;
            if (i6 != 0) {
                if (i6 == 1) {
                    f0.l(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f0.l(obj);
                j0 j0Var = this.f2452g.f2463f;
                y3.o oVar = new y3.o(this.f2453h);
                this.f2451f = 1;
                obj = j0Var.b(oVar, this.f2454i, this.f2455j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    @g4.e(c = "com.superstrong.android.viewmodel.LogVModel$getData$1$job2$1", f = "LogVModel.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends g4.g implements k4.p<w, e4.d<? super JSONObject>, Object> {

        /* renamed from: f  reason: collision with root package name */
        public int f2456f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h f2457g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f2458h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ String f2459i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f2460j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, String str, String str2, String str3, e4.d<? super b> dVar) {
            super(2, dVar);
            this.f2457g = hVar;
            this.f2458h = str;
            this.f2459i = str2;
            this.f2460j = str3;
        }

        @Override // k4.p
        public final Object e(w wVar, e4.d<? super JSONObject> dVar) {
            return ((b) g(wVar, dVar)).i(c4.h.f2763a);
        }

        @Override // g4.a
        public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
            return new b(this.f2457g, this.f2458h, this.f2459i, this.f2460j, dVar);
        }

        @Override // g4.a
        public final Object i(Object obj) {
            f4.a aVar = f4.a.COROUTINE_SUSPENDED;
            int i6 = this.f2456f;
            if (i6 != 0) {
                if (i6 == 1) {
                    f0.l(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f0.l(obj);
                j0 j0Var = this.f2457g.f2463f;
                y3.o oVar = new y3.o(this.f2458h);
                this.f2456f = 1;
                obj = j0Var.c(oVar, this.f2459i, this.f2460j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, String str2, String str3, e4.d<? super g> dVar) {
        super(2, dVar);
        this.f2447h = hVar;
        this.f2448i = str;
        this.f2449j = str2;
        this.f2450k = str3;
    }

    @Override // k4.p
    public final Object e(w wVar, e4.d<? super c4.h> dVar) {
        return ((g) g(wVar, dVar)).i(c4.h.f2763a);
    }

    @Override // g4.a
    public final e4.d<c4.h> g(Object obj, e4.d<?> dVar) {
        g gVar = new g(this.f2447h, this.f2448i, this.f2449j, this.f2450k, dVar);
        gVar.f2446g = obj;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    @Override // g4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.g.i(java.lang.Object):java.lang.Object");
    }
}
