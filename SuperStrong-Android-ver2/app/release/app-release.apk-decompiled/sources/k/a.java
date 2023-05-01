package k;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import androidx.fragment.app.r0;
/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f4724b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4725c;

    static {
        new r0();
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4725c;
    }

    public float getRadius() {
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f4724b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
    }

    public void setCardBackgroundColor(int i6) {
        ColorStateList.valueOf(i6);
        throw null;
    }

    public void setCardElevation(float f6) {
        throw null;
    }

    public void setMaxCardElevation(float f6) {
        throw null;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i6) {
        super.setMinimumHeight(i6);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i6) {
        super.setMinimumWidth(i6);
    }

    @Override // android.view.View
    public final void setPadding(int i6, int i7, int i8, int i9) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i6, int i7, int i8, int i9) {
    }

    public void setPreventCornerOverlap(boolean z5) {
        if (z5 == this.f4725c) {
            return;
        }
        this.f4725c = z5;
        throw null;
    }

    public void setRadius(float f6) {
        throw null;
    }

    public void setUseCompatPadding(boolean z5) {
        if (this.f4724b == z5) {
            return;
        }
        this.f4724b = z5;
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }
}
