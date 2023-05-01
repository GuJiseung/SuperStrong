package com.superstrong.android.view;

import a4.e;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import l4.f;
import z3.n;
/* loaded from: classes.dex */
public final class TimeCoinActivity extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3557y = 0;

    /* renamed from: x  reason: collision with root package name */
    public n f3558x;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_timecoin);
        View inflate = getLayoutInflater().inflate(R.layout.activity_timecoin, (ViewGroup) null, false);
        int i6 = R.id.btc_time;
        if (((TextView) a.k(inflate, R.id.btc_time)) != null) {
            i6 = R.id.btn_back;
            ImageView imageView = (ImageView) a.k(inflate, R.id.btn_back);
            if (imageView != null) {
                i6 = R.id.coin_name1;
                if (((TextView) a.k(inflate, R.id.coin_name1)) != null) {
                    i6 = R.id.coin_name2;
                    if (((TextView) a.k(inflate, R.id.coin_name2)) != null) {
                        i6 = R.id.coin_name3;
                        if (((TextView) a.k(inflate, R.id.coin_name3)) != null) {
                            i6 = R.id.coin_text1;
                            if (((TextView) a.k(inflate, R.id.coin_text1)) != null) {
                                i6 = R.id.coin_text2;
                                if (((TextView) a.k(inflate, R.id.coin_text2)) != null) {
                                    i6 = R.id.coin_text3;
                                    if (((TextView) a.k(inflate, R.id.coin_text3)) != null) {
                                        i6 = R.id.cointime_layout1;
                                        if (((LinearLayout) a.k(inflate, R.id.cointime_layout1)) != null) {
                                            i6 = R.id.cointime_layout2;
                                            if (((LinearLayout) a.k(inflate, R.id.cointime_layout2)) != null) {
                                                i6 = R.id.cointime_layout3;
                                                if (((LinearLayout) a.k(inflate, R.id.cointime_layout3)) != null) {
                                                    i6 = R.id.doge_time;
                                                    if (((TextView) a.k(inflate, R.id.doge_time)) != null) {
                                                        i6 = R.id.eth_time;
                                                        if (((TextView) a.k(inflate, R.id.eth_time)) != null) {
                                                            i6 = R.id.navigationView;
                                                            if (((BottomNavigationView) a.k(inflate, R.id.navigationView)) != null) {
                                                                i6 = R.id.next_button;
                                                                Button button = (Button) a.k(inflate, R.id.next_button);
                                                                if (button != null) {
                                                                    i6 = R.id.textView;
                                                                    if (((TextView) a.k(inflate, R.id.textView)) != null) {
                                                                        i6 = R.id.toolbar;
                                                                        if (((Toolbar) a.k(inflate, R.id.toolbar)) != null) {
                                                                            i6 = R.id.toolbar_line1;
                                                                            if (a.k(inflate, R.id.toolbar_line1) != null) {
                                                                                i6 = R.id.toolbar_line2;
                                                                                if (a.k(inflate, R.id.toolbar_line2) != null) {
                                                                                    i6 = R.id.toolbar_line3;
                                                                                    if (a.k(inflate, R.id.toolbar_line3) != null) {
                                                                                        i6 = R.id.toolbar_line4;
                                                                                        if (a.k(inflate, R.id.toolbar_line4) != null) {
                                                                                            i6 = R.id.toolbar_line5;
                                                                                            if (a.k(inflate, R.id.toolbar_line5) != null) {
                                                                                                i6 = R.id.toolbar_title;
                                                                                                if (((TextView) a.k(inflate, R.id.toolbar_title)) != null) {
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                    this.f3558x = new n(constraintLayout, imageView, button);
                                                                                                    setContentView(constraintLayout);
                                                                                                    n nVar = this.f3558x;
                                                                                                    if (nVar != null) {
                                                                                                        nVar.f7043a.setOnClickListener(new e(8, this));
                                                                                                        n nVar2 = this.f3558x;
                                                                                                        if (nVar2 != null) {
                                                                                                            nVar2.f7044b.setOnClickListener(new m3.c(11, this));
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
