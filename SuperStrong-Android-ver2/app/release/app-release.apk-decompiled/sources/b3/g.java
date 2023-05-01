package b3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.j1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.superstrong.android.R;
import f0.g0;
import f0.r0;
import h3.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import z.a;
import z2.n;
/* loaded from: classes.dex */
public abstract class g extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public final b3.c f2424b;

    /* renamed from: c  reason: collision with root package name */
    public final d f2425c;

    /* renamed from: d  reason: collision with root package name */
    public final e f2426d;

    /* renamed from: e  reason: collision with root package name */
    public g.f f2427e;

    /* renamed from: f  reason: collision with root package name */
    public b f2428f;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class c extends l0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Bundle f2429d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new c[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2429d = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // l0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f5073b, i6);
            parcel.writeBundle(this.f2429d);
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        super(o3.a.a(context, attributeSet, R.attr.bottomNavigationStyle, 2131952414), attributeSet, R.attr.bottomNavigationStyle);
        ColorStateList c6;
        e eVar = new e();
        this.f2426d = eVar;
        Context context2 = getContext();
        j1 e6 = n.e(context2, attributeSet, c.b.Y, R.attr.bottomNavigationStyle, 2131952414, 10, 9);
        b3.c cVar = new b3.c(context2, getClass(), getMaxItemCount());
        this.f2424b = cVar;
        m2.b bVar = new m2.b(context2);
        this.f2425c = bVar;
        eVar.f2418b = bVar;
        eVar.f2420d = 1;
        bVar.setPresenter(eVar);
        cVar.b(eVar, cVar.f426a);
        getContext();
        eVar.f2418b.D = cVar;
        if (e6.l(5)) {
            c6 = e6.b(5);
        } else {
            c6 = bVar.c();
        }
        bVar.setIconTintList(c6);
        setItemIconSize(e6.d(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (e6.l(10)) {
            setItemTextAppearanceInactive(e6.i(10, 0));
        }
        if (e6.l(9)) {
            setItemTextAppearanceActive(e6.i(9, 0));
        }
        if (e6.l(11)) {
            setItemTextColor(e6.b(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            h3.f fVar = new h3.f();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.i(context2);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            g0.d.q(this, fVar);
        }
        if (e6.l(7)) {
            setItemPaddingTop(e6.d(7, 0));
        }
        if (e6.l(6)) {
            setItemPaddingBottom(e6.d(6, 0));
        }
        if (e6.l(1)) {
            setElevation(e6.d(1, 0));
        }
        a.b.h(getBackground().mutate(), d3.c.b(context2, e6, 0));
        setLabelVisibilityMode(e6.f815b.getInteger(12, -1));
        int i6 = e6.i(3, 0);
        if (i6 != 0) {
            bVar.setItemBackgroundRes(i6);
        } else {
            setItemRippleColor(d3.c.b(context2, e6, 8));
        }
        int i7 = e6.i(2, 0);
        if (i7 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i7, c.b.X);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(d3.c.a(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(new i(i.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new h3.a(0))));
            obtainStyledAttributes.recycle();
        }
        if (e6.l(13)) {
            int i8 = e6.i(13, 0);
            eVar.f2419c = true;
            getMenuInflater().inflate(i8, cVar);
            eVar.f2419c = false;
            eVar.i(true);
        }
        e6.n();
        addView(bVar);
        cVar.f430e = new f((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f2427e == null) {
            this.f2427e = new g.f(getContext());
        }
        return this.f2427e;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f2425c.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f2425c.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f2425c.getItemActiveIndicatorMarginHorizontal();
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f2425c.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f2425c.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f2425c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f2425c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f2425c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f2425c.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f2425c.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f2425c.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f2425c.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f2425c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f2425c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f2425c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f2425c.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f2424b;
    }

    public k getMenuView() {
        return this.f2425c;
    }

    public e getPresenter() {
        return this.f2426d;
    }

    public int getSelectedItemId() {
        return this.f2425c.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.activity.k.o(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f5073b);
        Bundle bundle = cVar.f2429d;
        b3.c cVar2 = this.f2424b;
        cVar2.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = cVar2.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        int id = jVar.getId();
                        if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                            jVar.f(parcelable2);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k5;
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f2429d = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f2424b.u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (k5 = jVar.k()) != null) {
                        sparseArray.put(id, k5);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return cVar;
    }

    @Override // android.view.View
    public void setElevation(float f6) {
        super.setElevation(f6);
        androidx.activity.k.n(this, f6);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f2425c.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.f2425c.setItemActiveIndicatorEnabled(z5);
    }

    public void setItemActiveIndicatorHeight(int i6) {
        this.f2425c.setItemActiveIndicatorHeight(i6);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i6) {
        this.f2425c.setItemActiveIndicatorMarginHorizontal(i6);
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f2425c.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i6) {
        this.f2425c.setItemActiveIndicatorWidth(i6);
    }

    public void setItemBackground(Drawable drawable) {
        this.f2425c.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i6) {
        this.f2425c.setItemBackgroundRes(i6);
    }

    public void setItemIconSize(int i6) {
        this.f2425c.setItemIconSize(i6);
    }

    public void setItemIconSizeRes(int i6) {
        setItemIconSize(getResources().getDimensionPixelSize(i6));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f2425c.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i6) {
        this.f2425c.setItemPaddingBottom(i6);
    }

    public void setItemPaddingTop(int i6) {
        this.f2425c.setItemPaddingTop(i6);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f2425c.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i6) {
        this.f2425c.setItemTextAppearanceActive(i6);
    }

    public void setItemTextAppearanceInactive(int i6) {
        this.f2425c.setItemTextAppearanceInactive(i6);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f2425c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i6) {
        d dVar = this.f2425c;
        if (dVar.getLabelVisibilityMode() != i6) {
            dVar.setLabelVisibilityMode(i6);
            this.f2426d.i(false);
        }
    }

    public void setOnItemReselectedListener(a aVar) {
    }

    public void setOnItemSelectedListener(b bVar) {
        this.f2428f = bVar;
    }

    public void setSelectedItemId(int i6) {
        b3.c cVar = this.f2424b;
        MenuItem findItem = cVar.findItem(i6);
        if (findItem == null || cVar.q(findItem, this.f2426d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
