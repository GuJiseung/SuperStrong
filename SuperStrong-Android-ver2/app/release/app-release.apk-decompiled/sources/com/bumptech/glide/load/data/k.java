package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class k<T> implements d<T> {

    /* renamed from: b  reason: collision with root package name */
    public final Uri f2868b;

    /* renamed from: c  reason: collision with root package name */
    public final ContentResolver f2869c;

    /* renamed from: d  reason: collision with root package name */
    public T f2870d;

    public k(ContentResolver contentResolver, Uri uri) {
        this.f2869c = contentResolver;
        this.f2868b = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        T t5 = this.f2870d;
        if (t5 != null) {
            try {
                c(t5);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t5);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }

    public abstract Object d(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final i1.a e() {
        return i1.a.LOCAL;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Object] */
    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.i iVar, d.a<? super T> aVar) {
        try {
            ?? r32 = (T) d(this.f2869c, this.f2868b);
            this.f2870d = r32;
            aVar.d(r32);
        } catch (FileNotFoundException e6) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e6);
            }
            aVar.c(e6);
        }
    }
}
