package k1;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class r extends Exception {

    /* renamed from: g  reason: collision with root package name */
    public static final StackTraceElement[] f4899g = new StackTraceElement[0];

    /* renamed from: b  reason: collision with root package name */
    public final List<Throwable> f4900b;

    /* renamed from: c  reason: collision with root package name */
    public i1.f f4901c;

    /* renamed from: d  reason: collision with root package name */
    public i1.a f4902d;

    /* renamed from: e  reason: collision with root package name */
    public Class<?> f4903e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4904f;

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: b  reason: collision with root package name */
        public final Appendable f4905b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4906c = true;

        public a(Appendable appendable) {
            this.f4905b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c6) {
            boolean z5 = this.f4906c;
            Appendable appendable = this.f4905b;
            if (z5) {
                this.f4906c = false;
                appendable.append("  ");
            }
            this.f4906c = c6 == '\n';
            appendable.append(c6);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i6, int i7) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z5 = this.f4906c;
            Appendable appendable = this.f4905b;
            boolean z6 = false;
            if (z5) {
                this.f4906c = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i7 - 1) == '\n') {
                z6 = true;
            }
            this.f4906c = z6;
            appendable.append(charSequence, i6, i7);
            return this;
        }
    }

    public r(String str) {
        this(str, Collections.emptyList());
    }

    public r(String str, List<Throwable> list) {
        this.f4904f = str;
        setStackTrace(f4899g);
        this.f4900b = list;
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof r) {
            for (Throwable th2 : ((r) th).f4900b) {
                a(th2, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i6 = 0;
        while (i6 < size) {
            aVar.append("Cause (");
            int i7 = i6 + 1;
            aVar.append(String.valueOf(i7));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i6);
            if (th instanceof r) {
                ((r) th).f(aVar);
            } else {
                d(th, aVar);
            }
            i6 = i7;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i7 = i6 + 1;
            sb.append(i7);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i6));
            i6 = i7;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f4900b, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f4904f);
        String str4 = "";
        if (this.f4903e == null) {
            str = "";
        } else {
            str = ", " + this.f4903e;
        }
        sb.append(str);
        if (this.f4902d == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f4902d;
        }
        sb.append(str2);
        if (this.f4901c != null) {
            str4 = ", " + this.f4901c;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
