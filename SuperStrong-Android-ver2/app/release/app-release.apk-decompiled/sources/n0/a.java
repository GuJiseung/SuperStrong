package n0;

import android.widget.EditText;
/* loaded from: classes.dex */
public final class a {
    public static void a(EditText editText) {
        boolean z5;
        CharSequence text = editText.getText();
        if (text != null && text.length() != 0) {
            boolean z6 = true;
            if (text == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (true == z5) {
                z6 = false;
            }
            if (!z6) {
                return;
            }
            editText.setText((CharSequence) null);
        }
    }
}
