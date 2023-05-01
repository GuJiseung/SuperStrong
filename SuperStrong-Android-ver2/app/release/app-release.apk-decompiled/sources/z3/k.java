package z3;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class k extends j {

    /* renamed from: r  reason: collision with root package name */
    public static final SparseIntArray f7037r;

    /* renamed from: q  reason: collision with root package name */
    public long f7038q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7037r = sparseIntArray;
        sparseIntArray.put(R.id.imageView, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(androidx.databinding.b bVar, View view) {
        super(bVar, view);
        Object[] u = ViewDataBinding.u(view, 2, f7037r);
        ImageView imageView = (ImageView) u[1];
        this.f7038q = -1L;
        ((RelativeLayout) u[0]).setTag(null);
        view.setTag(R.id.dataBinding, this);
        synchronized (this) {
            this.f7038q = 1L;
        }
        v();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void q() {
        synchronized (this) {
            this.f7038q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean r() {
        synchronized (this) {
            return this.f7038q != 0;
        }
    }
}
