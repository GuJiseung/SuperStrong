package k0;

import android.content.Context;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    public final int f4736i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4737j;

    /* renamed from: k  reason: collision with root package name */
    public final LayoutInflater f4738k;

    @Deprecated
    public c(Context context, int i6) {
        super(context);
        this.f4737j = i6;
        this.f4736i = i6;
        this.f4738k = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
