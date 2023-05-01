package o2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.f;
import h3.i;
import h3.m;
import java.util.WeakHashMap;
import z.a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f5589a;

    /* renamed from: b  reason: collision with root package name */
    public i f5590b;

    /* renamed from: c  reason: collision with root package name */
    public int f5591c;

    /* renamed from: d  reason: collision with root package name */
    public int f5592d;

    /* renamed from: e  reason: collision with root package name */
    public int f5593e;

    /* renamed from: f  reason: collision with root package name */
    public int f5594f;

    /* renamed from: g  reason: collision with root package name */
    public int f5595g;

    /* renamed from: h  reason: collision with root package name */
    public int f5596h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f5597i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f5598j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f5599k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f5600l;

    /* renamed from: m  reason: collision with root package name */
    public f f5601m;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5605q;
    public RippleDrawable s;

    /* renamed from: t  reason: collision with root package name */
    public int f5607t;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5602n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5603o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5604p = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5606r = true;

    public a(MaterialButton materialButton, i iVar) {
        this.f5589a = materialButton;
        this.f5590b = iVar;
    }

    public final m a() {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (m) (this.s.getNumberOfLayers() > 2 ? this.s.getDrawable(2) : this.s.getDrawable(1));
    }

    public final f b(boolean z5) {
        RippleDrawable rippleDrawable = this.s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f5590b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i6, int i7) {
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        MaterialButton materialButton = this.f5589a;
        int f6 = g0.e.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e6 = g0.e.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i8 = this.f5593e;
        int i9 = this.f5594f;
        this.f5594f = i7;
        this.f5593e = i6;
        if (!this.f5603o) {
            e();
        }
        g0.e.k(materialButton, f6, (paddingTop + i6) - i8, e6, (paddingBottom + i7) - i9);
    }

    public final void e() {
        int i6;
        f fVar = new f(this.f5590b);
        MaterialButton materialButton = this.f5589a;
        fVar.i(materialButton.getContext());
        a.b.h(fVar, this.f5598j);
        PorterDuff.Mode mode = this.f5597i;
        if (mode != null) {
            a.b.i(fVar, mode);
        }
        ColorStateList colorStateList = this.f5599k;
        fVar.f4446b.f4477k = this.f5596h;
        fVar.invalidateSelf();
        f.b bVar = fVar.f4446b;
        if (bVar.f4470d != colorStateList) {
            bVar.f4470d = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
        f fVar2 = new f(this.f5590b);
        fVar2.setTint(0);
        float f6 = this.f5596h;
        if (this.f5602n) {
            i6 = c.a.m(materialButton, R.attr.colorSurface);
        } else {
            i6 = 0;
        }
        fVar2.f4446b.f4477k = f6;
        fVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i6);
        f.b bVar2 = fVar2.f4446b;
        if (bVar2.f4470d != valueOf) {
            bVar2.f4470d = valueOf;
            fVar2.onStateChange(fVar2.getState());
        }
        f fVar3 = new f(this.f5590b);
        this.f5601m = fVar3;
        a.b.g(fVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(e3.a.c(this.f5600l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f5591c, this.f5593e, this.f5592d, this.f5594f), this.f5601m);
        this.s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b6 = b(false);
        if (b6 != null) {
            b6.j(this.f5607t);
            b6.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i6 = 0;
        f b6 = b(false);
        f b7 = b(true);
        if (b6 != null) {
            ColorStateList colorStateList = this.f5599k;
            b6.f4446b.f4477k = this.f5596h;
            b6.invalidateSelf();
            f.b bVar = b6.f4446b;
            if (bVar.f4470d != colorStateList) {
                bVar.f4470d = colorStateList;
                b6.onStateChange(b6.getState());
            }
            if (b7 != null) {
                float f6 = this.f5596h;
                if (this.f5602n) {
                    i6 = c.a.m(this.f5589a, R.attr.colorSurface);
                }
                b7.f4446b.f4477k = f6;
                b7.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i6);
                f.b bVar2 = b7.f4446b;
                if (bVar2.f4470d != valueOf) {
                    bVar2.f4470d = valueOf;
                    b7.onStateChange(b7.getState());
                }
            }
        }
    }
}
