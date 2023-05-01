package m3;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
/* loaded from: classes.dex */
public class i extends h3.f {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f5285z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f5286y;

    @TargetApi(18)
    /* loaded from: classes.dex */
    public static class a extends i {
        public a(h3.i iVar) {
            super(iVar);
        }

        @Override // h3.f
        public final void g(Canvas canvas) {
            RectF rectF = this.f5286y;
            if (rectF.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(rectF);
            } else {
                canvas.clipRect(rectF, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public i(h3.i iVar) {
        super(iVar == null ? new h3.i() : iVar);
        this.f5286y = new RectF();
    }

    public final void o(float f6, float f7, float f8, float f9) {
        RectF rectF = this.f5286y;
        if (f6 == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f7, f8, f9);
        invalidateSelf();
    }
}
