package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import f0.b;
import java.util.ArrayList;
import z.a;
/* loaded from: classes.dex */
public final class h implements a0.b {
    public f0.b A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a  reason: collision with root package name */
    public final int f451a;

    /* renamed from: b  reason: collision with root package name */
    public final int f452b;

    /* renamed from: c  reason: collision with root package name */
    public final int f453c;

    /* renamed from: d  reason: collision with root package name */
    public final int f454d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f455e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f456f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f457g;

    /* renamed from: h  reason: collision with root package name */
    public char f458h;

    /* renamed from: j  reason: collision with root package name */
    public char f460j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f462l;

    /* renamed from: n  reason: collision with root package name */
    public final f f464n;

    /* renamed from: o  reason: collision with root package name */
    public m f465o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f466p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f467q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f468r;

    /* renamed from: y  reason: collision with root package name */
    public int f473y;

    /* renamed from: z  reason: collision with root package name */
    public View f474z;

    /* renamed from: i  reason: collision with root package name */
    public int f459i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f461k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f463m = 0;
    public ColorStateList s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f469t = null;
    public boolean u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f470v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f471w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f472x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public h(f fVar, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        this.f464n = fVar;
        this.f451a = i7;
        this.f452b = i6;
        this.f453c = i8;
        this.f454d = i9;
        this.f455e = charSequence;
        this.f473y = i10;
    }

    public static void c(int i6, int i7, String str, StringBuilder sb) {
        if ((i6 & i7) == i7) {
            sb.append(str);
        }
    }

    @Override // a0.b
    public final a0.b a(f0.b bVar) {
        f0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f3862a = null;
        }
        this.f474z = null;
        this.A = bVar;
        this.f464n.p(true);
        f0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // a0.b
    public final f0.b b() {
        return this.A;
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f473y & 8) == 0) {
            return false;
        }
        if (this.f474z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f464n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f471w && (this.u || this.f470v)) {
            drawable = drawable.mutate();
            if (this.u) {
                a.b.h(drawable, this.s);
            }
            if (this.f470v) {
                a.b.i(drawable, this.f469t);
            }
            this.f471w = false;
        }
        return drawable;
    }

    public final boolean e() {
        f0.b bVar;
        if ((this.f473y & 8) != 0) {
            if (this.f474z == null && (bVar = this.A) != null) {
                this.f474z = bVar.d(this);
            }
            return this.f474z != null;
        }
        return false;
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean expandActionView() {
        if (e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f464n.f(this);
            }
            return false;
        }
        return false;
    }

    public final void f(boolean z5) {
        this.f472x = z5 ? this.f472x | 32 : this.f472x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // a0.b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f474z;
        if (view != null) {
            return view;
        }
        f0.b bVar = this.A;
        if (bVar != null) {
            View d6 = bVar.d(this);
            this.f474z = d6;
            return d6;
        }
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f461k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f460j;
    }

    @Override // a0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f467q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f452b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f462l;
        if (drawable != null) {
            return d(drawable);
        }
        int i6 = this.f463m;
        if (i6 != 0) {
            Drawable a6 = e.a.a(this.f464n.f426a, i6);
            this.f463m = 0;
            this.f462l = a6;
            return d(a6);
        }
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // a0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f469t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f457g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f451a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f459i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f458h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f453c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f465o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f455e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f456f;
        return charSequence != null ? charSequence : this.f455e;
    }

    @Override // a0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f468r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f465o != null;
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f472x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f472x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f472x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        f0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f472x & 8) == 0 : (this.f472x & 8) == 0 && this.A.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        int i7;
        f fVar = this.f464n;
        Context context = fVar.f426a;
        View inflate = LayoutInflater.from(context).inflate(i6, (ViewGroup) new LinearLayout(context), false);
        this.f474z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i7 = this.f451a) > 0) {
            inflate.setId(i7);
        }
        fVar.f436k = true;
        fVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f460j == c6) {
            return this;
        }
        this.f460j = Character.toLowerCase(c6);
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i6) {
        if (this.f460j == c6 && this.f461k == i6) {
            return this;
        }
        this.f460j = Character.toLowerCase(c6);
        this.f461k = KeyEvent.normalizeMetaState(i6);
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        int i6 = this.f472x;
        int i7 = (z5 ? 1 : 0) | (i6 & (-2));
        this.f472x = i7;
        if (i6 != i7) {
            this.f464n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        boolean z6;
        int i6;
        int i7 = this.f472x;
        int i8 = i7 & 4;
        f fVar = this.f464n;
        int i9 = 2;
        if (i8 != 0) {
            fVar.getClass();
            ArrayList<h> arrayList = fVar.f431f;
            int size = arrayList.size();
            fVar.w();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayList.get(i10);
                if (hVar.f452b == this.f452b) {
                    boolean z7 = true;
                    if ((hVar.f472x & 4) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6 && hVar.isCheckable()) {
                        if (hVar != this) {
                            z7 = false;
                        }
                        int i11 = hVar.f472x;
                        int i12 = i11 & (-3);
                        if (z7) {
                            i6 = 2;
                        } else {
                            i6 = 0;
                        }
                        int i13 = i6 | i12;
                        hVar.f472x = i13;
                        if (i11 != i13) {
                            hVar.f464n.p(false);
                        }
                    }
                }
            }
            fVar.v();
        } else {
            int i14 = i7 & (-3);
            if (!z5) {
                i9 = 0;
            }
            int i15 = i9 | i14;
            this.f472x = i15;
            if (i7 != i15) {
                fVar.p(false);
            }
        }
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final a0.b setContentDescription(CharSequence charSequence) {
        this.f467q = charSequence;
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f472x = z5 ? this.f472x | 16 : this.f472x & (-17);
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        this.f462l = null;
        this.f463m = i6;
        this.f471w = true;
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f463m = 0;
        this.f462l = drawable;
        this.f471w = true;
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.f471w = true;
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f469t = mode;
        this.f470v = true;
        this.f471w = true;
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f457g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f458h == c6) {
            return this;
        }
        this.f458h = c6;
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i6) {
        if (this.f458h == c6 && this.f459i == i6) {
            return this;
        }
        this.f458h = c6;
        this.f459i = KeyEvent.normalizeMetaState(i6);
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f466p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f458h = c6;
        this.f460j = Character.toLowerCase(c7);
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f458h = c6;
        this.f459i = KeyEvent.normalizeMetaState(i6);
        this.f460j = Character.toLowerCase(c7);
        this.f461k = KeyEvent.normalizeMetaState(i7);
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final void setShowAsAction(int i6) {
        int i7 = i6 & 3;
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f473y = i6;
        f fVar = this.f464n;
        fVar.f436k = true;
        fVar.p(true);
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        setShowAsAction(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        setTitle(this.f464n.f426a.getString(i6));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f455e = charSequence;
        this.f464n.p(false);
        m mVar = this.f465o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f456f = charSequence;
        this.f464n.p(false);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final a0.b setTooltipText(CharSequence charSequence) {
        this.f468r = charSequence;
        this.f464n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        int i6;
        int i7 = this.f472x;
        int i8 = i7 & (-9);
        boolean z6 = false;
        if (z5) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        int i9 = i6 | i8;
        this.f472x = i9;
        if (i7 != i9) {
            z6 = true;
        }
        if (z6) {
            f fVar = this.f464n;
            fVar.f433h = true;
            fVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f455e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i6;
        this.f474z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i6 = this.f451a) > 0) {
            view.setId(i6);
        }
        f fVar = this.f464n;
        fVar.f436k = true;
        fVar.p(true);
        return this;
    }
}
