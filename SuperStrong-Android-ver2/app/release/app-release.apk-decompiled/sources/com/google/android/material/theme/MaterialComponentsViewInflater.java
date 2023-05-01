package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.s;
import com.google.android.material.button.MaterialButton;
import d.o;
import m3.u;
import q2.a;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends o {
    @Override // d.o
    public final d a(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // d.o
    public final f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // d.o
    public final AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // d.o
    public final s d(Context context, AttributeSet attributeSet) {
        return new c3.a(context, attributeSet);
    }

    @Override // d.o
    public final j0 e(Context context, AttributeSet attributeSet) {
        return new n3.a(context, attributeSet);
    }
}
