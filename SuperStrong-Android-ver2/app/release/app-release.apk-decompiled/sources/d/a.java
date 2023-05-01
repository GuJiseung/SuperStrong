package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0030a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f3568a;

        public C0030a() {
            super(-2, -2);
            this.f3568a = 8388627;
        }

        public C0030a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3568a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.f2654c);
            this.f3568a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0030a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3568a = 0;
        }

        public C0030a(C0030a c0030a) {
            super((ViewGroup.MarginLayoutParams) c0030a);
            this.f3568a = 0;
            this.f3568a = c0030a.f3568a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }
}
