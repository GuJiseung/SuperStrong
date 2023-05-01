package g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.p0;
import f0.q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f4047e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f4048f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f4049a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4050b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4051c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4052d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f4053c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public final Object f4054a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f4055b;

        public a(Object obj, String str) {
            this.f4054a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f4055b = cls.getMethod(str, f4053c);
            } catch (Exception e6) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f4055b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f4054a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public final Menu f4056a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4063h;

        /* renamed from: i  reason: collision with root package name */
        public int f4064i;

        /* renamed from: j  reason: collision with root package name */
        public int f4065j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f4066k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f4067l;

        /* renamed from: m  reason: collision with root package name */
        public int f4068m;

        /* renamed from: n  reason: collision with root package name */
        public char f4069n;

        /* renamed from: o  reason: collision with root package name */
        public int f4070o;

        /* renamed from: p  reason: collision with root package name */
        public char f4071p;

        /* renamed from: q  reason: collision with root package name */
        public int f4072q;

        /* renamed from: r  reason: collision with root package name */
        public int f4073r;
        public boolean s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f4074t;
        public boolean u;

        /* renamed from: v  reason: collision with root package name */
        public int f4075v;

        /* renamed from: w  reason: collision with root package name */
        public int f4076w;

        /* renamed from: x  reason: collision with root package name */
        public String f4077x;

        /* renamed from: y  reason: collision with root package name */
        public String f4078y;

        /* renamed from: z  reason: collision with root package name */
        public f0.b f4079z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f4057b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f4058c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4059d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4060e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4061f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4062g = true;

        public b(Menu menu) {
            this.f4056a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f4051c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e6) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z5;
            MenuItem enabled = menuItem.setChecked(this.s).setVisible(this.f4074t).setEnabled(this.u);
            boolean z6 = false;
            if (this.f4073r >= 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            enabled.setCheckable(z5).setTitleCondensed(this.f4067l).setIcon(this.f4068m);
            int i6 = this.f4075v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            String str = this.f4078y;
            f fVar = f.this;
            if (str != null) {
                if (!fVar.f4051c.isRestricted()) {
                    if (fVar.f4052d == null) {
                        fVar.f4052d = f.a(fVar.f4051c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f4052d, this.f4078y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f4073r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menuItem;
                    hVar.f472x = (hVar.f472x & (-5)) | 4;
                } else if (menuItem instanceof h.c) {
                    h.c cVar = (h.c) menuItem;
                    try {
                        Method method = cVar.f4365e;
                        a0.b bVar = cVar.f4364d;
                        if (method == null) {
                            cVar.f4365e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f4365e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception e6) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                    }
                }
            }
            String str2 = this.f4077x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, f.f4047e, fVar.f4049a));
                z6 = true;
            }
            int i7 = this.f4076w;
            if (i7 > 0) {
                if (!z6) {
                    menuItem.setActionView(i7);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            f0.b bVar2 = this.f4079z;
            if (bVar2 != null) {
                if (menuItem instanceof a0.b) {
                    ((a0.b) menuItem).a(bVar2);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z7 = menuItem instanceof a0.b;
            if (z7) {
                ((a0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z7) {
                ((a0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.m(menuItem, charSequence2);
            }
            char c6 = this.f4069n;
            int i8 = this.f4070o;
            if (z7) {
                ((a0.b) menuItem).setAlphabeticShortcut(c6, i8);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.g(menuItem, c6, i8);
            }
            char c7 = this.f4071p;
            int i9 = this.f4072q;
            if (z7) {
                ((a0.b) menuItem).setNumericShortcut(c7, i9);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.k(menuItem, c7, i9);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z7) {
                    ((a0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    q.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z7) {
                    ((a0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    q.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f4047e = clsArr;
        f4048f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f4051c = context;
        Object[] objArr = {context};
        this.f4049a = objArr;
        this.f4050b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        int i6;
        char charAt;
        char charAt2;
        int i7;
        boolean z5;
        f0.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            i6 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        String str = null;
        while (!z6) {
            if (eventType != 1) {
                Menu menu2 = bVar2.f4056a;
                if (eventType != i6) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z7 && name2.equals(str)) {
                            z7 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            bVar2.f4057b = 0;
                            bVar2.f4058c = 0;
                            bVar2.f4059d = 0;
                            bVar2.f4060e = 0;
                            bVar2.f4061f = true;
                            bVar2.f4062g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f4063h) {
                                f0.b bVar3 = bVar2.f4079z;
                                if (bVar3 != null && bVar3.a()) {
                                    bVar2.f4063h = true;
                                    bVar2.b(menu2.addSubMenu(bVar2.f4057b, bVar2.f4064i, bVar2.f4065j, bVar2.f4066k).getItem());
                                } else {
                                    bVar2.f4063h = true;
                                    bVar2.b(menu2.add(bVar2.f4057b, bVar2.f4064i, bVar2.f4065j, bVar2.f4066k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z6 = true;
                        }
                    }
                } else if (!z7) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    f fVar = f.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = fVar.f4051c.obtainStyledAttributes(attributeSet, c.b.f2682q);
                        bVar2.f4057b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f4058c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f4059d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f4060e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f4061f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f4062g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = fVar.f4051c;
                        j1 j1Var = new j1(context, context.obtainStyledAttributes(attributeSet, c.b.f2684r));
                        bVar2.f4064i = j1Var.i(2, 0);
                        bVar2.f4065j = (j1Var.h(5, bVar2.f4058c) & (-65536)) | (j1Var.h(6, bVar2.f4059d) & 65535);
                        bVar2.f4066k = j1Var.k(7);
                        bVar2.f4067l = j1Var.k(8);
                        bVar2.f4068m = j1Var.i(0, 0);
                        String j5 = j1Var.j(9);
                        if (j5 == null) {
                            charAt = 0;
                        } else {
                            charAt = j5.charAt(0);
                        }
                        bVar2.f4069n = charAt;
                        bVar2.f4070o = j1Var.h(16, 4096);
                        String j6 = j1Var.j(10);
                        if (j6 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = j6.charAt(0);
                        }
                        bVar2.f4071p = charAt2;
                        bVar2.f4072q = j1Var.h(20, 4096);
                        if (j1Var.l(11)) {
                            i7 = j1Var.a(11, false);
                        } else {
                            i7 = bVar2.f4060e;
                        }
                        bVar2.f4073r = i7;
                        bVar2.s = j1Var.a(3, false);
                        bVar2.f4074t = j1Var.a(4, bVar2.f4061f);
                        bVar2.u = j1Var.a(1, bVar2.f4062g);
                        bVar2.f4075v = j1Var.h(21, -1);
                        bVar2.f4078y = j1Var.j(12);
                        bVar2.f4076w = j1Var.i(13, 0);
                        bVar2.f4077x = j1Var.j(15);
                        String j7 = j1Var.j(14);
                        if (j7 != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5 && bVar2.f4076w == 0 && bVar2.f4077x == null) {
                            bVar = (f0.b) bVar2.a(j7, f4048f, fVar.f4050b);
                        } else {
                            if (z5) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.f4079z = bVar;
                        bVar2.A = j1Var.k(17);
                        bVar2.B = j1Var.k(22);
                        if (j1Var.l(19)) {
                            bVar2.D = p0.b(j1Var.h(19, -1), bVar2.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.D = null;
                        }
                        if (j1Var.l(18)) {
                            bVar2.C = j1Var.b(18);
                        } else {
                            bVar2.C = colorStateList;
                        }
                        j1Var.n();
                        bVar2.f4063h = false;
                    } else if (name3.equals("menu")) {
                        bVar2.f4063h = true;
                        SubMenu addSubMenu = menu2.addSubMenu(bVar2.f4057b, bVar2.f4064i, bVar2.f4065j, bVar2.f4066k);
                        bVar2.b(addSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, addSubMenu);
                    } else {
                        str = name3;
                        z7 = true;
                    }
                }
                eventType = xmlResourceParser.next();
                i6 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i6, Menu menu) {
        if (!(menu instanceof a0.a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f4051c.getResources().getLayout(i6);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
