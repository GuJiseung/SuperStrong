package z2;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public float f6992c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f6994e;

    /* renamed from: f  reason: collision with root package name */
    public d3.d f6995f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f6990a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f6991b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f6993d = true;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c {
        public a() {
        }

        @Override // androidx.activity.result.c
        public final void w(int i6) {
            k kVar = k.this;
            kVar.f6993d = true;
            b bVar = kVar.f6994e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // androidx.activity.result.c
        public final void x(Typeface typeface, boolean z5) {
            if (z5) {
                return;
            }
            k kVar = k.this;
            kVar.f6993d = true;
            b bVar = kVar.f6994e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(b bVar) {
        this.f6994e = new WeakReference<>(null);
        this.f6994e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f6993d) {
            return this.f6992c;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.f6990a.measureText((CharSequence) str, 0, str.length());
        }
        this.f6992c = measureText;
        this.f6993d = false;
        return measureText;
    }

    public final void b(d3.d dVar, Context context) {
        if (this.f6995f != dVar) {
            this.f6995f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f6990a;
                a aVar = this.f6991b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f6994e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f6993d = true;
            }
            b bVar2 = this.f6994e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
