package b4;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.superstrong.android.view.PaymentActivity;
import com.superstrong.android.view.PaymentActivity2;
import com.superstrong.android.view.lallaaaalllaa;
import g5.b0;
import v4.d0;
/* loaded from: classes.dex */
public final class l implements g5.d<q3.q> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2471a;

    public l(PaymentActivity paymentActivity) {
        this.f2471a = paymentActivity;
    }

    @Override // g5.d
    public final void a(g5.b<q3.q> bVar, Throwable th) {
        l4.f.f(bVar, "call");
        l4.f.f(th, "t");
        Toast.makeText(this.f2471a, "통신 실패: PaymentVModel", 0).show();
    }

    @Override // g5.d
    public final void b(g5.b<q3.q> bVar, b0<q3.q> b0Var) {
        String str;
        l4.f.f(bVar, "call");
        l4.f.f(b0Var, "response");
        boolean a6 = b0Var.a();
        Context context = this.f2471a;
        if (a6) {
            q3.q qVar = b0Var.f4212b;
            String nVar = qVar != null ? qVar.toString() : null;
            Log.i("리스폰스 (Payment1)", "reponse:" + nVar);
            String b6 = ((q3.q) new q3.j().b(nVar)).c("e2e_res").b();
            String str2 = b.f2431a;
            l4.f.e(b6, "data");
            String a7 = b.a(b6);
            Log.i("rww", "decoded_data:".concat(a7));
            q3.q qVar2 = (q3.q) new q3.j().b(a7);
            Log.i("rww", "jsonObject2:" + qVar2);
            if (!l4.f.a(qVar2.c("res").b(), "0")) {
                if (l4.f.a(qVar2.c("res").b(), "2")) {
                    Toast.makeText(context, "토큰이 유효하지 않습니다.", 0).show();
                    context.startActivity(new Intent(context, lallaaaalllaa.class));
                    return;
                }
                Intent intent = new Intent(context, PaymentActivity2.class);
                intent.putExtra("calculated_gas", qVar2.c("calculated_gas").a());
                intent.putExtra("send_amount", qVar2.c("send_amount").a());
                intent.putExtra("coin_name", qVar2.c("coin_name").b());
                intent.putExtra("to_address", qVar2.c("to_address").b());
                intent.putExtra("remain_amount", qVar2.c("remain_amount").a());
                context.startActivity(intent);
                return;
            }
            str = "송금에 실패했습니다.";
        } else {
            d0 d0Var = b0Var.f4213c;
            if (d0Var != null) {
                d0Var.toString();
            }
            str = "response 실패!!";
        }
        Toast.makeText(context, str, 0).show();
    }
}
