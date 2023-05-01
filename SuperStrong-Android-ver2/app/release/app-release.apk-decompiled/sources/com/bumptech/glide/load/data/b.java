package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: b  reason: collision with root package name */
    public final String f2847b;

    /* renamed from: c  reason: collision with root package name */
    public final AssetManager f2848c;

    /* renamed from: d  reason: collision with root package name */
    public T f2849d;

    public b(AssetManager assetManager, String str) {
        this.f2848c = assetManager;
        this.f2847b = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t5 = this.f2849d;
        if (t5 == null) {
            return;
        }
        try {
            c(t5);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t5);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.d
    public final i1.a e() {
        return i1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.i iVar, d.a<? super T> aVar) {
        try {
            T d6 = d(this.f2848c, this.f2847b);
            this.f2849d = d6;
            aVar.d(d6);
        } catch (IOException e6) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e6);
            }
            aVar.c(e6);
        }
    }
}
