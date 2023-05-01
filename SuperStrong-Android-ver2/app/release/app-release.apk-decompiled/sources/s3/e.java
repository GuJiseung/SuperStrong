package s3;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;
/* loaded from: classes.dex */
public final class e implements n<Object> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Type f6009b;

    public e(Type type) {
        this.f6009b = type;
    }

    @Override // s3.n
    public final Object e() {
        Type type = this.f6009b;
        if (!(type instanceof ParameterizedType)) {
            throw new q3.o("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new q3.o("Invalid EnumSet type: " + type.toString());
    }
}
