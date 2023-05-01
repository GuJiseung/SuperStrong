package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.a0;
import androidx.lifecycle.j;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f254a;

    /* renamed from: c  reason: collision with root package name */
    public final g f256c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f257d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f258e;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<f> f255b = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f259f = false;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements m, androidx.activity.a {

        /* renamed from: b  reason: collision with root package name */
        public final androidx.lifecycle.j f260b;

        /* renamed from: c  reason: collision with root package name */
        public final f f261c;

        /* renamed from: d  reason: collision with root package name */
        public b f262d;

        public LifecycleOnBackPressedCancellable(androidx.lifecycle.j jVar, a0.b bVar) {
            this.f260b = jVar;
            this.f261c = bVar;
            jVar.a(this);
        }

        @Override // androidx.activity.a
        public final void cancel() {
            this.f260b.c(this);
            this.f261c.f275b.remove(this);
            b bVar = this.f262d;
            if (bVar != null) {
                bVar.cancel();
                this.f262d = null;
            }
        }

        @Override // androidx.lifecycle.m
        public final void f(o oVar, j.b bVar) {
            if (bVar == j.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ArrayDeque<f> arrayDeque = onBackPressedDispatcher.f255b;
                f fVar = this.f261c;
                arrayDeque.add(fVar);
                b bVar2 = new b(fVar);
                fVar.f275b.add(bVar2);
                if (b0.a.a()) {
                    onBackPressedDispatcher.c();
                    fVar.f276c = onBackPressedDispatcher.f256c;
                }
                this.f262d = bVar2;
            } else if (bVar == j.b.ON_STOP) {
                b bVar3 = this.f262d;
                if (bVar3 != null) {
                    bVar3.cancel();
                }
            } else if (bVar == j.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static OnBackInvokedCallback a(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.activity.h
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void b(Object obj, int i6, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i6, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.a {

        /* renamed from: b  reason: collision with root package name */
        public final f f264b;

        public b(f fVar) {
            this.f264b = fVar;
        }

        @Override // androidx.activity.a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            ArrayDeque<f> arrayDeque = onBackPressedDispatcher.f255b;
            f fVar = this.f264b;
            arrayDeque.remove(fVar);
            fVar.f275b.remove(this);
            if (b0.a.a()) {
                fVar.f276c = null;
                onBackPressedDispatcher.c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f254a = runnable;
        if (b0.a.a()) {
            this.f256c = new g(0, this);
            this.f257d = a.a(new androidx.activity.b(2, this));
        }
    }

    @SuppressLint({"LambdaLast"})
    public final void a(o oVar, a0.b bVar) {
        p v2 = oVar.v();
        if (v2.f1760b == j.c.DESTROYED) {
            return;
        }
        bVar.f275b.add(new LifecycleOnBackPressedCancellable(v2, bVar));
        if (b0.a.a()) {
            c();
            bVar.f276c = this.f256c;
        }
    }

    public final void b() {
        Iterator<f> descendingIterator = this.f255b.descendingIterator();
        while (descendingIterator.hasNext()) {
            f next = descendingIterator.next();
            if (next.f274a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f254a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        boolean z5;
        Iterator<f> descendingIterator = this.f255b.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                if (descendingIterator.next().f274a) {
                    z5 = true;
                    break;
                }
            } else {
                z5 = false;
                break;
            }
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f258e;
        if (onBackInvokedDispatcher != null) {
            OnBackInvokedCallback onBackInvokedCallback = this.f257d;
            if (z5 && !this.f259f) {
                a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f259f = true;
            } else if (!z5 && this.f259f) {
                a.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f259f = false;
            }
        }
    }
}
