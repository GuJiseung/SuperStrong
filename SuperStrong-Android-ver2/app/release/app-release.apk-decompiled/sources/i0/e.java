package i0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import i0.j;
/* loaded from: classes.dex */
public final class e extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f4565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InputConnection inputConnection, d dVar) {
        super(inputConnection, false);
        this.f4565a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i6, Bundle bundle) {
        j jVar;
        if (inputContentInfo == null || Build.VERSION.SDK_INT < 25) {
            jVar = null;
        } else {
            jVar = new j(new j.a(inputContentInfo));
        }
        if (((d) this.f4565a).b(jVar, i6, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i6, bundle);
    }
}
