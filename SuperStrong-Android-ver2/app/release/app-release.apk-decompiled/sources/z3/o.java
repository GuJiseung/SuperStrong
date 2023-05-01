package z3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
/* loaded from: classes.dex */
public abstract class o extends ViewDataBinding {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f7045x = 0;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f7046q;

    /* renamed from: r  reason: collision with root package name */
    public final ImageView f7047r;
    public final ImageView s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f7048t;
    public final TabLayout u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f7049v;

    /* renamed from: w  reason: collision with root package name */
    public final ViewPager2 f7050w;

    public o(Object obj, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TabLayout tabLayout, TextView textView2, ViewPager2 viewPager2) {
        super(obj, view, 0);
        this.f7046q = imageView;
        this.f7047r = imageView2;
        this.s = imageView3;
        this.f7048t = textView;
        this.u = tabLayout;
        this.f7049v = textView2;
        this.f7050w = viewPager2;
    }

    public abstract void x();
}
