package m0;

import android.graphics.Rect;
import g0.f;
import java.util.Comparator;
import m0.a;
/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public interface a<T> {
    }

    /* renamed from: m0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0062b<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f5215a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f5216b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5217c;

        /* renamed from: d  reason: collision with root package name */
        public final a<T> f5218d;

        public C0062b(boolean z5, a.C0061a c0061a) {
            this.f5217c = z5;
            this.f5218d = c0061a;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            a.C0061a c0061a = (a.C0061a) this.f5218d;
            c0061a.getClass();
            Rect rect = this.f5215a;
            ((f) t5).d(rect);
            c0061a.getClass();
            Rect rect2 = this.f5216b;
            ((f) t6).d(rect2);
            int i6 = rect.top;
            int i7 = rect2.top;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.left;
            int i9 = rect2.left;
            boolean z5 = this.f5217c;
            if (i8 < i9) {
                if (!z5) {
                    return -1;
                }
                return 1;
            } else if (i8 > i9) {
                if (z5) {
                    return -1;
                }
                return 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                if (i10 < i11) {
                    return -1;
                }
                if (i10 > i11) {
                    return 1;
                }
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 < i13) {
                    if (!z5) {
                        return -1;
                    }
                    return 1;
                } else if (i12 > i13) {
                    if (z5) {
                        return -1;
                    }
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L7d
            if (r0 != 0) goto Lf
            goto L7d
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L45
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L45
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L45
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L45
        L43:
            r7 = r6
            goto L46
        L45:
            r7 = r2
        L46:
            if (r7 != 0) goto L49
            return r6
        L49:
            if (r9 == r5) goto L7c
            if (r9 != r4) goto L4e
            goto L7c
        L4e:
            int r11 = d(r9, r10, r11)
            if (r9 == r5) goto L6f
            if (r9 == r3) goto L6a
            if (r9 == r4) goto L65
            if (r9 != r1) goto L5f
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L73
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L65:
            int r9 = r12.right
            int r10 = r10.right
            goto L73
        L6a:
            int r9 = r10.top
            int r10 = r12.top
            goto L73
        L6f:
            int r9 = r10.left
            int r10 = r12.left
        L73:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L7b
            r2 = r6
        L7b:
            return r2
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.b.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i6, Rect rect, Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static boolean c(int i6, Rect rect, Rect rect2) {
        if (i6 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        } else if (i6 == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        } else if (i6 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        } else if (i6 == 130) {
            int i13 = rect.top;
            int i14 = rect2.top;
            return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int d(int i6, Rect rect, Rect rect2) {
        int i7;
        int i8;
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 == 130) {
                        i7 = rect2.top;
                        i8 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i7 = rect2.left;
                    i8 = rect.right;
                }
            } else {
                i7 = rect.top;
                i8 = rect2.bottom;
            }
        } else {
            i7 = rect.left;
            i8 = rect2.right;
        }
        return Math.max(0, i7 - i8);
    }

    public static int e(int i6, Rect rect, Rect rect2) {
        int height;
        int i7;
        int height2;
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / 2) + rect.left;
            i7 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / 2) + i7));
        }
        height = (rect.height() / 2) + rect.top;
        i7 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / 2) + i7));
    }
}
