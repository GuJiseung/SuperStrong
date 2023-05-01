package i1;

import java.io.IOException;
/* loaded from: classes.dex */
public final class e extends IOException {
    public e(int i6, String str, IOException iOException) {
        super(str + ", status code: " + i6, iOException);
    }
}
