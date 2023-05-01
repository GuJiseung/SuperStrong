package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import c1.a;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1248a;
        if (aVar.h(1)) {
            obj = aVar.l();
        }
        remoteActionCompat.f1248a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1249b;
        if (aVar.h(2)) {
            charSequence = aVar.g();
        }
        remoteActionCompat.f1249b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1250c;
        if (aVar.h(3)) {
            charSequence2 = aVar.g();
        }
        remoteActionCompat.f1250c = charSequence2;
        Parcelable parcelable = remoteActionCompat.f1251d;
        if (aVar.h(4)) {
            parcelable = aVar.j();
        }
        remoteActionCompat.f1251d = (PendingIntent) parcelable;
        boolean z5 = remoteActionCompat.f1252e;
        if (aVar.h(5)) {
            z5 = aVar.e();
        }
        remoteActionCompat.f1252e = z5;
        boolean z6 = remoteActionCompat.f1253f;
        if (aVar.h(6)) {
            z6 = aVar.e();
        }
        remoteActionCompat.f1253f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1248a;
        aVar.m(1);
        aVar.t(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1249b;
        aVar.m(2);
        aVar.p(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1250c;
        aVar.m(3);
        aVar.p(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1251d;
        aVar.m(4);
        aVar.r(pendingIntent);
        boolean z5 = remoteActionCompat.f1252e;
        aVar.m(5);
        aVar.n(z5);
        boolean z6 = remoteActionCompat.f1253f;
        aVar.m(6);
        aVar.n(z6);
    }
}
