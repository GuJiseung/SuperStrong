package f5;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4012a;

    /* renamed from: b  reason: collision with root package name */
    public int f4013b;

    /* renamed from: c  reason: collision with root package name */
    public int f4014c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4015d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4016e;

    /* renamed from: f  reason: collision with root package name */
    public u f4017f;

    /* renamed from: g  reason: collision with root package name */
    public u f4018g;

    public u() {
        this.f4012a = new byte[8192];
        this.f4016e = true;
        this.f4015d = false;
    }

    public u(byte[] bArr, int i6, int i7) {
        this.f4012a = bArr;
        this.f4013b = i6;
        this.f4014c = i7;
        this.f4015d = true;
        this.f4016e = false;
    }

    @Nullable
    public final u a() {
        u uVar = this.f4017f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f4018g;
        uVar3.f4017f = uVar;
        this.f4017f.f4018g = uVar3;
        this.f4017f = null;
        this.f4018g = null;
        return uVar2;
    }

    public final void b(u uVar) {
        uVar.f4018g = this;
        uVar.f4017f = this.f4017f;
        this.f4017f.f4018g = uVar;
        this.f4017f = uVar;
    }

    public final u c() {
        this.f4015d = true;
        return new u(this.f4012a, this.f4013b, this.f4014c);
    }

    public final void d(u uVar, int i6) {
        if (!uVar.f4016e) {
            throw new IllegalArgumentException();
        }
        int i7 = uVar.f4014c;
        int i8 = i7 + i6;
        byte[] bArr = uVar.f4012a;
        if (i8 > 8192) {
            if (uVar.f4015d) {
                throw new IllegalArgumentException();
            }
            int i9 = uVar.f4013b;
            if ((i7 + i6) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i9, bArr, 0, i7 - i9);
            uVar.f4014c -= uVar.f4013b;
            uVar.f4013b = 0;
        }
        System.arraycopy(this.f4012a, this.f4013b, bArr, uVar.f4014c, i6);
        uVar.f4014c += i6;
        this.f4013b += i6;
    }
}
