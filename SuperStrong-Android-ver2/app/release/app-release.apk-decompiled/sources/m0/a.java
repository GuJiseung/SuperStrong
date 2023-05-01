package m0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import f0.g0;
import f0.r0;
import g0.f;
import g0.g;
import g0.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.b;
/* loaded from: classes.dex */
public abstract class a extends f0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f5201n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final C0061a f5202o = new C0061a();

    /* renamed from: p  reason: collision with root package name */
    public static final b f5203p = new b();

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f5208h;

    /* renamed from: i  reason: collision with root package name */
    public final View f5209i;

    /* renamed from: j  reason: collision with root package name */
    public c f5210j;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f5204d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f5205e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f5206f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f5207g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    public int f5211k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f5212l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f5213m = Integer.MIN_VALUE;

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0061a implements b.a<f> {
    }

    /* loaded from: classes.dex */
    public class b {
    }

    /* loaded from: classes.dex */
    public class c extends g {
        public c() {
        }

        @Override // g0.g
        public final f a(int i6) {
            return new f(AccessibilityNodeInfo.obtain(a.this.n(i6).f4095a));
        }

        @Override // g0.g
        public final f b(int i6) {
            a aVar = a.this;
            int i7 = i6 == 2 ? aVar.f5211k : aVar.f5212l;
            if (i7 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i7);
        }

        @Override // g0.g
        public final boolean c(int i6, int i7, Bundle bundle) {
            int i8;
            a aVar = a.this;
            View view = aVar.f5209i;
            if (i6 != -1) {
                boolean z5 = true;
                if (i7 != 1) {
                    if (i7 != 2) {
                        boolean z6 = false;
                        if (i7 != 64) {
                            if (i7 != 128) {
                                Chip.b bVar = (Chip.b) aVar;
                                if (i7 == 16) {
                                    Chip chip = Chip.this;
                                    if (i6 == 0) {
                                        return chip.performClick();
                                    }
                                    if (i6 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f3041i;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            z6 = true;
                                        }
                                        if (chip.f3051t) {
                                            chip.s.q(1, 1);
                                        }
                                    }
                                }
                                return z6;
                            }
                            if (aVar.f5211k == i6) {
                                aVar.f5211k = Integer.MIN_VALUE;
                                view.invalidate();
                                aVar.q(i6, 65536);
                            }
                            z5 = false;
                        } else {
                            AccessibilityManager accessibilityManager = aVar.f5208h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i8 = aVar.f5211k) != i6) {
                                if (i8 != Integer.MIN_VALUE) {
                                    aVar.f5211k = Integer.MIN_VALUE;
                                    aVar.f5209i.invalidate();
                                    aVar.q(i8, 65536);
                                }
                                aVar.f5211k = i6;
                                view.invalidate();
                                aVar.q(i6, 32768);
                            }
                            z5 = false;
                        }
                        return z5;
                    }
                    return aVar.j(i6);
                }
                return aVar.p(i6);
            }
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            return g0.d.j(view, i7, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f5209i = view;
            this.f5208h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            if (g0.d.c(view) == 0) {
                g0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // f0.a
    public final g b(View view) {
        if (this.f5210j == null) {
            this.f5210j = new c();
        }
        return this.f5210j;
    }

    @Override // f0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // f0.a
    public final void d(View view, f fVar) {
        boolean z5;
        View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.f3038f;
        if (aVar != null && aVar.R) {
            z5 = true;
        } else {
            z5 = false;
        }
        accessibilityNodeInfo.setCheckable(z5);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        fVar.j(chip.getText());
    }

    public final boolean j(int i6) {
        if (this.f5212l != i6) {
            return false;
        }
        this.f5212l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i6 == 1) {
            Chip chip = Chip.this;
            chip.f3046n = false;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final f k(int i6) {
        boolean z5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        f fVar = new f(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f5201n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        fVar.f4096b = -1;
        View view = this.f5209i;
        obtain.setParent(view);
        o(i6, fVar);
        if (fVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f5205e;
        fVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    fVar.f4097c = i6;
                    obtain.setSource(view, i6);
                    boolean z6 = false;
                    if (this.f5211k == i6) {
                        obtain.setAccessibilityFocused(true);
                        fVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        fVar.a(64);
                    }
                    if (this.f5212l == i6) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        fVar.a(2);
                    } else if (obtain.isFocusable()) {
                        fVar.a(1);
                    }
                    obtain.setFocused(z5);
                    int[] iArr = this.f5207g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f5204d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        fVar.d(rect3);
                        if (fVar.f4096b != -1) {
                            f fVar2 = new f(AccessibilityNodeInfo.obtain());
                            int i7 = fVar.f4096b;
                            while (true) {
                                accessibilityNodeInfo = fVar2.f4095a;
                                if (i7 == -1) {
                                    break;
                                }
                                fVar2.f4096b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i7, fVar2);
                                fVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i7 = fVar2.f4096b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f5206f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            fVar.f4095a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                while (true) {
                                    ViewParent parent = view.getParent();
                                    if (parent instanceof View) {
                                        view = (View) parent;
                                        if (view.getAlpha() > 0.0f) {
                                            if (view.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z6 = true;
                                    }
                                }
                            }
                            if (z6) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return fVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a.m(int, android.graphics.Rect):boolean");
    }

    public final f n(int i6) {
        if (i6 == -1) {
            View view = this.f5209i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            f fVar = new f(obtain);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                fVar.f4095a.addChild(view, ((Integer) arrayList.get(i7)).intValue());
            }
            return fVar;
        }
        return k(i6);
    }

    public abstract void o(int i6, f fVar);

    public final boolean p(int i6) {
        int i7;
        View view = this.f5209i;
        if ((!view.isFocused() && !view.requestFocus()) || (i7 = this.f5212l) == i6) {
            return false;
        }
        if (i7 != Integer.MIN_VALUE) {
            j(i7);
        }
        if (i6 == Integer.MIN_VALUE) {
            return false;
        }
        this.f5212l = i6;
        Chip.b bVar = (Chip.b) this;
        if (i6 == 1) {
            Chip chip = Chip.this;
            chip.f3046n = true;
            chip.refreshDrawableState();
        }
        q(i6, 8);
        return true;
    }

    public final void q(int i6, int i7) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i6 == Integer.MIN_VALUE || !this.f5208h.isEnabled() || (parent = (view = this.f5209i).getParent()) == null) {
            return;
        }
        if (i6 != -1) {
            obtain = AccessibilityEvent.obtain(i7);
            f n5 = n(i6);
            obtain.getText().add(n5.e());
            AccessibilityNodeInfo accessibilityNodeInfo = n5.f4095a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            i.a(obtain, view, i6);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i7);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
