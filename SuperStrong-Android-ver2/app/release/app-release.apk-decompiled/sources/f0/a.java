package f0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.superstrong.android.R;
import f0.g0;
import g0.f;
import g0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f3855c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f3856a;

    /* renamed from: b  reason: collision with root package name */
    public final C0037a f3857b;

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0037a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f3858a;

        public C0037a(a aVar) {
            this.f3858a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3858a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            g0.g b6 = this.f3858a.b(view);
            if (b6 != null) {
                return (AccessibilityNodeProvider) b6.f4112a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3858a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z5;
            Object tag;
            boolean z6;
            boolean z7;
            Object tag2;
            boolean z8;
            boolean z9;
            Object tag3;
            int i6;
            g0.f fVar = new g0.f(accessibilityNodeInfo);
            WeakHashMap<View, r0> weakHashMap = g0.f3878a;
            boolean z10 = true;
            int i7 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z5 = true;
            } else {
                z5 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z5) {
                tag = Boolean.valueOf(g0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z6);
            } else {
                fVar.f(1, z6);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                tag2 = Boolean.valueOf(g0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i8 >= 28) {
                accessibilityNodeInfo.setHeading(z8);
            } else {
                fVar.f(2, z8);
            }
            CharSequence d6 = g0.d(view);
            if (i8 >= 28) {
                accessibilityNodeInfo.setPaneTitle(d6);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d6);
            }
            if (i8 >= 30) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                tag3 = g0.o.a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i8 < 30) {
                z10 = false;
            }
            if (z10) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f3858a.d(view, fVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i8 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                        if (((WeakReference) sparseArray.valueAt(i9)).get() == null) {
                            arrayList.add(Integer.valueOf(i9));
                        }
                    }
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        sparseArray.remove(((Integer) arrayList.get(i10)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    fVar.f4095a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i11 = 0;
                    while (i11 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i11];
                        int i12 = i7;
                        while (true) {
                            if (i12 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i12)).get())) {
                                    i6 = sparseArray2.keyAt(i12);
                                    break;
                                }
                                i12++;
                            } else {
                                i6 = g0.f.f4094d;
                                g0.f.f4094d = i6 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i6, new WeakReference(clickableSpanArr[i11]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i11];
                        Spanned spanned = (Spanned) text;
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i6));
                        i11++;
                        i7 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                fVar.b((f.a) list.get(i13));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3858a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3858a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i6, Bundle bundle) {
            return this.f3858a.g(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i6) {
            this.f3858a.h(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3858a.i(view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i6, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i6, bundle);
        }
    }

    public a() {
        this(f3855c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3856a = accessibilityDelegate;
        this.f3857b = new C0037a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3856a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public g0.g b(View view) {
        AccessibilityNodeProvider a6 = b.a(this.f3856a, view);
        if (a6 != null) {
            return new g0.g(a6);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3856a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, g0.f fVar) {
        this.f3856a.onInitializeAccessibilityNodeInfo(view, fVar.f4095a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3856a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3856a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i6, Bundle bundle) {
        boolean z5;
        WeakReference weakReference;
        boolean z6;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            f.a aVar = (f.a) list.get(i7);
            if (aVar.a() == i6) {
                g0.j jVar = aVar.f4109d;
                if (jVar != null) {
                    Class<? extends j.a> cls = aVar.f4108c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e6) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e6);
                        }
                    }
                    z5 = jVar.a(view);
                }
            } else {
                i7++;
            }
        }
        z5 = false;
        if (!z5) {
            z5 = b.b(this.f3856a, view, i6, bundle);
        }
        if (!z5 && i6 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i8 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i8)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i9 = 0; clickableSpanArr != null && i9 < clickableSpanArr.length; i9++) {
                        if (clickableSpan.equals(clickableSpanArr[i9])) {
                            z6 = true;
                            break;
                        }
                    }
                }
                z6 = false;
                if (z6) {
                    clickableSpan.onClick(view);
                    z7 = true;
                }
            }
            return z7;
        }
        return z5;
    }

    public void h(View view, int i6) {
        this.f3856a.sendAccessibilityEvent(view, i6);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3856a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
