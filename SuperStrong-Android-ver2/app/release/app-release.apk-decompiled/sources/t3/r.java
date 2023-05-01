package t3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import q3.x;
import q3.y;
import t3.o;
/* loaded from: classes.dex */
public final class r implements y {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f6220b = Calendar.class;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f6221c = GregorianCalendar.class;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x f6222d;

    public r(o.s sVar) {
        this.f6222d = sVar;
    }

    @Override // q3.y
    public final <T> x<T> a(q3.j jVar, w3.a<T> aVar) {
        Class<? super T> cls = aVar.f6586a;
        if (cls != this.f6220b && cls != this.f6221c) {
            return null;
        }
        return this.f6222d;
    }

    public final String toString() {
        return "Factory[type=" + this.f6220b.getName() + "+" + this.f6221c.getName() + ",adapter=" + this.f6222d + "]";
    }
}
