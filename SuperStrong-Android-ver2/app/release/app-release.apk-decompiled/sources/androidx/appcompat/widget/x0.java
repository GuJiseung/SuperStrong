package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class x0 extends v0 implements w0 {
    public static final Method E;
    public w0 D;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z5) {
            popupWindow.setTouchModal(z5);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q0 {

        /* renamed from: n  reason: collision with root package name */
        public final int f990n;

        /* renamed from: o  reason: collision with root package name */
        public final int f991o;

        /* renamed from: p  reason: collision with root package name */
        public w0 f992p;

        /* renamed from: q  reason: collision with root package name */
        public androidx.appcompat.view.menu.h f993q;

        /* loaded from: classes.dex */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z5) {
            super(context, z5);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f990n = 21;
                this.f991o = 22;
                return;
            }
            this.f990n = 22;
            this.f991o = 21;
        }

        @Override // androidx.appcompat.widget.q0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.e eVar;
            int i6;
            androidx.appcompat.view.menu.h hVar;
            int pointToPosition;
            int i7;
            if (this.f992p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i6 = headerViewListAdapter.getHeadersCount();
                    eVar = (androidx.appcompat.view.menu.e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (androidx.appcompat.view.menu.e) adapter;
                    i6 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i7 = pointToPosition - i6) >= 0 && i7 < eVar.getCount()) {
                    hVar = eVar.getItem(i7);
                } else {
                    hVar = null;
                }
                androidx.appcompat.view.menu.h hVar2 = this.f993q;
                if (hVar2 != hVar) {
                    androidx.appcompat.view.menu.f fVar = eVar.f419b;
                    if (hVar2 != null) {
                        this.f992p.a(fVar, hVar2);
                    }
                    this.f993q = hVar;
                    if (hVar != null) {
                        this.f992p.e(fVar, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i6 == this.f990n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i6 == this.f991o) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((androidx.appcompat.view.menu.e) adapter).f419b.c(false);
                return true;
            } else {
                return super.onKeyDown(i6, keyEvent);
            }
        }

        public void setHoverListener(w0 w0Var) {
            this.f992p = w0Var;
        }

        @Override // androidx.appcompat.widget.q0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public x0(Context context, int i6, int i7) {
        super(context, null, i6, i7);
    }

    @Override // androidx.appcompat.widget.w0
    public final void a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        w0 w0Var = this.D;
        if (w0Var != null) {
            w0Var.a(fVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.w0
    public final void e(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
        w0 w0Var = this.D;
        if (w0Var != null) {
            w0Var.e(fVar, hVar);
        }
    }

    @Override // androidx.appcompat.widget.v0
    public final q0 q(Context context, boolean z5) {
        c cVar = new c(context, z5);
        cVar.setHoverListener(this);
        return cVar;
    }
}
