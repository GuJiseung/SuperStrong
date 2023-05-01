package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import y.c;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f.i f1344a;

    /* renamed from: b  reason: collision with root package name */
    public final n f1345b;

    /* renamed from: c  reason: collision with root package name */
    public final f.d f1346c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1347a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final n.a f1348b;

        /* renamed from: c  reason: collision with root package name */
        public n.a f1349c;

        /* renamed from: d  reason: collision with root package name */
        public n.a f1350d;

        /* renamed from: e  reason: collision with root package name */
        public int f1351e;

        /* renamed from: f  reason: collision with root package name */
        public int f1352f;

        public a(n.a aVar) {
            this.f1348b = aVar;
            this.f1349c = aVar;
        }

        public final int a(int i6) {
            n.a aVar;
            boolean z5;
            SparseArray<n.a> sparseArray = this.f1349c.f1370a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i6);
            }
            int i7 = 1;
            if (this.f1347a != 2) {
                if (aVar != null) {
                    this.f1347a = 2;
                    this.f1349c = aVar;
                    this.f1352f = 1;
                    i7 = 2;
                }
                b();
            } else {
                if (aVar != null) {
                    this.f1349c = aVar;
                    this.f1352f++;
                } else {
                    boolean z6 = false;
                    if (i6 == 65038) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        if (i6 == 65039) {
                            z6 = true;
                        }
                        if (!z6) {
                            n.a aVar2 = this.f1349c;
                            if (aVar2.f1371b != null) {
                                if (this.f1352f == 1) {
                                    if (c()) {
                                        aVar2 = this.f1349c;
                                    }
                                }
                                this.f1350d = aVar2;
                                b();
                                i7 = 3;
                            }
                        }
                    }
                    b();
                }
                i7 = 2;
            }
            this.f1351e = i6;
            return i7;
        }

        public final void b() {
            this.f1347a = 1;
            this.f1349c = this.f1348b;
            this.f1352f = 0;
        }

        public final boolean c() {
            boolean z5;
            boolean z6;
            o0.a c6 = this.f1349c.f1371b.c();
            int a6 = c6.a(6);
            if (a6 != 0 && c6.f5503b.get(a6 + c6.f5502a) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                return true;
            }
            if (this.f1351e == 65039) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                return false;
            }
            return true;
        }
    }

    public j(n nVar, f.i iVar, d dVar) {
        this.f1344a = iVar;
        this.f1345b = nVar;
        this.f1346c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z5) {
        boolean z6;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!z6 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
            for (k kVar : kVarArr) {
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((z5 && spanStart == selectionStart) || ((!z5 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i6, int i7, i iVar) {
        int i8;
        if (iVar.f1343c == 0) {
            f.d dVar = this.f1346c;
            o0.a c6 = iVar.c();
            int a6 = c6.a(8);
            if (a6 != 0) {
                c6.f5503b.getShort(a6 + c6.f5502a);
            }
            d dVar2 = (d) dVar;
            dVar2.getClass();
            ThreadLocal<StringBuilder> threadLocal = d.f1313b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i6 < i7) {
                sb.append(charSequence.charAt(i6));
                i6++;
            }
            TextPaint textPaint = dVar2.f1314a;
            String sb2 = sb.toString();
            int i9 = y.c.f6727a;
            if (c.a.a(textPaint, sb2)) {
                i8 = 2;
            } else {
                i8 = 1;
            }
            iVar.f1343c = i8;
        }
        if (iVar.f1343c != 2) {
            return false;
        }
        return true;
    }
}
