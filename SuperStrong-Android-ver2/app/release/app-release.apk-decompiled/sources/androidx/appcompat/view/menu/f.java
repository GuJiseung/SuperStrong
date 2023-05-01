package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import f0.m0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import w.a;
/* loaded from: classes.dex */
public class f implements a0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f425y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f426a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f427b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f428c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f429d;

    /* renamed from: e  reason: collision with root package name */
    public a f430e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<h> f431f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<h> f432g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f433h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<h> f434i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<h> f435j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f436k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f438m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f439n;

    /* renamed from: o  reason: collision with root package name */
    public View f440o;

    /* renamed from: v  reason: collision with root package name */
    public h f445v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f447x;

    /* renamed from: l  reason: collision with root package name */
    public int f437l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f441p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f442q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f443r = false;
    public boolean s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<h> f444t = new ArrayList<>();
    public final CopyOnWriteArrayList<WeakReference<j>> u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f446w = false;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean z5;
        boolean z6 = false;
        this.f426a = context;
        Resources resources = context.getResources();
        this.f427b = resources;
        this.f431f = new ArrayList<>();
        this.f432g = new ArrayList<>();
        this.f433h = true;
        this.f434i = new ArrayList<>();
        this.f435j = new ArrayList<>();
        this.f436k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = m0.f3905a;
            if (Build.VERSION.SDK_INT >= 28) {
                z5 = m0.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                z6 = true;
            }
        }
        this.f429d = z6;
    }

    public h a(int i6, int i7, int i8, CharSequence charSequence) {
        int i9;
        int i10 = ((-65536) & i8) >> 16;
        if (i10 >= 0 && i10 < 6) {
            int i11 = (f425y[i10] << 16) | (65535 & i8);
            h hVar = new h(this, i6, i7, i8, i11, charSequence, this.f437l);
            ArrayList<h> arrayList = this.f431f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (arrayList.get(size).f454d <= i11) {
                        i9 = size + 1;
                        break;
                    }
                } else {
                    i9 = 0;
                    break;
                }
            }
            arrayList.add(i9, hVar);
            p(true);
            return hVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6) {
        return a(0, 0, 0, this.f427b.getString(i6));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, int i9) {
        return a(i6, i7, i8, this.f427b.getString(i9));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return a(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f426a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h a6 = a(i6, i7, i8, resolveInfo.loadLabel(packageManager));
            a6.setIcon(resolveInfo.loadIcon(packageManager));
            a6.f457g = intent2;
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = a6;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f427b.getString(i6));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return addSubMenu(i6, i7, i8, this.f427b.getString(i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        h a6 = a(i6, i7, i8, charSequence);
        m mVar = new m(this.f426a, this, a6);
        a6.f465o = mVar;
        mVar.setHeaderTitle(a6.f455e);
        return mVar;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.u.add(new WeakReference<>(jVar));
        jVar.e(context, this);
        this.f436k = true;
    }

    public final void c(boolean z5) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.a(this, z5);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f445v;
        if (hVar != null) {
            d(hVar);
        }
        this.f431f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f439n = null;
        this.f438m = null;
        this.f440o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        boolean z5 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f445v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    z5 = jVar.c(hVar);
                    if (z5) {
                        break;
                    }
                }
            }
            v();
            if (z5) {
                this.f445v = null;
            }
        }
        return z5;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f430e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        boolean z5 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z5 = jVar.m(hVar);
                if (z5) {
                    break;
                }
            }
        }
        v();
        if (z5) {
            this.f445v = hVar;
        }
        return z5;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i6) {
        MenuItem findItem;
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = this.f431f.get(i7);
            if (hVar.f451a == i6) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.f465o.findItem(i6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final h g(int i6, KeyEvent keyEvent) {
        char c6;
        ArrayList<h> arrayList = this.f444t;
        arrayList.clear();
        h(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n5 = n();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (n5) {
                c6 = hVar.f460j;
            } else {
                c6 = hVar.f458h;
            }
            char[] cArr = keyData.meta;
            if ((c6 == cArr[0] && (metaState & 2) == 0) || ((c6 == cArr[2] && (metaState & 2) != 0) || (n5 && c6 == '\b' && i6 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i6) {
        return this.f431f.get(i6);
    }

    public final void h(ArrayList arrayList, int i6, KeyEvent keyEvent) {
        char c6;
        int i7;
        boolean z5;
        boolean n5 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i6 != 67) {
            return;
        }
        ArrayList<h> arrayList2 = this.f431f;
        int size = arrayList2.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = arrayList2.get(i8);
            if (hVar.hasSubMenu()) {
                hVar.f465o.h(arrayList, i6, keyEvent);
            }
            if (n5) {
                c6 = hVar.f460j;
            } else {
                c6 = hVar.f458h;
            }
            if (n5) {
                i7 = hVar.f461k;
            } else {
                i7 = hVar.f459i;
            }
            if ((modifiers & 69647) == (i7 & 69647)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && c6 != 0) {
                char[] cArr = keyData.meta;
                if (c6 != cArr[0] && c6 != cArr[2]) {
                    if (n5 && c6 == '\b') {
                        if (i6 != 67) {
                        }
                    }
                }
                if (hVar.isEnabled()) {
                    arrayList.add(hVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f447x) {
            return true;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (this.f431f.get(i6).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        boolean z5;
        ArrayList<h> l5 = l();
        if (!this.f436k) {
            return;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                z6 |= jVar.j();
            }
        }
        ArrayList<h> arrayList = this.f434i;
        ArrayList<h> arrayList2 = this.f435j;
        arrayList.clear();
        arrayList2.clear();
        if (z6) {
            int size = l5.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = l5.get(i6);
                if ((hVar.f472x & 32) == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    arrayList.add(hVar);
                } else {
                    arrayList2.add(hVar);
                }
            }
        } else {
            arrayList2.addAll(l());
        }
        this.f436k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return g(i6, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public f k() {
        return this;
    }

    public final ArrayList<h> l() {
        boolean z5 = this.f433h;
        ArrayList<h> arrayList = this.f432g;
        if (z5) {
            arrayList.clear();
            ArrayList<h> arrayList2 = this.f431f;
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                h hVar = arrayList2.get(i6);
                if (hVar.isVisible()) {
                    arrayList.add(hVar);
                }
            }
            this.f433h = false;
            this.f436k = true;
            return arrayList;
        }
        return arrayList;
    }

    public boolean m() {
        return this.f446w;
    }

    public boolean n() {
        return this.f428c;
    }

    public boolean o() {
        return this.f429d;
    }

    public final void p(boolean z5) {
        if (!this.f441p) {
            if (z5) {
                this.f433h = true;
                this.f436k = true;
            }
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference<j> next = it.next();
                    j jVar = next.get();
                    if (jVar == null) {
                        copyOnWriteArrayList.remove(next);
                    } else {
                        jVar.i(z5);
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f442q = true;
        if (z5) {
            this.f443r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i6, int i7) {
        return q(findItem(i6), null, i7);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        boolean z5;
        h g2 = g(i6, keyEvent);
        if (g2 != null) {
            z5 = q(g2, null, i7);
        } else {
            z5 = false;
        }
        if ((i7 & 2) != 0) {
            c(true);
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bf, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
        c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto Lc5
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lc5
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f466p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L3e
        L19:
            androidx.appcompat.view.menu.f r1 = r7.f464n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L3e
        L22:
            android.content.Intent r3 = r7.f457g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.f426a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L3e
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            f0.b r1 = r7.A
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
        L3e:
            r1 = r2
            goto L41
        L40:
            r1 = r0
        L41:
            f0.b r3 = r7.A
            if (r3 == 0) goto L4d
            boolean r4 = r3.a()
            if (r4 == 0) goto L4d
            r4 = r2
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L5c
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lc4
            goto Lc1
        L5c:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6a
            if (r4 == 0) goto L65
            goto L6a
        L65:
            r7 = r9 & 1
            if (r7 != 0) goto Lc4
            goto Lc1
        L6a:
            r9 = r9 & 4
            if (r9 != 0) goto L71
            r6.c(r0)
        L71:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L85
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f426a
            r9.<init>(r5, r6, r7)
            r7.f465o = r9
            java.lang.CharSequence r5 = r7.f455e
            r9.setHeaderTitle(r5)
        L85:
            androidx.appcompat.view.menu.m r7 = r7.f465o
            if (r4 == 0) goto L8c
            r3.f(r7)
        L8c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L95
            goto Lbe
        L95:
            if (r8 == 0) goto L9b
            boolean r0 = r8.h(r7)
        L9b:
            java.util.Iterator r8 = r9.iterator()
        L9f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lbe
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.j) r4
            if (r4 != 0) goto Lb7
            r9.remove(r3)
            goto L9f
        Lb7:
            if (r0 != 0) goto L9f
            boolean r0 = r4.h(r7)
            goto L9f
        Lbe:
            r1 = r1 | r0
            if (r1 != 0) goto Lc4
        Lc1:
            r6.c(r2)
        Lc4:
            return r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i6) {
        ArrayList<h> arrayList;
        int size = size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            arrayList = this.f431f;
            if (i8 < size) {
                if (arrayList.get(i8).f452b == i6) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        if (i8 >= 0) {
            int size2 = arrayList.size() - i8;
            while (true) {
                int i9 = i7 + 1;
                if (i7 >= size2 || arrayList.get(i8).f452b != i6) {
                    break;
                }
                if (i8 >= 0 && i8 < arrayList.size()) {
                    arrayList.remove(i8);
                }
                i7 = i9;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i6) {
        ArrayList<h> arrayList;
        int size = size();
        int i7 = 0;
        while (true) {
            arrayList = this.f431f;
            if (i7 < size) {
                if (arrayList.get(i7).f451a == i6) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 >= 0 && i7 < arrayList.size()) {
            arrayList.remove(i7);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i7 = bundle.getInt("android:menu:expandedactionview");
        if (i7 <= 0 || (findItem = findItem(i7)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i6, boolean z5, boolean z6) {
        int i7;
        ArrayList<h> arrayList = this.f431f;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = arrayList.get(i8);
            if (hVar.f452b == i6) {
                int i9 = hVar.f472x & (-5);
                if (z6) {
                    i7 = 4;
                } else {
                    i7 = 0;
                }
                hVar.f472x = i9 | i7;
                hVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f446w = z5;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i6, boolean z5) {
        ArrayList<h> arrayList = this.f431f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            h hVar = arrayList.get(i7);
            if (hVar.f452b == i6) {
                hVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i6, boolean z5) {
        int i7;
        boolean z6;
        ArrayList<h> arrayList = this.f431f;
        int size = arrayList.size();
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = arrayList.get(i8);
            if (hVar.f452b == i6) {
                int i9 = hVar.f472x;
                int i10 = i9 & (-9);
                if (z5) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                int i11 = i10 | i7;
                hVar.f472x = i11;
                if (i9 != i11) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f428c = z5;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f431f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i6, CharSequence charSequence, int i7, Drawable drawable, View view) {
        if (view != null) {
            this.f440o = view;
            this.f438m = null;
            this.f439n = null;
        } else {
            if (i6 > 0) {
                this.f438m = this.f427b.getText(i6);
            } else if (charSequence != null) {
                this.f438m = charSequence;
            }
            if (i7 > 0) {
                Object obj = w.a.f6573a;
                this.f439n = a.b.b(this.f426a, i7);
            } else if (drawable != null) {
                this.f439n = drawable;
            }
            this.f440o = null;
        }
        p(false);
    }

    public final void v() {
        this.f441p = false;
        if (this.f442q) {
            this.f442q = false;
            p(this.f443r);
        }
    }

    public final void w() {
        if (this.f441p) {
            return;
        }
        this.f441p = true;
        this.f442q = false;
        this.f443r = false;
    }
}
