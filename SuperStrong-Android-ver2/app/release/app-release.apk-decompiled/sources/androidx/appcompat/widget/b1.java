package androidx.appcompat.widget;
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public int f687a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f688b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f689c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f690d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f691e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f692f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f693g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f694h = false;

    public final void a(int i6, int i7) {
        this.f689c = i6;
        this.f690d = i7;
        this.f694h = true;
        if (this.f693g) {
            if (i7 != Integer.MIN_VALUE) {
                this.f687a = i7;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f688b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f687a = i6;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f688b = i7;
        }
    }
}
