package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import f0.g0;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class y extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f994j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.widget.e f995b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f996c;

    /* renamed from: d  reason: collision with root package name */
    public final x f997d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f998e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f999f;

    /* renamed from: g  reason: collision with root package name */
    public final i f1000g;

    /* renamed from: h  reason: collision with root package name */
    public int f1001h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1002i;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            y yVar = y.this;
            if (!yVar.getInternalPopup().b()) {
                yVar.f1000g.m(c.b(yVar), c.a(yVar));
            }
            ViewTreeObserver viewTreeObserver = yVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i6) {
            view.setTextAlignment(i6);
        }

        public static void d(View view, int i6) {
            view.setTextDirection(i6);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!e0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.app.b f1004b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f1005c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f1006d;

        public e() {
        }

        @Override // androidx.appcompat.widget.y.i
        public final boolean b() {
            androidx.appcompat.app.b bVar = this.f1004b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.y.i
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.y.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f1004b;
            if (bVar != null) {
                bVar.dismiss();
                this.f1004b = null;
            }
        }

        @Override // androidx.appcompat.widget.y.i
        public final Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.y.i
        public final void h(CharSequence charSequence) {
            this.f1006d = charSequence;
        }

        @Override // androidx.appcompat.widget.y.i
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.i
        public final void j(int i6) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.i
        public final void k(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.i
        public final void l(int i6) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.y.i
        public final void m(int i6, int i7) {
            if (this.f1005c == null) {
                return;
            }
            y yVar = y.this;
            b.a aVar = new b.a(yVar.getPopupContext());
            CharSequence charSequence = this.f1006d;
            AlertController.b bVar = aVar.f337a;
            if (charSequence != null) {
                bVar.f326d = charSequence;
            }
            ListAdapter listAdapter = this.f1005c;
            int selectedItemPosition = yVar.getSelectedItemPosition();
            bVar.f329g = listAdapter;
            bVar.f330h = this;
            bVar.f332j = selectedItemPosition;
            bVar.f331i = true;
            androidx.appcompat.app.b a6 = aVar.a();
            this.f1004b = a6;
            AlertController.RecycleListView recycleListView = a6.f336f.f302e;
            c.d(recycleListView, i6);
            c.c(recycleListView, i7);
            this.f1004b.show();
        }

        @Override // androidx.appcompat.widget.y.i
        public final int n() {
            return 0;
        }

        @Override // androidx.appcompat.widget.y.i
        public final CharSequence o() {
            return this.f1006d;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i6) {
            y yVar = y.this;
            yVar.setSelection(i6);
            if (yVar.getOnItemClickListener() != null) {
                yVar.performItemClick(null, i6, this.f1005c.getItemId(i6));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.y.i
        public final void p(ListAdapter listAdapter) {
            this.f1005c = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public final SpinnerAdapter f1008b;

        /* renamed from: c  reason: collision with root package name */
        public final ListAdapter f1009c;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1008b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1009c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof f1) {
                    f1 f1Var = (f1) spinnerAdapter;
                    if (f1Var.getDropDownViewTheme() == null) {
                        f1Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1009c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i6);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i6);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i6) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            return getDropDownView(i6, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i6) {
            ListAdapter listAdapter = this.f1009c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i6);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1008b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends v0 implements i {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
                g gVar = g.this;
                y.this.setSelection(i6);
                if (y.this.getOnItemClickListener() != null) {
                    y.this.performItemClick(view, i6, gVar.E.getItemId(i6));
                }
                gVar.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z5;
                g gVar = g.this;
                y yVar = y.this;
                gVar.getClass();
                WeakHashMap<View, f0.r0> weakHashMap = f0.g0.f3878a;
                if (g0.g.b(yVar) && yVar.getGlobalVisibleRect(gVar.F)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    gVar.dismiss();
                    return;
                }
                gVar.s();
                gVar.d();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1012b;

            public c(b bVar) {
                this.f1012b = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1012b);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i6) {
            super(context, attributeSet, i6, 0);
            this.F = new Rect();
            this.f968p = y.this;
            this.f976z = true;
            this.A.setFocusable(true);
            this.f969q = new a();
        }

        @Override // androidx.appcompat.widget.y.i
        public final void h(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // androidx.appcompat.widget.y.i
        public final void k(int i6) {
            this.G = i6;
        }

        @Override // androidx.appcompat.widget.y.i
        public final void m(int i6, int i7) {
            ViewTreeObserver viewTreeObserver;
            boolean b6 = b();
            s();
            q qVar = this.A;
            qVar.setInputMethodMode(2);
            d();
            q0 q0Var = this.f956d;
            q0Var.setChoiceMode(1);
            c.d(q0Var, i6);
            c.c(q0Var, i7);
            y yVar = y.this;
            int selectedItemPosition = yVar.getSelectedItemPosition();
            q0 q0Var2 = this.f956d;
            if (b() && q0Var2 != null) {
                q0Var2.setListSelectionHidden(false);
                q0Var2.setSelection(selectedItemPosition);
                if (q0Var2.getChoiceMode() != 0) {
                    q0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b6 && (viewTreeObserver = yVar.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                qVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.y.i
        public final CharSequence o() {
            return this.D;
        }

        @Override // androidx.appcompat.widget.v0, androidx.appcompat.widget.y.i
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.E = listAdapter;
        }

        public final void s() {
            int i6;
            int i7;
            Drawable f6 = f();
            y yVar = y.this;
            if (f6 != null) {
                f6.getPadding(yVar.f1002i);
                if (s1.a(yVar)) {
                    i6 = yVar.f1002i.right;
                } else {
                    i6 = -yVar.f1002i.left;
                }
            } else {
                Rect rect = yVar.f1002i;
                rect.right = 0;
                rect.left = 0;
                i6 = 0;
            }
            int paddingLeft = yVar.getPaddingLeft();
            int paddingRight = yVar.getPaddingRight();
            int width = yVar.getWidth();
            int i8 = yVar.f1001h;
            if (i8 == -2) {
                int a6 = yVar.a((SpinnerAdapter) this.E, f());
                int i9 = yVar.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = yVar.f1002i;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (a6 > i10) {
                    a6 = i10;
                }
                i8 = Math.max(a6, (width - paddingLeft) - paddingRight);
            } else if (i8 == -1) {
                i8 = (width - paddingLeft) - paddingRight;
            }
            r(i8);
            if (s1.a(yVar)) {
                i7 = (((width - paddingRight) - this.f958f) - this.G) + i6;
            } else {
                i7 = paddingLeft + this.G + i6;
            }
            this.f959g = i7;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1014b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i6) {
                return new h[i6];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1014b = parcel.readByte() != 0;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeByte(this.f1014b ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean b();

        int c();

        void dismiss();

        Drawable f();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void j(int i6);

        void k(int i6);

        void l(int i6);

        void m(int i6, int i7);

        int n();

        CharSequence o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f1002i = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.e1.a(r10, r0)
            int[] r0 = c.b.f2688w
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r10)
            r10.f995b = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            g.c r4 = new g.c
            r4.<init>(r11, r3)
            r10.f996c = r4
            goto L30
        L2e:
            r10.f996c = r11
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.y.f994j     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r6 == 0) goto L58
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r11 = move-exception
            r4 = r5
            goto Lcb
        L47:
            r6 = move-exception
            goto L4f
        L49:
            r11 = move-exception
            goto Lcb
        L4c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L4f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L5b
        L58:
            r5.recycle()
        L5b:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L93
            if (r3 == r6) goto L62
            goto La0
        L62:
            androidx.appcompat.widget.y$g r3 = new androidx.appcompat.widget.y$g
            android.content.Context r7 = r10.f996c
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f996c
            androidx.appcompat.widget.j1 r0 = androidx.appcompat.widget.j1.m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.f815b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.f1001h = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.i(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.D = r5
            r0.n()
            r10.f1000g = r3
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r0.<init>(r10, r10, r3)
            r10.f997d = r0
            goto La0
        L93:
            androidx.appcompat.widget.y$e r0 = new androidx.appcompat.widget.y$e
            r0.<init>()
            r10.f1000g = r0
            java.lang.String r3 = r2.getString(r5)
            r0.f1006d = r3
        La0:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Lb7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131493001(0x7f0c0089, float:1.860947E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter(r1)
        Lb7:
            r2.recycle()
            r10.f999f = r6
            android.widget.SpinnerAdapter r11 = r10.f998e
            if (r11 == 0) goto Lc5
            r10.setAdapter(r11)
            r10.f998e = r4
        Lc5:
            androidx.appcompat.widget.e r11 = r10.f995b
            r11.d(r12, r13)
            return
        Lcb:
            if (r4 == 0) goto Ld0
            r4.recycle()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i6 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i7 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i7 = Math.max(i7, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f1002i;
            drawable.getPadding(rect);
            return i7 + rect.left + rect.right;
        }
        return i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f1000g;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f1000g;
        return iVar != null ? iVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1000g != null ? this.f1001h : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f1000g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f1000g;
        return iVar != null ? iVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f996c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f1000g;
        return iVar != null ? iVar.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f1000g;
        if (iVar == null || !iVar.b()) {
            return;
        }
        iVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (this.f1000g == null || View.MeasureSpec.getMode(i6) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i6)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.f1014b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f1000g;
        hVar.f1014b = iVar != null && iVar.b();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x xVar = this.f997d;
        if (xVar == null || !xVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f1000g;
        if (iVar != null) {
            if (!iVar.b()) {
                iVar.m(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f999f) {
            this.f998e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.f1000g;
        if (iVar != null) {
            Context context = this.f996c;
            if (context == null) {
                context = getContext();
            }
            iVar.p(new f(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i6) {
        i iVar = this.f1000g;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i6);
            return;
        }
        iVar.k(i6);
        iVar.l(i6);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i6) {
        i iVar = this.f1000g;
        if (iVar != null) {
            iVar.j(i6);
        } else {
            super.setDropDownVerticalOffset(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i6) {
        if (this.f1000g != null) {
            this.f1001h = i6;
        } else {
            super.setDropDownWidth(i6);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f1000g;
        if (iVar != null) {
            iVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i6) {
        setPopupBackgroundDrawable(e.a.a(getPopupContext(), i6));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f1000g;
        if (iVar != null) {
            iVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f995b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
