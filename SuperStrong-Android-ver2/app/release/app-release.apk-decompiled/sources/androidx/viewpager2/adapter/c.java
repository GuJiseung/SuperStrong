package androidx.viewpager2.adapter;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FragmentStateAdapter f2204b;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.f2204b = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f2204b;
        fragmentStateAdapter.f2185i = false;
        fragmentStateAdapter.n();
    }
}
