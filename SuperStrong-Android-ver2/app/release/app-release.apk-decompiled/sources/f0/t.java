package f0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3913a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f3914b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3915c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3916d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3917e;

    public t(View view) {
        this.f3915c = view;
    }

    public final boolean a(float f6, float f7, boolean z5) {
        ViewParent f8;
        if (!this.f3916d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return o0.a(f8, this.f3915c, f6, f7, z5);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedFling", e6);
            return false;
        }
    }

    public final boolean b(float f6, float f7) {
        ViewParent f8;
        if (!this.f3916d || (f8 = f(0)) == null) {
            return false;
        }
        try {
            return o0.b(f8, this.f3915c, f6, f7);
        } catch (AbstractMethodError e6) {
            Log.e("ViewParentCompat", "ViewParent " + f8 + " does not implement interface method onNestedPreFling", e6);
            return false;
        }
    }

    public final boolean c(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        ViewParent f6;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f3916d || (f6 = f(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f3915c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f3917e == null) {
                this.f3917e = new int[2];
            }
            iArr3 = this.f3917e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f3915c;
        if (f6 instanceof u) {
            ((u) f6).j(view2, i6, i7, iArr3, i8);
        } else if (i8 == 0) {
            try {
                o0.c(f6, view2, i6, i7, iArr3);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i6, int i7, int i8, int[] iArr) {
        e(0, i6, 0, i7, null, i8, iArr);
    }

    public final boolean e(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent f6;
        int i11;
        int i12;
        int[] iArr3;
        if (!this.f3916d || (f6 = f(i10)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f3915c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i11 = iArr[0];
            i12 = iArr[1];
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (iArr2 == null) {
            if (this.f3917e == null) {
                this.f3917e = new int[2];
            }
            int[] iArr4 = this.f3917e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f3915c;
        if (f6 instanceof v) {
            ((v) f6).m(view2, i6, i7, i8, i9, i10, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i8;
            iArr3[1] = iArr3[1] + i9;
            if (f6 instanceof u) {
                ((u) f6).n(view2, i6, i7, i8, i9, i10);
            } else if (i10 == 0) {
                try {
                    o0.d(f6, view2, i6, i7, i8, i9);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onNestedScroll", e6);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        }
        return true;
    }

    public final ViewParent f(int i6) {
        if (i6 != 0) {
            if (i6 != 1) {
                return null;
            }
            return this.f3914b;
        }
        return this.f3913a;
    }

    public final boolean g(int i6, int i7) {
        boolean z5;
        boolean f6;
        if (f(i7) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        if (this.f3916d) {
            View view = this.f3915c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z6 = parent instanceof u;
                if (z6) {
                    f6 = ((u) parent).o(view2, view, i6, i7);
                } else {
                    if (i7 == 0) {
                        try {
                            f6 = o0.f(parent, view2, view, i6);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e6);
                        }
                    }
                    f6 = false;
                }
                if (f6) {
                    if (i7 != 0) {
                        if (i7 == 1) {
                            this.f3914b = parent;
                        }
                    } else {
                        this.f3913a = parent;
                    }
                    if (z6) {
                        ((u) parent).b(view2, view, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            o0.e(parent, view2, view, i6);
                        } catch (AbstractMethodError e7) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e7);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void h(int i6) {
        ViewParent f6 = f(i6);
        if (f6 != null) {
            boolean z5 = f6 instanceof u;
            View view = this.f3915c;
            if (z5) {
                ((u) f6).i(view, i6);
            } else if (i6 == 0) {
                try {
                    o0.g(f6, view);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + f6 + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    this.f3914b = null;
                    return;
                }
                return;
            }
            this.f3913a = null;
        }
    }
}
