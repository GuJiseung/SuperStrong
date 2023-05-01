package t3;

import a1.f0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class c extends x<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6140b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6141a;

    /* loaded from: classes.dex */
    public static class a implements y {
        @Override // q3.y
        public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
            if (aVar.f6586a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        boolean z5;
        ArrayList arrayList = new ArrayList();
        this.f6141a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (s3.k.f6022a >= 9) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            arrayList.add(f0.g(2, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r3 = u3.a.b(r3, new java.text.ParsePosition(0));
     */
    @Override // q3.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Date a(x3.a r3) {
        /*
            r2 = this;
            int r0 = r3.M()
            r1 = 9
            if (r0 != r1) goto Ld
            r3.I()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.K()
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f6141a     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = u3.a.b(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            q3.u r1 = new q3.u     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c.a(x3.a):java.lang.Object");
    }

    @Override // q3.x
    public final void b(x3.c cVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                cVar.q();
            } else {
                cVar.F(((DateFormat) this.f6141a.get(0)).format(date2));
            }
        }
    }
}
