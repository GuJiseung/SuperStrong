package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public class e extends Dialog implements o, i {

    /* renamed from: b  reason: collision with root package name */
    public p f272b;

    /* renamed from: c  reason: collision with root package name */
    public final OnBackPressedDispatcher f273c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i6) {
        super(context, i6);
        l4.f.f(context, "context");
        this.f273c = new OnBackPressedDispatcher(new b(1, this));
    }

    public static void c(e eVar) {
        l4.f.f(eVar, "this$0");
        super.onBackPressed();
    }

    @Override // androidx.activity.i
    public final OnBackPressedDispatcher a() {
        return this.f273c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l4.f.f(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    public final void e() {
        Window window = getWindow();
        l4.f.c(window);
        window.getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        l4.f.c(window2);
        View decorView = window2.getDecorView();
        l4.f.e(decorView, "window!!.decorView");
        k.m(decorView, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f273c.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackPressedDispatcher onBackPressedDispatcher = this.f273c;
            onBackPressedDispatcher.f258e = onBackInvokedDispatcher;
            onBackPressedDispatcher.c();
        }
        p pVar = this.f272b;
        if (pVar == null) {
            pVar = new p(this);
            this.f272b = pVar;
        }
        pVar.f(j.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        p pVar = this.f272b;
        if (pVar == null) {
            pVar = new p(this);
            this.f272b = pVar;
        }
        pVar.f(j.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        p pVar = this.f272b;
        if (pVar == null) {
            pVar = new p(this);
            this.f272b = pVar;
        }
        pVar.f(j.b.ON_DESTROY);
        this.f272b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        e();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        l4.f.f(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l4.f.f(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.o
    public final p v() {
        p pVar = this.f272b;
        if (pVar == null) {
            p pVar2 = new p(this);
            this.f272b = pVar2;
            return pVar2;
        }
        return pVar;
    }
}
