package b1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import z.a;
/* loaded from: classes.dex */
public final class d extends f implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    public final b f2276c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f2277d;

    /* renamed from: e  reason: collision with root package name */
    public e f2278e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<b1.c> f2279f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2280g;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            d.this.scheduleSelf(runnable, j5);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f2282a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f2283b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Animator> f2284c;

        /* renamed from: d  reason: collision with root package name */
        public l.b<Animator, String> f2285d;

        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f2286a;

        public c(Drawable.ConstantState constantState) {
            this.f2286a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f2286a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f2286a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f2286a.newDrawable();
            dVar.f2288b = newDrawable;
            newDrawable.setCallback(dVar.f2280g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f2286a.newDrawable(resources);
            dVar.f2288b = newDrawable;
            newDrawable.setCallback(dVar.f2280g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f2286a.newDrawable(resources, theme);
            dVar.f2288b = newDrawable;
            newDrawable.setCallback(dVar.f2280g);
            return dVar;
        }
    }

    public d() {
        this(null);
    }

    public d(Context context) {
        this.f2278e = null;
        this.f2279f = null;
        a aVar = new a();
        this.f2280g = aVar;
        this.f2277d = context;
        this.f2276c = new b(aVar);
    }

    @Override // b1.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f2276c;
        bVar.f2282a.draw(canvas);
        if (bVar.f2283b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.C0102a.a(drawable);
        }
        return this.f2276c.f2282a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2276c.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f2276c.f2282a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2288b != null) {
            return new c(this.f2288b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2276c.f2282a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2276c.f2282a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.getOpacity() : this.f2276c.f2282a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r3.f2283b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r3.f2283b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        r3.f2283b.playTogether(r3.f2284c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) {
        /*
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.f2288b
            if (r0 == 0) goto L8
            z.a.b.d(r0, r10, r11, r12, r13)
            return
        L8:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            b1.d$b r3 = r9.f2276c
            if (r0 == r2) goto Lc5
            int r4 = r11.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc5
        L1f:
            r4 = 2
            if (r0 != r4) goto Lbf
            java.lang.String r0 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L65
            int[] r0 = b1.a.f2272e
            android.content.res.TypedArray r0 = x.k.e(r10, r13, r12, r0)
            int r4 = r0.getResourceId(r6, r6)
            if (r4 == 0) goto Lbc
            b1.g r7 = new b1.g
            r7.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r8 = x.f.f6627a
            android.graphics.drawable.Drawable r4 = x.f.a.a(r10, r4, r13)
            r7.f2288b = r4
            b1.g$h r4 = new b1.g$h
            android.graphics.drawable.Drawable r8 = r7.f2288b
            android.graphics.drawable.Drawable$ConstantState r8 = r8.getConstantState()
            r4.<init>(r8)
            r7.f2294g = r6
            b1.d$a r4 = r9.f2280g
            r7.setCallback(r4)
            b1.g r4 = r3.f2282a
            if (r4 == 0) goto L62
            r4.setCallback(r5)
        L62:
            r3.f2282a = r7
            goto Lbc
        L65:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lbf
            int[] r0 = b1.a.f2273f
            android.content.res.TypedArray r0 = r10.obtainAttributes(r12, r0)
            java.lang.String r4 = r0.getString(r6)
            int r6 = r0.getResourceId(r2, r6)
            if (r6 == 0) goto Lbc
            android.content.Context r7 = r9.f2277d
            if (r7 == 0) goto Lb1
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            b1.g r7 = r3.f2282a
            b1.g$g r7 = r7.f2290c
            b1.g$f r7 = r7.f2342b
            l.b<java.lang.String, java.lang.Object> r7 = r7.f2340o
            java.lang.Object r5 = r7.getOrDefault(r4, r5)
            r6.setTarget(r5)
            java.util.ArrayList<android.animation.Animator> r5 = r3.f2284c
            if (r5 != 0) goto La6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r3.f2284c = r5
            l.b r5 = new l.b
            r5.<init>()
            r3.f2285d = r5
        La6:
            java.util.ArrayList<android.animation.Animator> r5 = r3.f2284c
            r5.add(r6)
            l.b<android.animation.Animator, java.lang.String> r3 = r3.f2285d
            r3.put(r6, r4)
            goto Lbc
        Lb1:
            r0.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Context can't be null when inflating animators"
            r10.<init>(r11)
            throw r10
        Lbc:
            r0.recycle()
        Lbf:
            int r0 = r11.next()
            goto L12
        Lc5:
            android.animation.AnimatorSet r10 = r3.f2283b
            if (r10 != 0) goto Ld0
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            r3.f2283b = r10
        Ld0:
            android.animation.AnimatorSet r10 = r3.f2283b
            java.util.ArrayList<android.animation.Animator> r11 = r3.f2284c
            r10.playTogether(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return a.C0102a.d(drawable);
        }
        return this.f2276c.f2282a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2288b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2276c.f2283b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.isStateful() : this.f2276c.f2282a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2276c.f2282a.setBounds(rect);
        }
    }

    @Override // b1.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.setLevel(i6) : this.f2276c.f2282a.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2288b;
        return drawable != null ? drawable.setState(iArr) : this.f2276c.f2282a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f2276c.f2282a.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z5) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            a.C0102a.e(drawable, z5);
        } else {
            this.f2276c.f2282a.setAutoMirrored(z5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2276c.f2282a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            z.a.a(drawable, i6);
        } else {
            this.f2276c.f2282a.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            z.a.b(drawable, colorStateList);
        } else {
            this.f2276c.f2282a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            z.a.c(drawable, mode);
        } else {
            this.f2276c.f2282a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z5, boolean z6) {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            return drawable.setVisible(z5, z6);
        }
        this.f2276c.f2282a.setVisible(z5, z6);
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f2276c;
        if (bVar.f2283b.isStarted()) {
            return;
        }
        bVar.f2283b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2288b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2276c.f2283b.end();
        }
    }
}
