package f0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e f3865a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f3866a;

        public a(ClipData clipData, int i6) {
            this.f3866a = new ContentInfo.Builder(clipData, i6);
        }

        @Override // f0.g.b
        public final void a(Uri uri) {
            this.f3866a.setLinkUri(uri);
        }

        @Override // f0.g.b
        public final void b(int i6) {
            this.f3866a.setFlags(i6);
        }

        @Override // f0.g.b
        public final g build() {
            ContentInfo build;
            build = this.f3866a.build();
            return new g(new d(build));
        }

        @Override // f0.g.b
        public final void setExtras(Bundle bundle) {
            this.f3866a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i6);

        g build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f3867a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3868b;

        /* renamed from: c  reason: collision with root package name */
        public int f3869c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f3870d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f3871e;

        public c(ClipData clipData, int i6) {
            this.f3867a = clipData;
            this.f3868b = i6;
        }

        @Override // f0.g.b
        public final void a(Uri uri) {
            this.f3870d = uri;
        }

        @Override // f0.g.b
        public final void b(int i6) {
            this.f3869c = i6;
        }

        @Override // f0.g.b
        public final g build() {
            return new g(new f(this));
        }

        @Override // f0.g.b
        public final void setExtras(Bundle bundle) {
            this.f3871e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f3872a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f3872a = contentInfo;
        }

        @Override // f0.g.e
        public final ClipData a() {
            ClipData clip;
            clip = this.f3872a.getClip();
            return clip;
        }

        @Override // f0.g.e
        public final int b() {
            int flags;
            flags = this.f3872a.getFlags();
            return flags;
        }

        @Override // f0.g.e
        public final ContentInfo c() {
            return this.f3872a;
        }

        @Override // f0.g.e
        public final int d() {
            int source;
            source = this.f3872a.getSource();
            return source;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f3872a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f3873a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3874b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3875c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f3876d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3877e;

        public f(c cVar) {
            ClipData clipData = cVar.f3867a;
            clipData.getClass();
            this.f3873a = clipData;
            int i6 = cVar.f3868b;
            if (i6 >= 0) {
                if (i6 <= 5) {
                    this.f3874b = i6;
                    int i7 = cVar.f3869c;
                    if ((i7 & 1) == i7) {
                        this.f3875c = i7;
                        this.f3876d = cVar.f3870d;
                        this.f3877e = cVar.f3871e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i7) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // f0.g.e
        public final ClipData a() {
            return this.f3873a;
        }

        @Override // f0.g.e
        public final int b() {
            return this.f3875c;
        }

        @Override // f0.g.e
        public final ContentInfo c() {
            return null;
        }

        @Override // f0.g.e
        public final int d() {
            return this.f3874b;
        }

        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f3873a.getDescription());
            sb.append(", source=");
            int i6 = this.f3874b;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 != 5) {
                                    str = String.valueOf(i6);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb.append(str);
            sb.append(", flags=");
            int i7 = this.f3875c;
            if ((i7 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i7);
            }
            sb.append(valueOf);
            String str3 = "";
            if (this.f3876d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str2);
            if (this.f3877e != null) {
                str3 = ", hasExtras";
            }
            sb.append(str3);
            sb.append("}");
            return sb.toString();
        }
    }

    public g(e eVar) {
        this.f3865a = eVar;
    }

    public final String toString() {
        return this.f3865a.toString();
    }
}
