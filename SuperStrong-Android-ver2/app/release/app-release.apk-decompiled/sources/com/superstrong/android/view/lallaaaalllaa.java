package com.superstrong.android.view;

import a4.e;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import androidx.appcompat.app.c;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.i0;
import b4.j;
import com.superstrong.android.R;
import l4.f;
/* loaded from: classes.dex */
public final class lallaaaalllaa extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3563z = 0;

    /* renamed from: x  reason: collision with root package name */
    public j f3564x;

    /* renamed from: y  reason: collision with root package name */
    public z3.c f3565y;

    /* loaded from: classes.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            j jVar = lallaaaalllaa.this.f3564x;
            if (jVar != null) {
                jVar.f2469d.j(String.valueOf(charSequence));
            } else {
                f.k("loginViewModel");
                throw null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            j jVar = lallaaaalllaa.this.f3564x;
            if (jVar != null) {
                jVar.f2470e.j(String.valueOf(charSequence));
            } else {
                f.k("loginViewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i6 = z3.c.f7012v;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.c.f1305a;
        z3.c cVar = (z3.c) ViewDataBinding.s(layoutInflater, R.layout.activity_login);
        f.e(cVar, "inflate(layoutInflater)");
        this.f3565y = cVar;
        setContentView(cVar.f1298h);
        this.f3564x = (j) new i0(this).a(j.class);
        z3.c cVar2 = this.f3565y;
        if (cVar2 != null) {
            cVar2.u.addTextChangedListener(new a());
            z3.c cVar3 = this.f3565y;
            if (cVar3 != null) {
                cVar3.s.addTextChangedListener(new b());
                z3.c cVar4 = this.f3565y;
                if (cVar4 != null) {
                    cVar4.f7014r.setOnClickListener(new e(10, this));
                    z3.c cVar5 = this.f3565y;
                    if (cVar5 != null) {
                        cVar5.f7015t.setOnClickListener(new m3.c(13, this));
                        z3.c cVar6 = this.f3565y;
                        if (cVar6 != null) {
                            cVar6.f7013q.setOnClickListener(new f3.a(9, this));
                            return;
                        }
                        f.k("binding");
                        throw null;
                    }
                    f.k("binding");
                    throw null;
                }
                f.k("binding");
                throw null;
            }
            f.k("binding");
            throw null;
        }
        f.k("binding");
        throw null;
    }
}
