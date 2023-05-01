package com.superstrong.android.view;

import a4.e;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import l4.f;
import z3.m;
/* loaded from: classes.dex */
public final class SwapActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3553y = 0;

    /* renamed from: x  reason: collision with root package name */
    public m f3554x;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_swap);
        View inflate = getLayoutInflater().inflate(R.layout.activity_swap, (ViewGroup) null, false);
        int i6 = R.id.From;
        if (((TextView) a.k(inflate, R.id.From)) != null) {
            i6 = R.id.To;
            if (((TextView) a.k(inflate, R.id.To)) != null) {
                i6 = R.id.To_spinner;
                if (((Spinner) a.k(inflate, R.id.To_spinner)) != null) {
                    i6 = R.id.btn_back;
                    ImageView imageView = (ImageView) a.k(inflate, R.id.btn_back);
                    if (imageView != null) {
                        i6 = R.id.confirm_button;
                        Button button = (Button) a.k(inflate, R.id.confirm_button);
                        if (button != null) {
                            i6 = R.id.from_spinner;
                            if (((Spinner) a.k(inflate, R.id.from_spinner)) != null) {
                                i6 = R.id.navigationView;
                                if (((BottomNavigationView) a.k(inflate, R.id.navigationView)) != null) {
                                    i6 = R.id.swap_text;
                                    if (((EditText) a.k(inflate, R.id.swap_text)) != null) {
                                        i6 = R.id.toolbar;
                                        if (((Toolbar) a.k(inflate, R.id.toolbar)) != null) {
                                            i6 = R.id.toolbar_line;
                                            if (a.k(inflate, R.id.toolbar_line) != null) {
                                                i6 = R.id.toolbar_title;
                                                if (((TextView) a.k(inflate, R.id.toolbar_title)) != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                    this.f3554x = new m(constraintLayout, imageView, button);
                                                    setContentView(constraintLayout);
                                                    m mVar = this.f3554x;
                                                    if (mVar != null) {
                                                        mVar.f7041a.setOnClickListener(new f3.a(6, this));
                                                        m mVar2 = this.f3554x;
                                                        if (mVar2 != null) {
                                                            mVar2.f7042b.setOnClickListener(new e(7, this));
                                                            return;
                                                        }
                                                        f.k("binding");
                                                        throw null;
                                                    }
                                                    f.k("binding");
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
