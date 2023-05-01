package j2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.superstrong.android.R;
import d3.d;
import h3.f;
import j2.b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import z2.k;
import z2.n;
/* loaded from: classes.dex */
public final class a extends Drawable implements k.b {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f4685b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4686c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4687d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f4688e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4689f;

    /* renamed from: g  reason: collision with root package name */
    public float f4690g;

    /* renamed from: h  reason: collision with root package name */
    public float f4691h;

    /* renamed from: i  reason: collision with root package name */
    public int f4692i;

    /* renamed from: j  reason: collision with root package name */
    public float f4693j;

    /* renamed from: k  reason: collision with root package name */
    public float f4694k;

    /* renamed from: l  reason: collision with root package name */
    public float f4695l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<View> f4696m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<FrameLayout> f4697n;

    public a(Context context, b.a aVar) {
        FrameLayout frameLayout;
        d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f4685b = weakReference;
        n.c(context, n.f6999b, "Theme.MaterialComponents");
        this.f4688e = new Rect();
        f fVar = new f();
        this.f4686c = fVar;
        k kVar = new k(this);
        this.f4687d = kVar;
        TextPaint textPaint = kVar.f6990a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = weakReference.get();
        if (context3 != null && kVar.f6995f != (dVar = new d(context3, 2131952104)) && (context2 = weakReference.get()) != null) {
            kVar.b(dVar, context2);
            h();
        }
        b bVar = new b(context, aVar);
        this.f4689f = bVar;
        b.a aVar2 = bVar.f4699b;
        this.f4692i = ((int) Math.pow(10.0d, aVar2.f4708g - 1.0d)) - 1;
        kVar.f6993d = true;
        h();
        invalidateSelf();
        kVar.f6993d = true;
        h();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(aVar2.f4704c.intValue());
        if (fVar.f4446b.f4469c != valueOf) {
            fVar.k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(aVar2.f4705d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f4696m;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f4696m.get();
            WeakReference<FrameLayout> weakReference3 = this.f4697n;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            g(view, frameLayout);
        }
        h();
        setVisible(aVar2.f4714m.booleanValue(), false);
    }

    @Override // z2.k.b
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int e6 = e();
        int i6 = this.f4692i;
        b bVar = this.f4689f;
        if (e6 <= i6) {
            return NumberFormat.getInstance(bVar.f4699b.f4709h).format(e());
        }
        Context context = this.f4685b.get();
        if (context == null) {
            return "";
        }
        return String.format(bVar.f4699b.f4709h, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f4692i), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean f6 = f();
        b bVar = this.f4689f;
        if (f6) {
            if (bVar.f4699b.f4711j == 0 || (context = this.f4685b.get()) == null) {
                return null;
            }
            int e6 = e();
            int i6 = this.f4692i;
            b.a aVar = bVar.f4699b;
            if (e6 <= i6) {
                return context.getResources().getQuantityString(aVar.f4711j, e(), Integer.valueOf(e()));
            }
            return context.getString(aVar.f4712k, Integer.valueOf(i6));
        }
        return bVar.f4699b.f4710i;
    }

    public final FrameLayout d() {
        WeakReference<FrameLayout> weakReference = this.f4697n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f4686c.draw(canvas);
            if (f()) {
                Rect rect = new Rect();
                String b6 = b();
                k kVar = this.f4687d;
                kVar.f6990a.getTextBounds(b6, 0, b6.length(), rect);
                canvas.drawText(b6, this.f4690g, this.f4691h + (rect.height() / 2), kVar.f6990a);
            }
        }
    }

    public final int e() {
        if (f()) {
            return this.f4689f.f4699b.f4707f;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f4689f.f4699b.f4707f != -1) {
            return true;
        }
        return false;
    }

    public final void g(View view, FrameLayout frameLayout) {
        this.f4696m = new WeakReference<>(view);
        this.f4697n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4689f.f4699b.f4706e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4688e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4688e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
        if (f0.g0.e.d(r1) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (f0.g0.e.d(r1) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
        r1 = ((r5.left - r11.f4694k) + r0) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0101, code lost:
        r1 = ((r5.right + r11.f4694k) - r0) - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a.h():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, z2.k.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        b bVar = this.f4689f;
        bVar.f4698a.f4706e = i6;
        bVar.f4699b.f4706e = i6;
        this.f4687d.f6990a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
