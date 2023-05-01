package f0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.superstrong.android.R;
import f0.a;
import f0.g;
import f0.g0;
import f0.x0;
import g0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, r0> f3878a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f3879b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3880c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f3881d;

    /* renamed from: e  reason: collision with root package name */
    public static final c0 f3882e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f3883f;

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f3884b = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z5;
            int i6;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f3884b;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (booleanValue != z5) {
                        if (z5) {
                            i6 = 16;
                        } else {
                            i6 = 32;
                        }
                        g0.g(key, i6);
                        weakHashMap.put(key, Boolean.valueOf(z5));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f3885a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f3886b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3887c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3888d;

        public b(int i6, Class<T> cls, int i7, int i8) {
            this.f3885a = i6;
            this.f3886b = cls;
            this.f3888d = i7;
            this.f3887c = i8;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t5);

        public final T d(View view) {
            boolean z5;
            if (Build.VERSION.SDK_INT >= this.f3887c) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return b(view);
            }
            T t5 = (T) view.getTag(this.f3885a);
            if (this.f3886b.isInstance(t5)) {
                return t5;
            }
            return null;
        }

        public final void e(View view, T t5) {
            boolean z5;
            f0.a aVar;
            if (Build.VERSION.SDK_INT >= this.f3887c) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                c(view, t5);
            } else if (f(d(view), t5)) {
                View.AccessibilityDelegate c6 = g0.c(view);
                if (c6 == null) {
                    aVar = null;
                } else if (c6 instanceof a.C0037a) {
                    aVar = ((a.C0037a) c6).f3858a;
                } else {
                    aVar = new f0.a(c6);
                }
                if (aVar == null) {
                    aVar = new f0.a();
                }
                g0.l(view, aVar);
                view.setTag(this.f3885a, t5);
                g0.g(view, this.f3888d);
            }
        }

        public abstract boolean f(T t5, T t6);
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i6, Bundle bundle) {
            return view.performAccessibilityAction(i6, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i6, int i7, int i8, int i9) {
            view.postInvalidateOnAnimation(i6, i7, i8, i9);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j5) {
            view.postOnAnimationDelayed(runnable, j5);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z5) {
            view.setHasTransientState(z5);
        }

        public static void s(View view, int i6) {
            view.setImportantForAccessibility(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i6) {
            view.setLabelFor(i6);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i6) {
            view.setLayoutDirection(i6);
        }

        public static void k(View view, int i6, int i7, int i8, int i9) {
            view.setPaddingRelative(i6, i7, i8, i9);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i6) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i6);
        }

        public static void f(View view, int i6) {
            view.setAccessibilityLiveRegion(i6);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i6) {
            accessibilityEvent.setContentChangeTypes(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public x0 f3889a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f3890b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ x f3891c;

            public a(View view, x xVar) {
                this.f3890b = view;
                this.f3891c = xVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                x0 g2 = x0.g(windowInsets, view);
                int i6 = Build.VERSION.SDK_INT;
                x xVar = this.f3891c;
                if (i6 < 30) {
                    i.a(windowInsets, this.f3890b);
                    if (g2.equals(this.f3889a)) {
                        return xVar.a(view, g2).f();
                    }
                }
                this.f3889a = g2;
                x0 a6 = xVar.a(view, g2);
                if (i6 >= 30) {
                    return a6.f();
                }
                WeakHashMap<View, r0> weakHashMap = g0.f3878a;
                h.c(view);
                return a6.f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static x0 b(View view, x0 x0Var, Rect rect) {
            WindowInsets f6 = x0Var.f();
            if (f6 != null) {
                return x0.g(view.computeSystemWindowInsets(f6, rect), view);
            }
            rect.setEmpty();
            return x0Var;
        }

        public static boolean c(View view, float f6, float f7, boolean z5) {
            return view.dispatchNestedFling(f6, f7, z5);
        }

        public static boolean d(View view, float f6, float f7) {
            return view.dispatchNestedPreFling(f6, f7);
        }

        public static boolean e(View view, int i6, int i7, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i6, i7, iArr, iArr2);
        }

        public static boolean f(View view, int i6, int i7, int i8, int i9, int[] iArr) {
            return view.dispatchNestedScroll(i6, i7, i8, i9, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static x0 j(View view) {
            x0.e bVar;
            if (x0.a.f3925d && view.isAttachedToWindow()) {
                try {
                    Object obj = x0.a.f3922a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) x0.a.f3923b.get(obj);
                        Rect rect2 = (Rect) x0.a.f3924c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            if (i6 >= 30) {
                                bVar = new x0.d();
                            } else if (i6 >= 29) {
                                bVar = new x0.c();
                            } else {
                                bVar = new x0.b();
                            }
                            bVar.c(y.b.a(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.d(y.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            x0 b6 = bVar.b();
                            b6.f3921a.p(b6);
                            b6.f3921a.d(view.getRootView());
                            return b6;
                        }
                    }
                } catch (IllegalAccessException e6) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e6.getMessage(), e6);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f6) {
            view.setElevation(f6);
        }

        public static void t(View view, boolean z5) {
            view.setNestedScrollingEnabled(z5);
        }

        public static void u(View view, x xVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, xVar);
            }
            if (xVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, xVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f6) {
            view.setTranslationZ(f6);
        }

        public static void x(View view, float f6) {
            view.setZ(f6);
        }

        public static boolean y(View view, int i6) {
            return view.startNestedScroll(i6);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static x0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            x0 g2 = x0.g(rootWindowInsets, null);
            x0.k kVar = g2.f3921a;
            kVar.p(g2);
            kVar.d(view.getRootView());
            return g2;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i6) {
            view.setScrollIndicators(i6);
        }

        public static void d(View view, int i6, int i7) {
            view.setScrollIndicators(i6, i7);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i6) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i6);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i6) {
            view.addKeyboardNavigationClusters(collection, i6);
        }

        public static int b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        public static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        public static boolean d(View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        public static boolean e(View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        public static boolean f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        public static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        public static View h(View view, View view2, int i6) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i6);
            return keyboardNavigationClusterSearch;
        }

        public static boolean i(View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z5) {
            view.setFocusedByDefault(z5);
        }

        public static void l(View view, int i6) {
            view.setImportantForAutofill(i6);
        }

        public static void m(View view, boolean z5) {
            view.setKeyboardNavigationCluster(z5);
        }

        public static void n(View view, int i6) {
            view.setNextClusterForwardId(i6);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        /* JADX WARN: Type inference failed for: r0v1, types: [f0.j0, java.lang.Object] */
        public static void a(View view, final r rVar) {
            l.h hVar = (l.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new l.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(rVar);
            ?? r0 = new View.OnUnhandledKeyEventListener() { // from class: f0.j0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return g0.r.this.a();
                }
            };
            hVar.put(rVar, r0);
            view.addOnUnhandledKeyEventListener(r0);
        }

        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            l.h hVar = (l.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i6) {
            View requireViewById;
            requireViewById = view.requireViewById(i6);
            return (T) requireViewById;
        }

        public static void g(View view, boolean z5) {
            view.setAccessibilityHeading(z5);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z5) {
            view.setScreenReaderFocusable(z5);
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        public static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6, int i7) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i6, i7);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static f0.g b(View view, f0.g gVar) {
            ContentInfo performReceiveContent;
            ContentInfo c6 = gVar.f3865a.c();
            Objects.requireNonNull(c6);
            performReceiveContent = view.performReceiveContent(c6);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c6) {
                return gVar;
            }
            return new f0.g(new g.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, y yVar) {
            if (yVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new q(yVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final y f3892a;

        public q(y yVar) {
            this.f3892a = yVar;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            f0.g gVar = new f0.g(new g.d(contentInfo));
            f0.g a6 = this.f3892a.a(view, gVar);
            if (a6 == null) {
                return null;
            }
            if (a6 == gVar) {
                return contentInfo;
            }
            ContentInfo c6 = a6.f3865a.c();
            Objects.requireNonNull(c6);
            return c6;
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3893d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3894a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f3895b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f3896c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a6;
            WeakHashMap<View, Boolean> weakHashMap = this.f3894a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        a6 = a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (a6 == null);
                return a6;
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [f0.c0] */
    static {
        new AtomicInteger(1);
        f3878a = null;
        f3880c = false;
        f3881d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f3882e = new z() { // from class: f0.c0
            @Override // f0.z
            public final g a(g gVar) {
                return gVar;
            }
        };
        f3883f = new a();
    }

    public static r0 a(View view) {
        if (f3878a == null) {
            f3878a = new WeakHashMap<>();
        }
        r0 r0Var = f3878a.get(view);
        if (r0Var == null) {
            r0 r0Var2 = new r0(view);
            f3878a.put(view, r0Var2);
            return r0Var2;
        }
        return r0Var;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f3893d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f3894a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f3893d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f3894a == null) {
                        sVar.f3894a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f3893d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f3894a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f3894a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a6 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f3895b == null) {
                    sVar.f3895b = new SparseArray<>();
                }
                sVar.f3895b.put(keyCode, new WeakReference<>(a6));
            }
        }
        if (a6 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f3880c) {
            return null;
        }
        if (f3879b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3879b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3880c = true;
                return null;
            }
        }
        Object obj = f3879b.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static CharSequence d(View view) {
        boolean z5;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] f(View view) {
        return Build.VERSION.SDK_INT >= 31 ? p.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i6) {
        boolean z5;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i7 = 32;
        if (g.a(view) == 0 && !z5) {
            if (i6 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i6);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i6);
                    return;
                } catch (AbstractMethodError e6) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z5) {
            i7 = 2048;
        }
        obtain2.setEventType(i7);
        g.g(obtain2, i6);
        if (z5) {
            obtain2.getText().add(d(view));
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (d.c((View) parent) == 4) {
                    d.s(view, 2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static f0.g h(View view, f0.g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, gVar);
        }
        y yVar = (y) view.getTag(R.id.tag_on_receive_content_listener);
        z zVar = f3882e;
        if (yVar != null) {
            f0.g a6 = yVar.a(view, gVar);
            if (a6 == null) {
                return null;
            }
            if (view instanceof z) {
                zVar = (z) view;
            }
            return zVar.a(a6);
        }
        if (view instanceof z) {
            zVar = (z) view;
        }
        return zVar.a(gVar);
    }

    public static void i(View view, int i6) {
        ArrayList e6 = e(view);
        for (int i7 = 0; i7 < e6.size(); i7++) {
            if (((f.a) e6.get(i7)).a() == i6) {
                e6.remove(i7);
                return;
            }
        }
    }

    public static void j(View view, f.a aVar, g0.j jVar) {
        f0.a aVar2;
        if (jVar == null) {
            i(view, aVar.a());
            g(view, 0);
            return;
        }
        f.a aVar3 = new f.a(null, aVar.f4107b, null, jVar, aVar.f4108c);
        View.AccessibilityDelegate c6 = c(view);
        if (c6 == null) {
            aVar2 = null;
        } else if (c6 instanceof a.C0037a) {
            aVar2 = ((a.C0037a) c6).f3858a;
        } else {
            aVar2 = new f0.a(c6);
        }
        if (aVar2 == null) {
            aVar2 = new f0.a();
        }
        l(view, aVar2);
        i(view, aVar3.a());
        e(view).add(aVar3);
        g(view, 0);
    }

    public static void k(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i6) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i6, 0);
        }
    }

    public static void l(View view, f0.a aVar) {
        a.C0037a c0037a;
        if (aVar == null && (c(view) instanceof a.C0037a)) {
            aVar = new f0.a();
        }
        if (aVar == null) {
            c0037a = null;
        } else {
            c0037a = aVar.f3857b;
        }
        view.setAccessibilityDelegate(c0037a);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z5;
        new e0().e(view, charSequence);
        a aVar = f3883f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.f3884b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z5));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f3884b.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }

    public static void n(View view, b0 b0Var) {
        k.d(view, b0Var != null ? b0Var.f3863a : null);
    }
}
