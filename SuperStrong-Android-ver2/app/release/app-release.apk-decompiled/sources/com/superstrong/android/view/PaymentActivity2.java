package com.superstrong.android.view;

import a4.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i0;
import b4.k;
import b4.n;
import c.a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import com.superstrong.android.view.PaymentActivity2;
import com.superstrong.android.view.PaymentActivity3;
import l4.f;
import org.json.JSONObject;
import y3.z;
import z3.e;
/* loaded from: classes.dex */
public final class PaymentActivity2 extends c {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f3544z = 0;

    /* renamed from: x  reason: collision with root package name */
    public e f3545x;

    /* renamed from: y  reason: collision with root package name */
    public n f3546y;

    @Override // androidx.fragment.app.r, androidx.activity.ComponentActivity, v.h, android.app.Activity
    @SuppressLint({"MissingInflatedId"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_payment2);
        this.f3546y = (n) new i0(this).a(n.class);
        k kVar = (k) new i0(this).a(k.class);
        int i6 = R.id.navigationView;
        View findViewById = findViewById(R.id.navigationView);
        f.e(findViewById, "findViewById(R.id.navigationView)");
        ((BottomNavigationView) findViewById).setOnNavigationItemSelectedListener(new l(this));
        View inflate = getLayoutInflater().inflate(R.layout.activity_payment2, (ViewGroup) null, false);
        int i7 = R.id.btn_back;
        ImageView imageView = (ImageView) a.k(inflate, R.id.btn_back);
        if (imageView != null) {
            i7 = R.id.coin1;
            TextView textView = (TextView) a.k(inflate, R.id.coin1);
            if (textView != null) {
                i7 = R.id.coin2;
                TextView textView2 = (TextView) a.k(inflate, R.id.coin2);
                if (textView2 != null) {
                    i7 = R.id.coin3;
                    TextView textView3 = (TextView) a.k(inflate, R.id.coin3);
                    if (textView3 != null) {
                        i7 = R.id.coin_balance;
                        TextView textView4 = (TextView) a.k(inflate, R.id.coin_balance);
                        if (textView4 != null) {
                            i7 = R.id.coin_gas;
                            TextView textView5 = (TextView) a.k(inflate, R.id.coin_gas);
                            if (textView5 != null) {
                                i7 = R.id.coin_pay;
                                TextView textView6 = (TextView) a.k(inflate, R.id.coin_pay);
                                if (textView6 != null) {
                                    if (((BottomNavigationView) a.k(inflate, R.id.navigationView)) != null) {
                                        i6 = R.id.next_button;
                                        Button button = (Button) a.k(inflate, R.id.next_button);
                                        if (button != null) {
                                            i6 = R.id.pay_address;
                                            TextView textView7 = (TextView) a.k(inflate, R.id.pay_address);
                                            if (textView7 != null) {
                                                i6 = R.id.textView3;
                                                if (((TextView) a.k(inflate, R.id.textView3)) != null) {
                                                    i6 = R.id.textView4;
                                                    if (((TextView) a.k(inflate, R.id.textView4)) != null) {
                                                        i6 = R.id.textView5;
                                                        if (((TextView) a.k(inflate, R.id.textView5)) != null) {
                                                            i6 = R.id.textView7;
                                                            if (((TextView) a.k(inflate, R.id.textView7)) != null) {
                                                                i6 = R.id.toolbar;
                                                                if (((Toolbar) a.k(inflate, R.id.toolbar)) != null) {
                                                                    i6 = R.id.toolbar_line;
                                                                    if (a.k(inflate, R.id.toolbar_line) != null) {
                                                                        i6 = R.id.toolbar_title;
                                                                        if (((TextView) a.k(inflate, R.id.toolbar_title)) != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                                            this.f3545x = new e(constraintLayout, imageView, textView, textView2, textView3, textView4, textView5, textView6, button, textView7);
                                                                            setContentView(constraintLayout);
                                                                            final String stringExtra = getIntent().getStringExtra("to_address");
                                                                            final Double valueOf = Double.valueOf(getIntent().getDoubleExtra("send_amount", 0.0d));
                                                                            final String stringExtra2 = getIntent().getStringExtra("coin_name");
                                                                            final Double valueOf2 = Double.valueOf(getIntent().getDoubleExtra("calculated_gas", 0.0d));
                                                                            final Double valueOf3 = Double.valueOf(getIntent().getDoubleExtra("remain_amount", 0.0d));
                                                                            Log.d("**************************************************** To Address", "to address: " + stringExtra);
                                                                            Log.d("***************************************************** To Address* Send Amount", "send amount: " + valueOf);
                                                                            Log.d("***************************************************** To Address* Coin name", "coin name: " + stringExtra2);
                                                                            Log.d("***************************************************** To Address* Calculated Gas", "calculated_gas: " + valueOf2);
                                                                            Log.d("***************************************************** To Address* Remain Amount", "remain_amount: " + valueOf3);
                                                                            e eVar = this.f3545x;
                                                                            if (eVar != null) {
                                                                                eVar.f7026i.setText(stringExtra);
                                                                                e eVar2 = this.f3545x;
                                                                                if (eVar2 != null) {
                                                                                    eVar2.f7024g.setText(String.valueOf(valueOf));
                                                                                    e eVar3 = this.f3545x;
                                                                                    if (eVar3 != null) {
                                                                                        eVar3.f7019b.setText(stringExtra2);
                                                                                        e eVar4 = this.f3545x;
                                                                                        if (eVar4 != null) {
                                                                                            eVar4.f7020c.setText(stringExtra2);
                                                                                            e eVar5 = this.f3545x;
                                                                                            if (eVar5 != null) {
                                                                                                eVar5.f7021d.setText(stringExtra2);
                                                                                                e eVar6 = this.f3545x;
                                                                                                if (eVar6 != null) {
                                                                                                    eVar6.f7023f.setText(String.valueOf(valueOf2));
                                                                                                    e eVar7 = this.f3545x;
                                                                                                    if (eVar7 != null) {
                                                                                                        eVar7.f7022e.setText(String.valueOf(valueOf3));
                                                                                                        e eVar8 = this.f3545x;
                                                                                                        if (eVar8 != null) {
                                                                                                            eVar8.f7018a.setOnClickListener(new m3.c(6, this));
                                                                                                            e eVar9 = this.f3545x;
                                                                                                            if (eVar9 != null) {
                                                                                                                eVar9.f7025h.setOnClickListener(new View.OnClickListener() { // from class: a4.m
                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                    public final void onClick(View view) {
                                                                                                                        int i8 = PaymentActivity2.f3544z;
                                                                                                                        PaymentActivity2 paymentActivity2 = PaymentActivity2.this;
                                                                                                                        l4.f.f(paymentActivity2, "this$0");
                                                                                                                        new Intent(paymentActivity2, PaymentActivity3.class);
                                                                                                                        SharedPreferences sharedPreferences = paymentActivity2.getSharedPreferences("strong", 0);
                                                                                                                        String string = sharedPreferences.getString("jwt_token", "");
                                                                                                                        JSONObject jSONObject = new JSONObject();
                                                                                                                        jSONObject.put("token", string);
                                                                                                                        String string2 = jSONObject.getString("token");
                                                                                                                        String string3 = sharedPreferences.getString("ID", "");
                                                                                                                        if (string2 == null) {
                                                                                                                            string2 = "nonetoken";
                                                                                                                        } else if (string3 == null) {
                                                                                                                            string3 = "noneid";
                                                                                                                        }
                                                                                                                        String str = string3;
                                                                                                                        Log.d("토크ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㄴ", ": ".concat(string2));
                                                                                                                        Log.d("아이디ㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣㅣ", ": " + str);
                                                                                                                        StringBuilder sb = new StringBuilder("to address: ");
                                                                                                                        String str2 = stringExtra;
                                                                                                                        sb.append(str2);
                                                                                                                        Log.d("To Address", sb.toString());
                                                                                                                        StringBuilder sb2 = new StringBuilder("send amount: ");
                                                                                                                        Double d6 = valueOf;
                                                                                                                        sb2.append(d6);
                                                                                                                        Log.d("Send Amount", sb2.toString());
                                                                                                                        StringBuilder sb3 = new StringBuilder("coin name: ");
                                                                                                                        String str3 = stringExtra2;
                                                                                                                        sb3.append(str3);
                                                                                                                        Log.d("Coin name", sb3.toString());
                                                                                                                        StringBuilder sb4 = new StringBuilder("calculated_gas: ");
                                                                                                                        Double d7 = valueOf2;
                                                                                                                        sb4.append(d7);
                                                                                                                        Log.d("Calculated Gas", sb4.toString());
                                                                                                                        Log.d("Remain Amount", "remain_amount: " + valueOf3);
                                                                                                                        Log.d("Token", "token: ".concat(string2));
                                                                                                                        if (str != null && str2 != null && d7 != null && str3 != null && d6 != null) {
                                                                                                                            if (paymentActivity2.f3546y != null) {
                                                                                                                                y3.r rVar = new y3.r(str, str2, d7.doubleValue(), str3, d6.doubleValue());
                                                                                                                                Log.d("액티비티 2에서 3으로 넘어갈때!!! 넘기는 값들 !!!!!!!!", "df" + rVar);
                                                                                                                                String str4 = b4.b.f2431a;
                                                                                                                                String f6 = new q3.j().f(rVar);
                                                                                                                                l4.f.e(f6, "Gson().toJson(payInfo2)");
                                                                                                                                g5.b<q3.q> h6 = z.a().h(new y3.m(b4.b.b(f6), string2));
                                                                                                                                b4.b.c(paymentActivity2);
                                                                                                                                h6.k(new b4.m(paymentActivity2));
                                                                                                                                return;
                                                                                                                            }
                                                                                                                            l4.f.k("paymentVModel2");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        Toast.makeText(paymentActivity2, "Payment 2에서 3으로 서버에 정보 POST 하는 과정에서 null값이 포함되어있습니다.", 0).show();
                                                                                                                    }
                                                                                                                });
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
                        }
                    }
                }
            }
        }
        i6 = i7;
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
