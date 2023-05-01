package b4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;
import com.superstrong.android.view.WalletActivity;
import com.superstrong.android.view.lallaaaalllaa;
import g5.b0;
import org.json.JSONObject;
import v4.d0;
/* loaded from: classes.dex */
public final class i implements g5.d<q3.q> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f2467b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2468c;

    public i(lallaaaalllaa lallaaaalllaaVar, SharedPreferences sharedPreferences, String str) {
        this.f2466a = lallaaaalllaaVar;
        this.f2467b = sharedPreferences;
        this.f2468c = str;
    }

    @Override // g5.d
    public final void a(g5.b<q3.q> bVar, Throwable th) {
        l4.f.f(bVar, "call");
        l4.f.f(th, "t");
        Toast.makeText(this.f2466a, "통신 실패", 0).show();
    }

    @Override // g5.d
    public final void b(g5.b<q3.q> bVar, b0<q3.q> b0Var) {
        String str;
        l4.f.f(bVar, "call");
        l4.f.f(b0Var, "response");
        boolean a6 = b0Var.a();
        Context context = this.f2466a;
        if (a6) {
            q3.q qVar = b0Var.f4212b;
            String nVar = qVar != null ? qVar.toString() : null;
            Log.i("rww", "response" + nVar);
            q3.q qVar2 = (q3.q) new q3.j().b(nVar);
            Log.i("rww", "json0bject:" + qVar2);
            String b6 = qVar2.c("e2e_res").b();
            Log.i("rww", "data:" + b6);
            byte[] bArr = a.f2430a;
            l4.f.e(b6, "data");
            String a7 = a.a(b6);
            Log.i("rww", "decoded_data:".concat(a7));
            q3.q qVar3 = (q3.q) new q3.j().b(a7);
            Log.i("rww", "jsonObject2:" + qVar3);
            if (!l4.f.a(qVar3.c("token").b(), "login failed")) {
                SharedPreferences sharedPreferences = this.f2467b;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("jwt_token", new JSONObject(a7).getString("token"));
                String str2 = this.f2468c;
                edit.putString("ID", str2);
                edit.apply();
                if (!l4.f.a(str2, sharedPreferences.getString("key_id", ""))) {
                    Log.i("kkkkkkkkkkkkkkkkkkkkkkkkkkkkeykeyekyeykeykeye", "require key");
                }
                context.startActivity(new Intent(context, WalletActivity.class));
                return;
            }
            str = "로그인이 실패했습니다.";
        } else {
            d0 d0Var = b0Var.f4213c;
            if (d0Var != null) {
                d0Var.toString();
            }
            str = "응답이 없습니다";
        }
        Toast.makeText(context, str, 0).show();
    }
}
