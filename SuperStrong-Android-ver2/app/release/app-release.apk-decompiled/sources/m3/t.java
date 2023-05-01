package m3;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.v0;
/* loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f5341b;

    public t(u uVar) {
        this.f5341b = uVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
        Object item;
        int selectedItemPosition;
        View view2 = null;
        u uVar = this.f5341b;
        if (i6 < 0) {
            v0 v0Var = uVar.f5342f;
            if (!v0Var.b()) {
                item = null;
            } else {
                item = v0Var.f956d.getSelectedItem();
            }
        } else {
            item = uVar.getAdapter().getItem(i6);
        }
        u.a(uVar, item);
        AdapterView.OnItemClickListener onItemClickListener = uVar.getOnItemClickListener();
        v0 v0Var2 = uVar.f5342f;
        if (onItemClickListener != null) {
            if (view == null || i6 < 0) {
                if (v0Var2.b()) {
                    view2 = v0Var2.f956d.getSelectedView();
                }
                view = view2;
                if (!v0Var2.b()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = v0Var2.f956d.getSelectedItemPosition();
                }
                i6 = selectedItemPosition;
                if (!v0Var2.b()) {
                    j5 = Long.MIN_VALUE;
                } else {
                    j5 = v0Var2.f956d.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(v0Var2.f956d, view, i6, j5);
        }
        v0Var2.dismiss();
    }
}
