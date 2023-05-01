package q;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import f0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q.e;
/* loaded from: classes.dex */
public final class d extends ConstraintLayout implements v {
    public static final /* synthetic */ int L = 0;
    public q.b A;
    public boolean B;
    public ArrayList<q.c> C;
    public ArrayList<q.c> D;
    public CopyOnWriteArrayList<c> E;
    public int F;
    public float G;
    public boolean H;
    public b I;
    public boolean J;
    public EnumC0078d K;

    /* renamed from: r  reason: collision with root package name */
    public float f5740r;
    public int s;

    /* renamed from: t  reason: collision with root package name */
    public int f5741t;
    public int u;

    /* renamed from: v  reason: collision with root package name */
    public float f5742v;

    /* renamed from: w  reason: collision with root package name */
    public float f5743w;

    /* renamed from: x  reason: collision with root package name */
    public long f5744x;

    /* renamed from: y  reason: collision with root package name */
    public float f5745y;

    /* renamed from: z  reason: collision with root package name */
    public c f5746z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.I.a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f5748a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f5749b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f5750c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f5751d = -1;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
            if (r5 == null) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q.d.b.a():void");
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: q.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0078d {
        /* JADX INFO: Fake field, exist only in values array */
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    @Override // f0.u
    public final void b(View view, View view2, int i6, int i7) {
        getNanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0100, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x010b, code lost:
        if (r1 != r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010e, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010f, code lost:
        r17.f5741t = r2;
        r7 = r6;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void f(int i6) {
        this.f1038l = null;
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f5741t;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public q.b getDesignTool() {
        if (this.A == null) {
            this.A = new q.b();
        }
        return this.A;
    }

    public int getEndState() {
        return this.u;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f5743w;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.s;
    }

    public float getTargetPosition() {
        return this.f5745y;
    }

    public Bundle getTransitionState() {
        if (this.I == null) {
            this.I = new b();
        }
        b bVar = this.I;
        d dVar = d.this;
        bVar.f5751d = dVar.u;
        bVar.f5750c = dVar.s;
        bVar.f5749b = dVar.getVelocity();
        bVar.f5748a = dVar.getProgress();
        b bVar2 = this.I;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f5748a);
        bundle.putFloat("motion.velocity", bVar2.f5749b);
        bundle.putInt("motion.StartState", bVar2.f5750c);
        bundle.putInt("motion.EndState", bVar2.f5751d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return 0.0f;
    }

    public float getVelocity() {
        return this.f5740r;
    }

    @Override // f0.u
    public final void i(View view, int i6) {
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // f0.u
    public final void j(View view, int i6, int i7, int[] iArr, int i8) {
    }

    public final void k() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.f5746z == null && ((copyOnWriteArrayList = this.E) == null || copyOnWriteArrayList.isEmpty())) || this.G == this.f5742v) {
            return;
        }
        if (this.F != -1) {
            c cVar = this.f5746z;
            if (cVar != null) {
                cVar.b();
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.E;
            if (copyOnWriteArrayList2 != null) {
                Iterator<c> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            }
        }
        this.F = -1;
        this.G = this.f5742v;
        c cVar2 = this.f5746z;
        if (cVar2 != null) {
            cVar2.a();
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.E;
        if (copyOnWriteArrayList3 != null) {
            Iterator<c> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.f5746z == null && ((copyOnWriteArrayList2 = this.E) == null || copyOnWriteArrayList2.isEmpty())) || this.F != -1) {
            if (this.f5746z == null && ((copyOnWriteArrayList = this.E) == null || copyOnWriteArrayList.isEmpty())) {
                return;
            }
            throw null;
        }
        this.F = this.f5741t;
        throw null;
    }

    @Override // f0.v
    public final void m(View view, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i6 == 0 && i7 == 0) {
            return;
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
    }

    @Override // f0.u
    public final void n(View view, int i6, int i7, int i8, int i9, int i10) {
    }

    @Override // f0.u
    public final boolean o(View view, View view2, int i6, int i7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.I;
        if (bVar != null) {
            if (this.J) {
                post(new a());
            } else {
                bVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        this.H = true;
        try {
            super.onLayout(z5, i6, i7, i8, i9);
        } finally {
            this.H = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof q.c) {
            q.c cVar = (q.c) view;
            if (this.E == null) {
                this.E = new CopyOnWriteArrayList<>();
            }
            this.E.add(cVar);
            if (cVar.f5736j) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                this.C.add(cVar);
            }
            if (cVar.f5737k) {
                if (this.D == null) {
                    this.D = new ArrayList<>();
                }
                this.D.add(cVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<q.c> arrayList = this.C;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<q.c> arrayList2 = this.D;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p(float f6, float f7) {
        if (!super.isAttachedToWindow()) {
            if (this.I == null) {
                this.I = new b();
            }
            b bVar = this.I;
            bVar.f5748a = f6;
            bVar.f5749b = f7;
            return;
        }
        setProgress(f6);
        setState(EnumC0078d.MOVING);
        this.f5740r = f7;
    }

    public final void q(int i6, int i7) {
        if (!super.isAttachedToWindow()) {
            if (this.I == null) {
                this.I = new b();
            }
            b bVar = this.I;
            bVar.f5750c = i6;
            bVar.f5751d = i7;
        }
    }

    public final void r(int i6) {
        if (!super.isAttachedToWindow()) {
            if (this.I == null) {
                this.I = new b();
            }
            this.I.f5751d = i6;
            return;
        }
        int i7 = this.f5741t;
        if (i7 != i6 && this.s != i6 && this.u != i6) {
            this.u = i6;
            if (i7 != -1) {
                q(i7, i6);
                this.f5743w = 0.0f;
                return;
            }
            this.f5745y = 1.0f;
            this.f5742v = 0.0f;
            this.f5743w = 0.0f;
            this.f5744x = getNanoTime();
            getNanoTime();
            throw null;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i6 = this.f5741t;
        super.requestLayout();
    }

    public void setDebugMode(int i6) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z5) {
        this.J = z5;
    }

    public void setInteractionEnabled(boolean z5) {
    }

    public void setInterpolatedProgress(float f6) {
        setProgress(f6);
    }

    public void setOnHide(float f6) {
        ArrayList<q.c> arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.D.get(i6).setProgress(f6);
            }
        }
    }

    public void setOnShow(float f6) {
        ArrayList<q.c> arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                this.C.get(i6).setProgress(f6);
            }
        }
    }

    public void setProgress(float f6) {
        int i6 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i6 < 0 || f6 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.I == null) {
                this.I = new b();
            }
            this.I.f5748a = f6;
            return;
        }
        EnumC0078d enumC0078d = EnumC0078d.FINISHED;
        EnumC0078d enumC0078d2 = EnumC0078d.MOVING;
        if (i6 <= 0) {
            if (this.f5743w == 1.0f && this.f5741t == this.u) {
                setState(enumC0078d2);
            }
            this.f5741t = this.s;
            if (this.f5743w != 0.0f) {
                return;
            }
        } else if (f6 >= 1.0f) {
            if (this.f5743w == 0.0f && this.f5741t == this.s) {
                setState(enumC0078d2);
            }
            this.f5741t = this.u;
            if (this.f5743w != 1.0f) {
                return;
            }
        } else {
            this.f5741t = -1;
            setState(enumC0078d2);
            return;
        }
        setState(enumC0078d);
    }

    public void setScene(e eVar) {
        e();
        throw null;
    }

    public void setStartState(int i6) {
        if (!super.isAttachedToWindow()) {
            if (this.I == null) {
                this.I = new b();
            }
            b bVar = this.I;
            bVar.f5750c = i6;
            bVar.f5751d = i6;
            return;
        }
        this.f5741t = i6;
    }

    public void setState(EnumC0078d enumC0078d) {
        EnumC0078d enumC0078d2 = EnumC0078d.FINISHED;
        if (enumC0078d == enumC0078d2 && this.f5741t == -1) {
            return;
        }
        EnumC0078d enumC0078d3 = this.K;
        this.K = enumC0078d;
        EnumC0078d enumC0078d4 = EnumC0078d.MOVING;
        if (enumC0078d3 == enumC0078d4 && enumC0078d == enumC0078d4) {
            k();
        }
        int ordinal = enumC0078d3.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (enumC0078d == enumC0078d4) {
                k();
            }
            if (enumC0078d != enumC0078d2) {
                return;
            }
        } else if (ordinal != 2 || enumC0078d != enumC0078d2) {
            return;
        }
        l();
    }

    public void setTransition(int i6) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i6) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.f5746z = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.I == null) {
            this.I = new b();
        }
        b bVar = this.I;
        bVar.getClass();
        bVar.f5748a = bundle.getFloat("motion.progress");
        bVar.f5749b = bundle.getFloat("motion.velocity");
        bVar.f5750c = bundle.getInt("motion.StartState");
        bVar.f5751d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.I.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return q.a.a(context, this.s) + "->" + q.a.a(context, this.u) + " (pos:" + this.f5743w + " Dpos/Dt:" + this.f5740r;
    }
}
