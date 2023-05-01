package t3;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import q3.u;
import q3.x;
import q3.y;
/* loaded from: classes.dex */
public final class l extends x<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f6177b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final SimpleDateFormat f6178a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes.dex */
    public static class a implements y {
        @Override // q3.y
        public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
            if (aVar.f6586a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    @Override // q3.x
    public final Time a(x3.a aVar) {
        synchronized (this) {
            if (aVar.M() == 9) {
                aVar.I();
                return null;
            }
            try {
                return new Time(this.f6178a.parse(aVar.K()).getTime());
            } catch (ParseException e6) {
                throw new u(e6);
            }
        }
    }

    @Override // q3.x
    public final void b(x3.c cVar, Time time) {
        String format;
        Time time2 = time;
        synchronized (this) {
            if (time2 == null) {
                format = null;
            } else {
                format = this.f6178a.format((Date) time2);
            }
            cVar.F(format);
        }
    }
}
