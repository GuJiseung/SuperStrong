package o1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class f implements i1.f {

    /* renamed from: b  reason: collision with root package name */
    public final g f5524b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f5525c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5526d;

    /* renamed from: e  reason: collision with root package name */
    public String f5527e;

    /* renamed from: f  reason: collision with root package name */
    public URL f5528f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f5529g;

    /* renamed from: h  reason: collision with root package name */
    public int f5530h;

    public f(String str) {
        i iVar = g.f5531a;
        this.f5525c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f5526d = str;
            androidx.activity.k.h(iVar);
            this.f5524b = iVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @Override // i1.f
    public final void b(MessageDigest messageDigest) {
        if (this.f5529g == null) {
            this.f5529g = c().getBytes(i1.f.f4585a);
        }
        messageDigest.update(this.f5529g);
    }

    public final String c() {
        String str = this.f5526d;
        if (str != null) {
            return str;
        }
        URL url = this.f5525c;
        androidx.activity.k.h(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f5528f == null) {
            if (TextUtils.isEmpty(this.f5527e)) {
                String str = this.f5526d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f5525c;
                    androidx.activity.k.h(url);
                    str = url.toString();
                }
                this.f5527e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f5528f = new URL(this.f5527e);
        }
        return this.f5528f;
    }

    @Override // i1.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return c().equals(fVar.c()) && this.f5524b.equals(fVar.f5524b);
        }
        return false;
    }

    @Override // i1.f
    public final int hashCode() {
        if (this.f5530h == 0) {
            int hashCode = c().hashCode();
            this.f5530h = hashCode;
            this.f5530h = this.f5524b.hashCode() + (hashCode * 31);
        }
        return this.f5530h;
    }

    public final String toString() {
        return c();
    }

    public f(URL url) {
        i iVar = g.f5531a;
        androidx.activity.k.h(url);
        this.f5525c = url;
        this.f5526d = null;
        androidx.activity.k.h(iVar);
        this.f5524b = iVar;
    }
}
