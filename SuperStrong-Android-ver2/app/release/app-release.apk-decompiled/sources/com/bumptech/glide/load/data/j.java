package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import r1.w;
/* loaded from: classes.dex */
public final class j implements e<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final w f2866a;

    /* loaded from: classes.dex */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final l1.b f2867a;

        public a(l1.b bVar) {
            this.f2867a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new j(inputStream, this.f2867a);
        }
    }

    public j(InputStream inputStream, l1.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f2866a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final InputStream a() {
        w wVar = this.f2866a;
        wVar.reset();
        return wVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f2866a.f();
    }
}
