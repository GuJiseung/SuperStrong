package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.s0;
/* loaded from: classes.dex */
public class ActionMenuItemView extends j0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: i  reason: collision with root package name */
    public h f340i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f341j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f342k;

    /* renamed from: l  reason: collision with root package name */
    public f.b f343l;

    /* renamed from: m  reason: collision with root package name */
    public a f344m;

    /* renamed from: n  reason: collision with root package name */
    public b f345n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f346o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f347p;

    /* renamed from: q  reason: collision with root package name */
    public final int f348q;

    /* renamed from: r  reason: collision with root package name */
    public int f349r;
    public final int s;

    /* loaded from: classes.dex */
    public class a extends s0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.s0
        public final h.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f345n;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.f704v) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.s0
        public final boolean c() {
            h.f b6;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.f343l;
            return bVar != null && bVar.a(actionMenuItemView.f340i) && (b6 = b()) != null && b6.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f346o = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2656d, 0, 0);
        this.f348q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f349r = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return l() && this.f340i.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void c(h hVar) {
        int i6;
        this.f340i = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.f451a);
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f344m == null) {
            this.f344m = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f340i;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        return i6 >= 480 || (i6 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void n() {
        CharSequence charSequence;
        boolean z5;
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f341j);
        if (this.f342k != null) {
            if ((this.f340i.f473y & 4) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || (!this.f346o && !this.f347p)) {
                z6 = false;
            }
        }
        boolean z8 = z7 & z6;
        CharSequence charSequence2 = null;
        if (z8) {
            charSequence = this.f341j;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f340i.f467q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z8) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f340i.f455e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f340i.f468r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z8) {
                charSequence2 = this.f340i.f455e;
            }
            o1.a(this, charSequence2);
            return;
        }
        o1.a(this, charSequence4);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.f343l;
        if (bVar != null) {
            bVar.a(this.f340i);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f346o = m();
        n();
    }

    @Override // androidx.appcompat.widget.j0, android.widget.TextView, android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        boolean l5 = l();
        if (l5 && (i8 = this.f349r) >= 0) {
            super.setPadding(i8, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i6, i7);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int measuredWidth = getMeasuredWidth();
        int i9 = this.f348q;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i9) : i9;
        if (mode != 1073741824 && i9 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i7);
        }
        if (l5 || this.f342k == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f342k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f340i.hasSubMenu() && (aVar = this.f344m) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f347p != z5) {
            this.f347p = z5;
            h hVar = this.f340i;
            if (hVar != null) {
                f fVar = hVar.f464n;
                fVar.f436k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f342k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = this.s;
            if (intrinsicWidth > i6) {
                intrinsicHeight = (int) (intrinsicHeight * (i6 / intrinsicWidth));
                intrinsicWidth = i6;
            }
            if (intrinsicHeight > i6) {
                intrinsicWidth = (int) (intrinsicWidth * (i6 / intrinsicHeight));
            } else {
                i6 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i6);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(f.b bVar) {
        this.f343l = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
        this.f349r = i6;
        super.setPadding(i6, i7, i8, i9);
    }

    public void setPopupCallback(b bVar) {
        this.f345n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f341j = charSequence;
        n();
    }
}
