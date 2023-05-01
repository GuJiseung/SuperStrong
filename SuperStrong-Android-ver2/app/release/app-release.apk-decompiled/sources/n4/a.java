package n4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import l4.f;
/* loaded from: classes.dex */
public final class a extends m4.a {
    @Override // m4.a
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        f.e(current, "current()");
        return current;
    }
}
