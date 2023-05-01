package f2;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f3958a;

        public final void a() {
            if (this.f3958a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
