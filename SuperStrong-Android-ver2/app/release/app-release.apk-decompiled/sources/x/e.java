package x;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6625a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f6626b;

    public e(int i6, int i7) {
        this.f6625a = new int[]{i6, i7};
        this.f6626b = new float[]{0.0f, 1.0f};
    }

    public e(int i6, int i7, int i8) {
        this.f6625a = new int[]{i6, i7, i8};
        this.f6626b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public e(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f6625a = new int[size];
        this.f6626b = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            this.f6625a[i6] = ((Integer) arrayList.get(i6)).intValue();
            this.f6626b[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }
}
