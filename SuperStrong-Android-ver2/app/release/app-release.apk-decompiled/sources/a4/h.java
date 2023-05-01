package a4;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Toast;
import androidx.lifecycle.t;
import com.superstrong.android.view.ChpasswdActivity;
import com.superstrong.android.view.SignupActivity;
import com.superstrong.android.view.WalletActivity;
import com.superstrong.android.view.lallaaaalllaa;
/* loaded from: classes.dex */
public final /* synthetic */ class h implements t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f183a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f184b;

    public /* synthetic */ h(int i6, Object obj) {
        this.f183a = i6;
        this.f184b = obj;
    }

    @Override // androidx.lifecycle.t
    public final void a(Object obj) {
        String str;
        androidx.fragment.app.r f6;
        String str2;
        int i6 = this.f183a;
        Object obj2 = this.f184b;
        switch (i6) {
            case 0:
                ChpasswdActivity chpasswdActivity = (ChpasswdActivity) obj2;
                Boolean bool = (Boolean) obj;
                int i7 = ChpasswdActivity.f3532z;
                l4.f.f(chpasswdActivity, "this$0");
                l4.f.e(bool, "it");
                if (bool.booleanValue()) {
                    chpasswdActivity.startActivity(new Intent(chpasswdActivity, lallaaaalllaa.class));
                    chpasswdActivity.finish();
                    return;
                }
                return;
            case 1:
                p pVar = (p) obj2;
                Integer num = (Integer) obj;
                int i8 = p.X;
                l4.f.f(pVar, "this$0");
                Integer d6 = pVar.P().f2490k.d();
                if (d6 != null && d6.intValue() == 0) {
                    f6 = pVar.f();
                    str2 = "코드가 일치하지 않습니다.";
                } else {
                    Integer d7 = pVar.P().f2490k.d();
                    if (d7 != null && d7.intValue() == -1) {
                        f6 = pVar.f();
                        str2 = "서버와 통신 과정에서 문제가 발생했습니다..";
                    } else {
                        Integer d8 = pVar.P().f2490k.d();
                        if (d8 == null || d8.intValue() != 1) {
                            pVar.P().f2484e.j(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                }
                Toast.makeText(f6, str2, 0).show();
                return;
            case 2:
                SignupActivity signupActivity = (SignupActivity) obj2;
                Boolean bool2 = (Boolean) obj;
                int i9 = SignupActivity.f3549z;
                l4.f.f(signupActivity, "this$0");
                l4.f.e(bool2, "it");
                if (bool2.booleanValue()) {
                    signupActivity.startActivity(new Intent(signupActivity, lallaaaalllaa.class));
                    signupActivity.finish();
                    return;
                }
                return;
            default:
                final WalletActivity walletActivity = (WalletActivity) obj2;
                Integer num2 = (Integer) obj;
                int i10 = WalletActivity.f3559z;
                l4.f.f(walletActivity, "this$0");
                String[] strArr = {"서버와의 통신 과정에서 오류가 발생했습니다.", "", "토큰이 만료되었거나 부적절합니다."};
                AlertDialog.Builder builder = new AlertDialog.Builder(walletActivity);
                if (num2 != null && num2.intValue() == 2) {
                    builder.setTitle("지갑 조회 실패").setMessage(strArr[num2.intValue()]).setPositiveButton("돌아가기", new DialogInterface.OnClickListener() { // from class: a4.r
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = WalletActivity.f3559z;
                            WalletActivity walletActivity2 = WalletActivity.this;
                            l4.f.f(walletActivity2, "this$0");
                            walletActivity2.startActivity(new Intent(walletActivity2, lallaaaalllaa.class));
                            walletActivity2.finish();
                        }
                    });
                    builder.show();
                    return;
                }
                if (num2 != null && num2.intValue() == -1) {
                    str = "서버와의 통신이 원활하지 않습니다";
                } else if (num2 != null && num2.intValue() == 0) {
                    str = "현제 거래내역이 없습니다";
                } else {
                    return;
                }
                Toast.makeText(walletActivity, str, 0).show();
                return;
        }
    }
}
