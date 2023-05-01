package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.y;
/* loaded from: classes.dex */
public final class x extends s0 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ y.g f988k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ y f989l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, View view, y.g gVar) {
        super(view);
        this.f989l = yVar;
        this.f988k = gVar;
    }

    @Override // androidx.appcompat.widget.s0
    public final h.f b() {
        return this.f988k;
    }

    @Override // androidx.appcompat.widget.s0
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        y yVar = this.f989l;
        if (!yVar.getInternalPopup().b()) {
            yVar.f1000g.m(y.c.b(yVar), y.c.a(yVar));
            return true;
        }
        return true;
    }
}
