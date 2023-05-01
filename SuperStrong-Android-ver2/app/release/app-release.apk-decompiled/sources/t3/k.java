package t3;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import q3.u;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class k extends x<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6175b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f6176a = new SimpleDateFormat("MMM d, yyyy");

    /* loaded from: classes.dex */
    public static class a implements y {
        @Override // q3.y
        public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
            if (aVar.f6586a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // q3.x
    public final Date a(x3.a aVar) {
        synchronized (this) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return new Date(this.f6176a.parse(aVar.K()).getTime());
            } catch (ParseException e6) {
                throw new u(e6);
            }
        }
    }

    @Override // q3.x
    public final void b(x3.c cVar, Date date) {
        String format;
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                format = null;
            } else {
                format = this.f6176a.format((java.util.Date) date2);
            }
            cVar.F(format);
        }
    }
}
