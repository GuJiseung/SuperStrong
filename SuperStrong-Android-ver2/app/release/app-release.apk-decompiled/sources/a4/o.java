package a4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.r0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class o extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public z3.r V;
    public final g0 W = r0.b(this, l4.l.a(b4.r.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f201c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f201c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f202c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f202c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f203c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f203c.K().j();
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
        ((b4.r) this.W.a()).f2486g.e(n(), new m3.j(3, this));
        z3.r rVar = this.V;
        l4.f.c(rVar);
        ((Button) rVar.f7060d).setOnClickListener(new m3.c(9, this));
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_signup2, viewGroup, false);
        int i6 = R.id.confirm_button;
        Button button = (Button) c.a.k(inflate, R.id.confirm_button);
        if (button != null) {
            i6 = R.id.email;
            TextView textView = (TextView) c.a.k(inflate, R.id.email);
            if (textView != null) {
                i6 = R.id.emailedit;
                EditText editText = (EditText) c.a.k(inflate, R.id.emailedit);
                if (editText != null) {
                    i6 = R.id.ideditText;
                    EditText editText2 = (EditText) c.a.k(inflate, R.id.ideditText);
                    if (editText2 != null) {
                        i6 = R.id.idtext;
                        TextView textView2 = (TextView) c.a.k(inflate, R.id.idtext);
                        if (textView2 != null) {
                            i6 = R.id.input_error;
                            TextView textView3 = (TextView) c.a.k(inflate, R.id.input_error);
                            if (textView3 != null) {
                                i6 = R.id.num;
                                if (((TextView) c.a.k(inflate, R.id.num)) != null) {
                                    i6 = R.id.numedit;
                                    EditText editText3 = (EditText) c.a.k(inflate, R.id.numedit);
                                    if (editText3 != null) {
                                        i6 = R.id.passeditText;
                                        EditText editText4 = (EditText) c.a.k(inflate, R.id.passeditText);
                                        if (editText4 != null) {
                                            i6 = R.id.passeditText2;
                                            EditText editText5 = (EditText) c.a.k(inflate, R.id.passeditText2);
                                            if (editText5 != null) {
                                                i6 = R.id.passtext;
                                                if (((TextView) c.a.k(inflate, R.id.passtext)) != null) {
                                                    i6 = R.id.passtext2;
                                                    if (((TextView) c.a.k(inflate, R.id.passtext2)) != null) {
                                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                                        this.V = new z3.r(frameLayout, button, textView, editText, editText2, textView2, textView3, editText3, editText4, editText5);
                                                        return frameLayout;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }
}
