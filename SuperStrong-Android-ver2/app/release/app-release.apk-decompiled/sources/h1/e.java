package h1;

import android.graphics.Bitmap;
import android.util.Log;
import h1.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f4403a;

    /* renamed from: c  reason: collision with root package name */
    public final a.InterfaceC0046a f4405c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f4406d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4407e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f4408f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f4409g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f4410h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f4411i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f4412j;

    /* renamed from: k  reason: collision with root package name */
    public int f4413k;

    /* renamed from: l  reason: collision with root package name */
    public c f4414l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f4415m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4416n;

    /* renamed from: o  reason: collision with root package name */
    public int f4417o;

    /* renamed from: p  reason: collision with root package name */
    public int f4418p;

    /* renamed from: q  reason: collision with root package name */
    public int f4419q;

    /* renamed from: r  reason: collision with root package name */
    public int f4420r;
    public Boolean s;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4404b = new int[256];

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f4421t = Bitmap.Config.ARGB_8888;

    public e(v1.b bVar, c cVar, ByteBuffer byteBuffer, int i6) {
        byte[] bArr;
        int[] iArr;
        this.f4405c = bVar;
        this.f4414l = new c();
        synchronized (this) {
            if (i6 > 0) {
                int highestOneBit = Integer.highestOneBit(i6);
                this.f4417o = 0;
                this.f4414l = cVar;
                this.f4413k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f4406d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f4406d.order(ByteOrder.LITTLE_ENDIAN);
                this.f4416n = false;
                Iterator it = cVar.f4392e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((b) it.next()).f4383g == 3) {
                        this.f4416n = true;
                        break;
                    }
                }
                this.f4418p = highestOneBit;
                int i7 = cVar.f4393f;
                this.f4420r = i7 / highestOneBit;
                int i8 = cVar.f4394g;
                this.f4419q = i8 / highestOneBit;
                int i9 = i7 * i8;
                l1.b bVar2 = ((v1.b) this.f4405c).f6280b;
                if (bVar2 == null) {
                    bArr = new byte[i9];
                } else {
                    bArr = (byte[]) bVar2.c(i9, byte[].class);
                }
                this.f4411i = bArr;
                a.InterfaceC0046a interfaceC0046a = this.f4405c;
                int i10 = this.f4420r * this.f4419q;
                l1.b bVar3 = ((v1.b) interfaceC0046a).f6280b;
                if (bVar3 == null) {
                    iArr = new int[i10];
                } else {
                    iArr = (int[]) bVar3.c(i10, int[].class);
                }
                this.f4412j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i6);
            }
        }
    }

    @Override // h1.a
    public final int a() {
        return this.f4413k;
    }

    @Override // h1.a
    public final synchronized Bitmap b() {
        b bVar;
        byte[] bArr;
        if (this.f4414l.f4390c <= 0 || this.f4413k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f4414l.f4390c + ", framePointer=" + this.f4413k);
            }
            this.f4417o = 1;
        }
        int i6 = this.f4417o;
        if (i6 != 1 && i6 != 2) {
            this.f4417o = 0;
            if (this.f4407e == null) {
                l1.b bVar2 = ((v1.b) this.f4405c).f6280b;
                if (bVar2 == null) {
                    bArr = new byte[255];
                } else {
                    bArr = (byte[]) bVar2.c(255, byte[].class);
                }
                this.f4407e = bArr;
            }
            b bVar3 = (b) this.f4414l.f4392e.get(this.f4413k);
            int i7 = this.f4413k - 1;
            if (i7 >= 0) {
                bVar = (b) this.f4414l.f4392e.get(i7);
            } else {
                bVar = null;
            }
            int[] iArr = bVar3.f4387k;
            if (iArr == null) {
                iArr = this.f4414l.f4388a;
            }
            this.f4403a = iArr;
            if (iArr == null) {
                if (Log.isLoggable("e", 3)) {
                    Log.d("e", "No valid color table found for frame #" + this.f4413k);
                }
                this.f4417o = 1;
                return null;
            }
            if (bVar3.f4382f) {
                System.arraycopy(iArr, 0, this.f4404b, 0, iArr.length);
                int[] iArr2 = this.f4404b;
                this.f4403a = iArr2;
                iArr2[bVar3.f4384h] = 0;
                if (bVar3.f4383g == 2 && this.f4413k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return j(bVar3, bVar);
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f4417o);
        }
        return null;
    }

    @Override // h1.a
    public final void c() {
        this.f4413k = (this.f4413k + 1) % this.f4414l.f4390c;
    }

    @Override // h1.a
    public final void clear() {
        l1.b bVar;
        l1.b bVar2;
        l1.b bVar3;
        this.f4414l = null;
        byte[] bArr = this.f4411i;
        a.InterfaceC0046a interfaceC0046a = this.f4405c;
        if (bArr != null && (bVar3 = ((v1.b) interfaceC0046a).f6280b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f4412j;
        if (iArr != null && (bVar2 = ((v1.b) interfaceC0046a).f6280b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f4415m;
        if (bitmap != null) {
            ((v1.b) interfaceC0046a).f6279a.e(bitmap);
        }
        this.f4415m = null;
        this.f4406d = null;
        this.s = null;
        byte[] bArr2 = this.f4407e;
        if (bArr2 != null && (bVar = ((v1.b) interfaceC0046a).f6280b) != null) {
            bVar.put(bArr2);
        }
    }

    @Override // h1.a
    public final int d() {
        return this.f4414l.f4390c;
    }

    @Override // h1.a
    public final int e() {
        int i6;
        c cVar = this.f4414l;
        int i7 = cVar.f4390c;
        if (i7 > 0 && (i6 = this.f4413k) >= 0) {
            if (i6 >= 0 && i6 < i7) {
                return ((b) cVar.f4392e.get(i6)).f4385i;
            }
            return -1;
        }
        return 0;
    }

    @Override // h1.a
    public final int f() {
        return (this.f4412j.length * 4) + this.f4406d.limit() + this.f4411i.length;
    }

    @Override // h1.a
    public final ByteBuffer g() {
        return this.f4406d;
    }

    public final Bitmap h() {
        Bitmap.Config config;
        Boolean bool = this.s;
        if (bool != null && !bool.booleanValue()) {
            config = this.f4421t;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap c6 = ((v1.b) this.f4405c).f6279a.c(this.f4420r, this.f4419q, config);
        c6.setHasAlpha(true);
        return c6;
    }

    public final void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f4421t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r3.f4397j == r36.f4384h) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap j(h1.b r36, h1.b r37) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.e.j(h1.b, h1.b):android.graphics.Bitmap");
    }
}
