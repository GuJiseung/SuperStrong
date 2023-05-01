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
public final class d extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public m.c V;
    public final g0 W = r0.b(this, l4.l.a(b4.e.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f172c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f172c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f172c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f173c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f173c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f173c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f174c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f174c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f174c.K().j();
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
        ((b4.e) this.W.a()).f2439d.e(n(), new m3.j(1, this));
        m.c cVar = this.V;
        l4.f.c(cVar);
        ((Button) cVar.f5161c).setOnClickListener(new m3.c(3, this));
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_chpasswd1, viewGroup, false);
        int i6 = R.id.current_pass;
        AppCompatEditText appCompatEditText = (AppCompatEditText) c.a.k(inflate, R.id.current_pass);
        if (appCompatEditText != null) {
            i6 = R.id.pass_check;
            Button button = (Button) c.a.k(inflate, R.id.pass_check);
            if (button != null) {
                i6 = R.id.wrong_text;
                TextView textView = (TextView) c.a.k(inflate, R.id.wrong_text);
                if (textView != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.V = new m.c(frameLayout, appCompatEditText, button, textView);
                    return frameLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
