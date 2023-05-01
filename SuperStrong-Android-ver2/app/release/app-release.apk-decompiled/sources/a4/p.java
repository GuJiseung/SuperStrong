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
import z3.t;
/* loaded from: classes.dex */
public final class p extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public t V;
    public final g0 W = r0.b(this, l4.l.a(b4.r.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f204c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f204c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f204c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f205c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f205c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f205c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f206c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f206c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f206c.K().j();
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
        t tVar = this.V;
        l4.f.c(tVar);
        tVar.f7072a.setOnClickListener(new f3.a(4, this));
        t tVar2 = this.V;
        l4.f.c(tVar2);
        tVar2.f7073b.setOnClickListener(new e(5, this));
        P().f2490k.e(n(), new h(1, this));
    }

    public final b4.r P() {
        return (b4.r) this.W.a();
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_signup3, viewGroup, false);
        int i6 = R.id.cancel_button;
        Button button = (Button) c.a.k(inflate, R.id.cancel_button);
        if (button != null) {
            i6 = R.id.check;
            if (((TextView) c.a.k(inflate, R.id.check)) != null) {
                i6 = R.id.check2;
                if (((TextView) c.a.k(inflate, R.id.check2)) != null) {
                    i6 = R.id.confirm_button;
                    Button button2 = (Button) c.a.k(inflate, R.id.confirm_button);
                    if (button2 != null) {
                        i6 = R.id.email;
                        if (((TextView) c.a.k(inflate, R.id.email)) != null) {
                            i6 = R.id.email_edit;
                            EditText editText = (EditText) c.a.k(inflate, R.id.email_edit);
                            if (editText != null) {
                                i6 = R.id.notice;
                                if (((TextView) c.a.k(inflate, R.id.notice)) != null) {
                                    i6 = R.id.toolbar_line;
                                    if (c.a.k(inflate, R.id.toolbar_line) != null) {
                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                        this.V = new t(frameLayout, button, button2, editText);
                                        return frameLayout;
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
