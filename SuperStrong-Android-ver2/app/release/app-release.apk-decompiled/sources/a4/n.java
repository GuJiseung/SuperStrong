package a4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.r0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.superstrong.android.R;
import z3.s;
/* loaded from: classes.dex */
public final class n extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public s V;
    public final g0 W = r0.b(this, l4.l.a(b4.r.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f198c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f198c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f198c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f199c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f199c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f199c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f200c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f200c.K().j();
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
        ((b4.r) this.W.a()).f2485f.e(n(), new i0.d(3, this));
        s sVar = this.V;
        l4.f.c(sVar);
        sVar.f7070e.setOnClickListener(new e(4, this));
        s sVar2 = this.V;
        l4.f.c(sVar2);
        sVar2.f7066a.setOnClickListener(new m3.c(8, this));
        s sVar3 = this.V;
        l4.f.c(sVar3);
        sVar3.f7067b.setOnClickListener(new f3.a(3, this));
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_signup1, viewGroup, false);
        int i6 = R.id.cancel_button;
        Button button = (Button) c.a.k(inflate, R.id.cancel_button);
        if (button != null) {
            i6 = R.id.confirm_button;
            Button button2 = (Button) c.a.k(inflate, R.id.confirm_button);
            if (button2 != null) {
                i6 = R.id.metamask_checkbox;
                CheckBox checkBox = (CheckBox) c.a.k(inflate, R.id.metamask_checkbox);
                if (checkBox != null) {
                    i6 = R.id.notice;
                    if (((TextView) c.a.k(inflate, R.id.notice)) != null) {
                        i6 = R.id.privacy_checkbox;
                        CheckBox checkBox2 = (CheckBox) c.a.k(inflate, R.id.privacy_checkbox);
                        if (checkBox2 != null) {
                            i6 = R.id.terms_checkbox;
                            CheckBox checkBox3 = (CheckBox) c.a.k(inflate, R.id.terms_checkbox);
                            if (checkBox3 != null) {
                                i6 = R.id.toolbar_line;
                                if (c.a.k(inflate, R.id.toolbar_line) != null) {
                                    i6 = R.id.unchecked;
                                    TextView textView = (TextView) c.a.k(inflate, R.id.unchecked);
                                    if (textView != null) {
                                        FrameLayout frameLayout = (FrameLayout) inflate;
                                        this.V = new s(frameLayout, button, button2, checkBox, checkBox2, checkBox3, textView);
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
