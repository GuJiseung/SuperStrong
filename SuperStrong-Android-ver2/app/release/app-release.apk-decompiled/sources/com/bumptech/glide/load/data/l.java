package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class l extends b<InputStream> {
    public l(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void c(InputStream inputStream) {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    public final InputStream d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
