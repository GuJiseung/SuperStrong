package h3;

import a1.f0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final f0 f4488a;

    /* renamed from: b  reason: collision with root package name */
    public final f0 f4489b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f4490c;

    /* renamed from: d  reason: collision with root package name */
    public final f0 f4491d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4492e;

    /* renamed from: f  reason: collision with root package name */
    public final c f4493f;

    /* renamed from: g  reason: collision with root package name */
    public final c f4494g;

    /* renamed from: h  reason: collision with root package name */
    public final c f4495h;

    /* renamed from: i  reason: collision with root package name */
    public final e f4496i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4497j;

    /* renamed from: k  reason: collision with root package name */
    public final e f4498k;

    /* renamed from: l  reason: collision with root package name */
    public final e f4499l;

    public i() {
        this.f4488a = new h();
        this.f4489b = new h();
        this.f4490c = new h();
        this.f4491d = new h();
        this.f4492e = new h3.a(0.0f);
        this.f4493f = new h3.a(0.0f);
        this.f4494g = new h3.a(0.0f);
        this.f4495h = new h3.a(0.0f);
        this.f4496i = new e();
        this.f4497j = new e();
        this.f4498k = new e();
        this.f4499l = new e();
    }

    public static a a(Context context, int i6, int i7, h3.a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i6);
        if (i7 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i7);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(c.b.f2653b0);
        try {
            int i8 = obtainStyledAttributes.getInt(0, 0);
            int i9 = obtainStyledAttributes.getInt(3, i8);
            int i10 = obtainStyledAttributes.getInt(4, i8);
            int i11 = obtainStyledAttributes.getInt(2, i8);
            int i12 = obtainStyledAttributes.getInt(1, i8);
            c c6 = c(obtainStyledAttributes, 5, aVar);
            c c7 = c(obtainStyledAttributes, 8, c6);
            c c8 = c(obtainStyledAttributes, 9, c6);
            c c9 = c(obtainStyledAttributes, 7, c6);
            c c10 = c(obtainStyledAttributes, 6, c6);
            a aVar2 = new a();
            f0 j5 = androidx.activity.k.j(i9);
            aVar2.f4500a = j5;
            float b6 = a.b(j5);
            if (b6 != -1.0f) {
                aVar2.f4504e = new h3.a(b6);
            }
            aVar2.f4504e = c7;
            f0 j6 = androidx.activity.k.j(i10);
            aVar2.f4501b = j6;
            float b7 = a.b(j6);
            if (b7 != -1.0f) {
                aVar2.f4505f = new h3.a(b7);
            }
            aVar2.f4505f = c8;
            f0 j7 = androidx.activity.k.j(i11);
            aVar2.f4502c = j7;
            float b8 = a.b(j7);
            if (b8 != -1.0f) {
                aVar2.f4506g = new h3.a(b8);
            }
            aVar2.f4506g = c9;
            f0 j8 = androidx.activity.k.j(i12);
            aVar2.f4503d = j8;
            float b9 = a.b(j8);
            if (b9 != -1.0f) {
                aVar2.f4507h = new h3.a(b9);
            }
            aVar2.f4507h = c10;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i6, int i7) {
        h3.a aVar = new h3.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.T, i6, i7);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i6, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i6);
        if (peekValue == null) {
            return cVar;
        }
        int i7 = peekValue.type;
        return i7 == 5 ? new h3.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i7 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z5 = this.f4499l.getClass().equals(e.class) && this.f4497j.getClass().equals(e.class) && this.f4496i.getClass().equals(e.class) && this.f4498k.getClass().equals(e.class);
        float a6 = this.f4492e.a(rectF);
        return z5 && ((this.f4493f.a(rectF) > a6 ? 1 : (this.f4493f.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4495h.a(rectF) > a6 ? 1 : (this.f4495h.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f4494g.a(rectF) > a6 ? 1 : (this.f4494g.a(rectF) == a6 ? 0 : -1)) == 0) && ((this.f4489b instanceof h) && (this.f4488a instanceof h) && (this.f4490c instanceof h) && (this.f4491d instanceof h));
    }

    public final i e(float f6) {
        a aVar = new a(this);
        aVar.f4504e = new h3.a(f6);
        aVar.f4505f = new h3.a(f6);
        aVar.f4506g = new h3.a(f6);
        aVar.f4507h = new h3.a(f6);
        return new i(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public f0 f4500a;

        /* renamed from: b  reason: collision with root package name */
        public f0 f4501b;

        /* renamed from: c  reason: collision with root package name */
        public f0 f4502c;

        /* renamed from: d  reason: collision with root package name */
        public f0 f4503d;

        /* renamed from: e  reason: collision with root package name */
        public c f4504e;

        /* renamed from: f  reason: collision with root package name */
        public c f4505f;

        /* renamed from: g  reason: collision with root package name */
        public c f4506g;

        /* renamed from: h  reason: collision with root package name */
        public c f4507h;

        /* renamed from: i  reason: collision with root package name */
        public final e f4508i;

        /* renamed from: j  reason: collision with root package name */
        public final e f4509j;

        /* renamed from: k  reason: collision with root package name */
        public final e f4510k;

        /* renamed from: l  reason: collision with root package name */
        public final e f4511l;

        public a() {
            this.f4500a = new h();
            this.f4501b = new h();
            this.f4502c = new h();
            this.f4503d = new h();
            this.f4504e = new h3.a(0.0f);
            this.f4505f = new h3.a(0.0f);
            this.f4506g = new h3.a(0.0f);
            this.f4507h = new h3.a(0.0f);
            this.f4508i = new e();
            this.f4509j = new e();
            this.f4510k = new e();
            this.f4511l = new e();
        }

        public static float b(f0 f0Var) {
            if (f0Var instanceof h) {
                return ((h) f0Var).f4487f;
            }
            if (f0Var instanceof d) {
                return ((d) f0Var).f4444f;
            }
            return -1.0f;
        }

        public final i a() {
            return new i(this);
        }

        public a(i iVar) {
            this.f4500a = new h();
            this.f4501b = new h();
            this.f4502c = new h();
            this.f4503d = new h();
            this.f4504e = new h3.a(0.0f);
            this.f4505f = new h3.a(0.0f);
            this.f4506g = new h3.a(0.0f);
            this.f4507h = new h3.a(0.0f);
            this.f4508i = new e();
            this.f4509j = new e();
            this.f4510k = new e();
            this.f4511l = new e();
            this.f4500a = iVar.f4488a;
            this.f4501b = iVar.f4489b;
            this.f4502c = iVar.f4490c;
            this.f4503d = iVar.f4491d;
            this.f4504e = iVar.f4492e;
            this.f4505f = iVar.f4493f;
            this.f4506g = iVar.f4494g;
            this.f4507h = iVar.f4495h;
            this.f4508i = iVar.f4496i;
            this.f4509j = iVar.f4497j;
            this.f4510k = iVar.f4498k;
            this.f4511l = iVar.f4499l;
        }
    }

    public i(a aVar) {
        this.f4488a = aVar.f4500a;
        this.f4489b = aVar.f4501b;
        this.f4490c = aVar.f4502c;
        this.f4491d = aVar.f4503d;
        this.f4492e = aVar.f4504e;
        this.f4493f = aVar.f4505f;
        this.f4494g = aVar.f4506g;
        this.f4495h = aVar.f4507h;
        this.f4496i = aVar.f4508i;
        this.f4497j = aVar.f4509j;
        this.f4498k = aVar.f4510k;
        this.f4499l = aVar.f4511l;
    }
}
