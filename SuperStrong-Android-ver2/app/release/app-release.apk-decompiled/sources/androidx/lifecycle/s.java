package androidx.lifecycle;
/* loaded from: classes.dex */
public class s<T> extends LiveData<T> {
    public s() {
    }

    public s(T t5) {
        super(t5);
    }

    public void j(T t5) {
        LiveData.a("setValue");
        this.f1692g++;
        this.f1690e = t5;
        c(null);
    }
}
