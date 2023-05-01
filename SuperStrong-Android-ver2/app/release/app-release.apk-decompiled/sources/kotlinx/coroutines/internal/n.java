package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.a;
/* loaded from: classes.dex */
public final class n<T> {
    private volatile AtomicReferenceArray<T> array;

    public n(int i6) {
        this.array = new AtomicReferenceArray<>(i6);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i6) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i6 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i6);
        }
        return null;
    }

    public final void c(int i6, a.C0059a c0059a) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i6 < length) {
            atomicReferenceArray.set(i6, c0059a);
            return;
        }
        int i7 = i6 + 1;
        int i8 = length * 2;
        if (i7 < i8) {
            i7 = i8;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i7);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i6, c0059a);
        this.array = atomicReferenceArray2;
    }
}
