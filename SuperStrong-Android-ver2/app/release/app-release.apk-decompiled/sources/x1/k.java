package x1;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
@Deprecated
/* loaded from: classes.dex */
public final class k extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public final x1.a f6672b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6673c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f6674d;

    /* renamed from: e  reason: collision with root package name */
    public com.bumptech.glide.l f6675e;

    /* renamed from: f  reason: collision with root package name */
    public k f6676f;

    /* renamed from: g  reason: collision with root package name */
    public Fragment f6677g;

    /* loaded from: classes.dex */
    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        x1.a aVar = new x1.a();
        this.f6673c = new a();
        this.f6674d = new HashSet();
        this.f6672b = aVar;
    }

    public final void a(Activity activity) {
        k kVar = this.f6676f;
        if (kVar != null) {
            kVar.f6674d.remove(this);
            this.f6676f = null;
        }
        l lVar = com.bumptech.glide.b.b(activity).f2796g;
        lVar.getClass();
        k d6 = lVar.d(activity.getFragmentManager());
        this.f6676f = d6;
        if (!equals(d6)) {
            this.f6676f.f6674d.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e6) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e6);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f6672b.c();
        k kVar = this.f6676f;
        if (kVar != null) {
            kVar.f6674d.remove(this);
            this.f6676f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        k kVar = this.f6676f;
        if (kVar != null) {
            kVar.f6674d.remove(this);
            this.f6676f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f6672b.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f6672b.e();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f6677g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
