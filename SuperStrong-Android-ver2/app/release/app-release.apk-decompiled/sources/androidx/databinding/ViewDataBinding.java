package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.u;
import com.superstrong.android.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
/* loaded from: classes.dex */
public abstract class ViewDataBinding extends k {

    /* renamed from: n  reason: collision with root package name */
    public static final boolean f1292n = true;

    /* renamed from: o  reason: collision with root package name */
    public static final ReferenceQueue<ViewDataBinding> f1293o;

    /* renamed from: p  reason: collision with root package name */
    public static final b f1294p;

    /* renamed from: e  reason: collision with root package name */
    public final c f1295e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1296f;

    /* renamed from: g  reason: collision with root package name */
    public final f[] f1297g;

    /* renamed from: h  reason: collision with root package name */
    public final View f1298h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1299i;

    /* renamed from: j  reason: collision with root package name */
    public final Choreographer f1300j;

    /* renamed from: k  reason: collision with root package name */
    public final e f1301k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f1302l;

    /* renamed from: m  reason: collision with root package name */
    public final androidx.databinding.b f1303m;

    /* loaded from: classes.dex */
    public static class OnStartListener implements n {
        @u(j.b.ON_START)
        public void onStart() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a {
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            ViewDataBinding viewDataBinding;
            if (view != null) {
                viewDataBinding = (ViewDataBinding) view.getTag(R.id.dataBinding);
            } else {
                viewDataBinding = null;
            }
            viewDataBinding.f1295e.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.f1296f = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> poll = ViewDataBinding.f1293o.poll();
                if (poll == null) {
                    break;
                } else if (poll instanceof f) {
                    ((f) poll).a();
                }
            }
            if (!ViewDataBinding.this.f1298h.isAttachedToWindow()) {
                View view = ViewDataBinding.this.f1298h;
                b bVar = ViewDataBinding.f1294p;
                view.removeOnAttachStateChangeListener(bVar);
                ViewDataBinding.this.f1298h.addOnAttachStateChangeListener(bVar);
                return;
            }
            ViewDataBinding viewDataBinding = ViewDataBinding.this;
            if (viewDataBinding.f1299i) {
                viewDataBinding.v();
            } else if (viewDataBinding.r()) {
                viewDataBinding.f1299i = true;
                viewDataBinding.q();
                viewDataBinding.f1299i = false;
            }
        }
    }

    static {
        new a();
        f1293o = new ReferenceQueue<>();
        f1294p = new b();
    }

    public ViewDataBinding(Object obj, View view, int i6) {
        androidx.databinding.b bVar;
        if (obj == null) {
            bVar = null;
        } else if (obj instanceof androidx.databinding.b) {
            bVar = (androidx.databinding.b) obj;
        } else {
            throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
        }
        this.f1295e = new c();
        this.f1296f = false;
        this.f1303m = bVar;
        this.f1297g = new f[i6];
        this.f1298h = view;
        if (Looper.myLooper() != null) {
            if (f1292n) {
                this.f1300j = Choreographer.getInstance();
                this.f1301k = new e(this);
                return;
            }
            this.f1301k = null;
            this.f1302l = new Handler(Looper.myLooper());
            return;
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    public static ViewDataBinding s(LayoutInflater layoutInflater, int i6) {
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.c.f1305a;
        return androidx.databinding.c.f1305a.b(null, layoutInflater.inflate(i6, (ViewGroup) null, false), i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.view.View r6, java.lang.Object[] r7, android.util.SparseIntArray r8, boolean r9) {
        /*
            r0 = 0
            if (r6 == 0) goto Ld
            r1 = 2131296430(0x7f0900ae, float:1.8210776E38)
            java.lang.Object r1 = r6.getTag(r1)
            androidx.databinding.ViewDataBinding r1 = (androidx.databinding.ViewDataBinding) r1
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r6.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1c
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L69
            if (r0 == 0) goto L69
            java.lang.String r9 = "layout"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L69
            r9 = 95
            int r9 = r0.lastIndexOf(r9)
            if (r9 <= 0) goto L8f
            int r9 = r9 + r2
            int r3 = r0.length()
            if (r3 != r9) goto L3b
        L39:
            r3 = r1
            goto L4d
        L3b:
            r4 = r9
        L3c:
            if (r4 >= r3) goto L4c
            char r5 = r0.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L49
            goto L39
        L49:
            int r4 = r4 + 1
            goto L3c
        L4c:
            r3 = r2
        L4d:
            if (r3 == 0) goto L8f
            int r3 = r0.length()
            r4 = r1
        L54:
            if (r9 >= r3) goto L62
            int r4 = r4 * 10
            char r5 = r0.charAt(r9)
            int r5 = r5 + (-48)
            int r4 = r4 + r5
            int r9 = r9 + 1
            goto L54
        L62:
            r9 = r7[r4]
            if (r9 != 0) goto L90
            r7[r4] = r6
            goto L90
        L69:
            if (r0 == 0) goto L8f
            java.lang.String r9 = "binding_"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L8f
            int r9 = r0.length()
            r3 = 8
            r4 = r1
        L7a:
            if (r3 >= r9) goto L88
            int r4 = r4 * 10
            char r5 = r0.charAt(r3)
            int r5 = r5 + (-48)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L7a
        L88:
            r9 = r7[r4]
            if (r9 != 0) goto L90
            r7[r4] = r6
            goto L90
        L8f:
            r2 = r1
        L90:
            if (r2 != 0) goto La7
            int r9 = r6.getId()
            if (r9 <= 0) goto La7
            if (r8 == 0) goto La7
            r0 = -1
            int r9 = r8.get(r9, r0)
            if (r9 < 0) goto La7
            r0 = r7[r9]
            if (r0 != 0) goto La7
            r7[r9] = r6
        La7:
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto Lbe
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r9 = r6.getChildCount()
            r0 = r1
        Lb2:
            if (r0 >= r9) goto Lbe
            android.view.View r2 = r6.getChildAt(r0)
            t(r2, r7, r8, r1)
            int r0 = r0 + 1
            goto Lb2
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.t(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public static Object[] u(View view, int i6, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i6];
        t(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public abstract void q();

    public abstract boolean r();

    public final void v() {
        synchronized (this) {
            if (this.f1296f) {
                return;
            }
            this.f1296f = true;
            if (f1292n) {
                this.f1300j.postFrameCallback(this.f1301k);
            } else {
                this.f1302l.post(this.f1295e);
            }
        }
    }

    public final void w(int i6) {
        f fVar = this.f1297g[i6];
        if (fVar != null) {
            fVar.a();
        }
    }
}
