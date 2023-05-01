package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.superstrong.android.R;
import d.n;
/* loaded from: classes.dex */
public final class b extends n implements DialogInterface {

    /* renamed from: f  reason: collision with root package name */
    public final AlertController f336f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f337a;

        /* renamed from: b  reason: collision with root package name */
        public final int f338b;

        public a(Context context) {
            int i6 = b.i(context, 0);
            this.f337a = new AlertController.b(new ContextThemeWrapper(context, b.i(context, i6)));
            this.f338b = i6;
        }

        public final b a() {
            int i6;
            AlertController.b bVar = this.f337a;
            b bVar2 = new b(bVar.f323a, this.f338b);
            View view = bVar.f327e;
            AlertController alertController = bVar2.f336f;
            if (view != null) {
                alertController.f312o = view;
            } else {
                CharSequence charSequence = bVar.f326d;
                if (charSequence != null) {
                    alertController.f301d = charSequence;
                    TextView textView = alertController.f310m;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f325c;
                if (drawable != null) {
                    alertController.f308k = drawable;
                    alertController.f307j = 0;
                    ImageView imageView = alertController.f309l;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f309l.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar.f329g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f324b.inflate(alertController.s, (ViewGroup) null);
                if (bVar.f331i) {
                    i6 = alertController.f316t;
                } else {
                    i6 = alertController.u;
                }
                ListAdapter listAdapter = bVar.f329g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f323a, i6);
                }
                alertController.f313p = listAdapter;
                alertController.f314q = bVar.f332j;
                if (bVar.f330h != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.f331i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f302e = recycleListView;
            }
            bVar2.setCancelable(true);
            bVar2.setCanceledOnTouchOutside(true);
            bVar2.setOnCancelListener(null);
            bVar2.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f328f;
            if (onKeyListener != null) {
                bVar2.setOnKeyListener(onKeyListener);
            }
            return bVar2;
        }
    }

    public b(Context context, int i6) {
        super(context, i(context, i6));
        this.f336f = new AlertController(getContext(), this, getWindow());
    }

    public static int i(Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0227, code lost:
        if (r4 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0229, code lost:
        r4.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0234, code lost:
        if (r4 != null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    @Override // d.n, androidx.activity.e, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z5;
        NestedScrollView nestedScrollView = this.f336f.f306i;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        boolean z5;
        NestedScrollView nestedScrollView = this.f336f.f306i;
        if (nestedScrollView != null && nestedScrollView.f(keyEvent)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // d.n, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f336f;
        alertController.f301d = charSequence;
        TextView textView = alertController.f310m;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
