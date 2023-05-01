package t1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import i1.h;
import i1.j;
import k1.w;
/* loaded from: classes.dex */
public final class d implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6133a;

    public d(Context context) {
        this.f6133a = context.getApplicationContext();
    }

    @Override // i1.j
    public final /* bridge */ /* synthetic */ w<Drawable> a(Uri uri, int i6, int i7, h hVar) {
        return c(uri);
    }

    @Override // i1.j
    public final boolean b(Uri uri, h hVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.w c(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAuthority()
            android.content.Context r1 = r7.f6133a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L12
            goto L22
        L12:
            android.content.Context r0 = r1.createPackageContext(r0, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L23
        L17:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lb6
        L22:
            r0 = r1
        L23:
            java.util.List r2 = r8.getPathSegments()
            int r4 = r2.size()
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L6e
            java.util.List r2 = r8.getPathSegments()
            java.lang.String r4 = r8.getAuthority()
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            android.content.res.Resources r5 = r0.getResources()
            int r4 = r5.getIdentifier(r2, r3, r4)
            if (r4 != 0) goto L57
            android.content.res.Resources r4 = android.content.res.Resources.getSystem()
            java.lang.String r5 = "android"
            int r4 = r4.getIdentifier(r2, r3, r5)
        L57:
            if (r4 == 0) goto L5a
            goto L84
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to find resource id for: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L6e:
            int r2 = r2.size()
            java.lang.String r4 = "Unrecognized Uri format: "
            if (r2 != r6) goto La4
            java.util.List r2 = r8.getPathSegments()
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.NumberFormatException -> L91
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L91
            int r4 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L91
        L84:
            r8 = 0
            android.graphics.drawable.Drawable r0 = t1.a.a(r1, r0, r4, r8)
            if (r0 == 0) goto L90
            t1.c r8 = new t1.c
            r8.<init>(r0)
        L90:
            return r8
        L91:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8, r0)
            throw r1
        La4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lb6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to obtain context or unrecognized Uri format for: "
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.d.c(android.net.Uri):k1.w");
    }
}
