package a4;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.r0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.superstrong.android.R;
import z3.u;
/* loaded from: classes.dex */
public final class q extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public u V;
    public final g0 W = r0.b(this, l4.l.a(b4.r.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f207c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f207c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f208c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f208c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f208c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f209c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f209c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f209c.K().j();
            l4.f.e(j5, "requireActivity().defaultViewModelProviderFactory");
            return j5;
        }
    }

    @Override // androidx.fragment.app.o
    public final void B() {
        this.D = true;
        this.V = null;
    }

    @Override // androidx.fragment.app.o
    public final void H(View view) {
        SharedPreferences sharedPreferences;
        l4.f.f(view, "view");
        u uVar = this.V;
        l4.f.c(uVar);
        b4.r P = P();
        l4.f.c(P);
        l4.f.c(P.f2489j);
        uVar.f7076b.setText("환영합니다. null님");
        androidx.fragment.app.r f6 = f();
        if (f6 != null) {
            sharedPreferences = f6.getSharedPreferences("strong", 0);
        } else {
            sharedPreferences = null;
        }
        l4.f.c(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l4.f.c(P().f2489j);
        edit.putString("id", null);
        l4.f.c(P().f2489j);
        edit.putString("key", null);
        l4.f.c(P().f2489j);
        edit.putString("pub_ad", null);
        l4.f.c(P().f2489j);
        edit.putString("key_id", null);
        edit.apply();
        u uVar2 = this.V;
        l4.f.c(uVar2);
        uVar2.f7075a.setOnClickListener(new f3.a(5, this));
    }

    public final b4.r P() {
        return (b4.r) this.W.a();
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_signup4, viewGroup, false);
        int i6 = R.id.confirm_button;
        Button button = (Button) c.a.k(inflate, R.id.confirm_button);
        if (button != null) {
            i6 = R.id.notice;
            if (((TextView) c.a.k(inflate, R.id.notice)) != null) {
                i6 = R.id.toolbar_line;
                if (c.a.k(inflate, R.id.toolbar_line) != null) {
                    i6 = R.id.welcome;
                    TextView textView = (TextView) c.a.k(inflate, R.id.welcome);
                    if (textView != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        this.V = new u(frameLayout, button, textView);
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
