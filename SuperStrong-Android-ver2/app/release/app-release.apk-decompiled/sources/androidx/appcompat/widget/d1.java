package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.superstrong.android.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class d1 extends k0.c implements View.OnClickListener {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f742y = 0;

    /* renamed from: l  reason: collision with root package name */
    public final SearchView f743l;

    /* renamed from: m  reason: collision with root package name */
    public final SearchableInfo f744m;

    /* renamed from: n  reason: collision with root package name */
    public final Context f745n;

    /* renamed from: o  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f746o;

    /* renamed from: p  reason: collision with root package name */
    public final int f747p;

    /* renamed from: q  reason: collision with root package name */
    public int f748q;

    /* renamed from: r  reason: collision with root package name */
    public ColorStateList f749r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int f750t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public int f751v;

    /* renamed from: w  reason: collision with root package name */
    public int f752w;

    /* renamed from: x  reason: collision with root package name */
    public int f753x;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f754a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f755b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f756c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f757d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f758e;

        public a(View view) {
            this.f754a = (TextView) view.findViewById(16908308);
            this.f755b = (TextView) view.findViewById(16908309);
            this.f756c = (ImageView) view.findViewById(16908295);
            this.f757d = (ImageView) view.findViewById(16908296);
            this.f758e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public d1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f748q = 1;
        this.s = -1;
        this.f750t = -1;
        this.u = -1;
        this.f751v = -1;
        this.f752w = -1;
        this.f753x = -1;
        this.f743l = searchView;
        this.f744m = searchableInfo;
        this.f747p = searchView.getSuggestionCommitIconResId();
        this.f745n = context;
        this.f746o = weakHashMap;
    }

    public static String i(Cursor cursor, int i6) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e6);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    @Override // k0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.b(android.view.View, android.database.Cursor):void");
    }

    @Override // k0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.s = cursor.getColumnIndex("suggest_text_1");
                this.f750t = cursor.getColumnIndex("suggest_text_2");
                this.u = cursor.getColumnIndex("suggest_text_2_url");
                this.f751v = cursor.getColumnIndex("suggest_icon_1");
                this.f752w = cursor.getColumnIndex("suggest_icon_2");
                this.f753x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e6);
        }
    }

    @Override // k0.a
    public final String d(Cursor cursor) {
        String i6;
        String i7;
        if (cursor == null) {
            return null;
        }
        String i8 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i8 != null) {
            return i8;
        }
        SearchableInfo searchableInfo = this.f744m;
        if (searchableInfo.shouldRewriteQueryFromData() && (i7 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i7;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i6 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i6;
    }

    @Override // k0.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f4738k.inflate(this.f4736i, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f747p);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f745n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // k0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View inflate = this.f4738k.inflate(this.f4737j, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f754a.setText(e6.toString());
            }
            return inflate;
        }
    }

    @Override // k0.a, android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View e7 = e(viewGroup);
            ((a) e7.getTag()).f754a.setText(e6.toString());
            return e7;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f745n.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f4728d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4728d;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f743l.p((CharSequence) tag);
        }
    }
}
