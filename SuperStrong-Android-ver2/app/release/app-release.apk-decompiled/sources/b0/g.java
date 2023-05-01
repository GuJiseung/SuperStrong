package b0;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f2266a;

    public g(Object obj) {
        this.f2266a = (LocaleList) obj;
    }

    @Override // b0.f
    public final String a() {
        return this.f2266a.toLanguageTags();
    }

    @Override // b0.f
    public final Object b() {
        return this.f2266a;
    }

    public final boolean equals(Object obj) {
        return this.f2266a.equals(((f) obj).b());
    }

    @Override // b0.f
    public final Locale get(int i6) {
        return this.f2266a.get(i6);
    }

    public final int hashCode() {
        return this.f2266a.hashCode();
    }

    @Override // b0.f
    public final boolean isEmpty() {
        return this.f2266a.isEmpty();
    }

    @Override // b0.f
    public final int size() {
        return this.f2266a.size();
    }

    public final String toString() {
        return this.f2266a.toString();
    }
}
