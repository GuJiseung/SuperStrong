package l2;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
/* loaded from: classes.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5113a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f5114b;

    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f5114b;
            int i6 = BottomAppBar.f2940h0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i6) {
        this.f5114b = bottomAppBar;
        this.f5113a = i6;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f5114b.A(this.f5113a));
        floatingActionButton.k(new a(), true);
    }
}
