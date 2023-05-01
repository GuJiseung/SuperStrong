package k0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.activity.j;
import k0.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: h  reason: collision with root package name */
    public k0.b f4732h;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4727c = true;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f4728d = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4726b = false;

    /* renamed from: e  reason: collision with root package name */
    public int f4729e = -1;

    /* renamed from: f  reason: collision with root package name */
    public C0055a f4730f = new C0055a();

    /* renamed from: g  reason: collision with root package name */
    public b f4731g = new b();

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0055a extends ContentObserver {
        public C0055a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z5) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f4727c && (cursor = aVar.f4728d) != null && !cursor.isClosed()) {
                aVar.f4726b = aVar.f4728d.requery();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f4726b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f4726b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f4728d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0055a c0055a = this.f4730f;
                if (c0055a != null) {
                    cursor2.unregisterContentObserver(c0055a);
                }
                b bVar = this.f4731g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f4728d = cursor;
            if (cursor != null) {
                C0055a c0055a2 = this.f4730f;
                if (c0055a2 != null) {
                    cursor.registerContentObserver(c0055a2);
                }
                b bVar2 = this.f4731g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f4729e = cursor.getColumnIndexOrThrow("_id");
                this.f4726b = true;
                notifyDataSetChanged();
            } else {
                this.f4729e = -1;
                this.f4726b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f4726b || (cursor = this.f4728d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        if (this.f4726b) {
            this.f4728d.moveToPosition(i6);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.f4738k.inflate(cVar.f4737j, viewGroup, false);
            }
            b(view, this.f4728d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4732h == null) {
            this.f4732h = new k0.b(this);
        }
        return this.f4732h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        Cursor cursor;
        if (!this.f4726b || (cursor = this.f4728d) == null) {
            return null;
        }
        cursor.moveToPosition(i6);
        return this.f4728d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        Cursor cursor;
        if (this.f4726b && (cursor = this.f4728d) != null && cursor.moveToPosition(i6)) {
            return this.f4728d.getLong(this.f4729e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (this.f4726b) {
            if (this.f4728d.moveToPosition(i6)) {
                if (view == null) {
                    view = e(viewGroup);
                }
                b(view, this.f4728d);
                return view;
            }
            throw new IllegalStateException(j.a("couldn't move cursor to position ", i6));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
