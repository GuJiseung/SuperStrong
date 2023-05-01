package a4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.r0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class f extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public z3.q V;
    public final g0 W = r0.b(this, l4.l.a(b4.e.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f177c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f177c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f178c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f178c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f178c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f179c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f179c.K().j();
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
        l4.f.f(view, "view");
        ((b4.e) this.W.a()).f2442g.e(n(), new i0.d(1, this));
        z3.q qVar = this.V;
        l4.f.c(qVar);
        qVar.f7056d.setOnClickListener(new e(0, this));
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chpasswd2, viewGroup, false);
        int i6 = R.id.pass1;
        AppCompatEditText appCompatEditText = (AppCompatEditText) c.a.k(inflate, R.id.pass1);
        if (appCompatEditText != null) {
            i6 = R.id.pass2;
            AppCompatEditText appCompatEditText2 = (AppCompatEditText) c.a.k(inflate, R.id.pass2);
            if (appCompatEditText2 != null) {
                i6 = R.id.samepass;
                TextView textView = (TextView) c.a.k(inflate, R.id.samepass);
                if (textView != null) {
                    i6 = R.id.setpass;
                    Button button = (Button) c.a.k(inflate, R.id.setpass);
                    if (button != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        this.V = new z3.q(frameLayout, appCompatEditText, appCompatEditText2, textView, button);
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
