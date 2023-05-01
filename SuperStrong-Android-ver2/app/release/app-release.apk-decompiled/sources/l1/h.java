package l1;
/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // l1.a
    public final String a() {
        return "IntegerArrayPool";
    }

    @Override // l1.a
    public final int b(int[] iArr) {
        return iArr.length;
    }

    @Override // l1.a
    public final int c() {
        return 4;
    }

    @Override // l1.a
    public final int[] newArray(int i6) {
        return new int[i6];
    }
}
