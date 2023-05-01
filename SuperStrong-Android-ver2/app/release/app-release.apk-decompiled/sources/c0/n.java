package c0;

import a1.f0;
import androidx.fragment.app.r0;
import e4.e;
import java.io.File;
import java.util.TreeMap;
import s4.u;
import s4.v;
/* loaded from: classes.dex */
public class n implements m1.a, s3.n {

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f2728b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[][] f2729c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: d  reason: collision with root package name */
    public static final float[] f2730d = {95.047f, 100.0f, 108.883f};

    /* renamed from: e  reason: collision with root package name */
    public static final float[][] f2731e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static final e4.d c(Object obj, e4.d dVar, k4.p pVar) {
        l4.f.f(dVar, "completion");
        return ((g4.a) pVar).g(obj, dVar);
    }

    public static final Class d(p4.b bVar) {
        l4.f.f(bVar, "<this>");
        Class<?> a6 = ((l4.c) bVar).a();
        if (a6.isPrimitive()) {
            String name = a6.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? a6 : Double.class;
                case 104431:
                    return !name.equals("int") ? a6 : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? a6 : Byte.class;
                case 3052374:
                    return !name.equals("char") ? a6 : Character.class;
                case 3327612:
                    return !name.equals("long") ? a6 : Long.class;
                case 3625364:
                    return !name.equals("void") ? a6 : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? a6 : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? a6 : Float.class;
                case 109413500:
                    return !name.equals("short") ? a6 : Short.class;
                default:
                    return a6;
            }
        }
        return a6;
    }

    public static final void f(e4.f fVar, Throwable th) {
        try {
            u uVar = (u) fVar.get(u.a.f6107b);
            if (uVar == null) {
                v.a(fVar, th);
            } else {
                uVar.handleException(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                androidx.activity.k.f(runtimeException, th);
                th = runtimeException;
            }
            v.a(fVar, th);
        }
    }

    public static final e4.d g(e4.d dVar) {
        g4.c cVar;
        l4.f.f(dVar, "<this>");
        if (dVar instanceof g4.c) {
            cVar = (g4.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (dVar = cVar.f4163d) == null) {
            e4.f fVar = cVar.f4162c;
            l4.f.c(fVar);
            e4.e eVar = (e4.e) fVar.get(e.a.f3848b);
            if (eVar == null || (dVar = eVar.p(cVar)) == null) {
                dVar = cVar;
            }
            cVar.f4163d = dVar;
        }
        return dVar;
    }

    public static float h(int i6) {
        float f6 = i6 / 255.0f;
        return (f6 <= 0.04045f ? f6 / 12.92f : (float) Math.pow((f6 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static void i(k4.p pVar, s4.a aVar, s4.a aVar2) {
        try {
            r0.d(g(c(aVar, aVar2, pVar)), c4.h.f2763a, null);
        } catch (Throwable th) {
            aVar2.d(f0.e(th));
            throw th;
        }
    }

    public static float j() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @Override // m1.a
    public File a(i1.f fVar) {
        return null;
    }

    @Override // m1.a
    public void b(i1.f fVar, k1.g gVar) {
    }

    @Override // s3.n
    public Object e() {
        return new TreeMap();
    }
}
