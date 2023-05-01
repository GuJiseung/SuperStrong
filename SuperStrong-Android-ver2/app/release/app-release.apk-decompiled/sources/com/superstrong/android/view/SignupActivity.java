package com.superstrong.android.view;

import a4.e;
import a4.j;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.c;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.i0;
import b4.r;
import com.superstrong.android.R;
import i0.d;
import l4.f;
import z3.h;
/* loaded from: classes.dex */
public final class SignupActivity extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3549z = 0;

    /* renamed from: x  reason: collision with root package name */
    public h f3550x;

    /* renamed from: y  reason: collision with root package name */
    public r f3551y;

    public final r C() {
        r rVar = this.f3551y;
        if (rVar != null) {
            return rVar;
        }
        f.k("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i6 = h.f7034r;
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.c.f1305a;
        h hVar = (h) ViewDataBinding.s(layoutInflater, R.layout.activity_signup);
        f.e(hVar, "inflate(layoutInflater)");
        this.f3550x = hVar;
        j jVar = new j(this);
        h hVar2 = this.f3550x;
        if (hVar2 != null) {
            setContentView(hVar2.f1298h);
            r rVar = (r) new i0(this).a(r.class);
            f.f(rVar, "<set-?>");
            this.f3551y = rVar;
            h hVar3 = this.f3550x;
            if (hVar3 != null) {
                C();
                hVar3.x();
                C().f2483d.e(this, new m3.j(4, this));
                C().f2484e.e(this, new a4.h(2, this));
                C().f2487h.e(this, new d(4, jVar));
                h hVar4 = this.f3550x;
                if (hVar4 != null) {
                    hVar4.f7035q.setOnClickListener(new e(6, this));
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
}
