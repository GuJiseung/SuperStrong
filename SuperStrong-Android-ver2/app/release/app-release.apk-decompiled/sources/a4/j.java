package a4;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class j extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        l4.f.f(context, "context");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_loading);
        setCancelable(false);
        Window window = getWindow();
        l4.f.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
