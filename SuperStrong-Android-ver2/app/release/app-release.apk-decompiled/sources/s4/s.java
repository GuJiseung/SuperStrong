package s4;

import e4.f;
/* loaded from: classes.dex */
public final class s extends l4.g implements k4.p<Boolean, f.b, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public static final s f6101c = new s();

    public s() {
        super(2);
    }

    @Override // k4.p
    public final Boolean e(Boolean bool, f.b bVar) {
        boolean z5;
        f.b bVar2 = bVar;
        if (!bool.booleanValue() && !(bVar2 instanceof q)) {
            z5 = false;
        } else {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
