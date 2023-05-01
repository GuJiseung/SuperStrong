package a1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import f0.g0;
import f0.r0;
import java.util.HashMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class b extends a1.i {
    public static final c A;
    public static final d B;
    public static final e C;
    public static final f D;

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f4y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z  reason: collision with root package name */
    public static final C0000b f5z;

    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f6a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f6a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f6a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f6a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* renamed from: a1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0000b extends Property<i, PointF> {
        public C0000b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f9a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f10b = round;
            int i6 = iVar2.f14f + 1;
            iVar2.f14f = i6;
            if (i6 == iVar2.f15g) {
                u.a(iVar2.f13e, iVar2.f9a, round, iVar2.f11c, iVar2.f12d);
                iVar2.f14f = 0;
                iVar2.f15g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f11c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f12d = round;
            int i6 = iVar2.f15g + 1;
            iVar2.f15g = i6;
            if (iVar2.f14f == i6) {
                u.a(iVar2.f13e, iVar2.f9a, iVar2.f10b, iVar2.f11c, round);
                iVar2.f14f = 0;
                iVar2.f15g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            u.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends l {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8b;

        public h(ViewGroup viewGroup) {
            this.f8b = viewGroup;
        }

        @Override // a1.l, a1.i.d
        public final void b() {
            t.a(this.f8b, false);
        }

        @Override // a1.l, a1.i.d
        public final void c() {
            t.a(this.f8b, true);
        }

        @Override // a1.l, a1.i.d
        public final void d() {
            t.a(this.f8b, false);
            this.f7a = true;
        }

        @Override // a1.i.d
        public final void e(a1.i iVar) {
            if (!this.f7a) {
                t.a(this.f8b, false);
            }
            iVar.y(this);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f9a;

        /* renamed from: b  reason: collision with root package name */
        public int f10b;

        /* renamed from: c  reason: collision with root package name */
        public int f11c;

        /* renamed from: d  reason: collision with root package name */
        public int f12d;

        /* renamed from: e  reason: collision with root package name */
        public final View f13e;

        /* renamed from: f  reason: collision with root package name */
        public int f14f;

        /* renamed from: g  reason: collision with root package name */
        public int f15g;

        public i(View view) {
            this.f13e = view;
        }
    }

    static {
        new a();
        f5z = new C0000b();
        A = new c();
        B = new d();
        C = new e();
        D = new f();
    }

    public final void K(q qVar) {
        WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
        View view = qVar.f98b;
        if (g0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = qVar.f97a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // a1.i
    public final void d(q qVar) {
        K(qVar);
    }

    @Override // a1.i
    public final void g(q qVar) {
        K(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // a1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r19, a1.q r20, a1.q r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.l(android.view.ViewGroup, a1.q, a1.q):android.animation.Animator");
    }

    @Override // a1.i
    public final String[] s() {
        return f4y;
    }
}
