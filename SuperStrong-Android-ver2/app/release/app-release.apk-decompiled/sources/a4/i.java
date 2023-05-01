package a4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.r0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.o {
    public static final /* synthetic */ int X = 0;
    public z3.r V;
    public final g0 W = r0.b(this, l4.l.a(b4.h.class), new a(this), new b(this), new c(this));

    /* loaded from: classes.dex */
    public static final class a extends l4.g implements k4.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.fragment.app.o oVar) {
            super(0);
            this.f185c = oVar;
        }

        @Override // k4.a
        public final k0 a() {
            k0 t5 = this.f185c.K().t();
            l4.f.e(t5, "requireActivity().viewModelStore");
            return t5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l4.g implements k4.a<u0.a> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.fragment.app.o oVar) {
            super(0);
            this.f186c = oVar;
        }

        @Override // k4.a
        public final u0.a a() {
            return this.f186c.K().k();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l4.g implements k4.a<i0.b> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.o f187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.o oVar) {
            super(0);
            this.f187c = oVar;
        }

        @Override // k4.a
        public final i0.b a() {
            i0.b j5 = this.f187c.K().j();
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
        z3.r rVar = this.V;
        l4.f.c(rVar);
        rVar.f7057a.setText("0");
        z3.r rVar2 = this.V;
        l4.f.c(rVar2);
        rVar2.f7058b.setText("0");
        z3.r rVar3 = this.V;
        l4.f.c(rVar3);
        rVar3.f7059c.setText("0");
        ((b4.h) this.W.a()).f2461d.e(n(), new i0.d(2, this));
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l4.f.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_coinlist, viewGroup, false);
        int i6 = R.id.coin_balance1;
        TextView textView = (TextView) c.a.k(inflate, R.id.coin_balance1);
        if (textView != null) {
            i6 = R.id.coin_balance2;
            TextView textView2 = (TextView) c.a.k(inflate, R.id.coin_balance2);
            if (textView2 != null) {
                i6 = R.id.coin_balance3;
                TextView textView3 = (TextView) c.a.k(inflate, R.id.coin_balance3);
                if (textView3 != null) {
                    i6 = R.id.coin_layout1;
                    LinearLayout linearLayout = (LinearLayout) c.a.k(inflate, R.id.coin_layout1);
                    if (linearLayout != null) {
                        i6 = R.id.coin_layout2;
                        LinearLayout linearLayout2 = (LinearLayout) c.a.k(inflate, R.id.coin_layout2);
                        if (linearLayout2 != null) {
                            i6 = R.id.coin_layout3;
                            LinearLayout linearLayout3 = (LinearLayout) c.a.k(inflate, R.id.coin_layout3);
                            if (linearLayout3 != null) {
                                i6 = R.id.coin_name1;
                                if (((TextView) c.a.k(inflate, R.id.coin_name1)) != null) {
                                    i6 = R.id.coin_name2;
                                    if (((TextView) c.a.k(inflate, R.id.coin_name2)) != null) {
                                        i6 = R.id.coin_name3;
                                        if (((TextView) c.a.k(inflate, R.id.coin_name3)) != null) {
                                            i6 = R.id.toolbar_line1;
                                            View k5 = c.a.k(inflate, R.id.toolbar_line1);
                                            if (k5 != null) {
                                                i6 = R.id.toolbar_line2;
                                                View k6 = c.a.k(inflate, R.id.toolbar_line2);
                                                if (k6 != null) {
                                                    i6 = R.id.toolbar_line3;
                                                    View k7 = c.a.k(inflate, R.id.toolbar_line3);
                                                    if (k7 != null) {
                                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                        this.V = new z3.r(nestedScrollView, textView, textView2, textView3, linearLayout, linearLayout2, linearLayout3, k5, k6, k7);
                                                        return nestedScrollView;
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
