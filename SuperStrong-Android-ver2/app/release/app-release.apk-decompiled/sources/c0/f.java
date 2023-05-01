package c0;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f2700a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2701b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2702c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2703d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2704e;

    public f(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f2700a = str;
        str2.getClass();
        this.f2701b = str2;
        this.f2702c = str3;
        list.getClass();
        this.f2703d = list;
        this.f2704e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2700a + ", mProviderPackage: " + this.f2701b + ", mQuery: " + this.f2702c + ", mCertificates:");
        int i6 = 0;
        while (true) {
            List<List<byte[]>> list = this.f2703d;
            if (i6 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i6);
            for (int i7 = 0; i7 < list2.size(); i7++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i7), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i6++;
        }
    }
}
