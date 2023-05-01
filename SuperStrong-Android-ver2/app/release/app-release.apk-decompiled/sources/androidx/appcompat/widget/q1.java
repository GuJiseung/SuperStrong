package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.superstrong.android.R;
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f908a;

    /* renamed from: b  reason: collision with root package name */
    public final View f909b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f910c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f911d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f912e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f913f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f914g;

    public q1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f911d = layoutParams;
        this.f912e = new Rect();
        this.f913f = new int[2];
        this.f914g = new int[2];
        this.f908a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f909b = inflate;
        this.f910c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(q1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951620;
        layoutParams.flags = 24;
    }
}
