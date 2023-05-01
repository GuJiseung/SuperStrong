package v;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class a extends w.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6243b = 0;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0094a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i6, Bundle bundle) {
            activity.startActivityForResult(intent, i6, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
        }
    }
}
