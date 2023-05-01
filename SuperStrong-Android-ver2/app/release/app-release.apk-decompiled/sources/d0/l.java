package d0;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final d f3739a = new d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final d f3740b = new d(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final d f3741c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f3742d;

    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3743a = new a();

        @Override // d0.l.b
        public final int a(CharSequence charSequence, int i6) {
            int i7 = i6 + 0;
            int i8 = 2;
            for (int i9 = 0; i9 < i7 && i8 == 2; i9++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i9));
                d dVar = l.f3739a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i8 = 2;
                                break;
                        }
                    }
                    i8 = 0;
                }
                i8 = 1;
            }
            return i8;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i6);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f3744a;

        public c(a aVar) {
            this.f3744a = aVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i6) {
            if (charSequence != null && i6 >= 0 && charSequence.length() - i6 >= 0) {
                b bVar = this.f3744a;
                if (bVar == null) {
                    return a();
                }
                int a6 = bVar.a(charSequence, i6);
                if (a6 == 0) {
                    return true;
                }
                if (a6 != 1) {
                    return a();
                }
                return false;
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3745b;

        public d(a aVar, boolean z5) {
            super(aVar);
            this.f3745b = z5;
        }

        @Override // d0.l.c
        public final boolean a() {
            return this.f3745b;
        }
    }

    static {
        a aVar = a.f3743a;
        f3741c = new d(aVar, false);
        f3742d = new d(aVar, true);
    }
}
