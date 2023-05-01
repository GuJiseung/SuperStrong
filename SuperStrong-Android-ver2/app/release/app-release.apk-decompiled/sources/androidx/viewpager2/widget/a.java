package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a extends ViewPager2.e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2240a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i6) {
        try {
            Iterator it = this.f2240a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).a(i6);
            }
        } catch (ConcurrentModificationException e6) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void b(float f6, int i6, int i7) {
        try {
            Iterator it = this.f2240a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).b(f6, i6, i7);
            }
        } catch (ConcurrentModificationException e6) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i6) {
        try {
            Iterator it = this.f2240a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).c(i6);
            }
        } catch (ConcurrentModificationException e6) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e6);
        }
    }
}
