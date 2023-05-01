package h1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f4400b;

    /* renamed from: c  reason: collision with root package name */
    public c f4401c;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4399a = new byte[256];

    /* renamed from: d  reason: collision with root package name */
    public int f4402d = 0;

    public final boolean a() {
        return this.f4401c.f4389b != 0;
    }

    public final c b() {
        boolean z5;
        boolean z6;
        boolean z7;
        byte[] bArr;
        boolean z8;
        if (this.f4400b != null) {
            if (a()) {
                return this.f4401c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i6 = 0; i6 < 6; i6++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f4401c.f4389b = 1;
            } else {
                this.f4401c.f4393f = f();
                this.f4401c.f4394g = f();
                int c6 = c();
                c cVar = this.f4401c;
                if ((c6 & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                cVar.f4395h = z5;
                cVar.f4396i = (int) Math.pow(2.0d, (c6 & 7) + 1);
                this.f4401c.f4397j = c();
                c cVar2 = this.f4401c;
                c();
                cVar2.getClass();
                if (this.f4401c.f4395h && !a()) {
                    c cVar3 = this.f4401c;
                    cVar3.f4388a = e(cVar3.f4396i);
                    c cVar4 = this.f4401c;
                    cVar4.f4398k = cVar4.f4388a[cVar4.f4397j];
                }
            }
            if (!a()) {
                boolean z9 = false;
                while (!z9 && !a() && this.f4401c.f4390c <= Integer.MAX_VALUE) {
                    int c7 = c();
                    if (c7 != 33) {
                        if (c7 != 44) {
                            if (c7 != 59) {
                                this.f4401c.f4389b = 1;
                            } else {
                                z9 = true;
                            }
                        } else {
                            c cVar5 = this.f4401c;
                            if (cVar5.f4391d == null) {
                                cVar5.f4391d = new b();
                            }
                            this.f4401c.f4391d.f4377a = f();
                            this.f4401c.f4391d.f4378b = f();
                            this.f4401c.f4391d.f4379c = f();
                            this.f4401c.f4391d.f4380d = f();
                            int c8 = c();
                            if ((c8 & 128) != 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c8 & 7) + 1);
                            b bVar = this.f4401c.f4391d;
                            if ((c8 & 64) != 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            bVar.f4381e = z7;
                            if (z6) {
                                bVar.f4387k = e(pow);
                            } else {
                                bVar.f4387k = null;
                            }
                            this.f4401c.f4391d.f4386j = this.f4400b.position();
                            c();
                            g();
                            if (!a()) {
                                c cVar6 = this.f4401c;
                                cVar6.f4390c++;
                                cVar6.f4392e.add(cVar6.f4391d);
                            }
                        }
                    } else {
                        int c9 = c();
                        if (c9 != 1) {
                            if (c9 != 249) {
                                if (c9 != 254 && c9 == 255) {
                                    d();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i7 = 0;
                                    while (true) {
                                        bArr = this.f4399a;
                                        if (i7 >= 11) {
                                            break;
                                        }
                                        sb2.append((char) bArr[i7]);
                                        i7++;
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            d();
                                            if (bArr[0] == 1) {
                                                byte b6 = bArr[1];
                                                byte b7 = bArr[2];
                                                this.f4401c.getClass();
                                            }
                                            if (this.f4402d > 0) {
                                            }
                                        } while (!a());
                                    }
                                }
                            } else {
                                this.f4401c.f4391d = new b();
                                c();
                                int c10 = c();
                                b bVar2 = this.f4401c.f4391d;
                                int i8 = (c10 & 28) >> 2;
                                bVar2.f4383g = i8;
                                if (i8 == 0) {
                                    bVar2.f4383g = 1;
                                }
                                if ((c10 & 1) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                bVar2.f4382f = z8;
                                int f6 = f();
                                if (f6 < 2) {
                                    f6 = 10;
                                }
                                b bVar3 = this.f4401c.f4391d;
                                bVar3.f4385i = f6 * 10;
                                bVar3.f4384h = c();
                                c();
                            }
                        }
                        g();
                    }
                }
                c cVar7 = this.f4401c;
                if (cVar7.f4390c < 0) {
                    cVar7.f4389b = 1;
                }
            }
            return this.f4401c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f4400b.get() & 255;
        } catch (Exception unused) {
            this.f4401c.f4389b = 1;
            return 0;
        }
    }

    public final void d() {
        int c6 = c();
        this.f4402d = c6;
        if (c6 <= 0) {
            return;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            try {
                i7 = this.f4402d;
                if (i6 >= i7) {
                    return;
                }
                i7 -= i6;
                this.f4400b.get(this.f4399a, i6, i7);
                i6 += i7;
            } catch (Exception e6) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i6 + " count: " + i7 + " blockSize: " + this.f4402d, e6);
                }
                this.f4401c.f4389b = 1;
                return;
            }
        }
    }

    public final int[] e(int i6) {
        byte[] bArr = new byte[i6 * 3];
        int[] iArr = null;
        try {
            this.f4400b.get(bArr);
            iArr = new int[256];
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i10 + 1;
                int i12 = i7 + 1;
                iArr[i7] = ((bArr[i8] & 255) << 16) | (-16777216) | ((bArr[i9] & 255) << 8) | (bArr[i10] & 255);
                i8 = i11;
                i7 = i12;
            }
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f4401c.f4389b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f4400b.getShort();
    }

    public final void g() {
        int c6;
        do {
            c6 = c();
            this.f4400b.position(Math.min(this.f4400b.position() + c6, this.f4400b.limit()));
        } while (c6 > 0);
    }
}
