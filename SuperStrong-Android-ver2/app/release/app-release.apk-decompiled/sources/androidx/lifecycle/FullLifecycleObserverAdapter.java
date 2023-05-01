package androidx.lifecycle;

import androidx.lifecycle.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements m {

    /* renamed from: b  reason: collision with root package name */
    public final f f1680b;

    /* renamed from: c  reason: collision with root package name */
    public final m f1681c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1682a;

        static {
            int[] iArr = new int[j.b.values().length];
            f1682a = iArr;
            try {
                iArr[j.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1682a[j.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1682a[j.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1682a[j.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1682a[j.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1682a[j.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1682a[j.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(f fVar, m mVar) {
        this.f1680b = fVar;
        this.f1681c = mVar;
    }

    @Override // androidx.lifecycle.m
    public final void f(o oVar, j.b bVar) {
        int i6 = a.f1682a[bVar.ordinal()];
        f fVar = this.f1680b;
        switch (i6) {
            case 1:
                fVar.d();
                break;
            case 2:
                fVar.c();
                break;
            case 3:
                fVar.g();
                break;
            case 4:
                fVar.e();
                break;
            case 5:
                fVar.a();
                break;
            case 6:
                fVar.b();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        m mVar = this.f1681c;
        if (mVar != null) {
            mVar.f(oVar, bVar);
        }
    }
}
