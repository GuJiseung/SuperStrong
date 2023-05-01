package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public final f f419b;

    /* renamed from: c  reason: collision with root package name */
    public int f420c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f421d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f422e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f423f;

    /* renamed from: g  reason: collision with root package name */
    public final int f424g;

    public e(f fVar, LayoutInflater layoutInflater, boolean z5, int i6) {
        this.f422e = z5;
        this.f423f = layoutInflater;
        this.f419b = fVar;
        this.f424g = i6;
        b();
    }

    public final void b() {
        f fVar = this.f419b;
        h hVar = fVar.f445v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f435j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6) == hVar) {
                    this.f420c = i6;
                    return;
                }
            }
        }
        this.f420c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final h getItem(int i6) {
        ArrayList<h> l5;
        boolean z5 = this.f422e;
        f fVar = this.f419b;
        if (z5) {
            fVar.i();
            l5 = fVar.f435j;
        } else {
            l5 = fVar.l();
        }
        int i7 = this.f420c;
        if (i7 >= 0 && i6 >= i7) {
            i6++;
        }
        return l5.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> l5;
        boolean z5 = this.f422e;
        f fVar = this.f419b;
        if (z5) {
            fVar.i();
            l5 = fVar.f435j;
        } else {
            l5 = fVar.l();
        }
        int i6 = this.f420c;
        int size = l5.size();
        if (i6 < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        int i7;
        boolean z5 = false;
        if (view == null) {
            view = this.f423f.inflate(this.f424g, viewGroup, false);
        }
        int i8 = getItem(i6).f452b;
        int i9 = i6 - 1;
        if (i9 >= 0) {
            i7 = getItem(i9).f452b;
        } else {
            i7 = i8;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f419b.m() && i8 != i7) {
            z5 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z5);
        k.a aVar = (k.a) view;
        if (this.f421d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
