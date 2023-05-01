package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class MergedDataBinderMapper extends a {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f1289a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f1290b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f1291c = new CopyOnWriteArrayList();

    @Override // androidx.databinding.a
    public final ViewDataBinding b(b bVar, View view, int i6) {
        Iterator it = this.f1290b.iterator();
        while (it.hasNext()) {
            ViewDataBinding b6 = ((a) it.next()).b(bVar, view, i6);
            if (b6 != null) {
                return b6;
            }
        }
        if (d()) {
            return b(bVar, view, i6);
        }
        return null;
    }

    public final void c(a aVar) {
        if (this.f1289a.add(aVar.getClass())) {
            this.f1290b.add(aVar);
            for (a aVar2 : aVar.a()) {
                c(aVar2);
            }
        }
    }

    public final boolean d() {
        StringBuilder sb;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1291c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (a.class.isAssignableFrom(cls)) {
                    c((a) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z5 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e6) {
                e = e6;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            } catch (InstantiationException e7) {
                e = e7;
                sb = new StringBuilder("unable to add feature mapper for ");
                sb.append(str);
                Log.e("MergedDataBinderMapper", sb.toString(), e);
            }
        }
        return z5;
    }
}
