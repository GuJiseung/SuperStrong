package i0;

import a1.f0;
import a4.n;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.lifecycle.t;
import com.google.android.material.tabs.d;
import com.superstrong.android.view.SignupActivity;
import f0.g;
import f0.g0;
import i0.j;
import z3.q;
import z3.r;
import z3.s;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements g, t, d.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4563a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4564b;

    public /* synthetic */ d(int i6, Object obj) {
        this.f4563a = i6;
        this.f4564b = obj;
    }

    @Override // androidx.lifecycle.t
    public final void a(Object obj) {
        TextView textView;
        TextView textView2;
        int i6 = this.f4563a;
        int i7 = 0;
        Object obj2 = this.f4564b;
        switch (i6) {
            case 1:
                a4.f fVar = (a4.f) obj2;
                Boolean bool = (Boolean) obj;
                int i8 = a4.f.X;
                l4.f.f(fVar, "this$0");
                l4.f.e(bool, "it");
                if (bool.booleanValue()) {
                    q qVar = fVar.V;
                    l4.f.c(qVar);
                    textView = qVar.f7055c;
                } else {
                    q qVar2 = fVar.V;
                    l4.f.c(qVar2);
                    textView = qVar2.f7055c;
                    i7 = 4;
                }
                textView.setVisibility(i7);
                return;
            case 2:
                a4.i iVar = (a4.i) obj2;
                y3.c cVar = (y3.c) obj;
                int i9 = a4.i.X;
                l4.f.f(iVar, "this$0");
                r rVar = iVar.V;
                l4.f.c(rVar);
                rVar.f7057a.setText(String.valueOf(f0.j(cVar.f6764d * 10000.0d) / 10000.0d));
                r rVar2 = iVar.V;
                l4.f.c(rVar2);
                rVar2.f7058b.setText(String.valueOf(f0.j(cVar.f6762b * 10000.0d) / 10000.0d));
                r rVar3 = iVar.V;
                l4.f.c(rVar3);
                rVar3.f7059c.setText(String.valueOf(f0.j(cVar.f6763c * 10000.0d) / 10000.0d));
                return;
            case 3:
                n nVar = (n) obj2;
                Boolean bool2 = (Boolean) obj;
                int i10 = n.X;
                l4.f.f(nVar, "this$0");
                l4.f.e(bool2, "it");
                if (bool2.booleanValue()) {
                    s sVar = nVar.V;
                    l4.f.c(sVar);
                    textView2 = sVar.f7071f;
                } else {
                    s sVar2 = nVar.V;
                    l4.f.c(sVar2);
                    textView2 = sVar2.f7071f;
                    i7 = 4;
                }
                textView2.setVisibility(i7);
                return;
            default:
                a4.j jVar = (a4.j) obj2;
                Boolean bool3 = (Boolean) obj;
                int i11 = SignupActivity.f3549z;
                l4.f.f(jVar, "$dialog");
                l4.f.e(bool3, "it");
                if (bool3.booleanValue()) {
                    jVar.show();
                    return;
                } else {
                    jVar.dismiss();
                    return;
                }
        }
    }

    public final boolean b(j jVar, int i6, Bundle bundle) {
        g.b cVar;
        View view = (View) this.f4564b;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 25 && (i6 & 1) != 0) {
            try {
                jVar.f4567a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) jVar.f4567a.b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
            }
        }
        ClipDescription a6 = jVar.f4567a.a();
        j.c cVar2 = jVar.f4567a;
        ClipData clipData = new ClipData(a6, new ClipData.Item(cVar2.c()));
        if (i7 >= 31) {
            cVar = new g.a(clipData, 2);
        } else {
            cVar = new g.c(clipData, 2);
        }
        cVar.a(cVar2.e());
        cVar.setExtras(bundle);
        if (g0.h(view, cVar.build()) == null) {
            return true;
        }
        return false;
    }
}
