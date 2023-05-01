package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.superstrong.android.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f411b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f412c;

    /* renamed from: d  reason: collision with root package name */
    public f f413d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f414e;

    /* renamed from: f  reason: collision with root package name */
    public j.a f415f;

    /* renamed from: g  reason: collision with root package name */
    public a f416g;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f417b = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.f413d;
            h hVar = fVar.f445v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.f435j;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (arrayList.get(i6) == hVar) {
                        this.f417b = i6;
                        return;
                    }
                }
            }
            this.f417b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c */
        public final h getItem(int i6) {
            d dVar = d.this;
            f fVar = dVar.f413d;
            fVar.i();
            ArrayList<h> arrayList = fVar.f435j;
            dVar.getClass();
            int i7 = i6 + 0;
            int i8 = this.f417b;
            if (i8 >= 0 && i7 >= i8) {
                i7++;
            }
            return arrayList.get(i7);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.f413d;
            fVar.i();
            int size = fVar.f435j.size();
            dVar.getClass();
            int i6 = size + 0;
            if (this.f417b < 0) {
                return i6;
            }
            return i6 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.f412c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i6));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.f411b = context;
        this.f412c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z5) {
        j.a aVar = this.f415f;
        if (aVar != null) {
            aVar.a(fVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean c(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void e(Context context, f fVar) {
        if (this.f411b != null) {
            this.f411b = context;
            if (this.f412c == null) {
                this.f412c = LayoutInflater.from(context);
            }
        }
        this.f413d = fVar;
        a aVar = this.f416g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f414e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean h(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g(mVar);
        Context context = mVar.f426a;
        b.a aVar = new b.a(context);
        AlertController.b bVar = aVar.f337a;
        d dVar = new d(bVar.f323a);
        gVar.f450d = dVar;
        dVar.f415f = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.f450d;
        if (dVar2.f416g == null) {
            dVar2.f416g = new a();
        }
        bVar.f329g = dVar2.f416g;
        bVar.f330h = gVar;
        View view = mVar.f440o;
        if (view != null) {
            bVar.f327e = view;
        } else {
            bVar.f325c = mVar.f439n;
            bVar.f326d = mVar.f438m;
        }
        bVar.f328f = gVar;
        androidx.appcompat.app.b a6 = aVar.a();
        gVar.f449c = a6;
        a6.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.f449c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.f449c.show();
        j.a aVar2 = this.f415f;
        if (aVar2 != null) {
            aVar2.b(mVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(boolean z5) {
        a aVar = this.f416g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable k() {
        if (this.f414e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f414e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void l(j.a aVar) {
        this.f415f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j5) {
        this.f413d.q(this.f416g.getItem(i6), this, 0);
    }
}
