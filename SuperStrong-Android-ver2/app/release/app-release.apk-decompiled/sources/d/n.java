package d;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import d.r;
/* loaded from: classes.dex */
public class n extends androidx.activity.e implements d {

    /* renamed from: d  reason: collision with root package name */
    public g f3650d;

    /* renamed from: e  reason: collision with root package name */
    public final m f3651e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [d.m] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968918(0x7f040156, float:1.7546503E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            d.m r2 = new d.m
            r3 = r4
            androidx.appcompat.app.b r3 = (androidx.appcompat.app.b) r3
            r2.<init>()
            r4.f3651e = r2
            d.f r2 = r4.f()
            if (r6 != 0) goto L37
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L37:
            r5 = r2
            d.g r5 = (d.g) r5
            r5.V = r6
            r2.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.n.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.e, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().n();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return f0.l.b(this.f3651e, getWindow().getDecorView(), this, keyEvent);
    }

    public final f f() {
        if (this.f3650d == null) {
            r.a aVar = f.f3572b;
            this.f3650d = new g(getContext(), getWindow(), this, this);
        }
        return this.f3650d;
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i6) {
        return (T) f().e(i6);
    }

    @Override // d.d
    public final void g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().j();
    }

    @Override // androidx.activity.e, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().i();
        super.onCreate(bundle);
        f().m();
    }

    @Override // androidx.activity.e, android.app.Dialog
    public final void onStop() {
        super.onStop();
        f().q();
    }

    @Override // d.d
    public final void p() {
    }

    @Override // androidx.activity.e, android.app.Dialog
    public final void setContentView(int i6) {
        f().t(i6);
    }

    @Override // androidx.activity.e, android.app.Dialog
    public final void setContentView(View view) {
        f().u(view);
    }

    @Override // androidx.activity.e, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().v(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i6) {
        super.setTitle(i6);
        f().x(getContext().getString(i6));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().x(charSequence);
    }

    @Override // d.d
    public final void u() {
    }
}
