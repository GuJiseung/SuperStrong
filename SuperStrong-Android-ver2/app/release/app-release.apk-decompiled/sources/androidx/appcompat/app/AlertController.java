package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.superstrong.android.R;
import d.n;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f298a;

    /* renamed from: b  reason: collision with root package name */
    public final n f299b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f300c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f301d;

    /* renamed from: e  reason: collision with root package name */
    public RecycleListView f302e;

    /* renamed from: f  reason: collision with root package name */
    public Button f303f;

    /* renamed from: g  reason: collision with root package name */
    public Button f304g;

    /* renamed from: h  reason: collision with root package name */
    public Button f305h;

    /* renamed from: i  reason: collision with root package name */
    public NestedScrollView f306i;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f308k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f309l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f310m;

    /* renamed from: n  reason: collision with root package name */
    public TextView f311n;

    /* renamed from: o  reason: collision with root package name */
    public View f312o;

    /* renamed from: p  reason: collision with root package name */
    public ListAdapter f313p;

    /* renamed from: r  reason: collision with root package name */
    public final int f315r;
    public final int s;

    /* renamed from: t  reason: collision with root package name */
    public final int f316t;
    public final int u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f317v;

    /* renamed from: w  reason: collision with root package name */
    public final c f318w;

    /* renamed from: j  reason: collision with root package name */
    public int f307j = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f314q = -1;

    /* renamed from: x  reason: collision with root package name */
    public final a f319x = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f320b;

        /* renamed from: c  reason: collision with root package name */
        public final int f321c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.u);
            this.f321c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f320b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AlertController alertController = AlertController.this;
            Button button = alertController.f303f;
            Button button2 = alertController.f304g;
            Button button3 = alertController.f305h;
            alertController.f318w.obtainMessage(1, alertController.f299b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f323a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f324b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f325c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f326d;

        /* renamed from: e  reason: collision with root package name */
        public View f327e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnKeyListener f328f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f329g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f330h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f331i;

        /* renamed from: j  reason: collision with root package name */
        public int f332j = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f323a = contextThemeWrapper;
            this.f324b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f333a;

        public c(DialogInterface dialogInterface) {
            this.f333a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 == -3 || i6 == -2 || i6 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f333a.get(), message.what);
            } else if (i6 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i6) {
            super(context, i6, 16908308, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, n nVar, Window window) {
        this.f298a = context;
        this.f299b = nVar;
        this.f300c = window;
        this.f318w = new c(nVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, c.b.f2660f, R.attr.alertDialogStyle, 0);
        this.f315r = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.s = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f316t = obtainStyledAttributes.getResourceId(7, 0);
        this.u = obtainStyledAttributes.getResourceId(3, 0);
        this.f317v = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        nVar.f().s(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
