package m3;

import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public final class h extends p {
    public h(com.google.android.material.textfield.a aVar) {
        super(aVar);
    }

    @Override // m3.p
    public final void r() {
        com.google.android.material.textfield.a aVar = this.f5308b;
        aVar.f3461p = null;
        CheckableImageButton checkableImageButton = aVar.f3453h;
        checkableImageButton.setOnLongClickListener(null);
        q.d(checkableImageButton, null);
    }
}
