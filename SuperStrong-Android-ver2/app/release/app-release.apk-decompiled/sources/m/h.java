package m;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: b  reason: collision with root package name */
    public boolean f5189b;

    /* renamed from: f  reason: collision with root package name */
    public float f5193f;

    /* renamed from: j  reason: collision with root package name */
    public int f5197j;

    /* renamed from: c  reason: collision with root package name */
    public int f5190c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f5191d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f5192e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5194g = false;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f5195h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f5196i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    public b[] f5198k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f5199l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f5200m = 0;

    public h(int i6) {
        this.f5197j = i6;
    }

    public final void a(b bVar) {
        int i6 = 0;
        while (true) {
            int i7 = this.f5199l;
            if (i6 >= i7) {
                b[] bVarArr = this.f5198k;
                if (i7 >= bVarArr.length) {
                    this.f5198k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f5198k;
                int i8 = this.f5199l;
                bVarArr2[i8] = bVar;
                this.f5199l = i8 + 1;
                return;
            } else if (this.f5198k[i6] == bVar) {
                return;
            } else {
                i6++;
            }
        }
    }

    public final void b(b bVar) {
        int i6 = this.f5199l;
        int i7 = 0;
        while (i7 < i6) {
            if (this.f5198k[i7] == bVar) {
                while (i7 < i6 - 1) {
                    b[] bVarArr = this.f5198k;
                    int i8 = i7 + 1;
                    bVarArr[i7] = bVarArr[i8];
                    i7 = i8;
                }
                this.f5199l--;
                return;
            }
            i7++;
        }
    }

    public final void c() {
        this.f5197j = 5;
        this.f5192e = 0;
        this.f5190c = -1;
        this.f5191d = -1;
        this.f5193f = 0.0f;
        this.f5194g = false;
        int i6 = this.f5199l;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f5198k[i7] = null;
        }
        this.f5199l = 0;
        this.f5200m = 0;
        this.f5189b = false;
        Arrays.fill(this.f5196i, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return this.f5190c - hVar.f5190c;
    }

    public final void d(d dVar, float f6) {
        this.f5193f = f6;
        this.f5194g = true;
        int i6 = this.f5199l;
        this.f5191d = -1;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f5198k[i7].h(dVar, this, false);
        }
        this.f5199l = 0;
    }

    public final void e(d dVar, b bVar) {
        int i6 = this.f5199l;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f5198k[i7].i(dVar, bVar, false);
        }
        this.f5199l = 0;
    }

    public final String toString() {
        return "" + this.f5190c;
    }
}
