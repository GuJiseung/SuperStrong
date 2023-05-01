package h;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import w.a;
import z.a;
/* loaded from: classes.dex */
public final class a implements a0.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f4345a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f4346b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f4347c;

    /* renamed from: d  reason: collision with root package name */
    public char f4348d;

    /* renamed from: f  reason: collision with root package name */
    public char f4350f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4352h;

    /* renamed from: i  reason: collision with root package name */
    public final Context f4353i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f4354j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4355k;

    /* renamed from: e  reason: collision with root package name */
    public int f4349e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f4351g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f4356l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f4357m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4358n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4359o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f4360p = 16;

    public a(Context context, CharSequence charSequence) {
        this.f4353i = context;
        this.f4345a = charSequence;
    }

    @Override // a0.b
    public final a0.b a(f0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // a0.b
    public final f0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f4352h;
        if (drawable != null) {
            if (this.f4358n || this.f4359o) {
                this.f4352h = drawable;
                Drawable mutate = drawable.mutate();
                this.f4352h = mutate;
                if (this.f4358n) {
                    a.b.h(mutate, this.f4356l);
                }
                if (this.f4359o) {
                    a.b.i(this.f4352h, this.f4357m);
                }
            }
        }
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // a0.b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4351g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4350f;
    }

    @Override // a0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4354j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f4352h;
    }

    @Override // a0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4356l;
    }

    @Override // a0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4357m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f4347c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // a0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4349e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4348d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4345a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4346b;
        return charSequence != null ? charSequence : this.f4345a;
    }

    @Override // a0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4355k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // a0.b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f4360p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f4360p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f4360p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f4360p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setActionView(int i6) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f4350f = Character.toLowerCase(c6);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i6) {
        this.f4350f = Character.toLowerCase(c6);
        this.f4351g = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z5) {
        this.f4360p = (z5 ? 1 : 0) | (this.f4360p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z5) {
        this.f4360p = (z5 ? 2 : 0) | (this.f4360p & (-3));
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final a0.b setContentDescription(CharSequence charSequence) {
        this.f4354j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f4354j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z5) {
        this.f4360p = (z5 ? 16 : 0) | (this.f4360p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i6) {
        Object obj = w.a.f6573a;
        this.f4352h = a.b.b(this.f4353i, i6);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4352h = drawable;
        c();
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4356l = colorStateList;
        this.f4358n = true;
        c();
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4357m = mode;
        this.f4359o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f4347c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f4348d = c6;
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i6) {
        this.f4348d = c6;
        this.f4349e = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f4348d = c6;
        this.f4350f = Character.toLowerCase(c7);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i6, int i7) {
        this.f4348d = c6;
        this.f4349e = KeyEvent.normalizeMetaState(i6);
        this.f4350f = Character.toLowerCase(c7);
        this.f4351g = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final void setShowAsAction(int i6) {
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i6) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i6) {
        this.f4345a = this.f4353i.getResources().getString(i6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4345a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4346b = charSequence;
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final a0.b setTooltipText(CharSequence charSequence) {
        this.f4355k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f4355k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z5) {
        this.f4360p = (this.f4360p & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // a0.b, android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
