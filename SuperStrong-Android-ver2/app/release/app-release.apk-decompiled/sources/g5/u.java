package g5;

import g5.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class u extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final u f4283a = new u();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    public static final class a<T> implements f<v4.d0, Optional<T>> {

        /* renamed from: b  reason: collision with root package name */
        public final f<v4.d0, T> f4284b;

        public a(f<v4.d0, T> fVar) {
            this.f4284b = fVar;
        }

        @Override // g5.f
        public final Object a(v4.d0 d0Var) {
            return Optional.ofNullable(this.f4284b.a(d0Var));
        }
    }

    @Override // g5.f.a
    @Nullable
    public final f<v4.d0, ?> b(Type type, Annotation[] annotationArr, d0 d0Var) {
        if (h0.e(type) != Optional.class) {
            return null;
        }
        return new a(d0Var.d(h0.d(0, (ParameterizedType) type), annotationArr));
    }
}
