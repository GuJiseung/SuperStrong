package q3;
/* loaded from: classes.dex */
public final class e extends x<Number> {
    @Override // q3.x
    public final Number a(x3.a aVar) {
        if (aVar.M() == 9) {
            aVar.I();
            return null;
        }
        return Double.valueOf(aVar.x());
    }

    @Override // q3.x
    public final void b(x3.c cVar, Number number) {
        Number number2 = number;
        if (number2 == null) {
            cVar.q();
            return;
        }
        j.a(number2.doubleValue());
        cVar.E(number2);
    }
}
