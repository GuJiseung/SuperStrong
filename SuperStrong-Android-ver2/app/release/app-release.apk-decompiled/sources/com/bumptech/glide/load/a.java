package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;
import l1.b;
import r1.w;
/* loaded from: classes.dex */
public final class a {
    public static int a(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                int b6 = ((ImageHeaderParser) list.get(i6)).b(inputStream, bVar);
                if (b6 != -1) {
                    return b6;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(b bVar, InputStream inputStream, List list) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            try {
                ImageHeaderParser.ImageType c6 = ((ImageHeaderParser) list.get(i6)).c(inputStream);
                inputStream.reset();
                if (c6 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return c6;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
