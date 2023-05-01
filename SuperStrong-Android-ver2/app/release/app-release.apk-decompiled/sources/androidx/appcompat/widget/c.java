package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import com.superstrong.android.R;
import java.util.ArrayList;
import z.a;
/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.a {

    /* renamed from: k  reason: collision with root package name */
    public d f695k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f696l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f697m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f698n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f699o;

    /* renamed from: p  reason: collision with root package name */
    public int f700p;

    /* renamed from: q  reason: collision with root package name */
    public int f701q;

    /* renamed from: r  reason: collision with root package name */
    public int f702r;
    public boolean s;

    /* renamed from: t  reason: collision with root package name */
    public final SparseBooleanArray f703t;
    public e u;

    /* renamed from: v  reason: collision with root package name */
    public a f704v;

    /* renamed from: w  reason: collision with root package name */
    public RunnableC0006c f705w;

    /* renamed from: x  reason: collision with root package name */
    public b f706x;

    /* renamed from: y  reason: collision with root package name */
    public final f f707y;

    /* renamed from: z  reason: collision with root package name */
    public int f708z;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false);
            if (!((mVar.A.f472x & 32) == 32)) {
                View view2 = c.this.f695k;
                this.f481f = view2 == null ? (View) c.this.f377i : view2;
            }
            f fVar = c.this.f707y;
            this.f484i = fVar;
            h.d dVar = this.f485j;
            if (dVar != null) {
                dVar.l(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            cVar.f704v = null;
            cVar.f708z = 0;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0006c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final e f711b;

        public RunnableC0006c(e eVar) {
            this.f711b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f372d;
            if (fVar != null && (aVar = fVar.f430e) != null) {
                aVar.b(fVar);
            }
            View view = (View) cVar.f377i;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f711b;
                boolean z5 = true;
                if (!eVar.b()) {
                    if (eVar.f481f == null) {
                        z5 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z5) {
                    cVar.u = eVar;
                }
            }
            cVar.f705w = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends o implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends s0 {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.s0
            public final h.f b() {
                e eVar = c.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.s0
            public final boolean c() {
                c.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.s0
            public final boolean d() {
                c cVar = c.this;
                if (cVar.f705w != null) {
                    return false;
                }
                cVar.d();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            o1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i6, int i7, int i8, int i9) {
            boolean frame = super.setFrame(i6, i7, i8, i9);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true);
            this.f482g = 8388613;
            f fVar2 = c.this.f707y;
            this.f484i = fVar2;
            h.d dVar2 = this.f485j;
            if (dVar2 != null) {
                dVar2.l(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            androidx.appcompat.view.menu.f fVar = cVar.f372d;
            if (fVar != null) {
                fVar.c(true);
            }
            cVar.u = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
            if (fVar instanceof androidx.appcompat.view.menu.m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f374f;
            if (aVar != null) {
                aVar.a(fVar, z5);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f372d) {
                return false;
            }
            cVar.f708z = ((androidx.appcompat.view.menu.m) fVar).A.f451a;
            j.a aVar = cVar.f374f;
            if (aVar == null) {
                return false;
            }
            return aVar.b(fVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f717b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i6) {
                return new g[i6];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f717b = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f717b);
        }
    }

    public c(Context context) {
        super(context);
        this.f703t = new SparseBooleanArray();
        this.f707y = new f();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f fVar, boolean z5) {
        d();
        a aVar = this.f704v;
        if (aVar != null && aVar.b()) {
            aVar.f485j.dismiss();
        }
        j.a aVar2 = this.f374f;
        if (aVar2 != null) {
            aVar2.a(fVar, z5);
        }
    }

    public final View b(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i6 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f373e.inflate(this.f376h, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f377i);
            if (this.f706x == null) {
                this.f706x = new b();
            }
            actionMenuItemView.setPopupCallback(this.f706x);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i6 = 8;
        }
        actionView.setVisibility(i6);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean d() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0006c runnableC0006c = this.f705w;
        if (runnableC0006c != null && (kVar = this.f377i) != null) {
            ((View) kVar).removeCallbacks(runnableC0006c);
            this.f705w = null;
            return true;
        }
        e eVar = this.u;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f485j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f371c = context;
        LayoutInflater.from(context);
        this.f372d = fVar;
        Resources resources = context.getResources();
        if (!this.f699o) {
            this.f698n = true;
        }
        int i6 = 2;
        this.f700p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i7 <= 600 && ((i7 <= 960 || i8 <= 720) && (i7 <= 720 || i8 <= 960))) {
            if (i7 < 500 && ((i7 <= 640 || i8 <= 480) && (i7 <= 480 || i8 <= 640))) {
                if (i7 >= 360) {
                    i6 = 3;
                }
            } else {
                i6 = 4;
            }
        } else {
            i6 = 5;
        }
        this.f702r = i6;
        int i9 = this.f700p;
        if (this.f698n) {
            if (this.f695k == null) {
                d dVar = new d(this.f370b);
                this.f695k = dVar;
                if (this.f697m) {
                    dVar.setImageDrawable(this.f696l);
                    this.f696l = null;
                    this.f697m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f695k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i9 -= this.f695k.getMeasuredWidth();
        } else {
            this.f695k = null;
        }
        this.f701q = i9;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        int i6;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i6 = ((g) parcelable).f717b) > 0 && (findItem = this.f372d.findItem(i6)) != null) {
            h((androidx.appcompat.view.menu.m) findItem.getSubMenu());
        }
    }

    public final boolean g() {
        e eVar = this.u;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.f r2 = r0.f509z
            androidx.appcompat.view.menu.f r3 = r8.f372d
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.k r2 = r8.f377i
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = r1
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof androidx.appcompat.view.menu.k.a
            if (r6 == 0) goto L35
            r6 = r5
            androidx.appcompat.view.menu.k$a r6 = (androidx.appcompat.view.menu.k.a) r6
            androidx.appcompat.view.menu.h r6 = r6.getItemData()
            androidx.appcompat.view.menu.h r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            androidx.appcompat.view.menu.h r0 = r9.A
            int r0 = r0.f451a
            r8.f708z = r0
            int r0 = r9.size()
            r2 = r1
        L47:
            r3 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5c
            r0 = r3
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r4 = r8.f371c
            r2.<init>(r4, r9, r5)
            r8.f704v = r2
            r2.f483h = r0
            h.d r2 = r2.f485j
            if (r2 == 0) goto L72
            r2.q(r0)
        L72:
            androidx.appcompat.widget.c$a r0 = r8.f704v
            boolean r2 = r0.b()
            if (r2 == 0) goto L7c
        L7a:
            r1 = r3
            goto L85
        L7c:
            android.view.View r2 = r0.f481f
            if (r2 != 0) goto L81
            goto L85
        L81:
            r0.d(r1, r1, r1, r1)
            goto L7a
        L85:
            if (r1 == 0) goto L8f
            androidx.appcompat.view.menu.j$a r0 = r8.f374f
            if (r0 == 0) goto L8e
            r0.b(r9)
        L8e:
            return r3
        L8f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.h(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(boolean z5) {
        int i6;
        boolean z6;
        boolean z7;
        androidx.appcompat.view.menu.h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f377i;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = null;
        boolean z8 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f372d;
            if (fVar != null) {
                fVar.i();
                ArrayList<androidx.appcompat.view.menu.h> l5 = this.f372d.l();
                int size = l5.size();
                i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    androidx.appcompat.view.menu.h hVar2 = l5.get(i7);
                    if ((hVar2.f472x & 32) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        View childAt = viewGroup.getChildAt(i6);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View b6 = b(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            b6.setPressed(false);
                            b6.jumpDrawablesToCurrentState();
                        }
                        if (b6 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b6.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b6);
                            }
                            ((ViewGroup) this.f377i).addView(b6, i6);
                        }
                        i6++;
                    }
                }
            } else {
                i6 = 0;
            }
            while (i6 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i6) == this.f695k) {
                    z6 = false;
                } else {
                    viewGroup.removeViewAt(i6);
                    z6 = true;
                }
                if (!z6) {
                    i6++;
                }
            }
        }
        ((View) this.f377i).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f372d;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<androidx.appcompat.view.menu.h> arrayList2 = fVar2.f434i;
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                f0.b bVar = arrayList2.get(i8).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f372d;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f435j;
        }
        if (this.f698n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z8 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z8 = true;
            }
        }
        d dVar = this.f695k;
        if (z8) {
            if (dVar == null) {
                this.f695k = new d(this.f370b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f695k.getParent();
            if (viewGroup3 != this.f377i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f695k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f377i;
                d dVar2 = this.f695k;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f565a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.k kVar = this.f377i;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.f695k);
            }
        }
        ((ActionMenuView) this.f377i).setOverflowReserved(this.f698n);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j() {
        int i6;
        ArrayList<androidx.appcompat.view.menu.h> arrayList;
        int i7;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f372d;
        if (fVar != null) {
            arrayList = fVar.l();
            i6 = arrayList.size();
        } else {
            i6 = 0;
            arrayList = null;
        }
        int i8 = cVar.f702r;
        int i9 = cVar.f701q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f377i;
        int i10 = 0;
        boolean z13 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = 2;
            z5 = true;
            if (i10 >= i6) {
                break;
            }
            androidx.appcompat.view.menu.h hVar = arrayList.get(i10);
            int i13 = hVar.f473y;
            if ((i13 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                i11++;
            } else {
                if ((i13 & 1) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i12++;
                } else {
                    z13 = true;
                }
            }
            if (cVar.s && hVar.C) {
                i8 = 0;
            }
            i10++;
        }
        if (cVar.f698n && (z13 || i12 + i11 > i8)) {
            i8--;
        }
        int i14 = i8 - i11;
        SparseBooleanArray sparseBooleanArray = cVar.f703t;
        sparseBooleanArray.clear();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i6) {
            androidx.appcompat.view.menu.h hVar2 = arrayList.get(i15);
            int i17 = hVar2.f473y;
            if ((i17 & 2) == i7) {
                z6 = z5;
            } else {
                z6 = false;
            }
            int i18 = hVar2.f452b;
            if (z6) {
                View b6 = cVar.b(hVar2, null, viewGroup);
                b6.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b6.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                if (i18 != 0) {
                    sparseBooleanArray.put(i18, z5);
                }
                hVar2.f(z5);
            } else {
                if ((i17 & 1) == z5) {
                    z7 = z5;
                } else {
                    z7 = false;
                }
                if (z7) {
                    boolean z14 = sparseBooleanArray.get(i18);
                    if ((i14 > 0 || z14) && i9 > 0) {
                        z8 = z5;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        View b7 = cVar.b(hVar2, null, viewGroup);
                        b7.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = b7.getMeasuredWidth();
                        i9 -= measuredWidth2;
                        if (i16 == 0) {
                            i16 = measuredWidth2;
                        }
                        if (i9 + i16 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z8 &= z10;
                    }
                    if (z8 && i18 != 0) {
                        sparseBooleanArray.put(i18, true);
                    } else if (z14) {
                        sparseBooleanArray.put(i18, false);
                        for (int i19 = 0; i19 < i15; i19++) {
                            androidx.appcompat.view.menu.h hVar3 = arrayList.get(i19);
                            if (hVar3.f452b == i18) {
                                if ((hVar3.f472x & 32) == 32) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i14++;
                                }
                                hVar3.f(false);
                            }
                        }
                    }
                    if (z8) {
                        i14--;
                    }
                    hVar2.f(z8);
                } else {
                    hVar2.f(false);
                    i15++;
                    i7 = 2;
                    cVar = this;
                    z5 = true;
                }
            }
            i15++;
            i7 = 2;
            cVar = this;
            z5 = true;
        }
        return z5;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable k() {
        g gVar = new g();
        gVar.f717b = this.f708z;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (this.f698n && !g() && (fVar = this.f372d) != null && this.f377i != null && this.f705w == null) {
            fVar.i();
            if (!fVar.f435j.isEmpty()) {
                RunnableC0006c runnableC0006c = new RunnableC0006c(new e(this.f371c, this.f372d, this.f695k));
                this.f705w = runnableC0006c;
                ((View) this.f377i).post(runnableC0006c);
                return true;
            }
            return false;
        }
        return false;
    }
}
