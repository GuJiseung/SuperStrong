package z2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f6974a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f6975b = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f6976c = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f6975b == animator) {
                iVar.f6975b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6976c);
        this.f6974a.add(bVar);
    }
}
