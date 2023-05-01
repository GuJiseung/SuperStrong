package i1;

import android.text.TextUtils;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f4586e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f4587a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f4588b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4589c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f4590d;

    /* loaded from: classes.dex */
    public class a implements b<Object> {
        @Override // i1.g.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t5, MessageDigest messageDigest);
    }

    public g(String str, T t5, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f4589c = str;
            this.f4587a = t5;
            this.f4588b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static g a(Object obj, String str) {
        return new g(str, obj, f4586e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4589c.equals(((g) obj).f4589c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4589c.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.f4589c + "'}";
    }
}
