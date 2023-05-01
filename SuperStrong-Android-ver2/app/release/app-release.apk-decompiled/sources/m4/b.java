package m4;

import java.util.Random;
import l4.f;
/* loaded from: classes.dex */
public final class b extends m4.a {

    /* renamed from: d  reason: collision with root package name */
    public final a f5365d = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // m4.a
    public final Random b() {
        Random random = this.f5365d.get();
        f.e(random, "implStorage.get()");
        return random;
    }
}
