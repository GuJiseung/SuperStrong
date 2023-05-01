package b4;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.superstrong.android.view.PaymentActivity2;
import com.superstrong.android.view.PaymentActivity3;
import com.superstrong.android.view.lallaaaalllaa;
import g5.b0;
import v4.d0;
/* loaded from: classes.dex */
public final class m implements g5.d<q3.q> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2472a;

    public m(PaymentActivity2 paymentActivity2) {
        this.f2472a = paymentActivity2;
    }

    @Override // g5.d
    public final void a(g5.b<q3.q> bVar, Throwable th) {
        l4.f.f(bVar, "call");
        l4.f.f(th, "t");
        Toast.makeText(this.f2472a, "통신 실패: PaymentVModel2", 0).show();
    }

    @Override // g5.d
    public final void b(g5.b<q3.q> bVar, b0<q3.q> b0Var) {
        Intent intent;
        l4.f.f(bVar, "call");
        l4.f.f(b0Var, "response");
        boolean a6 = b0Var.a();
        Context context = this.f2472a;
        if (!a6) {
            d0 d0Var = b0Var.f4213c;
            if (d0Var != null) {
                d0Var.toString();
            }
            Toast.makeText(context, "송금에 실패했습니다.", 0).show();
            return;
        }
        q3.q qVar = b0Var.f4212b;
        String nVar = qVar != null ? qVar.toString() : null;
        String b6 = ((q3.q) new q3.j().b(nVar)).c("e2e_res").b();
        Log.i("rww", "data:" + b6);
        Log.i("리스폰스 (Payment2)", "reponse:" + nVar);
        String str = b.f2431a;
        l4.f.e(b6, "data");
        String a7 = b.a(b6);
        Log.i("rww", "decoded_data:".concat(a7));
        q3.q qVar2 = (q3.q) new q3.j().b(a7);
        Log.i("rww", "jsonObject2:" + qVar2);
        Log.i("리스폰스", "reponse:" + nVar);
        if (l4.f.a(qVar2.c("res").b(), "0") || qVar2.c("res").b() == null) {
            Toast.makeText(context, "송금에 실패했습니다.", 0).show();
        } else {
            if (l4.f.a(qVar2.c("res").b(), "2")) {
                Toast.makeText(context, "유효하지 않은 토큰입니다.", 0).show();
                intent = new Intent(context, lallaaaalllaa.class);
            } else {
                intent = new Intent(context, PaymentActivity3.class);
            }
            context.startActivity(intent);
        }
        Log.i("리스폰스", "reponse:" + nVar);
    }
}
