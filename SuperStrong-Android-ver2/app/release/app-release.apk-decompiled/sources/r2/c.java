package r2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.List;
import z2.e;
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: f  reason: collision with root package name */
    public int f5968f;

    /* renamed from: g  reason: collision with root package name */
    public int f5969g;

    /* loaded from: classes.dex */
    public class a implements d {
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* renamed from: r2.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0085c {
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    private int getVisibleChipCount() {
        boolean z5;
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            if (getChildAt(i7) instanceof Chip) {
                if (getChildAt(i7).getVisibility() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    i6++;
                }
            }
        }
        return i6;
    }

    @Override // z2.e
    public final boolean a() {
        return this.f6968d;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        throw null;
    }

    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    public int getChipSpacingHorizontal() {
        return this.f5968f;
    }

    public int getChipSpacingVertical() {
        return this.f5969g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f6968d) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(int i6) {
        setChipSpacingHorizontal(i6);
        setChipSpacingVertical(i6);
    }

    public void setChipSpacingHorizontal(int i6) {
        if (this.f5968f != i6) {
            this.f5968f = i6;
            setItemSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i6) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingResource(int i6) {
        setChipSpacing(getResources().getDimensionPixelOffset(i6));
    }

    public void setChipSpacingVertical(int i6) {
        if (this.f5969g != i6) {
            this.f5969g = i6;
            setLineSpacing(i6);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i6) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i6));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i6) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC0085c interfaceC0085c) {
        setOnCheckedStateChangeListener(interfaceC0085c == null ? null : new a());
    }

    public void setOnCheckedStateChangeListener(d dVar) {
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z5) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i6) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i6) {
        setSingleLine(getResources().getBoolean(i6));
    }

    @Override // z2.e
    public void setSingleLine(boolean z5) {
        super.setSingleLine(z5);
    }

    public void setSingleSelection(int i6) {
        setSingleSelection(getResources().getBoolean(i6));
    }

    public void setSingleSelection(boolean z5) {
        throw null;
    }
}
