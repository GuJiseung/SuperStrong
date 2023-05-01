package p2;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.superstrong.android.R;
import h3.i;
import h3.m;
/* loaded from: classes.dex */
public class a extends k.a implements Checkable, m {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f5733e = {R.attr.state_dragged};

    /* renamed from: d  reason: collision with root package name */
    public boolean f5734d;

    /* renamed from: p2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0077a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    @Override // k.a
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // k.a
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // k.a
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // k.a
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // k.a
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // k.a
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public i getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i6) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i6 + 3);
        if (this.f5734d) {
            View.mergeDrawableStates(onCreateDrawableState, f5733e);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    @Override // k.a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // k.a
    public void setCardBackgroundColor(int i6) {
        ColorStateList.valueOf(i6);
        throw null;
    }

    @Override // k.a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // k.a
    public void setCardElevation(float f6) {
        super.setCardElevation(f6);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z5) {
        throw null;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i6) {
        throw null;
    }

    public void setCheckedIconMargin(int i6) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i6) {
        if (i6 == -1) {
            return;
        }
        getResources().getDimensionPixelSize(i6);
        throw null;
    }

    public void setCheckedIconResource(int i6) {
        e.a.a(getContext(), i6);
        throw null;
    }

    public void setCheckedIconSize(int i6) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i6) {
        if (i6 == 0) {
            return;
        }
        getResources().getDimensionPixelSize(i6);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.view.View
    public void setClickable(boolean z5) {
        super.setClickable(z5);
    }

    public void setDragged(boolean z5) {
        if (this.f5734d != z5) {
            this.f5734d = z5;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    @Override // k.a
    public void setMaxCardElevation(float f6) {
        super.setMaxCardElevation(f6);
        throw null;
    }

    public void setOnCheckedChangeListener(InterfaceC0077a interfaceC0077a) {
    }

    @Override // k.a
    public void setPreventCornerOverlap(boolean z5) {
        super.setPreventCornerOverlap(z5);
        throw null;
    }

    public void setProgress(float f6) {
        throw null;
    }

    @Override // k.a
    public void setRadius(float f6) {
        super.setRadius(f6);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i6) {
        w.a.a(getContext(), i6);
        throw null;
    }

    @Override // h3.m
    public void setShapeAppearanceModel(i iVar) {
        setClipToOutline(iVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i6) {
        setStrokeColor(ColorStateList.valueOf(i6));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i6) {
        throw null;
    }

    @Override // k.a
    public void setUseCompatPadding(boolean z5) {
        super.setUseCompatPadding(z5);
        throw null;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
    }
}
