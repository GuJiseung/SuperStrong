package b5;

import b5.q;
import b5.t;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f2500a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<f5.h, Integer> f2501b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public final f5.t f2503b;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f2502a = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public c[] f2506e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f2507f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f2508g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2509h = 0;

        /* renamed from: c  reason: collision with root package name */
        public final int f2504c = 4096;

        /* renamed from: d  reason: collision with root package name */
        public int f2505d = 4096;

        public a(q.a aVar) {
            Logger logger = f5.q.f4001a;
            this.f2503b = new f5.t(aVar);
        }

        public final int a(int i6) {
            int i7;
            int i8 = 0;
            if (i6 > 0) {
                int length = this.f2506e.length;
                while (true) {
                    length--;
                    i7 = this.f2507f;
                    if (length < i7 || i6 <= 0) {
                        break;
                    }
                    int i9 = this.f2506e[length].f2499c;
                    i6 -= i9;
                    this.f2509h -= i9;
                    this.f2508g--;
                    i8++;
                }
                c[] cVarArr = this.f2506e;
                System.arraycopy(cVarArr, i7 + 1, cVarArr, i7 + 1 + i8, this.f2508g);
                this.f2507f += i8;
            }
            return i8;
        }

        public final f5.h b(int i6) {
            boolean z5;
            c cVar;
            if (i6 >= 0 && i6 <= d.f2500a.length - 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                cVar = d.f2500a[i6];
            } else {
                int length = this.f2507f + 1 + (i6 - d.f2500a.length);
                if (length >= 0) {
                    c[] cVarArr = this.f2506e;
                    if (length < cVarArr.length) {
                        cVar = cVarArr[length];
                    }
                }
                throw new IOException("Header index too large " + (i6 + 1));
            }
            return cVar.f2497a;
        }

        public final void c(c cVar) {
            this.f2502a.add(cVar);
            int i6 = this.f2505d;
            int i7 = cVar.f2499c;
            if (i7 > i6) {
                Arrays.fill(this.f2506e, (Object) null);
                this.f2507f = this.f2506e.length - 1;
                this.f2508g = 0;
                this.f2509h = 0;
                return;
            }
            a((this.f2509h + i7) - i6);
            int i8 = this.f2508g + 1;
            c[] cVarArr = this.f2506e;
            if (i8 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f2507f = this.f2506e.length - 1;
                this.f2506e = cVarArr2;
            }
            int i9 = this.f2507f;
            this.f2507f = i9 - 1;
            this.f2506e[i9] = cVar;
            this.f2508g++;
            this.f2509h += i7;
        }

        public final f5.h d() {
            boolean z5;
            int i6;
            f5.t tVar = this.f2503b;
            int readByte = tVar.readByte() & 255;
            if ((readByte & 128) == 128) {
                z5 = true;
            } else {
                z5 = false;
            }
            int e6 = e(readByte, 127);
            if (z5) {
                t tVar2 = t.f2632d;
                long j5 = e6;
                tVar.y(j5);
                byte[] q5 = tVar.f4008b.q(j5);
                tVar2.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                t.a aVar = tVar2.f2633a;
                t.a aVar2 = aVar;
                int i7 = 0;
                int i8 = 0;
                for (byte b6 : q5) {
                    i7 = (i7 << 8) | (b6 & 255);
                    i8 += 8;
                    while (i8 >= 8) {
                        int i9 = i8 - 8;
                        aVar2 = aVar2.f2634a[(i7 >>> i9) & 255];
                        if (aVar2.f2634a == null) {
                            byteArrayOutputStream.write(aVar2.f2635b);
                            i8 -= aVar2.f2636c;
                            aVar2 = aVar;
                        } else {
                            i8 = i9;
                        }
                    }
                }
                while (i8 > 0) {
                    t.a aVar3 = aVar2.f2634a[(i7 << (8 - i8)) & 255];
                    if (aVar3.f2634a != null || (i6 = aVar3.f2636c) > i8) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar3.f2635b);
                    i8 -= i6;
                    aVar2 = aVar;
                }
                return f5.h.g(byteArrayOutputStream.toByteArray());
            }
            return tVar.e(e6);
        }

        public final int e(int i6, int i7) {
            int i8 = i6 & i7;
            if (i8 < i7) {
                return i8;
            }
            int i9 = 0;
            while (true) {
                int readByte = this.f2503b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i7 + (readByte << i9);
                }
                i7 += (readByte & 127) << i9;
                i9 += 7;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f5.e f2510a;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2512c;

        /* renamed from: b  reason: collision with root package name */
        public int f2511b = Integer.MAX_VALUE;

        /* renamed from: e  reason: collision with root package name */
        public c[] f2514e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f2515f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f2516g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f2517h = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2513d = 4096;

        public b(f5.e eVar) {
            this.f2510a = eVar;
        }

        public final void a(int i6) {
            int i7;
            if (i6 > 0) {
                int length = this.f2514e.length - 1;
                int i8 = 0;
                while (true) {
                    i7 = this.f2515f;
                    if (length < i7 || i6 <= 0) {
                        break;
                    }
                    int i9 = this.f2514e[length].f2499c;
                    i6 -= i9;
                    this.f2517h -= i9;
                    this.f2516g--;
                    i8++;
                    length--;
                }
                c[] cVarArr = this.f2514e;
                int i10 = i7 + 1;
                System.arraycopy(cVarArr, i10, cVarArr, i10 + i8, this.f2516g);
                c[] cVarArr2 = this.f2514e;
                int i11 = this.f2515f + 1;
                Arrays.fill(cVarArr2, i11, i11 + i8, (Object) null);
                this.f2515f += i8;
            }
        }

        public final void b(c cVar) {
            int i6 = this.f2513d;
            int i7 = cVar.f2499c;
            if (i7 > i6) {
                Arrays.fill(this.f2514e, (Object) null);
                this.f2515f = this.f2514e.length - 1;
                this.f2516g = 0;
                this.f2517h = 0;
                return;
            }
            a((this.f2517h + i7) - i6);
            int i8 = this.f2516g + 1;
            c[] cVarArr = this.f2514e;
            if (i8 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f2515f = this.f2514e.length - 1;
                this.f2514e = cVarArr2;
            }
            int i9 = this.f2515f;
            this.f2515f = i9 - 1;
            this.f2514e[i9] = cVar;
            this.f2516g++;
            this.f2517h += i7;
        }

        public final void c(f5.h hVar) {
            t.f2632d.getClass();
            long j5 = 0;
            int i6 = 0;
            long j6 = 0;
            for (int i7 = 0; i7 < hVar.j(); i7++) {
                j6 += t.f2631c[hVar.e(i7) & 255];
            }
            if (((int) ((j6 + 7) >> 3)) < hVar.j()) {
                f5.e eVar = new f5.e();
                t.f2632d.getClass();
                byte b6 = 0;
                while (i6 < hVar.j()) {
                    int e6 = hVar.e(i6) & 255;
                    int i8 = t.f2630b[e6];
                    byte b7 = t.f2631c[e6];
                    j5 = (j5 << b7) | i8;
                    int i9 = b6 + b7;
                    while (i9 >= 8) {
                        i9 = (i9 == 1 ? 1 : 0) - 8;
                        eVar.G((int) (j5 >> i9));
                    }
                    i6++;
                    b6 = i9;
                }
                if (b6 > 0) {
                    eVar.G((int) ((j5 << (8 - b6)) | (255 >>> b6)));
                }
                try {
                    byte[] q5 = eVar.q(eVar.f3977c);
                    hVar = new f5.h(q5);
                    e(q5.length, 127, 128);
                } catch (EOFException e7) {
                    throw new AssertionError(e7);
                }
            } else {
                e(hVar.j(), 127, 0);
            }
            this.f2510a.F(hVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(java.util.ArrayList r13) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b5.d.b.d(java.util.ArrayList):void");
        }

        public final void e(int i6, int i7, int i8) {
            f5.e eVar = this.f2510a;
            if (i6 < i7) {
                eVar.G(i6 | i8);
                return;
            }
            eVar.G(i8 | i7);
            int i9 = i6 - i7;
            while (i9 >= 128) {
                eVar.G(128 | (i9 & 127));
                i9 >>>= 7;
            }
            eVar.G(i9);
        }
    }

    static {
        c cVar = new c(c.f2496i, "");
        f5.h hVar = c.f2493f;
        f5.h hVar2 = c.f2494g;
        f5.h hVar3 = c.f2495h;
        f5.h hVar4 = c.f2492e;
        c[] cVarArr = {cVar, new c(hVar, "GET"), new c(hVar, "POST"), new c(hVar2, "/"), new c(hVar2, "/index.html"), new c(hVar3, "http"), new c(hVar3, "https"), new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f2500a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        for (int i6 = 0; i6 < cVarArr.length; i6++) {
            if (!linkedHashMap.containsKey(cVarArr[i6].f2497a)) {
                linkedHashMap.put(cVarArr[i6].f2497a, Integer.valueOf(i6));
            }
        }
        f2501b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(f5.h hVar) {
        int j5 = hVar.j();
        for (int i6 = 0; i6 < j5; i6++) {
            byte e6 = hVar.e(i6);
            if (e6 >= 65 && e6 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.m());
            }
        }
    }
}
