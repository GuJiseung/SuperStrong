package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import l.h;
/* loaded from: classes.dex */
public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a0.a f4375d;

    public e(Context context, a0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f4375d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return c(this.f4375d.add(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return c(this.f4375d.add(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return c(this.f4375d.add(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(this.f4375d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f4375d.addIntentOptions(i6, i7, i8, componentName, intentArr, intent, i9, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                menuItemArr[i10] = c(menuItemArr2[i10]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return d(this.f4375d.addSubMenu(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return d(this.f4375d.addSubMenu(i6, i7, i8, i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        return d(this.f4375d.addSubMenu(i6, i7, i8, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f4375d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        h<a0.b, MenuItem> hVar = this.f4362b;
        if (hVar != null) {
            hVar.clear();
        }
        h<a0.c, SubMenu> hVar2 = this.f4363c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f4375d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f4375d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        return c(this.f4375d.findItem(i6));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return c(this.f4375d.getItem(i6));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f4375d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return this.f4375d.isShortcutKey(i6, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return this.f4375d.performIdentifierAction(i6, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        return this.f4375d.performShortcut(i6, keyEvent, i7);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        if (this.f4362b != null) {
            int i7 = 0;
            while (true) {
                h<a0.b, MenuItem> hVar = this.f4362b;
                if (i7 >= hVar.f5067d) {
                    break;
                }
                if (hVar.h(i7).getGroupId() == i6) {
                    this.f4362b.j(i7);
                    i7--;
                }
                i7++;
            }
        }
        this.f4375d.removeGroup(i6);
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        if (this.f4362b != null) {
            int i7 = 0;
            while (true) {
                h<a0.b, MenuItem> hVar = this.f4362b;
                if (i7 >= hVar.f5067d) {
                    break;
                } else if (hVar.h(i7).getItemId() == i6) {
                    this.f4362b.j(i7);
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f4375d.removeItem(i6);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z5, boolean z6) {
        this.f4375d.setGroupCheckable(i6, z5, z6);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z5) {
        this.f4375d.setGroupEnabled(i6, z5);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z5) {
        this.f4375d.setGroupVisible(i6, z5);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z5) {
        this.f4375d.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4375d.size();
    }
}
