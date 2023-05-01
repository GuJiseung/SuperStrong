package d4;
/* loaded from: classes.dex */
public class b extends c.a {
    public static void r(Object[] objArr, Object[] objArr2, int i6, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i6 = 0;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        l4.f.f(objArr, "<this>");
        System.arraycopy(objArr, i7, objArr2, i6, i8 - i7);
    }
}
