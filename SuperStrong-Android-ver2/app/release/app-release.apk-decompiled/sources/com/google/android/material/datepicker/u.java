package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class u<S> extends a0<S> {
    public int W;
    public d<S> X;
    public com.google.android.material.datepicker.a Y;

    /* loaded from: classes.dex */
    public class a extends z<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.z
        public final void a(S s) {
            Iterator<z<S>> it = u.this.V.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.o
    public final void E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.W);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.X);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Y);
    }

    @Override // androidx.fragment.app.o
    public final void y(Bundle bundle) {
        super.y(bundle);
        if (bundle == null) {
            bundle = this.f1572g;
        }
        this.W = bundle.getInt("THEME_RES_ID_KEY");
        this.X = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.Y = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.o
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.W));
        d<S> dVar = this.X;
        new a();
        return dVar.j();
    }
}
