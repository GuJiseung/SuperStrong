package a1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final a1.a f83a = new a1.a();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<WeakReference<l.b<ViewGroup, ArrayList<i>>>> f84b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList<ViewGroup> f85c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final i f86b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f87c;

        /* renamed from: a1.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0001a extends l {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l.b f88a;

            public C0001a(l.b bVar) {
                this.f88a = bVar;
            }

            @Override // a1.i.d
            public final void e(i iVar) {
                ((ArrayList) this.f88a.getOrDefault(a.this.f87c, null)).remove(iVar);
                iVar.y(this);
            }
        }

        public a(ViewGroup viewGroup, i iVar) {
            this.f86b = iVar;
            this.f87c = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01e3 A[EDGE_INSN: B:142:0x01e3->B:89:0x01e3 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x020b  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 701
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.m.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f87c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            m.f85c.remove(viewGroup);
            ArrayList<i> orDefault = m.b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<i> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().A(viewGroup);
                }
            }
            this.f86b.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, i iVar) {
        ArrayList<ViewGroup> arrayList = f85c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap<View, r0> weakHashMap = f0.g0.f3878a;
            if (g0.g.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (iVar == null) {
                    iVar = f83a;
                }
                i clone = iVar.clone();
                ArrayList<i> orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<i> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().x(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.h(viewGroup, true);
                }
                if (((h) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, null);
                    if (clone != null) {
                        a aVar = new a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static l.b<ViewGroup, ArrayList<i>> b() {
        l.b<ViewGroup, ArrayList<i>> bVar;
        ThreadLocal<WeakReference<l.b<ViewGroup, ArrayList<i>>>> threadLocal = f84b;
        WeakReference<l.b<ViewGroup, ArrayList<i>>> weakReference = threadLocal.get();
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            l.b<ViewGroup, ArrayList<i>> bVar2 = new l.b<>();
            threadLocal.set(new WeakReference<>(bVar2));
            return bVar2;
        }
        return bVar;
    }
}
