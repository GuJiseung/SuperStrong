package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2854b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2855a = new HashMap();

    /* loaded from: classes.dex */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2856a;

        public b(Object obj) {
            this.f2856a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public final Object a() {
            return this.f2856a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void b() {
        }
    }
}
