package q3;

import java.io.IOException;
import java.io.StringWriter;
/* loaded from: classes.dex */
public abstract class n {
    public double a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            x3.c cVar = new x3.c(stringWriter);
            cVar.f6715g = true;
            t3.o.A.b(cVar, this);
            return stringWriter.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
