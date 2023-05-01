package com.superstrong.android.view;

import a4.h;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.c;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.i0;
import b4.e;
import com.superstrong.android.R;
import l4.f;
import m3.j;
import z3.a;
/* loaded from: classes.dex */
public final class ChpasswdActivity extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3532z = 0;

    /* renamed from: x  reason: collision with root package name */
    public a f3533x;

    /* renamed from: y  reason: collision with root package name */
    public e f3534y;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i6 = a.f7009r;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.c.f1305a;
        a aVar = (a) ViewDataBinding.s(layoutInflater, R.layout.activity_chpasswd);
        f.e(aVar, "inflate(layoutInflater)");
        this.f3533x = aVar;
        setContentView(aVar.f1298h);
        e eVar = (e) new i0(this).a(e.class);
        f.f(eVar, "<set-?>");
        this.f3534y = eVar;
        a aVar2 = this.f3533x;
        if (aVar2 != null) {
            aVar2.x();
            a aVar3 = this.f3533x;
            if (aVar3 != null) {
                aVar3.f7010q.setOnClickListener(new f3.a(1, this));
                e eVar2 = this.f3534y;
                if (eVar2 != null) {
                    eVar2.f2441f.e(this, new j(2, this));
                    e eVar3 = this.f3534y;
                    if (eVar3 != null) {
                        eVar3.f2443h.e(this, new h(0, this));
                        return;
                    } else {
                        f.k("viewModel");
                        throw null;
                    }
                }
                f.k("viewModel");
                throw null;
            }
            f.k("binding");
            throw null;
        }
        f.k("binding");
        throw null;
    }
}
