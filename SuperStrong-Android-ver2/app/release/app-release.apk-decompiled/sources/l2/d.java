package l2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f5118b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5119c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f5120d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5121e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i6, boolean z5) {
        this.f5121e = bottomAppBar;
        this.f5118b = actionMenuView;
        this.f5119c = i6;
        this.f5120d = z5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f5117a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z5;
        if (!this.f5117a) {
            BottomAppBar bottomAppBar = this.f5121e;
            int i6 = bottomAppBar.f2945e0;
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i6 != 0) {
                bottomAppBar.f2945e0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.m(i6);
            }
            bottomAppBar.D(this.f5118b, this.f5119c, this.f5120d, z5);
        }
    }
}
