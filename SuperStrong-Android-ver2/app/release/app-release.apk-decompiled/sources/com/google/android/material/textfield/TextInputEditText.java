package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import c.b;
import com.superstrong.android.R;
import java.util.Locale;
import z2.n;
/* loaded from: classes.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: h  reason: collision with root package name */
    public final Rect f3391h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3392i;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        this.f3391h = new Rect();
        TypedArray d6 = n.d(context, attributeSet, b.f2665h0, R.attr.editTextStyle, 2131952422, new int[0]);
        setTextInputLayoutFocusedRectEnabled(d6.getBoolean(0, false));
        d6.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z5;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3392i) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && rect != null) {
            Rect rect2 = this.f3391h;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z5;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3392i) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.D) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.D && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z5;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f3392i) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i6 = rect.left;
            int i7 = rect.top;
            int i8 = rect.right;
            int i9 = rect.bottom + height;
            Rect rect2 = this.f3391h;
            rect2.set(i6, i7, i8, i9);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z5) {
        this.f3392i = z5;
    }
}
