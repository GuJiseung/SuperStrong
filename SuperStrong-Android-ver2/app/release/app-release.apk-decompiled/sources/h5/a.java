package h5;

import g5.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import q3.j;
import v4.d0;
/* loaded from: classes.dex */
public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final j f4553a;

    public a(j jVar) {
        this.f4553a = jVar;
    }

    @Override // g5.f.a
    public final f a(Type type) {
        w3.a aVar = new w3.a(type);
        j jVar = this.f4553a;
        return new b(jVar, jVar.c(aVar));
    }

    @Override // g5.f.a
    public final f<d0, ?> b(Type type, Annotation[] annotationArr, g5.d0 d0Var) {
        w3.a aVar = new w3.a(type);
        j jVar = this.f4553a;
        return new r1.b(jVar, jVar.c(aVar));
    }
}
