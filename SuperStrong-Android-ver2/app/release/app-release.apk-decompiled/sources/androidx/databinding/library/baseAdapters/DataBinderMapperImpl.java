package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.a;
import androidx.databinding.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1308a = new SparseIntArray(0);

    @Override // androidx.databinding.a
    public final List<a> a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.a
    public final ViewDataBinding b(b bVar, View view, int i6) {
        if (f1308a.get(i6) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
