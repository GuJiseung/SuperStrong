package v4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class d0 implements Closeable {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public a f6381b;

    /* loaded from: classes.dex */
    public static final class a extends Reader {

        /* renamed from: b  reason: collision with root package name */
        public final f5.g f6382b;

        /* renamed from: c  reason: collision with root package name */
        public final Charset f6383c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f6384d;
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public InputStreamReader f6385e;

        public a(f5.g gVar, Charset charset) {
            this.f6382b = gVar;
            this.f6383c = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f6384d = true;
            InputStreamReader inputStreamReader = this.f6385e;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f6382b.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i6, int i7) {
            Charset charset;
            if (!this.f6384d) {
                InputStreamReader inputStreamReader = this.f6385e;
                if (inputStreamReader == null) {
                    f5.r rVar = w4.e.f6597e;
                    f5.g gVar = this.f6382b;
                    int i8 = gVar.i(rVar);
                    if (i8 != -1) {
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 != 3) {
                                        if (i8 == 4) {
                                            charset = w4.e.f6599g;
                                        } else {
                                            throw new AssertionError();
                                        }
                                    } else {
                                        charset = w4.e.f6598f;
                                    }
                                } else {
                                    charset = StandardCharsets.UTF_16LE;
                                }
                            } else {
                                charset = StandardCharsets.UTF_16BE;
                            }
                        } else {
                            charset = StandardCharsets.UTF_8;
                        }
                    } else {
                        charset = this.f6383c;
                    }
                    InputStreamReader inputStreamReader2 = new InputStreamReader(gVar.D(), charset);
                    this.f6385e = inputStreamReader2;
                    inputStreamReader = inputStreamReader2;
                }
                return inputStreamReader.read(cArr, i6, i7);
            }
            throw new IOException("Stream closed");
        }
    }

    public abstract long c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w4.e.b(h());
    }

    @Nullable
    public abstract s f();

    public abstract f5.g h();
}
