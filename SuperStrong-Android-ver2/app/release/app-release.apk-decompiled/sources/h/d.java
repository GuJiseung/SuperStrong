package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
/* loaded from: classes.dex */
public abstract class d implements f, j, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Rect f4374b;

    public static int o(androidx.appcompat.view.menu.e eVar, Context context, int i6) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = eVar.getCount();
        int i7 = 0;
        int i8 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = eVar.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = eVar.getView(i9, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i6) {
                return i6;
            }
            if (measuredWidth > i7) {
                i7 = measuredWidth;
            }
        }
        return i7;
    }

    public static boolean w(androidx.appcompat.view.menu.f fVar) {
        int size = fVar.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = fVar.getItem(i6);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    public abstract void n(androidx.appcompat.view.menu.f fVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
        androidx.appcompat.view.menu.e eVar;
        int i7;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            eVar = (androidx.appcompat.view.menu.e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            eVar = (androidx.appcompat.view.menu.e) listAdapter;
        }
        androidx.appcompat.view.menu.f fVar = eVar.f419b;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i6);
        if (!(this instanceof androidx.appcompat.view.menu.b)) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        fVar.q(menuItem, this, i7);
    }

    public abstract void p(View view);

    public abstract void q(boolean z5);

    public abstract void r(int i6);

    public abstract void s(int i6);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z5);

    public abstract void v(int i6);
}
