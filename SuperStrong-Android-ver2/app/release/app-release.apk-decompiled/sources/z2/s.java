package z2;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class s extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public int f7008b;

    public final void b(int i6, boolean z5) {
        super.setVisibility(i6);
        if (z5) {
            this.f7008b = i6;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7008b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i6) {
        b(i6, true);
    }
}
