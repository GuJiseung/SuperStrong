package a1;

import android.content.res.Resources;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class r implements i1.d, w1.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f100b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f101c;

    public /* synthetic */ r(int i6, Object obj) {
        this.f100b = i6;
        this.f101c = obj;
    }

    @Override // w1.b
    public final k1.w a(k1.w wVar, i1.h hVar) {
        Resources resources = (Resources) this.f101c;
        if (wVar == null) {
            return null;
        }
        return new r1.u(resources, wVar);
    }

    @Override // i1.d
    public final boolean b(Object obj, File file, i1.h hVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        l1.b bVar = (l1.b) this.f101c;
        byte[] bArr = (byte[]) bVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException e6) {
                        e = e6;
                        fileOutputStream2 = fileOutputStream;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        bVar.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        bVar.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
                bVar.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (IOException e7) {
            e = e7;
        }
    }

    public final String toString() {
        switch (this.f100b) {
            case 4:
                return "<" + ((String) this.f101c) + '>';
            default:
                return super.toString();
        }
    }

    public r(Resources resources) {
        this.f100b = 3;
        this.f101c = resources;
    }
}
