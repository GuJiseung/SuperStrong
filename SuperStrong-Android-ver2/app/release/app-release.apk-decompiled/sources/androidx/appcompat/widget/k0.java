package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f819l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f820m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f821a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f822b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f823c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f824d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f825e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f826f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f827g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f828h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f829i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f830j;

    /* renamed from: k  reason: collision with root package name */
    public final d f831k;

    /* loaded from: classes.dex */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i6, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i6, int i7, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i6);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i7 == -1) {
                i7 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i7);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends f {
        @Override // androidx.appcompat.widget.k0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) k0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        @Override // androidx.appcompat.widget.k0.d, androidx.appcompat.widget.k0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.k0.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) k0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public k0(TextView textView) {
        this.f829i = textView;
        this.f830j = textView.getContext();
        this.f831k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i6 : iArr) {
            if (i6 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i6)) < 0) {
                arrayList.add(Integer.valueOf(i6));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr2[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f820m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t5) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return t5;
        }
    }

    public final void a() {
        boolean z5;
        int measuredWidth;
        if (i() && this.f821a != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5) {
            return;
        }
        if (this.f822b) {
            if (this.f829i.getMeasuredHeight() > 0 && this.f829i.getMeasuredWidth() > 0) {
                if (this.f831k.b(this.f829i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f829i.getMeasuredWidth() - this.f829i.getTotalPaddingLeft()) - this.f829i.getTotalPaddingRight();
                }
                int height = (this.f829i.getHeight() - this.f829i.getCompoundPaddingBottom()) - this.f829i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f819l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c6 = c(rectF);
                        if (c6 != this.f829i.getTextSize()) {
                            f(0, c6);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f822b = true;
    }

    public final int c(RectF rectF) {
        boolean z5;
        CharSequence transformation;
        int length = this.f826f.length;
        if (length != 0) {
            int i6 = length - 1;
            int i7 = 1;
            int i8 = 0;
            while (i7 <= i6) {
                int i9 = (i7 + i6) / 2;
                int i10 = this.f826f[i9];
                TextView textView = this.f829i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b6 = a.b(textView);
                TextPaint textPaint = this.f828h;
                if (textPaint == null) {
                    this.f828h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f828h.set(textView.getPaint());
                this.f828h.setTextSize(i10);
                StaticLayout a6 = c.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b6, this.f829i, this.f828h, this.f831k);
                if ((b6 != -1 && (a6.getLineCount() > b6 || a6.getLineEnd(a6.getLineCount() - 1) != text.length())) || a6.getHeight() > rectF.bottom) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z5) {
                    int i11 = i9 + 1;
                    i8 = i7;
                    i7 = i11;
                } else {
                    i8 = i9 - 1;
                    i6 = i8;
                }
            }
            return this.f826f[i8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i6, float f6) {
        Resources resources;
        Context context = this.f830j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i6, f6, resources.getDisplayMetrics());
        TextView textView = this.f829i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a6 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f822b = false;
                try {
                    Method d6 = d("nullLayouts");
                    if (d6 != null) {
                        d6.invoke(textView, new Object[0]);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (!a6) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f821a == 1) {
            if (!this.f827g || this.f826f.length == 0) {
                int floor = ((int) Math.floor((this.f825e - this.f824d) / this.f823c)) + 1;
                int[] iArr = new int[floor];
                for (int i6 = 0; i6 < floor; i6++) {
                    iArr[i6] = Math.round((i6 * this.f823c) + this.f824d);
                }
                this.f826f = b(iArr);
            }
            this.f822b = true;
        } else {
            this.f822b = false;
        }
        return this.f822b;
    }

    public final boolean h() {
        int[] iArr = this.f826f;
        int length = iArr.length;
        boolean z5 = length > 0;
        this.f827g = z5;
        if (z5) {
            this.f821a = 1;
            this.f824d = iArr[0];
            this.f825e = iArr[length - 1];
            this.f823c = -1.0f;
        }
        return z5;
    }

    public final boolean i() {
        return !(this.f829i instanceof AppCompatEditText);
    }

    public final void j(float f6, float f7, float f8) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        } else if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        } else if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        } else {
            this.f821a = 1;
            this.f824d = f6;
            this.f825e = f7;
            this.f823c = f8;
            this.f827g = false;
        }
    }
}
