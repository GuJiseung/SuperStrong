package d3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import x.f;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f3778a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3779b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3780c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3781d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3782e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3783f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3784g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3785h;

    /* renamed from: i  reason: collision with root package name */
    public final float f3786i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3787j;

    /* renamed from: k  reason: collision with root package name */
    public float f3788k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3789l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3790m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f3791n;

    /* loaded from: classes.dex */
    public class a extends f.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.c f3792a;

        public a(androidx.activity.result.c cVar) {
            this.f3792a = cVar;
        }

        @Override // x.f.e
        public final void c(int i6) {
            d.this.f3790m = true;
            this.f3792a.w(i6);
        }

        @Override // x.f.e
        public final void d(Typeface typeface) {
            d dVar = d.this;
            dVar.f3791n = Typeface.create(typeface, dVar.f3780c);
            dVar.f3790m = true;
            this.f3792a.x(dVar.f3791n, false);
        }
    }

    public d(Context context, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i6, c.b.f2663g0);
        this.f3788k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3787j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f3780c = obtainStyledAttributes.getInt(2, 0);
        this.f3781d = obtainStyledAttributes.getInt(1, 1);
        int i7 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f3789l = obtainStyledAttributes.getResourceId(i7, 0);
        this.f3779b = obtainStyledAttributes.getString(i7);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3778a = c.a(context, obtainStyledAttributes, 6);
        this.f3782e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3783f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f3784g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i6, c.b.U);
        this.f3785h = obtainStyledAttributes2.hasValue(0);
        this.f3786i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f3791n;
        int i6 = this.f3780c;
        if (typeface == null && (str = this.f3779b) != null) {
            this.f3791n = Typeface.create(str, i6);
        }
        if (this.f3791n == null) {
            int i7 = this.f3781d;
            this.f3791n = i7 != 1 ? i7 != 2 ? i7 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f3791n = Typeface.create(this.f3791n, i6);
        }
    }

    public final Typeface b(Context context) {
        if (this.f3790m) {
            return this.f3791n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a6 = x.f.a(context, this.f3789l);
                this.f3791n = a6;
                if (a6 != null) {
                    this.f3791n = Typeface.create(a6, this.f3780c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f3779b, e6);
            }
        }
        a();
        this.f3790m = true;
        return this.f3791n;
    }

    public final void c(Context context, androidx.activity.result.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i6 = this.f3789l;
        if (i6 == 0) {
            this.f3790m = true;
        }
        if (this.f3790m) {
            cVar.x(this.f3791n, true);
            return;
        }
        try {
            a aVar = new a(cVar);
            ThreadLocal<TypedValue> threadLocal = x.f.f6627a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                x.f.b(context, i6, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f3790m = true;
            cVar.w(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f3779b, e6);
            this.f3790m = true;
            cVar.w(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f3789l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = x.f.f6627a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = x.f.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, androidx.activity.result.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f3787j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f3778a;
        textPaint.setShadowLayer(this.f3784g, this.f3782e, this.f3783f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, androidx.activity.result.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f3791n);
        c(context, new e(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z5;
        float f6;
        Typeface a6 = g.a(context.getResources().getConfiguration(), typeface);
        if (a6 != null) {
            typeface = a6;
        }
        textPaint.setTypeface(typeface);
        int i6 = (~typeface.getStyle()) & this.f3780c;
        if ((i6 & 1) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        textPaint.setFakeBoldText(z5);
        if ((i6 & 2) != 0) {
            f6 = -0.25f;
        } else {
            f6 = 0.0f;
        }
        textPaint.setTextSkewX(f6);
        textPaint.setTextSize(this.f3788k);
        if (this.f3785h) {
            textPaint.setLetterSpacing(this.f3786i);
        }
    }
}
