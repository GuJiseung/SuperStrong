package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f334b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f335c;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f335c = bVar;
        this.f334b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
        AlertController.b bVar = this.f335c;
        DialogInterface.OnClickListener onClickListener = bVar.f330h;
        AlertController alertController = this.f334b;
        onClickListener.onClick(alertController.f299b, i6);
        if (bVar.f331i) {
            return;
        }
        alertController.f299b.dismiss();
    }
}
