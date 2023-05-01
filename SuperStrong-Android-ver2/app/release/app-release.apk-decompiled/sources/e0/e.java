package e0;
/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f3804a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3805b;

    public /* synthetic */ e(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3805b = new Object[i6];
    }

    @Override // e0.d
    public boolean a(Object obj) {
        int i6;
        Object obj2;
        boolean z5;
        int i7 = 0;
        while (true) {
            i6 = this.f3804a;
            obj2 = this.f3805b;
            if (i7 < i6) {
                if (((Object[]) obj2)[i7] == obj) {
                    z5 = true;
                    break;
                }
                i7++;
            } else {
                z5 = false;
                break;
            }
        }
        if (!z5) {
            if (i6 >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i6] = obj;
            this.f3804a = i6 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // e0.d
    public Object b() {
        int i6 = this.f3804a;
        if (i6 > 0) {
            int i7 = i6 - 1;
            Object obj = this.f3805b;
            Object obj2 = ((Object[]) obj)[i7];
            ((Object[]) obj)[i7] = null;
            this.f3804a = i6 - 1;
            return obj2;
        }
        return null;
    }

    public final int c() {
        if ((this.f3804a & 128) != 0) {
            return ((int[]) this.f3805b)[7];
        }
        return 65535;
    }

    public final void d(int i6, int i7) {
        if (i6 >= 0) {
            int[] iArr = (int[]) this.f3805b;
            if (i6 >= iArr.length) {
                return;
            }
            this.f3804a = (1 << i6) | this.f3804a;
            iArr[i6] = i7;
        }
    }
}
