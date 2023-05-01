package v;

import android.app.AppOpsManager;
import android.content.Context;
/* loaded from: classes.dex */
public final class g {
    public static int a(AppOpsManager appOpsManager, String str, int i6, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i6, str2);
    }

    public static String b(Context context) {
        String opPackageName;
        opPackageName = context.getOpPackageName();
        return opPackageName;
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
