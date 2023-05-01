package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f4029f;

    /* renamed from: a  reason: collision with root package name */
    public int f4030a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f4031b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f4032c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f4033d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f4034e;

    /* loaded from: classes.dex */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public c(Context context, int i6) {
        super(context);
        this.f4030a = i6;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f4031b = theme;
    }

    public final void a(Configuration configuration) {
        if (this.f4034e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f4033d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f4033d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z5;
        if (this.f4031b == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            this.f4031b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4031b.setTo(theme);
            }
        }
        this.f4031b.applyStyle(this.f4030a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(g.c.f4029f) != false) goto L14;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f4034e
            if (r0 != 0) goto L36
            android.content.res.Configuration r0 = r3.f4033d
            if (r0 == 0) goto L30
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = g.c.f4029f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            g.c.f4029f = r1
        L1c:
            android.content.res.Configuration r1 = g.c.f4029f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L30
        L25:
            android.content.res.Configuration r0 = r3.f4033d
            android.content.Context r0 = g.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            goto L34
        L30:
            android.content.res.Resources r0 = super.getResources()
        L34:
            r3.f4034e = r0
        L36:
            android.content.res.Resources r0 = r3.f4034e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f4032c == null) {
                this.f4032c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f4032c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f4031b;
        if (theme != null) {
            return theme;
        }
        if (this.f4030a == 0) {
            this.f4030a = 2131952139;
        }
        b();
        return this.f4031b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        if (this.f4030a != i6) {
            this.f4030a = i6;
            b();
        }
    }
}
