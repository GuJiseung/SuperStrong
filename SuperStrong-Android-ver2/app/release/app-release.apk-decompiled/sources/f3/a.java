package f3;

import a4.n;
import a4.p;
import a4.q;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.s;
import b4.e;
import b4.r;
import com.superstrong.android.view.ChpasswdActivity;
import com.superstrong.android.view.FindPassActivity;
import com.superstrong.android.view.PaymentActivity;
import com.superstrong.android.view.SwapActivity;
import com.superstrong.android.view.SwapActivity2;
import com.superstrong.android.view.WalletActivity;
import com.superstrong.android.view.lallaaaalllaa;
import l4.f;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3959b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3960c;

    public /* synthetic */ a(int i6, Object obj) {
        this.f3959b = i6;
        this.f3960c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z5;
        int i6 = this.f3959b;
        Object obj = this.f3960c;
        switch (i6) {
            case 1:
                ChpasswdActivity chpasswdActivity = (ChpasswdActivity) obj;
                int i7 = ChpasswdActivity.f3532z;
                f.f(chpasswdActivity, "this$0");
                e eVar = chpasswdActivity.f3534y;
                if (eVar != null) {
                    s<Integer> sVar = eVar.f2441f;
                    Integer d6 = sVar.d();
                    f.c(d6);
                    sVar.j(Integer.valueOf(d6.intValue() - 1));
                    return;
                }
                f.k("viewModel");
                throw null;
            case 2:
                PaymentActivity paymentActivity = (PaymentActivity) obj;
                int i8 = PaymentActivity.f3537z;
                f.f(paymentActivity, "this$0");
                paymentActivity.startActivity(new Intent(paymentActivity, WalletActivity.class));
                paymentActivity.finish();
                return;
            case 3:
                n nVar = (n) obj;
                int i9 = n.X;
                f.f(nVar, "this$0");
                r rVar = (r) nVar.W.a();
                z3.s sVar2 = nVar.V;
                f.c(sVar2);
                boolean isChecked = sVar2.f7069d.isChecked();
                z3.s sVar3 = nVar.V;
                f.c(sVar3);
                boolean isChecked2 = sVar3.f7068c.isChecked();
                s<Boolean> sVar4 = rVar.f2485f;
                if (isChecked && isChecked2) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                sVar4.j(Boolean.valueOf(z5));
                if (f.a(sVar4.d(), Boolean.FALSE)) {
                    rVar.f2483d.j(2);
                    return;
                }
                return;
            case 4:
                p pVar = (p) obj;
                int i10 = p.X;
                f.f(pVar, "this$0");
                pVar.P().f2484e.j(Boolean.TRUE);
                return;
            case 5:
                q qVar = (q) obj;
                int i11 = q.X;
                f.f(qVar, "this$0");
                qVar.P().f2484e.j(Boolean.TRUE);
                return;
            case 6:
                SwapActivity swapActivity = (SwapActivity) obj;
                int i12 = SwapActivity.f3553y;
                f.f(swapActivity, "this$0");
                swapActivity.startActivity(new Intent(swapActivity, WalletActivity.class));
                swapActivity.finish();
                return;
            case 7:
                SwapActivity2 swapActivity2 = (SwapActivity2) obj;
                int i13 = SwapActivity2.f3555y;
                f.f(swapActivity2, "this$0");
                swapActivity2.startActivity(new Intent(swapActivity2, WalletActivity.class));
                swapActivity2.finish();
                return;
            case 8:
                WalletActivity walletActivity = (WalletActivity) obj;
                int i14 = WalletActivity.f3559z;
                f.f(walletActivity, "this$0");
                walletActivity.startActivity(new Intent(walletActivity, SwapActivity.class));
                return;
            default:
                lallaaaalllaa lallaaaalllaaVar = (lallaaaalllaa) obj;
                int i15 = lallaaaalllaa.f3563z;
                f.f(lallaaaalllaaVar, "this$0");
                lallaaaalllaaVar.startActivity(new Intent(lallaaaalllaaVar, FindPassActivity.class));
                return;
        }
    }
}
