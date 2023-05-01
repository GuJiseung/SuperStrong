package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public final class g extends CheckedTextView {

    /* renamed from: b  reason: collision with root package name */
    public final h f775b;

    /* renamed from: c  reason: collision with root package name */
    public final e f776c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f777d;

    /* renamed from: e  reason: collision with root package name */
    public l f778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:3:0x0047, B:5:0x004e, B:7:0x0054, B:11:0x0063, B:13:0x0069, B:15:0x006f, B:16:0x007a, B:18:0x0081, B:19:0x0088, B:21:0x008f), top: B:28:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            androidx.appcompat.widget.g1.a(r8)
            r0 = 2130968750(0x7f0400ae, float:1.7546162E38)
            r7.<init>(r8, r9, r0)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.e1.a(r7, r8)
            androidx.appcompat.widget.c0 r8 = new androidx.appcompat.widget.c0
            r8.<init>(r7)
            r7.f777d = r8
            r8.f(r9, r0)
            r8.b()
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.f776c = r8
            r8.d(r9, r0)
            androidx.appcompat.widget.h r8 = new androidx.appcompat.widget.h
            r8.<init>(r7)
            r7.f775b = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = c.b.f2674m
            androidx.appcompat.widget.j1 r8 = androidx.appcompat.widget.j1.m(r8, r9, r3, r0)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r8.f815b
            r6 = 2130968750(0x7f0400ae, float:1.7546162E38)
            r1 = r7
            r4 = r9
            f0.g0.k(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            r3 = 0
            if (r2 == 0) goto L60
            int r2 = r8.i(r1, r3)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L60
            android.content.Context r4 = r7.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r2 = e.a.a(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r2)     // Catch: android.content.res.Resources.NotFoundException -> L60 java.lang.Throwable -> La7
            goto L61
        L60:
            r1 = r3
        L61:
            if (r1 != 0) goto L7a
            boolean r1 = r8.l(r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            int r1 = r8.i(r3, r3)     // Catch: java.lang.Throwable -> La7
            if (r1 == 0) goto L7a
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> La7
            android.graphics.drawable.Drawable r1 = e.a.a(r2, r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkDrawable(r1)     // Catch: java.lang.Throwable -> La7
        L7a:
            r1 = 2
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L88
            android.content.res.ColorStateList r1 = r8.b(r1)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintList(r1)     // Catch: java.lang.Throwable -> La7
        L88:
            r1 = 3
            boolean r2 = r8.l(r1)     // Catch: java.lang.Throwable -> La7
            if (r2 == 0) goto L9c
            r2 = -1
            int r1 = r8.h(r1, r2)     // Catch: java.lang.Throwable -> La7
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.p0.b(r1, r2)     // Catch: java.lang.Throwable -> La7
            r7.setCheckMarkTintMode(r1)     // Catch: java.lang.Throwable -> La7
        L9c:
            r8.n()
            androidx.appcompat.widget.l r8 = r7.getEmojiTextViewHelper()
            r8.a(r9, r0)
            return
        La7:
            r9 = move-exception
            r8.n()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private l getEmojiTextViewHelper() {
        if (this.f778e == null) {
            this.f778e = new l(this);
        }
        return this.f778e;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c0 c0Var = this.f777d;
        if (c0Var != null) {
            c0Var.b();
        }
        e eVar = this.f776c;
        if (eVar != null) {
            eVar.a();
        }
        h hVar = this.f775b;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return j0.k.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f776c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f776c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        h hVar = this.f775b;
        if (hVar != null) {
            return hVar.f781b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        h hVar = this.f775b;
        if (hVar != null) {
            return hVar.f782c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f777d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f777d.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a1.f0.i(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().b(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f776c;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        e eVar = this.f776c;
        if (eVar != null) {
            eVar.f(i6);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i6) {
        setCheckMarkDrawable(e.a.a(getContext(), i6));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        h hVar = this.f775b;
        if (hVar != null) {
            if (hVar.f785f) {
                hVar.f785f = false;
                return;
            }
            hVar.f785f = true;
            hVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f777d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f777d;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j0.k.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().c(z5);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f776c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f776c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        h hVar = this.f775b;
        if (hVar != null) {
            hVar.f781b = colorStateList;
            hVar.f783d = true;
            hVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        h hVar = this.f775b;
        if (hVar != null) {
            hVar.f782c = mode;
            hVar.f784e = true;
            hVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f777d;
        c0Var.l(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f777d;
        c0Var.m(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i6) {
        super.setTextAppearance(context, i6);
        c0 c0Var = this.f777d;
        if (c0Var != null) {
            c0Var.g(context, i6);
        }
    }
}
