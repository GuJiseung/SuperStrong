package a4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.superstrong.android.view.FindPassActivity;
import com.superstrong.android.view.FindPassActivity2;
import com.superstrong.android.view.PaymentActivity;
import com.superstrong.android.view.PaymentActivity2;
import com.superstrong.android.view.PaymentActivity3;
import com.superstrong.android.view.SignupActivity;
import com.superstrong.android.view.SwapActivity;
import com.superstrong.android.view.SwapActivity2;
import com.superstrong.android.view.TimeCoinActivity;
import com.superstrong.android.view.WalletActivity;
import com.superstrong.android.view.lallaaaalllaa;
import org.json.JSONObject;
import y3.d0;
import y3.z;
import z3.s;
import z3.t;
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f175b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f176c;

    public /* synthetic */ e(int i6, Object obj) {
        this.f175b = i6;
        this.f176c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f175b;
        Object obj = this.f176c;
        switch (i6) {
            case 0:
                f fVar = (f) obj;
                int i7 = f.X;
                l4.f.f(fVar, "this$0");
                b4.e eVar = (b4.e) fVar.W.a();
                z3.q qVar = fVar.V;
                l4.f.c(qVar);
                String valueOf = String.valueOf(qVar.f7053a.getText());
                z3.q qVar2 = fVar.V;
                l4.f.c(qVar2);
                String valueOf2 = String.valueOf(qVar2.f7054b.getText());
                eVar.getClass();
                eVar.f2442g.j(Boolean.valueOf(l4.f.a(valueOf, valueOf2)));
                if (l4.f.a(valueOf, valueOf2)) {
                    kotlinx.coroutines.internal.f.b(androidx.activity.k.k(eVar), new b4.d(eVar, valueOf, null));
                    return;
                }
                return;
            case 1:
                FindPassActivity findPassActivity = (FindPassActivity) obj;
                int i8 = FindPassActivity.f3535x;
                l4.f.f(findPassActivity, "this$0");
                findPassActivity.startActivity(new Intent(findPassActivity, FindPassActivity2.class));
                return;
            case 2:
                PaymentActivity paymentActivity = (PaymentActivity) obj;
                int i9 = PaymentActivity.f3537z;
                l4.f.f(paymentActivity, "this$0");
                new Intent(paymentActivity, PaymentActivity2.class);
                SharedPreferences sharedPreferences = paymentActivity.getSharedPreferences("strong", 0);
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
                b4.o oVar = paymentActivity.f3539y;
                if (oVar != null) {
                    String d6 = oVar.f2473d.d();
                    b4.o oVar2 = paymentActivity.f3539y;
                    if (oVar2 != null) {
                        Double d7 = oVar2.f2474e.d();
                        b4.o oVar3 = paymentActivity.f3539y;
                        if (oVar3 != null) {
                            String d8 = oVar3.f2475f.d();
                            if (d6 != null && d7 != null && d8 != null && str != null) {
                                if (paymentActivity.f3539y != null) {
                                    y3.q qVar3 = new y3.q(d6, d7.doubleValue(), d8, str);
                                    b4.b.c(paymentActivity);
                                    String f6 = new q3.j().f(qVar3);
                                    l4.f.e(f6, "Gson().toJson(payInfo1)");
                                    z.a().e(new y3.m(b4.b.b(f6), string2)).k(new b4.l(paymentActivity));
                                    return;
                                }
                                l4.f.k("paymentVModel");
                                throw null;
                            }
                            Log.d("To Address", "to address: " + d6);
                            Log.d("Send Amount", "send amount: " + d7);
                            Log.d("Coin name", "coin name: " + d8);
                            Log.d("Token", "token: ".concat(string2));
                            Log.d("ID", "id: " + str);
                            Toast.makeText(paymentActivity, "입력한 주소와 코인의 종류, 수량을 입력해주세요.", 0).show();
                            return;
                        }
                        l4.f.k("paymentVModel");
                        throw null;
                    }
                    l4.f.k("paymentVModel");
                    throw null;
                }
                l4.f.k("paymentVModel");
                throw null;
            case 3:
                PaymentActivity3 paymentActivity3 = (PaymentActivity3) obj;
                int i10 = PaymentActivity3.f3547y;
                l4.f.f(paymentActivity3, "this$0");
                paymentActivity3.startActivity(new Intent(paymentActivity3, PaymentActivity2.class));
                paymentActivity3.finish();
                return;
            case 4:
                n nVar = (n) obj;
                int i11 = n.X;
                l4.f.f(nVar, "this$0");
                s sVar = nVar.V;
                l4.f.c(sVar);
                if (sVar.f7070e.isChecked()) {
                    s sVar2 = nVar.V;
                    l4.f.c(sVar2);
                    sVar2.f7069d.setChecked(true);
                    s sVar3 = nVar.V;
                    l4.f.c(sVar3);
                    sVar3.f7068c.setChecked(true);
                    return;
                }
                return;
            case 5:
                p pVar = (p) obj;
                int i12 = p.X;
                l4.f.f(pVar, "this$0");
                b4.r P = pVar.P();
                t tVar = pVar.V;
                l4.f.c(tVar);
                String obj2 = tVar.f7074c.getText().toString();
                P.getClass();
                l4.f.f(obj2, "code");
                y3.a aVar = new y3.a(obj2);
                P.f2487h.j(Boolean.TRUE);
                kotlinx.coroutines.internal.f.b(androidx.activity.k.k(P), new b4.p(P, aVar, null));
                return;
            case 6:
                SignupActivity signupActivity = (SignupActivity) obj;
                int i13 = SignupActivity.f3549z;
                l4.f.f(signupActivity, "this$0");
                androidx.lifecycle.s<Integer> sVar4 = signupActivity.C().f2483d;
                Integer d9 = sVar4.d();
                l4.f.c(d9);
                sVar4.j(Integer.valueOf(d9.intValue() - 1));
                return;
            case 7:
                SwapActivity swapActivity = (SwapActivity) obj;
                int i14 = SwapActivity.f3553y;
                l4.f.f(swapActivity, "this$0");
                swapActivity.startActivity(new Intent(swapActivity, SwapActivity2.class));
                swapActivity.finish();
                return;
            case 8:
                TimeCoinActivity timeCoinActivity = (TimeCoinActivity) obj;
                int i15 = TimeCoinActivity.f3557y;
                l4.f.f(timeCoinActivity, "this$0");
                timeCoinActivity.startActivity(new Intent(timeCoinActivity, WalletActivity.class));
                timeCoinActivity.finish();
                return;
            case 9:
                WalletActivity walletActivity = (WalletActivity) obj;
                int i16 = WalletActivity.f3559z;
                l4.f.f(walletActivity, "this$0");
                walletActivity.startActivity(new Intent(walletActivity, PaymentActivity.class));
                return;
            default:
                lallaaaalllaa lallaaaalllaaVar = (lallaaaalllaa) obj;
                int i17 = lallaaaalllaa.f3563z;
                l4.f.f(lallaaaalllaaVar, "this$0");
                b4.j jVar = lallaaaalllaaVar.f3564x;
                if (jVar != null) {
                    String d10 = jVar.f2469d.d();
                    b4.j jVar2 = lallaaaalllaaVar.f3564x;
                    if (jVar2 != null) {
                        String d11 = jVar2.f2470e.d();
                        if (d10 != null && d11 != null) {
                            if (lallaaaalllaaVar.f3564x != null) {
                                SharedPreferences sharedPreferences2 = lallaaaalllaaVar.getSharedPreferences("strong", 0);
                                d0 d0Var = new d0(d10, d11);
                                byte[] bArr = b4.a.f2430a;
                                String f7 = new q3.j().f(d0Var);
                                l4.f.e(f7, "Gson().toJson(user)");
                                z.a().d(new y3.l(b4.a.b(f7))).k(new b4.i(lallaaaalllaaVar, sharedPreferences2, d10));
                                return;
                            }
                            l4.f.k("loginViewModel");
                            throw null;
                        }
                        Toast.makeText(lallaaaalllaaVar, "id와 password를 입력해 주세요", 0).show();
                        return;
                    }
                    l4.f.k("loginViewModel");
                    throw null;
                }
                l4.f.k("loginViewModel");
                throw null;
        }
    }
}
