package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public final class u0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v0 f952b;

    public u0(v0 v0Var) {
        this.f952b = v0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j5) {
        q0 q0Var;
        if (i6 == -1 || (q0Var = this.f952b.f956d) == null) {
            return;
        }
        q0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
