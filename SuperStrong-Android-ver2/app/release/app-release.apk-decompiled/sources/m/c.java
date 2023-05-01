package m;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5159a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5160b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5161c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5162d;

    public c(int i6) {
        if (i6 != 1) {
            this.f5159a = new e();
            this.f5160b = new e();
            this.f5161c = new e();
            this.f5162d = new h[32];
            return;
        }
        this.f5159a = new e0.e(10);
        this.f5160b = new l.h();
        this.f5161c = new ArrayList();
        this.f5162d = new HashSet();
    }

    public /* synthetic */ c(FrameLayout frameLayout, AppCompatEditText appCompatEditText, Button button, TextView textView) {
        this.f5159a = frameLayout;
        this.f5160b = appCompatEditText;
        this.f5161c = button;
        this.f5162d = textView;
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((l.h) this.f5160b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    a(arrayList2.get(i6), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
