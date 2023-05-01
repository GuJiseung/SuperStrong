package m3;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
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
import y3.a0;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5270b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5271c;

    public /* synthetic */ c(int i6, Object obj) {
        this.f5270b = i6;
        this.f5271c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z5;
        EditText editText;
        int i6;
        int i7 = this.f5270b;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f5271c;
        switch (i7) {
            case 0:
                g gVar = (g) obj;
                EditText editText2 = gVar.f5280i;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    gVar.q();
                    return;
                }
                return;
            case 1:
                ((o) obj).u();
                return;
            case 2:
                w wVar = (w) obj;
                EditText editText3 = wVar.f5353f;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = wVar.f5353f;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        editText = wVar.f5353f;
                    } else {
                        editText = wVar.f5353f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        wVar.f5353f.setSelection(selectionEnd);
                    }
                    wVar.q();
                    return;
                }
                return;
            case 3:
                a4.d dVar = (a4.d) obj;
                int i8 = a4.d.X;
                l4.f.f(dVar, "this$0");
                b4.e eVar = (b4.e) dVar.W.a();
                m.c cVar = dVar.V;
                l4.f.c(cVar);
                String valueOf = String.valueOf(((AppCompatEditText) cVar.f5160b).getText());
                eVar.getClass();
                kotlinx.coroutines.internal.f.b(androidx.activity.k.k(eVar), new b4.c(eVar, valueOf, null));
                return;
            case 4:
                a4.g gVar2 = (a4.g) obj;
                int i9 = a4.g.X;
                l4.f.f(gVar2, "this$0");
                ((b4.e) gVar2.W.a()).f2443h.j(Boolean.TRUE);
                return;
            case 5:
                FindPassActivity2 findPassActivity2 = (FindPassActivity2) obj;
                int i10 = FindPassActivity2.f3536x;
                l4.f.f(findPassActivity2, "this$0");
                findPassActivity2.startActivity(new Intent(findPassActivity2, lallaaaalllaa.class));
                return;
            case 6:
                PaymentActivity2 paymentActivity2 = (PaymentActivity2) obj;
                int i11 = PaymentActivity2.f3544z;
                l4.f.f(paymentActivity2, "this$0");
                paymentActivity2.startActivity(new Intent(paymentActivity2, PaymentActivity.class));
                paymentActivity2.finish();
                return;
            case 7:
                PaymentActivity3 paymentActivity3 = (PaymentActivity3) obj;
                int i12 = PaymentActivity3.f3547y;
                l4.f.f(paymentActivity3, "this$0");
                paymentActivity3.startActivity(new Intent(paymentActivity3, WalletActivity.class));
                paymentActivity3.finish();
                return;
            case 8:
                a4.n nVar = (a4.n) obj;
                int i13 = a4.n.X;
                l4.f.f(nVar, "this$0");
                ((b4.r) nVar.W.a()).f2484e.j(Boolean.TRUE);
                return;
            case 9:
                a4.o oVar = (a4.o) obj;
                int i14 = a4.o.X;
                l4.f.f(oVar, "this$0");
                b4.r rVar = (b4.r) oVar.W.a();
                z3.r rVar2 = oVar.V;
                l4.f.c(rVar2);
                String obj2 = ((EditText) rVar2.f7062f).getText().toString();
                z3.r rVar3 = oVar.V;
                l4.f.c(rVar3);
                String obj3 = ((EditText) rVar3.f7064h).getText().toString();
                z3.r rVar4 = oVar.V;
                l4.f.c(rVar4);
                String obj4 = ((EditText) rVar4.f7065i).getText().toString();
                z3.r rVar5 = oVar.V;
                l4.f.c(rVar5);
                String obj5 = ((EditText) rVar5.f7061e).getText().toString();
                z3.r rVar6 = oVar.V;
                l4.f.c(rVar6);
                String obj6 = ((EditText) rVar6.f7063g).getText().toString();
                rVar.getClass();
                l4.f.f(obj2, "id");
                l4.f.f(obj3, "pass1");
                l4.f.f(obj4, "pass2");
                l4.f.f(obj5, "mail");
                l4.f.f(obj6, "phone");
                boolean a6 = l4.f.a(obj2, "");
                androidx.lifecycle.s<Integer> sVar = rVar.f2486g;
                if (!a6 && !l4.f.a(obj3, "") && !l4.f.a(obj4, "") && !l4.f.a(obj5, "") && !l4.f.a(obj6, "")) {
                    if (!l4.f.a(obj3, obj4)) {
                        i6 = 7;
                    } else {
                        a0 a0Var = new a0(obj2, obj3, obj5, obj6);
                        rVar.f2487h.j(Boolean.TRUE);
                        kotlinx.coroutines.internal.f.b(androidx.activity.k.k(rVar), new b4.q(rVar, a0Var, null));
                        return;
                    }
                } else {
                    i6 = 6;
                }
                sVar.j(Integer.valueOf(i6));
                return;
            case 10:
                SwapActivity2 swapActivity2 = (SwapActivity2) obj;
                int i15 = SwapActivity2.f3555y;
                l4.f.f(swapActivity2, "this$0");
                swapActivity2.startActivity(new Intent(swapActivity2, SwapActivity.class));
                swapActivity2.finish();
                return;
            case 11:
                TimeCoinActivity timeCoinActivity = (TimeCoinActivity) obj;
                int i16 = TimeCoinActivity.f3557y;
                l4.f.f(timeCoinActivity, "this$0");
                timeCoinActivity.startActivity(new Intent(timeCoinActivity, WalletActivity.class));
                timeCoinActivity.finish();
                return;
            case 12:
                WalletActivity walletActivity = (WalletActivity) obj;
                int i17 = WalletActivity.f3559z;
                l4.f.f(walletActivity, "this$0");
                walletActivity.startActivity(new Intent(walletActivity, TimeCoinActivity.class));
                return;
            default:
                lallaaaalllaa lallaaaalllaaVar = (lallaaaalllaa) obj;
                int i18 = lallaaaalllaa.f3563z;
                l4.f.f(lallaaaalllaaVar, "this$0");
                lallaaaalllaaVar.startActivity(new Intent(lallaaaalllaaVar, SignupActivity.class));
                return;
        }
    }
}
