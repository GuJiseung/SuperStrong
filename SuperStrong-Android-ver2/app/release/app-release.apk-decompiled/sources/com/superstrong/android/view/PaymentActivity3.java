package com.superstrong.android.view;

import a4.e;
import a4.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import z3.f;
/* loaded from: classes.dex */
public final class PaymentActivity3 extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3547y = 0;

    /* renamed from: x  reason: collision with root package name */
    public f f3548x;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment3);
        View inflate = getLayoutInflater().inflate(R.layout.activity_payment3, (ViewGroup) null, false);
        int i6 = R.id.btn_back;
        ImageView imageView = (ImageView) a.k(inflate, R.id.btn_back);
        if (imageView != null) {
            i6 = R.id.navigationView;
            if (((BottomNavigationView) a.k(inflate, R.id.navigationView)) != null) {
                int i7 = R.id.next_button;
                Button button = (Button) a.k(inflate, R.id.next_button);
                if (button != null) {
                    i7 = R.id.textView8;
                    if (((TextView) a.k(inflate, R.id.textView8)) != null) {
                        i7 = R.id.toolbar;
                        if (((Toolbar) a.k(inflate, R.id.toolbar)) != null) {
                            i7 = R.id.toolbar_line;
                            if (a.k(inflate, R.id.toolbar_line) != null) {
                                i7 = R.id.toolbar_title;
                                if (((TextView) a.k(inflate, R.id.toolbar_title)) != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                    this.f3548x = new f(constraintLayout, imageView, button);
                                    setContentView(constraintLayout);
                                    View findViewById = findViewById(R.id.navigationView);
                                    l4.f.e(findViewById, "findViewById(R.id.navigationView)");
                                    ((BottomNavigationView) findViewById).setOnNavigationItemSelectedListener(new l(this));
                                    f fVar = this.f3548x;
                                    if (fVar != null) {
                                        fVar.f7027a.setOnClickListener(new e(3, this));
                                        f fVar2 = this.f3548x;
                                        if (fVar2 != null) {
                                            fVar2.f7028b.setOnClickListener(new m3.c(7, this));
                                            return;
                                        }
                                        l4.f.k("binding");
                                        throw null;
                                    }
                                    l4.f.k("binding");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                i6 = i7;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
