package z2;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public final class a extends f0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f6932d;

    public a(CheckableImageButton checkableImageButton) {
        this.f6932d = checkableImageButton;
    }

    @Override // f0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f6932d.isChecked());
    }

    @Override // f0.a
    public final void d(View view, g0.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3856a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f4095a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CheckableImageButton checkableImageButton = this.f6932d;
        accessibilityNodeInfo.setCheckable(checkableImageButton.f3263f);
        accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
    }
}
