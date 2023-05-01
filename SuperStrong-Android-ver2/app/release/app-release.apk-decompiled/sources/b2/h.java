package b2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.activity.k;
import com.superstrong.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
@Deprecated
/* loaded from: classes.dex */
public abstract class h<T extends View, Z> extends b2.a<Z> {

    /* renamed from: b  reason: collision with root package name */
    public final T f2358b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2359c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f2360d;

        /* renamed from: a  reason: collision with root package name */
        public final View f2361a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f2362b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0017a f2363c;

        /* renamed from: b2.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0017a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b  reason: collision with root package name */
            public final WeakReference<a> f2364b;

            public ViewTreeObserver$OnPreDrawListenerC0017a(a aVar) {
                this.f2364b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z5;
                boolean z6;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f2364b.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f2362b;
                    if (!arrayList.isEmpty()) {
                        int c6 = aVar.c();
                        int b6 = aVar.b();
                        boolean z7 = false;
                        if (c6 <= 0 && c6 != Integer.MIN_VALUE) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            if (b6 <= 0 && b6 != Integer.MIN_VALUE) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (z6) {
                                z7 = true;
                            }
                        }
                        if (z7) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).b(c6, b6);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f2361a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f2363c);
                            }
                            aVar.f2363c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f2361a = view;
        }

        public final int a(int i6, int i7, int i8) {
            int i9 = i7 - i8;
            if (i9 > 0) {
                return i9;
            }
            int i10 = i6 - i8;
            if (i10 > 0) {
                return i10;
            }
            View view = this.f2361a;
            if (!view.isLayoutRequested() && i7 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                Context context = view.getContext();
                if (f2360d == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    k.h(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    f2360d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return f2360d.intValue();
            }
            return 0;
        }

        public final int b() {
            View view = this.f2361a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            View view = this.f2361a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }
    }

    public h(T t5) {
        this.f2358b = t5;
        this.f2359c = new a(t5);
    }

    @Override // b2.g
    public final void c(a2.c cVar) {
        this.f2358b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // b2.g
    public final void e(f fVar) {
        boolean z5;
        boolean z6;
        a aVar = this.f2359c;
        int c6 = aVar.c();
        int b6 = aVar.b();
        boolean z7 = false;
        if (c6 <= 0 && c6 != Integer.MIN_VALUE) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            if (b6 <= 0 && b6 != Integer.MIN_VALUE) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6) {
                z7 = true;
            }
        }
        if (z7) {
            fVar.b(c6, b6);
            return;
        }
        ArrayList arrayList = aVar.f2362b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (aVar.f2363c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f2361a.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0017a viewTreeObserver$OnPreDrawListenerC0017a = new a.ViewTreeObserver$OnPreDrawListenerC0017a(aVar);
            aVar.f2363c = viewTreeObserver$OnPreDrawListenerC0017a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0017a);
        }
    }

    @Override // b2.g
    public final a2.c g() {
        Object tag = this.f2358b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof a2.c) {
                return (a2.c) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // b2.g
    public void h(Drawable drawable) {
        a aVar = this.f2359c;
        ViewTreeObserver viewTreeObserver = aVar.f2361a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f2363c);
        }
        aVar.f2363c = null;
        aVar.f2362b.clear();
    }

    @Override // b2.g
    public final void i(f fVar) {
        this.f2359c.f2362b.remove(fVar);
    }

    public final String toString() {
        return "Target for: " + this.f2358b;
    }
}
