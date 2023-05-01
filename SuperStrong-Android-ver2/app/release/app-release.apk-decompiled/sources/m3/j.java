package m3;

import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.b0;
import com.superstrong.android.R;
import com.superstrong.android.view.ChpasswdActivity;
import com.superstrong.android.view.SignupActivity;
import com.superstrong.android.view.WalletActivity;
/* loaded from: classes.dex */
public final /* synthetic */ class j implements g0.d, androidx.lifecycle.t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5287a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5288b;

    public /* synthetic */ j(int i6, Object obj) {
        this.f5287a = i6;
        this.f5288b = obj;
    }

    @Override // androidx.lifecycle.t
    public final void a(Object obj) {
        TextView textView;
        androidx.fragment.app.o gVar;
        androidx.fragment.app.o qVar;
        int i6 = this.f5287a;
        int i7 = 0;
        Object obj2 = this.f5288b;
        switch (i6) {
            case 1:
                a4.d dVar = (a4.d) obj2;
                Integer num = (Integer) obj;
                int i8 = a4.d.X;
                l4.f.f(dVar, "this$0");
                if (num != null && num.intValue() == 1) {
                    m.c cVar = dVar.V;
                    l4.f.c(cVar);
                    textView = (TextView) cVar.f5162d;
                } else {
                    m.c cVar2 = dVar.V;
                    l4.f.c(cVar2);
                    textView = (TextView) cVar2.f5162d;
                    i7 = 4;
                }
                textView.setVisibility(i7);
                return;
            case 2:
                ChpasswdActivity chpasswdActivity = (ChpasswdActivity) obj2;
                Integer num2 = (Integer) obj;
                int i9 = ChpasswdActivity.f3532z;
                l4.f.f(chpasswdActivity, "this$0");
                b0 z5 = chpasswdActivity.z();
                z5.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(z5);
                if (num2 != null && num2.intValue() == 1) {
                    gVar = new a4.d();
                } else if (num2 != null && num2.intValue() == 2) {
                    gVar = new a4.f();
                } else if (num2 != null && num2.intValue() == 3) {
                    gVar = new a4.g();
                } else {
                    chpasswdActivity.finish();
                    return;
                }
                aVar.f(R.id.frameLayout, gVar, null, 2);
                aVar.d(false);
                return;
            case 3:
                a4.o oVar = (a4.o) obj2;
                Integer num3 = (Integer) obj;
                int i10 = a4.o.X;
                l4.f.f(oVar, "this$0");
                Integer d6 = ((b4.r) oVar.W.a()).f2486g.d();
                l4.f.c(d6);
                int intValue = d6.intValue();
                String[] strArr = {"", "이미 가입된 아이디가 있습니다.", "이미 가입된 유저입니다.", "이미 가입된 유저입니다.", "이미 가입된 유저입니다.", "인증이 끝나지 않은 유저입니다.", "비어있는 항목이 있습니다.", "비밀번호가 일치하지 않습니다.", "서버와 통신과정에서 문제가 발생했습니다."};
                if (intValue != 0) {
                    Toast.makeText(oVar.f(), strArr[intValue], 0).show();
                    return;
                }
                return;
            case 4:
                SignupActivity signupActivity = (SignupActivity) obj2;
                Integer num4 = (Integer) obj;
                int i11 = SignupActivity.f3549z;
                l4.f.f(signupActivity, "this$0");
                b0 z6 = signupActivity.z();
                z6.getClass();
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(z6);
                if (num4 != null && num4.intValue() == 1) {
                    qVar = new a4.n();
                } else if (num4 != null && num4.intValue() == 2) {
                    qVar = new a4.o();
                } else if (num4 != null && num4.intValue() == 3) {
                    qVar = new a4.p();
                } else if (num4 != null && num4.intValue() == 4) {
                    qVar = new a4.q();
                } else {
                    signupActivity.finish();
                    return;
                }
                aVar2.f(R.id.frameLayout, qVar, null, 2);
                aVar2.d(false);
                return;
            default:
                a4.j jVar = (a4.j) obj2;
                Boolean bool = (Boolean) obj;
                int i12 = WalletActivity.f3559z;
                l4.f.f(jVar, "$dialog");
                l4.f.e(bool, "it");
                if (bool.booleanValue()) {
                    jVar.show();
                    return;
                } else {
                    jVar.dismiss();
                    return;
                }
        }
    }
}
