package com.bumptech.glide;

import com.bumptech.glide.load.data.e;
import f2.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k1.t;
import o1.n;
import o1.o;
import o1.p;
import o1.r;
import w1.c;
import z1.c;
import z1.d;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final p f2817a;

    /* renamed from: b  reason: collision with root package name */
    public final z1.a f2818b;

    /* renamed from: c  reason: collision with root package name */
    public final z1.c f2819c;

    /* renamed from: d  reason: collision with root package name */
    public final z1.d f2820d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f2821e;

    /* renamed from: f  reason: collision with root package name */
    public final w1.c f2822f;

    /* renamed from: g  reason: collision with root package name */
    public final u0.c f2823g;

    /* renamed from: h  reason: collision with root package name */
    public final t f2824h = new t(1);

    /* renamed from: i  reason: collision with root package name */
    public final z1.b f2825i = new z1.b();

    /* renamed from: j  reason: collision with root package name */
    public final a.c f2826j;

    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m5, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m5);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public j() {
        a.c cVar = new a.c(new e0.f(20), new f2.b(), new f2.c());
        this.f2826j = cVar;
        this.f2817a = new p(cVar);
        this.f2818b = new z1.a();
        this.f2819c = new z1.c();
        this.f2820d = new z1.d();
        this.f2821e = new com.bumptech.glide.load.data.f();
        this.f2822f = new w1.c();
        this.f2823g = new u0.c();
        List<String> asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        z1.c cVar2 = this.f2819c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f6924a);
            cVar2.f6924a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f6924a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    cVar2.f6924a.add(str2);
                }
            }
        }
    }

    public final void a(i1.j jVar, Class cls, Class cls2, String str) {
        z1.c cVar = this.f2819c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a<>(cls, cls2, jVar));
        }
    }

    public final void b(Class cls, i1.k kVar) {
        z1.d dVar = this.f2820d;
        synchronized (dVar) {
            dVar.f6929a.add(new d.a(cls, kVar));
        }
    }

    public final void c(Class cls, Class cls2, o oVar) {
        p pVar = this.f2817a;
        synchronized (pVar) {
            r rVar = pVar.f5550a;
            synchronized (rVar) {
                r.b bVar = new r.b(cls, cls2, oVar);
                ArrayList arrayList = rVar.f5565a;
                arrayList.add(arrayList.size(), bVar);
            }
            pVar.f5551b.f5552a.clear();
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        u0.c cVar = this.f2823g;
        synchronized (cVar) {
            arrayList = cVar.f6234a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new b();
    }

    public final <Model> List<n<Model, ?>> e(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.f2817a;
        pVar.getClass();
        Class<?> cls = model.getClass();
        synchronized (pVar) {
            p.a.C0072a c0072a = (p.a.C0072a) pVar.f5551b.f5552a.get(cls);
            if (c0072a == null) {
                list = null;
            } else {
                list = c0072a.f5553a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(pVar.f5550a.a(cls));
                if (((p.a.C0072a) pVar.f5551b.f5552a.put(cls, new p.a.C0072a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z5 = true;
            for (int i6 = 0; i6 < size; i6++) {
                n<Model, ?> nVar = list.get(i6);
                if (nVar.b(model)) {
                    if (z5) {
                        emptyList = new ArrayList<>(size - i6);
                        z5 = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public final void f(e.a aVar) {
        com.bumptech.glide.load.data.f fVar = this.f2821e;
        synchronized (fVar) {
            fVar.f2855a.put(aVar.a(), aVar);
        }
    }

    public final void g(Class cls, Class cls2, w1.b bVar) {
        w1.c cVar = this.f2822f;
        synchronized (cVar) {
            cVar.f6576a.add(new c.a(cls, cls2, bVar));
        }
    }
}
