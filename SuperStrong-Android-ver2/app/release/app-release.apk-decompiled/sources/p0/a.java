package p0;

import android.widget.EditText;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0074a f5683a;

    /* renamed from: p0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0074a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f5684a;

        /* renamed from: b  reason: collision with root package name */
        public final g f5685b;

        public C0074a(EditText editText) {
            this.f5684a = editText;
            g gVar = new g(editText);
            this.f5685b = gVar;
            editText.addTextChangedListener(gVar);
            if (p0.b.f5687b == null) {
                synchronized (p0.b.f5686a) {
                    if (p0.b.f5687b == null) {
                        p0.b.f5687b = new p0.b();
                    }
                }
            }
            editText.setEditableFactory(p0.b.f5687b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    public a(EditText editText) {
        if (editText != null) {
            this.f5683a = new C0074a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
