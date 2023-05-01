package i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final c f4567a;

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f4568a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4568a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f4568a = (InputContentInfo) obj;
        }

        @Override // i0.j.c
        public final ClipDescription a() {
            ClipDescription description;
            description = this.f4568a.getDescription();
            return description;
        }

        @Override // i0.j.c
        public final Object b() {
            return this.f4568a;
        }

        @Override // i0.j.c
        public final Uri c() {
            Uri contentUri;
            contentUri = this.f4568a.getContentUri();
            return contentUri;
        }

        @Override // i0.j.c
        public final void d() {
            this.f4568a.requestPermission();
        }

        @Override // i0.j.c
        public final Uri e() {
            Uri linkUri;
            linkUri = this.f4568a.getLinkUri();
            return linkUri;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4569a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f4570b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f4571c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4569a = uri;
            this.f4570b = clipDescription;
            this.f4571c = uri2;
        }

        @Override // i0.j.c
        public final ClipDescription a() {
            return this.f4570b;
        }

        @Override // i0.j.c
        public final Object b() {
            return null;
        }

        @Override // i0.j.c
        public final Uri c() {
            return this.f4569a;
        }

        @Override // i0.j.c
        public final void d() {
        }

        @Override // i0.j.c
        public final Uri e() {
            return this.f4571c;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4567a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public j(a aVar) {
        this.f4567a = aVar;
    }
}
