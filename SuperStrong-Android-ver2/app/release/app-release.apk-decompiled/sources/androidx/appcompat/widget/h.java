package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import z.a;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f780a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f781b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f782c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f783d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f784e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f785f;

    public h(CheckedTextView checkedTextView) {
        this.f780a = checkedTextView;
    }

    public final void a() {
        CheckedTextView checkedTextView = this.f780a;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f783d || this.f784e) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f783d) {
                    a.b.h(mutate, this.f781b);
                }
                if (this.f784e) {
                    a.b.i(mutate, this.f782c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }
}
