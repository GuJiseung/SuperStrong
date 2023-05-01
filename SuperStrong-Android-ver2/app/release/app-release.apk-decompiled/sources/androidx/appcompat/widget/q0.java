package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.superstrong.android.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class q0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f889b;

    /* renamed from: c  reason: collision with root package name */
    public int f890c;

    /* renamed from: d  reason: collision with root package name */
    public int f891d;

    /* renamed from: e  reason: collision with root package name */
    public int f892e;

    /* renamed from: f  reason: collision with root package name */
    public int f893f;

    /* renamed from: g  reason: collision with root package name */
    public int f894g;

    /* renamed from: h  reason: collision with root package name */
    public d f895h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f896i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f897j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f898k;

    /* renamed from: l  reason: collision with root package name */
    public j0.g f899l;

    /* renamed from: m  reason: collision with root package name */
    public f f900m;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f6, float f7) {
            view.drawableHotspotChanged(f6, f7);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f901a;

        /* renamed from: b  reason: collision with root package name */
        public static final Method f902b;

        /* renamed from: c  reason: collision with root package name */
        public static final Method f903c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f904d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f901a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f902b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f903c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f904d = true;
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z5) {
            absListView.setSelectedChildViewEnabled(z5);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f905c;

        public d(Drawable drawable) {
            super(drawable);
            this.f905c = true;
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f905c) {
                super.draw(canvas);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f6, float f7) {
            if (this.f905c) {
                super.setHotspot(f6, f7);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i6, int i7, int i8, int i9) {
            if (this.f905c) {
                super.setHotspotBounds(i6, i7, i8, i9);
            }
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f905c) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // f.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z5, boolean z6) {
            if (this.f905c) {
                return super.setVisible(z5, z6);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f906a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e6) {
                e6.printStackTrace();
            }
            f906a = field;
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            q0 q0Var = q0.this;
            q0Var.f900m = null;
            q0Var.drawableStateChanged();
        }
    }

    public q0(Context context, boolean z5) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f889b = new Rect();
        this.f890c = 0;
        this.f891d = 0;
        this.f892e = 0;
        this.f893f = 0;
        this.f897j = z5;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z5) {
        d dVar = this.f895h;
        if (dVar != null) {
            dVar.f905c = z5;
        }
    }

    public final int a(int i6, int i7) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i8 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i8;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = adapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i10, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i11 = layoutParams.height;
            view.measure(i6, i11 > 0 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i10 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i7) {
                return i7;
            }
        }
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f889b;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f900m != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f898k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f897j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f897j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f897j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f897j && this.f896i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f900m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f900m == null) {
            f fVar = new f();
            this.f900m = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i6 >= 30 && b.f904d) {
                        try {
                            b.f901a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f902b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f903c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e6) {
                            e6.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f898k && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f894g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f900m;
        if (fVar != null) {
            q0 q0Var = q0.this;
            q0Var.f900m = null;
            q0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z5) {
        this.f896i = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f895h = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f890c = rect.left;
        this.f891d = rect.top;
        this.f892e = rect.right;
        this.f893f = rect.bottom;
    }
}
