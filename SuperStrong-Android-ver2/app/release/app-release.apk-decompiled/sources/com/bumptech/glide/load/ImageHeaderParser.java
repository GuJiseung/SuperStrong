package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import l1.b;
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2843b;

        ImageType(boolean z5) {
            this.f2843b = z5;
        }

        public boolean hasAlpha() {
            return this.f2843b;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, b bVar);

    ImageType c(InputStream inputStream);
}
