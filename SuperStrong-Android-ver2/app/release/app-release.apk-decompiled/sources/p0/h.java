package p0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* loaded from: classes.dex */
public final class h implements TransformationMethod {

    /* renamed from: b  reason: collision with root package name */
    public final TransformationMethod f5707b;

    public h(TransformationMethod transformationMethod) {
        this.f5707b = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f5707b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.f.a().b() == 1) {
            androidx.emoji2.text.f a6 = androidx.emoji2.text.f.a();
            a6.getClass();
            return a6.f(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i6, Rect rect) {
        TransformationMethod transformationMethod = this.f5707b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i6, rect);
        }
    }
}
