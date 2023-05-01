package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.activity.j;
@SuppressLint({"LogConditional"})
/* loaded from: classes.dex */
public final class a {
    public static String a(Context context, int i6) {
        if (i6 != -1) {
            try {
                return context.getResources().getResourceEntryName(i6);
            } catch (Exception unused) {
                return j.a("?", i6);
            }
        }
        return "UNKNOWN";
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
