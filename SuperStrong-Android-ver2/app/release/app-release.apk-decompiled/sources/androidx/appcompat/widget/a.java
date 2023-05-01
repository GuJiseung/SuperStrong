package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final C0005a f673b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f674c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f675d;

    /* renamed from: e  reason: collision with root package name */
    public c f676e;

    /* renamed from: f  reason: collision with root package name */
    public int f677f;

    /* renamed from: g  reason: collision with root package name */
    public f0.r0 f678g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f679h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f680i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0005a implements f0.s0 {

        /* renamed from: b  reason: collision with root package name */
        public boolean f681b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f682c;

        public C0005a() {
        }

        @Override // f0.s0
        public final void a() {
            if (this.f681b) {
                return;
            }
            a aVar = a.this;
            aVar.f678g = null;
            a.super.setVisibility(this.f682c);
        }

        @Override // f0.s0
        public final void b(View view) {
            this.f681b = true;
        }

        @Override // f0.s0
        public final void c() {
            a.super.setVisibility(0);
            this.f681b = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f673b = new C0005a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f674c = context;
        } else {
            this.f674c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i6, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), i7);
        return Math.max(0, (i6 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i6, int i7, int i8, View view, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = ((i8 - measuredHeight) / 2) + i7;
        if (z5) {
            view.layout(i6 - measuredWidth, i9, i6, measuredHeight + i9);
        } else {
            view.layout(i6, i9, i6 + measuredWidth, measuredHeight + i9);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final f0.r0 e(int i6, long j5) {
        f0.r0 r0Var = this.f678g;
        if (r0Var != null) {
            r0Var.b();
        }
        C0005a c0005a = this.f673b;
        if (i6 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            f0.r0 a6 = f0.g0.a(this);
            a6.a(1.0f);
            a6.c(j5);
            a.this.f678g = a6;
            c0005a.f682c = i6;
            a6.d(c0005a);
            return a6;
        }
        f0.r0 a7 = f0.g0.a(this);
        a7.a(0.0f);
        a7.c(j5);
        a.this.f678g = a7;
        c0005a.f682c = i6;
        a7.d(c0005a);
        return a7;
    }

    public int getAnimatedVisibility() {
        return this.f678g != null ? this.f673b.f682c : getVisibility();
    }

    public int getContentHeight() {
        return this.f677f;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i6;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, c.b.f2652b, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f676e;
        if (cVar != null) {
            Configuration configuration2 = cVar.f371c.getResources().getConfiguration();
            int i7 = configuration2.screenWidthDp;
            int i8 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i7 <= 600 && ((i7 <= 960 || i8 <= 720) && (i7 <= 720 || i8 <= 960))) {
                if (i7 < 500 && ((i7 <= 640 || i8 <= 480) && (i7 <= 480 || i8 <= 640))) {
                    if (i7 >= 360) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                } else {
                    i6 = 4;
                }
            } else {
                i6 = 5;
            }
            cVar.f702r = i6;
            androidx.appcompat.view.menu.f fVar = cVar.f372d;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f680i = false;
        }
        if (!this.f680i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f680i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f680i = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f679h = false;
        }
        if (!this.f679h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f679h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f679h = false;
        }
        return true;
    }

    public void setContentHeight(int i6) {
        this.f677f = i6;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        if (i6 != getVisibility()) {
            f0.r0 r0Var = this.f678g;
            if (r0Var != null) {
                r0Var.b();
            }
            super.setVisibility(i6);
        }
    }
}
