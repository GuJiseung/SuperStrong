package s2;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<C0088d> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5987b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0088d f5988a = new C0088d();

        @Override // android.animation.TypeEvaluator
        public final C0088d evaluate(float f6, C0088d c0088d, C0088d c0088d2) {
            C0088d c0088d3 = c0088d;
            C0088d c0088d4 = c0088d2;
            float f7 = c0088d3.f5991a;
            float f8 = 1.0f - f6;
            float f9 = (c0088d4.f5991a * f6) + (f7 * f8);
            float f10 = c0088d3.f5992b;
            float f11 = c0088d4.f5992b * f6;
            float f12 = c0088d3.f5993c;
            float f13 = f6 * c0088d4.f5993c;
            C0088d c0088d5 = this.f5988a;
            c0088d5.f5991a = f9;
            c0088d5.f5992b = f11 + (f10 * f8);
            c0088d5.f5993c = f13 + (f8 * f12);
            return c0088d5;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<d, C0088d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5989a = new b();

        public b() {
            super(C0088d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final C0088d get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(d dVar, C0088d c0088d) {
            dVar.setRevealInfo(c0088d);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f5990a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: s2.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0088d {

        /* renamed from: a  reason: collision with root package name */
        public float f5991a;

        /* renamed from: b  reason: collision with root package name */
        public float f5992b;

        /* renamed from: c  reason: collision with root package name */
        public float f5993c;

        public C0088d() {
        }

        public C0088d(float f6, float f7, float f8) {
            this.f5991a = f6;
            this.f5992b = f7;
            this.f5993c = f8;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0088d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i6);

    void setRevealInfo(C0088d c0088d);
}
