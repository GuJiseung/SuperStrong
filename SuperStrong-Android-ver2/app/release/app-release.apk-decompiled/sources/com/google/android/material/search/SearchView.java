package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.k;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.superstrong.android.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class SearchView extends FrameLayout implements CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public SearchBar f3274b;

    /* renamed from: c  reason: collision with root package name */
    public int f3275c;

    /* renamed from: d  reason: collision with root package name */
    public c f3276d;

    /* loaded from: classes.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            boolean z5;
            SearchView searchView2 = searchView;
            if (searchView2.f3274b != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 && (view instanceof SearchBar)) {
                searchView2.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends l0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0027a();

        /* renamed from: d  reason: collision with root package name */
        public String f3277d;

        /* renamed from: e  reason: collision with root package name */
        public int f3278e;

        public a() {
            throw null;
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3277d = parcel.readString();
            this.f3278e = parcel.readInt();
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeString(this.f3277d);
            parcel.writeInt(this.f3278e);
        }

        /* renamed from: com.google.android.material.search.SearchView$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0027a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new a[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        HIDING,
        /* JADX INFO: Fake field, exist only in values array */
        HIDDEN,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWING,
        /* JADX INFO: Fake field, exist only in values array */
        SHOWN
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f3274b;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z5) {
        throw null;
    }

    private void setUpBackgroundViewElevationOverlay(float f6) {
    }

    private void setUpHeaderLayout(int i6) {
        if (i6 == -1) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(i6, (ViewGroup) null, false);
        throw null;
    }

    private void setUpStatusBarSpacer(int i6) {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public c getCurrentTransitionState() {
        return this.f3276d;
    }

    public EditText getEditText() {
        return null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public TextView getSearchPrefix() {
        return null;
    }

    public CharSequence getSearchPrefixText() {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f3275c;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        throw null;
    }

    public Toolbar getToolbar() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.o(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f3275c = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z5;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f5073b);
        setText(aVar.f3277d);
        if (aVar.f3278e == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        setVisible(z5);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            Editable text = getText();
            if (text != null) {
                text.toString();
            }
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void setAnimatedNavigationIcon(boolean z5) {
    }

    public void setAutoShowKeyboard(boolean z5) {
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        setUpBackgroundViewElevationOverlay(f6);
    }

    public void setHint(int i6) {
        throw null;
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    public void setMenuItemsAnimated(boolean z5) {
    }

    public void setModalForAccessibility(boolean z5) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z5) {
            new HashMap(viewGroup.getChildCount());
        }
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            if (viewGroup.getChildAt(i6) != this) {
                throw null;
            }
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        throw null;
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        throw null;
    }

    public void setStatusBarSpacerEnabled(boolean z5) {
        setStatusBarSpacerEnabledInternal(z5);
    }

    public void setText(int i6) {
        throw null;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        throw null;
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z5) {
        throw null;
    }

    public void setTransitionState(c cVar) {
        if (this.f3276d.equals(cVar)) {
            return;
        }
        this.f3276d = cVar;
        for (b bVar : new LinkedHashSet((Collection) null)) {
            bVar.a();
        }
    }

    public void setUseWindowInsetsController(boolean z5) {
    }

    public void setVisible(boolean z5) {
        throw null;
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f3274b = searchBar;
        throw null;
    }
}
