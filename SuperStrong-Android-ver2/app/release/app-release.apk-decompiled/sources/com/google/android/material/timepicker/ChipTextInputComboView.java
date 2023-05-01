package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import java.util.WeakHashMap;
import z2.m;
import z2.p;
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b  reason: collision with root package name */
    public final Chip f3474b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f3475c;

    /* loaded from: classes.dex */
    public class a extends m {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean isEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (isEmpty) {
                chipTextInputComboView.f3474b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            String a6 = ChipTextInputComboView.a(chipTextInputComboView, editable);
            Chip chip = chipTextInputComboView.f3474b;
            if (TextUtils.isEmpty(a6)) {
                a6 = ChipTextInputComboView.a(chipTextInputComboView, "00");
            }
            chip.setText(a6);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f3474b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f3475c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a());
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        WeakHashMap<View, r0> weakHashMap = g0.f3878a;
        editText.setId(g0.e.a());
        g0.e.h((TextView) findViewById(R.id.material_label), editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3474b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3475c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z5) {
        int i6;
        Chip chip = this.f3474b;
        chip.setChecked(z5);
        int i7 = 0;
        if (z5) {
            i6 = 0;
        } else {
            i6 = 4;
        }
        EditText editText = this.f3475c;
        editText.setVisibility(i6);
        if (z5) {
            i7 = 8;
        }
        chip.setVisibility(i7);
        if (isChecked()) {
            editText.requestFocus();
            editText.post(new p(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f3474b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        this.f3474b.setTag(i6, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f3474b.toggle();
    }
}
