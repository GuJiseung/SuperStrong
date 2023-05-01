package o1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<h>> f5532b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f5533c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<h>> f5534b;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, List<h>> f5535a = f5534b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i6 = 0; i6 < length; i6++) {
                    char charAt = property.charAt(i6);
                    if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                        charAt = '?';
                    }
                    sb.append(charAt);
                }
                property = sb.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f5534b = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f5536a;

        public b(String str) {
            this.f5536a = str;
        }

        @Override // o1.h
        public final String a() {
            return this.f5536a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f5536a.equals(((b) obj).f5536a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5536a.hashCode();
        }

        public final String toString() {
            return "StringHeaderFactory{value='" + this.f5536a + "'}";
        }
    }

    public i(Map<String, List<h>> map) {
        this.f5532b = Collections.unmodifiableMap(map);
    }

    @Override // o1.g
    public final Map<String, String> a() {
        if (this.f5533c == null) {
            synchronized (this) {
                if (this.f5533c == null) {
                    this.f5533c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f5533c;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<h>> entry : this.f5532b.entrySet()) {
            List<h> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i6 = 0; i6 < size; i6++) {
                String a6 = value.get(i6).a();
                if (!TextUtils.isEmpty(a6)) {
                    sb.append(a6);
                    if (i6 != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f5532b.equals(((i) obj).f5532b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5532b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f5532b + '}';
    }
}
