package com.superstrong.android.view;

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
import z3.l;
/* loaded from: classes.dex */
public final class SwapActivity2 extends c {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f3555y = 0;

    /* renamed from: x  reason: collision with root package name */
    public l f3556x;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_swap2);
        View inflate = getLayoutInflater().inflate(R.layout.activity_swap2, (ViewGroup) null, false);
        int i6 = R.id.btn_back;
        ImageView imageView = (ImageView) a.k(inflate, R.id.btn_back);
        if (imageView != null) {
            i6 = R.id.coin1;
            if (((TextView) a.k(inflate, R.id.coin1)) != null) {
                i6 = R.id.coin2;
                if (((TextView) a.k(inflate, R.id.coin2)) != null) {
                    i6 = R.id.coin3;
                    if (((TextView) a.k(inflate, R.id.coin3)) != null) {
                        i6 = R.id.coin4;
                        if (((TextView) a.k(inflate, R.id.coin4)) != null) {
                            i6 = R.id.coin5;
                            if (((TextView) a.k(inflate, R.id.coin5)) != null) {
                                i6 = R.id.coin6;
                                if (((TextView) a.k(inflate, R.id.coin6)) != null) {
                                    i6 = R.id.coin7;
                                    if (((TextView) a.k(inflate, R.id.coin7)) != null) {
                                        i6 = R.id.coin_balance1;
                                        if (((TextView) a.k(inflate, R.id.coin_balance1)) != null) {
                                            i6 = R.id.coin_balance2;
                                            if (((TextView) a.k(inflate, R.id.coin_balance2)) != null) {
                                                i6 = R.id.coin_gas;
                                                if (((TextView) a.k(inflate, R.id.coin_gas)) != null) {
                                                    i6 = R.id.coin_pay;
                                                    if (((TextView) a.k(inflate, R.id.coin_pay)) != null) {
                                                        i6 = R.id.coin_total;
                                                        if (((TextView) a.k(inflate, R.id.coin_total)) != null) {
                                                            i6 = R.id.confirm_button;
                                                            Button button = (Button) a.k(inflate, R.id.confirm_button);
                                                            if (button != null) {
                                                                i6 = R.id.from;
                                                                if (((TextView) a.k(inflate, R.id.from)) != null) {
                                                                    i6 = R.id.from_coin;
                                                                    if (((TextView) a.k(inflate, R.id.from_coin)) != null) {
                                                                        i6 = R.id.from_to_layout;
                                                                        if (((LinearLayout) a.k(inflate, R.id.from_to_layout)) != null) {
                                                                            i6 = R.id.linearLayout2;
                                                                            if (((LinearLayout) a.k(inflate, R.id.linearLayout2)) != null) {
                                                                                i6 = R.id.navigationView;
                                                                                if (((BottomNavigationView) a.k(inflate, R.id.navigationView)) != null) {
                                                                                    i6 = R.id.textView4;
                                                                                    if (((TextView) a.k(inflate, R.id.textView4)) != null) {
                                                                                        i6 = R.id.textView5;
                                                                                        if (((TextView) a.k(inflate, R.id.textView5)) != null) {
                                                                                            i6 = R.id.textView7;
                                                                                            if (((TextView) a.k(inflate, R.id.textView7)) != null) {
                                                                                                i6 = R.id.textView9;
                                                                                                if (((TextView) a.k(inflate, R.id.textView9)) != null) {
                                                                                                    i6 = R.id.to;
                                                                                                    if (((TextView) a.k(inflate, R.id.to)) != null) {
                                                                                                        i6 = R.id.to_coin;
                                                                                                        if (((TextView) a.k(inflate, R.id.to_coin)) != null) {
                                                                                                            i6 = R.id.toolbar;
                                                                                                            if (((Toolbar) a.k(inflate, R.id.toolbar)) != null) {
                                                                                                                i6 = R.id.toolbar_line;
                                                                                                                if (a.k(inflate, R.id.toolbar_line) != null) {
                                                                                                                    i6 = R.id.toolbar_line2;
                                                                                                                    if (a.k(inflate, R.id.toolbar_line2) != null) {
                                                                                                                        i6 = R.id.toolbar_title;
                                                                                                                        if (((TextView) a.k(inflate, R.id.toolbar_title)) != null) {
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                                                                            this.f3556x = new l(constraintLayout, imageView, button);
                                                                                                                            setContentView(constraintLayout);
                                                                                                                            l lVar = this.f3556x;
                                                                                                                            if (lVar != null) {
                                                                                                                                lVar.f7039a.setOnClickListener(new m3.c(10, this));
                                                                                                                                l lVar2 = this.f3556x;
                                                                                                                                if (lVar2 != null) {
                                                                                                                                    lVar2.f7040b.setOnClickListener(new f3.a(7, this));
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
