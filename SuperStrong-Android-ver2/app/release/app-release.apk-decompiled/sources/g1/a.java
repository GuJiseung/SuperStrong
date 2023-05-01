package g1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    public final File f4114b;

    /* renamed from: c  reason: collision with root package name */
    public final File f4115c;

    /* renamed from: d  reason: collision with root package name */
    public final File f4116d;

    /* renamed from: e  reason: collision with root package name */
    public final File f4117e;

    /* renamed from: g  reason: collision with root package name */
    public final long f4119g;

    /* renamed from: j  reason: collision with root package name */
    public BufferedWriter f4122j;

    /* renamed from: l  reason: collision with root package name */
    public int f4124l;

    /* renamed from: i  reason: collision with root package name */
    public long f4121i = 0;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap<String, d> f4123k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m  reason: collision with root package name */
    public long f4125m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final ThreadPoolExecutor f4126n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: o  reason: collision with root package name */
    public final CallableC0040a f4127o = new CallableC0040a();

    /* renamed from: f  reason: collision with root package name */
    public final int f4118f = 1;

    /* renamed from: h  reason: collision with root package name */
    public final int f4120h = 1;

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0040a implements Callable<Void> {
        public CallableC0040a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.f4122j != null) {
                    aVar.E();
                    if (a.this.o()) {
                        a.this.w();
                        a.this.f4124l = 0;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f4129a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f4130b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4131c;

        public c(d dVar) {
            boolean[] zArr;
            this.f4129a = dVar;
            if (dVar.f4137e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f4120h];
            }
            this.f4130b = zArr;
        }

        public final void a() {
            a.c(a.this, this, false);
        }

        public final File b() {
            File file;
            synchronized (a.this) {
                d dVar = this.f4129a;
                if (dVar.f4138f == this) {
                    if (!dVar.f4137e) {
                        this.f4130b[0] = true;
                    }
                    file = dVar.f4136d[0];
                    a.this.f4114b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f4133a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4134b;

        /* renamed from: c  reason: collision with root package name */
        public final File[] f4135c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f4136d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4137e;

        /* renamed from: f  reason: collision with root package name */
        public c f4138f;

        public d(String str) {
            this.f4133a = str;
            int i6 = a.this.f4120h;
            this.f4134b = new long[i6];
            this.f4135c = new File[i6];
            this.f4136d = new File[i6];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i7 = 0; i7 < a.this.f4120h; i7++) {
                sb.append(i7);
                File[] fileArr = this.f4135c;
                String sb2 = sb.toString();
                File file = a.this.f4114b;
                fileArr[i7] = new File(file, sb2);
                sb.append(".tmp");
                this.f4136d[i7] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j5 : this.f4134b) {
                sb.append(' ');
                sb.append(j5);
            }
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f4140a;

        public e(File[] fileArr) {
            this.f4140a = fileArr;
        }
    }

    public a(File file, long j5) {
        this.f4114b = file;
        this.f4115c = new File(file, "journal");
        this.f4116d = new File(file, "journal.tmp");
        this.f4117e = new File(file, "journal.bkp");
        this.f4119g = j5;
    }

    public static void c(a aVar, c cVar, boolean z5) {
        synchronized (aVar) {
            d dVar = cVar.f4129a;
            if (dVar.f4138f == cVar) {
                if (z5 && !dVar.f4137e) {
                    for (int i6 = 0; i6 < aVar.f4120h; i6++) {
                        if (cVar.f4130b[i6]) {
                            if (!dVar.f4136d[i6].exists()) {
                                cVar.a();
                                break;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                        }
                    }
                }
                for (int i7 = 0; i7 < aVar.f4120h; i7++) {
                    File file = dVar.f4136d[i7];
                    if (z5) {
                        if (file.exists()) {
                            File file2 = dVar.f4135c[i7];
                            file.renameTo(file2);
                            long j5 = dVar.f4134b[i7];
                            long length = file2.length();
                            dVar.f4134b[i7] = length;
                            aVar.f4121i = (aVar.f4121i - j5) + length;
                        }
                    } else {
                        h(file);
                    }
                }
                aVar.f4124l++;
                dVar.f4138f = null;
                if (dVar.f4137e | z5) {
                    dVar.f4137e = true;
                    aVar.f4122j.append((CharSequence) "CLEAN");
                    aVar.f4122j.append(' ');
                    aVar.f4122j.append((CharSequence) dVar.f4133a);
                    aVar.f4122j.append((CharSequence) dVar.a());
                    aVar.f4122j.append('\n');
                    if (z5) {
                        aVar.f4125m++;
                        dVar.getClass();
                    }
                } else {
                    aVar.f4123k.remove(dVar.f4133a);
                    aVar.f4122j.append((CharSequence) "REMOVE");
                    aVar.f4122j.append(' ');
                    aVar.f4122j.append((CharSequence) dVar.f4133a);
                    aVar.f4122j.append('\n');
                }
                k(aVar.f4122j);
                if (aVar.f4121i > aVar.f4119g || aVar.o()) {
                    aVar.f4126n.submit(aVar.f4127o);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @TargetApi(26)
    public static void f(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void h(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void k(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a p(File file, long j5) {
        if (j5 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    x(file2, file3, false);
                }
            }
            a aVar = new a(file, j5);
            if (aVar.f4115c.exists()) {
                try {
                    aVar.r();
                    aVar.q();
                    return aVar;
                } catch (IOException e6) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e6.getMessage() + ", removing");
                    aVar.close();
                    g1.c.a(aVar.f4114b);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j5);
            aVar2.w();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void x(File file, File file2, boolean z5) {
        if (z5) {
            h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void E() {
        while (this.f4121i > this.f4119g) {
            String key = this.f4123k.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f4122j != null) {
                    d dVar = this.f4123k.get(key);
                    if (dVar != null && dVar.f4138f == null) {
                        for (int i6 = 0; i6 < this.f4120h; i6++) {
                            File file = dVar.f4135c[i6];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j5 = this.f4121i;
                            long[] jArr = dVar.f4134b;
                            this.f4121i = j5 - jArr[i6];
                            jArr[i6] = 0;
                        }
                        this.f4124l++;
                        this.f4122j.append((CharSequence) "REMOVE");
                        this.f4122j.append(' ');
                        this.f4122j.append((CharSequence) key);
                        this.f4122j.append('\n');
                        this.f4123k.remove(key);
                        if (o()) {
                            this.f4126n.submit(this.f4127o);
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4122j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f4123k.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f4138f;
            if (cVar != null) {
                cVar.a();
            }
        }
        E();
        f(this.f4122j);
        this.f4122j = null;
    }

    public final c j(String str) {
        synchronized (this) {
            if (this.f4122j != null) {
                d dVar = this.f4123k.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f4123k.put(str, dVar);
                } else if (dVar.f4138f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f4138f = cVar;
                this.f4122j.append((CharSequence) "DIRTY");
                this.f4122j.append(' ');
                this.f4122j.append((CharSequence) str);
                this.f4122j.append('\n');
                k(this.f4122j);
                return cVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized e n(String str) {
        if (this.f4122j != null) {
            d dVar = this.f4123k.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f4137e) {
                return null;
            }
            for (File file : dVar.f4135c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.f4124l++;
            this.f4122j.append((CharSequence) "READ");
            this.f4122j.append(' ');
            this.f4122j.append((CharSequence) str);
            this.f4122j.append('\n');
            if (o()) {
                this.f4126n.submit(this.f4127o);
            }
            return new e(dVar.f4135c);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean o() {
        int i6 = this.f4124l;
        return i6 >= 2000 && i6 >= this.f4123k.size();
    }

    public final void q() {
        h(this.f4116d);
        Iterator<d> it = this.f4123k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f4138f;
            int i6 = this.f4120h;
            int i7 = 0;
            if (cVar == null) {
                while (i7 < i6) {
                    this.f4121i += next.f4134b[i7];
                    i7++;
                }
            } else {
                next.f4138f = null;
                while (i7 < i6) {
                    h(next.f4135c[i7]);
                    h(next.f4136d[i7]);
                    i7++;
                }
                it.remove();
            }
        }
    }

    public final void r() {
        File file = this.f4115c;
        g1.b bVar = new g1.b(new FileInputStream(file), g1.c.f4147a);
        try {
            String c6 = bVar.c();
            String c7 = bVar.c();
            String c8 = bVar.c();
            String c9 = bVar.c();
            String c10 = bVar.c();
            if ("libcore.io.DiskLruCache".equals(c6) && "1".equals(c7) && Integer.toString(this.f4118f).equals(c8) && Integer.toString(this.f4120h).equals(c9) && "".equals(c10)) {
                boolean z5 = false;
                int i6 = 0;
                while (true) {
                    try {
                        s(bVar.c());
                        i6++;
                    } catch (EOFException unused) {
                        this.f4124l = i6 - this.f4123k.size();
                        if (bVar.f4145f == -1) {
                            z5 = true;
                        }
                        if (z5) {
                            w();
                        } else {
                            this.f4122j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), g1.c.f4147a));
                        }
                        try {
                            bVar.close();
                            return;
                        } catch (RuntimeException e6) {
                            throw e6;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + c6 + ", " + c7 + ", " + c9 + ", " + c10 + "]");
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void s(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i6 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i6);
            LinkedHashMap<String, d> linkedHashMap = this.f4123k;
            if (indexOf2 == -1) {
                substring = str.substring(i6);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i6, indexOf2);
            }
            d dVar = linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                linkedHashMap.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f4137e = true;
                dVar.f4138f = null;
                if (split.length == a.this.f4120h) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        try {
                            dVar.f4134b[i7] = Long.parseLong(split[i7]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f4138f = new c(dVar);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void w() {
        StringBuilder sb;
        BufferedWriter bufferedWriter = this.f4122j;
        if (bufferedWriter != null) {
            f(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4116d), g1.c.f4147a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f4118f));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f4120h));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (d dVar : this.f4123k.values()) {
            if (dVar.f4138f != null) {
                sb = new StringBuilder();
                sb.append("DIRTY ");
                sb.append(dVar.f4133a);
                sb.append('\n');
            } else {
                sb = new StringBuilder();
                sb.append("CLEAN ");
                sb.append(dVar.f4133a);
                sb.append(dVar.a());
                sb.append('\n');
            }
            bufferedWriter2.write(sb.toString());
        }
        f(bufferedWriter2);
        if (this.f4115c.exists()) {
            x(this.f4115c, this.f4117e, true);
        }
        x(this.f4116d, this.f4115c, false);
        this.f4117e.delete();
        this.f4122j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4115c, true), g1.c.f4147a));
    }
}
